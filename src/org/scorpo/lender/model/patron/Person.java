
/*
* To change this template, choose Tools | Templates
* and open the template in the editor.
 */
package org.scorpo.lender.model.patron;

/**
 *
 * @author cromer33
 */
public class Person {
    protected Address address;
    protected Contact contact;
    protected Name    name;

    public Person(Name name, Address address, Contact contact) {
        this.name    = name;
        this.address = address;
        this.contact = contact;
    }

    /**
     * Get the value of name
     *
     * @return the value of name
     */
    public Name getName() {
        return name;
    }

    /**
     * Set the value of name
     *
     * @param name new value of name
     */
    public void setName(Name name) {
        this.name = name;
    }

    /**
     * Get the value of address
     *
     * @return the value of address
     */
    public Address getAddress() {
        return address;
    }

    /**
     * Set the value of address
     *
     * @param address new value of address
     */
    public void setAddress(Address address) {
        this.address = address;
    }

    /**
     * Get the value of contact
     *
     * @return the value of contact
     */
    public Contact getContact() {
        return contact;
    }

    /**
     * Set the value of contact
     *
     * @param contact new value of contact
     */
    public void setContact(Contact contact) {
        this.contact = contact;
    }

    @Override
    public String toString() {
        return name + "," + address + "," + contact;
    }
}


