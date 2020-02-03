import java.util.Scanner;

public class Ejercicio_2 {

	public static void main(String[] args) {
		
		
		Scanner texto = new Scanner(System.in);
		
		System.out.println("Introduce una cadena de texto: ");
		
		
		String cadena= texto.nextLine();
        
	
		for(int i=cadena.length()-1;i>=0;i--) {
		
	    System.out.print(cadena.charAt(i));
		
		}
		

	}

}
