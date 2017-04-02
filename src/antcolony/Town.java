/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package antcolony;

import java.awt.Point;

/**
 *
 * @author busra
 */
public class Town {

    private String name;
    private Point location;
   
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    
   
    /**
     * @return the location
     */
    public Point getLocation() {
        return location;
    }

    /**
     * @param location the location to set
     */
    public void setLocation(Point location) {
        this.location = location;
    }

}
