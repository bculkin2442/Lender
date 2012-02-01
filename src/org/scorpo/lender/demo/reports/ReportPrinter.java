/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.scorpo.lender.demo.reports;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.scorpo.lender.controller.model.ItemController;
import org.scorpo.lender.controller.model.State;
import org.scorpo.lender.model.Item;

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
                    
                   printToStreamAll(new FileWriter(rp.fleName + ".txt"));
                    
                } catch (IOException ex) {
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
    private void printToStreamAll(Writer ws) {
        if(rp.allsort.equals(ReportOptions.AllSortType.TITLE)) {
            List<Item> items = ItemController.getItems();
            items.
        }
    }
}
