package Unidad_5;

import java.util.Arrays;

public class Hucha {
	
	
	// posicion 0 representa 50€
	// posicion 1 representa 20€
	// posicion 2 representa 10€
	// posicion 3 representa 5€
	// posicion 4 representa 2€
	// posicion 5 representa 1€
	
	private int[] billetes= new int [6];
	
	private int contenido_hucha=0;
	
	private boolean abierta=false;
	
	private String contraseña="";
	
	
	public Hucha () {
			
			this.contenido_hucha=0;	
		}
		
	public Hucha (int euros) {
			
			contenido_hucha=euros;
			
			
		}
		
	public void put (int euros) {
			
		 if(abierta) {
			 contenido_hucha+=euros;
			while(euros!=0){
			
				if (euros>=50) {
				    billetes[0]+=euros/50;
				    euros=euros%50;
				   
				} else if (euros>=20) {
					 billetes[1]+=euros/20;
					    euros=euros%20;
					   
				} else if (euros>=10) {
					 billetes[2]+=euros/10;
					    euros=euros%10;
					
				} else if (euros>=5) {
					 billetes[3]+=euros/5;
					    euros=euros%5;
								
				}else if (euros>=2) {
					 billetes[4]+=euros/2;
					    euros=euros%2;
								}
				else if (euros>=1) {
					 billetes[5]+=euros/1;
					    euros=euros%1;
						}
				
			}
			
		 }
		}
	    
	public void abrir (String password) {
			
			if (password.equals(contraseña)) {
				
				abierta=true;
			
			}}
				
	public void cerrar (String password) {
					
					if (password.equals(contraseña)) {
						
						abierta=false;	}
			
			
		}
		
	public void cambiar_contraseña(String contraseña_vieja,String contraseña_nueva) {
		
		if(contraseña_vieja.equals(contraseña)) {
			
			contraseña=contraseña_nueva;
			
			
		}
		
		
		
	}
	
    public void retirar(int cincuenta,int veinte,int diez,int cinco,int dos,int uno) {
    	
    	
    	
    	
    }







	@Override
	public String toString() {
		
		return "La hucha almacena un total de "+contenido_hucha+"€"+"\n"
				+billetes[0]+ " billetes de 50€\n"
				+billetes[1]+ " billetes de 20€\n"
				+billetes[2]+ " billetes de 10€\n"
				+billetes[3]+ " billetes de 5€\n"
				+billetes[4]+ " billetes de 2€\n"
				+billetes[5]+ " billetes de 1€\n";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Hucha alcancia= new Hucha();
		alcancia.cambiar_contraseña("", "123");
		alcancia.abrir("123");
		alcancia.put(258);
		
		System.out.println(alcancia.toString());
		
		
		
	}

}
