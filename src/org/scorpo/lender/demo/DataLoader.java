/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.scorpo.lender.demo;

import au.com.bytecode.opencsv.CSVReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.SwingUtilities;
import org.scorpo.lender.controller.model.State;

//Loads data from CSV files
public class DataLoader {
    //The state to load data into
    private final State st;
    //Constructor
    public DataLoader (State st) {
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
    }

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
}
