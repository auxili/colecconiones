/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpmislata.daw2.ejer2;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
        
        //5. En la clase main
        // a) Crea un Map con clave “String” y valor “Coche”.
         Map<String,Coche> mapCoches = new HashMap<String,Coche>();
        // b) Añade 5 elementos, cuya clave sea el DNI y el valor un Coche.(Uno de los DNIs
        //será “12345678Z”.)( Dos al menos deben ser del tipo Ford)
         
         //ESTO ES UML
         //hemos copiado y pegado la clase persona del otro proyecto para hacer:
         //Cuando terminemos añadiomos una persona y dos coches, e imprimimos del 
         //prmier coche el nombre de la persona del cual lo posee.
         
         Persona persona1,persona2;
         persona1 = new Persona("Enrique","Nuñez","12345678Z");
        //probando
         persona2 = new Persona(null, null, null);
         Coche coche6, coche7;
         coche6 = new Coche(Marca.Ford, "12345678z", 2000, "nohacefalta");
         coche7 = new Coche(Marca.Ford, "678z", 2000, null);
         
         //añadmos un coche a una persona
         coche6.setPropietario(persona1); //la propiedad propietario vale persona.
         coche7.setPropietario(persona2);//lo que hace es que la propiedad propietario de ese coche se almacene en Persona.

         
         //estaría mal así:
         /*List<Coche> cochesList = new ArrayList<>();//mal porque aquí creamos un arraylist sobre otro que ya habría creado. donde el primero elemento apunta a un coche y el segundo al otro coche, donde las propiedades de coche que apuntan a persona que no las sacará de la otro lista. Un follón.
         cochesList.add(coche6);
         cochesList.add(coche7);
        
         persona1.setCoches(coches);
         */
         //y lo dejamos como
         List<Coche> cochesList1 = persona1.getCoches(); 
         //esto crea objeto cochesList1 que apunta a arraylist
         cochesList1.add(coche6);
         cochesList1.add(coche7);
         //estas apuntan del arraylist hacia el coche
         
         //otra forma alternativa sería la siguiente:
         //estas dos sería igual que las otras 4:
         /*
         List<Coche> cochesList1;
         cochesList1 = persona1.getCoches(); 
         cochesList1.add(coche6);
         cochesList1.add(coche7);
          */
         persona1.getCoches().add(coche6);
         persona1.getCoches().add(coche7);
         //pero para que todo esto funcione debe estar el arraylist inicializado en el constructor.
         /*pero este tema es el siguiente:
          si lo inicializamos como propiedad en el private = new arraylist no lo deberíamos poner
          en el constructor. Porque en el momento de crear el objeto persona se crearia el arraylist.*/
         
         //pero en lugar de hacer el set de coches hago un get coches quye me devuelve la lista de coches y lo añado
         /*
          * list bla bla = persona1.getCoches();
          * coches.add(coche1);
          * coches.add(coche2);
          * Esto sería A LA PERSONA añadirle los coches
          * que sería distinto a lo de antes que es añadir la persona a los coches.
          */
    }
    
    
    
    
}
