import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado= new Scanner(System.in);
		
		int tamaño=0;
		
		do{
			
			System.out.println("Introduce un numero entre 10 y 200: ");
			
			tamaño=Integer.parseInt(teclado.nextLine());
			
		}while(tamaño<10 || tamaño>200);
		
		int [] vector= new int [tamaño];
		
		int i=0;
		
		Random generador= new Random();
		
		while(i<vector.length) {
			
			int numero=generador.nextInt(101)-100;
			
			vector[i]=numero;
			
			i++;
			
		}
		
		System.out.println(Arrays.toString(vector));
		
	
		
		int j=0;
		
		int suma=0;
		
		int suma_delante_13=0;
		
		int numeros_no_sumados=0;
		
		
		
		while(j<vector.length) {
			
			if(vector[j]==13) {
				
				
				int posicion=j+1;
				
				int rango=posicion+12;
				
			    while(posicion<vector.length && posicion<=rango) {
			    	
			    	suma_delante_13+=vector[posicion];
			    	
			    	posicion++;
			    }
				
				if(suma_delante_13!=7) {
					
					numeros_no_sumados+=(posicion-j);
					
					j+=13;
					
					
				}else {
					
				   
					
					suma+=vector[j];
					
					j++;
				}
		
			}else {	
				
				suma+=vector[j];
				
				j++;
				
			}
			
			  
		}
		
		System.out.println("La suma despues de 13 es igual a:"+suma_delante_13);
		
		System.out.println("La suma de los elementos es: "+suma);
		
		System.out.println("No se han sumado "+numeros_no_sumados+" numeros");
		
		
		
		
		
		
	}

}
