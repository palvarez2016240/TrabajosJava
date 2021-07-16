public class Operaciones{

	public void Operaciones(){
		
		Operaciones o=new Operaciones();
		IngresarTexto oT=new IngresarTexto();
		int numero1=0;
		int numero2=0;
		int total=0;
		
		
		System.out.println("Ingrese el primer valor a sumar");
		numero1=Integer.parseInt(oT.texto());
		System.out.println("Ingrese el segundo valor a sumar");
		numero2=Integer.parseInt(oT.texto());
		
		
		total=o.suma(numero1,numero2);
		System.out.println("El resultado de la suma es:   "  + total);
		
	}	

}