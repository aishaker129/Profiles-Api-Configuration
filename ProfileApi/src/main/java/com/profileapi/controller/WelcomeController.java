package com.profileapi.controller;

import com.profileapi.service.WelcomeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class WelcomeController {
    private final WelcomeService welcomeService;

    @GetMapping("/status")
    public Map<String, String> getStatus() {
        Map<String, String> response = new HashMap<>();
        response.put("message", welcomeService.getMessage());
        response.put("apiUrl", welcomeService.getApiUrl());
        return response;
    }
}
