package com.kgisl.sbkeycloak.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping("/api/public")
    public ResponseEntity<String> getPublic() {
        return ResponseEntity.ok("Content Public");
    }

    @GetMapping("/api/private")
    public ResponseEntity<String> getPrivate() {
        return ResponseEntity.ok("Content Privé");
    }
}
