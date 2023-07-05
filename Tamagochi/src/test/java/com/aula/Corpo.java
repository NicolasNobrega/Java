package test.java.com.aula;

public class Corpo {
	 public String nome;
	    public int comida;
	    protected int vida;
	    protected int felicidade;
	    protected int dinheiro;
	    
	    public void status(){
	        System.out.println("Nome: " + nome);
	        System.out.println("Vida: "+ vida);
	        System.out.println("Felicidade: "+ felicidade);
	        System.out.println("Dinheiro: "+ dinheiro + "D");
	        System.out.println("Escolha a comida \n1 Frango: 5d");
	    }
	    
	    public void comer(int comida){
	        
	        if(dinheiro > 0){
	                
	            if(comida == 1){
	                this.dinheiro = dinheiro -5;
	                System.out.println("Comendo Frango");
	            }
	        }else {
	            System.out.println("Sem dinheiro :(");
	        }
	    }
	    public void jogar(){
	        this.dinheiro = dinheiro +5;
	        this.felicidade = ++felicidade;
	        System.out.println("Jogando Bola");
	    }
	    public void darCarinho(){
	        this.felicidade = felicidade + 5;
	    }
}
