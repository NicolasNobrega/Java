package testaconta;
public class TestaConta {

    public static void main(String[] args) {
       Conta referencia = new Conta();
       Cliente cliente1 = new Cliente();
       Cliente cliente2 = new Cliente();
       CartãoDeCredito cartao1 = new CartãoDeCredito();
       CartãoDeCredito cartao2 = new CartãoDeCredito();
       referencia.setSaldo(1000.0);
       referencia.setLimite(500.0);
       referencia.setNumero(1);
       cliente1.setNome("Jobervaldo");
       cliente2.setNome("Fizz a now");
       cliente1.setCodigo(1);
       cliente2.setCodigo(2);
       cartao1.setNumero(211);
       cartao1.setDataDeValidade("12/11/2001");
       cartao2.setNumero(232);
       cartao2.setDataDeValidade("12/2/2020");
       
       System.out.println("Saldo: " + referencia.getSaldo());
       System.out.println("Limite: " + referencia.getLimite());
       System.out.println("Número: " + referencia.getNumero());
       System.out.println("Nome do Cliente1: " + cliente1.getNome());
       System.out.println("Nome do Cliente2: " + cliente2.getNome());
       System.out.println("Codigo do Cliente1: " + cliente1.getCodigo());
       System.out.println("Codigo do Cliente2: " + cliente2.getCodigo());
       System.out.println("Numero do Cartão: " + cartao1.getNumero());
       System.out.println("Data: " + cartao1.getDataDeValidade());
       System.out.println("Numero do Cartão: " + cartao2.getNumero());
       System.out.println("Data: " + cartao2.getDataDeValidade());
       
       
              
       
       
    }
    
}
