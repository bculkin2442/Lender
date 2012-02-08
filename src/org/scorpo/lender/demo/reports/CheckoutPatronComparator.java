/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.scorpo.lender.demo.reports;

import java.util.Comparator;
import org.scorpo.lender.model.Checkout;

//Compare checkouts by patron
public class CheckoutPatronComparator implements Comparator<Checkout> {

    @Override
    public int compare(Checkout o1, Checkout o2) {
        return Integer.valueOf(o1.getPatron()).compareTo(o2.getPatron());
    }
    
}
