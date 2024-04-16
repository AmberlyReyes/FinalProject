package sistemaDeRutas;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class KruskalAlgorithm {
	 private Graph grafo;

	    public KruskalAlgorithm(Graph grafo) {
	        this.grafo = grafo;
	    }

	    public List<Edge> calcularArbolRecubrimientoMinimo() {
	        List<Edge> mst = new ArrayList<>();
	        // A priority queue to sort edges by their weights
	      /*  PriorityQueue<Edge> colaPrioridadAristas = new PriorityQueue<>(Comparator.comparingInt(Edge::getWeight));
	        // Using a union-find data structure to manage and merge disjoint sets
	        //modificar la idea de unionFind
	        UnionFind unionFind = new UnionFind(grafo.getLocations().size());

	        // Add all edges to the priority queue
	        for (Location location : grafo.getLocations()) {
	            colaPrioridadAristas.addAll(location.getEdges());
	        }

	        while (!colaPrioridadAristas.isEmpty() && mst.size() < grafo.getLocations().size() - 1) {
	            Edge edge = colaPrioridadAristas.poll(); // Get the smallest edge
	            // Check if adding this edge would form a cycle
	            if (unionFind.find(edge.getSource().getId()) != unionFind.find(edge.getDestination().getId())) {
	                mst.add(edge); // Add edge to MST
	                unionFind.union(edge.getSource().getId(), edge.getDestination().getId()); // Merge sets
	            }
	        }*/

	        return mst;
	    }

}
