package com.mycompany.aula;

public class Caneta {

    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    private boolean tampada;

    public void status() {
        System.out.println("Modelo " + this.modelo);
        System.out.println("Uma Caneta " + this.cor);
        System.out.println("Ponta " + this.ponta);
        System.out.println("Carga " + this.carga);
        System.out.println("Está tampada? " + this.tampada);

    }

    protected void rabiscar() {
        if (this.tampada == true) {
            System.out.println("Não dá pra rabiscar tampada");
        } else {
            System.out.println("Dá pra rabiscar," + modelo + ", não está tampada");
        }
    }

    protected void tampar() {
        this.tampada = true;
    }

    protected void destampar() {
        this.tampada = false;
    }
}
