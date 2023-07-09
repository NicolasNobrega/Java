package test.java.com.aula;

import java.util.Scanner;

public class Tamagochi {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bem-vindo ao Tamagotchi!");
        System.out.println("Digite o nome do seu Tamagotchi:");
        String name = scanner.nextLine();

        Corpo tamagotchi = new Corpo(name);
        
        tamagotchi.status();
        
        int option;
        
        do {
            System.out.println("Escolha uma acao:");
            System.out.println("1 - Alimentar");
            System.out.println("2 - Brincar");
            System.out.println("3 - Dar Carinho");
            System.out.println("4 - Status");
            System.out.println("5 - Dormir");
            System.out.println("6 - Sair");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                	
                	int num;
                	
                	System.out.println("Escolha a comida");
                	System.out.println("1 - Frango");
                	System.out.println("2 - Coxinha");
                	num = scanner.nextInt();
            		
                	
                    tamagotchi.comer(num);
                    break;
                case 2:
                    tamagotchi.jogar();
                    break;
                case 3:
                    tamagotchi.darCarinho();
                    break;
                case 4:
                	tamagotchi.status();
                    break;
                case 5:
                	tamagotchi.dormir();
                	break;
                case 6:
                	System.out.println("Até logo!");
                	break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        } while (option != 6);
        


	}

}
