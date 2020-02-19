import java.util.Arrays;
import java.util.Random;

public class Ejercicio_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Random generador= new Random();
		
		
		int filas=generador.nextInt(19)+2;
		
		int columnas=generador.nextInt(19)+2;	
		
		int[][] matriz= new int[columnas][filas];
		
		
		for(int i=0;i<columnas;i++) {
			
			for(int j=0;j<filas;j++) {
				
				matriz[i][j]=generador.nextInt(19)+2;
				
			}}
			
			
			for(int x=0;x<filas;x++) {
				
				for(int j=0;j<columnas;j++) {
					
					System.out.print(matriz[j][x]+" ");
					
				}
				
				System.out.println();
	
		}

		System.out.println("El vector de la suma de las columnas es: "+Arrays.toString(suma_columnas(matriz)));
		
		System.out.println("El vector de la suma de las filas es: "+Arrays.toString(suma_filas(matriz)));
		
		
	
	}
	
	public static int[] suma_filas(int[][] matriz) {
		
		
	int [] suma_filas= new int[matriz[0].length];
	
	for(int i=0;i<matriz[0].length;i++) {
	
	    for(int j=0;j<matriz.length;j++) {
	    	
	    	suma_filas[i]+=matriz[j][i];
	
	    }}
	
	
	  return suma_filas;
	}
	
	public static int[] suma_columnas(int[][] matriz) {
		
	int [] suma_columnas= new int[matriz.length];
	
	for(int i=0;i<matriz.length;i++) {
		
		for(int j=0;j<matriz[0].length;j++) {
			
			suma_columnas[i]+=matriz[i][j];
			
		}
		
		
		
	} return suma_columnas;
	
	
	}

		
		
		
		
		
		
		
		
	
	
}
