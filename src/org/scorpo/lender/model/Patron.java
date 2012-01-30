
/*
* To change this template, choose Tools | Templates
* and open the template in the editor.
 */
package org.scorpo.lender.model;

/**
 *
 * @author cromer33
 */
public class Patron {
    protected org.scorpo.lender.model.patron.Person info;
    protected int                                   key;

    public Patron(int key, org.scorpo.lender.model.patron.Person info) {
        this.key  = key;
        this.info = info;
    }

    /**
     * Get the value of key
     *
     * @return the value of key
     */
    public int getKey() {
        return key;
    }

    /**
     * Get the value of info
     *
     * @return the value of info
     */
    public org.scorpo.lender.model.patron.Person getInfo() {
        return info;
    }

    /**
     * Set the value of info
     *
     * @param info new value of info
     */
    public void setInfo(org.scorpo.lender.model.patron.Person info) {
        this.info = info;
    }

    @Override
    public String toString() {
        return key + "," + info;
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
