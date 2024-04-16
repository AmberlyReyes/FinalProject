package sistemaDeRutas;

public class FloydWarshallAlgorithm {
	
	 private Graph graph;
	    private int[][] dist;
	    private int INF = Integer.MAX_VALUE / 2; // To avoid integer overflow

	    public FloydWarshallAlgorithm(Graph graph) {
	        this.graph = graph;
	       // initializeDistanceMatrix();
	        floydWarshall();
	    }

	  //  private void initializeDistanceMatrix() {
	        //int size = graph.getLocations().size();
	        //dist = new int[size][size];

	        // Initialize the distance matrix
	    /*    for (int i = 0; i < size; i++) {
	            for (int j = 0; j < size; j++) {
	                if (i == j) {
	                    dist[i][j] = 0; // Distance from a vertex to itself is 0
	                } else {
	                    dist[i][j] = INF; // Initialize distances to infinity
	                }
	            }
	        }
*/
	        /*// Fill the distance matrix with existing edge weights
	        for (Location location : graph.getLocations()) {
	            int id1 = location.getId();
	            for (Edge edge : location.getEdges()) {
	                int id2 = edge.getDestination().getId();
	                dist[id1][id2] = edge.getWeight();
	            }
	        }
	    }*/

	    private void floydWarshall() {
	        int size = graph.getLocations().size();
	        // Implement the Floyd-Warshall algorithm
	        for (int k = 0; k < size; k++) {
	            for (int i = 0; i < size; i++) {
	                for (int j = 0; j < size; j++) {
	                    if (dist[i][k] != INF && dist[k][j] != INF && dist[i][k] + dist[k][j] < dist[i][j]) {
	                        dist[i][j] = dist[i][k] + dist[k][j];
	                    }
	                }
	            }
	        }
	    }

	    public int getShortestDistance(int sourceId, int destinationId) {
	        return dist[sourceId][destinationId];
	    }

}
