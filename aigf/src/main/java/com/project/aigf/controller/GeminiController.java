package com.project.aigf.controller;



import com.project.aigf.service.GeminiService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/gemini")
public class GeminiController {

    private final GeminiService geminiService;

    public GeminiController(GeminiService geminiService) {
        this.geminiService = geminiService;
    }

    @PostMapping("/generate")
    public String generateContent(@RequestParam String prompt) {
        return geminiService.generateContent(prompt);
    }
}

