import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio_11 {

	
	public static  String mayor_cadena (String [] vector_nombres) {
		
		
		String mayor_cadena=vector_nombres[0];
		
		for(int i=1;i<vector_nombres.length;i++) {
			
			if(vector_nombres[i].length()>mayor_cadena.length()) {
				
				mayor_cadena=vector_nombres[i];
				
			}
			
		}
		
		return mayor_cadena;
	}
	
	public static String[] crea_vector() {
		
		String [] vector= new String[10];
		
		Scanner teclado= new Scanner(System.in);
		
		for(int i=0;i<10;i++) {
			
			
			System.out.println("Introduce el nombre "+(i+1));
			
			vector[i]=teclado.nextLine();
		
		}
			
		return vector;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		String[] nombres=Ejercicio_11.crea_vector();
		
		
		System.out.println(Arrays.toString(nombres));
		
		System.out.println("La cadena mayor es: "+mayor_cadena(nombres));
		
		
		
		
	}

}
