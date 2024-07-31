/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import com.toedter.calendar.JTextFieldDateEditor;
import java.awt.Color;
import javax.swing.JFrame;


public class EditDetails extends javax.swing.JFrame {

    private static EditDetails p;

    private EditDetails() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
        this.setBackground(new Color(100, 100, 225, 80));
//        disableDateChooser();
    }
    JFrame backWindow;
    int currentState;

    public synchronized static EditDetails getInstance(JFrame backWindow,int currentState) {
        if (p == null) {
            p = new EditDetails();
        }
        p.backWindow=backWindow;
        p.currentState=currentState;
        return p;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        mainPanel = new javax.swing.JPanel();
        headingPanel = new javax.swing.JPanel();
        headingLabel = new javax.swing.JLabel();
        closeBtn = new javax.swing.JButton();
        chequePayPanel = new javax.swing.JPanel();
        cashPayIdLabel = new javax.swing.JLabel();
        lockerIdLabel = new javax.swing.JLabel();
        issuedTimeLabel = new javax.swing.JLabel();
        recievedByLabel = new javax.swing.JLabel();
        issuedByLabel = new javax.swing.JLabel();
        issuedDateLabel = new javax.swing.JLabel();
        cashAmountLabel = new javax.swing.JLabel();
        cashAmountValuTxf = new javax.swing.JTextField();
        reEnterCashAmntLabel = new javax.swing.JLabel();
        cashPayIdValueLabel = new javax.swing.JLabel();
        cashPayEditBtn = new javax.swing.JButton();
        rEnterCashAmntValueTxf = new javax.swing.JTextField();
        lokerIdValueTxf = new javax.swing.JTextField();
        cashIssuedTimehhTxt = new javax.swing.JTextField();
        cashIssuedDateChooser = new com.toedter.calendar.JDateChooser();
        cashRecievedByComboBox = new javax.swing.JComboBox<>();
        cashIssuedByComboBox = new javax.swing.JComboBox<>();
        issuedTimeLabel1 = new javax.swing.JLabel();
        grnIdTxt22 = new javax.swing.JTextField();
        issuedTimeLabel2 = new javax.swing.JLabel();
        cashIssuedTimeminTxt = new javax.swing.JTextField();
        issuedTimeLabel3 = new javax.swing.JLabel();
        chequePayPanel1 = new javax.swing.JPanel();
        cheqNumLabel = new javax.swing.JLabel();
        bankLabel = new javax.swing.JLabel();
        typeLabel = new javax.swing.JLabel();
        cheqIssuedDateLabel = new javax.swing.JLabel();
        validityStartingDateLabel = new javax.swing.JLabel();
        cheqAmntLabel = new javax.swing.JLabel();
        cheqStatusLabel = new javax.swing.JLabel();
        cheqIssuedByLabel = new javax.swing.JLabel();
        cheqRecievedByLabel = new javax.swing.JLabel();
        cheqNumValueTxf = new javax.swing.JTextField();
        reEnterCheqNumLabel = new javax.swing.JLabel();
        cheqIdLabel = new javax.swing.JLabel();
        cheqIdValueLabel = new javax.swing.JLabel();
        cheqAmntValueLabel = new javax.swing.JTextField();
        reEnterCheqAmntLabel = new javax.swing.JLabel();
        reEnterCheqAmntValueTxf = new javax.swing.JTextField();
        cheqPayEditBtn = new javax.swing.JButton();
        reEnterCheqNumValueTxf = new javax.swing.JTextField();
        bankValueTxf = new javax.swing.JTextField();
        grnIdTxt16 = new javax.swing.JTextField();
        validityStartDateChooser = new com.toedter.calendar.JDateChooser();
        cheqIssuedDateChooser = new com.toedter.calendar.JDateChooser();
        cheqStatusComboBox = new javax.swing.JComboBox<>();
        cheqIssuedByComboBox = new javax.swing.JComboBox<>();
        cheqRecievedByComboBox = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1360, 766));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        mainPanel.setBackground(new java.awt.Color(255, 255, 255));
        mainPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));

        headingPanel.setBackground(new java.awt.Color(153, 153, 255));
        headingPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        headingLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        headingLabel.setForeground(new java.awt.Color(255, 255, 255));
        headingLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        headingLabel.setText("| EDIT PAYMENT DETAILS |");
        headingPanel.add(headingLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 990, 40));

        closeBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Errpng.png"))); // NOI18N
        closeBtn.setContentAreaFilled(false);
        closeBtn.setFocusable(false);
        closeBtn.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/herror.png"))); // NOI18N
        closeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeBtnActionPerformed(evt);
            }
        });
        headingPanel.add(closeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 0, 50, 40));

        chequePayPanel.setBackground(new java.awt.Color(255, 255, 255));
        chequePayPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "Cash Payments", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N
        chequePayPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cashPayIdLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cashPayIdLabel.setText("Cash Payments ID :");
        chequePayPanel.add(cashPayIdLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 130, 20));

        lockerIdLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lockerIdLabel.setText("Locker ID :");
        chequePayPanel.add(lockerIdLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 100, 20));

        issuedTimeLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        issuedTimeLabel.setText("hh");
        chequePayPanel.add(issuedTimeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 180, 30, 20));

        recievedByLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        recievedByLabel.setText("Recieved By :");
        chequePayPanel.add(recievedByLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 130, 20));

        issuedByLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        issuedByLabel.setText("Issued By :");
        chequePayPanel.add(issuedByLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 130, 20));

        issuedDateLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        issuedDateLabel.setText("Issued Date :");
        chequePayPanel.add(issuedDateLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 100, 20));

        cashAmountLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cashAmountLabel.setText("Cash Amount :");
        chequePayPanel.add(cashAmountLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 100, 20));

        cashAmountValuTxf.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        chequePayPanel.add(cashAmountValuTxf, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, 230, 20));

        reEnterCashAmntLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        reEnterCashAmntLabel.setText("Re-Enter the Amount :");
        chequePayPanel.add(reEnterCashAmntLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 150, 20));

        cashPayIdValueLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cashPayIdValueLabel.setText("XXXXXXXXXXXXX");
        chequePayPanel.add(cashPayIdValueLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, 230, 20));

        cashPayEditBtn.setBackground(new java.awt.Color(255, 255, 255));
        cashPayEditBtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cashPayEditBtn.setText("Edit");
        cashPayEditBtn.setFocusable(false);
        chequePayPanel.add(cashPayEditBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 400, 150, -1));

        rEnterCashAmntValueTxf.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        chequePayPanel.add(rEnterCashAmntValueTxf, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 230, 20));

        lokerIdValueTxf.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        chequePayPanel.add(lokerIdValueTxf, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, 230, 20));

        cashIssuedTimehhTxt.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        chequePayPanel.add(cashIssuedTimehhTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, 70, 20));
        chequePayPanel.add(cashIssuedDateChooser, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, 230, -1));

        chequePayPanel.add(cashRecievedByComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 240, 230, -1));

        chequePayPanel.add(cashIssuedByComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, 230, -1));

        issuedTimeLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        issuedTimeLabel1.setText("Issued Time :");
        chequePayPanel.add(issuedTimeLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 100, 20));

        grnIdTxt22.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        chequePayPanel.add(grnIdTxt22, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, 70, 20));

        issuedTimeLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        issuedTimeLabel2.setText("hh");
        chequePayPanel.add(issuedTimeLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 180, 30, 20));

        cashIssuedTimeminTxt.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        chequePayPanel.add(cashIssuedTimeminTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 180, 70, 20));

        issuedTimeLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        issuedTimeLabel3.setText("min");
        chequePayPanel.add(issuedTimeLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 180, 30, 20));

        chequePayPanel1.setBackground(new java.awt.Color(255, 255, 255));
        chequePayPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "Cheque Payments", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N
        chequePayPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cheqNumLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cheqNumLabel.setText("Cheque Number :");
        chequePayPanel1.add(cheqNumLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, 20));

        bankLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        bankLabel.setText("Bank :");
        chequePayPanel1.add(bankLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 110, 20));

        typeLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        typeLabel.setText("Type :");
        chequePayPanel1.add(typeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 110, 20));

        cheqIssuedDateLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cheqIssuedDateLabel.setText("Issued Date :");
        chequePayPanel1.add(cheqIssuedDateLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 110, 20));

        validityStartingDateLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        validityStartingDateLabel.setText("Validity Starting Date :");
        chequePayPanel1.add(validityStartingDateLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 160, 20));

        cheqAmntLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cheqAmntLabel.setText("Amount :");
        chequePayPanel1.add(cheqAmntLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 110, 20));

        cheqStatusLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cheqStatusLabel.setText("Status :");
        chequePayPanel1.add(cheqStatusLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 140, 20));

        cheqIssuedByLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cheqIssuedByLabel.setText("Issued By :");
        chequePayPanel1.add(cheqIssuedByLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 140, 20));

        cheqRecievedByLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cheqRecievedByLabel.setText("Recieved By :");
        chequePayPanel1.add(cheqRecievedByLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 140, 20));

        cheqNumValueTxf.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cheqNumValueTxf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cheqNumValueTxfActionPerformed(evt);
            }
        });
        chequePayPanel1.add(cheqNumValueTxf, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, 240, 20));

        reEnterCheqNumLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        reEnterCheqNumLabel.setText("Re-Enter the Cheque Number :");
        chequePayPanel1.add(reEnterCheqNumLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 190, 20));

        cheqIdLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cheqIdLabel.setText("Cheque ID :");
        chequePayPanel1.add(cheqIdLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, 20));

        cheqIdValueLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cheqIdValueLabel.setText("XXXXXXXXXXXXX");
        chequePayPanel1.add(cheqIdValueLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, 240, 20));

        cheqAmntValueLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        chequePayPanel1.add(cheqAmntValueLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 240, 240, 20));

        reEnterCheqAmntLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        reEnterCheqAmntLabel.setText("Re-Enter the Amount :");
        chequePayPanel1.add(reEnterCheqAmntLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 160, 20));

        reEnterCheqAmntValueTxf.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        chequePayPanel1.add(reEnterCheqAmntValueTxf, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 270, 240, 20));

        cheqPayEditBtn.setBackground(new java.awt.Color(255, 255, 255));
        cheqPayEditBtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cheqPayEditBtn.setText("Edit");
        cheqPayEditBtn.setFocusable(false);
        chequePayPanel1.add(cheqPayEditBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 400, 150, -1));

        reEnterCheqNumValueTxf.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        chequePayPanel1.add(reEnterCheqNumValueTxf, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, 240, 20));

        bankValueTxf.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        chequePayPanel1.add(bankValueTxf, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, 240, 20));

        grnIdTxt16.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        chequePayPanel1.add(grnIdTxt16, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, 240, 20));
        chequePayPanel1.add(validityStartDateChooser, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 210, 240, 20));
        chequePayPanel1.add(cheqIssuedDateChooser, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 180, 240, 20));

        chequePayPanel1.add(cheqStatusComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 300, 240, 20));

        chequePayPanel1.add(cheqIssuedByComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 330, 240, -1));

        chequePayPanel1.add(cheqRecievedByComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 360, 240, -1));

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(headingPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(chequePayPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(27, 27, 27)
                .addComponent(chequePayPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addComponent(headingPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(chequePayPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 438, Short.MAX_VALUE)
                    .addComponent(chequePayPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        getContentPane().add(mainPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, 990, 520));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void closeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeBtnActionPerformed
        this.dispose();
    }//GEN-LAST:event_closeBtnActionPerformed

    private void cheqNumValueTxfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cheqNumValueTxfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cheqNumValueTxfActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EditDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                EditDetails.getInstance(null, 0).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bankLabel;
    private javax.swing.JTextField bankValueTxf;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel cashAmountLabel;
    private javax.swing.JTextField cashAmountValuTxf;
    private javax.swing.JComboBox<String> cashIssuedByComboBox;
    private com.toedter.calendar.JDateChooser cashIssuedDateChooser;
    private javax.swing.JTextField cashIssuedTimehhTxt;
    private javax.swing.JTextField cashIssuedTimeminTxt;
    private javax.swing.JButton cashPayEditBtn;
    private javax.swing.JLabel cashPayIdLabel;
    private javax.swing.JLabel cashPayIdValueLabel;
    private javax.swing.JComboBox<String> cashRecievedByComboBox;
    private javax.swing.JLabel cheqAmntLabel;
    private javax.swing.JTextField cheqAmntValueLabel;
    private javax.swing.JLabel cheqIdLabel;
    private javax.swing.JLabel cheqIdValueLabel;
    private javax.swing.JComboBox<String> cheqIssuedByComboBox;
    private javax.swing.JLabel cheqIssuedByLabel;
    private com.toedter.calendar.JDateChooser cheqIssuedDateChooser;
    private javax.swing.JLabel cheqIssuedDateLabel;
    private javax.swing.JLabel cheqNumLabel;
    private javax.swing.JTextField cheqNumValueTxf;
    private javax.swing.JButton cheqPayEditBtn;
    private javax.swing.JComboBox<String> cheqRecievedByComboBox;
    private javax.swing.JLabel cheqRecievedByLabel;
    private javax.swing.JComboBox<String> cheqStatusComboBox;
    private javax.swing.JLabel cheqStatusLabel;
    private javax.swing.JPanel chequePayPanel;
    private javax.swing.JPanel chequePayPanel1;
    private javax.swing.JButton closeBtn;
    private javax.swing.JTextField grnIdTxt16;
    private javax.swing.JTextField grnIdTxt22;
    private javax.swing.JLabel headingLabel;
    private javax.swing.JPanel headingPanel;
    private javax.swing.JLabel issuedByLabel;
    private javax.swing.JLabel issuedDateLabel;
    private javax.swing.JLabel issuedTimeLabel;
    private javax.swing.JLabel issuedTimeLabel1;
    private javax.swing.JLabel issuedTimeLabel2;
    private javax.swing.JLabel issuedTimeLabel3;
    private javax.swing.JLabel lockerIdLabel;
    private javax.swing.JTextField lokerIdValueTxf;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JTextField rEnterCashAmntValueTxf;
    private javax.swing.JLabel reEnterCashAmntLabel;
    private javax.swing.JLabel reEnterCheqAmntLabel;
    private javax.swing.JTextField reEnterCheqAmntValueTxf;
    private javax.swing.JLabel reEnterCheqNumLabel;
    private javax.swing.JTextField reEnterCheqNumValueTxf;
    private javax.swing.JLabel recievedByLabel;
    private javax.swing.JLabel typeLabel;
    private com.toedter.calendar.JDateChooser validityStartDateChooser;
    private javax.swing.JLabel validityStartingDateLabel;
    // End of variables declaration//GEN-END:variables

//    private void disableDateChooser() {
//        dateChooser1 = (JTextFieldDateEditor)jDateChooser1.getDateEditor();
//        dateChooser1.setEditable(false);
//        dateChooser2 = (JTextFieldDateEditor)jDateChooser2.getDateEditor();
//        dateChooser2.setEditable(false);
//    }
//    private JTextFieldDateEditor dateChooser1;
//    private JTextFieldDateEditor dateChooser2;
}
