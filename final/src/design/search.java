/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package design;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author USER
 */
public class search extends javax.swing.JFrame {

    /**
     * Creates new form search
     */
    public search() {
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SEARCHbutton = new javax.swing.JButton();
        What_To_Search_Textfield = new javax.swing.JTextField();
        Back_Button = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(800, 500));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SEARCHbutton.setBackground(new java.awt.Color(255, 204, 204));
        SEARCHbutton.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        SEARCHbutton.setText("SEARCH");
        SEARCHbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SEARCHbuttonActionPerformed(evt);
            }
        });
        getContentPane().add(SEARCHbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 407, 120, 50));

        What_To_Search_Textfield.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        What_To_Search_Textfield.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        What_To_Search_Textfield.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 204)));
        What_To_Search_Textfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                What_To_Search_TextfieldActionPerformed(evt);
            }
        });
        What_To_Search_Textfield.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                What_To_Search_TextfieldKeyTyped(evt);
            }
        });
        getContentPane().add(What_To_Search_Textfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 410, 360, 50));

        Back_Button.setBackground(new java.awt.Color(255, 204, 204));
        Back_Button.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        Back_Button.setText("BACK");
        Back_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Back_ButtonActionPerformed(evt);
            }
        });
        getContentPane().add(Back_Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 407, 130, 50));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/asset/Search_Background.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 490));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/asset/BGWHITE.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 490));

        setSize(new java.awt.Dimension(809, 545));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void SEARCHbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SEARCHbuttonActionPerformed
        // TODO add your handling code here:
        //String demo = jTextField8.getText();
        //String fileToOpen ="G:\\PhonebookProject1\\"+ demo+".txt";
        
        Show_Friends.What_To_View=What_To_Search_Textfield.getText();
        Show_Details obj= new Show_Details();
        obj.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_SEARCHbuttonActionPerformed

    private void Back_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Back_ButtonActionPerformed
        // TODO add your handling code here:
        HOMENU obj= new HOMENU();
        obj.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_Back_ButtonActionPerformed

    private void What_To_Search_TextfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_What_To_Search_TextfieldActionPerformed
        // TODO add your handling code here:
        //String Suggest=ki_khujboTextField.getText();
        //System.out.println(Suggest);
    }//GEN-LAST:event_What_To_Search_TextfieldActionPerformed

    private void What_To_Search_TextfieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_What_To_Search_TextfieldKeyTyped
        // TODO add your handling code here:
        
    }//GEN-LAST:event_What_To_Search_TextfieldKeyTyped

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
            java.util.logging.Logger.getLogger(search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new search().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back_Button;
    private javax.swing.JButton SEARCHbutton;
    private javax.swing.JTextField What_To_Search_Textfield;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
