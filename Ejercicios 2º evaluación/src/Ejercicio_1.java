import java.util.Locale;
import java.util.Scanner;

public class Ejercicio_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=0;
		
		int e=0;
		
		int i=0;
		
		int o=0;
		
		int u=0;
		
		Scanner texto= new Scanner(System.in);
		
		System.out.println("Introduce una cadena de texto:");
		
		String cadena= texto.nextLine().toLowerCase();
		
	
		
		
		
		for (int j=0;j<=cadena.length()-1;j++) {
			
			char c=cadena.charAt(j);
			switch(c) {
			
			case 'a':
				a++;
				break;
			case 'e':
				e++;
				break;
			case 'i':
				i++;
				break;
			case 'o':
				o++;
				break;
			case 'u':
				u++;
				break;
			
			}
			
			
		}
		
		System.out.println("La vocal 'a' se repite "+a+" veces\n"
				+ "La vocal 'e' se repite "+e+" veces\n"
				+ "La vocal 'i' se repite "+i+" veces\n"
				+ "La vocal 'o' se repite "+o+" veces\n"
				+ "La vocal 'u' se repite "+u+" veces\n");
	
		
		
	}

}
