/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.scorpo.lender.demo;

import au.com.bytecode.opencsv.CSVReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.SwingUtilities;
import org.scorpo.lender.controller.model.CheckoutController;
import org.scorpo.lender.controller.model.ItemController;
import org.scorpo.lender.controller.model.State;

//Loads data from CSV files
public class DataLoader {
    //The state to load data into

    private final State st;
    //Constructor

    public DataLoader(State st) {
        this.st = st;
    }
    //Method to blanket load state

    public void loadState() {
        SwingUtilities.invokeLater(new DataLoaderWorker(this));
    }
    //Method to load specific part of state

    public synchronized void loadFile(EnumFileType ft) {
        if (ft.equals(EnumFileType.TYPES)) {
            loadTypes();
        }
        if (ft.equals(EnumFileType.ITEMS)) {
            loadItems();
        }
        if (ft.equals(EnumFileType.PATRONS)) {
            loadPatrons();
        }
    }
    //Load types from .txt file using OpenCSV

    private void loadTypes() {
        try {
            CSVReader cs = new CSVReader(new FileReader("./TYPES.txt"));
            cs.readNext();
            List<String[]> readAll = cs.readAll();
            for (String[] strings : readAll) {
                st.addType(strings[1]);
            }
        } catch (IOException ex) {
            Logger.getLogger(DataLoader.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    //Load items with OpenCSV

    private void loadItems() {
        try {
            CSVReader cs = new CSVReader(new FileReader("./ITEMS.txt"));
            //Skip title
            cs.readNext();
            List<String[]> readAll = cs.readAll();
            for (String[] strings : readAll) {
                try {
                    ItemController.addItem(Integer.parseInt(strings[1]), strings[2], strings[3], new SimpleDateFormat("EEE, MMM d, ''yy").parse(strings[4]));
                } catch (ParseException ex) {
                    Logger.getLogger(DataLoader.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(DataLoader.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    //Load patrons via OpenCSV

    private void loadPatrons() {
        try {
            CSVReader cs = new CSVReader(new FileReader("./PATRONS.txt"));
            cs.readNext();
            List<String[]> readAll = cs.readAll();
            for (String[] strings : readAll) {
                try {
                    State.getState().addPatron(strings[1], strings[2], strings[3], Integer.parseInt(strings[4]), strings[5], strings[6], Integer.parseInt(strings[7]), Integer.parseInt(strings[8]), Integer.parseInt(strings[9]), Integer.parseInt(strings[10]), strings[11]);
                } catch (Exception e) {
                }
            }

        } catch (IOException ex) {
            Logger.getLogger(DataLoader.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void loadCheckout() {
        try {
            CSVReader cs = new CSVReader(new FileReader("./ITEMS_OUT.txt"));
            cs.readNext();
            List<String[]> readAll = cs.readAll();
            for (String[] strings : readAll) {
                try {
                    CheckoutController.addCheckout(new SimpleDateFormat("MM/DD/YYYY").parse(strings[3]), Integer.parseInt(strings[1]), Integer.parseInt(strings[2]));
                } catch (ParseException ex) {
                    Logger.getLogger(DataLoader.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(DataLoader.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
