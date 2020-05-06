package Unidad_5;

import java.time.LocalDate;

public class Prueba_animal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Animal perro= new Animal ("Bobby");
		
		
		System.out.println(perro.toString());
		
        LocalDate fecha_nacimiento=LocalDate.parse("2007-12-03");
		
		
		Animal gato= new Animal ("Mimu", fecha_nacimiento);
		
		System.out.println(gato.toString());
		
	}

}
