/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.scorpo.lender.demo;

/**
 *
 * @author cromer33
 */
public class DataLoaderWorker implements Runnable {
    private DataLoader dl;

    public DataLoaderWorker(DataLoader dl) {
        this.dl = dl;
    }
    
    @Override
    public void run() {
        dl.loadFile(EnumFileType.TYPES);
        dl.loadFile(EnumFileType.ITEMS);
        dl.loadFile(EnumFileType.PATRONS);
        dl.loadFile(EnumFileType.CHECKOUTS);
    }
    
}
