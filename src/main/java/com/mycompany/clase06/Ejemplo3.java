
package com.mycompany.clase06;

import java.util.Scanner;

public class Ejemplo3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int suma = 0;
        System.out.println("Ingrese un número: ");
        int numero = sc.nextInt();
        for(int i=0;i<=numero;i++){
            suma+=i;
        }
        System.out.println("la sumatoria de: " + numero + " es: " + suma);
        System.out.printf("La sumatoria de: %d es: %d%n",numero,suma);
        sc.close();
        
    }
    
}
