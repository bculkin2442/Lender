
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.scorpo.lender.model;

//~--- JDK imports ------------------------------------------------------------
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author cromer33
 */
public final class Checkout {

    protected Date checkedout;
    protected Date due;
    protected int item;
    protected int patron;

    public Checkout(Date checkedout, int item, int patron) {
        setCheckedout(checkedout);
        this.item = item;
        this.patron = patron;
    }

    /**
     * Get the value of item
     *
     * @return the value of item
     */
    public int getItem() {
        return item;
    }

    /**
     * Set the value of item
     *
     * @param item new value of item
     */
    public void setItem(int item) {
        this.item = item;
    }

    /**
     * Get the value of patron
     *
     * @return the value of patron
     */
    public int getPatron() {
        return patron;
    }

    /**
     * Set the value of patron
     *
     * @param patron new value of patron
     */
    public void setPatron(int patron) {
        this.patron = patron;
    }

    /**
     * Get the value of checkedout
     *
     * @return the value of checkedout
     */
    public Date getCheckedout() {
        return checkedout;
    }

    /**
     * Set the value of checkedout
     *
     * @param checkedout new value of checkedout
     */
    public void setCheckedout(Date checkedout) {
        this.checkedout = checkedout;

        Calendar cal = java.util.Calendar.getInstance();

        cal.setTime(checkedout);
        cal.add(java.util.Calendar.WEEK_OF_YEAR, 2);
        due = cal.getTime();
        if (due == null) {
            cal.setTime(checkedout);
            due = cal.getTime();
        }
    }

    /**
     * Get the value of due
     *
     * @return the value of due
     */
    public Date getDue() {
        return due;
    }

    @Override
    public String toString() {
        return item + "," + patron + "," + checkedout + "," + due;
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
