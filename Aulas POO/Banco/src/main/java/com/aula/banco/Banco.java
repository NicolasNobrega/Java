
package com.aula.banco;

public class Banco {

    public static void main(String[] args) {
        ContaBanco p1 = new ContaBanco();
        
        p1.setNumConta(1);
        p1.setDono("Nicolas");
        p1.abrirConta("CP");
        
        p1.depositar(300);
        
        p1.sacar(100);
        
        p1.fecharConta();
        
        p1.statusAtual();
    }
}
