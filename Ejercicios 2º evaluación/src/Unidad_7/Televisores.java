package Unidad_7;

public class Televisores {

	float tama�o;
	
	Sintonizador sintonizador;

	public Televisores(float tama�o, Sintonizador sintonizador) {
		super();
		this.tama�o = tama�o;
		this.sintonizador = sintonizador;
	}
	
	public Televisores() {
		super();
		this.tama�o = 20;
		this.sintonizador = Sintonizador.SINTONIZADOR_B;
	}

	public float getTama�o() {
		return tama�o;
	}

	public Sintonizador getSintonizador() {
		return sintonizador;
	}

	public void setTama�o(float tama�o) {
		this.tama�o = tama�o;
	}

	public void setSintonizador(Sintonizador sintonizador) {
		this.sintonizador = sintonizador;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((sintonizador == null) ? 0 : sintonizador.hashCode());
		result = prime * result + Float.floatToIntBits(tama�o);
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
		if (Float.floatToIntBits(tama�o) != Float.floatToIntBits(other.tama�o))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Televisores [tama�o=" + tama�o + ", sintonizador=" + sintonizador + super.toString();
	}
	
	
}
