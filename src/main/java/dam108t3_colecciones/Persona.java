package dam108t3_colecciones;

import java.time.LocalDate;
import java.util.Objects;

public class Persona {
    String nombre;
    int telefono;
    String email;
    LocalDate fechaNac;
    
    /*CONTRUCTOR*/
    Persona(String n, int t, String e, String f){
        this.nombre = n;
        this.telefono = t;
        this.email = e;
        this.fechaNac = LocalDate.parse(f);
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + Objects.hashCode(this.nombre);
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
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Persona other = (Persona) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.fechaNac, other.fechaNac)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", telefono=" + telefono + ", email=" + email + ", fechaNac=" + fechaNac + '}';
    }

}
