package gui;

import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import model.EmployeeModel;
import model.MobSystem;

/**
 *
 * @author Naleesh Jeffrey
 */
public class Home extends javax.swing.JFrame {

    private static Home h;

    private Home() {
        this.setExtendedState(MAXIMIZED_BOTH);
        initComponents();
        setLogoToHomeBtn("icon");
        setMyProfileLogo();
        setPrivilage();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        homelogo = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        empPanel = new javax.swing.JPanel();
        empBtn = new javax.swing.JButton();
        invPanel = new javax.swing.JPanel();
        invBtn = new javax.swing.JButton();
        supPanel = new javax.swing.JPanel();
        supBtn = new javax.swing.JButton();
        stockPanel = new javax.swing.JPanel();
        stockBtn = new javax.swing.JButton();
        cusPanel = new javax.swing.JPanel();
        cusBtn = new javax.swing.JButton();
        salesPanel = new javax.swing.JPanel();
        salesBtn = new javax.swing.JButton();
        poPanel = new javax.swing.JPanel();
        poBtn = new javax.swing.JButton();
        grnPanel = new javax.swing.JPanel();
        grnBtn = new javax.swing.JButton();
        warrentyPanel = new javax.swing.JPanel();
        warrentyBtn = new javax.swing.JButton();
        proPanel = new javax.swing.JPanel();
        proBtn = new javax.swing.JButton();
        repairPanel = new javax.swing.JPanel();
        repairBtn = new javax.swing.JButton();
        settingsPanel = new javax.swing.JPanel();
        settingsBtn = new javax.swing.JButton();
        bottomlbl = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        profileBtn = new javax.swing.JButton();
        closeBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1366, 768));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(1366, 768));
        jPanel1.setMinimumSize(new java.awt.Dimension(1366, 768));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 51));
        jLabel4.setText("12th October 2018 ");

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel2.setText("M o b i l e   I n s p i r a t i o n");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 51));
        jLabel1.setText("22 : 33 : 44");

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setForeground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new java.awt.GridLayout(3, 4, 10, 12));

        empPanel.setPreferredSize(new java.awt.Dimension(443, 73));
        empPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                empPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                empPanelMouseExited(evt);
            }
        });

        empBtn.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        empBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/checker.png"))); // NOI18N
        empBtn.setText("Employee");
        empBtn.setContentAreaFilled(false);
        empBtn.setFocusPainted(false);
        empBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        empBtn.setPreferredSize(new java.awt.Dimension(200, 200));
        empBtn.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        empBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout empPanelLayout = new javax.swing.GroupLayout(empPanel);
        empPanel.setLayout(empPanelLayout);
        empPanelLayout.setHorizontalGroup(
            empPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, empPanelLayout.createSequentialGroup()
                .addContainerGap(64, Short.MAX_VALUE)
                .addComponent(empBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
        );
        empPanelLayout.setVerticalGroup(
            empPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(empPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(empBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel4.add(empPanel);

        invPanel.setPreferredSize(new java.awt.Dimension(180, 180));
        invPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                invPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                invPanelMouseExited(evt);
            }
        });
        invPanel.setLayout(new java.awt.GridBagLayout());

        invBtn.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        invBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/041-banknote.png"))); // NOI18N
        invBtn.setText("Invoice");
        invBtn.setContentAreaFilled(false);
        invBtn.setFocusPainted(false);
        invBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        invBtn.setPreferredSize(new java.awt.Dimension(210, 200));
        invBtn.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        invBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                invBtnActionPerformed(evt);
            }
        });
        invPanel.add(invBtn, new java.awt.GridBagConstraints());

        jPanel4.add(invPanel);

        supPanel.setPreferredSize(new java.awt.Dimension(443, 73));
        supPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                supPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                supPanelMouseExited(evt);
            }
        });

        supBtn.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        supBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/028-online-marketing.png"))); // NOI18N
        supBtn.setText("Supplier");
        supBtn.setContentAreaFilled(false);
        supBtn.setFocusPainted(false);
        supBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        supBtn.setPreferredSize(new java.awt.Dimension(210, 200));
        supBtn.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        supBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout supPanelLayout = new javax.swing.GroupLayout(supPanel);
        supPanel.setLayout(supPanelLayout);
        supPanelLayout.setHorizontalGroup(
            supPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 277, Short.MAX_VALUE)
            .addGroup(supPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, supPanelLayout.createSequentialGroup()
                    .addContainerGap(62, Short.MAX_VALUE)
                    .addComponent(supBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(62, Short.MAX_VALUE)))
        );
        supPanelLayout.setVerticalGroup(
            supPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 179, Short.MAX_VALUE)
            .addGroup(supPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, supPanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(supBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        jPanel4.add(supPanel);

        stockPanel.setPreferredSize(new java.awt.Dimension(443, 73));
        stockPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                stockPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                stockPanelMouseExited(evt);
            }
        });

        stockBtn.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        stockBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/stock.png"))); // NOI18N
        stockBtn.setText("Stock");
        stockBtn.setContentAreaFilled(false);
        stockBtn.setFocusPainted(false);
        stockBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        stockBtn.setPreferredSize(new java.awt.Dimension(210, 200));
        stockBtn.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        stockBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stockBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout stockPanelLayout = new javax.swing.GroupLayout(stockPanel);
        stockPanel.setLayout(stockPanelLayout);
        stockPanelLayout.setHorizontalGroup(
            stockPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(stockPanelLayout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(stockBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(60, Short.MAX_VALUE))
        );
        stockPanelLayout.setVerticalGroup(
            stockPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, stockPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(stockBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel4.add(stockPanel);

        cusPanel.setPreferredSize(new java.awt.Dimension(443, 73));
        cusPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cusPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cusPanelMouseExited(evt);
            }
        });

        cusBtn.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        cusBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/customers.png"))); // NOI18N
        cusBtn.setText("Customer");
        cusBtn.setContentAreaFilled(false);
        cusBtn.setFocusPainted(false);
        cusBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        cusBtn.setPreferredSize(new java.awt.Dimension(210, 200));
        cusBtn.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        cusBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cusBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout cusPanelLayout = new javax.swing.GroupLayout(cusPanel);
        cusPanel.setLayout(cusPanelLayout);
        cusPanelLayout.setHorizontalGroup(
            cusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cusPanelLayout.createSequentialGroup()
                .addContainerGap(65, Short.MAX_VALUE)
                .addComponent(cusBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59))
        );
        cusPanelLayout.setVerticalGroup(
            cusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cusPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cusBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel4.add(cusPanel);

        salesPanel.setPreferredSize(new java.awt.Dimension(443, 73));
        salesPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                salesPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                salesPanelMouseExited(evt);
            }
        });

        salesBtn.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        salesBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/checker.png"))); // NOI18N
        salesBtn.setText("Sales");
        salesBtn.setContentAreaFilled(false);
        salesBtn.setFocusPainted(false);
        salesBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        salesBtn.setPreferredSize(new java.awt.Dimension(210, 200));
        salesBtn.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        salesBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salesBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout salesPanelLayout = new javax.swing.GroupLayout(salesPanel);
        salesPanel.setLayout(salesPanelLayout);
        salesPanelLayout.setHorizontalGroup(
            salesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, salesPanelLayout.createSequentialGroup()
                .addContainerGap(66, Short.MAX_VALUE)
                .addComponent(salesBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58))
        );
        salesPanelLayout.setVerticalGroup(
            salesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(salesPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(salesBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel4.add(salesPanel);

        poPanel.setPreferredSize(new java.awt.Dimension(443, 73));
        poPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                poPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                poPanelMouseExited(evt);
            }
        });

        poBtn.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        poBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/stock.png"))); // NOI18N
        poBtn.setText("PO");
        poBtn.setContentAreaFilled(false);
        poBtn.setFocusPainted(false);
        poBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        poBtn.setPreferredSize(new java.awt.Dimension(210, 200));
        poBtn.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        poBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                poBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout poPanelLayout = new javax.swing.GroupLayout(poPanel);
        poPanel.setLayout(poPanelLayout);
        poPanelLayout.setHorizontalGroup(
            poPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, poPanelLayout.createSequentialGroup()
                .addContainerGap(67, Short.MAX_VALUE)
                .addComponent(poBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57))
        );
        poPanelLayout.setVerticalGroup(
            poPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(poPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(poBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel4.add(poPanel);

        grnPanel.setPreferredSize(new java.awt.Dimension(443, 73));
        grnPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                grnPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                grnPanelMouseExited(evt);
            }
        });

        grnBtn.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        grnBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/035-shelves.png"))); // NOI18N
        grnBtn.setText("G R N");
        grnBtn.setContentAreaFilled(false);
        grnBtn.setFocusPainted(false);
        grnBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        grnBtn.setPreferredSize(new java.awt.Dimension(210, 200));
        grnBtn.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        grnBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                grnBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout grnPanelLayout = new javax.swing.GroupLayout(grnPanel);
        grnPanel.setLayout(grnPanelLayout);
        grnPanelLayout.setHorizontalGroup(
            grnPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(grnPanelLayout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(grnBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(61, Short.MAX_VALUE))
        );
        grnPanelLayout.setVerticalGroup(
            grnPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, grnPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(grnBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel4.add(grnPanel);

        warrentyPanel.setPreferredSize(new java.awt.Dimension(443, 73));
        warrentyPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                warrentyPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                warrentyPanelMouseExited(evt);
            }
        });

        warrentyBtn.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        warrentyBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/041-banknote.png"))); // NOI18N
        warrentyBtn.setText("Warrenty");
        warrentyBtn.setContentAreaFilled(false);
        warrentyBtn.setFocusPainted(false);
        warrentyBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        warrentyBtn.setPreferredSize(new java.awt.Dimension(210, 200));
        warrentyBtn.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        warrentyBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                warrentyBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout warrentyPanelLayout = new javax.swing.GroupLayout(warrentyPanel);
        warrentyPanel.setLayout(warrentyPanelLayout);
        warrentyPanelLayout.setHorizontalGroup(
            warrentyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 277, Short.MAX_VALUE)
            .addGroup(warrentyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, warrentyPanelLayout.createSequentialGroup()
                    .addContainerGap(62, Short.MAX_VALUE)
                    .addComponent(warrentyBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(62, Short.MAX_VALUE)))
        );
        warrentyPanelLayout.setVerticalGroup(
            warrentyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 179, Short.MAX_VALUE)
            .addGroup(warrentyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, warrentyPanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(warrentyBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        jPanel4.add(warrentyPanel);

        proPanel.setPreferredSize(new java.awt.Dimension(443, 73));
        proPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                proPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                proPanelMouseExited(evt);
            }
        });

        proBtn.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        proBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/stock.png"))); // NOI18N
        proBtn.setText("Product");
        proBtn.setContentAreaFilled(false);
        proBtn.setFocusPainted(false);
        proBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        proBtn.setPreferredSize(new java.awt.Dimension(210, 200));
        proBtn.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        proBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout proPanelLayout = new javax.swing.GroupLayout(proPanel);
        proPanel.setLayout(proPanelLayout);
        proPanelLayout.setHorizontalGroup(
            proPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 277, Short.MAX_VALUE)
            .addGroup(proPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, proPanelLayout.createSequentialGroup()
                    .addContainerGap(62, Short.MAX_VALUE)
                    .addComponent(proBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(62, Short.MAX_VALUE)))
        );
        proPanelLayout.setVerticalGroup(
            proPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 179, Short.MAX_VALUE)
            .addGroup(proPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(proPanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(proBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        jPanel4.add(proPanel);

        repairPanel.setPreferredSize(new java.awt.Dimension(443, 73));
        repairPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                repairPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                repairPanelMouseExited(evt);
            }
        });

        repairBtn.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        repairBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/035-shelves.png"))); // NOI18N
        repairBtn.setText("Repair");
        repairBtn.setContentAreaFilled(false);
        repairBtn.setFocusPainted(false);
        repairBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        repairBtn.setPreferredSize(new java.awt.Dimension(210, 200));
        repairBtn.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        repairBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                repairBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout repairPanelLayout = new javax.swing.GroupLayout(repairPanel);
        repairPanel.setLayout(repairPanelLayout);
        repairPanelLayout.setHorizontalGroup(
            repairPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 277, Short.MAX_VALUE)
            .addGroup(repairPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, repairPanelLayout.createSequentialGroup()
                    .addContainerGap(62, Short.MAX_VALUE)
                    .addComponent(repairBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(62, Short.MAX_VALUE)))
        );
        repairPanelLayout.setVerticalGroup(
            repairPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 179, Short.MAX_VALUE)
            .addGroup(repairPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, repairPanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(repairBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        jPanel4.add(repairPanel);

        settingsPanel.setPreferredSize(new java.awt.Dimension(443, 73));
        settingsPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                settingsPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                settingsPanelMouseExited(evt);
            }
        });

        settingsBtn.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        settingsBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/settings.png"))); // NOI18N
        settingsBtn.setText("Settings");
        settingsBtn.setContentAreaFilled(false);
        settingsBtn.setFocusPainted(false);
        settingsBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        settingsBtn.setPreferredSize(new java.awt.Dimension(210, 200));
        settingsBtn.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        settingsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                settingsBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout settingsPanelLayout = new javax.swing.GroupLayout(settingsPanel);
        settingsPanel.setLayout(settingsPanelLayout);
        settingsPanelLayout.setHorizontalGroup(
            settingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, settingsPanelLayout.createSequentialGroup()
                .addContainerGap(65, Short.MAX_VALUE)
                .addComponent(settingsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59))
        );
        settingsPanelLayout.setVerticalGroup(
            settingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(settingsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(settingsBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel4.add(settingsPanel);

        bottomlbl.setBackground(new java.awt.Color(204, 204, 255));
        bottomlbl.setFont(new java.awt.Font("Square721 BT", 1, 18)); // NOI18N
        bottomlbl.setText("              DEVELOPED AND DESIGNED BY PIRATES DEVELOPERS");
        bottomlbl.setOpaque(true);

        jLabel7.setFont(new java.awt.Font("Trebuchet MS", 1, 48)); // NOI18N
        jLabel7.setText("CELL CORNER");

        profileBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/VVV.png"))); // NOI18N
        profileBtn.setBorderPainted(false);
        profileBtn.setContentAreaFilled(false);
        profileBtn.setFocusPainted(false);
        profileBtn.setFocusable(false);
        profileBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                profileBtnActionPerformed(evt);
            }
        });

        closeBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Errpng.png"))); // NOI18N
        closeBtn.setBorderPainted(false);
        closeBtn.setContentAreaFilled(false);
        closeBtn.setDefaultCapable(false);
        closeBtn.setFocusPainted(false);
        closeBtn.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/herror.png"))); // NOI18N
        closeBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                closeBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                closeBtnMouseExited(evt);
            }
        });
        closeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel4)
                        .addGap(206, 206, 206)
                        .addComponent(bottomlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 670, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(261, 261, 261)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 1138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(homelogo, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(419, 419, 419)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7)
                        .addGap(333, 333, 333)))
                .addComponent(profileBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(closeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addComponent(jLabel2))
                            .addComponent(homelogo, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(closeBtn)
                            .addComponent(profileBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))))
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 531, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel1))
                        .addGap(5, 5, 5))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                        .addComponent(bottomlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void invBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_invBtnActionPerformed
        // Invoice.getInstance(null, 0).setVisible(true);
    }//GEN-LAST:event_invBtnActionPerformed

    private void empBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empBtnActionPerformed
        // Employee.getInstance().setVisible(true);
    }//GEN-LAST:event_empBtnActionPerformed

    private void supBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supBtnActionPerformed
        // Sup_Supplier.getInstance(null, 0).setVisible(true);
    }//GEN-LAST:event_supBtnActionPerformed

    private void stockBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stockBtnActionPerformed
        //Stock.getInstance(null, 0).setVisible(true);
    }//GEN-LAST:event_stockBtnActionPerformed

    private void cusBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cusBtnActionPerformed
        // gui.CustomerRegistrion.getInstance().setVisible(true);
    }//GEN-LAST:event_cusBtnActionPerformed

    private void poBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_poBtnActionPerformed
        // gui.POder.getInstance().setVisible(true);
    }//GEN-LAST:event_poBtnActionPerformed

    private void grnBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_grnBtnActionPerformed
        //  UnfilledGRN.getInstance(null, 0).setVisible(true);
        //GRN.getInstance(this, 0).setVisible(true);
    }//GEN-LAST:event_grnBtnActionPerformed

    private void warrentyBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_warrentyBtnActionPerformed
        //  Warrenty.getInstance(null, 0).setVisible(true);
    }//GEN-LAST:event_warrentyBtnActionPerformed

    private void proBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proBtnActionPerformed
        //  ProductSmartDevices.getInstance(null, HEIGHT).setVisible(true);
    }//GEN-LAST:event_proBtnActionPerformed

    private void repairBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_repairBtnActionPerformed
        // RepairingSystem.getInstance().setVisible(true);
    }//GEN-LAST:event_repairBtnActionPerformed

    private void settingsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_settingsBtnActionPerformed
          SystemSettings.getInstance().setVisible(true);
    }//GEN-LAST:event_settingsBtnActionPerformed

    private void salesBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salesBtnActionPerformed
        //  SelesInformation.getInstance().setVisible(true);
    }//GEN-LAST:event_salesBtnActionPerformed

    private void closeBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeBtnMouseEntered
        //setIconToCloseBtn("close2");
    }//GEN-LAST:event_closeBtnMouseEntered

    private void closeBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeBtnMouseExited
        //setIconToCloseBtn("close1");
    }//GEN-LAST:event_closeBtnMouseExited

    private void closeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeBtnActionPerformed
        int i = JOptionPane.showConfirmDialog(null, "Do you really want to Exit the System", "Warning", JOptionPane.WARNING_MESSAGE);
        if (i == JOptionPane.YES_OPTION) {
            new Thread() {
                    @Override
                    public void run() {
                        try {
                            Login.getInstance().setVisible(true);
                            ShutDownSystem.getInstance(1).setVisible(true);
                            dispose();
                            Thread.sleep(1000);
                            DBConfiguration.getInstance().backupDb();
                            //System.exit(0);
                            DBConfiguration.getInstance().backupDb();
                            MobSystem.logoutSystem();

                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }

                }.start();
        }
    }//GEN-LAST:event_closeBtnActionPerformed

    private void profileBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_profileBtnActionPerformed
        // MyProfile.getInstance("970450564v").setVisible(true);
    }//GEN-LAST:event_profileBtnActionPerformed

    private void empPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_empPanelMouseEntered
        setBackColortoPanel(empPanel);
    }//GEN-LAST:event_empPanelMouseEntered

    private void empPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_empPanelMouseExited
        removeBackColortoPanel(empPanel);
    }//GEN-LAST:event_empPanelMouseExited

    private void invPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_invPanelMouseEntered
        setBackColortoPanel(invPanel);
    }//GEN-LAST:event_invPanelMouseEntered

    private void invPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_invPanelMouseExited
        removeBackColortoPanel(invPanel);
    }//GEN-LAST:event_invPanelMouseExited

    private void supPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_supPanelMouseEntered
        setBackColortoPanel(supPanel);
    }//GEN-LAST:event_supPanelMouseEntered

    private void stockPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stockPanelMouseExited
        removeBackColortoPanel(stockPanel);
    }//GEN-LAST:event_stockPanelMouseExited

    private void cusPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cusPanelMouseEntered
        setBackColortoPanel(cusPanel);
    }//GEN-LAST:event_cusPanelMouseEntered

    private void cusPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cusPanelMouseExited
        removeBackColortoPanel(cusPanel);
    }//GEN-LAST:event_cusPanelMouseExited

    private void salesPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salesPanelMouseEntered
        setBackColortoPanel(salesPanel);
    }//GEN-LAST:event_salesPanelMouseEntered

    private void salesPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salesPanelMouseExited
        removeBackColortoPanel(salesPanel);
    }//GEN-LAST:event_salesPanelMouseExited

    private void poPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_poPanelMouseEntered
        setBackColortoPanel(poPanel);
    }//GEN-LAST:event_poPanelMouseEntered

    private void poPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_poPanelMouseExited
        removeBackColortoPanel(poPanel);
    }//GEN-LAST:event_poPanelMouseExited

    private void grnPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grnPanelMouseEntered
        setBackColortoPanel(grnPanel);
    }//GEN-LAST:event_grnPanelMouseEntered

    private void grnPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grnPanelMouseExited
        removeBackColortoPanel(grnPanel);
    }//GEN-LAST:event_grnPanelMouseExited

    private void warrentyPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_warrentyPanelMouseEntered
        setBackColortoPanel(warrentyPanel);
    }//GEN-LAST:event_warrentyPanelMouseEntered

    private void warrentyPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_warrentyPanelMouseExited
        removeBackColortoPanel(warrentyPanel);
    }//GEN-LAST:event_warrentyPanelMouseExited

    private void proPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_proPanelMouseEntered
        setBackColortoPanel(proPanel);
    }//GEN-LAST:event_proPanelMouseEntered

    private void proPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_proPanelMouseExited
        removeBackColortoPanel(proPanel);
    }//GEN-LAST:event_proPanelMouseExited

    private void repairPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_repairPanelMouseEntered
        setBackColortoPanel(repairPanel);
    }//GEN-LAST:event_repairPanelMouseEntered

    private void repairPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_repairPanelMouseExited
        removeBackColortoPanel(repairPanel);
    }//GEN-LAST:event_repairPanelMouseExited

    private void settingsPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingsPanelMouseEntered
        setBackColortoPanel(settingsPanel);
    }//GEN-LAST:event_settingsPanelMouseEntered

    private void settingsPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingsPanelMouseExited
        removeBackColortoPanel(settingsPanel);
    }//GEN-LAST:event_settingsPanelMouseExited

    private void supPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_supPanelMouseExited
        removeBackColortoPanel(supPanel);
    }//GEN-LAST:event_supPanelMouseExited

    private void stockPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stockPanelMouseEntered
        setBackColortoPanel(stockPanel);
    }//GEN-LAST:event_stockPanelMouseEntered
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Home.getInstance(null, 0).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bottomlbl;
    private javax.swing.JButton closeBtn;
    private javax.swing.JButton cusBtn;
    private javax.swing.JPanel cusPanel;
    private javax.swing.JButton empBtn;
    private javax.swing.JPanel empPanel;
    private javax.swing.JButton grnBtn;
    private javax.swing.JPanel grnPanel;
    private javax.swing.JLabel homelogo;
    private javax.swing.JButton invBtn;
    private javax.swing.JPanel invPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JButton poBtn;
    private javax.swing.JPanel poPanel;
    private javax.swing.JButton proBtn;
    private javax.swing.JPanel proPanel;
    private javax.swing.JButton profileBtn;
    private javax.swing.JButton repairBtn;
    private javax.swing.JPanel repairPanel;
    private javax.swing.JButton salesBtn;
    private javax.swing.JPanel salesPanel;
    private javax.swing.JButton settingsBtn;
    private javax.swing.JPanel settingsPanel;
    private javax.swing.JButton stockBtn;
    private javax.swing.JPanel stockPanel;
    private javax.swing.JButton supBtn;
    private javax.swing.JPanel supPanel;
    private javax.swing.JButton warrentyBtn;
    private javax.swing.JPanel warrentyPanel;
    // End of variables declaration//GEN-END:variables
