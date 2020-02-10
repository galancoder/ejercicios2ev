
public class Ejercicio_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean repetido=false;
		
		int tamaño= (int)((Math.random()*39+1)+10);
		
	
		
		int [] vector= new int[tamaño];
		int [] vector_inverso= new int[tamaño];
		
		
		for(int i=0;i<=vector.length-1;i++) {
			
			int numero= (int)((Math.random()*201)-100);
			
			for(int j=0;j<i;j++) {
				
				if(numero==vector[j]) {
					
					repetido=true;
				}
				
			}
			
			if(repetido==false) {
				
				vector[i]=numero;
				vector_inverso[vector_inverso.length-1-i]=numero;
				
			}
			
			
		}
		
		for(int i=0;i<=vector.length-1;i++){
			
			System.out.print(vector[i]+" ");
			
		}
		
		System.out.println();
		
        for(int i=0;i<=vector.length-1;i++){
			
			System.out.print(vector_inverso[i]+" ");
			
		}
		
		
		
		
		
		
	}

}
