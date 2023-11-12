package com.example.CardapioFit.controller;

import com.example.CardapioFit.cardapio.Cardapio;
import com.example.CardapioFit.cardapio.CardapioRequestDTO;
import com.example.CardapioFit.cardapio.CardapioRepository;
import com.example.CardapioFit.cardapio.CardapioResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("cardapio")
public class CardapioController {
    @Autowired
    private CardapioRepository repository;

    @PostMapping
    public void saveCardapio(@RequestBody CardapioRequestDTO Cardata) {
        Cardapio cardapioData = new Cardapio(Cardata);
        repository.save(cardapioData);
        return;

    }
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping
    public List<CardapioResponseDTO> getAll() {
        List<CardapioResponseDTO> cardapioList = repository.findAll().stream().map(CardapioResponseDTO::new).toList();
        return cardapioList;
    }
}
