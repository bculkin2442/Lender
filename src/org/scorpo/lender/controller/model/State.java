package org.scorpo.lender.controller.model;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.Calendar;
import java.util.Date;
import java.util.Timer;
import javax.swing.JTextPane;
import javax.swing.SwingUtilities;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import org.scorpo.lender.demo.DataSaverTask;
import org.scorpo.lender.model.patron.Address;
import org.scorpo.lender.model.patron.Contact;
import org.scorpo.lender.model.patron.Name;
import org.scorpo.lender.model.patron.Person;
import org.scorpo.lender.model.patron.PhoneNumber;

//This is the Controller in the Model-View-Controller that co-ordinates the secondary controllers and recieves events 
public class State {

    //Adds a type to library. 
    public State addType(String description) {
        //Add a type
        TypeController.addtype(description);
        return inst;
    }
    //Add a type to the database

    public State addItem(String type, String title, String creator, Date published) {
        //Get id for type
        int tyid = TypeController.idFromDes(type);
        //If the type exists
        if (TypeController.typeExists(tyid)) {
            //Add a Item
            ItemController.addItem(tyid, title, creator, published);
            return inst;
        }
        return inst;
    }
    //Add a patron to the database

    public State addPatron(String first, String last, String city, int house, String state, String street, int zip, int area, int frst, int sec, String mail) {
        //Construct all the neccessary components
        Name nam = new Name(first, last);
        Address add = new Address(house, street, city, state, zip);
        PhoneNumber phon = new PhoneNumber(area, frst, sec);
        Contact con = new Contact(mail, phon);
        Person pers = new Person(nam, add, con);
        //Add a patron
        PatronController.addPatron(pers);
        return inst;
    }
    //Adding a checkout to the database

    public State addCheckout(String itm, String patrn) {
        //Split name into first and last.
        String str[] = patrn.split(" ");
        //Get patron key by their name
        int key = PatronController.getPatronKey(str[0], str[1]);
        //Get the key for the item
        int key1 = ItemController.getKeyforItem(itm);
        //If both items exist
        if (PatronController.patronExists(key) && ItemController.itemExists(itm)) {
            //Add a checkout
            CheckoutController.addCheckout(Calendar.getInstance().getTime(), key1, key);
        }
        return inst;
    }
    //Way to get the single instance of State

    public static State getState() {
        return inst;
    }
    //Private constructor

    private State(boolean redirect) {
        if (redirect) {
            redirectSystemStreams();
        }
        tm = new Timer("DataSaver", true);
        tm.scheduleAtFixedRate(new DataSaverTask(), 30000, 30000);
    }
    //Our static instance to provide easy access
    private static State inst = new State(false);
    //Way we update the TextPane

    private void updateTextPane(final String text) {
        SwingUtilities.invokeLater(new Runnable() {

            @Override
            public void run() {
                Document doc = textPane.getDocument();
                try {
                    doc.insertString(doc.getLength(), text, null);
                } catch (BadLocationException e) {
                    throw new RuntimeException(e);
                }
                textPane.setCaretPosition(doc.getLength() - 1);
            }
        });
    }
    //Prepare output to demo field

    private void redirectSystemStreams() {
        //Create the output stream
        OutputStream out1 = new OutputStream() {

            @Override
            public void write(final int b) throws IOException {
                updateTextPane(String.valueOf((char) b));
            }

            @Override
            public void write(byte[] b, int off, int len) throws IOException {
                updateTextPane(new String(b, off, len));
            }

            @Override
            public void write(byte[] b) throws IOException {
                write(b, 0, b.length);
            }
        };
        //Set this stream to the default
        System.setErr(new PrintStream(out1));
        System.setOut(new PrintStream(out1));
    }
    //The target for the ouput stream
    private JTextPane textPane;
    //Method to change TextPane

    public State setTextPane(JTextPane textPane) {
        this.textPane = textPane;
        return inst;
    }
    //Redirect on command

    public State redirect() {
        redirectSystemStreams();
        return inst;
    }
    //Timer for saving data
    Timer tm;
}
