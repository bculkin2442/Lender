/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.scorpo.lender.demo;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.scorpo.lender.controller.model.CheckoutController;
import org.scorpo.lender.controller.model.ItemController;
import org.scorpo.lender.controller.model.PatronController;
import org.scorpo.lender.controller.model.TypeController;

//Class in charge of saving data
public class DataSaver {
    //Utility method for saving data
    public static void saveData () {
        try {
            //Save Patrons
            PatronController.saveToCSVFile("./", "PATRONS.csv");
            System.err.println("Patrons saved to PATRONS.csv");
            //Save checkouts
            CheckoutController.saveToCSVFile("./", "ITEMS_OUT.csv");
            System.err.println("Checkouts saved to ITEMS_OUT.csv");
            //Save Items
            ItemController.saveToCSVFile("./", "ITEMS.CSV");
            System.err.println("Items saved to ITEMS.CSV");
            //Save Types
            TypeController.saveToCSVFile("./", "TYPES.CSV");
            System.err.println("Types saved to TYPES.CSV");
        } catch (IOException ex) {
            Logger.getLogger(DataSaver.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
