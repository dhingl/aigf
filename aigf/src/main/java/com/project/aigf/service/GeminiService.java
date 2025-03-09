package com.project.aigf.service;



import com.project.aigf.dto.GeminiRequest;
import com.project.aigf.dto.GeminiResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.http.*;

import java.util.Collections;

@Service
public class GeminiService {

    @Value("${gemini.api.url}")
    private String geminiApiUrl;

    @Value("${gemini.api.key}")
    private String apiKey;

    private final RestTemplate restTemplate;

    public GeminiService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public String generateContent(String prompt) {
        // Create Request Payload
        System.out.println("prompt"+prompt);
        GeminiRequest request = new GeminiRequest(
                Collections.singletonList(
                        new GeminiRequest.Content(
                                Collections.singletonList(new GeminiRequest.Content.Part(prompt))
                        )
                )
        );
        System.out.println("gemini request "+request);
        // Set Headers
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
//        System.out.println("api key"+apiKey);
//        headers.set("Authorization", "Bearer " + apiKey);
         geminiApiUrl = geminiApiUrl+"?key=" + apiKey;
        System.out.println("geminiApiUrl : "+geminiApiUrl);
        // Create HTTP Entity
        HttpEntity<GeminiRequest> entity = new HttpEntity<>(request, headers);

        // Call API
        ResponseEntity<GeminiResponse> response = restTemplate.exchange(
                geminiApiUrl,
                HttpMethod.POST,
                entity,
                GeminiResponse.class
        );

        // Parse and return response
        if (response.getBody() != null && response.getBody().getCandidates() != null) {
            return response.getBody().getCandidates().get(0).getContent().getParts().get(0).getText();
        } else {
            return "No response from Gemini.";
        }
    }
}

