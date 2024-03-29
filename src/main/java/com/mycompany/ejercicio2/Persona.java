
package com.mycompany.ejercicio2;


public class Persona {
    private String name;
    private int edad;
    private String DNI;
    private char sexo;
    private double peso;
    private double altura;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDNI() {
        return DNI;
    }

//    public void setDNI(String DNI) {
//        this.DNI = DNI;
//    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    // Constructor que asigna los valores por defecto
    public Persona(){
        this.name = "Keiner";
        this.DNI = "1091657442";
        this.edad = 18;
        this.sexo = 'M';
        this.altura = 1.8;
        this.peso = 70;
    }
    // Constructor con el nombre, edad y sexo, el resto por defecto
    public Persona(String name, int edad, char sexo){
        this.name = name;
        this.edad = edad;
        this.sexo = sexo;
        this.DNI = "1004860287";
        this.peso = 85;
        this.altura = 1.7;   
    }
    //Constrctor con todos los atributos como parametro
    public Persona(String name, int edad, char sexo, double peso, double altura) {
        this.name = name;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }
    
    public int calcularImc(){
        double imc;
        int number=0;
        imc = (this.peso/(this.altura*this.altura));
        if(imc<20){
            number = -1;
            return number;
        }
        else if(imc>=20 || imc<=25){
            number = 0;
            return number;
        }
        else if(imc>25){
            number = 1;
            return number;
        }
        return number;
    }
    public boolean mayorDeEdad(){
       return this.edad>=18;
    }
    
    public char comprobarSexo(char sexo) {
        if (sexo == 'F' || sexo == 'M') {
            return sexo;
        } else {
            return 'H';
        }
    }
    // Método para generar el DNI
    public String generaDNI() {
        // Generar un número aleatorio de 8 cifras
        int dniNumero = (int) (Math.random() * 90000000) + 10000000;

        // Calcular la letra correspondiente al número
        String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
        char dniLetra = letras.charAt(dniNumero % 23);

        // Combinar número y letra
        return dniNumero + "" + dniLetra;
    }
    @Override
public String toString() {
    return "Nombre: " + name + ", edad: " + edad + ", DNI: " + DNI + ", sexo: " + sexo + ", peso: " + peso + ", altura: " + altura;
        }
    
    }

