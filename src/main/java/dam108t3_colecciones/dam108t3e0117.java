/*
Realiza un programa que defina un Arraylist de Persona_v4. Añade 5 personas distintas al
mismo y luego muéstralas por pantalla ordenadas por email. A continuación, vuelve a mostrarlas,
pero esta vez ordenadas por edad. ¿Debes usar Comparable o Comparator?
 */
package dam108t3_colecciones;

import java.util.ArrayList;
import java.util.Collections;

public class dam108t3e0117 {
    public static ArrayList <Persona_v4> personas;
    public static void main(String[] args) {
        personas = new ArrayList<>();
        CompararEmail cem = new CompararEmail();
        CompararEdad ced = new CompararEdad();
        rellenarTreeMap();
        
        
        // mostar Odenadas por email
        System.out.println("Odenadas por email");
        Collections.sort(personas, cem);
        for (Persona_v4 x : personas) {
            System.out.println(x.toString());
        }
        
        System.out.println();
        
        // mostrar Ordenadas por edad
        System.out.println("Odenadas por edad");
        Collections.sort(personas, ced);
        for (Persona_v4 x : personas) {
            System.out.println(x.toString());
        }
    
    }

    public static void rellenarTreeMap() {
        personas.add(new Persona_v4(
                "48662598V", "Juan", 981235689, "juan@gmail.com", "1987-02-01"));
        personas.add(new Persona_v4(
                "63519466J", "Pepe", 981458562, "pepe@gmail.com", "1985-03-02"));
        personas.add(new Persona_v4(
                "52488571G", "Lucia", 981965485, "lucia@gmail.com", "1988-04-03"));
        personas.add(new Persona_v4(
                "12548633F", "Paula", 981962168, "paula@gmail.com", "1987-05-04"));
        personas.add(new Persona_v4(
                "35646411H", "Gimeno", 981992546, "gimeno@gmail.com", "1986-07-05"));
    }
    
}

