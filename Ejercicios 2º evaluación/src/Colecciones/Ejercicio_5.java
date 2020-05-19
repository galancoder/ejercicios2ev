package Colecciones;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.regex.PatternSyntaxException;

public class Ejercicio_5 {

	public static void main(String[] args) throws  NoSuchElementException{
		// TODO Auto-generated method stub

		
		    Map<String, HashSet<Integer>> mapa = new HashMap();
			
			
		
			
			boolean continuar=true;
				
			while(continuar){
				System.out.print("> ");
					
							try {
								Scanner linea= new Scanner(new Scanner(System.in).nextLine());
								
								String coincidencia=linea.skip("[a-zA-Z]+:\\d{9}|buscar:[a-zA-Z]+|eliminar:[a-zA-Z]+|contactos|salir").match().group();
								    
								String[] comando=coincidencia.split(":");
								
								switch(comando[0]) {
								
								case "buscar":
									if(mapa.containsKey(comando[1])) 
									{System.out.println("Telefono: "+mapa.get(comando[1]).toString());
									}else {
										System.out.println("No existe tal usuario en la agenda");}
									break;
									
								case "eliminar":
									if(mapa.containsKey(comando[1])) 
									{mapa.remove(comando[1]);
									}else {
										System.out.println("No existe tal usuario en la agenda");}
									break;
									
								case "contactos":
									System.out.println(mapa);
									break;
									
								case "salir":
									System.out.println("salir");
									continuar=false;
									break;
									
							    default:
							    	
							    	if(!mapa.containsKey(comando[0])) {
							    		
							    		mapa.put(comando[0], new HashSet<Integer>());
							    		mapa.get(comando[0]).add(Integer.parseInt(comando[1]));
							    	}else {
							    		if(mapa.get(comando[0]).contains(Integer.parseInt(comando[1]))) {
							    			
							    			System.out.println("El usuario "+comando[0]+ " ya tiene registrado el numero "+comando[1]);
							    		}else {
							    			
							    			mapa.get(comando[0]).add(Integer.parseInt(comando[1]));
							    			
							    		}

							    	}
							    	
							    	
							    	break;
		
								}
	
							} catch (NoSuchElementException e) {
								// TODO Auto-generated catch block
								System.out.println("Comando incorrecto");
							}
								
							       
							  
							
						
			
						
			}	
						
						
} 
					


		
		
		
		
		
	
}
