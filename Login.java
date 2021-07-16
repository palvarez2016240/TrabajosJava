public class Login{
	
	ObtenerTexto oT=new ObtenerTexto();
	Usuario us=new Usuario();

	public void loginPrincipal(){
		
		int h= 0;
		int i= 0;
		int j= 0;
		int k= 0;
		
		String[] arreglo1u=new String[15];
		String[] arreglo1c=new String[15];
	    String[] arreglo2u=new String[5];
		String[] arreglo2c=new String[5];
		
		ObtenerTexto oT=new ObtenerTexto();
		
		int repe = 1;
		
		System.out.println(".......Bienvenido.......");
      while (repe == 1){
		System.out.println("Iniciar Sesion.........1");
		System.out.println("Registrarse............2");
		int opcion=Integer.parseInt(oT.texto());
		
		switch (opcion){
			
			case 1:
			System.out.println("Ingresar Usuario");
			String usua=(oT.texto()); 
			
			System.out.println("Ingresar Contraseña");
			String contra=(oT.texto());

				us.login();
			
		 break;
		
		   case 2:
		   System.out.println("Ingresar Nombre");
		   String a=(oT.texto()); 
		   System.out.println("Ingresar Apellido");
		   String b=(oT.texto()); 
		   System.out.println("Ingresar Edad");
		   String c=(oT.texto()); 
		   System.out.println("Ingresar carne");
		   String d=(oT.texto()); 
		   System.out.println("Usuario.........1");
		   System.out.println("Administrador...2");
		   int elec=Integer.parseInt(oT.texto()); 
		   
		   if (elec == 1) {
				
				h++;
				i++;
			    System.out.println("Su usario es " + a + d + "U"); 
				System.out.println("Escriba su contraseña");
				String contra1=(oT.texto()); 
				  System.out.println("Escriba su usario");
			      String usua1=(oT.texto()); 
			      System.out.println("Bienvenido!!");
				  
                    arreglo1c[h] = contra1;
		            arreglo1u[i] = usua1;				
				  
			}		
			
		   if (elec == 2) {
			   
				j++;
				k++;
			    System.out.println("Su usario es " +a+d+"A"); 
				System.out.println("Escriba su contraseña");
				String contra2 =(oT.texto()); 
				  System.out.println("Escriba su usario");
			      String usua2=(oT.texto()); 
			      System.out.println("Bienvenido!!");
				  
				    arreglo2c[j] = contra2;
		            arreglo2u[k] = usua2;
			}		 
		}
	  }	
	}
}
	