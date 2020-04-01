package repaso2ev;

public class Matrices {
	
	static int[][] cuadrada1 (int dim){
		
     int cuenta=1;
		
		int[][] matriz= new int[dim][dim];
		
		for(int i=0;i<dim;i++) {
			for(int j=0;j<dim;j++) {
				matriz[i][j]=cuenta;
				cuenta++;
			}
			
		}
		
		for(int i=0;i<dim;i++) {
			for(int j=0;j<dim;j++) {
				System.out.print(matriz[j][i]+" ");
		}
			System.out.println();
		
		
		
	}
		return matriz;
		
		
	}
	
    static int [][] cuadrada2(int dim){
    	
    	 int cuenta=1;
			
			int[][] matriz= new int[dim][dim];
			
			for(int i=0;i<dim;i++) {
				if(i%2==0) {
					
					
				for(int j=0;j<dim;j++) {
					matriz[i][j]=cuenta;
					cuenta++;
				}
				
			}else {
				for(int j=dim-1;j>=0;j--) {
					matriz[i][j]=cuenta;
					cuenta++;
				}
				
				
			}
			
			}
			
			for(int i=0;i<dim;i++) {
				for(int j=0;j<dim;j++) {
					System.out.print(matriz[j][i]+" ");
			}
				System.out.println();
			
			
			
		}
			return matriz;
			
    	
    	
    }
    
    
   static String [][] palindromos(int c, int f){
	   
	   
	   if((c | f)<1 || (c | f)>26 ) {
		   
		   return null;
	   } 
	   else {

		char letra='a';
		
		char letra2='a';
		
		
		String [][] matriz = new String[f][c];
		
		for(int i=0;i<f;i++) {
			
			letra2=letra;
			
			for(int j=0;j<c;j++) {
				
				matriz[i][j]=String.valueOf(letra)+String.valueOf(letra2)+String.valueOf(letra);
				
				letra2++;
			}
			
			letra++;
		}
		
         for(int i=0;i<f;i++) {
			
			for(int j=0;j<c;j++) {
				
				System.out.print(matriz[i][j]+" ");
				
				
			}
			
			System.out.println();
			
			
		}
		return matriz;
	   
	   
	   }
	   
   }

   
   static int max3x3sum(int [][] matriz) {
	   
	  
	   
	   int suma_maxima=0;
	   
	   //INICIALMENTE LA SUMA MAXIMA SERÁ LA DE LA PRIMERA SUBMATRIZ 3X3
	   
	   for(int i=0;i<3;i++) {
			
			for(int j=0;j<3;j++) {
				
				suma_maxima=matriz[i][j];
				
			}
			
		}
	    
		
		
		for(int i=0;i<=matriz.length-3;i++) {
			
			for(int j=0;j<matriz[0].length-3;j++) {
				
				int suma=0;
				
				for(int f=i;f<=i+2;f++) {
					
					for(int c=j;c<=j+2;c++) {
						
						suma+=matriz[f][c];
						
					}
					
				}
				if (suma>suma_maxima) {
					suma_maxima=suma;
				}
			}
			
			
			
		}
		
		return suma_maxima;
				
		
				
			
			
		
		}		
			
	   
	   
   
    
   
		
		
	}


