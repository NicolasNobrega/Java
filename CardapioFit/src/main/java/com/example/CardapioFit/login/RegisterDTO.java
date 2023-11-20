package com.example.CardapioFit.login;

import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins = "*", allowedHeaders = "*")
public record RegisterDTO(String nome, String senha, String email) {
}
