/*
Modifica la clase Persona (llámale Persona_v2) para que dos personas sean iguales si tienen
el mismo nombre sin tener en cuenta mayúsculas y minúsculas. Repite el ejercicio anterior
intentando incluir en el conjunto valores que no sean permitidos por esta nueva condición (por
ejemplo: Ana y ANA generarían un duplicado).
 */
package dam108t3_colecciones;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.LinkedHashSet;

public class dam108t3e0105 {
    public static LinkedHashSet<Persona_v2> personas = new LinkedHashSet<>(); // conjunto de tipo hashset
    public static void main(String[] args) {
//        
//        String n1 = "Ana";
//        String n2 = "ANA";
//        System.out.println(n1.toUpperCase()
//        + n2.toUpperCase());
//        
//        boolean cadena = n1.equalsIgnoreCase(n2);
//        System.out.println(cadena);
        
        personas.add(new Persona_v2("Pablo",981225588,"pablo@gmail.com","1985-07-12"));
        personas.add(new Persona_v2("Pedro",981336699,"pedro@gmail.com","1986-06-08"));
        personas.add(new Persona_v2("Ana",981114477,"ana@gmail.com","1987-02-25"));
        personas.add(new Persona_v2("Julian",981112233,"julian@gmail.com","1988-01-01"));
        personas.add(new Persona_v2("Paula",981445566,"paula@gmail.com","1983-12-31"));
        personas.add(new Persona_v2("ANA",981114477,"ana@gmail.com","1987-02-25"));
        personas.add(new Persona_v2("jULIaN",981112233,"julian@gmail.com","1988-01-01"));

        int mediaEdad = calcularMedia();
        System.out.println("La media de las edades es: "+mediaEdad);
        mostrarMayor();
        
        System.out.println("todos los miembros del conjunto son:");
        for (Persona_v2 x: personas){
            System.out.println(x);
        }
    }
    
    public static void mostrarMayor(){
        int mayor = 0; Persona_v2 p = new Persona_v2("momentaneo",0,"momentaneo@gmail.com","0001-01-01");
        for(Persona_v2 x: personas){
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
        for (Persona_v2 x: personas ){
            media += calcularEdad(x);
            cont++;
        }
        return media/cont;
    }
    
    public static int calcularEdad(Persona_v2 p){
        int edad;
        LocalDate actualYear = LocalDate.now();
        edad = (int) ChronoUnit.YEARS.between(p.fechaNac, actualYear);
        return edad;
    }
}

