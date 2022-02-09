/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.pro_calculadora_oliver;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author olivert
 */
public class CalculadoraTest {
    

    /**
     * Test of porcentaje method, of class Calculadora.
     */
    @Test
    public void testPorcentaje() {
        System.out.println("porcentaje");
        int numero = 100;
        int porcentaje = 30;
        int expResult = 30;
        int result = Calculadora.porcentaje(numero, porcentaje);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of Suma method, of class Calculadora.
     */
    @Test
    public void testSuma() {
        System.out.println("Suma");
        int num1 = 3;
        int num2 = 1;
        int expResult = 4;
        int result = Calculadora.Suma(num1, num2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of Resta method, of class Calculadora.
     */
    @Test
    public void testResta() {
        System.out.println("Resta");
        int num1 = 3;
        int num2 = 1;
        int expResult = 2;
        int result = Calculadora.Resta(num1, num2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of Multiplicacion method, of class Calculadora.
     */
    @Test
    public void testMultiplicacion() {
        System.out.println("Multiplicacion");
        int num1 = 3;
        int num2 = 1;
        int expResult = 3;
        int result = Calculadora.Multiplicacion(num1, num2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of Division method, of class Calculadora.
     */
    @Test
    public void testDivision() {
        System.out.println("Division");
        int num1 = 3;
        int num2 = 1;
        int expResult = 3;
        int result = Calculadora.Division(num1, num2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    
}
