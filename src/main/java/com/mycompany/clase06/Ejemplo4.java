
package com.mycompany.clase06;

import java.util.Scanner;

public class Ejemplo4 {

    
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        int suma = 0;
        System.out.println("Ingrese un número: ");
        int numero = sc.nextInt();
        System.out.println("Son pares");
        for(int i=1;i<=numero;i++){
            if(i%2 ==0){
                System.out.print(i + " ");
                suma+=i;
            }
            
        }
        
        
        System.out.printf("%nLa sumatoria del 1 al %d es: %d%n",numero,suma);
        
    }
    
}
