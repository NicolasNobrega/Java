
package com.aula.ultraemojicombat;

import java.util.Random;

public class Luta {
    //Atributos
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;
    //Metodos Publicos
    
    public void marcarLuta(Lutador l1, Lutador l2){
        if (l1.getCategoria().equals(l2.getCategoria()) && l1 != l2){
            this.setAprovada(true);
            this.setDesafiado(l1);
            this.setDesafiante(l2);
        } else {
            this.setAprovada(false);
            this.setDesafiante(null);
            this.setDesafiante(null);
            System.out.println("Luta não pode acontecer");
            
        }
    }
    public void lutar(){
        if (this.isAprovada()){
            System.out.println("=== Desafidado ===");
            this.getDesafiado().apresentar();
            System.out.println("=== Desafiante ===");
            this.getDesafiante().apresentar();
            
            
            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3);
            
            if (getDesafiado().getAltura() > getDesafiante().getAltura()){
                
                this.getDesafiado().ganharPontos();
                
            }else{
                this.getDesafiante().ganharPontos();
            }
            
            switch(vencedor){
                case 0:
                        System.out.println("Empate!!! \n Vamos Contar os Pontos");
                        for (int i = 0 ; i > 3 ; i++){
                            System.out.print(".");
                        }
                        if (getDesafiado().getPontos() > getDesafiante().getPontos()){
                            this.getDesafiado().ganharLuta();
                            this.getDesafiante().perderLuta();
                            System.out.println("Juizes Julgaram e o vencedor é " + this.getDesafiado().getNome());
                        }else {
                            System.out.println("Juizes Julgaram e o vencedor é " + this.getDesafiante().getNome());
                            this.getDesafiante().ganharLuta();
                            this.getDesafiado().perderLuta();
                        }
                    break;
                case 1:
                        System.out.println("Vitoria do " + this.getDesafiado().getNome());
                        this.getDesafiado().ganharLuta();
                        this.getDesafiante().perderLuta();
                    break;
                case 2:
                        System.out.println("Vitoria do " + this.getDesafiante().getNome());
                        this.getDesafiante().ganharLuta();
                        this.getDesafiado().perderLuta();
                    break;
            }
        }else {
            System.out.println("Não aprovada");
        }
    }
    
    //Metodos Especiais

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
    
    
}
