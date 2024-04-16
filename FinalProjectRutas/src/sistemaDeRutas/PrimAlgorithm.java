package sistemaDeRutas;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.PriorityQueue;

public class PrimAlgorithm {
	
	private Graph grafo;

    public PrimAlgorithm(Graph grafo) {
        this.grafo = grafo;
    }
//EN PRUEBA
   /* public List<Edge> calcularArbolRecubrimientoMinimo(Location ubicacionInicial) {
        List<Edge> resultadoMST = new ArrayList<>();
        PriorityQueue<Edge> colaPrioridadAristas = new PriorityQueue<>(Comparator.comparingInt(Edge::getWeight));
        Set<Location> ubicacionesVisitadas = new HashSet<>();
        
        // Comienza desde la ubicaci�n arbitraria y m�rquela como visitada
        ubicacionesVisitadas.add(ubicacionInicial);
        colaPrioridadAristas.addAll(ubicacionInicial.getEdges());

        while (!colaPrioridadAristas.isEmpty()) {
            Edge aristaMasCorta = colaPrioridadAristas.poll(); // Obtiene la arista con el peso m�nimo
//Modificarnombre
            Location destino = aristaMasCorta.getDestination();
            if (!ubicacionesVisitadas.contains(destino)) {
                // A�ade la arista al resultado del �rbol de recubrimiento m�nimo
                resultadoMST.add(aristaMasCorta);
                // Marca la ubicaci�n destino como visitada
                ubicacionesVisitadas.add(destino);

                // Agrega solo las aristas que conducen a ubicaciones no visitadas
              //Modificarnombre
                for (Edge arista : destino.getEdges()) {
                    if (!ubicacionesVisitadas.contains(arista.getDestination())) {
                        colaPrioridadAristas.add(arista);
                    }
                }
            }
        }

        return resultadoMST;
    }
*/
}
