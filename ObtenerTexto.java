import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class ObtenerTexto{
	
	
	BufferedReader entrada=new BufferedReader(new InputStreamReader(System.in));
	String dato=null;
	
	public String texto(){
		
	 try{		 
	    dato=entrada.readLine(); 		 
	 }catch(IOException e){
		 System.out.println("Error de entrada");
		 System.exit(1);
	 }
	
	  return dato;
	}
	
	public int obtenerEntero(){
		int numero=0;
		String dato=null;
		try{
			dato=entrada.readLine();
			
			numero=Integer.parseInt(dato);
		}catch(IOException ioe){
			System.out.println("Error de entrada");
			System.exit(1);
		}
		return numero;
		
	}

}