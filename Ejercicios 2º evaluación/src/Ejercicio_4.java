import java.util.Scanner;

public class Ejercicio_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int resultado=0;
		
		Scanner teclado= new Scanner(System.in);
		
		System.out.println("¿Cuantas veces quieres lanzar el dado?: ");
		
		int[] caras={1,2,3,4,5,6};
		
		int[] repeticiones=new int[6];
		
		int veces=teclado.nextInt();
		
		for(int i=1;i<=veces;i++) {
			
		resultado=(int)(Math.random()*6)+1;
		
	      
			for(int j=0;j<caras.length;j++) {
				
			if(resultado==caras[j]) {
				
				repeticiones[j]=repeticiones[j]+1 ;
			}
			}
			
		}
		
		for(int j=0;j<caras.length;j++) {
			
			System.out.println("la cara "+(j+1)+" ha salido "+repeticiones[j]+" veces.");
			
			}
	
		
		
	}

}
