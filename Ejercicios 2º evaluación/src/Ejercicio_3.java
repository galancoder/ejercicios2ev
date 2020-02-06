import java.util.Scanner;

public class Ejercicio_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int contiene=0;
		
		Scanner cadena= new Scanner(System.in);
		
		System.out.println("Introduce una cadena 1 de texto: ");
		
		String cadena_1=cadena.nextLine();
		
        System.out.println("Introduce una cadena 2 de texto: ");
		
		String cadena_2=cadena.nextLine();
		
		if(cadena_2.length()>cadena_1.length()) {
			
			System.out.println("La segunda cadena es mayor que la primera");
			
		}else if(cadena_2.length()<cadena_1.length()){
			
			for(int i=0;i<cadena_1.length()-cadena_2.length()+1; i++) {
				
				
				if((cadena_1.substring(i,i+cadena_2.length())).equals(cadena_2)){
					
					contiene++;
					
				}
				
			}
			
			
		}else {
			
			if(cadena_1.equals(cadena_2)) {
				
				contiene++;
				
			}
			
		}
		
		
		System.out.println("La cadena "+cadena_1+" contiene la cadena "+cadena_2+" "+contiene+" veces");
		
	}

}
