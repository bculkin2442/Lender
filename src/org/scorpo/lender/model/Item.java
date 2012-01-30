
/*
* To change this template, choose Tools | Templates
* and open the template in the editor.
 */
package org.scorpo.lender.model;

//~--- JDK imports ------------------------------------------------------------

import java.util.Date;

/**
 *
 * @author cromer33
 */
public class Item {
    protected String creator;
    protected int    key;
    protected Date   published;
    protected String title;
    protected int    type;

    public Item(int type, int key, String title, String creator, Date published) {
        this.type      = type;
        this.key       = key;
        this.title     = title;
        this.creator   = creator;
        this.published = published;
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
     * Get the value of type
     *
     * @return the value of type
     */
    public int getType() {
        return type;
    }

    /**
     * Set the value of type
     *
     * @param type new value of type
     */
    public void setType(int type) {
        this.type = type;
    }

    /**
     * Get the value of title
     *
     * @return the value of title
     */
    public String getTitle() {
        return title;
    }

    /**
     * Set the value of title
     *
     * @param title new value of title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Get the value of creator
     *
     * @return the value of creator
     */
    public String getCreator() {
        return creator;
    }

    /**
     * Set the value of creator
     *
     * @param creator new value of creator
     */
    public void setCreator(String creator) {
        this.creator = creator;
    }

    /**
     * Get the value of published
     *
     * @return the value of published
     */
    public Date getPublished() {
        return published;
    }

    /**
     * Set the value of published
     *
     * @param published new value of published
     */
    public void setPublished(Date published) {
        this.published = published;
    }

    @Override
    public String toString() {
        return new Integer(key).toString() + "," + new Integer(type).toString() + "," + title + "," + creator + ","
               + published.toString();
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
