package Colecciones;

import java.util.HashSet;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.TreeMap;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Integer,HashSet<String>> mapa_palabras= new TreeMap<Integer,HashSet<String>>();

		while(true) {
		
		Scanner linea= new Scanner(new Scanner (System.in).nextLine());
		
	
		
		try {
			String comando=linea.skip("texto:(\\s)*|lista(\\s)*").match().group().trim();
			
			
		switch (comando) {
		
		case "texto:":
			
			while(linea.hasNext()) {
				String palabra=linea.next();
				if(mapa_palabras.containsKey(palabra.length())) {
					
					mapa_palabras.get(palabra.length()).add(palabra);
				}else {
					mapa_palabras.put(palabra.length(), new HashSet<String>());
					mapa_palabras.get(palabra.length()).add(palabra);
					
				}
			}
			
			break;
			
		case "lista":
			
			try {
				int longuitud_palabra= Integer.parseInt( linea.skip("\\d+").match().group());
				System.out.println(mapa_palabras.get(comando));
			} catch (NoSuchElementException e) {
				// TODO Auto-generated catch block
				System.out.println("Necesitamos un numero entero");
			}
		
			break;}
	
		} catch (NoSuchElementException  e) {
			// TODO Auto-generated catch block
			System.out.println("Comando incorrecto");
		}
	}
		
		
	}

}
