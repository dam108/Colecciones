package dam108t3_colecciones;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.Objects;

public class Persona_v4{
    String DNI;
    String nombre;
    int telefono;
    String email;
    LocalDate fechaNac;
    
    /*CONTRUCTOR*/
    Persona_v4(String dni, String n, int t, String e, String f){
        this.DNI = dni;
        this.nombre = n;
        this.telefono = t;
        this.email = e;
        this.fechaNac = LocalDate.parse(f);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.DNI);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Persona_v4 other = (Persona_v4) obj;
        if (!Objects.equals(this.DNI, other.DNI)) {
            return false;
        }
        return true;
    }



    @Override
    public String toString() {
        return "Persona_v3{" + "DNI=" + DNI + ", nombre=" + nombre + ", telefono=" + telefono + ", email=" + email + ", fechaNac=" + fechaNac + '}';
    }
    
}

// creamos la clase comparaEdad que implementa comparator para hacer un metodo
// que devuelve un entero positivo o negativo con la diferencia entre varias fechas
class CompararEdad implements Comparator {
    public int compare(Object o1, Object o2){
        Persona_v4 p1 = (Persona_v4) o1;
        Persona_v4 p2 = (Persona_v4) o2;
        return p1.fechaNac.compareTo(p2.fechaNac);
    }
}
// creamos la clase comparaEmail que implementa comparator para hacer un metodo
// que devuelve un entero positivo o negativo con la diferencia entre emails
class CompararEmail implements Comparator{
    public int compare (Object o1, Object o2){
        Persona_v4 p1 = (Persona_v4) o1;
        Persona_v4 p2 = (Persona_v4) o2;
        return p1.email.compareToIgnoreCase(p2.email);
    }
}