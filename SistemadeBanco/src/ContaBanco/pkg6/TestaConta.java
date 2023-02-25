
package ContaBanco.pkg6;
import javax.swing.JOptionPane;

public class TestaConta {

    public static void main(String[] args) {
        
       Conta conta1 = new Conta();
       Conta conta2 = new Conta();
       Agencia ag1= new Agencia();
       Agencia ag2= new Agencia();
       
       ag1.conta=conta1;
       ag2.conta=conta2;
       
       double saldoDisponivel1 = conta1.consultaSaldoDisponivel();
       double saldoDisponivel2 = conta2.consultaSaldoDisponivel();
    
       
       String valor =
               JOptionPane.showInputDialog("Digite um valor para deposito ");
       double saldo = Double.parseDouble(valor);
       conta1.setSaldo(saldo);
       saldoDisponivel1 = conta1.getSaldo();
       String mensagem = 
               String.format("Saldo Disponivel: " +saldoDisponivel1);
       JOptionPane.showMessageDialog(null,mensagem);
       
              String saque =
               JOptionPane.showInputDialog("Digite um valor para Sacar ");
              conta1.saque(Double.parseDouble(saque));
       saldoDisponivel1 = conta1.getSaldo();
       String mensagem1 = 
               String.format("Saldo Disponivel a pós saque: " +saldoDisponivel1);
       JOptionPane.showMessageDialog(null,mensagem1);
       
       
       
       /*
       
       ag1.setNumero(122887766);
       ag1.setUf("Ceilandia");
       ag1.conta.setSaldo(1000.00);
       ag1.conta.setLimete(500.0);
       ag1.conta.setNumero(1);
       
       ag2.setNumero(97765432);
       ag2.setUf("Aguas Claras");
       ag2.conta.setSaldo(5000.00);
       ag2.conta.setLimete(100.0);
       ag2.conta.setNumero(2);
      
       CartaoDeCredito card1= new CartaoDeCredito();
       CartaoDeCredito card2= new CartaoDeCredito();
       Cliente cliente1= new Cliente();
       Cliente cliente2= new Cliente();
       
       card1.cliente=cliente1;
       card2.cliente=cliente2;
       
       
       card1.setNumeroCard(1223344);
       card1.setData("03/11/2025");
       card1.cliente.setNome("Nicolas");
       card1.cliente.setCodigo(12334567);
       
       
       card2.setNumeroCard(4455567);
       card2.setData("03/12/2032");
       card2.cliente.setNome("Gabriel");
       card2.cliente.setCodigo(7654321);
       
       System.out.println("---- CONTA 01 ----"); 
       
       System.out.println("Numero Agencia :"+ag1.getNumero());
       System.out.println("UF :"+ag1.getUf());
       
       
       System.out.println("Nome do Cliente :"+card1.cliente.getNome());
       System.out.println("Codigo :"+card1.cliente.getCodigo());
       
       System.out.println("Saldo :"+ag1.conta.getSaldo());
       System.out.println("Limite :"+ag1.conta.getLimete());
       System.out.println("Numero :"+ag1.conta.getNumero());
       
       System.out.println("Numero do Cartão de Credito :"+card1.getNumeroCard());
       System.out.println("Data :"+card1.getData());
       
       System.out.println("\n ----CONTA 02 ----");
       
       System.out.println("Numero Agencia :"+ag2.getNumero());
       System.out.println("UF :"+ag2.getUf());
                
       System.out.println("Nome :"+card2.cliente.getNome());
       System.out.println("Codigo :"+card2.cliente.getCodigo());
       
       System.out.println("Saldo :"+ag2.conta.getSaldo());
       System.out.println("Limite :"+ag2.conta.getLimete());
       System.out.println("Numero :"+ag2.conta.getNumero());
       
       System.out.println("Numero do Cartão de Credito :"+card2.getNumeroCard());
       System.out.println("Data :"+card2.getData());*/
        
  
        
    }
    
}
