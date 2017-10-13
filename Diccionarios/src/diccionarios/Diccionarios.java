/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diccionarios;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

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
        
        System.out.println("~~~~HASHMAP~~~~");
        //Uso de HashMap
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Casillas");
        map.put(3, "Pique");
        map.put(11, "Capdevila");
        map.put(16, "Busquets");
        map.put(18, "Pedrito");
        map.put(7, "Villa");
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
        
        System.out.println("");
        System.out.println("~~~~TREEHMAP~~~~");
        //Uso de TreeMap
        Map<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(1, "Casillas");
        treeMap.put(3, "Pique");
        treeMap.put(11, "Capdevila");
        treeMap.put(16, "Busquets");
        treeMap.put(18, "Pedrito");
        treeMap.put(7, "Villa");
        treeMap.put(15, "Ramos");
        treeMap.put(5, "Puyol");
        treeMap.put(5, "Xabi Alonso");
        treeMap.put(8, "Xavi Hernandez");
        treeMap.put(6, "Iniesta");
        
        //Imprimimos el Map con un iterador
        it = treeMap.keySet().iterator();
        while(it.hasNext())
        {
            Integer key = (int)it.next();
            System.out.println("Clave: " + key + " -> Valor: " + treeMap.get(key));
            
        }
        
        System.out.println("");
        System.out.println("~~~~LINKEDHASHMAP~~~~");
        //Uso de LinkedHashMap
        Map<Integer,String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(1, "Casillas");
        linkedHashMap.put(3, "Pique");
        linkedHashMap.put(11, "Capdevila");
        linkedHashMap.put(16, "Busquets");
        linkedHashMap.put(18, "Pedrito");
        linkedHashMap.put(7, "Villa");
        linkedHashMap.put(15, "Ramos");
        linkedHashMap.put(5, "Puyol");
        linkedHashMap.put(5, "Xabi Alonso");
        linkedHashMap.put(8, "Xavi Hernandez");
        linkedHashMap.put(6, "Iniesta");
        
        //Imprimimos el Map con un iterador
        it = linkedHashMap.keySet().iterator();
        while(it.hasNext())
        {
            Integer key = (int)it.next();
            System.out.println("Clave: " + key + " -> Valor: " + linkedHashMap.get(key));
        }
        
        //Imprimimos los metodos
        System.out.println("");
        System.out.println("Llamamos a algunas de las funciones");
        Funciones.ImprimeMetodos(treeMap);
        
        
        //Imprimimos como Array
        System.out.println("");
        Funciones.ImprimeAsArray(linkedHashMap);
        
    }  //main
    
}
