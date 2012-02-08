/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.scorpo.lender.demo;

import java.util.TimerTask;

//Used to save data every 30 seconds
public class DataSaverTask extends TimerTask {

    @Override
    public void run() {
        DataSaver.saveData();
    }
    
}
