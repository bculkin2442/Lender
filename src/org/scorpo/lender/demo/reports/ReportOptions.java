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
    private static ReportPrinter pr;

    public static void setPr(ReportPrinter pr) {
        ReportOptions.pr = pr;
    }
    public static synchronized void doPrint() {
        pr.print();
    }

    public ReportOptions() {
    }
    
    //Type of report
    public static enum ReportType {
        ALL,CHECKOUTS;
    }
    //How to sort on all items
    public static enum AllSortType {
        TITLE,TYPE
    }
    //How to sort on checkouts
    public static enum CheckSortType {
        DUEDATE,TYPE,PATRON
    }
    protected static ReportType type;

    /**
     * Get the value of type
     *
     * @return the value of type
     */
    public static ReportType getType() {
        return type;
    }

    /**
     * Set the value of type
     *
     * @param type new value of type
     */
    public static void setType(ReportType type) {
        ReportOptions.type = type;
    }
    
    protected static AllSortType allsort;

    /**
     * Get the value of allsort
     *
     * @return the value of allsort
     */
    public static AllSortType getAllsort() {
        return allsort;
    }

    /**
     * Set the value of allsort
     *
     * @param allsort new value of allsort
     */
    public static void setAllsort(AllSortType allsort) {
        ReportOptions.allsort = allsort;
    }
    
    protected static CheckSortType checksort;

    /**
     * Get the value of checksort
     *
     * @return the value of checksort
     */
    public static CheckSortType getChecksort() {
        return checksort;
    }

    /**
     * Set the value of checksort
     *
     * @param checksort new value of checksort
     */
    public static void setChecksort(CheckSortType checksort) {
        ReportOptions.checksort = checksort;
    }
    //Whether to use a seperate page
    protected static boolean paged;

    /**
     * Get the value of paged
     *
     * @return the value of paged
     */
    public static boolean isPaged() {
        return paged;
    }

    /**
     * Set the value of paged
     *
     * @param paged new value of paged
     */
    public static void setPaged(boolean paged) {
        ReportOptions.paged = paged;
    }
    //To print or not to print? This variable is the answer
    protected static boolean doPrint;

    /**
     * Get the value of doPrint
     *
     * @return the value of doPrint
     */
    public static boolean isDoPrint() {
        return doPrint;
    }

    /**
     * Set the value of doPrint
     *
     * @param doPrint new value of doPrint
     */
    public static void setDoPrint(boolean doPrint) {
        ReportOptions.doPrint = doPrint;
    }
    //Where to print to?
    protected static boolean file;

    /**
     * Get the value of file
     *
     * @return the value of file
     */
    public static boolean isFile() {
        return file;
    }

    /**
     * Set the value of file
     *
     * @param file new value of file
     */
    public static void setFile(boolean file) {
        ReportOptions.file = file;
    }
    //Should anything be done?
    protected static boolean okay;

    /**
     * Get the value of okay
     *
     * @return the value of okay
     */
    public static boolean isOkay() {
        return okay;
    }

    /**
     * Set the value of okay
     *
     * @param okay new value of okay
     */
    public static void setOkay(boolean okay) {
        ReportOptions.okay = okay;
    }
    //What file should be printed to?
    protected static String fleName;

    /**
     * Get the value of fleName
     *
     * @return the value of fleName
     */
    public static String getFleName() {
        return fleName;
    }

    /**
     * Set the value of fleName
     *
     * @param fleName new value of fleName
     */
    public static void setFleName(String fleName) {
        ReportOptions.fleName = fleName;
    }

    
}
