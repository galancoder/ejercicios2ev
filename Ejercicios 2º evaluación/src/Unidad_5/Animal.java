package Unidad_5;

import java.time.LocalDate;

public class Animal {

	private String nombre;
	
	private LocalDate fecha;
	
	public Animal(String nombre,LocalDate fecha ) {
		
		this.fecha=fecha;
		this.nombre=nombre;
		
		
	}
	
public Animal(String nombre ) {
	   this(nombre,LocalDate.now());		
	}

public String getNombre() {
	return nombre;
}

public LocalDate getFecha() {
	return fecha;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public void setFecha(LocalDate fecha) {
	this.fecha = fecha;
}

@Override
public String toString() {
	return "Nombre: "+ this.getNombre()+" Edad: "+(LocalDate.now().getYear()-this.getFecha().getYear());
}
	
	
	
}
