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
public class Cliente {
     private String nombre;

    private  String apellido;
    private String id;
/**
 * Varaiable que nos almacenara las cuentas
 * */
    private List<CuentaBancaria> cuentas;


    /**
     * Objeto Cliente
     * Objeto al cual se le llamara para hacer referencia a cliente
     * @param apellido Variable donde guardaremos el apellido del cliente
     * @param nombre Variable nombre donde guardaremos el nombre del cliente
     * @param id Variable donde guardaremos la id del cliente
     *
     * */
    public Cliente(String nombre, String apellido, String id) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.id = id;
        this.cuentas = new ArrayList<>();
    }
 /**
  * GetNombre
  * @return nombre*/
    public String getNombre() {
        return nombre;
    }
/**
 * SetNombre
 * @param nombre Nos actualizara el nomnbre del cliente*/
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
/**
 * GetApellido
 * @return apellido*/
    public String getApellido() {
        return apellido;
    }
/**
 * setApellido
 * @param apellido nos actualizara el apellido del cliente*/
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
/**
 * getId
 * @return id*/
    public String getId() {
        return id;
    }
/**
 * setId
 * @param id nos actualizara el id de cliente*/
    public void setId(String id) {
        this.id = id;
    }
/**
 * getCuentas
 * @return cuentas;
 * */
    public List<CuentaBancaria> getCuentas() {
        return new ArrayList<>(cuentas);
    }
/**
 * Metodo agregar cuenta
 * Metodo que al ser llamado creara una nueva cuenta en la array cuenta
 * @param cuenta donde se almacenaran los datos
 * */
    public void agregarCuenta(CuentaBancaria cuenta) {
        cuentas.add(cuenta);
    }
 /**
  * Metodo cerrarCuenra
  * Metodo que al ser llamada cerrará una cuenta dentro del array de cuentas
  * @param numeroCuenta que nos permetira identificar la cuenta a borrar
  * */
    public boolean cerrarCuenta(String numeroCuenta) {
        return cuentas.removeIf(cuenta -> cuenta.getNumeroCuenta().equals(numeroCuenta));
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", id='" + id + '\'' +
                ", cuentas=" + cuentas +
                '}';
    }
}



