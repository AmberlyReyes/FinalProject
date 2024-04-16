package sistemaDeRutas;

import java.util.ArrayList;

public class Location {
	
	private String id;
    private String name;
    private ArrayList<Edge> edges;
    
	public Location(String id, String name, ArrayList<Edge> edges) {
		super();
		this.id = id;
		this.name = name;
		this.edges = edges;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Edge> getEdges() {
		return edges;
	}

	public void setEdges(ArrayList<Edge> edges) {
		this.edges = edges;
	}
    
	
    
    
	
	
   

}
