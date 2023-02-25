
package ContaBanco.pkg6;

public class CartaoDeCredito {
       private int numCard;
       private String data;
       Cliente cliente;
   
       
       
       
       
 public int getNumeroCard(){
     return numCard;
 }
 
 public void setNumeroCard(int numeroCard){
     this.numCard=numeroCard;
 
 }
 
 public String getData(){
     return data;
 }
 
 public void setData(String data){
     this.data=data;
 }
  public Cliente getCliente() {
        return cliente;
    }

 public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
      
       
 
 
}
