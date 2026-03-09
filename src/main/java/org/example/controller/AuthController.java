package org.example.controller;

import org.example.dao.LoginDao;
import org.example.dao.CredentialsDao;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @PostMapping("/signup")
    public ResponseEntity<String> signup(@RequestBody CredentialsDao request) {
        return ResponseEntity.ok("User created");
    }

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody LoginDao request) {
        return ResponseEntity.ok("Logged in");
    }
}
