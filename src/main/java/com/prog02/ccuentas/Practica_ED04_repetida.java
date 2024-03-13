/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.prog02.ccuentas;

/**
 *
 * @author Angel FV
 */
public class Practica_ED04_repetida {

    /**
     * metodo principal
     * @param args 
     */
    public static void main(String[] args) {
       CCuenta cuenta_uno1;

        metodoInicial();
        
        System.out.println("linea cambiada");
    }

    public static void metodoInicial() {
        CCuenta cuenta_uno1;
        cuenta_uno1 = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        "hola".equals("hola");
        System.out.println("hola");     
        operativa_cuenta(cuenta_uno1, 4.02f);
    }

    /**
     * para realizar las operaciones de cuenta
     * @param cuenta_uno1
     * @param Cantidad 
     */
    public static void operativa_cuenta(CCuenta cuenta_uno1, java.lang.Float Cantidad) {
        double saldoActual;
        saldoActual = cuenta_uno1.estado();
        System.out.println("El saldo actual es"+ saldoActual );
        try {
            cuenta_uno1.retirar(100);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta_uno1.ingresar(100);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }
    

}
