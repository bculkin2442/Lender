
/*To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.scorpo.lender.controller.model;

import java.io.*;
import org.scorpo.lender.model.Checkout;
import java.util.*;
import java.util.logging.Logger;

//Deputy Controller in charge of creating Checkouts
public class CheckoutController {
    //The list of checkouts

    private static List<Checkout> checkouts;
    //The initializer

    static {
        checkouts = new LinkedList<Checkout>();
    }
    //How to add a controller

    public static void addCheckout(Date checkedout, int item, int patron) {
        Checkout chk = new Checkout(checkedout, item, patron);
        System.err.println("Checked out:" + chk.toString() + "\n");
        checkouts.add(chk);
    }
    //Check if a item exists

    public static boolean itemMatches(int item) {
        //For each checkout, see if the item matches
        try {
            for (Checkout chk : checkouts) {
                if (chk.getItem() == item) {
                    return true;
                }
            }
        } //Swallow any unnecessary NPE's. They mean we have a null reference
        catch (NullPointerException e) {
            return false;
        }
        return false;
    }
    //Serialize to a CSV (Comma Seperated Values) file using the power of delegation 

    public static void saveToCSVFile(String dir, String nm) throws IOException {
        //Open up the thing we output to
        FileWriter fle = new FileWriter(new File(dir.concat(nm)));
        //Log this
        Logger.getLogger(CheckoutController.class.getName()).fine("File Opened");
        //Write header
        fle.write("Checkouts\n");
        for (Checkout checkout : checkouts) {
            //Write checkout
            fle.write(checkout.toString());
            fle.write("\n");
            //Log it 
            Logger.getLogger(CheckoutController.class.getName()).finest("Checkout Written");
        }
        //Close file
        fle.close();
        //Log success
        Logger.getLogger(CheckoutController.class.getName()).fine("File Closed");
        Logger.getLogger(CheckoutController.class.getName()).fine("Checkouts Saved");
    }
}



//~ Formatted by Jindent --- http://www.jindent.com
