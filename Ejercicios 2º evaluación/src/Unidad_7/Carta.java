package Unidad_7;

public class Carta implements Comparable <Carta>{

	private Rango rango;
	
	private Palo palo;
	
	private int valor;

	public Carta(Rango rango, Palo palo, int valor) {
		
		this.rango = rango;
		this.palo = palo;
		this.valor = valor;
	}
	
        public Carta(Rango rango, Palo palo) {
		
		this.rango = rango;
		this.palo = palo;
		this.valor=rango.ordinal()+1;
	}

		

	

		@Override
		public int compareTo(Carta o) {
			// TODO Auto-generated method stub
			if(this.valor>o.valor) {
				return 1;
			}else if(this.valor<o.valor) {
				return-1;
			}else {
				return 0;
			}
		}

		@Override
		public String toString() {
			return "["+rango+"-"+palo+"]";
		}

		public int getValor() {
			return valor;
		}

		public void setValor(int valor) {
			this.valor = valor;
		}

		
	
	
	
	
	
}
