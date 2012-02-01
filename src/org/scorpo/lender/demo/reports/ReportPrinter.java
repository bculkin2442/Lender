/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.scorpo.lender.demo.reports;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Collections;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.scorpo.lender.controller.model.ItemController;
import org.scorpo.lender.controller.model.TypeController;
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
    private void printToStreamAll(Writer ws) throws IOException {
        List<Item> items = ItemController.getItems();
        if(rp.allsort.equals(ReportOptions.AllSortType.TITLE)) {
            
            Collections.sort(items, new TitleComparator());
        }
        else {
            Collections.sort(items, new TypeComparator());
        }
            //Print each item in order
            for (Item item : items) {
                ws.write(TypeController.getDesForID(item.getType()));
                ws.write("\t");
                ws.write(item.getTitle());
                ws.write(item.getCreator() + "\t");
                ws.write(item.getPublished().toString());
            }
        }
    }
