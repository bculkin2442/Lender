/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.scorpo.lender.view.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;
import org.scorpo.lender.controller.model.State;

//Create types from GUI events
public class TypeCreationListener implements ActionListener {

    public TypeCreationListener(JTextField desc, State ste) {
        st = ste;
        des = desc;
    }
    

    @Override
    public void actionPerformed(ActionEvent e) {
        //Add a type to state
        st.addType(des.getText());
    }
    //State to add types to
    private State st;
    //Text field for description
    private JTextField des;
}
