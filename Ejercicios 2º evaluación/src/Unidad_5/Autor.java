package Unidad_5;

public class Autor {
	
	private String nombre;
	
	private String email;
	
	private Genero genero;
	
	
	

	public Autor(String nombre, String email, Genero genero) {

		this.nombre = nombre;
		this.email = email;
		this.genero = genero;
	}

	
	


	







	public String getNombre() {
		return nombre;
	}













	public String getEmail() {
		return email;
	}













	public Genero getGenero() {
		return genero;
	}













	public void setEmail(String email) {
		this.email = email;
	}













	@Override
	public String toString() {
		return  nombre + " (" + email +") "+genero;
	}




}
