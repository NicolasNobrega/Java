
package ContaBanco.pkg6;

public class Conta {
    private double saldo;
    private double limete;
    private int numero;

    public void saque(double saque){
        this.saldo -= saque;
    }
    public void deposito(double valor){
        this.saldo += valor;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getLimete() {
        return limete;
    }

    public void setLimete(double limete) {
        this.limete = limete;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double consultaSaldoDisponivel(){
        return this.saldo + this.limete;
    }

}


