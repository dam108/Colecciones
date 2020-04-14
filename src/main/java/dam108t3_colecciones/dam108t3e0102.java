package dam108t3_colecciones;

import java.util.LinkedList;
import java.util.Scanner;

public class dam108t3e0102 {
    public static Scanner teclado = new Scanner(System.in);
    public static LinkedList<Integer> garaje = new LinkedList<>();
    public static void main(String[] args) {
        int opcion;
        do{
            opcion = menu();
        }while(opcion != 0);
    }
    public static int menu(){
        int mm, opt;
            System.out.println("1. Aparcar");
            System.out.println("2. Desaparcar");
            System.out.println("3. Mostrar Lista de Matriculas");
            System.out.println("0. Salir");
            opt = teclado.nextInt();

            switch(opt){
                case 1:
                    System.out.println("Introduce Matricula");
                    mm = teclado.nextInt();
                    boolean aparcado = aparcar(mm);
                    if (aparcado) System.out.println("Se ha aparcado el coche!");
                    else System.out.println("No se ha podido aparcar el coche");
                    break;
                case 2:
                    if (!garaje.isEmpty()){ //comprueba si la lista esta vacia
                        desAparcar();
                        System.out.println("Se ha retirado el coche");
                    }
                    else System.out.println("Este coche no esta en el garaje!");
                    break;
                case 3:
                    mostrarEstado();break;

            }
            return opt;
    }
    
    public static boolean aparcar(int mm){
        if(garaje.size() <10){
            garaje.push(mm); //añade el elememento a las lista como si fuera un addFirst();
            return true;
        } else return false;
    }
    
    public static void desAparcar(){
            garaje.poll(); // elimina un elemento de la lista como si fuera un removeFirst();
    }
    
    public static void mostrarEstado(){
        System.out.println("Lista de Matriculas de los coches que hay en el Garaje:\n");
        for (Integer c: garaje){
            System.out.println("Matricula nº: "+c);
        }
    }
}