public static synchronized Home getInstance(JFrame backwindow, int status) {
        if (h == null) {
            h = new Home();
        }
        return h;
    }

    private void setLogoToHomeBtn(String s) {
        try {
            Image i = new ImageIcon(getClass().getResource("/RESOURCES/" + s + ".png")).getImage().getScaledInstance(homelogo.getWidth(), homelogo.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon icon = new ImageIcon(i);
            homelogo.setIcon(icon);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void setMyProfileLogo() {
        try {
            Image i = new ImageIcon(getClass().getResource("/RESOURCES/VVV.png")).getImage().getScaledInstance(profileBtn.getWidth(), profileBtn.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon icon = new ImageIcon(i);
            profileBtn.setIcon(icon);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void setBackColortoPanel(JPanel p) {
        p.setBackground(new Color(153, 153, 255, 255));
    }

    private void removeBackColortoPanel(JPanel p) {
        p.setBackground(new Color(240, 240, 240, 255));
    }

    private void setPrivilage() {
        try {
            String type = MobSystem.getUserType();
            //String type = "1";
            if (type.equals("2")) {
                settingsBtn.setEnabled(false);
                salesBtn.setEnabled(false);
            } else if (type.equals("3")) {
                settingsBtn.setEnabled(false);
                salesBtn.setEnabled(false);
                empBtn.setEnabled(false);
                supBtn.setEnabled(false);
                poBtn.setEnabled(false);
                grnBtn.setEnabled(false);
                repairBtn.setEnabled(false);
                warrentyBtn.setEnabled(false);
            } else if (type.equals("4")) {
                settingsBtn.setEnabled(false);
                salesBtn.setEnabled(false);
                empBtn.setEnabled(false);
//            supPanel.setEnabled(false);
//            poPanel.setEnabled(false);
//            grnPanel.setEnabled(false);
                repairBtn.setEnabled(false);
                warrentyBtn.setEnabled(false);
                invBtn.setEnabled(false);
            } else if (type.equals("5")) {
                settingsBtn.setEnabled(false);
                salesBtn.setEnabled(false);
                empBtn.setEnabled(false);
                supBtn.setEnabled(false);
                poBtn.setEnabled(false);
                grnBtn.setEnabled(false);
                //repairPanel.setEnabled(false);
                warrentyBtn.setEnabled(false);
                stockBtn.setEnabled(false);
            } else if (type.equals("6")) {
                settingsBtn.setEnabled(false);
                salesBtn.setEnabled(false);
                empBtn.setEnabled(false);
                supBtn.setEnabled(false);
                poBtn.setEnabled(false);
                grnBtn.setEnabled(false);
                repairBtn.setEnabled(false);
                warrentyBtn.setEnabled(false);
                stockBtn.setEnabled(false);
                proBtn.setEnabled(false);
                stockBtn.setEnabled(false);
                cusBtn.setEnabled(false);
                profileBtn.setEnabled(false);
                invBtn.setEnabled(false);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
