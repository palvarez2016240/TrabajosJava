import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class IngresarTexto{
	
	
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

+