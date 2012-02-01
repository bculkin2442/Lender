/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.scorpo.lender.demo.reports;

import java.util.Comparator;
import org.scorpo.lender.model.Item;

/**
 *
 * @author cromer33
 */
public class TitleComparator implements Comparator<Item> {

    @Override
    public int compare(Item o1, Item o2) {
        int i = o1.getTitle().compareToIgnoreCase(o2.getTitle());
        switch(i) {
            case -1:
                return -1;
            case 0:
                return 0;
            case 1:
                return 1;
            default:
                return 0;
        }
        
    }
    
}
