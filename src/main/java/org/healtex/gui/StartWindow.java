/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.healtex.gui;


import org.healtex.logging.JTextAreaAppender;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author rich
 */
public class StartWindow extends javax.swing.JFrame {

    private final GuiHelper guiHelper;
    private Collection<File> fileList;
    public void updateTextFieldWithFileChooserInfo(javax.swing.JTextField tf){
        final JFileChooser fc = new JFileChooser();
        fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int returnVal = fc.showOpenDialog(StartWindow.this);
        
        
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File file = fc.getSelectedFile();
            try {
                tf.setText(file.getCanonicalPath());
                //This is where a real application would open the file.
                //log.append("Opening: " + file.getName() + "." + newline);
            } catch (IOException ex) {
                Logger.getLogger(StartWindow.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            //log.append("Open command cancelled by user." + newline);
        }                
    }
    
    private void goToCard(String card) {
        CardLayout cl = (CardLayout) getContentPane().getLayout();
        cl.show(getContentPane(), card);
    }    
    
    /**
     * Creates new form StartWindow
     */
    public StartWindow() {
        this.guiHelper = new GuiHelper();
        initComponents();
        PrintStream printStream = new PrintStream(new JTextAreaAppender(jTextArea1));
        System.setOut(printStream);
        System.setErr(printStream);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;
        batchLauncherCard = new javax.swing.JPanel();
        jButtonSelInputDir = new javax.swing.JButton();
        jTextFieldInputDir = new javax.swing.JTextField();
        jButtonSelOutputDir = new javax.swing.JButton();
        jTextFieldOutputDir = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        jButtonLaunchBatch = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanelBatchProgress = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jProgressBarBatchProgress = new javax.swing.JProgressBar();
        jButtonCancelBatch = new javax.swing.JButton();
        jPanelFileList = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListFileList = new javax.swing.JList<>();
        jPanelLogMessages = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuGoTo = new javax.swing.JMenu();
        jMenuItemHomeCard = new javax.swing.JMenuItem();
        jMenuItemBatchCard = new javax.swing.JMenuItem();
        jMenuItemResultsCard = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 800));

        java.awt.GridBagLayout batchLauncherCardLayout = new java.awt.GridBagLayout();
        batchLauncherCardLayout.columnWidths = new int[] {0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0};
        batchLauncherCardLayout.rowHeights = new int[] {0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0};
        batchLauncherCard.setLayout(batchLauncherCardLayout);

        jButtonSelInputDir.setText("Select input directory");
        jButtonSelInputDir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSelInputDirActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        batchLauncherCard.add(jButtonSelInputDir, gridBagConstraints);

        jTextFieldInputDir.setText("input dir");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 11;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        batchLauncherCard.add(jTextFieldInputDir, gridBagConstraints);

        jButtonSelOutputDir.setText("Select Output Directory");
        jButtonSelOutputDir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSelOutputDirActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        batchLauncherCard.add(jButtonSelOutputDir, gridBagConstraints);

        jTextFieldOutputDir.setText("output dir");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 11;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        batchLauncherCard.add(jTextFieldOutputDir, gridBagConstraints);

        jPanel6.setLayout(new java.awt.GridLayout(4, 0));

        jCheckBox1.setText("Names");
        jPanel6.add(jCheckBox1);

        jCheckBox2.setText("Addresses");
        jPanel6.add(jCheckBox2);

