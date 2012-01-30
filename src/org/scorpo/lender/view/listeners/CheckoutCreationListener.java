/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.scorpo.lender.view.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import org.scorpo.lender.controller.model.State;
import org.scorpo.lender.view.MainView;

/**
 *
 * @author cromer33
 */
public class CheckoutCreationListener implements ActionListener {
    private State st;
    private MainView mn;

    public CheckoutCreationListener(State st, MainView mn) {
        this.st = st;
        this.mn = mn;
        System.err.print("Listener Created(Checkout)\n");
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
       try {        
            st.addCheckout(mn.getItemName().getText(), mn.getChFirstName().getText().concat(mn.getChLastName().getText()));
       }
       catch (IllegalArgumentException ilex) {
           JOptionPane.showMessageDialog(mn, "Nonexistent item or patron");
       }
    } 
}
