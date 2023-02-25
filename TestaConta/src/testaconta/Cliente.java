package testaconta;
public class Cliente {
   private String nome;
   private int  codigo;
   
   public void setNome(String n){
       this.nome = n;
   }
      public String getNome(){
       return nome;
   }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
}

