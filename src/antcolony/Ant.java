/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package antcolony;

import java.util.ArrayList;
import jdk.nashorn.internal.runtime.arrays.ArrayLikeIterator;

/**
 *
 * @author busra
 */
public class Ant {
    
  public String name;
   public ArrayList<Boolean> visited ;//town index -> true or false
    public ArrayList<Town> tours; // tour list for each ants 
    public int tourLength;
    public String bestTour; // best solition from tour list for one ant
    public Town currentTown;
}
