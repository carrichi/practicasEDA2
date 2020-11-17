/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica6carrichiroberto;

/**
 *
 * @author carl
 */

// import java.util.Iterator;  // Por el momento esta clase no está siendo utilizada.
import java.util.LinkedList;
import java.util.Iterator;

public class Graph {
    int V; // Representará la cantidad de nodos que tiene el grafo.
    LinkedList<Integer> adjArray[];
    
    Graph (int v){
        this.V=v; // Se asigna la dimensión de el grafo. 
        adjArray = new LinkedList[v];
        for(int i=0; i<v; ++i){
            adjArray[i] = new LinkedList(); // Se asigna una lista para cada uno de los nodos del grafo.
        }
    }
    void addEdge(int v, int w){
        // Se añade la referencia de conexión en la lista de cada nodo involucrado.
        adjArray[v].add(w);
        adjArray[w].add(v);
    }
    void addEdgeDirected(int v, int w){
        // Se añade la referencia de conexión solamente en EL PRIMER NODO.
        // El primer argumento indicará el nodo de SALIDA y el segundo el nodo de ENTRADA.
        adjArray[v].add(w);
    }    
    void printGraph(Graph graph){
        for(int v=0; v<graph.V;v++){
            System.out.println("Lista de adyacencia del vértice: "+ v);
            System.out.printf("\n "+v+" ");
            for(Integer node: graph.adjArray[v]){
                System.out.printf(" -> "+ node);                
            }
            System.out.println("\n");
        }
    }
    
    void clear(){
        System.out.println("Se está limpiando el grafo... ");
        for(LinkedList<Integer> node: adjArray){
            node.clear();          
        }
        System.out.println("\nEl grafo se implió correctamente.\n");
    }
    
    // IMPLEMENTACIONES

    void BFS(int s) {
        // La variable s representará el vértice de donde se quiere empezar a recorrer.

        // Arreglo que contendrá los vértices que ya han sido visitados, tendrá el mismo
        // tamaño que el grafo.
        boolean visited[] = new boolean[V];

        // Cola que almacenará los índices de los vértices.
        LinkedList<Integer> queue = new LinkedList<Integer>();
        
        // Se marcará como visitado el vértice que fue obtenido como argumento
        // en ralidad, 's' representa EL ÍNDICE donde está contenido el vértice en el
        // grafo.
        visited[s]=true;

        // Se añade a la cola el índice que se obtuvo como argumento.
        queue.add(s);
        
        while (queue.size() != 0) {
            // Poll se refiere al proceso de "desencolar" y guardar el índice que se
            // desencoló en la variable s.
            s = queue.poll();
            
            System.out.print(s+" ");
            
            Iterator<Integer> i = adjArray[s].listIterator();

            while (i.hasNext()) {
                int n = i.next();
                if (!visited[n]) {
                    visited[n] = true;
                    queue.add(n);
                }
            }
        }
    }

    void DFSUtil(int v,boolean visited[]){
        visited[v] = true;
        System.out.print(v+" ");

        // Se genera una lista de iteradores con los vértices del grafo.
        Iterator<Integer> i = adjArray[v].listIterator();
        
        // Verifica si el iterador i aún tiene más elementos disponibles.
        while (i.hasNext()){
            // Ya que si tiene un valor extra este se guarda en una variable n. 
            int n = i.next();
            if (!visited[n]){
                DFSUtil(n, visited);
            }
        }
    }
    void DFS(int v){
        boolean visited[] = new boolean[V];
        DFSUtil(v, visited);
    }

}
