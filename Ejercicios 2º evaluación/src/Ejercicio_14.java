import java.util.Scanner;

public class Ejercicio_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado= new Scanner(System.in);

		int numero_secuencias=0;
		
		int longuitud_secuencia;
		
		int [] vector_secuencia;
		
		String secuencia="";
		int[][] array;
		
		
		
		
		System.out.println("Introduce el numero de secuencias: ");
		
		numero_secuencias=teclado.nextInt();
		
		array= new int[numero_secuencias][];
		
		
		
		for(int i=0;i<numero_secuencias;i++) {
		
		System.out.println("Introduce la cantidad de numeros de la secuencia "+(i+1)+":");
		
		vector_secuencia= new int[teclado.nextInt()];
	
		System.out.println("Introduce la secuencia de numeros separada por espacios en blanco: ");
	
	    for(int j=0;j<vector_secuencia.length;j++) {
	
		
		vector_secuencia[j]=teclado.nextInt();
		
			
	    }
	    array[i]=vector_secuencia;

		}
		
		for(int i=0; i<numero_secuencias;i++ ) {
			
			for(int j=0;j<array[i].length;j++) {
				
				System.out.print(array[i][j]);
			}
			
			System.out.println();
			
			
			
		}
		
		
		
		
	}

}
