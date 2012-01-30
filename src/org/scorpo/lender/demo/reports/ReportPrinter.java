/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.scorpo.lender.demo.reports;

/**Printer class to print the report
 *
 * @author cromer33
 */
public class ReportPrinter {
    private ReportOptions rp;

    public ReportPrinter(ReportOptions rp) {
        this.rp = rp;
    }
    
    public void print() {
        if(rp.isFile()) {
            printToFile();
        }
        if (rp.isDoPrint()) {
            printToPrinter();
        }
        else {
            printToScreen();
        }
    }

    private void printToFile() {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    private void printToPrinter() {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    private void printToScreen() {
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
