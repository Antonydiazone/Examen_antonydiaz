/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication10;

import java.util.Scanner;

/**
 *
 * @author antob
 */
public class JavaApplication10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
    }
    Scanner scanner = new Scanner(System.in);
    int opcion=0;
    
    while(opcion!=2){
            System.out.println("ejercicios de palabras ");
            System.out.println("salir");
            opcion = scanner.nextInt();
            
            if(opcion==1){
                Scanner box = new Scanner(System.in);
                System.out.println("ingrese la primera cadena");
                String cadena = box.nextLine();
                System.out.println("ingrese la segunda cadena");
                String cadena2 = box.nextLine();
                
                if(cadena == null ? cadena2 != null : !cadena.equals(cadena2)){
                String nuevaCadena = cadena1+cadena2;
                    System.out.println("Nueva cadena="+nuevaCadena);
                }
            }else{
                if(opcion==2){
                    Scanner caja = new Scanner(System.in);
                    System.out.println("ingrese la primer cadena");
                    String primeraCadena = caja.nextLine();
                    System.out.println("ingrese la segunda cadena");
                    String segundaCadema = caja.nextLine();
                    
                    if (primeraCadena.equals(segundaCadena)){
                        String nuevacadena = new StringBuilder(segundaCadena).reverse().toString();
                        nuevacadena = ()    
                    }
                    
                
                }
                        
            }
            
    
}
    
    
    
}
