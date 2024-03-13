/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.prog02.ccuentas;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Angel FV
 */
public class Practica_ED04_repetidaTest {
    /**
     * clase practica
     */
    public Practica_ED04_repetidaTest() {
    }
    /**
     * clase setp up clase
     */
    @BeforeAll
    public static void setUpClass() {
    }
    /**
     * clase tearDown
     */
    @AfterAll
    public static void tearDownClass() {
    }
    /**
     * claser setup
     */
    @BeforeEach
    public void setUp() {
    }
    /**
     * clase teardown
     */
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of main method, of class Practica_ED04_repetida.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Practica_ED04_repetida.main(args);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of operativa_cuenta method, of class Practica_ED04_repetida.
     */
    @Test
    public void testOperativa_cuenta() {
        System.out.println("operativa_cuenta");
        CCuenta cuenta_uno1 = null;
        Float Cantidad = null;
        Practica_ED04_repetida.operativa_cuenta(cuenta_uno1, Cantidad);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    
}
