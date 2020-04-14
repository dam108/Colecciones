/*
Haz un programa que cree un conjunto HashSet que almacene la lista de personas que van a
una fiesta (de una persona sabemos su nombre, teléfono, email y fecha de nacimiento). Crea en un
archivo aparte la clase Persona con los atributos y métodos que necesites. En el programa introduce
“a mano” unas cuantas personas, y luego muestre la edad media y el nombre del mayor.
• Intenta hacer una inserción de una persona repetida ¿Qué ocurre? (Dos personas son
iguales si tienen exactamente el mismo nombre.
• Muestra todos los valores almacenados en el HashSet ¿Tienen algún orden?
 */
package dam108t3_colecciones;

import java.time.*;
import java.time.temporal.ChronoUnit;
import java.util.*;

public class dam108t3e0103 {
    public static HashSet<Persona> personas = new HashSet<>(); // conjunto de tipo hashset
    public static void main(String[] args) {
        
        personas.add(new Persona("Pablo",981225588,"pablo@gmail.com","1985-07-12"));
        personas.add(new Persona("Pedro",981336699,"pedro@gmail.com","1986-06-08"));
        personas.add(new Persona("Ana",981114477,"ana@gmail.com","1987-02-25"));
        personas.add(new Persona("Julian",981112233,"julian@gmail.com","1988-01-01"));
        personas.add(new Persona("Paula",981445566,"paula@gmail.com","1983-12-31"));
        personas.add(new Persona("Ana",981114477,"ana@gmail.com","1987-02-25"));

        int mediaEdad = calcularMedia();
        System.out.println("La media de las edades es: "+mediaEdad);
        mostrarMayor();
        
        System.out.println("todos los miembros del conjunto son:");
        for (Persona x: personas){
            System.out.println(x);
        }
    }
    
    public static void mostrarMayor(){
        int mayor = 0; Persona p = new Persona("momentaneo",0,"momentaneo@gmail.com","0001-01-01");
        for(Persona x: personas){
            if ( calcularEdad(x)> mayor) {
                mayor = calcularEdad(x);
                p = x;
            }
        }
        System.out.println("La persona mas mayor es:");
        System.out.println(p);
    }
    
    public static int calcularMedia(){
        int media = 0; int cont = 0;
        for (Persona x: personas ){
            media += calcularEdad(x);
            cont++;
        }
        return media/cont;
    }
    
    public static int calcularEdad(Persona p){
        int edad;
        LocalDate actualYear = LocalDate.now();
        edad = (int) ChronoUnit.YEARS.between(p.fechaNac, actualYear);
        return edad;
    }
}

