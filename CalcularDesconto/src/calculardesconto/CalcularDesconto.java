package calculardesconto;
import java.util.Scanner;  
import javax.swing.JOptionPane; 
/**
 *
 * @author JoãoPaulo
 */
public class CalcularDesconto {

   public static void main( String[ ] args ) {  
  
        double valorVeiculo, desconto, veiculoDesconto ;  
        int anoVeiculo, total2000 = 0, totalgeral = 0 ;  
        boolean continuar = true ;  
        String decisao ;  
  
        while ( continuar == true ) {  
            Scanner leia = new Scanner( System.in ) ;  
              
            System.out.println( "Digite o valor do veículo: " ) ;  
            valorVeiculo = leia.nextDouble( ) ;  
  
            System.out.println( "Digite o ano do veículo: " ) ;  
            anoVeiculo = leia.nextInt( ) ;  
  
            if (anoVeiculo <= 2000){  
                desconto = ( valorVeiculo * 12 ) / 100 ;  
                veiculoDesconto = valorVeiculo - desconto ;  
                System.out.println(   
                        "O desconto do veículo será de: " + desconto + ". O valor do carro será: " + veiculoDesconto ) ;  
                total2000++ ;  
                totalgeral++;
            }  
            if ( anoVeiculo > 2000 ) {  
                desconto = ( valorVeiculo * 7 ) / 100 ;  
                veiculoDesconto = valorVeiculo - desconto ;  
                System.out.println(   
                        "O desconto do veículo será de: " + desconto + ". O valor do carro será: " + veiculoDesconto ) ;  
                totalgeral++ ;  
            }  
  
            decisao = JOptionPane.showInputDialog( "Deseja fazer outro calculo ? Digite S ou N: " ) ;             
              
            if( decisao.equals( "S" ) || (decisao.equals("s")) ){  
                System.out.println( "Novo cálculo" ) ;  
            }else{  
                System.out.println( "Você saiu!" ) ;  
                continuar = false ;  
                System.out.println("Total de carros até 2000: " + total2000);
                System.out.println("Total de carros geral: " + totalgeral);
            }  
        }  
    }  


    
}