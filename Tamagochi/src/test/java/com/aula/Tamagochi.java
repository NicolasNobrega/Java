package test.java.com.aula;

public class Tamagochi {

	public static void main(String[] args) {
		
        Corpo tamagochi = new Corpo("Roberto");
        
        while (tamagochi.isMorto()) {
        
        	tamagochi.status();
        	
        }

	}

}
