package Unidad_7;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Prueba_Electrodomesticos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Electrodomesticos lavadora= new Lavadoras (2000,color.BLANCO,Consumo.C,400,Carga.CUATRO);
		
		Electrodomesticos lavadora_2= new Lavadoras (2000,color.BLANCO,Consumo.C,400,Carga.CUATRO);
		
		Electrodomesticos frigorifico= new Figorificos(200, color.NEGRO, Consumo.C, 50, true);
		
		Electrodomesticos televisor= new Televisores (300, color.ROJO, Consumo.E, 12);
		
		Set<Electrodomesticos> coleccion= new TreeSet();
		
		coleccion.add(lavadora);
		coleccion.add(frigorifico);
		coleccion.add(televisor);
		coleccion.add(lavadora_2);
		
		
		
		
		
		//enviamos objeto
		
		try {
			
			ObjectOutputStream escribir= new ObjectOutputStream(new FileOutputStream(new File("c:/OBJETOS.dat")));
			
			escribir.writeObject(coleccion);
			
				
			
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
	}

}
