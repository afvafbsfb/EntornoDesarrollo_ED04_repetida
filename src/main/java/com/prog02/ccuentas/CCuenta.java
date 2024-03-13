/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.prog02.ccuentas;

/**
 *
 * @author Angel FV
 */
public class CCuenta {
    private String nombreCuenta;
    private String cuenta;
    private double saldo;
    private double tipoInterés;
    
    /**
     * clase constructor sin parametros para crear la cuenta
     */
    public CCuenta()
    {
    }

    /**
     * 
     * @param nom  nombreCuenta para la cuenta
     * @param cue numero
     * @param sal  de la cuenta
     * @param tipo  tipo de cuenta
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombreCuenta =nom;
        cuenta=cue;
        saldo=sal;
    }
    
    /**
     * @return the java.lang.String
     */
    public String getNombreCuenta() {
        return nombreCuenta;
    }

    /**
     * @param nombreCuenta the nombreCuenta to set
     */
    public void setNombreCuenta(String nombreCuenta) {
        this.nombreCuenta = nombreCuenta;
    }

    /**
     * @return the cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * @param cuenta the cuenta to set
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * @return the saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * @return the tipoInterés
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * @param tipoInterés the tipoInterés to set
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }

    /**
     * 
     * @return devuelve el saldo de la cuenta
     */
    
    public double estado()
    {
        return getSaldo();
    }

    /**
     * 
     * @param cantidad  a ingresar
     * @throws Exception   en caso de error
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }

    /**
     * 
     * @param cantidad  a retirar
     * @throws Exception en caso de error
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }
}

