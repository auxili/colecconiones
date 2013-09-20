/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpmislata.daw2.ejer2;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alumno
 */
public class Main {
    public static Scanner stdin = new Scanner(System.in);
    public static void main (String[]args){
        // a) crear un lista de objetos COCHE: (lo voy a hacer con ArrayList)
        Coche coche1, coche2, coche3, coche4, coche5;
        //creamos la lista
        List<Coche> coches = new ArrayList<Coche>();
        //añadimos los objetos Coche
        coche1 = new Coche(Marca.Ford,"Fiesta",1400,"1A");
        coche2 = new Coche(Marca.Ford,"Focus",1600,"2B");
        coche3 = new Coche(Marca.Seat,"Ibiza",1800,"3C");
        coche4 = new Coche(Marca.Citroen,"Yoquese",1400,"4D");
        coche5 = new Coche(Marca.Renault,"Laguna",2200,"5E");
        // b) Añadimos los objetos a la lista
        coches.add(coche1);
        coches.add(coche2);
        coches.add(coche3);
        coches.add(coche4);
        coches.add(coche5);      
        // c) Muestra por pantalla el segundo elemento
        System.out.println(coche2.toString());
        // d) muestra por pantalla todos los coches marca y modelo
        for (Coche coche:coches){
            System.out.println("Marca " + coche.getMarca());
            System.out.println("Modelo " + coche.getModelo());
            System.out.println("Cilindrada " + coche.getCilindrada());
            System.out.println("Dni Propietario " + coche.getDniPropietario());
        }
        // e)  Pide por pantalla un DNI y muestra el modelo de coche que corresponde con ese DNI
        System.out.println("Introduce el DNI a buscar");
        String buscaDni = stdin.nextLine();
        for (Coche coche:coches){
            if (coche.getDniPropietario().equals(buscaDni)){
                System.out.println("COCHE ENCONTRADO");
                System.out.println(coche.toString());
            }
        }
        // f) Muestra todos aquellos coches que tengan como marca "Ford"
        for (Coche coche:coches){
            if(coche.getMarca()==Marca.Ford){
                System.out.println(coche.toString());
            }
        }
        
    }
    
    
    
    
}
