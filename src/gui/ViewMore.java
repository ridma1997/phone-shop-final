/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import com.toedter.calendar.JTextFieldDateEditor;
import java.awt.Color;
import javax.swing.JFrame;

/**
 *
 * @author Sanjula
 */
public class ViewMore extends javax.swing.JFrame {

    /**
     * Creates new form UnfilledGRN
     */
    private static ViewMore p;
    
    private ViewMore() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
        this.setBackground(new Color(100, 100, 225, 80));
        allInsRadioButton.setSelected(true);
//        disableDateChooser();
    }
    JFrame backWindow;
    int currentState;
    public synchronized static ViewMore getInstance(JFrame backWindow,int currentState) {
        if (p == null) {
            p = new ViewMore();
        }
        return p;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        mainPanel = new javax.swing.JPanel();
        headingPanel = new javax.swing.JPanel();
        closeBtn = new javax.swing.JButton();
        headingLabel = new javax.swing.JLabel();
        detailPanel = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        recievedEmpLabel = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        netTotalLabel = new javax.swing.JLabel();
        totalDiscountLabel = new javax.swing.JLabel();
        totalAmntLabel = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        grnIdLabel = new javax.swing.JLabel();
        issuedDateLabel = new javax.swing.JLabel();
        statusLabel = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        reffTextArea = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        agentTextArea = new javax.swing.JTextArea();
        installmentsPanel = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        totalBAlanceLabel = new javax.swing.JLabel();
        nextPayDateLabel = new javax.swing.JLabel();
        nextInsAmntLabel = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        pendingInstallmentsLabel = new javax.swing.JLabel();
        totalInstallmentsLabel = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        insCompletedDateLabel = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        insIdLabel = new javax.swing.JLabel();
        paidAmntLabel = new javax.swing.JLabel();
        insBalanceLabel = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        insPaymentDetailsTable = new javax.swing.JTable();
        viewInsTable = new javax.swing.JButton();
        jLabel41 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        installmentsTable = new javax.swing.JTable();
        jLabel24 = new javax.swing.JLabel();
        completeInstallmentsLabel = new javax.swing.JLabel();
        pendingInsRadioButton = new javax.swing.JRadioButton();
        allInsRadioButton = new javax.swing.JRadioButton();
        completedInsRadioButton = new javax.swing.JRadioButton();
        payAllBtn = new javax.swing.JButton();
        payForMoreBtn = new javax.swing.JButton();
        payForNextBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1360, 766));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        mainPanel.setBackground(new java.awt.Color(255, 255, 255));
        mainPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));

        headingPanel.setBackground(new java.awt.Color(153, 153, 255));
        headingPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        closeBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Errpng.png"))); // NOI18N
        closeBtn.setContentAreaFilled(false);
        closeBtn.setFocusable(false);
        closeBtn.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/herror.png"))); // NOI18N
        closeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeBtnActionPerformed(evt);
            }
        });
        headingPanel.add(closeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 0, 50, 40));

        headingLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        headingLabel.setForeground(new java.awt.Color(255, 255, 255));
        headingLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        headingLabel.setText("| GRN DETAILS |");
        headingPanel.add(headingLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1270, 40));

        detailPanel.setBackground(new java.awt.Color(255, 255, 255));
        detailPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        detailPanel.setMaximumSize(new java.awt.Dimension(680, 440));
        detailPanel.setPreferredSize(new java.awt.Dimension(680, 440));
        detailPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Recieved By :");
        detailPanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 100, 20));

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel20.setText("Agent :");
        detailPanel.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 70, 20));

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel21.setText("GRN issued date :");
        detailPanel.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 110, 20));

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel22.setText("Status :");
        detailPanel.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 110, 20));

        recievedEmpLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        recievedEmpLabel.setText("Sanjula");
        detailPanel.add(recievedEmpLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 350, 150, 20));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Net Total :");
        detailPanel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 80, -1));

        netTotalLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        netTotalLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        netTotalLabel.setText("10500.00");
        netTotalLabel.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        detailPanel.add(netTotalLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 400, 110, -1));

        totalDiscountLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        totalDiscountLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        totalDiscountLabel.setText("500.00");
        totalDiscountLabel.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        detailPanel.add(totalDiscountLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 440, 110, -1));

        totalAmntLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        totalAmntLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        totalAmntLabel.setText("10000.00");
        totalAmntLabel.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        detailPanel.add(totalAmntLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 480, 110, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setText("Total Amount :");
        detailPanel.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 480, -1, 20));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("Total Discount :");
        detailPanel.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, 110, 20));

        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel30.setText("GRN ID :");
        detailPanel.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 80, 20));

        grnIdLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        grnIdLabel.setText("00001");
        detailPanel.add(grnIdLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 110, 20));

        issuedDateLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        issuedDateLabel.setText("2018/03/03");
        detailPanel.add(issuedDateLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 280, 150, 20));

        statusLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        statusLabel.setText("On going");
        detailPanel.add(statusLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 310, 150, 20));

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel25.setText("Supplier ");
        detailPanel.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 80, 20));

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel26.setText("Reff :");
        detailPanel.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 70, 20));

        jScrollPane4.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane4.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        reffTextArea.setEditable(false);
        reffTextArea.setColumns(20);
        reffTextArea.setRows(5);
        jScrollPane4.setViewportView(reffTextArea);

        detailPanel.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, 250, 90));

        jScrollPane5.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane5.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        agentTextArea.setEditable(false);
        agentTextArea.setColumns(20);
        agentTextArea.setRows(5);
        agentTextArea.setFocusable(false);
        jScrollPane5.setViewportView(agentTextArea);

        detailPanel.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, 250, 90));

        installmentsPanel.setBackground(new java.awt.Color(255, 255, 255));
        installmentsPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "Installments Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N
        installmentsPanel.setMaximumSize(new java.awt.Dimension(680, 440));
        installmentsPanel.setPreferredSize(new java.awt.Dimension(680, 440));
        installmentsPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel23.setText("Pending Installments Count :");
        installmentsPanel.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 190, 20));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Balance :");
        installmentsPanel.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 30, 80, 20));

        totalBAlanceLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        totalBAlanceLabel.setForeground(new java.awt.Color(0, 102, 153));
        totalBAlanceLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        totalBAlanceLabel.setText("5000.00");
        totalBAlanceLabel.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        installmentsPanel.add(totalBAlanceLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 20, 120, 30));

        nextPayDateLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        nextPayDateLabel.setForeground(new java.awt.Color(255, 0, 0));
        nextPayDateLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        nextPayDateLabel.setText("2019/03/02");
        nextPayDateLabel.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        installmentsPanel.add(nextPayDateLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 60, 130, 30));

        nextInsAmntLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        nextInsAmntLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        nextInsAmntLabel.setText("1000.00");
        nextInsAmntLabel.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        installmentsPanel.add(nextInsAmntLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 90, 110, 40));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setText("Next Installment Amount :");
        installmentsPanel.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 100, -1, 20));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel18.setText("Next Payment Date :");
        installmentsPanel.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 60, -1, 30));

        pendingInstallmentsLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        pendingInstallmentsLabel.setText("5");
        installmentsPanel.add(pendingInstallmentsLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 110, 30, 20));

        totalInstallmentsLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        totalInstallmentsLabel.setText("10");
        installmentsPanel.add(totalInstallmentsLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 50, 30, 20));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Payment Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        insCompletedDateLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        insCompletedDateLabel.setText("2019/01/2");
        jPanel5.add(insCompletedDateLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 70, 20));

        jLabel43.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel43.setText("Paid Amount :");
        jPanel5.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 120, 20));

        jLabel44.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel44.setText("Balance :");
        jPanel5.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 120, 20));

        jLabel45.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel45.setText("Installment ID :");
        jPanel5.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 100, 20));

        insIdLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        insIdLabel.setText("01");
        jPanel5.add(insIdLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, 70, 20));

        paidAmntLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        paidAmntLabel.setText("2000.00");
        jPanel5.add(paidAmntLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, 70, 20));

        insBalanceLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        insBalanceLabel.setText("00.00");
        jPanel5.add(insBalanceLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, 70, 20));

        jLabel49.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel49.setText("Completed Date :");
        jPanel5.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 120, 20));

        insPaymentDetailsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Amount", "Payment Method"
            }
        ));
        jScrollPane1.setViewportView(insPaymentDetailsTable);

        jPanel5.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, 440, 130));

        viewInsTable.setBackground(new java.awt.Color(255, 255, 255));
        viewInsTable.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        viewInsTable.setText("View Each Installments");
        viewInsTable.setFocusable(false);
        viewInsTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewInsTableActionPerformed(evt);
            }
        });
        jPanel5.add(viewInsTable, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 160, 190, -1));

        installmentsPanel.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, 720, 200));

        jLabel41.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel41.setText("Total Installments Count :");
        installmentsPanel.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 180, 20));

        installmentsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Installment ID", "Amount", "Actual Date", "Expect Date", "Discount", "Status"
            }
        ));
        jScrollPane2.setViewportView(installmentsTable);

        installmentsPanel.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 720, 150));

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel24.setText("Complete Installments Count :");
        installmentsPanel.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 190, 20));

        completeInstallmentsLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        completeInstallmentsLabel.setText("5");
        installmentsPanel.add(completeInstallmentsLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 80, 30, 20));

        buttonGroup1.add(pendingInsRadioButton);
        pendingInsRadioButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        pendingInsRadioButton.setText("Pending");
        pendingInsRadioButton.setFocusable(false);
        pendingInsRadioButton.setOpaque(false);
        installmentsPanel.add(pendingInsRadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 150, -1, -1));

        buttonGroup1.add(allInsRadioButton);
        allInsRadioButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        allInsRadioButton.setText("All");
        allInsRadioButton.setFocusable(false);
        allInsRadioButton.setOpaque(false);
        installmentsPanel.add(allInsRadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, -1, -1));

        buttonGroup1.add(completedInsRadioButton);
        completedInsRadioButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        completedInsRadioButton.setText("Completed");
        completedInsRadioButton.setFocusable(false);
        completedInsRadioButton.setOpaque(false);
        installmentsPanel.add(completedInsRadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, -1, -1));

        payAllBtn.setBackground(new java.awt.Color(255, 255, 255));
        payAllBtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        payAllBtn.setText("Pay All");
        payAllBtn.setFocusable(false);
        payAllBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payAllBtnActionPerformed(evt);
            }
        });
        installmentsPanel.add(payAllBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 350, 140, -1));

        payForMoreBtn.setBackground(new java.awt.Color(255, 255, 255));
        payForMoreBtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        payForMoreBtn.setText("Pay for 2 or more Installment");
        payForMoreBtn.setFocusable(false);
        payForMoreBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payForMoreBtnActionPerformed(evt);
            }
        });
        installmentsPanel.add(payForMoreBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 350, 220, -1));

        payForNextBtn.setBackground(new java.awt.Color(255, 255, 255));
        payForNextBtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        payForNextBtn.setText("Pay for Next Installment");
        payForNextBtn.setFocusable(false);
        payForNextBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payForNextBtnActionPerformed(evt);
            }
        });
        installmentsPanel.add(payForNextBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 350, 190, -1));

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(headingPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(detailPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(installmentsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addComponent(headingPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(installmentsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 603, Short.MAX_VALUE)
                    .addComponent(detailPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        getContentPane().add(mainPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 50, 1270, 670));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void closeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeBtnActionPerformed
        this.dispose();
    }//GEN-LAST:event_closeBtnActionPerformed

    private void viewInsTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewInsTableActionPerformed
        ViewMore_View v = ViewMore_View.getInstance(null,0);
        v.setVisible(true);
    }//GEN-LAST:event_viewInsTableActionPerformed

    private void payForMoreBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payForMoreBtnActionPerformed
        GRN_Payment g = GRN_Payment.getInstance(null,0);
        g.setVisible(true);
    }//GEN-LAST:event_payForMoreBtnActionPerformed

    private void payAllBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payAllBtnActionPerformed
        GRN_Payment g = GRN_Payment.getInstance(null,0);
        g.setVisible(true);
    }//GEN-LAST:event_payAllBtnActionPerformed

    private void payForNextBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payForNextBtnActionPerformed
        GRN_Payment g=GRN_Payment.getInstance(null, 0);
        g.setVisible(true);
    }//GEN-LAST:event_payForNextBtnActionPerformed

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
            java.util.logging.Logger.getLogger(ViewMore.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewMore.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewMore.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewMore.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ViewMore.getInstance(null,0).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea agentTextArea;
    private javax.swing.JRadioButton allInsRadioButton;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton closeBtn;
    private javax.swing.JLabel completeInstallmentsLabel;
    private javax.swing.JRadioButton completedInsRadioButton;
    private javax.swing.JPanel detailPanel;
    private javax.swing.JLabel grnIdLabel;
    private javax.swing.JLabel headingLabel;
    private javax.swing.JPanel headingPanel;
    private javax.swing.JLabel insBalanceLabel;
    private javax.swing.JLabel insCompletedDateLabel;
    private javax.swing.JLabel insIdLabel;
    private javax.swing.JTable insPaymentDetailsTable;
    private javax.swing.JPanel installmentsPanel;
    private javax.swing.JTable installmentsTable;
    private javax.swing.JLabel issuedDateLabel;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JLabel netTotalLabel;
    private javax.swing.JLabel nextInsAmntLabel;
    private javax.swing.JLabel nextPayDateLabel;
    private javax.swing.JLabel paidAmntLabel;
    private javax.swing.JButton payAllBtn;
    private javax.swing.JButton payForMoreBtn;
    private javax.swing.JButton payForNextBtn;
    private javax.swing.JRadioButton pendingInsRadioButton;
    private javax.swing.JLabel pendingInstallmentsLabel;
    private javax.swing.JLabel recievedEmpLabel;
    private javax.swing.JTextArea reffTextArea;
    private javax.swing.JLabel statusLabel;
    private javax.swing.JLabel totalAmntLabel;
    private javax.swing.JLabel totalBAlanceLabel;
    private javax.swing.JLabel totalDiscountLabel;
    private javax.swing.JLabel totalInstallmentsLabel;
    private javax.swing.JButton viewInsTable;
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
