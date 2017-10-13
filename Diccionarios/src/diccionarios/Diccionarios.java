/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diccionarios;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 *
 * @author eduardo
 */
public class Diccionarios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Uso de HashMap
        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "Casillas");
        map.put(3, "Pique");
        map.put(11, "Capdevila");
        map.put(16, "Busquets");
        map.put(18, "Pedrito");
        map.put(7, "Vila");
        map.put(15, "Ramos");
        map.put(5, "Puyol");
        map.put(5, "Xabi Alonso");
        map.put(8, "Xavi Hernandez");
        map.put(6, "Iniesta");
        
        //Imprimimos el Map con un iterador
        Iterator it = map.keySet().iterator();
        while(it.hasNext())
        {
            Integer key = (int)it.next();
            System.out.println("Clave: " + key + " -> Valor: " + map.get(key));
            
        }
        
        
        
    }  //main
    
}
