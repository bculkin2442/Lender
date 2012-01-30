package org.scorpo.lender.model.patron;

/**
 * Serves as the contact info for patrons.
 * Contains a {@link PhoneNumber} and contained in a {@link Person}
 * @see PhoneNumber
 * @see Person
 *
 * @author cromer33
 */
public class Contact implements java.io.Serializable {

    /**
     * Their phone number.
     * Encapsulated in a {@link PhoneNumber}
     * @see PhoneNumber
     *
     */
    protected PhoneNumber Number;

    /**
     * Their email address
     *
     */
    protected String email;

    /**
     * Constructs a contact from its component parts
     * Uses a {@link PhoneNumber} to make this class simpler and smaller
     * @see PhoneNumber
     * @param email their email address
     * @param Number their phone number
     */
    public Contact(String email, PhoneNumber Number) {
        this.email  = email;
        this.Number = Number;
    }

    /**
     * Gets their email address
     *
     *
     * @return their email address
     */
    public String getEmail() {
        return email;
    }

    /**
     * Set the value of email
     *
     *
     * @param email the new email address
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Gets their phone number
     *
     *
     * @return their phone number
     */
    public PhoneNumber getNumber() {
        return Number;
    }

    /**
     * Sets their phone number
     *
     *
     * @param Number their new phone number
     */
    public void setNumber(PhoneNumber Number) {
        this.Number = Number;
    }

    /**
     * Serves as a delegate to make the process of creating tab-seperated values easier.
     *
     *
     * @return a tab seperated string containing the contents of this contact
     */
    @Override
    public String toString() {
        return email + "," + Number;
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
