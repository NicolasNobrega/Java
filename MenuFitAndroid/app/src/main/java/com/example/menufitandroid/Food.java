package com.example.menufitandroid;

import java.io.Serializable;

public class Food implements Serializable {

    private Integer id;
    private String nome;
    private String descricao;
    private Integer calorias;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Integer getCalorias() {
        return calorias;
    }

    public void setCalorias(Integer calorias) {
        this.calorias = calorias;
    }

    @Override
    public String toString(){

        String Total = " "+ nome + "                                                                                 " + calorias + " Kcal";

        return Total;
    }

}
