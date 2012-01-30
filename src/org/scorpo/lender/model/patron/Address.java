package org.scorpo.lender.model.patron;

/**
 * This class represents the Address of patrons.
 * Contained in a {@link Person}
 * @see Person
 * @author cromer33
 */
public class Address implements java.io.Serializable {

    /**
     * The name of their city
     *
     */
    protected String city;

    /**
     * The house number of a person
     *
     */
    protected int house;

    /**
     * Gets the name of their state.
     *
     */
    protected String state;

    /**
     * The name of their street
     *
     */
    protected String street;

    /**
     * Their zip code.
     *
     */
    protected int zip;

    /**
     * Constructs a address from its component parts
     *
     * @param house their house number
     * @param street their street name
     * @param city the name of their city
     * @param state their state name
     * @param zip their zip code
     */
    public Address(int house, String street, String city, String state, int zip) {
        this.house  = house;
        this.street = street;
        this.city   = city;
        this.state  = state;
        this.zip    = zip;
    }

    /**
     * Gets their house number
     *
     * @return their house number
     */
    public int getHouse() {
        return house;
    }

    /**
     * Serves as a delegate to make the process of creating tab-seperated values easier.
     *
     *
     * @return a tab seperated string containing the contents of this address
     */
    @Override
    public String toString() {
        return house + "," + street + "," + city + "," + state + "," + zip;
    }

    /**
     * Set their house number
     *
     * @param house new house number
     */
    public void setHouse(int house) {
        this.house = house;
    }

    /**
     * Gets their street name
     *
     *
     * @return their street name
     */
    public String getStreet() {
        return street;
    }

    /**
     * Sets their street name
     *
     *
     * @param street new street name
     */
    public void setStreet(String street) {
        this.street = street;
    }

    /**
     * Gets the name of their city
     *
     *
     * @return the name of their city
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets their city
     *
     * @param city new city name
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * Gets their state
     *
     *
     * @return their state
     */
    public String getState() {
        return state;
    }

    /**
     * Sets their state
     *
     *
     * @param state their new state
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * Gets their zip code
     *
     *
     * @return their zip code
     */
    public int getZip() {
        return zip;
    }

    /**
     * Sets their zip code
     *
     *
     * @param zip their new zip code
     */
    public void setZip(int zip) {
        this.zip = zip;
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
