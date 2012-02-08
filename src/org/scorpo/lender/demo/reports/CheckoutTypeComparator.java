/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.scorpo.lender.demo.reports;

import java.util.Comparator;
import org.scorpo.lender.controller.model.ItemController;
import org.scorpo.lender.model.Checkout;

/**
 *
 * @author cromer33
 */
public class CheckoutTypeComparator implements Comparator<Checkout> {

    @Override
    public int compare(Checkout o1, Checkout o2) {
        int keyType = ItemController.getKeyType(o1.getItem());
        Integer key = Integer.valueOf(keyType);
        return key.compareTo(ItemController.getKeyType(o2.getItem()));
    }
    
}
