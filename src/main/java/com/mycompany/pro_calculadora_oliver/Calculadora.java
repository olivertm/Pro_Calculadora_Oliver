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
    
    public static int Suma(int num1, int num2){
        return num1+num2;
    }
    
    public static int Resta(int num1, int num2){
        return num1-num2;
    }
    
    public static void main(String args[])
    {
        System.out.println("La suma de 3 + 1 = " + Suma(3,1));
        System.out.println("La resta de 3 - 1 = " + Resta(3,1));
    }
    
}
