/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.scorpo.lender.demo.reports;

import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.scorpo.lender.controller.model.CheckoutController;
import org.scorpo.lender.controller.model.ItemController;
import org.scorpo.lender.controller.model.TypeController;
import org.scorpo.lender.demo.reports.ReportOptions.CheckSortType;
import org.scorpo.lender.model.Checkout;
import org.scorpo.lender.model.Item;

//Printer class to print the report
 
public class ReportPrinter {
    private static ReportOptions rp;

    public ReportPrinter(ReportOptions rp) {
        ReportPrinter.rp = rp;
    }
    
    public void print() {
        if(ReportOptions.isFile()) {
            printToFile();
        }
        else {
            printToScreen();
        }
    }

    private void printToFile() {
        //If report is all items
        if (ReportOptions.type.equals(
                ReportOptions.ReportType.ALL)) {
                try {
                    
                   printToStreamAll(new FileWriter(ReportOptions.fleName + ".txt"));
                    
                } catch (IOException ex) {
                    Logger.getLogger(ReportPrinter.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        else {
            
        }
        }

    private void printToScreen() {
        try {
            if(ReportOptions.type.equals(
                    ReportOptions.ReportType.ALL)) {
                printToStreamAll(new OutputStreamWriter(System.out));
            }
            else {
                
            }
        } catch (Exception ex) {
            Logger.getLogger(ReportPrinter.class.getName()).log(Level.SEVERE, null, ex);
            try {
                printToStreamAll(new OutputStreamWriter(System.out));
            } catch (IOException ex1) {
                Logger.getLogger(ReportPrinter.class.getName()).log(Level.SEVERE, null, ex1);
            }
        }
    }
    private void printToStreamAll(Writer ws) throws IOException {
        List<Item> items = ItemController.getItems();
        if(ReportOptions.allsort.equals(ReportOptions.AllSortType.TITLE)) {
            
            Collections.sort(items, new ItemTitleComparator());
        }
        else {
            Collections.sort(items, new ItemTypeComparator());
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
    private void printToStreamCheck(Writer ws) throws IOException {
        List<Checkout> checkouts = CheckoutController.getCheckouts();
        if(!ReportOptions.paged){
            Collections.sort(checkouts,new CheckoutTypeComparator());
        }
        else {
            if(ReportOptions.checksort.equals(ReportOptions.CheckSortType.PATRON)) {
                Collections.sort(checkouts, new CheckoutPatronComparator());               
            }
            else {
                Collections.sort(checkouts, new CheckoutDateComparator());
                
            }
        }
        if(ReportOptions.paged) {
            if(CheckSortType.DUEDATE.equals(ReportOptions.checksort)) {
                ws.write("Checkout sorted by date\n");
                Date curr;
                for (Checkout checkout : checkouts) {
                    
                }
            }
        }
    }
}
