package com.example.CardapioFit.cardapio;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name= "cardapio")
@Entity(name= "cardapio")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Cardapio {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private Long usuarioid;
    private Double totalcalorias;

    public Cardapio(CardapioRequestDTO data){
        this.id = data.id();
        this.nome = data.nome();
        this.usuarioid = data.usuarioid();
        this.totalcalorias = data.totalcalorias();
    }
}
