package unidad6.Excepciones;

/*Se ejecuta el metodo main, en el cual se van llamando progresivamente los metodos A B C D
  En el método D se declara un array y se le intenta asignar una posición mayor de las que posee.
  
  Esto produce una excepcion (ArrayIndexOutOfBoundsException) que el metodo D no es capaz de atrapar
  ya que tiene un bloque catch que gestiona ClassCastException, por tanto se ejecuta el bloque finally del metodo D.
  
  De forma analoga, el metodo C  no puede gestionar la excepcion ya que tiene un bloque catch que gestiona NumberFormatException,
  por tanto se ejecuta el bloque finally del metodo C.
  
  Es en el metodo C en el cual se incluye un bloque catch que gestiona las excepciones ArrayIndexOutOfBoundsException, en el cual la excepción
  es gestionada correctamente y se sigue el flujo normal
  
 * 
 * */




public class Ejercicio4 {
	public static void main(String[] args) {
		try {
		System.out.println("Antes de metodoA");
		metodoA();
		System.out.println("Despues de metodoA");
		} catch (Exception e) {
		System.out.println("main: " + e);
		} finally {
		System.out.println("main: finally");
		}
		}
		public static void metodoA() {
		try {
		System.out.println("Antes de metodoB");
		metodoB();
		System.out.println("Despues de metodoB");
		} catch (Exception e) {
		System.out.println("metodoA: " + e);
		} finally {
		System.out.println("metodoA: finally");
		}
		}
		public static void metodoB() {
		try {
		System.out.println("Antes de metodoC");
		metodoC();
		System.out.println("Despues de metodoC");
		} catch (ArrayIndexOutOfBoundsException e) {
		System.out.println("metodoB: " + e);
		} finally {
		System.out.println("metodoB: finally");
		}
		}
		public static void metodoC() {
		try {
		System.out.println("Antes de metodoD");
		metodoD();
		System.out.println("Despues de metodoD");
		} catch (NumberFormatException e) {
		System.out.println("metodoC: " + e);
		} finally {
		System.out.println("metodoC: finally");
		}
		}
		public static void metodoD() {
		try {
		int a[] = new int[4];
		a[a.length] = a.length;
		} catch (ClassCastException e) {
		System.out.println("metodoD: " + e);
		} finally {
		System.out.println("metodoD: finally");
		}
		}
}
