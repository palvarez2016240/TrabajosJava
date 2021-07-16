public class For{ 
  public static void main(String args[]){

	 System.out.println("............Menu...........");
	 System.out.println("Tabla del 2...............1");
	 System.out.println("Tabla x cant. hasta n.....2");
	 System.out.println("Fibonacci.................3");
	 
	 int resultado = 0;
	 
	 int opcion = 1;
	 
	 int num1 = 0;
	 
	 int num2 = 0;
	 
	 int c = 0;
	 
	 int t = 0;
	 
	 int i = 1;

		switch (opcion){
			case 1: 
			for (int a=0; a<11; a++){
				resultado = 2 * a; 
			 System.out.println(2 + "*" + a + "=" + resultado);
			}
			break;
			
			case 2:
			System.out.println("Que numero quiere multiplicar y hasta donde");
			num1 = 9;
			num2 = 20;
			for (int d=0 ; d<num2; d++){
				c = c+1;
				
				t = num1*c;
				
				System.out.println(num1 + "*" + c + "=" + t);
				
			}
			break;
			
			case 3:
			System.out.println("Cuantas veces desea que se repita");
			 System.out.println(t);
			 System.out.println(i);
			 int veces = 10;
			 for (int o=1; o< veces; o++) {
				 int s = t + i;
				 System.out.println(s);
				 t = i;
				 i = s ;	
			 }
			 break;	
		}
    }
}