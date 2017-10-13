/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diccionarios;

import java.util.Map;
import java.util.Map.Entry;

/**
 *
 * @author eduardo
 */
public class Funciones {
   
    public static void ImprimeMetodos(Map<Integer,String> treeMap)
    {
        System.out.println("******** Trabajando con los metodos de Map ********"); 
        System.out.println("Mostramos el numero de elementos que tiene el TreeMap: treeMap.size() = " + treeMap.size());
        System.out.println("Vemos si el TreeMapesta vacio: treeMap.isEmpty() = " + treeMap.isEmpty());
        System.out.println("Obtenemos un elemento del Map pasandole la clave 6: treeMap.get(6) = " + treeMap.get(6));
        System.out.println("Borramos un elemento del Map, el 18 : treeMap.remove(18) = " + treeMap.remove(18));
        System.out.println("Vemos que pasa si queremos obtener la clave 18 que ya no existe: treeMap.get(18) = " + treeMap.get(18));
        System.out.println("Vemos si existe un elemento con la clave 18: treeMap.containsKey(18) = " + treeMap.containsKey(18));
        System.out.println("Vemos si existe un elemento con la clave 1: treeMap.containsKey(1) = " + treeMap.containsKey(1));
        System.out.println("Vemos si existe el valor 'Villa' en el Map: treeMap.containsValue('Villa') = " + treeMap.containsValue("Villa"));
        System.out.println("Vemos si existe el valor 'Ricardo' en el Map: treeMap.containsValue('Ricardo') = " + treeMap.containsValue("Ricardo"));
        System.out.println("Borramos todos los elementos del Map: treeMap.clear()"); treeMap.clear();
        System.out.println("Comprobamos si hemos eliminado viendo su tamanio: treeMap.size() = " + treeMap.size());
        System.out.println("Lo comprobamos tambien viendo si esta vacio: treeMap.isEmpty() = " + treeMap.isEmpty());
        
    }
    
    public static void ImprimeAsArray(Map<Integer,String> map)
    {
        System.out.println("Foreach: Forma alternativa para recorrer los Map mostrando la Clave y el Valor: ");
        for (Entry<Integer,String> jugador : map.entrySet()) {
            Integer clave = jugador.getKey();
            String valor = jugador.getValue();
            System.out.println(clave + " -> " + valor);
        } 
    }
    
    public static void ImprimeAsArrayJugadorSeleccion(Map<String,JugadorSeleccion> map)
    {
        System.out.println("Foreach: Forma alternativa para recorrer los Map mostrando la Clave y el Valor: ");
        for (Entry<String,JugadorSeleccion> jugador : map.entrySet()) {
            String clave = jugador.getKey();
            JugadorSeleccion valor = jugador.getValue();
            System.out.println(clave + " -> " + valor);
        }
        
    }
    
    
    public static void ComparaObjetosMap(JugadorSeleccion jugador, Map<String,JugadorSeleccion> map)
    {
        
        String nombre = jugador.getNombre();
        System.out.format("Esta este objeto '%s' en el Map: map.containsValue('%s')", nombre, nombre);
        System.out.println(" = " + map.containsValue(jugador));
    }
    
    
} //END

