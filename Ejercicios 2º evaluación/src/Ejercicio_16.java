import java.util.Arrays;

public class Ejercicio_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array= {10,9,8,7,6,5,4,0,2,1,156,-89,4,58,23,14,78,26};
		
		System.out.println("Por el método de insercion directa");
		System.out.println(Arrays.toString(insercion_directa(array)));
		
		System.out.println("Por el método de seleccion directa");
		System.out.println(Arrays.toString(seleccion_directa(array)));
		
		System.out.println("Por el método de intercambio directo");
		System.out.println(Arrays.toString(Intercambio_directo(array)));
		
	}
	
	
	
	public static int[]  insercion_directa(int[] array) {
		
		for(int i=1;i<array.length;i++) {
			int j=i;
			while(j>0 && array[j]<array[j-1] ) {
				
				int aux=array[j-1];
				array[j-1]=array[j];
				array[j]=aux;
				j--;	
		}
		
	
	}
		return array;
	}
	public static int[] seleccion_directa(int[] array) {
		
for(int i=0;i<array.length;i++) {
	    	
	    	int menor=array[i];
	    	int posicion_menor=i;
	    	
	    	for(int j=i;j<array.length;j++) {
	    		
	    		if(array[j]<menor) {
	    			
	    			menor=array[j];
	    			posicion_menor=j;}
	    		}
	    	  array[posicion_menor]=array[i];
	    	  array[i]=menor;	
	    	
	    }
		
		
		
		
		return array;
	}
	public static int[] Intercambio_directo(int[] array) {
		
int ultima_posicion=array.length-2;
		
		
		while(ultima_posicion>=0) {
		
		for(int i=0;i<=ultima_posicion;i++) {
			
			if(array[i]>array[i+1]) {
				
				int aux=array[i+1];
				
				array[i+1]=array[i];
				
				array[i]=aux;
				
			}		
			
		}
		
		
		ultima_posicion--;
		
		}
		
		return array;
	}
}
