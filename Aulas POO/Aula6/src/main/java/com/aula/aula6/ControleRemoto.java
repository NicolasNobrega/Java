package com.aula.aula6;

public class ControleRemoto implements Controlador {
    //Atributos
    
    private int volume;
    private boolean ligando;
    private boolean tocando;
    
    public ControleRemoto() {
        this.volume = 50;
        this.ligando = false;
        this.tocando = false;
    }
    
    private int getVolume() {
        return volume;
    }
    
    private void setVolume(int volume) {
        this.volume = volume;
    }
    
    private boolean isLigando() {
        return ligando;
    }
    
    private void setLigando(boolean ligando) {
        this.ligando = ligando;
    }
    
    private boolean isTocando() {
        return tocando;
    }
    
    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

    //Metodos Abstratos
    @Override
    public void ligar() {
        this.setLigando(true);
    }
    
    @Override
    public void desligar() {
        this.setLigando(false);
    }
    
    @Override
    public void abrirMenu() {
        
        System.out.println("Está Ligado " + this.isLigando());
        System.out.println("Está Tocando? " + this.isTocando());
        System.out.println("Volume: " + this.getVolume());
        
        for (int i = 0; i <= this.getVolume(); i += 10) {
            System.out.print("|");
        }
    }
    
    @Override
    public void fecharMenu() {
        System.out.println("Fechando Menu...");
    }
    
    @Override
    public void maisVolume() {
        if (this.isLigando()) {
            this.setVolume(this.getVolume() + 5);
        } else {
            System.out.println("Está desligado");
        }
    }
    
    @Override
    public void menosVolume() {
        
        if (this.isLigando()) {
            this.setVolume(this.getVolume() - 5);
        }
    }
    
    @Override
    public void ligarMudo() {
        if (this.isLigando() && this.getVolume() > 0){
            this.setVolume(0);
        }else{
            System.out.println("Está desligado ou Já esta Mudo");
        }
    }
    
    @Override
    public void desligarMudo() {
        if (this.isLigando() && this.getVolume() == 0 ){
            this.setVolume(50);
        }else {
            System.out.println("Está desligado ou Não está no mudo");
        }
    }
    
    @Override
    public void play() {
        if (this.isLigando() && !(this.isTocando())){
            this.setTocando(true);
        }
    }
    
    @Override
    public void pause() {
        if (this.isLigando() && this.isTocando()){
            this.setTocando(false);
        }
    }
    
}
