package sistemaDeRutas;

import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;

public class DijkstraAlgorithm {
	 private Graph grafo;
	
	 public DijkstraAlgorithm(Graph grafo) {
	        this.grafo = grafo;
	    }
	 
	 //ta en modificacion

	   /* public Map<Location, Integer> calcularCaminoMasCortoDesdeOrigen(Location origen) {
	        Map<Location, Integer> distancias = new HashMap<>();
	        PriorityQueue<Location> colaPrioridad = new PriorityQueue<>(Comparator.comparingInt(distancias::get));
	        Set<Location> visitados = new HashSet<>();

	        // Inicializar distancias a infinito, excepto el origen que es 0
	        for (Location ubicacion : grafo.getLocations()) {
	            distancias.put(ubicacion, Integer.MAX_VALUE);
	        }
	        distancias.put(origen, 0);

	        // Añadir origen a la cola de prioridad
	        colaPrioridad.add(origen);

	        while (!colaPrioridad.isEmpty()) {
	            Location actual = colaPrioridad.poll(); // Obtener la ubicación con la distancia tentativa más pequeña
	            visitados.add(actual);

	            for (Edge arista : actual.getEdges()) {
	                Location vecino = arista.getDestination();
	                if (!visitados.contains(vecino)) {
	                    int nuevaDistancia = distancias.get(actual) + arista.getWeight();
	                    if (nuevaDistancia < distancias.get(vecino)) {
	                        distancias.put(vecino, nuevaDistancia);
	                        colaPrioridad.add(vecino);
	                    }
	                }
	            }
	        }

	        return distancias;
	    }
*/
}
