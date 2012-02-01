/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * DemoFrame.java
 *
 * Created on Jan 10, 2012, 7:41:35 AM
 */
package org.scorpo.lender.demo;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.SwingUtilities;
import org.scorpo.lender.controller.model.State;
import org.scorpo.lender.demo.reports.ReportOptions;
import org.scorpo.lender.view.MainView;

/**
 *
 * @author cromer33
 */
public class DemoFrame extends javax.swing.JFrame {

    /** Creates new form DemoFrame */
    public DemoFrame() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        demoTextPane = new javax.swing.JTextPane();
        titleLabel = new javax.swing.JLabel();
        reportPrinter = new javax.swing.JButton();
        demoRunner = new javax.swing.JButton();
        dataSaver = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Lender Demo");

        demoTextPane.setEditable(false);
        jScrollPane1.setViewportView(demoTextPane);

        titleLabel.setText("Demo Output");

        reportPrinter.setText("Print Reports...");
        reportPrinter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reportPrinterActionPerformed(evt);
            }
        });

        demoRunner.setText("Run Demo");
        demoRunner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                demoRunnerActionPerformed(evt);
            }
        });

        dataSaver.setText("Save Data");
        dataSaver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataSaverActionPerformed(evt);
            }
        });

        jButton1.setText("Test");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(reportPrinter)
                                .addGap(63, 63, 63)
                                .addComponent(dataSaver)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                                .addComponent(demoRunner))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 402, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addComponent(titleLabel))
                    .addComponent(jButton1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(titleLabel))
                    .addComponent(jButton1))
                .addGap(13, 13, 13)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(dataSaver)
                    .addComponent(reportPrinter)
                    .addComponent(demoRunner))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //Show options for printing
    private void reportPrinterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reportPrinterActionPerformed
        //Construct a dialog
        ReportOptionDialog reportOptionDialog = new ReportOptionDialog(this, false);
        //Set it visible
        reportOptionDialog.setVisible(true);
    }//GEN-LAST:event_reportPrinterActionPerformed
    //Run the dempo
    private void demoRunnerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_demoRunnerActionPerformed
        //Set the text pane for output
        State.getState().setTextPane(demoTextPane);
        /*Tell the state to perform redirection.
         * However, I find it neccessary to say why redirection needs to be performed manually.
         * In early testing, bringing up the GUI before doing anything else was causing OutOfMemoryErrors
         * This was because something was attempting to print to a non-existant JTextPane and creating
         * a infinite loop of arrays.
         */
        State.getState().redirect();
        //Set demo to run
        SwingUtilities.invokeLater(new DemoRunner());
    }//GEN-LAST:event_demoRunnerActionPerformed

    private void dataSaverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataSaverActionPerformed
        //Save the data
        DataSaver.saveData();
    }//GEN-LAST:event_dataSaverActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        MainView.main(new String[0], this);
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DemoFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DemoFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DemoFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DemoFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new DemoFrame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton dataSaver;
    private javax.swing.JButton demoRunner;
    private javax.swing.JTextPane demoTextPane;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton reportPrinter;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables

}
