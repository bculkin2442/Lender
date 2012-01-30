/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.scorpo.lender.demo;

//This class runs the demo

import java.util.Calendar;
import org.scorpo.lender.controller.model.CheckoutController;
import org.scorpo.lender.controller.model.State;

public class DemoRunner implements Runnable{
    //The global control variable
    public boolean stop;
    @Override
    public void run() {
        System.out.print("Adding 2 Types\n");
        //Grab a state to manipulate
        State state = State.getState();
        //Add types
        state.addType("VHS");
        state.addType("Book");
        System.out.println("Book and VHS Types added\n");
        //Add items
        state.addItem("Book", "Stop SOPA", "Open Source Alliance", Calendar.getInstance().getTime());
        state.addItem("VHS", "Open Up: The Open Source Story", "SourceForge", Calendar.getInstance().getTime());
        state.addItem("Book", "Wake Up and Smell the Coffe: Java Basics", "Oracle", Calendar.getInstance().getTime());
        state.addItem("VHS", "404 - A History of the Web", "Apache Foundation" , Calendar.getInstance().getTime());
        System.out.println("Added 4 Items");
        //Add some Patrons
        state.addPatron("Ben", "Culkin", "Roanoke", 4950, "Virginia", "Irondale Circle", 24019, 560, 475, 6837, "admin@sokatsuki.tk");
        state.addPatron("Mary", "Culkin", "Roanoke", 4950, "Virginia", "Irondale Circle", 24019, 560, 475, 6837, "mary@sokatsuki.tk");
        state.addPatron("Adam", "Culkin", "Roanoke", 4950, "Virginia", "Irondale Circle", 24019, 560, 475, 6837, "devil@sokatsuki.tk");
        System.out.println("Added 3 Patrons");
        //Checkout a few items
        CheckoutController.addCheckout(Calendar.getInstance().getTime(), 0, 0);
    }
    
}
