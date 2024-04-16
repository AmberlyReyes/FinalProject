package sistemaDeRutas;

import java.util.HashMap;
import java.util.Map;

public class Graph {
	
	private Map<String, Location> locations;  // Mapa de ID de ubicación a objetos Location

    public Graph() {
    	super();
        locations = new HashMap<>();
    }

    /*public void addLocation(String id) {
        if (!locations.containsKey(id)) {
            locations.put(id, new Location(id));
        }
    }*/

    public void addEdge(String fromId, String toId, double distance) {
        /*if (locations.containsKey(fromId) && locations.containsKey(toId)) {
            locations.get(fromId).addAdjacentLocation(toId, distance);
            // Si el grafo es no dirigido, añadir también la arista inversa
            locations.get(toId).addAdjacentLocation(fromId, distance);
        }*/
    }

    public Location getLocation(String id) {
        return locations.get(id);
    }

    public Map<String, Location> getLocations() {
        return locations;
    }

   
}
