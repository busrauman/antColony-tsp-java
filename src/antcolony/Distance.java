/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package antcolony;

/**
 *
 * @author busra
 */
public class Distance {
   private Town source;
   private Town destination;
   private long distance;
   private double pheromone;

    /**
     * @return the source
     */
    public Town getSource() {
        return source;
    }

    /**
     * @param source the source to set
     */
    public void setSource(Town source) {
        this.source = source;
    }

    /**
     * @return the destination
     */
    public Town getDestination() {
        return destination;
    }

    /**
     * @param destination the destination to set
     */
    public void setDestination(Town destination) {
        this.destination = destination;
    }

    /**
     * @return the distance
     */
    public long getDistance() {
        return distance;
    }

    /**
     * @param distance the distance to set
     */
    public void setDistance(long distance) {
        this.distance = distance;
    }

    /**
     * @return the pheromone
     */
    public double getPheromone() {
        return pheromone;
    }

    /**
     * @param pheromone the pheromone to set
     */
    public void setPheromone(double pheromone) {
        this.pheromone = pheromone;
    }
    
}
