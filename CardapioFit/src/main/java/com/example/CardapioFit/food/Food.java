package com.example.CardapioFit.food;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name= "foods")
@Entity(name= "foods")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Food {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String tittle;
    private String image;
    private Double calorias;
    private String descricao;

    public Food(FoodRequestDTO data){
        this.image = data.image();
        this.tittle = data.tittle();
        this.descricao = data.descricao();
        this.calorias = data.calorias();
    }
}
