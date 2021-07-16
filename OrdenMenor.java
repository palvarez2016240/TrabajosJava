public class OrdenMenor{ 
  public static void main(String args[]){

   int  numero1   = 50;
   int  numero2   = 45;
   int  numero3   = 30;
   int  menor1    =  0; 
   int  menor2    =  0;   
   int  menor3    =  0;   
  

   if(numero1 < numero2 & numero1 < numero3){
     menor1 = numero1;
  }if(numero2 < numero3){
     menor2 = numero2;
     menor3 = numero3;                  
  }if(numero3 < numero2){
     menor2 = numero3;
     menor3 = numero2;                  
  } 

    if(numero2 < numero1 & numero2 < numero3){
      menor1 = numero2;
    }if(numero1 < numero3){
      menor2 = numero1;
      menor3 = numero3;
   } if(numero3 < numero1){
     menor2 = numero3;
     menor3 = numero1;                  
  }

     if(numero3 < numero1 & numero3 < numero2){
      menor1 = numero3;
    }if(numero1 < numero2){
      menor2 = numero1;
      menor3 = numero2;
   } if(numero2 < numero1){
     menor2 = numero2;
     menor3 = numero1;                  
  }

    System.out.println("En orden de menor a mayor");
    System.out.println(menor1);  
    System.out.println(menor2);
    System.out.println(menor3);  
 } 
}