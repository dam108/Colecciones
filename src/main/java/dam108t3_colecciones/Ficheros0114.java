package dam108t3_colecciones;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.TreeMap;

public class Ficheros0114 {
    public static final String SEPARATOR=";";
    public static TreeMap<String, Colecciones0114> listado = new TreeMap<>();
    
    Ficheros0114(){
        
    }
    
    public static TreeMap leerArchivo(){
        File f = new File("archivos\\paises2019.csv");
        try(FileReader fr = new FileReader(f);
            BufferedReader bfr = new BufferedReader(fr)){
        
            while(bfr.readLine() != null){
                String [] campos = bfr.readLine().split(SEPARATOR);
                
                listado.put(campos[0], new Colecciones0114(campos[1], campos[2]));
                
            }
            return listado;
        }catch(Exception e){System.err.printf("%nError: %s",e.getMessage());return null;}
    }
    
}
