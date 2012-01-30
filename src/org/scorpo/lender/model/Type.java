
/*
* To change this template, choose Tools | Templates
* and open the template in the editor.
 */
package org.scorpo.lender.model;

/**
 * Represents the Type of items in the library.
 *
 * @author cromer33
 */
public class Type {
    //Description of the type
    protected String des;
    //Unique key used to give items types, because it saves space
    protected int    key;
    /**Creates a Type from its component parts
     * 
     * @param des The description of the type
     * @param key A unique key used to give items types, because it saves space
     */
    public Type(String des, int key) {
        this.des = des;
        this.key = key;
    }

    /**
     * Get the unique key for this type
     *
     * @return the current key
     */
    public int getKey() {
        return key;
    }
    /**Creates a tab seperated string for serialization
     * 
     * @return 
     */
    @Override
    public String toString() {
        return new Integer(key).toString() + "," + des;
    }

    /**
     * Get the value of des
     *
     * @return the value of des
     */
    public String getDes() {
        return des;
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
