
package com.project.aigf.service;

import io.pinecone.PineconeClient;
import io.pinecone.proto.Vector;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class PineconeService {

    @Value("${pinecone.api.key}")
    private String pineconeApiKey;

    private final PineconeClient pineconeClient;
    private final EmbeddingService embeddingService;

    public PineconeService(EmbeddingService embeddingService) {
        this.embeddingService = embeddingService;
        this.pineconeClient = new PineconeClient(pineconeApiKey);
    }

    public void storeConversation(String userQuery, String aiResponse) {
        List<Float> queryVector = embeddingService.generateEmbedding(userQuery);
        List<Float> responseVector = embeddingService.generateEmbedding(aiResponse);

        // Store user query
        pineconeClient.upsert(Vector.newBuilder()
                .setId(String.valueOf(System.currentTimeMillis())) // Unique ID
                .addAllValues(queryVector)
                .putAllMetadata(Map.of("type", "user", "text", userQuery))
                .build());

        // Store AI response
        pineconeClient.upsert(Vector.newBuilder()
                .setId(String.valueOf(System.currentTimeMillis() + 1)) // Unique ID
                .addAllValues(responseVector)
                .putAllMetadata(Map.of("type", "ai", "text", aiResponse))
                .build());
    }

    public String retrieveContext(String userQuery) {
        List<Float> queryVector = embeddingService.generateEmbedding(userQuery);

        // Search Pinecone for related conversations
        List<Vector> results = pineconeClient.query(queryVector, 3); // Retrieve top 3 closest matches

        StringBuilder context = new StringBuilder();
        for (Vector result : results) {
            context.append(result.getMetadataMap().get("text")).append("\n");
        }

        return context.toString();
    }
}
