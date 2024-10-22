/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import static controller.TestDatabase.setData;
import db.Database;
import java.awt.Color;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author Ravinath Geethanjana
 */
public class DBConfiguration extends javax.swing.JPanel {

    /**
     * Creates new form DBConfiguration
     */
    private static DBConfiguration p;

    private DBConfiguration() {
        initComponents();
        connectionMsgLbl.setText(null);
        setDataToCurrentConfiguration();
        setExternalPath();
    }

    public static synchronized DBConfiguration getInstance() {
        if (p == null) {
            p = new DBConfiguration();
        }
        p.setDataToCurrentConfiguration();
        return p;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        defaultDBTxt = new javax.swing.JTextField();
        defaultServerTxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        defaultportTxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        defaultrootTxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField12 = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        dbNameTxt = new javax.swing.JTextField();
        serverTxt = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        portTxt = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        userTxt = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        pwdTxt = new javax.swing.JPasswordField();
        testConfigBtn = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        connectionMsgLbl = new javax.swing.JLabel();
        saveBtn = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        pathTxt = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(1340, 648));
        setMinimumSize(new java.awt.Dimension(1340, 648));
        setPreferredSize(new java.awt.Dimension(1340, 648));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "Current DB Configurations", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel2.setText("Database Name");

        defaultDBTxt.setEditable(false);
        defaultDBTxt.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        defaultDBTxt.setText("MyDB");
        defaultDBTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                defaultDBTxtActionPerformed(evt);
            }
        });

        defaultServerTxt.setEditable(false);
        defaultServerTxt.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        defaultServerTxt.setText("127.0.0.1");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel3.setText("Server");

        defaultportTxt.setEditable(false);
        defaultportTxt.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        defaultportTxt.setText("3307");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel4.setText("Port");

        defaultrootTxt.setEditable(false);
        defaultrootTxt.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        defaultrootTxt.setText("root");
        defaultrootTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                defaultrootTxtActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel5.setText("User");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel6.setText("Password");

        jTextField12.setEditable(false);
        jTextField12.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jTextField12.setText("Hidden");
        jTextField12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField12ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(defaultDBTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(defaultServerTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(defaultportTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(defaultrootTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(196, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(defaultDBTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(defaultServerTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(defaultportTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(defaultrootTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "Add DB Configuration", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel7.setText("Change Database Name");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 40, -1, 40));

        dbNameTxt.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jPanel4.add(dbNameTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 40, 204, 40));

        serverTxt.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jPanel4.add(serverTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 90, 204, 36));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel8.setText("Change Server");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 153, 36));

        portTxt.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jPanel4.add(portTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 140, 204, 38));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel9.setText("Change Port");
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 153, 38));

        userTxt.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jPanel4.add(userTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 190, 204, 36));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel10.setText("Chnage User");
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 153, 36));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel11.setText("Change Password");
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 153, 35));

        pwdTxt.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jPanel4.add(pwdTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 240, 204, 35));

        testConfigBtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        testConfigBtn.setForeground(new java.awt.Color(0, 204, 0));
        testConfigBtn.setText("Test Connection");
        testConfigBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                testConfigBtnActionPerformed(evt);
            }
        });
        jPanel4.add(testConfigBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 310, 204, -1));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel4.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 40, 20, 240));

        connectionMsgLbl.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        connectionMsgLbl.setForeground(new java.awt.Color(255, 0, 0));
        connectionMsgLbl.setText("Connection Error");
        jPanel4.add(connectionMsgLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 480, -1));

        saveBtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        saveBtn.setForeground(new java.awt.Color(51, 0, 204));
        saveBtn.setText("Save Configurations");
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });
        jPanel4.add(saveBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 310, 160, -1));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Database Backup Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel13.setText("Default Backup Location");

        jTextField9.setEditable(false);
        jTextField9.setText("C:/MOBSYS/db/backup/backup.sql");

        pathTxt.setEditable(false);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel14.setText("Add another Location");

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 51, 102));
        jButton3.setText("Browes Location");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(pathTxt)
                    .addComponent(jTextField9, javax.swing.GroupLayout.DEFAULT_SIZE, 386, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(pathTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(0, 0, 153));
        jButton4.setText("Reset Default");
        jButton4.setBorderPainted(false);
        jButton4.setDefaultCapable(false);
        jButton4.setFocusPainted(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, -1, 48));

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(0, 102, 255));
        jButton5.setText("Backup Database");
        jButton5.setBorderPainted(false);
        jButton5.setDefaultCapable(false);
        jButton5.setFocusPainted(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, -1, 48));

        jButton6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton6.setForeground(new java.awt.Color(204, 0, 0));
        jButton6.setText("Forgot Account Details");
        jButton6.setBorderPainted(false);
        jButton6.setDefaultCapable(false);
        jButton6.setFocusPainted(false);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(179, 120, 220, 48));

        jButton7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton7.setForeground(new java.awt.Color(204, 0, 0));
        jButton7.setText("Restore Database");
        jButton7.setBorderPainted(false);
        jButton7.setDefaultCapable(false);
        jButton7.setFocusPainted(false);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 60, -1, 48));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 652, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 653, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)))
                .addGap(24, 24, 24))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 37, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        try {
            if (!(dbNameTxt.getText().trim().isEmpty() || serverTxt.getText().trim().isEmpty() || userTxt.getText().trim().isEmpty() || portTxt.getText().trim().isEmpty() || new String(pwdTxt.getPassword()).trim().isEmpty())) {

                setData(serverTxt.getText().trim(), userTxt.getText().trim(), portTxt.getText().trim(), dbNameTxt.getText().trim(), new String(pwdTxt.getPassword()).trim());
                connectionMsgLbl.setForeground(Color.blue);

                String hostPath = "F:/MOBSYS/db/detail/host.mobsys";
                String userPath = "F:/MOBSYS/db/detail/user.mobsys";
                String dbPath = "F:/MOBSYS/db/detail/dbName.mobsys";
                String portPath = "F:/MOBSYS/db/detail/port.mobsys";
                String pwdPath = "F:/MOBSYS/db/detail/pwd.mobsys";

                String dbVal = dbNameTxt.getText().trim();
                String hostVal = serverTxt.getText().trim();
                String portVal = portTxt.getText().trim();
                String pwdVal = pwdTxt.getText().trim();
                String userVal = userTxt.getText().trim();

                PrintWriter host = new PrintWriter(new File(hostPath));
                PrintWriter port = new PrintWriter(new File(portPath));
                PrintWriter pwd = new PrintWriter(new File(pwdPath));
                PrintWriter user = new PrintWriter(new File(userPath));
                PrintWriter db = new PrintWriter(new File(dbPath));

                host.println(hostVal);
                port.println(portVal);
                pwd.println(pwdVal);
                user.println(userVal);
                db.println(dbVal);

                host.flush();
                port.flush();
                pwd.flush();
                user.flush();
                db.flush();

                host.close();
                port.close();
                pwd.close();
                user.close();
                db.close();
                //connectionMsgLbl.setText("Succuss");
                dbNameTxt.setText(null);
                portTxt.setText(null);
                userTxt.setText(null);
                serverTxt.setText(null);
                pwdTxt.setText(null);
                JOptionPane.showMessageDialog(this, "Succuss...!", "Alert", JOptionPane.INFORMATION_MESSAGE);
            } else {
                connectionMsgLbl.setForeground(Color.red);
                connectionMsgLbl.setText("Please Fill All fields");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_saveBtnActionPerformed

    private void defaultDBTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_defaultDBTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_defaultDBTxtActionPerformed

    private void defaultrootTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_defaultrootTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_defaultrootTxtActionPerformed

    private void jTextField12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField12ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        JFileChooser upload = new JFileChooser();
        String path = "";
        upload.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int i = upload.showOpenDialog(null);
        if (i == JFileChooser.APPROVE_OPTION) {
            File selectedFile = upload.getSelectedFile();
            path = selectedFile.getAbsolutePath();
            //path.replace("\\", "/");
            //System.out.println(path);
        }
        path += "\\backup.sql";

        try {
            PrintWriter pw = new PrintWriter(new File("F:/MOBSYS/db/backup/location.mobsys"));
            pw.println(path);
            pw.flush();
            pw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        pathTxt.setText(path);
        //System.out.println(path);

    }//GEN-LAST:event_jButton3ActionPerformed

    private void testConfigBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_testConfigBtnActionPerformed
        try {
            //setUpConnection();

            if (!(dbNameTxt.getText().trim().isEmpty() || serverTxt.getText().trim().isEmpty() || userTxt.getText().trim().isEmpty() || portTxt.getText().trim().isEmpty() || new String(pwdTxt.getPassword()).trim().isEmpty())) {

                setData(serverTxt.getText().trim(), userTxt.getText().trim(), portTxt.getText().trim(), dbNameTxt.getText().trim(), new String(pwdTxt.getPassword()).trim());
                connectionMsgLbl.setForeground(Color.blue);
                connectionMsgLbl.setText("Succuss");
            } else {
                connectionMsgLbl.setForeground(Color.red);
                connectionMsgLbl.setText("Please Fill All fields");
            }

        } catch (Exception e) {
            connectionMsgLbl.setForeground(Color.red);
            connectionMsgLbl.setText("Connection Error");
            //e.printStackTrace();
        }
    }//GEN-LAST:event_testConfigBtnActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        new Thread() {
            @Override
            public void run() {
                backupDb();
            }

        }.start();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        resetDefault();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        ForgotAccountDetail.getInstance(0).setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        
    }//GEN-LAST:event_jButton7ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel connectionMsgLbl;
    private javax.swing.JTextField dbNameTxt;
    private javax.swing.JTextField defaultDBTxt;
    private javax.swing.JTextField defaultServerTxt;
    private javax.swing.JTextField defaultportTxt;
    private javax.swing.JTextField defaultrootTxt;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JTextField pathTxt;
    private javax.swing.JTextField portTxt;
    private javax.swing.JPasswordField pwdTxt;
    private javax.swing.JButton saveBtn;
    private javax.swing.JTextField serverTxt;
    private javax.swing.JButton testConfigBtn;
    private javax.swing.JTextField userTxt;
    // End of variables declaration//GEN-END:variables

    private void setDataToCurrentConfiguration() {
        try {
            defaultServerTxt.setText(Database.getHost());
            defaultrootTxt.setText(Database.getUser());
            defaultportTxt.setText(Database.getPort());
            defaultDBTxt.setText(Database.getDbName());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void backupDb() {
        try {

            String path = "";
            String dbUser = "root"/*Database.getUser()*/;
            String dbpassword = "123"/*Database.getPassword()*/;
            String port = "3307"/*Database.getPort()*/;
            String dbName = "mobie_phone_shop_er"/*Database.getDbName()*/;
            String defaultPath = "C:/MOBSYS/db/backup/backup.sql";
            
            System.out.println(dbUser);
            System.out.println(dbpassword);
            System.out.println(port);
            System.out.println(dbName);
            System.out.println();

            BufferedReader br = new BufferedReader(new FileReader(new File("F:/MOBSYS/db/backup/location.mobsys")));
            String line;
            while ((line = br.readLine()) != null) {
                path = line;
            }
            br.close();

            System.out.println(path);
            //String executeCmd = "mysqldump -u " + Database.getUser() + " -p" + Database.getPassword() + " --port="+Database.getPort()+" --add-drop-database -B" + Database.getDbName() + " -r" + path;
            String executeCmd = "mysqldump -u " + dbUser + " -p" + dbpassword + " --port=" + port + " --add-drop-database -B " + dbName + " -r " + path;
            String executeCmd2 = "mysqldump -u " + dbUser + " -p" + dbpassword + " --port=" + port + " --add-drop-database -B " + dbName + " -r " + defaultPath;
            //String executeCmd3 = "mysqldump -u " + "root" + " -p" + "123" + " --port=3307 --add-drop-database -B " + "mobie_phone_shop_er" + " -r " + path;
            Process runtimeProcess, process2;

            runtimeProcess = Runtime.getRuntime().exec(executeCmd);

            int processComplete = runtimeProcess.waitFor();

            boolean b1 = false;
            if (processComplete == 0) {
                b1 = true;

            } else {
                b1 = false;
            }
            process2 = Runtime.getRuntime().exec(executeCmd);
            int i = process2.waitFor();
            boolean b2 = false;
            if (i == 0) {
                b2 = true;
            } else {
                b2 = false;
            }

            JOptionPane.showMessageDialog(this, "Backup Succussfully", "Alert", JOptionPane.INFORMATION_MESSAGE);
            ShutDownSystem.getInstance(0).dispose();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private void setExternalPath() {
        try {
            BufferedReader br = new BufferedReader(new FileReader(new File("F:/MOBSYS/db/backup/location.mobsys")));
            String path = "";
            String line;
            while ((line = br.readLine()) != null) {
                path = line;
            }
            pathTxt.setText(path);
            br.close();
            br = null;
            System.gc();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void resetDefault() {
        try {
            BufferedReader br = new BufferedReader(new FileReader(new File("F:/MOBSYS/db/detail/default.mobsys")));
            String p = "";
            String line;
            while ((line = br.readLine()) != null) {
                p += "--" + line;
            }
            System.out.println(p);
            String[] ary = p.split("--");
//            for (int i = 0; i < ary.length; i++) {
//                System.out.println(ary[i]+"  "+i);
//            }
            String host = ary[1];
            //System.out.println(host);
            String user = ary[2];
            //System.out.println(user);
            String db = ary[3];
            //System.out.println(db);
            String port = ary[4];
            //System.out.println(port);
            String pwd = ary[5];
            //System.out.println(pwd);

            //System.out.println(host+" "+user+" "+port+" "+pwd+" "+db);
            PrintWriter pw;
            pw = new PrintWriter(new File("F:/MOBSYS/db/detail/host.mobsys"));
            pw.println(host);
            pw.flush();

            pw = new PrintWriter(new File("F:/MOBSYS/db/detail/port.mobsys"));
            pw.println(port);
            pw.flush();

            pw = new PrintWriter(new File("F:/MOBSYS/db/detail/dbName.mobsys"));
            pw.println(db);
            pw.flush();

            pw = new PrintWriter(new File("F:/MOBSYS/db/detail/pwd.mobsys"));
            pw.println(pwd);
            pw.flush();

            pw = new PrintWriter(new File("F:/MOBSYS/db/detail/user.mobsys"));
            pw.println(user);
            pw.flush();

            pw.close();
            pw = null;
            br = null;
            System.gc();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
