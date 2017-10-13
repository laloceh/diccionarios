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
        
        //Probamos usando un objeto en el map
        //vamos a crear un TreeMap en la que la clave será el nombre del jugador 
        //y el valor será un objeto de la clase "JugadorSeleccion".
        System.out.println("");
        System.out.println("******** TreeMap con Objetos y como Clave un Sting ********");
        Map<String, JugadorSeleccion> jugadores = new TreeMap<>();
        jugadores.put("Casillas", new JugadorSeleccion(1, "Casillas", "Portero"));
        jugadores.put("Ramos", new JugadorSeleccion(15, "Ramos", "Lateral Derecho"));
        jugadores.put("Pique", new JugadorSeleccion(13, "Pique", "Central"));
        jugadores.put("Puyol", new JugadorSeleccion(5, "Puyol", "Central"));
        jugadores.put("Capdevila", new JugadorSeleccion(11, "Capdevila", "Lateral Izquierdo"));
        jugadores.put("Xabi", new JugadorSeleccion(14, "Xabi Alonso", "Medio Centro"));
        jugadores.put("Busquets", new JugadorSeleccion(16, "Busquets", "Medio Centro"));
        jugadores.put("Xavi", new JugadorSeleccion(8, "Xavi", "Centro Campista"));
        jugadores.put("Pedrito", new JugadorSeleccion(18, "Pedrito", "Interior Izquierdo"));
        jugadores.put("Iniesta", new JugadorSeleccion(6, "Iniesta", "Interior Derecho"));
        jugadores.put("Villa", new JugadorSeleccion(7, "Villa", "Delantero"));
        
        //Imprimimos
        Funciones.ImprimeAsArrayJugadorSeleccion(jugadores);
        
    }  //main
    
}