        jCheckBox3.setText("Telephone Numbers");
        jCheckBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox3ActionPerformed(evt);
            }
        });
        jPanel6.add(jCheckBox3);

        jCheckBox4.setText("Postcodes");
        jPanel6.add(jCheckBox4);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.gridheight = 9;
        batchLauncherCard.add(jPanel6, gridBagConstraints);

        jLabel1.setText("Select Fields to Scrub (not implemented yet)");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.gridheight = 9;
        batchLauncherCard.add(jLabel1, gridBagConstraints);

        jButtonLaunchBatch.setText("Launch TexScrubber");
        jButtonLaunchBatch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLaunchBatchActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 24;
        gridBagConstraints.gridwidth = 19;
        gridBagConstraints.gridheight = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        batchLauncherCard.add(jButtonLaunchBatch, gridBagConstraints);

        jLabel3.setText("Input Dir");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        batchLauncherCard.add(jLabel3, gridBagConstraints);

        jLabel5.setText("Output Dir");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        batchLauncherCard.add(jLabel5, gridBagConstraints);

        jPanelBatchProgress.setLayout(new java.awt.GridLayout(3, 0));

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Scrubbing Docs");
        jPanelBatchProgress.add(jLabel6);
        jPanelBatchProgress.add(jProgressBarBatchProgress);

        jButtonCancelBatch.setText("Cancel");
        jPanelBatchProgress.add(jButtonCancelBatch);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 34;
        gridBagConstraints.gridwidth = 19;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        batchLauncherCard.add(jPanelBatchProgress, gridBagConstraints);

        jPanelFileList.setLayout(new java.awt.BorderLayout());

        jListFileList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "<No Files Loaded>" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jListFileList);

        jPanelFileList.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 22;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 21;
        gridBagConstraints.gridheight = 35;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        batchLauncherCard.add(jPanelFileList, gridBagConstraints);

        getContentPane().add(batchLauncherCard, java.awt.BorderLayout.NORTH);

        jPanelLogMessages.setLayout(new java.awt.BorderLayout());
        getContentPane().add(jPanelLogMessages, java.awt.BorderLayout.SOUTH);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane2, java.awt.BorderLayout.CENTER);

        jMenuGoTo.setText("Go To");

        jMenuItemHomeCard.setText("Home");
        jMenuItemHomeCard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemHomeCardActionPerformed(evt);
            }
        });
        jMenuGoTo.add(jMenuItemHomeCard);

        jMenuItemBatchCard.setText("Run Batches");
        jMenuItemBatchCard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemBatchCardActionPerformed(evt);
            }
        });
        jMenuGoTo.add(jMenuItemBatchCard);

        jMenuItemResultsCard.setText("View Results");
        jMenuItemResultsCard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemResultsCardActionPerformed(evt);
            }
        });
        jMenuGoTo.add(jMenuItemResultsCard);

        jMenuBar1.add(jMenuGoTo);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCheckBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox3ActionPerformed

    private void jButtonSelInputDirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSelInputDirActionPerformed
        // TODO add your handling code here:
        updateTextFieldWithFileChooserInfo(jTextFieldInputDir);
        fileList = guiHelper.getFileList(jTextFieldInputDir.getText());
        List<String> fileNames = new ArrayList<>();
        for (File file : fileList){
            fileNames.add(file.getName());
        }
        jListFileList.setListData(fileNames.toArray(new String[fileNames.size()]));
    }//GEN-LAST:event_jButtonSelInputDirActionPerformed

    private void jButtonSelOutputDirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSelOutputDirActionPerformed
        // TODO add your handling code here:
        updateTextFieldWithFileChooserInfo(jTextFieldOutputDir);
    }//GEN-LAST:event_jButtonSelOutputDirActionPerformed

    private void jButtonLaunchBatchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLaunchBatchActionPerformed
        // TODO add your handling code here:
        jButtonLaunchBatch.setEnabled(false); 
        jButtonCancelBatch.setEnabled(true);
        setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        RunBatch runBatch = new RunBatch(fileList,
                new File(jTextFieldOutputDir.getText()),
                jProgressBarBatchProgress,
                jButtonLaunchBatch,
                jButtonCancelBatch);


        runBatch.addPropertyChangeListener(runBatch);
        runBatch.execute();       
    }//GEN-LAST:event_jButtonLaunchBatchActionPerformed

    private void jMenuItemHomeCardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemHomeCardActionPerformed
        // TODO add your handling code here:
        goToCard("homeCard");
    }//GEN-LAST:event_jMenuItemHomeCardActionPerformed

    private void jMenuItemBatchCardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemBatchCardActionPerformed
        // TODO add your handling code here:
        goToCard("batchCard");
    }//GEN-LAST:event_jMenuItemBatchCardActionPerformed

    private void jMenuItemResultsCardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemResultsCardActionPerformed
        // TODO add your handling code here:
        goToCard("resultsCard");
    }//GEN-LAST:event_jMenuItemResultsCardActionPerformed

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
            java.util.logging.Logger.getLogger(StartWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StartWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StartWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StartWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StartWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel batchLauncherCard;
    private javax.swing.JButton jButtonCancelBatch;
    private javax.swing.JButton jButtonLaunchBatch;
    private javax.swing.JButton jButtonSelInputDir;
    private javax.swing.JButton jButtonSelOutputDir;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JList<String> jListFileList;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuGoTo;
    private javax.swing.JMenuItem jMenuItemBatchCard;
    private javax.swing.JMenuItem jMenuItemHomeCard;
    private javax.swing.JMenuItem jMenuItemResultsCard;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanelBatchProgress;
    private javax.swing.JPanel jPanelFileList;
    private javax.swing.JPanel jPanelLogMessages;
    private javax.swing.JProgressBar jProgressBarBatchProgress;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextFieldInputDir;
    private javax.swing.JTextField jTextFieldOutputDir;
    // End of variables declaration//GEN-END:variables

}