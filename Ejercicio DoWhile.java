public class DoWhile{ 
  public static void main(String args[]){

	 System.out.println("............Menu...........");
	 System.out.println("Tabla del 2...............1");
	 System.out.println("Tabla x cant. hasta n.....2");
	 System.out.println("Fibonacci.................3");
	 
	   int opcion = 3;
	   
	   switch (opcion) {
		   case 1 :
		    int a = 0;
		    int resultado = 0;
			do {
				 a++;
		         resultado = 2 * a; 
			     System.out.println(2 + "*" + a + "=" + resultado);
			}
			while (a<10);
			break;
			
			case 2 :
			System.out.println("Que numero quiere multiplicar y hasta donde");
		    int num1 = 3;
		    int num2 = 20;
		    int b = 0;
		    int t = 0;
			do {
				b++;
                t = num1*b;
                System.out.println(num1 + "*" + b + "=" + t);
			}
			while (b != num2);
			break;
			
			case 3 :
			int veces = 15;	
			int o = 0;
			int d = 0;
			int i = 1;
			System.out.println("Cuantas veces desea que se repita");
			System.out.println(d);
			System.out.println(i);
			do {
				o++;
				int s = d + i;
				 System.out.println(s);
				 d = i;
				 i = s ;
			}
			while (o < veces);
			break;
	   }
	 
	 }
}	 