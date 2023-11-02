package com.example.CardapioFit.food;

public record FoodResponseDTO(Long id, String title, String image, String descricao, Double calorias) {
    public FoodResponseDTO(Food food){
        this(food.getId(), food.getTittle(), food.getImage(), food.getDescricao(), food.getCalorias());
    }
}
