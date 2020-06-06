package Unidad_7;

public class Prueba_Electrodomesticos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Electrodomesticos lavadora= new Lavadoras (2000,color.GRIS,Consumo.C,400,Carga.TRECE);
		
		System.out.println(lavadora.toString());
		
		System.out.println(lavadora.getPrecio_final());
		
		
		
	}

}
