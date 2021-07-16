public class Usuario{
	
		ObtenerTexto oT=new ObtenerTexto();
		Login Lg=new Login();
		
	public void Usuario1(){
		
		int repet = 1;
		
	    System.out.println("                            ");
		System.out.println("Bienvenido!!!");
		
	while (repet == 1){
			
		System.out.println("                            ");
		System.out.println("............Menu............");
		System.out.println("Trabajos Pendientes........1");
		System.out.println("Mensaje al jefe............2");
		System.out.println("Mensaje a tus compañeros...3");
		System.out.println("Renunciar..................4");
		int opcion1=Integer.parseInt(oT.texto());
		
		switch (opcion1){
			
			case 1: 
			 
			 System.out.println("                          ");
			 System.out.println("Lavar los baños");
			 break;
			
			case 2: 
			System.out.println("                            ");
			 System.out.println("El jefe no esta disponible");
			 break;
			 
			case 3:
			System.out.println("                            ");
			 System.out.println("No tienes amigos, les caes mal");
			 break;
			 
			 case 4:
			 System.out.println("                            ");
			 System.out.println("No puedes renunciar, eres un trabajador de por vida y sin sueldo");
		}
		
		System.out.println("                            ");
		System.out.println("Hacer otra accion...........1");
		repet=Integer.parseInt(oT.texto()); 
	}	
  }	
}