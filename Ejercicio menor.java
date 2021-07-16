public class menor{ 
  public static void main(String args[]){

   int  numero1   = 20;
   int  numero2   = 15;
   int  numero3   = 10;   

   if(numero1 < numero2 & numero1 < numero3){
     System.out.println("El menor es " + numero1);
  }if(numero2 < numero1 & numero2 < numero3){
     System.out.println("El menor es " + numero2);
  }if(numero3 < numero1 & numero3 < numero2){
     System.out.println("El menor es " + numero3);
  }                  
 }
}