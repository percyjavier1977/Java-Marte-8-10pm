
package com.mycompany.clase06;

import java.util.Scanner;


public class Ejemplo5 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        double suma = 0;
        System.out.println("¿Cuantas notas va a ingresar?"); 
        int nnotas = sc.nextInt();
        
        for(int i = 1; i<=nnotas;i++){
            System.out.println("Ingrese la nota: " + i);
            double nota = sc.nextDouble();
            suma +=nota;
        }
        
        double promedio = suma / nnotas;
        System.out.println("El promedio es: " + promedio);
    }
    
}
