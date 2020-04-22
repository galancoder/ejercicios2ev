package Colecciones;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.NavigableSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Ejercicio_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random generador= new Random();
		
		List<Integer> lista= new ArrayList<Integer>();
		
		for(int i=1;i<=100;i++) {
			
			lista.add(generador.nextInt(99)+1);
			
		}
		
		lista.forEach(numero -> System.out.print(numero +" - "));
		
		System.out.println();
		System.out.println("-------------------------------------------");
		
		Set<Integer> lista_2= new HashSet<Integer>();
		
		lista_2.addAll(lista); 
		
		Iterator<Integer> iterador=lista_2.iterator();
		
		while(iterador.hasNext()) {
			
			System.out.print(iterador.next() +" - ");
			
		}
		
		
	}
	
	
	

}
