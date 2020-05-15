package unidad6.Excepciones;


	import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
	public class Ejercicio_6 {
	Ejercicio_6 e = new Ejercicio_6();
	public static void main(String[] args) {
		
	Scanner in = new Scanner(System.in);
	String opcion;
	while (!(opcion = in.next()).equalsIgnoreCase("fin"))
		try {
			lanzarExcepcion(Integer.parseInt(opcion));
		} catch (ArithmeticException  e) {
			// TODO Auto-generated catch block
			System.out.println("Se trata de una excepcion:"+e.getClass());
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO Auto-generated catch block
			System.out.println("Se trata de una excepcion:"+e.getClass());
		} catch ( FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Se trata de una excepcion:"+e.getClass());
		} catch (NullPointerException e) {
			// TODO Auto-generated catch block
			System.out.println("Se trata de una excepcion:"+e.getClass());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Se trata de una excepcion:"+e.getClass());
		} 
	   
	in.close();
	}
	static void lanzarExcepcion(int opcion) throws Exception {
	switch (opcion) {
	case 1:
	System.out.println(1 / 0);
	break;
	case 2:
	int [] a = new int[10];
	a[a.length] = a.length;
	break;
	case 3:
	FileInputStream in = new FileInputStream("este fichero no existe");
	break;
	case 4:
	Object o = null;
	System.out.println(o.toString());
	break;
	case 5:
	Ejercicio_6 e = new Ejercicio_6();
	break;
	default:
	Class.forName("UnaClase");
	}
	}
	}

