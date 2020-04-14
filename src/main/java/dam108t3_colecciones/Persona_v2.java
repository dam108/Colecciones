package dam108t3_colecciones;

import java.time.LocalDate;
import java.util.Objects;

public class Persona_v2 {
    String nombre;
    int telefono;
    String email;
    LocalDate fechaNac;
    
    /*CONTRUCTOR*/
    Persona_v2(String n, int t, String e, String f){
        this.nombre = n;
        this.telefono = t;
        this.email = e;
        this.fechaNac = LocalDate.parse(f);
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + Objects.hashCode(this.nombre.toLowerCase());
        hash = 59 * hash + this.telefono;
        hash = 59 * hash + Objects.hashCode(this.email);
        hash = 59 * hash + Objects.hashCode(this.fechaNac);
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
        Persona_v2 other = (Persona_v2) obj;
        if (!Objects.equals(this.nombre.toLowerCase(), other.nombre.toLowerCase())) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", telefono=" + telefono + ", email=" + email + ", fechaNac=" + fechaNac + '}';
    }

}
