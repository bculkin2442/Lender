
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.scorpo.lender.controller.model;

//~--- non-JDK imports --------------------------------------------------------
import org.scorpo.lender.model.Patron;
import org.scorpo.lender.model.patron.Person;

//~--- JDK imports ------------------------------------------------------------

import java.util.*;
import java.io.*;
import java.util.logging.Logger;

//Deputy controller for creating and storing patrons
public class PatronController {
    //Unique key

    private static int key;
    //List of patrons
    private static List<Patron> patrons;
    //Static initializer

    static {
        key = 0;
        patrons = new LinkedList<Patron>();
    }
    //Get the current key

    public static int getKey() {
        return key;
    }
    //Add a patron to the list

    public static void addPatron(Person info) {
        Patron pat = new Patron(key, info);
        patrons.add(pat);
        System.err.println("Patron Added:" + pat.toString() + "\n");
        key++;
    }
    //Get the id of a patron

    public static int getPatronKey(String fst, String lst) {
        for (Patron patron : patrons) {
            if ((patron.getInfo().getName().getFirst() == null ? fst == null : patron.getInfo().getName().getFirst().equals(fst)) && (patron.getInfo().getName().getLast() == null ? lst == null : patron.getInfo().getName().getLast().equals(lst))) {
                return patron.getKey();
            }
        }
        return 0;
    }
    //Check if a patron exists

    public static boolean patronExists(int key) {
        for (Patron pat : patrons) {
            if (pat.getKey() == key) {
                return true;
            }
        }

        return false;
    }
    //Serialize to CSV file

    public static void saveToCSVFile(String dir, String nm) throws IOException {
        //Open up the thing we output to
        FileWriter fle = new FileWriter(new File(dir.concat(nm)));
        //Log this
        Logger.getLogger(PatronController.class.getName()).fine("File Opened");
        //Write header
        fle.write("Patrons\n");
        for (Patron patron : patrons) {
            //Write patron
            fle.write(patron.toString());
            fle.write("\n");
            //Log it 
            Logger.getLogger(PatronController.class.getName()).finest("Patron Written");
        }
        //Close file
        fle.close();
        //Log success
        Logger.getLogger(PatronController.class.getName()).fine("File Closed");
        Logger.getLogger(PatronController.class.getName()).fine("Patrons Saved");
    }
}

//~ Formatted by Jindent --- http://www.jindent.com
