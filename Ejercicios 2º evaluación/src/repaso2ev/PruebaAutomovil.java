package repaso2ev;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class PruebaAutomovil {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada= new Scanner (System.in);
		
		Map<String,Automovil> coches= new TreeMap<String,Automovil>();
		
		int N=Integer.parseInt(entrada.nextLine());
		
		System.out.println(N);
		
		for(int i=1;i<=N;i++) {
			
			String modelo=entrada.next();
			float capacidad_deposito=Float.valueOf(entrada.next());
			float cantidad_deposito=Float.valueOf(entrada.next());
			float consumo=Float.valueOf(entrada.next());
			
			
			Automovil coche= new Automovil(modelo,capacidad_deposito,cantidad_deposito,consumo);
			
			coches.put(modelo, coche);
		}
		
		
		while((entrada.next()).equals("End")==false) {
			
			
		String modelo=entrada.next();
		
		float kms_desplazados=Float.valueOf(entrada.next());
		
		
			
        if(coches.get(modelo).desplazar(kms_desplazados)==true){
		
		System.out.println(modelo+" "+coches.get(modelo).getCantidad_deposito()+" "+kms_desplazados*coches.get(modelo).getConsumo_por_km());
		
		
		}else{
		
		 System.out.println("Combustible insuficiente para este desplazamiento");
		
		}
}
		
          
		
	    System.out.println("------------------------");
	    
	    System.out.println(coches);
		
	}

}
