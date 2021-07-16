public class Administrador{
	
		ObtenerTexto oT=new ObtenerTexto();
		Login Lg=new Login();
		
     public void Administrador1(){
		
		int repet = 1;
		
	    System.out.println("                            ");
		System.out.println("Bienvenido administrador");
		
	while (repet == 1){
			
		System.out.println("                            ");
		System.out.println("............Menu..............");
		System.out.println("Trabajos Pendientes..........1");
		System.out.println("Hablar con el dueño..........2");
		System.out.println("Mensaje a tus trabajadores...3");
		System.out.println("Ver tus trabajadores.........4");
		int opcion1=Integer.parseInt(oT.texto());
		
		switch (opcion1){
			
			case 1: 
			 
			 System.out.println("                          ");
			 System.out.println("Mandar a los trabajadores a lavar los baños");
			 break;
			
			case 2: 
			System.out.println("                            ");
			 System.out.println("El dueño te espera hoy a la 15:00 hrs.");
			 break;
			 
			case 3:
			System.out.println("                            ");
			 String mensaje=(oT.texto());
			 break;
			 
			 case 4:
			 System.out.println("                            ");
			 System.out.println("Los trabajadores son: " );
		}
		
		System.out.println("                            ");
		System.out.println("Hacer otra accion...........1");
		repet=Integer.parseInt(oT.texto()); 
	}	
  }	
}