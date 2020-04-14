/*
Realizar un programa que tenga un HashMap que almacene una plantilla de jugadores de un
equipo (Nombre, salario). El programa dispondrá de un menú que permita: añadir jugador, eliminar
jugador, consultar el salario de un jugador e incrementar el salario un 10% a un empleado.
*/
package dam108t3_colecciones;

import java.util.HashMap;
import java.util.Scanner;

public class dam108t3e0106 {
    public static HashMap<String, Double> jugadores = new HashMap<>();
    public static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {
        int opcion = 0;
        
        do{
            opcion = menu();
            if (opcion !=0){
                ejecutarOpcion(opcion);
            }
        }while(opcion != 0);
    }

    public static void ejecutarOpcion(int op){
        System.out.println("Introduce nombre:");
        String nom = teclado.nextLine();teclado.nextLine();        
        switch(op){
            case 1: añadirJug(nom) ;break;
            case 2: eliminarJug(nom) ;break;
            case 3: consultarSalarioJug(nom);break;
            case 4: incrementarSalarioJug(nom);break;
        }
    }
    
    public static void añadirJug(String nom){
        System.out.println("Introduce salario");
        double sal = teclado.nextDouble();
        jugadores.put(nom, sal);
    }
    
    public static void eliminarJug(String nom){
        jugadores.remove(nom);
    }
    
    public static void consultarSalarioJug(String nom){
        System.out.println(jugadores.get(nom)/*.doubleValue()*/);
    }
    
    public static void incrementarSalarioJug(String nom){
        System.out.println("En cuanto quieres incrementar el salario:");
        double increm = teclado.nextDouble();
        if(jugadores.containsKey(nom)){
            jugadores.put(nom, jugadores.get(nom)+increm);
        }
    }
    
    
    public static int menu(){
        System.out.println("1. Anadir Jugadror.");
        System.out.println("2. Eliminar Jugadror.");
        System.out.println("3. Consultar Salario Jugadror.");
        System.out.println("4. Incrementar Salario Jugadror.");
        System.out.println("0. Salir");
        return teclado.nextInt();
    }
}
