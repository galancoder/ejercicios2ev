import java.util.Scanner;

public class Ejercicio_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean repetido=false;
		
		Scanner teclado= new Scanner(System.in);
		
		System.out.println("Introduce el tamaño entre 10 y 1000000 del vector: ");
		
		int tamaño=teclado.nextInt();
		
		while(tamaño>1000000 || tamaño<10) {
			
			System.out.println("Introduce el tamaño entre 10 y 1000000 del vector: ");
			tamaño=teclado.nextInt();
			
		}
		
		int [] vector= new int[tamaño];
		
		long inicio_llenado=System.currentTimeMillis();
		
		//LLENAMOS VECTOR CON NUMEROS ALEATORIOS VERIFICANDO QUE NO ESTÉN ANTES REPETIDOS EN EL ARRAY
		
		for(int i=0;i<vector.length;i++) {
			
			int numero= (int)(Math.random()*(1000000+999999+1)-999999);
			
			
			for(int j=0;j<i;j++) {
				
				if(numero==vector[j]) {
					
					repetido=true;
					
				}
				
			if(repetido==false) {
				
				vector[i]=numero;
				}	
				} 
	
		}
		
		long final_llenado=System.currentTimeMillis();
		
		//CALCULAMOS CUAL ES EL MAYOR, CUAL ES EL MENOR Y LA DIFERENCIA
		
		long inicio_calculo=System.currentTimeMillis();
		
		int mayor=vector[0];
		
		int menor=vector[0];
		
		for(int i=1;i<vector.length;i++) {
			
			if(vector[i]>mayor) {
				
				mayor=vector[i];
				
			}else if(vector[i]<menor) {
				
				menor=vector[i];
				
			}
			
		}
		
		
		long final_calculo=System.currentTimeMillis();
		
		//MOSTRAMOS POR PANTALLA EL VECTOR
		
		for(int i=0;i<vector.length;i++) {
			
			System.out.print(vector[i]+" ");
			
			
		}
		

		System.out.println("El mayor es: " +mayor);
		
		System.out.println("El menor es: " +menor);
		
		System.out.println("La diferencia entre el mayor y el menor es "+(mayor-menor));
		
	
		
		
	}

}
