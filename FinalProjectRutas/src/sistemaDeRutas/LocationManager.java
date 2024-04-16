package sistemaDeRutas;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


//import logico.Vacuna;


public class LocationManager implements Serializable {
	
	  /**
	 * 
	 */
	private static final long serialVersionUID = -1637215435293585128L;
	public Graph graph;
    private List<Location> misLocations;
	private List<Edge>misEdges;
    private ArrayList<User>misUsers;
    private static LocationManager manager=null;
    private static User loginUser;
	  
	public LocationManager() {
		super();
		 graph = new Graph();
	     misLocations = new ArrayList<>();
	}
	
	public List<Location> getLocations() {
        return misLocations;
    }

    public Graph getGraph() {
        return graph;
    }

	public List<Location> getMisLocations() {
		return misLocations;
	}

	public void setMisLocations(List<Location> misLocations) {
		this.misLocations = misLocations;
	}

	public static LocationManager getManager() {
		return manager;
	}

	public static void setManager(LocationManager manager) {
		LocationManager.manager = manager;
	}

	public void setGraph(Graph graph) {
		this.graph = graph;
	}
	
	public void agregarLocation(Location location) {
        misLocations.add(location);
    }
	public void agregarEdge(Edge edge) {
        misEdges.add(edge);
    }
	public Location buscarLocationByCodigo(String idLocation) {
		Location aux = null;
		boolean encontrado = false;
		int i=0;
		while (!encontrado && i<misLocations.size()) {
			if(misLocations.get(i).getId().equalsIgnoreCase(idLocation)){
				aux = misLocations.get(i);
				encontrado = true;
			}
			i++;
		}
		
		return aux;
	}
	public void eliminarLocation(Location selected) {
	    misLocations.remove(selected);
	}
	
	public void eliminarEdge(Edge selected) {
	    misEdges.remove(selected);
	}
	
	//Actualizar datos de ubicacion
	/*public void actualizarUbicacion(Location locati) {
	int index= buscarIndexEnfermedadByCode(enf.getCodEnfermedad());
	misEnfermedades.set(index, enf);
	
		
	}
	 * 
	 * 
	 * */
	
	public boolean confirmLogin(String text) {
		boolean login = false;
		for (User user : misUsers) {
			if(user.getUsername().equals(text) ){
				loginUser = user;
				login = true;
			}
		}
		return login;
	}
	

    
	
}
