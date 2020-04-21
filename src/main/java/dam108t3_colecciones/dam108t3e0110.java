package dam108t3_colecciones;

import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class dam108t3e0110 {
    static Scanner teclado;  
    static Random random;
    static final int HORAS = 8;
    static LinkedList <Integer> cola;
    static int instanteSiguCliente;
    static int t;
    
    //la cola contiene los minutos que va a requerir la atención del cajero cuando le toque.
    //al primero de la cola se le va reduciéndo en cada instante.  
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
                if (cola.getFirst()==0) cola.removeFirst();
            }
            //se añade un nuevo cliente a a la lista (instante aleatorio)
            if (t == instanteSiguCliente) {
               cola.addLast(random.nextInt(9)+2);
               //se genera el instante de llegada del próximo cliente
               instanteSiguCliente += random.nextInt(5) + 3;
            }
            mostrarCola();
        }     
    }
    static void mostrarCola(){
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

