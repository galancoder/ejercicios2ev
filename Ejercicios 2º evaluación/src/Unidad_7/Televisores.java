package Unidad_7;

public class Televisores {

	float tamaño;
	
	Sintonizador sintonizador;

	public Televisores(float tamaño, Sintonizador sintonizador) {
		super();
		this.tamaño = tamaño;
		this.sintonizador = sintonizador;
	}
	
	public Televisores() {
		super();
		this.tamaño = 20;
		this.sintonizador = Sintonizador.SINTONIZADOR_B;
	}

	public float getTamaño() {
		return tamaño;
	}

	public Sintonizador getSintonizador() {
		return sintonizador;
	}

	public void setTamaño(float tamaño) {
		this.tamaño = tamaño;
	}

	public void setSintonizador(Sintonizador sintonizador) {
		this.sintonizador = sintonizador;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((sintonizador == null) ? 0 : sintonizador.hashCode());
		result = prime * result + Float.floatToIntBits(tamaño);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Televisores other = (Televisores) obj;
		if (sintonizador != other.sintonizador)
			return false;
		if (Float.floatToIntBits(tamaño) != Float.floatToIntBits(other.tamaño))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Televisores [tamaño=" + tamaño + ", sintonizador=" + sintonizador + super.toString();
	}
	
	
}
