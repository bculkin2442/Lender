package org.scorpo.lender.model.patron;

/**
 * Represents a persons name.
 * Contained within a {@link Person}
 * @see Person
 * @author cromer33
 */
public class Name implements java.io.Serializable {
    protected String first;
    protected String last;

    /**
     * Constructs a name from two parts
     *
     * @param first their first name
     * @param last their last name
     */
    public Name(String first, String last) {
        this.first = first;
        this.last  = last;
    }

    /**
     * Gets their first name
     *
     *
     * @return their first name
     */
    public String getFirst() {
        return first;
    }

    /**
     * Sets their first name
     *
     *
     * @param first their new first name
     */
    public void setFirst(String first) {
        this.first = first;
    }

    /**
     * Gets their last name
     *
     *
     * @return their last name
     */
    public String getLast() {
        return last;
    }

    /**
     * Sets their first name
     *
     *
     * @param last their new last name
     */
    public void setLast(String last) {
        this.last = last;
    }

    /**
     * A utility method to make generating tab-seperated values easier.
     * Uses delegation to make this much easier.
     * @return a tab-seperated string composed of the components
     */
    @Override
    public String toString() {
        return last + "," + first;
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
