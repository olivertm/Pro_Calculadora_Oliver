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
    
    public static void main(String args[])
    {
        System.out.println("El 30% de 100 es : " + porcentaje(100, 30));
    }

}
