

package com.mycompany.ejercicio2;
import java.util.Scanner;

public class EJERCICIO2 {
    public static void main(String[] args) {
        Scanner read = new Scanner (System.in);
        System.out.println("Ingrese su nombre:");
        String nombre = read.nextLine();
        System.out.println("Ingrese su edad:");
        int age = read.nextInt();
        System.out.println("Ingrese la letra de su sexo si es hombre M o F si es mujer");
        char sex = read.next().charAt(0);
        System.out.println("Ingrese su peso");
        double peso = read.nextDouble();
        System.out.println("Ingrese su altura");
        double altura = read.nextDouble();
        
        Persona[] personas = {
            new Persona(nombre,age,sex,peso,altura),
            new Persona(nombre,age,sex),
            new Persona()
        };
        
        for (Persona persona : personas) {
            int imc = persona.calcularImc();
            switch (imc) {
                case -1 -> System.out.println("Esta en su peso ideal");
                case 0 -> System.out.println("Esta por debajo de su peso ideal");
                case 1 -> System.out.println("Tiene sobrepeso");
                default -> System.out.println("Error");
            }
            
            if(persona.mayorDeEdad()){
                System.out.println("Es mayor de edad");
            } else {
                System.out.println("No es mayor de edad");
            }
            
            System.out.println(persona.toString());
        }
    }
}
