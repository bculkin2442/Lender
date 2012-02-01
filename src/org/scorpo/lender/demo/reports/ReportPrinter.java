/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.scorpo.lender.demo.reports;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

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
        //If report is all items
        if (rp.type.equals(ReportOptions.ReportType.ALL)) {
            try {
                
                OutputStream os = new FileOutputStream(rp.fleName + ".txt");
                
            } catch (FileNotFoundException ex) {
                Logger.getLogger(ReportPrinter.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }

    private void printToPrinter() {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    private void printToScreen() {
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
