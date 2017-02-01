/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//kevin Gerardo Hinojosa Castellanos   A01411383  IMT
package spp.khinojosac.a04;
import java.util.Scanner;

/**
 *
 * @author Kevin Hinojosa
 */

public class SPPKHinojosaCA04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Funciones trigonométricas");
         Scanner teclado = new Scanner(System.in);
        
        //Variables.
        int opEntrant;
        double valor;
       
        
       
        
        //Desplegamos el menú.
        System.out.println("1. Calcular Tangente.");
        System.out.println("2. Calcular Seno.");
        System.out.println("3. Calcular Coseno.");
        System.out.println("4. Salir.");
        
        
        double angulo;
        angulo = teclado.nextDouble();
        double anguloRadianes = Math.toRadians(angulo);
        
      
        
        opEntrant=teclado.nextInt();
        
       switch(opEntrant){
           case 1:
               System.out.println("Introduce el ángulo: ");
               angulo = teclado.nextDouble();
               valor = Math.tan(anguloRadianes);
               System.out.println("Tangente de " + angulo + "º =" + valor);
               
           case 2: 
               System.out.println("Introduce el ángulo: ");
               angulo = teclado.nextDouble();
               valor = Math.sin(anguloRadianes);
               System.out.println("Seno de " + angulo + "º =" + valor);
               
           case 3:
               System.out.println("Introduce el ángulo: ");
               angulo = teclado.nextDouble();
               valor = Math.cos(anguloRadianes);
               System.out.println("Coseno de " + angulo + "º =" + valor);
             
                 
       }
        
        
        
        // TODO code application logic here
    }
    
}
