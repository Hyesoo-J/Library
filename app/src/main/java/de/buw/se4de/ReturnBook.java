/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package de.buw.se4de;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author nikhi
 */
public class ReturnBook extends javax.swing.JFrame {

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JButton searchBtn;
    private JButton returnBtn;
    private JButton closeBtn;
    private JLabel bookIDLabel;
    private JLabel studentIDLabel;
    private JLabel issueDateLabel;
    private JLabel dueDateLabel;
    private JTextField bookIDTextField;
    private JTextField studentIDTextField;
    private JTextField issueDateTextField;
    private JTextField dueDateTextField;

    /**
     * Creates new form ReturnBook
     */
    public ReturnBook() {
        initComponents();
    }

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
            java.util.logging.Logger.getLogger(ReturnBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReturnBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReturnBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReturnBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReturnBook().setVisible(true);
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bookIDLabel = new JLabel();
        studentIDLabel = new JLabel();
        issueDateLabel = new JLabel();
        dueDateLabel = new JLabel();
        bookIDTextField = new JTextField();
        studentIDTextField = new JTextField();
        issueDateTextField = new JTextField();
        dueDateTextField = new JTextField();
        searchBtn = new JButton();
        returnBtn = new JButton();
        closeBtn = new JButton();

        bookIDLabel.setText("Book ID");

        studentIDLabel.setText("Student id");

        issueDateLabel.setText("Issue date");

        dueDateLabel.setText("Due Date");

        searchBtn.setText("Search");

        returnBtn.setText("Return");
        returnBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                returnBtnActionPerformed(evt);
            }
        });

        closeBtn.setText("Close");
        closeBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                closeBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addGap(209, 209, 209).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false).addComponent(dueDateLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addComponent(issueDateLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addComponent(studentIDLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE).addComponent(bookIDLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)).addGap(59, 59, 59).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false).addComponent(bookIDTextField).addComponent(studentIDTextField).addComponent(issueDateTextField).addComponent(dueDateTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)).addGap(18, 18, 18).addComponent(searchBtn)).addGroup(layout.createSequentialGroup().addGap(232, 232, 232).addComponent(returnBtn).addGap(120, 120, 120).addComponent(closeBtn))).addContainerGap(119, Short.MAX_VALUE)));
        layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addGap(148, 148, 148).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(bookIDLabel).addComponent(bookIDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)).addGap(18, 18, 18).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(studentIDLabel).addComponent(studentIDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(searchBtn)).addGap(18, 18, 18).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(issueDateLabel).addComponent(issueDateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)).addGap(18, 18, 18).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(dueDateLabel).addComponent(dueDateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)).addGap(51, 51, 51).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(returnBtn).addComponent(closeBtn)).addContainerGap(173, Short.MAX_VALUE)));

        pack();


        this.setSize(650,500);
        this.setResizable(false);
        this.setTitle("Return Book");
        this.setLocationRelativeTo(null);
        this.getRootPane().setDefaultButton(returnBtn);


    }// </editor-fold>//GEN-END:initComponents

    private void returnBtnActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    	
    	bookIDTextField.getText();
        studentIDTextField.getText();
        issueDateTextField.getText();
        dueDateTextField.getText(); 
    	
        bookIDTextField .setText("");
        studentIDTextField.setText("");
        issueDateTextField.setText("");
        dueDateTextField.setText("");
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void closeBtnActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed
    // End of variables declaration//GEN-END:variables
}
