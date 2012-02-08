/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.scorpo.lender.demo.reports;

import java.util.Comparator;
import org.scorpo.lender.model.Checkout;

/**
 *
 * @author cromer33
 */
public class CheckoutDateComparator implements Comparator<Checkout> {

    @Override
    public int compare(Checkout o1, Checkout o2) {
        return o1.getDue().compareTo(o2.getDue());
    }
    
}
