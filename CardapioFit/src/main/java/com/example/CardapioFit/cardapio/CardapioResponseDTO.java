package com.example.CardapioFit.cardapio;

    public record CardapioResponseDTO(Long id , String nome, Long usuarioid, Double totalcalorias ) {
        public CardapioResponseDTO(Cardapio cardapio){
            this(cardapio.getId(), cardapio.getNome(), cardapio.getUsuarioid(), cardapio.getTotalcalorias());
        }
    }
