public class ParImpar{ 
  public static void main(String args[]){

   int numero1   = 15;
   int resultado = 0;
   	
   resultado = numero1 % 2;

   if(resultado == 0){
     System.out.println("El numero " + numero1 + " es par");
  } if(resultado == 1){
     System.out.println("El numero " + numero1 + " es impar");
  }                   
 }
}