/*
Realizar un programa al que se le introduzca un año y genera un array con las temperaturas
medias de una ciudad para todos los días de ese año (365 ó 366). La temperatura será un entero
entre 10 y 30 grados. Almacena en un Mapa y la distribución de temperaturas, es decir, para cada
temperatura, cuantos días del año la hubo y muestra dicha distribución
 */
package dam108t3_colecciones;

import java.time.LocalDate;
import java.util.*;

public class dam108t3e0108 {

    public static ArrayList<Integer> temperaturas = new ArrayList<>();
    public static HashMap<Integer, Integer> distribucion = new HashMap<>();
    public static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {

        generarTemperaturas();
        
        for (int i = 0; i < temperaturas.size(); i++) {
            System.out.println((i + 1) + ". " + temperaturas.get(i));
        }

        guardarDistribucion();
        
        System.out.println(distribucion);
    }

    public static void guardarDistribucion() {
        int value = 0;
        for (int j = 10; j <= 30; j++) {
                distribucion.put(j, 0);

        }
        for (int i = 10; i <= 30; i++) {
             for (int j = 0; j < temperaturas.size(); j++) {
                if ( i == temperaturas.get(j)) {
                    value++;
                    distribucion.replace(i, value );
                }
            }
             value = 0;
        }
    }

    public static void generarTemperaturas() {
        System.out.println("Introduce un año.");
        String sYear = teclado.nextLine();
        LocalDate fecha = LocalDate.of(Integer.valueOf(sYear), 1, 1);
        int year = fecha.getYear();
        do {
            int temp = (int) (Math.random() * 21) + 10;
            temperaturas.add(temp);
            fecha = fecha.plusDays(1);
        } while (fecha.getYear() == year);

    }
}
