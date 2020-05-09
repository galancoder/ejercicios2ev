package Unidad_5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Juego_carta_mas_alta {
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random generador = new Random();
		
		int Puntos_usuario=0;
		
		int Puntos_ordenador=0;
		
		ArrayList<Naipes> baraja=(new Mazo()).getMazo();
		

	    		
		//BARAJAMOS 100 VECES PARA ASEGURARNOS DE QUE EL MAZO ESTA DISPUESTO DE FORMA ALEATORIA 
		
		for(int i=1;i<=100;i++) {
		
		Naipes carta_0=baraja.get(generador.nextInt(baraja.size()-1));
		
		Naipes carta_1=baraja.get(generador.nextInt(baraja.size()-1));
		
		baraja.set(baraja.indexOf(carta_1),carta_0);
		
		baraja.set(baraja.indexOf(carta_0),carta_1);
		
		}
		
		//EN CADA RONDA LA MAQUINA Y EL USUARIO SACAN UN CARTA DEL MAZO BARAJADO
	    //EL QUE OBTENGA LA CARTA MAS ALTA SUMA UN PUNTO
	    //AL ACABAR EL MAZO EL QUE TENGA MAS PUNTOS GANA
		
        Iterator<Naipes> i=baraja.iterator();
        
        while(i.hasNext()) {
        	
        	Naipes carta_usuario=i.next();
        	
        	System.out.println("El usuario ha obtenido un "+carta_usuario.getValor()+" de "+carta_usuario.getPalo());
        	
        	Naipes carta_ordenador=i.next();
        	
        	System.out.println("El ordenador ha obtenido un "+carta_ordenador.getValor()+" de "+carta_ordenador.getPalo());
        	
        	if(carta_usuario.getValor()>carta_ordenador.getValor()) {
        		
        		Puntos_usuario++;
        		
        		System.out.println("Gana el usuario esta ronda ");
        		
        		
        	}else if (carta_usuario.getValor()<carta_ordenador.getValor()) {
        		
        		Puntos_ordenador++;
        		
        		System.out.println("Gana el ordenador esta ronda ");
        		
        	}else {
        		
        		System.out.println("Empates esta ronda");
        	}
        	
        }
		
        if(Puntos_usuario>Puntos_ordenador) {
        	
        	System.out.println("EL USUARIO HA GANADO LA PARTIDA");
        	
        } else if (Puntos_usuario<Puntos_ordenador){
        	
        	System.out.println("EL ORDENADOR HA GANADO LA PARTIDA");
        	
        }else {
        	
        	System.out.println("EMPATE ENTRE USUARIO Y ORDENADOR");
        	
        }
		
		
		
	}

}
