/*
Enunciado 1:
Realizar un programa que contenga una LinkedList para almacenar las matrículas de los
coches aparcados en un parking. El parking es un poco raro, mide solo 3 metros de ancho y caben
10 coches, pero uno detrás de otro por lo que el último en entrar debe ser el primero en salir (esta
estructura se llama pila LIFO – Last Input, First Output). El programa tendrá un menú para:
a. Aparcar: se le pasará el número de matrícula y lo almacenará a no ser que esté lleno.
b. Desaparcar: Muestra la matrícula del coche a desaparcar o bien un mensaje informando
cadena vacía si el parking está vacío.
c. Mostrar la lista de las matrículas de los coches que hay en el parking, por orden inverso al
de llegada, es decir primero el último en llegar
Nota: Usa los métodos que meten y sacan por el principio de la lista: addFirst, removeFirst

Enunciado 15:
Haz una versión del ejercicio 1.1. pero muestre los coches por orden de llegada. Recordemos
que en ese ejercicio se añadían los elementos en la lista por el principio, en la primera posición. Por
lo tanto, al mostrar el ArrayList con un for…each los mostraba por el orden inverso al de llegada.
Ahora queremos lo contrario, que muestre la lista de final a principio. Pista: iterador descendente.
 */
package dam108t3_colecciones;

import java.util.*;

public class dam108t3e0115 {

    public static Scanner teclado = new Scanner(System.in);
    public static LinkedList<Integer> garaje;
    public static Iterator<Integer> iter;

    public static void main(String[] args) {
        garaje = new LinkedList<>();

        int opcion;
        do {
            opcion = menu();
        } while (opcion != 0);
    } // Fin main

    public static int menu() {
        int mm, opt;
        System.out.println("1. Aparcar");
        System.out.println("2. Desaparcar");
        System.out.println("3. Mostrar Lista de Matriculas");
        System.out.println("0. Salir");
        opt = teclado.nextInt();

        switch (opt) {
            case 1:
                System.out.println("Introduce Matricula");
                mm = teclado.nextInt();
                boolean aparcado = aparcar(mm);
                if (aparcado) {
                    System.out.println("Se ha aparcado el coche!");
                } else {
                    System.out.println("No se ha podido aparcar el coche");
                }
                break;
            case 2:
                if (!garaje.isEmpty()) {
                    desAparcar();
                    System.out.println("Se ha retirado el coche");
                } else {
                    System.out.println("Este coche no esta en el garaje!");
                }
                break;
            case 3:
                mostrarEstado();
                break;

        }
        return opt;
    }

    public static boolean aparcar(int mm) {
        if (garaje.size() < 10) {
            garaje.addFirst(mm);
            return true;
        } else {
            return false;
        }
    }

    public static void desAparcar() {
        garaje.removeFirst();
    }

    public static void mostrarEstado() {
        iter = garaje.descendingIterator();
        System.out.println("Lista de Matriculas de los coches que hay en el Garaje:\n");

        while (iter.hasNext()) {
            String item = String.valueOf(iter.next());
            System.out.println(item);
        }
        System.out.println();
    }
} // Fin class
