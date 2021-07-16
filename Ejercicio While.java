public class While{ 
  public static void main(String args[]){

	 System.out.println("............Menu...........");
	 System.out.println("Tabla del 2...............1");
	 System.out.println("Tabla x cant. hasta n.....2");
	 System.out.println("Fibonacci.................3");
	 
	 int opcion = 2;
	 
	 switch (opcion){
		 case 1 :
		 int a = 0;
		 int resultado = 0;
		 while (a<10){
			 a++;
		  resultado = 2 * a; 
			 System.out.println(2 + "*" + a + "=" + resultado);
		 }
		 break;
		 
		 case 2 :
		 System.out.println("Que numero quiere multiplicar y hasta donde");
		int num1 = 5;
		int num2 = 15;
		int b = 0;
		int t = 0;
		while (b != num2){
			b++;
            t = num1*b;
            System.out.println(num1 + "*" + b + "=" + t);
		}
         break;	

		case 3 :
		 int veces = 10;	
		int o = 0;
		int d = 0;
		int i = 1;
		System.out.println("Cuantas veces desea que se repita");
	    System.out.println(d);
		System.out.println(i);
        while (o < veces){
			o++;
			int s = d + i;
				 System.out.println(s);
				 d = i;
				 i = s ;
		}
			break;
	 }
	 
 }
}