/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.scorpo.lender.controller.model;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

//Save state when the window closes
//Use org.scorpo.lender.demo.DataSaver instead
@Deprecated
public class CloseListener extends WindowAdapter {

    @Override
    public void windowClosing(WindowEvent e) {
        try {
            CheckoutController.saveToCSVFile("./", "checkout.Csv");
        } catch (IOException ex) {
            Logger.getLogger(CloseListener.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public CloseListener() {
    }

    @Override
    public void windowOpened(WindowEvent e) {
        super.windowOpened(e);
    }
    
    
}
