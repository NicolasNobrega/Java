package com.mycompany.aula;

public class Aula {

    public static void main(String[] args) {
        System.out.println("Caneta 2");
        Caneta c1 = new Caneta();
        
        c1.cor = "Azul";
        c1.modelo = "Bic Cristal";
        c1.carga = 80;
      //c1.tampada = true;
        c1.tampar();
        c1.rabiscar();
        c1.status();
    }
}
