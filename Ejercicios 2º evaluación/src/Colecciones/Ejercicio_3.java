package Colecciones;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Ejercicio_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

     Scanner teclado= new Scanner(System.in);
     
     Scanner frase= new Scanner(teclado.nextLine());
     
     List<String> lista= new ArrayList<String>();
     
     Set<String> lista_repetidas= new TreeSet<String>();
     
    
     
     
while (frase.hasNext()) {
	
	String palabra=frase.next();
	
	if(!lista.contains(palabra) & !lista_repetidas.contains(palabra)) {
		
		lista.add(palabra);
	}else if(lista.contains(palabra)) {
		
		lista.remove(palabra);
		lista_repetidas.add(palabra);
		
	}
	
}

frase.close();
teclado.close();
   
System.out.print("Lista no repetidas: [ ");
lista.forEach(nombre -> System.out.print(nombre+" "));
System.out.print("]");
System.out.println("");

System.out.print("Lista repetidas: [ ");
lista_repetidas.forEach(nombre -> System.out.print(nombre+" "));
System.out.print("]");
System.out.println("");





		
	}

}
