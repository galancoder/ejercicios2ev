package Unidad_5;

public class Prueba_Autor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Autor Pedro= new Autor("Pedro","pedro@hotmail.com",Genero.MASCULINO);
		
		Autor Marta= new Autor("Marta","Marta@hotmail.com",Genero.FEMENINO);
		
		System.out.println(Pedro.toString() + "\n" + Marta.toString());
		
		//CAMBIAMOS EL EMAIL DE PEDRO Y MARTA
		
		Pedro.setEmail("nuevo_email_pedro@hotmail.com");
		
		Marta.setEmail("nuevo_email_Marta@hotmail.com");
		
		//COMPROBAMOS QUE SE APLICO EL CAMBIO
		
		System.out.println("Nuevo email "+Pedro.getNombre()+": "+Pedro.getEmail() + "\n" +"Nuevo email "+Marta.getNombre()+": "+ Marta.getEmail());
		
		
	}

}
