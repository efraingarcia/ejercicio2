

package ejercicio104capitulo6;
import java.util.Scanner;

public class Ejercicio104capitulo6 {

    public static void main(String[] args) {
      

        
    int i, p, n, candidatoA = 0, candidatoB = 0, candidatoC = 0, candidatoD = 0, candidatoE = 0, totalvot;
    float porcA, porcB, porcC, porcD, porcE; 
    
    
    Scanner teclado = new Scanner(System.in);
    
    System.out.println("Cuantos sufragantes cumplieron con el dever al vota?"); 
    p = teclado.nextInt();
   
      
     
      
     for (i = 0; i < p; i++) { 
         
        System.out.println("Digite una opcion del candita que desea"); 
      
        System.out.println(" ");
        System.out.println("1. Candidato 1");
        System.out.println("2. Candidato 2");
        System.out.println("3. Candidato 3");
        System.out.println("4. Candidato 4");
        System.out.println("5. Candidato 5");
        n = teclado.nextInt(); 
        
      
        if (n == 1){
            
            candidatoA = candidatoA + 1;
           
        }
        if (n == 2){
           
            candidatoB = candidatoB + 1;
            
            
        }
        if (n == 3){
            
            candidatoC = candidatoC + 1;
           
        }  
         if (n == 4){
           
            candidatoD = candidatoD + 1;
         }     
        if (n == 5){
            
            candidatoE = candidatoE + 1;
        } 
           
    }
     totalvot = candidatoA + candidatoB + candidatoC + candidatoD + candidatoE;
     
     
     porcA = (float) (candidatoA * 100 / totalvot);
     porcB = (float) (candidatoB * 100 / totalvot);
     porcC = (float) (candidatoC * 100 / totalvot);
     porcD = (float) (candidatoD * 100 / totalvot);
     porcE = (float) (candidatoE * 100 / totalvot);
             
             
             
             
             
     
       System.out.println ("El candidato 1 tiene "+candidatoA+" votos."); 
       System.out.println ("El candidato 2 tiene "+candidatoB+" votos.");
       System.out.println ("El candidato 3 tiene "+candidatoC+" votos.");
       System.out.println ("El candidato 4 tiene "+candidatoD+" votos.");
       System.out.println ("El candidato 5 tiene "+candidatoE+" votos.");
       System.out.println (" "); 
       System.out.println (" "); 
       
       System.out.println ("El candidato 1 tuvo una intencion de votos de "+porcA+" %"); 
       System.out.println ("El candidato 2 tuvo una intencion de votos de "+porcB+" %");
       System.out.println ("El candidato 3 tuvo una intencion de votos de "+porcC+" %");
       System.out.println ("El candidato 4 tuvo una intencion de votos de "+porcD+" %");
       System.out.println ("El candidato 5 tuvo una intencion de votos de "+porcE+" %");
  
  
    }
}

    
     

 



    

