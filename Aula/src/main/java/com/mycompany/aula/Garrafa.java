
package com.mycompany.aula;

public class Garrafa {
    String tipo;
    int volume;
    boolean cheia;
    
    void status(){
      System.out.println("Garrafa de "+ tipo);
      System.out.println("Garrafa com "+ volume);
      System.out.println("Garrafa está cheia? "+ encheu());
      
    }
    
    void encher(){
        this.cheia = true;
    }
    
    void tomar(){
        this.cheia = false;
    }
    
    String encheu(){
        if (this.cheia == true){
            return "Sim";
        }else{
            return "não";
        }
    }
}
