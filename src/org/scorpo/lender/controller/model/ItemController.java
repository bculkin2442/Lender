
/*To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.scorpo.lender.controller.model;

//~--- non-JDK imports --------------------------------------------------------
import org.scorpo.lender.model.Item;

//~--- JDK imports ------------------------------------------------------------
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import java.util.logging.Logger;

//Deputy controller for creating and storing items
public class ItemController {
    //List of items

    private static List<Item> items;
    //How to get list of items

    public static List<Item> getItems() {
        return items;
    }
    //Current key
    private static int key;
    //Initialize both the variables

    static {
        key = 0;
        items = new LinkedList<Item>();
    }
    //Way to add a item

    public static void addItem(int type, String title, String creator, Date published) {
        Item it = new Item(key, type, title, creator, published);
        items.add(it);
        System.err.println("Item Created:" + it.toString() + "\n");
        key++;
    }
    //Check if items match

    public static boolean itemMatches(int key) {
        try {
            for (Item itm : items) {
                if (itm.getKey() == key) {
                    return true;
                }
            }
        } catch (NullPointerException npe) {
            //This is not important, we just found a null reference
            return false;
        }

        return false;
    }
    //Get the id given a items name

    public static int getKeyforItem(String nm) {
        for (Item item : items) {
            if (item.getTitle() == null ? nm == null : item.getTitle().equals(nm)) {
                return item.getKey();
            }
        }
        throw new IllegalArgumentException("Nonexistant Item");
    }
    //Get key given id
    public static int getKeyType(int key) {
        for (Item item : items) {
            if(item.getKey() == key) {
                return item.getType();
            }
        }
        return 0;
    }
    //Check if an item esists

    public static boolean itemExists(String title) {
        for (Item item : items) {
            if (item.getTitle() == null ? title == null : item.getTitle().equals(title)) {
                return itemMatches(item.getKey());
            }
        }
        return false;
    }

    //Serialize to a CSV (Comma Seperated Values) file using the power of delegation 
    public static void saveToCSVFile(String dir, String nm) throws IOException {
        //Open up the thing we output to
        FileWriter fle = new FileWriter(new File(dir.concat(nm)));
        //Log this
        Logger.getLogger(ItemController.class.getName()).fine("File Opened");
        //Write header
        fle.write("Items\n");
        for (Item itm : items) {
            //Write checkout
            fle.write(itm.toString());
            fle.write("\n");
            //Log it 
            Logger.getLogger(ItemController.class.getName()).finest("Checkout Written");
        }
        //Close file
        fle.close();
        //Log success
        Logger.getLogger(ItemController.class.getName()).fine("File Closed");
        Logger.getLogger(ItemController.class.getName()).fine("Checkouts Saved");
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
