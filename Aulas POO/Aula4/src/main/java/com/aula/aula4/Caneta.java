package com.aula.aula4;

public class Caneta {

    private String modelo;
    private float ponta;
    private boolean tampada;
    private String cor;
    
    public Caneta(String c,String m, float p) {
        this.tampar();
        this.cor = setCor(c);
        this.modelo = setModelo(m);
        this.ponta = setPonta(p);
        
    }

    public boolean isTampada() {
        return this.tampada;
    }

    public void setTampada(boolean t) {
        this.tampada = t;
    }

    public String getCor() {
        return this.cor;
    }

    public String setCor(String c) {
        return this.cor = c;
    }

    public String getModelo() {
        return this.modelo;
    }

    public String setModelo(String m) {
        return this.modelo = m;
    }

    public float getPonta() {
        return this.ponta;
    }

    public float setPonta(float p) {
        return this.ponta = p;
    }

    public void tampar() {
        this.tampada = true; 
    }

    public void destampar() {
        this.tampada = false;
    }

    public void status() {
        System.out.println("SOBRE A CANETA:");
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Ponta: " + this.getPonta());
        System.out.println("Cor: " + this.cor);
        System.out.println("Tampada: " + this.tampada);

    }
}
