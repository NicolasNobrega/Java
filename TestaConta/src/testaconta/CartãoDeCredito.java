package testaconta;
public class CartãoDeCredito {
    private int numero;
    private String dataDeValidade;
    
    
    public void setNumero(int n1){
        this.numero = n1;
    }
    public int getNumero(){
        return numero;
    }
    public void setDataDeValidade(String dt){
        this.dataDeValidade = dt;
    }

    public String getDataDeValidade() {
        return dataDeValidade;
    }

    public void setDataDevalidade(String dataDeValidade) {
        this.dataDeValidade = dataDeValidade;
    }
    
}
