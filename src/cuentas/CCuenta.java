package cuentas;

/**
 * Clase que representa una cuenta bancaria.
 * Permite realizar ingresos, retiradas y consultar saldo.
 * @author Fernando Martínez Clemente
 * @version 2.0
 */

public class CCuenta {

    //Atributos privados
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;
    /**
     * Constructor vacío por defecto.
     */
    public CCuenta()
    {
    }
     /**
     * Constructor de la clase CCuenta.
     * @param nom Nombre del titular de la cuenta.
     * @param cue Número de cuenta (IBAN o similar).
     * @param sal Saldo inicial de la cuenta.
     * @param tipo Tipo de interés aplicado.
     */
    
     public CCuenta(String nom, String cue, double sal, double tipo)
            
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }

    public double estado()
    {
        return getSaldo();
    }
    /**
     * Método para ingresar una cantidad en la cuenta.
     * @param cantidad Dinero a ingresar (debe ser positivo).
     * @throws Exception Si la cantidad ingresada es negativa.
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }
    /**
     * Método para retirar dinero de la cuenta.
     * @param cantidad Dinero a retirar.
     * @throws Exception Si no hay suficiente saldo o la cantidad es negativa.
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }

    /**
     * Obtiene el nombre del titulas
     * @return nombre titular
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del titular.
     * @param nombre El nombre a establecer.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el numero de cuenta
     * @return número de cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * Establece el número de cuenta
     * @param cuenta  cuenta a establecer
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * Obtiene el saldo disponible.
     * @return El saldo actual.
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Establece el saldo de la cuenta.
     * @param saldo El saldo a establecer.
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Obtiene el tipo de interés.
     * @return El tipo de interés.
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * Establece el tipo de interés.
     * @param tipoInterés El tipo de interés a establecer.
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }
}
