package com.grindlife.backend.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api/test")
public class TestController {

    // Un endpoint básico de texto
    @GetMapping("/ping")
    public String ping() {
        return "¡Pong! El servidor de GrindLife está vivo y con la espada afilada. ⚔️";
    }

    @GetMapping("/status")
    public Map<String, Object> getStatus() {
        return Map.of(
                "status", "OK",
                "message", "Backend funcionando perfectamente en Java 21",
                "version", "0.0.1",
                "rpg_ready", true
        );
    }
}