package com.mycompany.aula;

public class Aula {

    public static void main(String[] args) {
        System.out.println("Caneta 2");
        Caneta c1 = new Caneta();
        
        c1.cor = "Azul";
        c1.ponta = 0.5f;
        c1.carga = 100;
        c1.modelo = "Bic";
        c1.destampar();
        c1.status();
        c1.rabiscar();
        
        System.out.println("Garrafa");
        
        Garrafa g1 = new Garrafa();
         g1.tipo = "plastico";
         g1.volume = 100;
         g1.encher();
         g1.status();

    }
}
