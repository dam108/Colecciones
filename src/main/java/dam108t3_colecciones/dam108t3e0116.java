/*
    Modifica la clase Persona_v2 (llámale Persona_v4) para que cualquier colección, por defecto,
    ordene las personas por su DNI. Crea un programa que cree TreeSet (es un conjunto ordenado) en
    el que se introduzcan “a mano” unas cuantas personas y a continuación las muestre con un for…each.
    Comprueba en qué orden muestra las personas. Pista: LocalDate tiene un método compareTo()
 */
package dam108t3_colecciones;

import java.util.TreeSet;

public class dam108t3e0116 {
    public static TreeSet <Persona_v3> personas;
    public static void main(String[] args) {
        personas = new TreeSet<>();
        
        rellenarTreeSet();
        
        
        // esto ordena por fechao gracias a la implementacion de Comparable en la clase Persona_v4
        for (Persona_v3 x : personas) {
            System.out.println(x);
        }
    
    
    }

    public static void rellenarTreeSet() {
        personas.add(new Persona_v3(
                "48662598V", "Juan", 981235689, "juan@gmail.com", "1987-02-01"));
        personas.add(new Persona_v3(
                "63519466J", "Pepe", 981458562, "pepe@gmail.com", "1985-03-02"));
        personas.add(new Persona_v3(
                "52488571G", "Lucia", 981965485, "lucia@gmail.com", "1988-04-03"));
        personas.add(new Persona_v3(
                "12548633F", "Paula", 981962168, "paula@gmail.com", "1987-05-04"));
        personas.add(new Persona_v3(
                "35646411H", "Gimeno", 981992546, "gimeno@gmail.com", "1986-07-05"));
    }
    
}

