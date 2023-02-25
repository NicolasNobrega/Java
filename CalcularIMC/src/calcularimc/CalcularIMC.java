package calcularimc;
import java.util.Scanner;
public class CalcularIMC {
    public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    
    double pc,alt,vlrIMC;
    
   System.out.printf("Informe o Peso Corportal em kg: ");
   pc = ler.nextDouble();
   
   System.out.printf("Informe a Altura em Metros: ");
   alt = ler.nextDouble();
   vlrIMC = IMC(pc,alt);
   
   System.out.printf("IMC = %.2f (%s)\n", vlrIMC,interpretacaoIMC(vlrIMC));
    }
   public static double IMC(double pc, double alt){
       return(pc/(alt*alt));
   }
   public static String interpretacaoIMC(double vlrIMC){
       if (vlrIMC <20)
           return("Magro");
            else if ((vlrIMC>=20)&& (vlrIMC < 24))
                return("Normal");
                else if ((vlrIMC >=24)&& (vlrIMC >=29))
                    return("Acima do Peso");
                    else if((vlrIMC >=29)&&(vlrIMC <34))
                        return "Obeso";
                        else
                            return ("Muito Obeso");
   }
}
