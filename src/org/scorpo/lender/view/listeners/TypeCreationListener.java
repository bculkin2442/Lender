/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.scorpo.lender.view.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;
import org.scorpo.lender.controller.model.State;

/**
 *
 * @author cromer33
 */
public class TypeCreationListener implements ActionListener {

    public TypeCreationListener(JTextField desc, State ste) {
        st = ste;
        des = desc;
    }
    

    @Override
    public void actionPerformed(ActionEvent e) {
        st.addType(des.getText());
    }
    private State st;
    private JTextField des;
}
