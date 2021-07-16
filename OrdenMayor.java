public class OrdenMayor{ 
  public static void main(String args[]){

   int  numero1   = 50;
   int  numero2   = 55;
   int  numero3   = 60;
   int  mayor1    =  0; 
   int  mayor2    =  0;   
   int  mayor3    =  0;   
  

   if(numero1 > numero2 & numero1 > numero3){
     mayor1 = numero1;
  }if(numero2 > numero3){
     mayor2 = numero2;
     mayor3 = numero3;                  
  }if(numero3 > numero2){
     mayor2 = numero3;
     mayor3 = numero2;                  
  } 

    if(numero2 > numero1 & numero2 > numero3){
      mayor1 = numero2;
    }if(numero1 > numero3){
      mayor2 = numero1;
      mayor3 = numero3;
   } if(numero3> numero1){
     mayor2 = numero3;
     mayor3 = numero1;                  
  }

     if(numero3 > numero1 & numero3 > numero2){
      mayor1 = numero3;
    }if(numero1 > numero2){
      mayor2 = numero1;
      mayor3 = numero2;
   } if(numero2> numero1){
     mayor2 = numero2;
     mayor3 = numero1;                  
  }

    System.out.println("En orden de mayor a menor");
    System.out.println(mayor1);  
    System.out.println(mayor2);
    System.out.println(mayor3);  
 } 
}