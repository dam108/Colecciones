/*
Realiza un programa que defina un Arraylist de Persona_v3. Añade 5 personas al mismo, pero
una de ellas que esté repetida. Utilizando conversiones entre colecciones (sin iterar sobre el
ArrayList) elimina los repetidos, preservando el orden de los elementos del ArrayList
 */
package dam108t3_colecciones;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public class dam108t3e0118 {
    public static ArrayList <Persona_v5> personas;
    public static void main(String[] args) {
        personas = new ArrayList<>();
        
        rellenarArrayList();
        
        // Mostramos el ArrayList con repetidos
        for (Persona_v5 x : personas) {
            System.out.println(x.toString());
        }
        
        // Convertimos el ArrayList a LinkedHashSet
        
        Set conjunto = new LinkedHashSet(personas);
        
        System.out.println("En el ArrayList hay --> "+personas.size()+" personas");
        System.out.println("En el LinkedHashSet hay --> "+conjunto.size()+" personas");
        
        for (Object x : conjunto) {
            System.out.println(x.toString());
        }
        
    }
    
    public static void rellenarArrayList() {
        personas.add(new Persona_v5(
                "48662598V", "Juan", 981235689, "juan@gmail.com", "1987-02-01"));
        personas.add(new Persona_v5(
                "63519466J", "Pepe", 981458562, "pepe@gmail.com", "1985-03-02"));
        personas.add(new Persona_v5(
                "52488571G", "Lucia", 981965485, "lucia@gmail.com", "1988-04-03"));
        personas.add(new Persona_v5(
                "12548633F", "Paula", 981962168, "paula@gmail.com", "1987-05-04"));
        personas.add(new Persona_v5(
                "35646411H", "Gimeno", 981992546, "gimeno@gmail.com", "1986-07-05"));
        personas.add(new Persona_v5(
                "52488571G", "Lucia", 981965485, "lucia@gmail.com", "1988-04-03"));
        personas.add(new Persona_v5(
                "35646411H", "Gimeno", 981992546, "gimeno@gmail.com", "1986-07-05"));
    }
    
    
}
