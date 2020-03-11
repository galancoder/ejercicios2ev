import java.util.Arrays;
import java.util.Random;

public class Ejercicio_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random generador= new Random();
		
	    int[] A_desordenado= new int[generador.nextInt(101)];
	    
	    int[] B_desordenado= new int[generador.nextInt(101)];
	    
	    for(int i=0;i<A_desordenado.length;i++) {
	    	
	    	A_desordenado[i]=generador.nextInt();
	    	
	    }
	    
        for(int i=0;i<B_desordenado.length;i++) {
	    	
        	B_desordenado[i]=generador.nextInt();
	    	
	    }
		
	
		int[] A=Ejercicio_16.Intercambio_directo(A_desordenado);
				
	    int[] B=Ejercicio_16.Intercambio_directo(B_desordenado);
	
		
		int pos_A=0;
		
		int pos_B=0;
		
		int[] C= new int[A.length+B.length];
		
		for(int i=0;i<C.length;i++) {
			
			if(pos_A<=A.length-1 && pos_B<=B.length-1) {
				
				
				if(A[pos_A]<B[pos_B]) {
					
					C[i]=A[pos_A];
					
					pos_A++;
					
				}else if(B[pos_B]<A[pos_A]) {
					
					C[i]=B[pos_B];
					
					pos_B++;
					
				}else {
                    C[i]=A[pos_A];
					
					pos_A++;
				}
				
			}else {
				
				if(pos_A>A.length-1) {
					
                    C[i]=B[pos_B];
					
					pos_B++;
					
				}else if(pos_B>B.length-1){
					
                    C[i]=B[pos_B];
					
					pos_B++;
					
				}
				
			}

		}
		
        System.out.println(Arrays.toString(A));
		
		System.out.println(Arrays.toString(B));
		
		System.out.println(Arrays.toString(C));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
