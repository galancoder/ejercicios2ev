package Unidad_5;

import java.util.ArrayList;
import java.util.List;

public class Prueba_libro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Autor> escritores= new ArrayList<Autor>();
		
		escritores.add(new Autor("Pedro","pedro@hotmail.com",Genero.MASCULINO));
		
		escritores.add(new Autor("Marcos","marcos@hotmail.com",Genero.MASCULINO));
		
		escritores.add(new Autor("Monica","monica@hotmail.com",Genero.FEMENINO));

		List<Autor> escritores_2= new ArrayList<Autor>();
		
		escritores_2.add(new Autor("Santiago","pedro@hotmail.com",Genero.MASCULINO));
		
		
		Libro Libro_1= new Libro("La sombra del crimen",escritores,13.2f);
		
		Libro Libro_2= new Libro("La montaña misteriosa",escritores_2,15.28f,25);
		
		System.out.println(Libro_1.toString());
		
		System.out.println(Libro_2.toString());
		
		
		
		
		
	}

}
