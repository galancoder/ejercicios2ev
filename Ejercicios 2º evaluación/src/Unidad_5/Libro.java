package Unidad_5;

import java.util.List;
import java.util.Set;

public class Libro {

	
	String titulo;
	
	List<Autor> autores;
	
	float precio;
	
	int stock;

	public Libro(String titulo, List<Autor> autores, float precio) {
	
		this.titulo = titulo;
		this.autores = autores;
		this.precio = precio;
		
	}

	public Libro(String titulo, List<Autor> autores, float precio, int stock) {
		this(titulo,autores,precio);
		this.stock = stock;
	}

	public String getTitulo() {
		return titulo;
	}

	public List<Autor> getAutores() {
		return autores;
	}

	public float getPrecio() {
		return precio;
	}

	public int getStock() {
		return stock;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	@Override
	public String toString() {
		return titulo + " ("+autores.toString()+") precio "+precio+"€ - "+stock+" unidades en stock";
	}
	
	
	
	
}
