/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.scorpo.lender.view.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import org.scorpo.lender.controller.model.State;
import org.scorpo.lender.view.MainView;
//Create patrons from GUI events
public class PatronCreationListener implements ActionListener{
    //State to add to
    private State st;
    //View components are obtained from
    private MainView mn;

    public PatronCreationListener(State st, MainView mn) {
        this.st = st;
        this.mn = mn;
        System.err.print("Listener Created(Patron)\n");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            //Add a patron to the state
            st.addPatron(mn.getFirstName().getText(), mn.getLastName().getText(), mn.getCityName().getText(), Integer.getInteger(mn.getHouseNumber().getText()), mn.getStateName().getText(), mn.getStreetAddress().getText(), Integer.getInteger(mn.getZipCode().getText()), Integer.getInteger(mn.getAreaCode().getText()), Integer.getInteger(mn.getFirstPhone().getText()), Integer.getInteger(mn.getSecondPhone().getText()), mn.getEmailAddress().getText());
        } catch (Exception ex) {
        }
    }
    
    
}
