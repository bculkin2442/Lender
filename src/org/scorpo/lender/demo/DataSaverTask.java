/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.scorpo.lender.demo;

import java.util.TimerTask;

/**
 *
 * @author cromer33
 */
public class DataSaverTask extends TimerTask {

    @Override
    public void run() {
        DataSaver.saveData();
    }
    
}
