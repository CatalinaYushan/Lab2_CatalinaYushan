package lab2_catalinayushan;

import java.util.Scanner;
  
public class Lab2_CatalinaYushan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);{
    
    System.out.println("------Menu------");
    System.out.println("1. Indice Academico");
    System.out.println("2. ¡OK Boomer!       ");
    System.out.println("3. ¡Gotta Know Them All!");
    int Ejercicio_Electo=entrada.nextInt();
    
    if (Ejercicio_Electo==1);
        System.out.println("Ingrese el primer numero: ");
        System.out.println("Ingrese el segundo numero: ");
        int numeroOne = entrada.nextInt();
        int numeroTwo = entrada.nextInt();
        
    if(numeroOne<0&&numeroTwo<0);
      System.out.println("Los valores ingresados no son validos. ");
      
        //
        
    if (Ejercicio_Electo==2);
        System.out.println("Ingrese el año en que nació: ");
        int año_Cumpleaños=entrada.nextInt();
    
      if (año_Cumpleaños>=1946&&año_Cumpleaños>=1964);
       System.out.println("Eres parte de la generación Baby Boomer! ");
      
      if (año_Cumpleaños>=1965&&año_Cumpleaños>=1979);
       System.out.println("Eres parte de la generación X! ");
      
      if(año_Cumpleaños>=1979&&año_Cumpleaños>=1985);
       System.out.println("Eres parte de la generación Xennials! ");
      
      if(año_Cumpleaños>=1986&&año_Cumpleaños>=1994);
       System.out.println("Eres parte de la generación Millenials! ");
      
      if(año_Cumpleaños>=1995&&año_Cumpleaños>=2013);
       System.out.println("Eres parte de la generación Z! ");
       
      if(año_Cumpleaños>=2014&&año_Cumpleaños>=2025);
       System.out.println("Eres parte de la generación Alpha! ");
       
       //
       
       if (Ejercicio_Electo==3);
       System.out.println("Ingrese el tipo de Atacador: ");
       System.out.println("Ingrese el tipo de Defensor: ");
       int atacador_Pokemon=entrada.nextInt();
       int defensor_Pokemon=entrada.nextInt();
       
       if (atacador_Pokemon==Fighting&&defensor_Pokemon==Fighting);
        System.out.println("El tipo Fighting es neutral contra el tipo Fighting! ");
       else 
        if(atacador_Pokemon==Fighting&&defensor_Pokemon==Pyschic);
         System.out.println("El tipo Fighting es débil contra el tipo Psychich!  ");
         else
           if (atacador_Pokemon==Fighting&&defensor_Pokemon==Steel);
           System.out.println("El tipo Fighting es muy fuerte contra el tipo Steel! ");
           else
             if (atacador_Pokemon==Fighting&&defensor_Pokemon==Fairy);
             System.out.println("El tipo Fighting es muy débil contra el tipo Fairy! ");
           
          
         
       
        
        
        
        
     
       
       
       
      
      
       
     
     // Fighting (Attacker) y Fighthing (Defense) = Neutral
      // Fighting (Attacker) y Pyschic (Defense) = Weak
      // Fighting (Attacker) y Steel (Defense) = Very Strong
      // Fighting (Attacker) y Fairy (Defense) = Weak
      
       
      
       
       

        
    }
   
   
    }
     
}
 