
package com.mycompany.clase06;

import java.util.Scanner;

public class Clase06 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Seleccione la figura para calcular el Area");
        System.out.println("1. Circulo");
        System.out.println("2. Cuadrado");
        System.out.println("3. Rectangulo");
        System.out.println("4. Triangulo");
        System.out.println("5. Salir");
        
        System.out.println("Ingrese una opcion(1-5): ");
        int op = sc.nextInt();
        double area = 0;
        switch(op){
            case 1:
                System.out.println("Ingrese el radio del circulo: ");
                double radio = sc.nextDouble();
                //pi * radio al cuadrado
                area = Math.PI * Math.pow(radio, 2);
                break;
            case 2:
                System.out.println("Ingrese el lado del cuadrado. ");
                double lado = sc.nextDouble();
                area = Math.pow(lado, 2);
                break;
            case 3:
                System.out.println("Ingrese la base del rectangulo: ");
                double base_r = sc.nextDouble();
                System.out.println("Ingrese la altura del rectangulo");
                double altura_r = sc.nextDouble();
                area = base_r * altura_r;
                break;
            case 4:
                System.out.println("Ingrese la base del triangulo: ");
                double base_t = sc.nextDouble();
                System.out.println("Ingrese la altura del triangulo");
                double altura_t = sc.nextDouble();
                area = (base_t * altura_t)/2;
                break;
            case 5:
                System.out.println("Saliendo de la aplicación");
                break;
            default:
                System.out.println("Opcion no existe");
                break;
        }
        
        /*
        if (op >=1 && op <5){
            System.out.println("El area calculada es: " + area);
        
        }*/
        
        if (area>0){
            System.out.println("El area calculada es: " + area);
        }
              
        sc.close();
    }
}
