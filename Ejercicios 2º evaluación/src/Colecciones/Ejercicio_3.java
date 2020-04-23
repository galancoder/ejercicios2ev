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
     
     List<String> lista= new ArrayList<String>();
     
     Set<String> lista_no_duplicados= new TreeSet<String>();
     
     Scanner frase= new Scanner(teclado.nextLine());
     
     
while (frase.hasNext()) {
	
	String palabra=frase.next();
	
	lista.add(palabra);
	lista_no_duplicados.add(palabra);
}

frase.close();

teclado.close();
     
lista.forEach(nombre -> System.out.print(nombre+"-"));

System.out.println("");

lista_no_duplicados.forEach(nombre -> System.out.print(nombre+"-"));


		
	}

}
