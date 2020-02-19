import java.util.Scanner;

public class Ejercicio_12 {

	
	
	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		int[] vector={6,2,3,0,1};
		
		
		System.out.println(centro(vector));
		
		
		
}
	
	
public static String centro(int[] vector) {

		
        int suma_izquierda=0;
		
		int suma_derecha=0;
	
		int centro=1;
		
		for( centro=1;centro<vector.length-1;centro++) {
			
			//suma izquierda
			
		
			for(int i=0;i<=centro-1;i++) {	
				suma_izquierda+=(centro-i)*vector[i];
			}
			
            //suma derecha
			
			for(int j=centro+1;j<=vector.length-1;j++) {
				suma_derecha+=(j-centro)*vector[j];	
			}
			
			if(suma_derecha==suma_izquierda) {
				
				
				break;
				
			}
			
			
		
	
	
		}
		if(suma_derecha==suma_izquierda) {
			
			return "El vector tiene centro en: "+centro;
			
		}else {
			
			return null;
		}
	
	
		
	}
}

