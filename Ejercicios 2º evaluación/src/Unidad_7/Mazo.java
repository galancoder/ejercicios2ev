package Unidad_7;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;

public class Mazo {

	private ArrayList<Carta> mazo=new ArrayList();

	@Override
	public String toString() {
		return "Mazo [mazo=" + mazo + "]";
	}

	public Mazo(int n) {
		
		for(int i=1;i<=n;i++) {
		
		for(Palo p:Palo.values()) {
			
			for(Rango r:Rango.values()) {
				
				this.mazo.add(new Carta(r,p));
				
			}
		}
		}
	}

	public ArrayList<Carta> getMazo() {
		return this.mazo;
	}

	public Mazo() {
for(Palo p:Palo.values()) {
			
			for(Rango r:Rango.values()) {
				
				this.mazo.add(new Carta(r,p));
				
			}
		}
	}
	
	public Carta get() {
		Random generador= new Random();
		
		return mazo.get(generador.nextInt(mazo.size()));
	
		
	}
	
	public Carta  remove() {
		Random generador= new Random();
		
		return mazo.remove(generador.nextInt(mazo.size()));
	}
	
	
	public void add(Carta carta) {
		
		mazo.add(carta);
		
	}
	
	public void addAll(Collection<Carta> coleccion ) {
		mazo.addAll(coleccion);
	}
	
	public void barajar() {
		
		Collections.shuffle(mazo);
		
	}
	
	
}
