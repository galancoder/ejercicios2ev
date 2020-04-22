package Colecciones;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio_1 {
	
	

public static void main(String[] args) {
		// TODO Auto-generated method stub
		
List<String> lista= new LinkedList<String>();

Scanner entrada= new Scanner (System.in);
		

int numero_nombres=entrada.nextInt();
entrada.nextLine();



for(int i=1;i<=numero_nombres;i++) {
	
	String nombre=entrada.nextLine();
	
	if(lista.contains(nombre)==false) {
		
		lista.add(nombre);
		
	}
	
}


lista.forEach(nombre -> System.out.println(nombre));
		

	}

}
