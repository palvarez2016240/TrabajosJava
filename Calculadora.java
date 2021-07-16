public class calculadora{ 
  public static void main(String args[]){

   //Para sumar 1, para restar 2, para multiplicar 3, parqa dividir 4. 

   int  numero1   = 30;
   int  numero2   = 15;
   int  signo     = 2;
   int  resultado = 0;   

   if(signo == 1){
     resultado = numero1 + numero2;
     System.out.println("El resultado es " + resultado);
   }if(signo == 2){
     resultado = numero1 - numero2;
     System.out.println("El resultado es " + resultado);
  }if(signo == 3){
     resultado = numero1 * numero2;
     System.out.println("El resultado es " + resultado);
  }if(numero2 == 0 ){ 	
     System.out.println("ERROR");
  }if(signo == 4 ){ 	
     resultado = numero1 / numero2;
     System.out.println("El resultado es " + resultado);
  }     
 }
}