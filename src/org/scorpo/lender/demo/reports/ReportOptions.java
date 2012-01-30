/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.scorpo.lender.demo.reports;

/**Option class to contain report options
 *
 * @author cromer33
 */
public class ReportOptions {
    //Type of report
    public enum ReportType {
        ALL,CHECKOUTS;
    }
    //How to sort on all items
    public enum AllSortType {
        TITLE,TYPE
    }
    //How to sort on checkouts
    public enum CheckSortType {
        DUEDATE,TYPE,PATRON
    }
    protected ReportType type;

    /**
     * Get the value of type
     *
     * @return the value of type
     */
    public ReportType getType() {
        return type;
    }

    /**
     * Set the value of type
     *
     * @param type new value of type
     */
    public void setType(ReportType type) {
        this.type = type;
    }
    
    protected AllSortType allsort;

    /**
     * Get the value of allsort
     *
     * @return the value of allsort
     */
    public AllSortType getAllsort() {
        return allsort;
    }

    /**
     * Set the value of allsort
     *
     * @param allsort new value of allsort
     */
    public void setAllsort(AllSortType allsort) {
        this.allsort = allsort;
    }
    
    protected CheckSortType checksort;

    /**
     * Get the value of checksort
     *
     * @return the value of checksort
     */
    public CheckSortType getChecksort() {
        return checksort;
    }

    /**
     * Set the value of checksort
     *
     * @param checksort new value of checksort
     */
    public void setChecksort(CheckSortType checksort) {
        this.checksort = checksort;
    }
    //Whether to use a seperate page
    protected boolean paged;

    /**
     * Get the value of paged
     *
     * @return the value of paged
     */
    public boolean isPaged() {
        return paged;
    }

    /**
     * Set the value of paged
     *
     * @param paged new value of paged
     */
    public void setPaged(boolean paged) {
        this.paged = paged;
    }
    //To print or not to print? This variable is the answer
    protected boolean doPrint;

    /**
     * Get the value of doPrint
     *
     * @return the value of doPrint
     */
    public boolean isDoPrint() {
        return doPrint;
    }

    /**
     * Set the value of doPrint
     *
     * @param doPrint new value of doPrint
     */
    public void setDoPrint(boolean doPrint) {
        this.doPrint = doPrint;
    }
    //Where to print to?
    protected boolean file;

    /**
     * Get the value of file
     *
     * @return the value of file
     */
    public boolean isFile() {
        return file;
    }

    /**
     * Set the value of file
     *
     * @param file new value of file
     */
    public void setFile(boolean file) {
        this.file = file;
    }
    //Should anything be done?
    protected boolean okay;

    /**
     * Get the value of okay
     *
     * @return the value of okay
     */
    public boolean isOkay() {
        return okay;
    }

    /**
     * Set the value of okay
     *
     * @param okay new value of okay
     */
    public void setOkay(boolean okay) {
        this.okay = okay;
    }
    //What file should be printed to?
    protected String fleName;

    /**
     * Get the value of fleName
     *
     * @return the value of fleName
     */
    public String getFleName() {
        return fleName;
    }

    /**
     * Set the value of fleName
     *
     * @param fleName new value of fleName
     */
    public void setFleName(String fleName) {
        this.fleName = fleName;
    }

    
}
