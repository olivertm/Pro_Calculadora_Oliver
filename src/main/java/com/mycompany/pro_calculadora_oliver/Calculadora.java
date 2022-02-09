/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pro_calculadora_oliver;

/**
 *
 * @author olivert
 */
public class Calculadora {
    public static int porcentaje (int numero, int porcentaje) {
        return (numero * porcentaje) / 100;
    }
    
    public static int Suma(int num1, int num2){
        return num1+num2;
    }
    
    public static int Resta(int num1, int num2){
        return num1-num2;
    }
    
    public static int Multiplicacion(int num1, int num2){
        return num1*num2;
    }
    
    public static int Division(int num1, int num2){
        return num1/num2;
    }
    
    public static void main(String args[])
    {
        System.out.println("La suma de 3 + 1 = " + Suma(3,1));
        System.out.println("La resta de 3 - 1 = " + Resta(3,1));
        
        System.out.println("La multiplicacion de 3 * 1 = " + Multiplicacion(3,1));
        System.out.println("La division de 3 / 1 = " + Division(3,1));
        System.out.println("El 30% de 100 es : " + porcentaje(100, 30));
    }
    
}
