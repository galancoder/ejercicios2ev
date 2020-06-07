package Unidad_7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Blackjack {
	
	Mazo baraja= new Mazo();

	ArrayList<Carta> cartas_jugador= new ArrayList();
	
	ArrayList<Carta> cartas_dealer= new ArrayList();
	
	boolean partida_en_curso=false;
	
	public void repartir() {
		
		
		
		if(!this.isPartida_en_curso()) {
	
		baraja.barajar();
		cartas_jugador.add(baraja.remove());
		cartas_jugador.add(baraja.remove());
		
		if(pasa_21(cartas_jugador)) {
			System.out.println("El jugador tiene: "+cartas_jugador);
			System.out.println("Tus cartas suman "+valor_de_cartas(cartas_jugador)+". Has perdido.");
			this.setPartida_en_curso(false);
		}else {
		
		cartas_dealer.add(baraja.remove());
		cartas_dealer.add(baraja.remove());
	
		System.out.println("El jugador tiene: "+cartas_jugador);
		System.out.println("El dealer tiene estas cartas "+cartas_dealer.get(0).toString()+" [OCULTA]");
		
		
		setPartida_en_curso(true);
		
		}
		
		}else {
			
			System.out.println("No se puede repartir, la mano esta en curso");
		}
		
	}

	public void setPartida_en_curso(boolean partida_en_curso) {
		this.partida_en_curso = partida_en_curso;
	}

	public boolean isPartida_en_curso() {
		return partida_en_curso;
	}
	
	public void menu() {
		
		BufferedReader in= new BufferedReader(new InputStreamReader(System.in));
		boolean continuar=true;
		String comando;
        while(continuar) {
		
		System.out.print("blackjack> ");
		
		try {
			comando=in.readLine().toLowerCase().trim();
			
			if(comando.matches("^(repartir\\s*|plantarse\\s*|pedir\\s*|fin\\s*)$")) {
				
				switch (comando) {
				
				case "repartir":
				    repartir();
				    break;
				case "plantarse":
					plantarse();
					 break;
				case "pedir":
					pedir();
				    break;
					
				case "fin":
					System.out.println("finalizando");
					continuar=false;
				    break;
				}
				
				
			}else {
				
				System.out.println("Comando invalido");
			}
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
        }
	}
	
	
	public void pedir() {
		
		if(this.isPartida_en_curso()) {
			
			cartas_jugador.add(baraja.remove());
			System.out.println("El jugador tiene: "+cartas_jugador);
		
			
			
			
			if(pasa_21(cartas_jugador)) {
				System.out.println("El jugador tiene: "+cartas_jugador);
				System.out.println("Tus cartas suman "+valor_de_cartas(cartas_jugador)+". Has perdido.");
				cartas_jugador.clear();
				cartas_dealer.clear();
				
				this.setPartida_en_curso(false);
			}
			
			
	}else {
		
		System.out.println("La partida no se ha iniciado");
	}
		
		
	}
	
	public int valor_de_cartas(ArrayList<Carta> cartas_participantes) {
        int valor_cartas=0;
		
		for(Carta c:cartas_participantes) {
			
			valor_cartas+=c.getValor();
		}
		
		return valor_cartas;
		
	}
	
	public boolean pasa_21 (ArrayList<Carta> cartas_participantes) {
		
		if(valor_de_cartas(cartas_participantes)>21) {
			
			return true;
		}else {
			return false;
		}
		
	}
	
	
	public void plantarse() {
		
		if(this.partida_en_curso) {
			dealer();
			
			if(pasa_21(cartas_dealer)) {

				System.out.println("El dealer tiene: "+cartas_dealer);
				System.out.println("Las cartas del dealer suman "+valor_de_cartas(cartas_dealer)+". Has ganado.");
				this.setPartida_en_curso(false);
				
			}else if(valor_de_cartas(cartas_dealer)>valor_de_cartas(cartas_jugador)) {
				
				System.out.println("El jugador tiene: "+cartas_jugador);
				System.out.println("Las cartas del jugador suman "+valor_de_cartas(cartas_jugador));
				System.out.println("El dealer tiene: "+cartas_dealer);
				System.out.println("Las cartas del dealer suman "+valor_de_cartas(cartas_dealer)+". Has perdido.");
				
				
				
			} else if(valor_de_cartas(cartas_dealer)<valor_de_cartas(cartas_jugador)) {
				
				System.out.println("El jugador tiene: "+cartas_jugador);
				System.out.println("Las cartas del jugador suman "+valor_de_cartas(cartas_jugador));
				System.out.println("El dealer tiene: "+cartas_dealer);
				System.out.println("Las cartas del dealer suman "+valor_de_cartas(cartas_dealer)+". Has ganando.");
			
			}else {
				System.out.println("El jugador tiene: "+cartas_jugador);
				System.out.println("Las cartas del jugador suman "+valor_de_cartas(cartas_jugador));
				System.out.println("El dealer tiene: "+cartas_dealer);
				System.out.println("Las cartas del dealer suman "+valor_de_cartas(cartas_dealer)+". Empate.");
				
			}
		
			cartas_jugador.clear();
			cartas_dealer.clear();
			
			this.setPartida_en_curso(false);
			
		}else {
			System.out.println("La partida no se ha iniciado");
		}
		
	}
	
	public void dealer() {
		
		
		
		
		while(this.valor_de_cartas(cartas_dealer)<16){
			
			cartas_dealer.add(baraja.remove());
			
		}
		

		
		
		
		
		
		
		
	}

	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Blackjack partida= new Blackjack();
		
	    
	     partida.menu();
			
		
		
		
		
	
		
		
		
	
		
		
		
	}

	

}
