package repaso2ev;

public class Automovil {

	private String modelo;
	
	private float capacidad_deposito;
	
	private float cantidad_deposito;
	
	private float consumo_por_km;
	
	private float kms_recorridos;
	
	private float consumo_total_combustible;
	


	public Automovil(String modelo, float capacidad_deposito, float cantidad_deposito, float consumo_por_km) {
		
		this.modelo = modelo;
		this.capacidad_deposito = capacidad_deposito;
		this.cantidad_deposito = cantidad_deposito;
		this.consumo_por_km = consumo_por_km;
		kms_recorridos=0;
		
		
	}


	public Automovil(String modelo, float capacidad_deposito, float consumo_por_km) {
		this.modelo = modelo;
		this.capacidad_deposito = capacidad_deposito;
		this.consumo_por_km = consumo_por_km;
		cantidad_deposito=capacidad_deposito;
		kms_recorridos=0;
		
		
	}


    public boolean llenarDeposito() {
    	
    	cantidad_deposito=capacidad_deposito;
    	
    	return true;
    	
    }
    
    
    public float llenarDeposito(float cantidad_a_rellenar) {
    	
    	if((cantidad_deposito+cantidad_a_rellenar)<=capacidad_deposito) {
    		
    		cantidad_deposito=cantidad_deposito+cantidad_a_rellenar;
    		
    		return 0;
    		
    	}else {
    		
    		float sobrante=cantidad_deposito+cantidad_a_rellenar-capacidad_deposito;
    		
    		cantidad_deposito=capacidad_deposito;
    		
    		return sobrante;
    		
    	}
		
    	
    	
    }


    public boolean desplazar(float kms_a_recorrer) {
    		
    	
    	if(cantidad_deposito>=(kms_a_recorrer*consumo_por_km)) {
    		
    		cantidad_deposito=cantidad_deposito-(kms_a_recorrer*consumo_por_km);
    		
    		kms_recorridos+=kms_a_recorrer;
    		
    		consumo_total_combustible+=kms_a_recorrer*consumo_por_km;
    		
    		return true;
    		
    	}else {
    		return false;
    	}
		
    	
    }



    
    
    
    @Override
	public String toString() {
    	
		return modelo + " "+ cantidad_deposito + " "+ kms_recorridos+" "+consumo_total_combustible ;
	}


	public String getModelo() {
		return modelo;
	}


	public float getCapacidad_deposito() {
		return capacidad_deposito;
	}


	public float getCantidad_deposito() {
		return cantidad_deposito;
	}


	public float getConsumo_por_km() {
		return consumo_por_km;
	}


	public float getKms_recorridos() {
		return kms_recorridos;
	}


	public float getConsumo_total_combustible() {
		return consumo_total_combustible;
	}



    
    
   








	
}
