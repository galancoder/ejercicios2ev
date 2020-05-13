package unidad6.Excepciones;

public class Ejercicio_1 {
	

	
	static public boolean isInt(String n) {
		
		try {
			Integer.parseInt(n);
			return true;
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			return false;
			
		}		
	}
     static public boolean isDouble(String n) {
		
		try {
			Double.parseDouble(n);
			return true;
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			return false;
			
		}		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(Ejercicio_1.isInt("sdfs"));
System.out.println(Ejercicio_1.isInt("3"));
System.out.println( Ejercicio_1.isDouble("3.23"));
System.out.println(Ejercicio_1.isInt("3"));

		
	
	  
		
		
	}

}
