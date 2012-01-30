/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * CheckOutOptionsPane.java
 *
 * Created on Jan 18, 2012, 9:10:57 AM
 */
package org.scorpo.lender.demo.reports;

import javax.swing.ButtonGroup;

/**The form to store info for checked out items
 *
 * @author cromer33
 */
public class CheckOutOptionsPane extends javax.swing.JPanel {

    /** Creates new form CheckOutOptionsPane */
    public CheckOutOptionsPane(ReportOptions rep) {
        initComponents();
        rp = rep;
        ButtonGroup bg = new ButtonGroup();
        bg.add(dateRadio);
        bg.add(patronRadio);
        bg.add(typeRadio);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        typeRadio = new javax.swing.JRadioButton();
        dateRadio = new javax.swing.JRadioButton();
        patronRadio = new javax.swing.JRadioButton();

        jLabel1.setText("Sort By");

        typeRadio.setText("Type");
        typeRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                typeRadioActionPerformed(evt);
            }
        });

        dateRadio.setText("Date Due");
        dateRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dateRadioActionPerformed(evt);
            }
        });

        patronRadio.setText("Patron");
        patronRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patronRadioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dateRadio)
                            .addComponent(typeRadio)
                            .addComponent(patronRadio))))
                .addContainerGap(309, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(typeRadio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dateRadio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(patronRadio)
                .addContainerGap(199, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void typeRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_typeRadioActionPerformed
        rp.setPaged(true);
        rp.setChecksort(ReportOptions.CheckSortType.TYPE);
    }//GEN-LAST:event_typeRadioActionPerformed

    private void dateRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dateRadioActionPerformed
        rp.setChecksort(ReportOptions.CheckSortType.DUEDATE);
        rp.setPaged(true);
    }//GEN-LAST:event_dateRadioActionPerformed

    private void patronRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patronRadioActionPerformed
        rp.setChecksort(ReportOptions.CheckSortType.PATRON);
    }//GEN-LAST:event_patronRadioActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton dateRadio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JRadioButton patronRadio;
    private javax.swing.JRadioButton typeRadio;
    // End of variables declaration//GEN-END:variables
    //Object to store choices in
    private ReportOptions rp;
}