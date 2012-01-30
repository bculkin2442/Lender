
/*
* To change this template, choose Tools | Templates
* and open the template in the editor.
 */
package org.scorpo.lender.model.patron;

/**
 *
 * @author cromer33
 */
public class PhoneNumber {
    protected int area;
    protected int first;
    protected int second;

    public PhoneNumber(int area, int first, int second) {
        this.area   = area;
        this.first  = first;
        this.second = second;
    }

    /**
     * Get the value of area
     *
     * @return the value of area
     */
    public int getArea() {
        return area;
    }

    /**
     * Set the value of area
     *
     * @param area new value of area
     */
    public void setArea(int area) {
        this.area = area;
    }

    /**
     * Get the value of first
     *
     * @return the value of first
     */
    public int getFirst() {
        return first;
    }

    /**
     * Set the value of first
     *
     * @param first new value of first
     */
    public void setFirst(int first) {
        this.first = first;
    }

    /**
     * Get the value of second
     *
     * @return the value of second
     */
    public int getSecond() {
        return second;
    }

    /**
     * Set the value of second
     *
     * @param second new value of second
     */
    public void setSecond(int second) {
        this.second = second;
    }

    @Override
    public String toString() {
        return area + "," + first + "," + second;
    }
}


