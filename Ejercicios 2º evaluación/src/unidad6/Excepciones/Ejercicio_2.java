package unidad6.Excepciones;

import java.util.Arrays;

public class Ejercicio_2 {

	
	public static double[] resolver_ecuacion (double A,double B,double C) throws IllegalArgumentException,ArithmeticException{
			
		double [] soluciones= new double[2];
		
		if(A==0) {
			
			throw new IllegalArgumentException();
		}
		if((Math.pow(B, 2)-4*A*C)<0) {
			
			throw new ArithmeticException();
		}
		
		soluciones[0]=(-B+Math.sqrt(Math.pow(B, 2)-4*A*C))/2*A;
		soluciones[1]=(-B-Math.sqrt(Math.pow(B, 2)-4*A*C))/2*A;
		
		
		return soluciones;
		

			
		
	}
	

	
	public static void main(String[] args)  {
		// TODO Auto-generated method stub

		
		try {
			
			resolver_ecuacion(0,-2,5);
			
			//resolver_ecuacion(2,-7,3);
			
			//resolver_ecuacion(1,-2,5);
			
			
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			System.out.println("No es una ecuación de segundo grado");
		} catch (ArithmeticException e) {
			// TODO Auto-generated catch block
			System.out.println("la ecuación no tiene una solución real");
		}
	
		
		

		
		
		
	}

}
