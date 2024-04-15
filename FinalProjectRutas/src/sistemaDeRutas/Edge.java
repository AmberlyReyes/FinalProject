package sistemaDeRutas;


public class Edge {
	
    private Location startLocation;
    private Location endLocation;
    private double weight;

    public Edge(Location start, Location end, double weight) {
        this.startLocation = start;
        this.endLocation = end;
        this.weight = weight;
    }

    public Location getStartLocation() {
        return startLocation;
    }

    public Location getEndLocation() {
        return endLocation;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    
    // Additional methods like toString() etc., might be necessary
}
