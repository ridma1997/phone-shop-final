package gui;

import java.awt.Color;
import static java.awt.Frame.MAXIMIZED_BOTH;
import javax.swing.JFrame;

public class GRN_Payment extends javax.swing.JFrame {

    private static GRN_Payment p;

    public GRN_Payment() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
        this.setBackground(new Color(100, 100, 225, 80));

    }

    JFrame backWindow;
    int currentState;

    public static GRN_Payment getInstance(JFrame backWindow, int currentState) {
        if (p == null) {
            p = new GRN_Payment();
        }
        return p;

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel5 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        grnIdLabel = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        supIdLabel = new javax.swing.JLabel();
        grnDateLabel = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        totalLabel = new javax.swing.JLabel();
        payCashBtn = new javax.swing.JButton();
        payCheqBtn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        paymentTable = new javax.swing.JTable();
        removeBtn = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(1360, 768));
        setMinimumSize(new java.awt.Dimension(1360, 768));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1360, 768));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102), 2));

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("|  GRN PAYMENTS  |");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 40));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Errpng.png"))); // NOI18N
        jButton1.setContentAreaFilled(false);
        jButton1.setFocusable(false);
        jButton1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/herror.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 0, 40, 40));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("GRN Date :");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("Supplier ID :");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, -1, -1));

        grnIdLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        grnIdLabel.setForeground(new java.awt.Color(102, 102, 102));
        grnIdLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        grnIdLabel.setText("001");
        jPanel3.add(grnIdLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, 80, 20));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 102, 102));
        jLabel9.setText("GRN ID :");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, -1, -1));

        supIdLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        supIdLabel.setForeground(new java.awt.Color(102, 102, 102));
        supIdLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        supIdLabel.setText("001");
        jPanel3.add(supIdLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, 80, 20));

        grnDateLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        grnDateLabel.setForeground(new java.awt.Color(102, 102, 102));
        grnDateLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        grnDateLabel.setText("001");
        jPanel3.add(grnDateLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, 80, -1));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Total :");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 80, 20));

        totalLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        totalLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        totalLabel.setText("9500.00");
        totalLabel.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jPanel4.add(totalLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 110, -1));

        payCashBtn.setBackground(new java.awt.Color(255, 255, 255));
        payCashBtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        payCashBtn.setText("Pay Cash");
        payCashBtn.setFocusable(false);
        payCashBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payCashBtnActionPerformed(evt);
            }
        });
        jPanel4.add(payCashBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 100, -1));

        payCheqBtn.setBackground(new java.awt.Color(255, 255, 255));
        payCheqBtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        payCheqBtn.setText("Pay Cheque");
        payCheqBtn.setFocusable(false);
        payCheqBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payCheqBtnActionPerformed(evt);
            }
        });
        jPanel4.add(payCheqBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 130, -1));

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 300, 120));

        paymentTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Installment ID", "Actual Date"
            }
        ));
        jScrollPane2.setViewportView(paymentTable);

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 10, 330, 190));

        removeBtn.setBackground(new java.awt.Color(255, 255, 255));
        removeBtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        removeBtn.setText("Remove ");
        jPanel3.add(removeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 220, 210, -1));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 230, 700, 330));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void payCheqBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payCheqBtnActionPerformed
        Cheque c1 = Cheque.getInstance(null, 0);
        c1.setVisible(true);
    }//GEN-LAST:event_payCheqBtnActionPerformed

    private void payCashBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payCashBtnActionPerformed
        CashPayments c = CashPayments.getInstance(null, 0);
        c.setVisible(true);
    }//GEN-LAST:event_payCashBtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GRN_Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GRN_Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GRN_Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GRN_Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                GRN_Payment.getInstance(null, 0).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel grnDateLabel;
    private javax.swing.JLabel grnIdLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton payCashBtn;
    private javax.swing.JButton payCheqBtn;
    private javax.swing.JTable paymentTable;
    private javax.swing.JButton removeBtn;
    private javax.swing.JLabel supIdLabel;
    private javax.swing.JLabel totalLabel;
    // End of variables declaration//GEN-END:variables
}
