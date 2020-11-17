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
public class Ejercicios {
    public void practica6(){
        System.out.println("    ################## PRÁCTICA 6 ###################    ");
        ejercicio2();
    }
    public void practica7(){
        System.out.println("    ################## PRÁCTICA 7 ###################    ");
        ejercicio5();
        ejercicio6();
    }
    
    public void ejercicio2(){
    	// EL INCISO A
    	int V = 5; // Cantidad de nodos del grafo.
        Graph graph = new Graph(V);
        System.out.println("\n\t # Implementación de lista de adyacencia de un grafo: # \n\n");
        graph.addEdge(0,1);
        graph.addEdge(0,4);
        graph.addEdge(1,2);
        graph.addEdge(1,3);
        graph.addEdge(1,4);
        graph.addEdge(2,3);
        graph.addEdge(3,4);
        graph.printGraph(graph);
        graph.clear();

    	// EL INCISO B
        
        System.out.println("\n\t # Implementación de lista de adyacencia de un grafo DIRIGIDO: # \n\n");
        graph.addEdgeDirected(0,1);
        graph.addEdgeDirected(0,4);
        graph.addEdgeDirected(1,2);
        graph.addEdgeDirected(1,4);
        graph.addEdgeDirected(1,3);
        graph.addEdgeDirected(2,3);
        graph.addEdgeDirected(3,4);
        graph.printGraph(graph); 
    }
    public void ejercicio3(){
    }
    public void ejercicio4(){
    }
    public void ejercicio5(){
        System.out.println("\n\t # Ejercicio 5 -  # \n\n");
        int tamanioG1=8;
        Graph g1 = new Graph(tamanioG1);
        g1.addEdge(2,3);
        g1.addEdge(2,5);
        g1.addEdge(3,4);
        g1.addEdge(2,2);
        g1.addEdge(4,6);
        g1.addEdge(0,7);
        g1.addEdge(6,2);
        // g1.addEdge(8,6); // Esta arista no sería válida porque excede el índice máximo, este inicia con CERO.
        g1.addEdge(0,6);
        g1.addEdge(3,7);
        g1.BFS(2);

        System.out.println("---> Implementación de un grafo en diferentes vértices <---");
        // Creación del grafo solicitado
        int tamanioG2=8;
        Graph g2 = new Graph(tamanioG2);
        g2.addEdge(0,2);
        g2.addEdge(0,6);
        g2.addEdge(0,4);
        g2.addEdge(1,5);
        g2.addEdge(3,7);
        g2.addEdge(4,5);
        g2.addEdge(4,7);
        g2.addEdge(5,7);
        g2.DFS(3);
        System.out.println();
        g2.DFS(2);
        System.out.println();
        g2.DFS(7);
        System.out.println();

        System.out.println("---> Implementación con 3 grafos diferentes <---");
        // Creación del grafo 1
        int tamaniodegrafos = 4;
        Graph e6g1 = new Graph(4);

        System.out.println();
        Graph e6g2 = new Graph(4);
        // Creación del grafo 1
        System.out.println();
        // Creación del grafo 1
        Graph e6g3 = new Graph(4);
        System.out.println();
    }
    public void ejercicio6(){
        // System.out.println("\n\t # Ejercicio 6  # \n\n");
    }
    
    public void ejercicio7(){
    }
    public void ejercicio8(){
    }
}
