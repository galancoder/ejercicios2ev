package Unidad_5;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Mazo {
	
	private List<Naipes> mazo= new ArrayList<Naipes>();
	
	Random generador= new Random ();
	
	public Mazo (){
		
		for(Palo i:Palo.values()) {
			
			int valor=1;
			
			for (Rango j: Rango.values()){
				
				mazo.add(new Naipes(i,j,valor));
				valor++;
			}
			
		}
	}
	
	public Mazo(int n) {
		
		for(int p=1;p<=n;p++) {
			for(Palo i:Palo.values()) {
				
				int valor=1;
				
				for (Rango j: Rango.values()){
					
					mazo.add(new Naipes(i,j,valor));
					valor++;
				}
				
			}
			
		}
		
	}
	
    public ArrayList<Naipes> getMazo() {
    	
		return (ArrayList<Naipes>) mazo;
    	
    	
    }
	
	
    public Naipes get() {
    
    	return mazo.get(generador.nextInt(mazo.size()-1));
    }
    
    public Naipes remove() {
        
    	return mazo.remove(generador.nextInt(mazo.size()-1));
    }
    
    public void Mazo_add(Palo palo,Rango rango, int valor) {
        
    	mazo.add(new Naipes(palo,rango,valor));
    }
    
 
    public void Mazo_addAll(Mazo Baraja) {
     
 	this.mazo.addAll(Baraja.mazo);
 }

	


 
 
	
	

		
        
		
		
	

}
