
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.scorpo.lender.controller.model;

//~--- non-JDK imports --------------------------------------------------------
import org.scorpo.lender.model.Type;

//~--- JDK imports ------------------------------------------------------------
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import java.util.logging.Logger;

//The deputy controller for creating and storing types
public class TypeController {
    //Unique Key

    private static int key;
    //List of Types
    private static List<Type> types;
    //Static initializer

    static {
        types = new LinkedList<Type>();
        key = 0;
    }
    //How to get the list of types

    public static List<Type> getTypes() {
        return types;
    }
    //Way to add types

    public static void addtype(String des) {
        Type ty = new Type(des, key);

        key++;
        types.add(ty);
        System.err.print("Type Created:" + ty.toString() + "\n");
    }
    //Check whether a type exists

    public static boolean typeExists(int key) {
        for (Type typ : types) {
            if (typ.getKey() == key) {
                return true;
            }
        }
        return false;
    }
    //Get id given a description

    public static int idFromDes(String des) throws NullPointerException {
        for (Type typ : types) {
            if (typ.getDes() == null ? des == null : typ.getDes().equals(des)) {
                return typ.getKey();
            }
        }
        throw new NullPointerException();
    }

    //Serialize to a CSV (Comma Seperated Values) file using the power of delegation 
    public static void saveToCSVFile(String dir, String nm) throws IOException {
        //Open up the thing we output to
        FileWriter fle = new FileWriter(new File(dir.concat(nm)));
        //Log this
        Logger.getLogger(TypeController.class.getName()).fine("File Opened");
        //Write header
        fle.write("Types\n");
        for (Type typ : types) {
            //Write type
            fle.write(typ.toString());
            fle.write("\n");
            //Log it 
            Logger.getLogger(TypeController.class.getName()).finest("Type Written");
        }
        //Close file
        fle.close();
        //Log success
        Logger.getLogger(TypeController.class.getName()).fine("File Closed");
        Logger.getLogger(TypeController.class.getName()).fine("Types Saved");
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
