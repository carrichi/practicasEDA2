/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica5carrichiroberto;

/**
 *
 * @author carl
 */

import java.util.HashMap;

public class Ejercicio1{
    public void main(){
        HashMap<Integer, String> map = new HashMap<>();
        map.put(317212,"Roberto Carlos Carrichi de la Cruz");
        map.put(513513,"Ian Dasain Reynoso Ocón");
        map.put(141517,"Claudia Cruz García");
        map.put(425322,"María del Rocío Carrichi de la Cruz");
        map.put(523213,"Dulce Carrichi de la Cruz");
        map.put(657573,"Ámbar Carrichi de la Cruz");

// ********************************************************************************
        System.out.println("\n\t# Uso de los metodos \"Contains\" # ");

        System.out.println("\n-> Uso de containsKey() ");
        System.out.println("\nmap = "+map);
        System.out.println("Se verificará si se encuentra la clave 3317212:");
        System.out.println("Instrucción: map.containsKey(3317212)");
        System.out.println(map.containsKey(3317212));
        System.out.println("Se verificará si se encuentra la clave 10:");
        System.out.println("Instrucción: map.containsKey(10)");
        System.out.println(map.containsKey(10));

// ********************************************************************************
        System.out.println("\n-> Uso de containsValue() ");
        System.out.println("\nmap = "+map);
        System.out.println("Se verificará si se encuentra el valor \"Roberto Carlos Carrichi de la Cruz\":");
        System.out.println("Instrucción: map.containsValue(\"Roberto Carlos Carrichi de la Cruz\")");
        System.out.println(map.containsValue("Roberto Carlos Carrichi de la Cruz"));
        System.out.println("Se verificará si se encuentra el valor \"Edgar Tista García\":");
        System.out.println("Instrucción: map.containsValue(\"Edgar Tista García\")");
        System.out.println(map.containsValue("Edgar Tista García"));
        
// ********************************************************************************
        System.out.println("\n\t# Uso de equals() # ");
        System.out.println("Se verificará si son iguales dos mapas: ");
        HashMap<Integer, String> map1 = new HashMap<>();
        map1.put(123456,"Juan Carlos Torres Pérez");
        System.out.println("El contenido de map1 es: "+map1);
        HashMap<Integer, String> map2 = new HashMap<>();
        map2.put(123456,"Juan Carlos Torres Pérez");
        System.out.println("El contenido de map2 es: "+map2);
        System.out.println("Se verificará si son iguales dos mapas: ");
        System.out.println("Instrucción: map1.equals(map2)");
        System.out.println(map1.equals(map2));
        System.out.println("Se añadirá la clave y registro <312327, \"Jesus Razo Gutiérrez\"> al contenido de map2 y se llamará a la función de nuevo.");
        System.out.println("Instrucción: map2.put(312327,\"Jesus Razo Gutiérrez\")");
        map2.put(312327,"Jesus Razo Gutiérrez");
        System.out.println("Instrucción: map1.equals(map2)");
        System.out.println(map1.equals(map2));

// ********************************************************************************
        System.out.println("\n\t # Uso de get() # ");
        System.out.println("Se tratará de obtener el valor que tenga la clave 317212, (Se sabe que el \"registro\" existe.");
        System.out.println("Intrucción: map.get(317212)");
        System.out.println(map.get(317212));
        System.out.println("Se tratará de obtener el valor que tenga la clave 10. (Se sabe que no existe ese \"registro\")");
        System.out.println("Intrucción: map.get(10)");
        System.out.println(map.get(10));

// ********************************************************************************
        System.out.println("\n\t# Uso de put() # ");
        System.out.println("Se añadirá un elemento a la tabla Hash con los valores <100932, \"Edgar Tista García\">");
        System.out.println("Intrucción: map.put(100932, \"Edgar Tista García\")");
        map.put(100932,"Edgar Tista García");
        System.out.println("Se comprobará la existencia de la clave y el valor.");
        System.out.println("Intrucción: map.containsKey(100932)");
        System.out.println(map.containsKey(100932));
        System.out.println("Intrucción: map.containsValue(\"Edgar Tista García\")");
        System.out.println(map.containsValue("Edgar Tista García"));

// ********************************************************************************
        System.out.println("\n\t# Uso de remove() # ");
        System.out.println("Se eliminará el \"registro\" que tenga la clave 4.");
        System.out.println("En este ejemplo el registro es: <141517,\"Claudia Cruz García\">");
        System.out.println("Intrucción: map.remove(141517)");
        System.out.println("Se eliminó el valor: "+map.remove(151417));
        System.out.println("Se verificará que si el registro existe en la tabla Hash.");
        System.out.println("Intrucción: map.containsValue(\"Claudia Cruz García\")");
        System.out.println(map.containsValue("Claudia Cruz García"));

// ********************************************************************************
        System.out.println("\n\t# Uso de size() # ");
        System.out.println("Se obtendrá la cantidad de \"registros\" que tiene la tabla Hash");
        System.out.println("Intrucción: map.size()");
        System.out.println(map.size());
        System.out.println("Se añadirá un elemento y se verificará de nuevo la cantidad de \"registros\"");
        System.out.println("Intrucción: map.put(168728,\"Daniela Torres Zurita\")");
        map.put(16,"Daniela Torres Zurita");
        System.out.println("Intrucción: map.size()");
        System.out.println(map.size());

// ********************************************************************************
        System.out.println("\n\t# Uso de clear() # ");
        System.out.println("El contenido actual de la tabla es: "+map2);
        System.out.println("Se limpiará el contenido de la tabla.");
		System.out.println("Instrucción: map2.clear()");
        map2.clear();
        System.out.println("El contenido final de la tabla es: "+map2);

// ********************************************************************************
        System.out.println("\n\t# Uso de isEmpty() # ");
        System.out.println("map = "+map);
        System.out.println("Se verificará si se encuentra vacía.");
        System.out.println("Intrucción: map.isEmpty()");
        System.out.println(map.isEmpty());
        System.out.println("Se eliminará el contenido y se volverá a verificar.");
        System.out.println("Intrucción: map.clear()");
        map.clear();
        System.out.println("Intrucción: map.isEmpty()");
        System.out.println(map.isEmpty());

        System.out.println("\n Has terminado de ver las pruebas de los métodos.\n");
    }	
}