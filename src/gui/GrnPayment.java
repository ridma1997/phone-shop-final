/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import db.Database;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.Savepoint;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Validation;

/**
 *
 * @author hp
 */
public class GrnPayment extends javax.swing.JFrame {

    /**
     * Creates new form SupplierType
     */
    public static final int FIRST_TIME_CASH_ENTER = 1;
    public static final int RE_CASH_ENTER = 2;
    private int state;
    private int homeState = 0;
    private static GrnPayment rd;
    private Savepoint sp;

    private GrnPayment() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
        this.setBackground(new Color(100, 133, 255, 80));
        setDataToTable();
        //setStateToWindow(state);
    }

    public static synchronized GrnPayment getInstance(int State) {
        if (rd == null) {
            rd = new GrnPayment();
        }
        rd.state = State;
        rd.setStateToWindow(State);
        rd.setDataToTable();
        return rd;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        grnIdLbl = new javax.swing.JLabel();
        netTotalLbl = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        approvedCheck = new javax.swing.JCheckBox();
        cashRadio = new javax.swing.JRadioButton();
        chequeRadio = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        chequeNoTxt = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        sellingPriceTxt = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        checkDate = new com.toedter.calendar.JDateChooser();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1366, 768));
        setUndecorated(true);
        setSize(new java.awt.Dimension(1366, 768));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 102), 2));

        jPanel2.setBackground(new java.awt.Color(153, 153, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("| GRN Payment |");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 10, 300, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Errpng.png"))); // NOI18N
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setFocusable(false);
        jButton1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/herror.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 0, 40, 50));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("GRN ID   :");

        grnIdLbl.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        grnIdLbl.setText("001");

        netTotalLbl.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        netTotalLbl.setText("001");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Net Total:");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "GRN Stock ID", "PRO ID", "PRO NAME", "QTY", "Buying Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "GRN Stock ID", "PRO ID", "PRO NAME", "Buying Price", "Selling Price", "QTy"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable2.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(jTable2);

        approvedCheck.setBackground(new java.awt.Color(255, 255, 255));
        approvedCheck.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        approvedCheck.setText("Approved This GRN");
        approvedCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                approvedCheckActionPerformed(evt);
            }
        });

        cashRadio.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup2.add(cashRadio);
        cashRadio.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cashRadio.setText("Cash Payment");
        cashRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cashRadioActionPerformed(evt);
            }
        });

        chequeRadio.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup2.add(chequeRadio);
        chequeRadio.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        chequeRadio.setText("Cheque Payment");
        chequeRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chequeRadioActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Cheque No");

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setText("Save");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        sellingPriceTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                sellingPriceTxtKeyTyped(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("  Add Selling Price");

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton3.setText("Add");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("Validity Start Date");

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton4.setText("Reset Form");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(213, 213, 213)
                .addComponent(cashRadio)
                .addGap(34, 34, 34)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chequeRadio)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 367, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(208, 208, 208))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(143, 143, 143)
                                .addComponent(checkDate, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(153, 153, 153)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(approvedCheck, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 524, Short.MAX_VALUE)
                .addComponent(chequeNoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(397, 397, 397))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jButton4)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(grnIdLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(netTotalLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(sellingPriceTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2)
                        .addGap(18, 18, 18))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                    .addComponent(grnIdLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5)
                    .addComponent(netTotalLbl))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sellingPriceTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton3)))
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chequeRadio)
                    .addComponent(cashRadio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chequeNoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(approvedCheck))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2)
                    .addComponent(jLabel11)
                    .addComponent(checkDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(jButton4)
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1100, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(131, 131, 131)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(131, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(106, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void approvedCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_approvedCheckActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_approvedCheckActionPerformed

    private void sellingPriceTxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sellingPriceTxtKeyTyped
        Validation.numberVal(sellingPriceTxt.getText().trim(), evt);
    }//GEN-LAST:event_sellingPriceTxtKeyTyped

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
            DefaultTableModel dtm2 = (DefaultTableModel) jTable2.getModel();

            int selectedRow = jTable1.getSelectedRow();
            if (selectedRow >= 0) {
                String grnStockID = dtm.getValueAt(selectedRow, 0).toString();
                String selPrice = sellingPriceTxt.getText().trim();
                if (!selPrice.isEmpty()) {
                    if (!(Double.parseDouble(selPrice) == 0)) {
                        double bPrice = Double.parseDouble(dtm.getValueAt(selectedRow, 4).toString());
                        if (Double.parseDouble(selPrice) >= bPrice) {
                            String ID = dtm.getValueAt(selectedRow, 0).toString();
                            String proId = dtm.getValueAt(selectedRow, 1).toString();
                            String proName = dtm.getValueAt(selectedRow, 2).toString();
                            String qty = dtm.getValueAt(selectedRow, 3).toString();
                            String buyPrice = dtm.getValueAt(selectedRow, 4).toString();
                            Vector v = new Vector();
                            v.add(ID);
                            v.add(proId);
                            v.add(proName);
                            v.add(buyPrice);
                            v.add(selPrice);
                            v.add(qty);
                            dtm2.addRow(v);
                            dtm.removeRow(selectedRow);
                        } else {
                            JOptionPane.showMessageDialog(this, "Selling price is must be grater than or equal to buying price", "ERROR", JOptionPane.ERROR_MESSAGE);
                        }
                    } else {
                        JOptionPane.showMessageDialog(this, "Selling price cannot be Zero", "ERROR", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Please Enter Selling Price", "ERROR", JOptionPane.ERROR_MESSAGE);
                }
                //GrnPayment.getInstance(Integer.parseInt(grnID)).setVisible(true);
            } else {
                JOptionPane.showMessageDialog(this, "Please select grn first ", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(this, "Please select grn first ", "ERROR", JOptionPane.ERROR_MESSAGE);
        } catch (ArrayIndexOutOfBoundsException ex) {
            JOptionPane.showMessageDialog(this, "Please select grn first ", "ERROR", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        setDataToTable();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void cashRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cashRadioActionPerformed
        if (cashRadio.isSelected()) {
            chequeNoTxt.setEnabled(false);
            checkDate.setEnabled(false);
        } else {
            chequeNoTxt.setEnabled(true);
            checkDate.setEnabled(true);
        }
    }//GEN-LAST:event_cashRadioActionPerformed

    private void chequeRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chequeRadioActionPerformed
        if (chequeRadio.isSelected()) {
            chequeNoTxt.setEnabled(true);
            checkDate.setEnabled(true);
        } else {
            chequeNoTxt.setEnabled(false);
            checkDate.setEnabled(false);
        }
    }//GEN-LAST:event_chequeRadioActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
            DefaultTableModel dtm2 = (DefaultTableModel) jTable2.getModel();
            Database.getConnection().setAutoCommit(false);
            sp = Database.getConnection().setSavepoint("s1");
            if (approvedCheck.isSelected()) {
                if (dtm.getRowCount() == 0 && dtm2.getRowCount() > 0) {
                    if (chequeRadio.isSelected()) {
                        String no = chequeNoTxt.getText().trim();
                        Date d = checkDate.getDate();
                        if (!(no.isEmpty() || d == null)) {
                            String date = new SimpleDateFormat("yyyy-MM-dd").format(d);
                            for (int i = 0; i < dtm2.getRowCount(); i++) {
                                String enterDate = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
                                String enterTime = new SimpleDateFormat("HH:mm:ss").format(new Date());
                                String grnStockId = dtm2.getValueAt(i, 0).toString();
                                String proID = dtm2.getValueAt(i, 1).toString();
                                String sellPrice = dtm2.getValueAt(i, 4).toString();
                                String qty = dtm2.getValueAt(i, 5).toString();
                            }
                        } else {
                            JOptionPane.showMessageDialog(this, "Please Enter the Cheque Details", "ERROR", JOptionPane.ERROR_MESSAGE);
                        }
                    } else {
                        for (int i = 0; i < dtm2.getRowCount(); i++) {
                            String enterDate = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
                            String enterTime = new SimpleDateFormat("HH:mm:ss").format(new Date());
                            String grnStockId = dtm2.getValueAt(i, 0).toString();
                            String proID = dtm2.getValueAt(i, 1).toString();
                            String sellPrice = dtm2.getValueAt(i, 4).toString();
                            String qty = dtm2.getValueAt(i, 5).toString();
                            ResultSet search = Database.search("select barcode from grn_stock where grn_stock_id='" + grnStockId + "'");
                            String bcd = "";
                            if (search.next()) {
                                bcd = search.getString("barcode");
                                if (!bcd.trim().isEmpty()) {
                                    ResultSet se = Database.search("select * from product_stock where barcode='" + bcd + "' and pro_id = '" + proID + "'");
                                    if (se.next()) {
                                        int cnfrm = JOptionPane.showConfirmDialog(this, "There are already stocks for this produt name and barcode. Do you want to override the stock with these values", "Warning", JOptionPane.YES_NO_CANCEL_OPTION);
                                        if (cnfrm == JOptionPane.YES_OPTION) {

                                        } else if (cnfrm == JOptionPane.NO_OPTION) {
                                            int cnfrm2 = JOptionPane.showConfirmDialog(this, "There are already stocks for this produt name and barcode. Do you want to override the stock with these values", "Warning", JOptionPane.YES_NO_CANCEL_OPTION);

                                        } else {

                                            JOptionPane.showMessageDialog(this, "GRN is not Complete. Stock was not created", "ERROR", JOptionPane.ERROR_MESSAGE);
                                            Database.getConnection().rollback(sp);
                                            break;
                                        }
                                    }
                                } else {

                                }
                            }

                        }
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Please add Selling Prices", "ERROR", JOptionPane.ERROR_MESSAGE);
                }

            } else {
                JOptionPane.showMessageDialog(this, "Please Approve this GRN", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
            Database.getConnection().setAutoCommit(true);
        } catch (Exception e) {
            try {
                Database.getConnection().rollback(sp);
                Database.getConnection().setAutoCommit(true);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(GrnPayment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GrnPayment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GrnPayment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GrnPayment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                GrnPayment.getInstance(8).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox approvedCheck;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JRadioButton cashRadio;
    private com.toedter.calendar.JDateChooser checkDate;
    private javax.swing.JTextField chequeNoTxt;
    private javax.swing.JRadioButton chequeRadio;
    private javax.swing.JLabel grnIdLbl;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JLabel netTotalLbl;
    private javax.swing.JTextField sellingPriceTxt;
    // End of variables declaration//GEN-END:variables

    private void setStateToWindow(int state) {

    }

    private void setDataToTable() {
        try {
            DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
            DefaultTableModel dtm2 = (DefaultTableModel) jTable2.getModel();
            cashRadio.setSelected(true);
            chequeNoTxt.setEnabled(false);
            checkDate.setEnabled(false);
            sellingPriceTxt.setText(null);
            dtm.setRowCount(0);
            dtm2.setRowCount(0);
            String id = "";
            String sql = "select grn_id as id, total_amount-total_discount as net_total from grn where grn_id = '" + state + "'";
            ResultSet rs = Database.search(sql);
            if (rs.next()) {
                id = rs.getString("id");
                grnIdLbl.setText(id);
                netTotalLbl.setText(rs.getString("net_total"));
            }
            String sql2 = "select gs.grn_stock_id,gs.product_pro_id as proId, p.name as name,gs.get_unit_price as buying_price, gs.qty as QTY from grn_stock gs inner join product p on p.pro_id = gs.product_pro_id where gs.grn_id ='" + id + "'";
            ResultSet rs2 = Database.search(sql2);
            while (rs2.next()) {
                Vector v = new Vector();
                v.add(rs2.getString("grn_stock_id"));
                v.add(rs2.getString("proID"));
                v.add(rs2.getString("name"));
                v.add(rs2.getString("QTY"));
                v.add(rs2.getString("buying_price"));
                dtm.addRow(v);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
