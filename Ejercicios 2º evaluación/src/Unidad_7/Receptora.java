package Unidad_7;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Receptora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			
			
			
			ObjectInputStream lector= new ObjectInputStream(new FileInputStream("c:/OBJETOS.dat"));
			
			boolean EOF=false;
			
			while (!EOF) {
				
				try {
					
					ArrayList<Electrodomesticos> objeto= (ArrayList<Electrodomesticos>) lector.readObject();
					
					
		
					System.out.println(objeto);
					
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (EOFException ex) {
					EOF=true;
					System.out.println("Final del archivo");
				}
			}
			
			System.out.println("Seguimos con el programa");
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
}
