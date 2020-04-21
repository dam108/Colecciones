/*
Modifica el programa anterior para que no muestre el estado de la caja cada instante si no
que haga la simulación completa de las 8 horas y finalmente muestre cuantos clientes fueron
atendidos y cuantos se marcharon sin comprar nada
*/

package dam108t3_colecciones;

import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class dam108t3e0112 {
    static Scanner teclado;  
    static Random random;
    static final int HORAS = 8;
    static LinkedList <Integer> cola;
    static int instanteSiguCliente;
    static int t;
    static int contAtendido = 0,contMarchar = 0;
    
    public static void main(String[] args) {
        teclado = new Scanner(System.in);  
        random = new Random();
        cola = new LinkedList<>();
        instanteSiguCliente = random.nextInt(5) + 3; 
        
        //un bucle simula los minutos que van pasando
        for (t=1; t<=HORAS*60;t++){        
            if (!cola.isEmpty()) {                
                //reducir el tiempo de atencion del primero de la lista
                //que es el que está siendo atendido
                cola.set(0,cola.getFirst()-1);
                //si ese tiempo es cero, acabó de atenderlo. Sale de la cola
                if (cola.getFirst()==0){
                    cola.removeFirst(); contAtendido++;
                }
                if ( cola.size() > 5){
//                    System.out.println("Esta persona se ha ido, porque tiene a 5 personas delante y no puede esperar tanto tiempo.");
                    cola.removeLast(); contMarchar++;
                }
            }
            //se añade un nuevo cliente a a la lista (instante aleatorio)
            if (t == instanteSiguCliente) {
               cola.addLast(random.nextInt(10)+3);
               //se genera el instante de llegada del próximo cliente
               instanteSiguCliente += random.nextInt(5) + 3;
            }
//            mostrarCola();
        }     
        mostrarInfoFinal();
    }
    
    static void mostrarInfoFinal(){
        System.out.println("Han pasado ya "+HORAS+" Horas");
        System.out.println("Se han atendido --> "+contAtendido+" personas");
        System.out.println("Se han ido sin ser antendidos --> "+contMarchar+" personas");
    }
    
    static void mostrarCola(){
        System.out.println("hay "+cola.size()+" personas en la cola");
        System.out.print("Minuto: " + t);
        System.out.println("    (Sig cli llegará en el minuto " + instanteSiguCliente +")");
        for (int i=0;i<cola.size();i++) {
            System.out.printf("%02d",cola.get(i));
            if (i==0) System.out.println(" <<< Atendiendo (tiempo para terminar)");
            else System.out.println(" <<< Esperando (tiempo de atención cuando le toque)");
        }    
        System.out.println("---------------\nPulsa");
        teclado.nextLine();           
    }
}
