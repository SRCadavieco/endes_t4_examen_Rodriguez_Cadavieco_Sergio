/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package endest4examen;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author ALUMNOS_FP
 */
public class CuentaBancaria {
/**
 * Clase CuentaBancaria
 * Clase en la que recogeremos todos los datos de la cuenta bancaria de un cliente
 * @author SergioRodriguez
 * @version 1.0
 *
 *
 * */

    private String numeroCuenta;
    private double saldo;
    private Cliente propietario;
/**
 * Objeto cuenta bancaria
 * Objeto que almacenara todos los datos de la cuetna bancaria
 * @param numeroCuenta Que almacenara el numero de la cuenta bancaria
 * @param propietario Que almacenara el nombre del propietario de la cuenta
 * @param saldo Que almacenara el saldo restante de la cuenta
 * */
    public CuentaBancaria(String numeroCuenta, double saldo, Cliente propietario) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.propietario = propietario;
    }
/**
 * getNumeroCuenta
 * @return numeroCuenta*/
    public String getNumeroCuenta() {
        return numeroCuenta;
    }
/**
 * SetNumeroCuenta
 * @param numeroCuenta Nos permitira actualizar el numero de cuenta*/
    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }
/**
 * getSaldo
 * @return saldo
 *
 * */
    public double getSaldo() {
        return saldo;
    }
/**
 * setSaldo
 * @param saldo Parametro que permitira actualizar el saldo de la cuentaBancaria
 *
 *
 * */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
/**
 * getPropietario
 * @return propietario
 *
 *
 * */
    public Cliente getPropietario() {
        return propietario;
    }
/**
 * setPropietario
 * @param propietario variable que actualizara el propietario de la cuenta
 *
 * */
    public void setPropietario(Cliente propietario) {
        this.propietario = propietario;
    }
    /**
     * metodo Despositar
     * metodo que nos permitira añadir una cantidad al saldo de una cuenta
     * @param cantidad variable que recogera la cantidad a ingresar en la cuenta
     * */

    public void depositar(double cantidad) {
        saldo += cantidad;
    }
  /**
   * metodo retirar
   * metodo que nos permitira saber si el cliente puede retirar cierta cantidad siempre y cuando la cantodad sea menor o igual al saldo
   * @param cantidad variable que recogera la cantidad a retirar en la cuenta
   * */
    public boolean retirar(double cantidad) {
        if (cantidad <= saldo) {
            saldo -= cantidad;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "CuentaBancaria{" +
                "numeroCuenta='" + numeroCuenta + '\'' +
                ", saldo=" + saldo +
                ", propietario=" + propietario.getNombre() + " " + propietario.getApellido() +
                '}';
    }
}   

