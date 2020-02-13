import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado= new Scanner(System.in);
		
		int tama�o=0;
		do {
			System.out.println("Introduce el tama�o del vector entre 10 y 20 elementos: ");
			
		     tama�o=  new Integer(teclado.nextLine());
			
			
		}while(tama�o<10 || tama�o>20);
		
		int[] vector= new int[tama�o];
		
		Random generador= new Random();
		
	   for(int i=0;i<vector.length;i++) {
		   
		   vector[i]=generador.nextInt();
		   
	   }
		
		
	   
		System.out.println(Arrays.toString(vector));
		
		int diferencia_minima=Math.abs(vector[0]-vector[1]);

		for(int i=2;i<vector.length;i++) {
			
			int diferencia=Math.abs(vector[i]-vector[i-1]);
			
			if(diferencia<diferencia_minima) {
				
				diferencia_minima=diferencia;
				
			}
			
		}
		
		System.out.println("Diferencia minima: "+diferencia_minima);
		
			
		
	}

}
