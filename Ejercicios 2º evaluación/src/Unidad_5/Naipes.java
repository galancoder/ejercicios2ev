package Unidad_5;

public class Naipes {


    private Palo palo;
    
    private Rango rango;
    
    private int valor;
    
    public Naipes(Palo palo,Rango rango,int valor) {
    	
    this.palo=palo;
        
    this.rango=rango;
        
    this.valor=valor;
    	
    }
	
    
    public Naipes(Palo palo,Rango rango) {
    	
    this.palo=palo;
        
    this.rango=rango;
        
    this.valor=valor;
    	
    }

    

	public Palo getPalo() {
		return palo;
	}


	public Rango getRango() {
		return rango;
	}


	public int getValor() {
		return valor;
	}


	@Override
	public String toString() {
		return "[palo=" + palo + ", rango=" + rango + ", valor=" + valor + "]\n";
	}
	


}
