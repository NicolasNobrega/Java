package com.aula.tamagochi;

public class Tamagochi {

    public static void main(String[] args) {
        Corpo tamagochi = new Corpo();
        
        tamagochi.nome = "Roberto";
        tamagochi.comer(1);
        tamagochi.jogar();
        tamagochi.status();
        
    }
}
