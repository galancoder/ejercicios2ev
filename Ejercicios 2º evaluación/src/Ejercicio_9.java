import java.util.Arrays;
import java.util.Random;

public class Ejercicio_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Random generador= new Random();
		
		int numero_secuencias=0;
		
		int[] vector= new int[generador.nextInt(491)+10];		
		
		int i=0;
		
		while(i<vector.length) {
			
			vector[i]=generador.nextInt(201)-100;
			i++;
		}
		
		
		
		
		
		int j=1;
		
		while(j<vector.length) {
			
		 if(vector[j]==vector[j-1]) {
			 
			 int k=j;
			 
			 while(vector[k]==vector[k-1]) {
				 k++;
			 }
			 
			 numero_secuencias++;
			 
			 j+=(k-j);
			 
			 
			 
		 }else {
			 
			 
			 j++;
		 }
			
			
			
			
			
		}
			
			
		
		
		
		System.out.println(Arrays.toString(vector));
		
		System.out.println("Hay "+numero_secuencias+" secuencias");
		
		
	}

}
