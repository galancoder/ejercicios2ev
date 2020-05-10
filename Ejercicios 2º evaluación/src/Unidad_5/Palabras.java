package Unidad_5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeSet;

public class Palabras {

	private Map<Integer,TreeSet<String>> mapa_palabras= new HashMap<Integer,TreeSet<String>>();
	
public Palabras() {
		
		
	}

	public Palabras(String palabra_o_frase) {
		
		añadir_palabras(palabra_o_frase);
		
		
	}
	
    public void añadir_palabras(String palabra_o_frase) {
    	
    	
	Scanner entrada= new Scanner(palabra_o_frase);
		
		while(entrada.hasNext()) {
			
			String palabra=entrada.next();
			
			if(mapa_palabras.containsKey(palabra.length())) {
				
				mapa_palabras.get(palabra.length()).add(palabra);
				
			}else {
				
				mapa_palabras.put(palabra.length(), new TreeSet<String>());
				
				mapa_palabras.get(palabra.length()).add(palabra);
				
				
			}
			
		}
    	
    }

	
    public TreeSet<String> mostar_grupo_concreto(int numero_letras) {
		
		if(mapa_palabras.containsKey(numero_letras)) {
		return mapa_palabras.get(numero_letras);
		}else {return null;}
		
		
		
	}
    
    public boolean hay_palabras(int numero_letras) {
    	
    	if(mapa_palabras.containsKey(numero_letras)) {
    		
    		return true;
    	}else {
    	
		return false;
    	}
    	
    	
    }
	
	
    public String toString() {
		return mapa_palabras.toString();
	}
	
	
	
	
	
	
	
}
