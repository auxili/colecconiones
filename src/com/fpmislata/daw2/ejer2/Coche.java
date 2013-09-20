/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpmislata.daw2.ejer2;

/**
 *
 * @author alumno
 */
public class Coche {
    //propiedades son variables
    private Enum marca;
    private String modelo;
    private int cilindrada;
    private String dniPropietario;
    
    public Coche (Enum marca, String modelo,int cilindrada, String dniPropietario){
        this.cilindrada=cilindrada;
        this.dniPropietario=dniPropietario;
        this.marca=marca;
        this.modelo=modelo;
    }
    
    public String toString(){
        return  "Marca: " + marca +
                "\nModelo: " + modelo +
                "\nCilindrada: " + cilindrada + 
                "\nDni Propietario: " + dniPropietario;
    }
            
            
            
    /**
     * @return the marca
     */
    public Enum getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(Enum marca) {
        this.marca = marca;
    }

    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * @return the cilindrada
     */
    public int getCilindrada() {
        return cilindrada;
    }

    /**
     * @param cilindrada the cilindrada to set
     */
    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    /**
     * @return the dniPropietario
     */
    public String getDniPropietario() {
        return dniPropietario;
    }

    /**
     * @param dniPropietario the dniPropietario to set
     */
    public void setDniPropietario(String dniPropietario) {
        this.dniPropietario = dniPropietario;
    }
    
}
