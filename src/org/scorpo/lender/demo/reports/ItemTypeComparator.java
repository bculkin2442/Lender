/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.scorpo.lender.demo.reports;

import java.util.Comparator;
import org.scorpo.lender.model.Item;

//Utility for comparing types
public class ItemTypeComparator implements Comparator<Item> {
    @Override
    public int compare(Item o1, Item o2) {
        Integer i = o1.getKey();
        int rs = i.compareTo(o2.getKey());
        switch(rs) {
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
