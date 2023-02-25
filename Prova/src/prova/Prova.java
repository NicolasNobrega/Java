
package prova;

public class Prova {

    public static void main(String[] args) {
        
        Gerente gerente= new Gerente();
        Telefonista telefo= new Telefonista();
        gerente.setNome("Mario");
        gerente.setSalario(2300.00);
        gerente.setUsuario("Mario.o");
        gerente.setSenha("12345");

        telefo.setNome("casa");
        telefo.setRamal(3);
        
        
        System.out.println("Gerente: "+ gerente.getUsuario());
        System.out.println("Nome: " + gerente.getNome());
        System.out.println("Senha: " + gerente.getSenha());
        System.out.println("Salario: " + gerente.getSalario());
        System.out.println("Telefone: " + telefo.getNome());
        System.out.println("Ramal: " + telefo.getRamal());
        
        
        
        
        
           }
    
}
