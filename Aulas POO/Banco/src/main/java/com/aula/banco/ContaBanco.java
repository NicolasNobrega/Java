package com.aula.banco;

public class ContaBanco {

    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    public void statusAtual(){
        System.out.println("--------------------------------------");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: "+ this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.isStatus());
        
    }
    
    public ContaBanco() {
        this.saldo =0;
        this.status = false;
    }

    public void abrirConta(String tipo) {
        this.setTipo(tipo);

        if ("CC".equals(tipo)) {
            this.setSaldo(50);
            this.setStatus(true);
        } if("CP".equals(tipo)) {
            this.setSaldo(150);
            this.setStatus(true);
        }else {
            System.out.println("Apenas CC ou CP");
        }
    }

    public void fecharConta() {
        if (saldo > 0) {
            System.out.println("Conta com dinheiro");
        }
        if (saldo < 0) {
            System.out.println("Voce está devendo!!");
        } else {
            this.setStatus(false);
        }
    }

    public void depositar(float valor) {
        if (this.isStatus()) {
            this.setSaldo(this.getSaldo() + valor);
            System.out.println("Deposito Realizado");
        } else {
            System.out.println("Conta está fechada");
        }
    }

    public void sacar(float valor) {
        if (this.isStatus()) {
            if (this.getSaldo() >= valor) {
                this.setSaldo(this.getSaldo() - valor);
                System.out.println("Saque Realizado no valor de: " + valor);
            }else{
                System.out.println("Saldo Insuficiente");
            }
        } else {
            System.out.println("Conta está fechada");
        }
    }

    public void pagarMensal() {
        float v;
        
        if ("CC".equals(this.getTipo())){
            v = 12;
        }else{
            v = 20;
        }
        
         if (this.isStatus()) {
             
              if (this.getSaldo() > v) {
                  
                  this.setSaldo(this.getSaldo() - v);
                  
              }else{
                System.out.println("Saldo Insuficiente");
              }
             
         } else {
            System.out.println("Conta está fechada");
        }
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public float setSaldo(float saldo) {
        return this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public boolean setStatus(boolean status) {
        return this.status = status;
    }
}
