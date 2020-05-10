package Unidad_5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Prueba_palabras{

	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada= new Scanner (System.in);
		
		Palabras lista_palabras= new Palabras();

		while(entrada.hasNextLine()) {
			
			
			Scanner linea= new Scanner (entrada.nextLine());
			
			String comando=linea.next();
			
			if (comando.equals("Texto:")){
				
				while(linea.hasNext()) {
					
					lista_palabras.añadir_palabras(linea.next());
					
					
				}
				
				System.out.println ("Palabras añadidas exitosamente");
				
			}else if (comando.equals("Lista")) {
				
				int numero_letras=linea.nextInt();
				
			    if (lista_palabras.hay_palabras(numero_letras)) {
			    	
			    	System.out.println (lista_palabras.mostar_grupo_concreto(numero_letras).toString());
			 
			    	
			    	
			    }else {
			    	
			    	System.out.println ("No se han introducido palabras de "+numero_letras+" letras");
			    }
				
				
			}else {
				
				System.out.println("Comando introducido incorrectamente");
				
			}
			
			
		}
		
		
	}

}
