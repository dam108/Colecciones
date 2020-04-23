/*
Realizar un programa que tenga un HashMap que almacene una plantilla de jugadores de un
equipo (Nombre, salario). La plantilla tiene un máximo de 25 jugadores. El programa dispondrá de
menú que permita: añadir jugador, eliminar jugador, lista jugadores con su salario y que tenga
también opción que permita introducir un salario y muestre los jugadores que tiene un salario
parecido al introducido (por “parecido” entendemos que el salario del jugador esté en un rango de
6000 euros arriba o abajo respecto al introducido)
 */
package dam108t3_colecciones;

import java.util.HashMap;
import java.util.Scanner;

public class dam108t3e0107 {
    public static HashMap <String, Double> jugadores = new HashMap<>();
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
    
    public static void añadirJug(){
        if(jugadores.size() < 25){
            System.out.println("Introduce nombre:");
            teclado.nextLine();
            String nom = teclado.nextLine();
//            System.out.println(nom);
            System.out.println("Introduce salario");
            double sal = teclado.nextDouble();
            jugadores.put(nom, sal);
        }
        else System.out.println("No se pueden Introducir mas jugadores.");

    }
    
    public static void eliminarJug(){
        System.out.println("Introduce nombre:");
        String nom = teclado.nextLine();teclado.nextLine(); 
        jugadores.remove(nom);
    }
    
    public static void listarJug(){ // imprimir hashMap
        for (String x : jugadores.keySet()) {
            System.out.println("El jugador: "+x+" tiene "+jugadores.get(x)+"€ de salario anual.");
        }
    }
    
    public static void mostrarJugConSalarioParecido(){
        System.out.println("Introduce un salario:");
        double sal = teclado.nextDouble();
        for ( String x : jugadores.keySet()  ){
            if(sal >= jugadores.get(x)-6000 && sal <= jugadores.get(x)+6000){
                System.out.println("El salario de "+x+" es de "+jugadores.get(x)+"€.");
            }
        }
    }
    
    public static void ejecutarOpcion(int op){
      
        switch(op){
            case 1: añadirJug() ;break;
            case 2: eliminarJug() ;break;
            case 3: listarJug();break;
            case 4: mostrarJugConSalarioParecido(); break;
        }
    }
    
    public static int menu(){
        System.out.println("1. Anadir Jugadror.");
        System.out.println("2. Eliminar Jugadror.");
        System.out.println("3. Listar Jugadrores con su salario.");
        System.out.println("4. Listar jugadores con salario dentro de un rango.");
        System.out.println("0. Salir");
        return teclado.nextInt();
    }
}
