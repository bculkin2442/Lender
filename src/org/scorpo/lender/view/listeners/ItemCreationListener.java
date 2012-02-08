/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.scorpo.lender.view.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.scorpo.lender.controller.model.State;
import org.scorpo.lender.view.MainView;

//GUI listener for item creation. 
public class ItemCreationListener implements ActionListener {
    //View to obtain fields from

    private MainView mn;
    //State to send events to
    private State st;
    //Date format for parsing
    private DateFormat dt;
    //Constructor for listener

    public ItemCreationListener(MainView mn, State st) {
        this.mn = mn;
        this.st = st;
        dt = new SimpleDateFormat("EEE, MMM d, ''yy");
        System.out.print("Listener Created(Item)\n");
    }
    //Where events are received

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            //Dispatch item addition to State instance
            st.addItem(mn.getItemType().getText(), mn.getItemTitle().getText(), mn.getItemMisc().getText(), dt.parse(mn.getItemDate().getText()));
        } catch (ParseException ex) {
            //Tell people what went wrong
            JOptionPane.showMessageDialog(mn, "Error: Invalid Date Format. Correct format is Wed, Jul 4, '01");
            Logger.getLogger(ItemCreationListener.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NullPointerException npe) {
            //Log and show if a field is left blank
            JOptionPane.showMessageDialog(mn, "Error: Field left blank" + npe);
            
            Logger.getLogger(ItemCreationListener.class.getName()).log(Level.SEVERE, null, npe);
        }

    }
}
