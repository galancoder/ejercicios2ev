import java.util.Scanner;

public class Ejercicio_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado= new Scanner(System.in);
		
		System.out.println("Introduce tu dni: ");
		
        String[] letra_correspondiente= {"T","R", "W", "A", "G", "M", "Y", "F", "P", "D", "X ","B" ,"N" ,"J" ,"Z" ,"S" ,"Q"," V", "H", "L", "C", "K", "E"};
	
		
		String dni=teclado.nextLine();
		
		while(dni.length()>9) {
			
			System.out.println("El dni no puede tener mas de 9 caracteres:");
			System.out.println("Introduce tu dni: ");
            dni=teclado.nextLine();
			
		}
		
		int resto= Integer.parseInt(dni.substring(0,dni.length()-1))%23;
		
		System.out.println("resto "+resto);
		
		String letra_dni= dni.substring(dni.length()-1,dni.length());
	
		System.out.println("letra_dni "+letra_dni);
		
		
		if(letra_dni.equals(letra_correspondiente[resto])==false) {
			
			System.out.println("El dni es incorrecto");
			
		}else {System.out.println("El dni es correcto");}
		
		
	}

}
