/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicagit;

import java.util.Scanner;

/**
 *
 * @author pabloe
 */
public class PracticaGit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hola Mundo");
        //Area Circlo
        Scanner sc = new Scanner(System.in);
        double aCirculo;
        double radio;
        
        System.out.println("Ingresa el radio del circulo: ");
        radio = sc.nextDouble();
        
        aCirculo = Math.PI*(Math.pow(radio, 2));
        System.out.println("El area del circulo es: " + aCirculo);
    }
    
}
