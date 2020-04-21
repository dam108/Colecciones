/*
Realizar un programa que genera un array con las temperaturas medias de una ciudad para
todos los días de un año no bisiesto. La temperatura será un entero entre 10 y 30 grados
Ayudándote de un TreeMap, muestra la temperatura mínima y cuantas ocurrencias tuvo y la
temperatura máxima y cuantas ocurrencias tuvo.
 */
package dam108t3_colecciones;


import java.time.LocalDate;
import java.util.*;

public class dam108t2e0109 {
    public static Scanner teclado = new Scanner(System.in);
    public static ArrayList<Integer> temperaturas = new ArrayList<>();
    public static TreeMap<Integer, Integer> distribucion = new TreeMap<>();
    public static void main(String[] args) {
        
        generarTemperaturas(2021);
        guardarDistribucion();
        
        System.out.println(distribucion);
        
        System.out.printf("La temperatura minima es %d y se ha repetido %d "
                + "veces \n", distribucion.firstKey(), distribucion.get(
                        distribucion.firstKey()) );
        System.out.printf("La temperatura maxima es %d y se ha repetido %d "
                + "veces \n", distribucion.lastKey(), distribucion.get(
                        distribucion.lastKey()));
        
        
    }
    
    public static void guardarDistribucion() {
        //temperaturas.get(i) es la temperatura que se va guardar como clave
        for (int i = 0; i < temperaturas.size(); i++) { // nos recorremos el array de temperaturas
            if(!distribucion.containsKey(temperaturas.get(i))){ // si el treeMap no tiene esa clave, se inicia el contador se se va mostrar como valor
                distribucion.put(temperaturas.get(i), 1); 
            }
            else { // en caso de que el treeMap ya tenga esta clave se aumenta en 1 el contador que se va mostrar como valor
                distribucion.put(temperaturas.get(i), distribucion.get(
                        temperaturas.get(i))+1);
            }
        }
    }
    
    
    
    public static void generarTemperaturas(int sYear) {

        LocalDate fecha = LocalDate.of(Integer.valueOf(sYear), 1, 1);
        int year = fecha.getYear();
        do {
            int temp = (int) (Math.random() * 21) + 10;
            temperaturas.add(temp);
            fecha = fecha.plusDays(1);
        } while (fecha.getYear() == year);

    }
    
}
