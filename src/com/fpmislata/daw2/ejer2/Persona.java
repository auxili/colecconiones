/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpmislata.daw2.ejer2;
import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author alumno
 */
public class Persona {
    //propiedades
    private String nombre;
    private String apellido1;
    private String dni;
    private String nombreCompleto;
    //creamos la propiedad LISTA DE COCHES y luego hay que añadir el get set
    private List<Coche> coches; //=new ArrayList<>();
    //en el constructor no hace falta añadir la lista de coches. Lo lanzarás arriba en el arraylist
    public Persona(String nombre, String apellido1, String dni){
        this.apellido1=apellido1;
        this.nombre=nombre;
        this.dni=dni;
        this.coches= new ArrayList<>();
    }

    //metodos accesores
    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the ap1
     */
    public String getApellido1() {
        return apellido1;
    }

    /**
     * @param ap1 the ap1 to set
     */
    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }
    
    /**
     * @return the dni
     */
    public String getDni() {
        return dni;
    }

    /**
     * @param dni the dni to set
     */
    public void setDni(String dni) {
        this.dni = dni;
    }

    /**
     * @return the nombreCompleto
     */
    public String getNombreCompleto() {
        return nombre + " " + apellido1;
    }

    /**
     * @param nombreCompleto the nombreCompleto to set
     */
    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    /**
     * @return the coches
     */
    public List<Coche> getCoches() {
        return coches;
    }

    /**
     * @param coches the coches to set
     */
    public void setCoches(List<Coche> coches) {
        this.coches = coches;
    }
    

}