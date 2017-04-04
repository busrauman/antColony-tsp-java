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
public class Constant {

    private double C = 1.0; //feromon
    // trail preference
    private double alpha = 1; //important for feromon 
    // greedy preference
    private double beta = 5; // important for distance between two towns
    // trail evaporation coefficient
    private double evaporation = 0.5; // reduce pheromone quantity
    // new trail deposit coefficient;
    private double Q = 500;
    // number of ants used = numAntFactor*numTowns
    private double numAntFactor = 0.8;
    // probability of pure random selection of the next town
    private double pr = 0.01; // to move next town
    private  long  maxIteration = 5;

    /**
     * @return the C
     */
    public double getC() {
        return C;
    }

    /**
     * @return the alpha
     */
    public double getAlpha() {
        return alpha;
    }

    /**
     * @return the beta
     */
    public double getBeta() {
        return beta;
    }

    /**
     * @return the evaporation
     */
    public double getEvaporation() {
        return evaporation;
    }

    /**
     * @return the Q
     */
    public double getQ() {
        return Q;
    }

    /**
     * @return the numAntFactor
     */
    public double getNumAntFactor() {
        return numAntFactor;
    }

    /**
     * @return the pr
     */
    public double getPr() {
        return pr;
    }

    /**
     * @return the maxIteration
     */
    public long getMaxIteration() {
        return maxIteration;
    }

    /**
     * @param maxIteration the maxIteration to set
     */
    public void setMaxIteration(long maxIteration) {
        this.maxIteration = maxIteration;
    }
}
