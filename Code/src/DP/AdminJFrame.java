package DP;

import java.util.*;
import java.io.*;

import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class AdminJFrame extends javax.swing.JFrame {
    public static String AdminLoginID;
    
     AdminJFrame(String LoginID) {
        AdminLoginID = LoginID;
        initComponents();
    }
    
 
    public AdminJFrame() {
        initComponents();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        buttonGroup6 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton11 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel5 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton12 = new javax.swing.JButton();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jPanel32 = new javax.swing.JPanel();
        jButtonSearchProduct = new javax.swing.JButton();
        searchTxtProduct = new javax.swing.JTextField();
        lblSearchStatus3 = new javax.swing.JLabel();
        jPanel33 = new javax.swing.JPanel();
        lblEditLabel = new javax.swing.JLabel();
        btnSaveChangesProduct = new javax.swing.JButton();
        txtFieldEditableProductNumber1 = new javax.swing.JTextField();
        radBtnProdNameAtt1 = new javax.swing.JRadioButton();
        lblEditAttributeLabel = new javax.swing.JLabel();
        radBtnProdPriceAtt1 = new javax.swing.JRadioButton();
        radBtnProdTypeAtt1 = new javax.swing.JRadioButton();
        radBtnProdBrandAtt1 = new javax.swing.JRadioButton();
        radBtnProdStockAtt1 = new javax.swing.JRadioButton();
        txtFieldEditNewDataProduct = new javax.swing.JTextField();
        lblEditNewData3 = new javax.swing.JLabel();
        jPanel34 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable5 = new javax.swing.JTable();
        jButtonViewAllProducts = new javax.swing.JButton();
        btnCreateNewProduct = new javax.swing.JButton();
        btnClearTableProduct = new javax.swing.JToggleButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jPanel25 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jTextFieldNewAdminID = new javax.swing.JTextField();
        jTextFieldNewAdminPassword = new javax.swing.JTextField();
        jTextFieldNewAdminFName = new javax.swing.JTextField();
        jTextFieldNewAdminLName = new javax.swing.JTextField();
        jTextFieldNewAdminAddress = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jTextFieldNewAdminPosition = new javax.swing.JTextField();
        jButtonAddNewAdmin = new javax.swing.JButton();
        jLabelPreAddingAdminValidationStatus = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel30 = new javax.swing.JPanel();
        jButtonSaveAdminData = new javax.swing.JButton();
        jButtonDelSelectedAdmin = new javax.swing.JButton();
        jPanel12 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jPanel22 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        searchTxtIdNo = new javax.swing.JTextField();
        lblSearchStatus = new javax.swing.JLabel();
        jPanel23 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        btnCreateNewAdmin = new javax.swing.JButton();
        btnClearTableAdmin = new javax.swing.JToggleButton();
        jPanel24 = new javax.swing.JPanel();
        lblEdit = new javax.swing.JLabel();
        btnSaveChanges = new javax.swing.JButton();
        txtFieldEdit = new javax.swing.JTextField();
        radBtnAdminPassAtt = new javax.swing.JRadioButton();
        lblEditAttribute = new javax.swing.JLabel();
        radBtnAdminFNameAtt = new javax.swing.JRadioButton();
        radBtnAdminLNameAtt = new javax.swing.JRadioButton();
        radBtnAdminAddressAtt = new javax.swing.JRadioButton();
        radBtnAdminPosAtt = new javax.swing.JRadioButton();
        txtFieldEditNewData = new javax.swing.JTextField();
        lblEditNewData = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jPanel35 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        jTextFieldNewProdNo = new javax.swing.JTextField();
        jTextFieldNewProdName = new javax.swing.JTextField();
        jTextFieldNewProdPrice = new javax.swing.JTextField();
        jTextFieldNewProdBrand = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jTextFieldNewProdStock = new javax.swing.JTextField();
        jButtonAddNewProduct = new javax.swing.JButton();
        jLabelPreAddingAdminValidationStatus1 = new javax.swing.JLabel();
        jRadButtonProdTypeFragile = new javax.swing.JRadioButton();
        jRadButtonProdTypeNonFragile = new javax.swing.JRadioButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTable6 = new javax.swing.JTable();
        jPanel36 = new javax.swing.JPanel();
        jButtonSaveProductData = new javax.swing.JButton();
        jButtonDelSelectedProduct = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jLabel44 = new javax.swing.JLabel();
        jPanel40 = new javax.swing.JPanel();
        jScrollPane9 = new javax.swing.JScrollPane();
        jTable9 = new javax.swing.JTable();
        jButtonViewAllOrderItem = new javax.swing.JButton();
        btnDeleteOrderItem = new javax.swing.JButton();
        btnClearTableOrderItem = new javax.swing.JToggleButton();
        jPanel42 = new javax.swing.JPanel();
        jButtonSearchOrderItem = new javax.swing.JButton();
        lblSearchStatus5 = new javax.swing.JLabel();
        searchTxtOrderItemNo = new javax.swing.JTextField();
        jPanel43 = new javax.swing.JPanel();
        lblEdit1 = new javax.swing.JLabel();
        btnSaveChangesOrderItemQuantity = new javax.swing.JButton();
        txtFieldEditOrderItem = new javax.swing.JTextField();
        radBtnAdminPassAtt1 = new javax.swing.JRadioButton();
        lblEditAttribute1 = new javax.swing.JLabel();
        txtFieldEditNewOrderItemQuantity = new javax.swing.JTextField();
        lblEditNewData1 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        txtFieldEditItemOrderNo = new javax.swing.JTextField();
        jPanel44 = new javax.swing.JPanel();
        txtFieldAddOrderItemQuantity = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        txtFieldAddOrderIDforItem = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        txtFieldAddOrderItemID = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        jLabelPreAddingOrder_ItemValidationStatus = new javax.swing.JLabel();
        btnAddOrderItem = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jPanel21 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jPanel37 = new javax.swing.JPanel();
        jButtonSearchOrder = new javax.swing.JButton();
        searchTxtOrderNo = new javax.swing.JTextField();
        lblSearchStatus4 = new javax.swing.JLabel();
        jPanel38 = new javax.swing.JPanel();
        btnEditOrder = new javax.swing.JButton();
        jPanel39 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTable7 = new javax.swing.JTable();
        jButtonViewAllOrders = new javax.swing.JButton();
        btnCreateNewOrder = new javax.swing.JButton();
        btnClearTableOrder = new javax.swing.JToggleButton();
        jPanel41 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        addTxtOrderCustomerID = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        addTxtOrderID = new javax.swing.JTextField();
        jLabelOrderValidationStatus = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jPanel26 = new javax.swing.JPanel();
        jButtonSearchCust = new javax.swing.JButton();
        searchTxtCustID = new javax.swing.JTextField();
        lblSearchStatus2 = new javax.swing.JLabel();
        jPanel27 = new javax.swing.JPanel();
        lblEdit2 = new javax.swing.JLabel();
        btnSaveChanges2 = new javax.swing.JButton();
        txtFieldEdit2 = new javax.swing.JTextField();
        radBtnCustPassAtt = new javax.swing.JRadioButton();
        lblEditAttribute2 = new javax.swing.JLabel();
        radBtnCustFNameAtt = new javax.swing.JRadioButton();
        radBtnCustLNameAtt = new javax.swing.JRadioButton();
        radBtnCustAddressAtt = new javax.swing.JRadioButton();
        radBtnCustEmailAtt = new javax.swing.JRadioButton();
        txtFieldEditNewData2 = new javax.swing.JTextField();
        lblEditNewData2 = new javax.swing.JLabel();
        radBtnCustHPAtt = new javax.swing.JRadioButton();
        jPanel28 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        btnViewCust = new javax.swing.JButton();
        btnCreateNewCustomer = new javax.swing.JButton();
        btnClearTableCust = new javax.swing.JToggleButton();
        jPanel15 = new javax.swing.JPanel();
        jPanel29 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jTextFieldNewCustID = new javax.swing.JTextField();
        jTextFieldNewCustPassword = new javax.swing.JTextField();
        jTextFieldNewCustFName = new javax.swing.JTextField();
        jTextFieldNewCustLName = new javax.swing.JTextField();
        jTextFieldNewCustAddress = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jTextFieldNewCustEmail = new javax.swing.JTextField();
        jButtonAddNewCust = new javax.swing.JButton();
        jLabelPreAddingCustValidationStatus = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jTextFieldNewCustHP = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jPanel31 = new javax.swing.JPanel();
        jButtonSaveCustData = new javax.swing.JButton();
        jButtonDelSelectedCust = new javax.swing.JButton();
        jPanel16 = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        jPanel18 = new javax.swing.JPanel();
        jPanel19 = new javax.swing.JPanel();
        jPanel20 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 102, 153));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Main Menu");

        jButton11.setBackground(new java.awt.Color(102, 255, 102));
        jButton11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton11.setText("HOMEPAGE");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton7.setFont(new java.awt.Font("Garuda", 0, 12)); // NOI18N
        jButton7.setText("MANAGE ADMIN");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton9.setText("MANAGE CUSTOMER");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton8.setText("MANAGE ORDER");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton6.setText("MANAGE PRODUCT");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel1)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(35, 35, 35)
                .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(207, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, 650));

        jTabbedPane2.setBackground(new java.awt.Color(0, 153, 153));

        jPanel5.setBackground(new java.awt.Color(0, 153, 153));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Admin Side");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Account Type       :  System Admin");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Admin Name         :");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("ID");

        jButton12.setBackground(new java.awt.Color(255, 102, 102));
        jButton12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton12.setText("LOG OUT & EXIT");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jLabel41.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel41.setText("Current Date         :");

        jLabel42.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel42.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel42.setText("DATE");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(390, 390, 390)
                        .addComponent(jButton12)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(0, 348, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel41)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel42, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(342, 342, 342))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(311, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("0.HOME", jPanel5);

        jPanel11.setBackground(new java.awt.Color(0, 153, 153));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel11.setText("PRODUCT MANAGEMENT");

        jPanel32.setBackground(new java.awt.Color(0, 102, 102));

        jButtonSearchProduct.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButtonSearchProduct.setText("Search Product");
        jButtonSearchProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSearchProductActionPerformed(evt);
            }
        });

        lblSearchStatus3.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        lblSearchStatus3.setForeground(new java.awt.Color(255, 255, 255));
        lblSearchStatus3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSearchStatus3.setText("Enter Keyword To Search");

        javax.swing.GroupLayout jPanel32Layout = new javax.swing.GroupLayout(jPanel32);
        jPanel32.setLayout(jPanel32Layout);
        jPanel32Layout.setHorizontalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel32Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSearchStatus3, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel32Layout.createSequentialGroup()
                        .addComponent(jButtonSearchProduct)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(searchTxtProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel32Layout.setVerticalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel32Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblSearchStatus3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSearchProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchTxtProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jPanel33.setBackground(new java.awt.Color(0, 102, 102));

        lblEditLabel.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        lblEditLabel.setForeground(new java.awt.Color(255, 255, 255));
        lblEditLabel.setText("Enter Product Number to Edit");

        btnSaveChangesProduct.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnSaveChangesProduct.setText("Save Changes");
        btnSaveChangesProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveChangesProductActionPerformed(evt);
            }
        });

        radBtnProdNameAtt1.setBackground(new java.awt.Color(0, 102, 102));
        buttonGroup3.add(radBtnProdNameAtt1);
        radBtnProdNameAtt1.setForeground(new java.awt.Color(255, 255, 255));
        radBtnProdNameAtt1.setText("Product Name");

        lblEditAttributeLabel.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        lblEditAttributeLabel.setForeground(new java.awt.Color(255, 255, 255));
        lblEditAttributeLabel.setText("Select Attribute To Edit");

        radBtnProdPriceAtt1.setBackground(new java.awt.Color(0, 102, 102));
        buttonGroup3.add(radBtnProdPriceAtt1);
        radBtnProdPriceAtt1.setForeground(new java.awt.Color(255, 255, 255));
        radBtnProdPriceAtt1.setText("Price");

        radBtnProdTypeAtt1.setBackground(new java.awt.Color(0, 102, 102));
        buttonGroup3.add(radBtnProdTypeAtt1);
        radBtnProdTypeAtt1.setForeground(new java.awt.Color(255, 255, 255));
        radBtnProdTypeAtt1.setText("Type");

        radBtnProdBrandAtt1.setBackground(new java.awt.Color(0, 102, 102));
        buttonGroup3.add(radBtnProdBrandAtt1);
        radBtnProdBrandAtt1.setForeground(new java.awt.Color(255, 255, 255));
        radBtnProdBrandAtt1.setText("Brand");

        radBtnProdStockAtt1.setBackground(new java.awt.Color(0, 102, 102));
        buttonGroup3.add(radBtnProdStockAtt1);
        radBtnProdStockAtt1.setForeground(new java.awt.Color(255, 255, 255));
        radBtnProdStockAtt1.setText("Stock");

        lblEditNewData3.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        lblEditNewData3.setForeground(new java.awt.Color(255, 255, 255));
        lblEditNewData3.setText("Key In New Data");

        javax.swing.GroupLayout jPanel33Layout = new javax.swing.GroupLayout(jPanel33);
        jPanel33.setLayout(jPanel33Layout);
        jPanel33Layout.setHorizontalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel33Layout.createSequentialGroup()
                .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel33Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(radBtnProdNameAtt1)
                            .addComponent(radBtnProdBrandAtt1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(radBtnProdStockAtt1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel33Layout.createSequentialGroup()
                                .addComponent(radBtnProdPriceAtt1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(radBtnProdTypeAtt1))))
                    .addGroup(jPanel33Layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(lblEditNewData3))
                    .addGroup(jPanel33Layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(txtFieldEditNewDataProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel33Layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(btnSaveChangesProduct)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel33Layout.createSequentialGroup()
                .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel33Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblEditLabel))
                    .addGroup(jPanel33Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtFieldEditableProductNumber1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblEditAttributeLabel))))
                .addGap(53, 53, 53))
        );
        jPanel33Layout.setVerticalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel33Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblEditLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtFieldEditableProductNumber1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(lblEditAttributeLabel)
                .addGap(18, 18, 18)
                .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radBtnProdNameAtt1)
                    .addComponent(radBtnProdPriceAtt1)
                    .addComponent(radBtnProdTypeAtt1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(radBtnProdBrandAtt1)
                    .addComponent(radBtnProdStockAtt1))
                .addGap(13, 13, 13)
                .addComponent(lblEditNewData3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFieldEditNewDataProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSaveChangesProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jPanel34.setBackground(new java.awt.Color(0, 102, 102));

        jTable5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product No.", "Name", "Price", "Type", "Brand", "Stock"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable5.getTableHeader().setReorderingAllowed(false);
        jScrollPane5.setViewportView(jTable5);
        if (jTable5.getColumnModel().getColumnCount() > 0) {
            jTable5.getColumnModel().getColumn(0).setResizable(false);
            jTable5.getColumnModel().getColumn(0).setPreferredWidth(40);
            jTable5.getColumnModel().getColumn(1).setResizable(false);
            jTable5.getColumnModel().getColumn(1).setPreferredWidth(100);
            jTable5.getColumnModel().getColumn(2).setResizable(false);
            jTable5.getColumnModel().getColumn(2).setPreferredWidth(40);
            jTable5.getColumnModel().getColumn(3).setResizable(false);
            jTable5.getColumnModel().getColumn(3).setPreferredWidth(60);
            jTable5.getColumnModel().getColumn(4).setResizable(false);
            jTable5.getColumnModel().getColumn(4).setPreferredWidth(70);
            jTable5.getColumnModel().getColumn(5).setResizable(false);
            jTable5.getColumnModel().getColumn(5).setPreferredWidth(40);
        }

        jButtonViewAllProducts.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButtonViewAllProducts.setText("View All Product");
        jButtonViewAllProducts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonViewAllProductsActionPerformed(evt);
            }
        });

        btnCreateNewProduct.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnCreateNewProduct.setText("Create/Delete Product");
        btnCreateNewProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateNewProductActionPerformed(evt);
            }
        });

        btnClearTableProduct.setText("Clear View");
        btnClearTableProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearTableProductActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel34Layout = new javax.swing.GroupLayout(jPanel34);
        jPanel34.setLayout(jPanel34Layout);
        jPanel34Layout.setHorizontalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel34Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonViewAllProducts)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 142, Short.MAX_VALUE)
                .addComponent(btnClearTableProduct)
                .addGap(115, 115, 115)
                .addComponent(btnCreateNewProduct)
                .addContainerGap())
            .addComponent(jScrollPane5)
        );
        jPanel34Layout.setVerticalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel34Layout.createSequentialGroup()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonViewAllProducts, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCreateNewProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClearTableProduct))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(40, 40, 40)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(jPanel34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jPanel32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel34, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 200, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("1.PRODUCT", jPanel11);

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Create New Admin Profile");

        jPanel25.setBackground(new java.awt.Color(0, 102, 102));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Enter New Admin Details");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Admin ID : ");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Password : ");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("First Name : ");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Last Name : ");

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Address :");

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Current Position : ");

        jButtonAddNewAdmin.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButtonAddNewAdmin.setText("Add Admin");
        jButtonAddNewAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddNewAdminActionPerformed(evt);
            }
        });

        jLabelPreAddingAdminValidationStatus.setFont(new java.awt.Font("Tahoma", 3, 10)); // NOI18N
        jLabelPreAddingAdminValidationStatus.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPreAddingAdminValidationStatus.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelPreAddingAdminValidationStatus.setText("*Validation Status*");

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel25Layout.createSequentialGroup()
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel25Layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(jLabel15)
                        .addGap(0, 37, Short.MAX_VALUE))
                    .addGroup(jPanel25Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel25Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel25Layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(jPanel25Layout.createSequentialGroup()
                                        .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel2))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextFieldNewAdminFName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextFieldNewAdminID, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextFieldNewAdminPassword, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel25Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel25Layout.createSequentialGroup()
                                        .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel16)
                                            .addComponent(jLabel17))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jTextFieldNewAdminPosition, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                                            .addComponent(jTextFieldNewAdminAddress)))
                                    .addGroup(jPanel25Layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jTextFieldNewAdminLName, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addGap(34, 34, 34))
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelPreAddingAdminValidationStatus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addComponent(jButtonAddNewAdmin)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldNewAdminID, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldNewAdminPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldNewAdminFName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldNewAdminLName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldNewAdminAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jTextFieldNewAdminPosition, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(jButtonAddNewAdmin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelPreAddingAdminValidationStatus)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID No.", "Password", "First Name", "Last Name", "Address", "Position"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable2.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(jTable2);
        if (jTable2.getColumnModel().getColumnCount() > 0) {
            jTable2.getColumnModel().getColumn(0).setResizable(false);
            jTable2.getColumnModel().getColumn(1).setResizable(false);
            jTable2.getColumnModel().getColumn(1).setPreferredWidth(80);
            jTable2.getColumnModel().getColumn(2).setResizable(false);
            jTable2.getColumnModel().getColumn(2).setPreferredWidth(80);
            jTable2.getColumnModel().getColumn(3).setResizable(false);
            jTable2.getColumnModel().getColumn(3).setPreferredWidth(80);
            jTable2.getColumnModel().getColumn(4).setResizable(false);
            jTable2.getColumnModel().getColumn(4).setPreferredWidth(110);
            jTable2.getColumnModel().getColumn(5).setResizable(false);
            jTable2.getColumnModel().getColumn(5).setPreferredWidth(100);
        }

        jPanel30.setBackground(new java.awt.Color(0, 102, 102));

        jButtonSaveAdminData.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButtonSaveAdminData.setText("Save Data to Text File");
        jButtonSaveAdminData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSaveAdminDataActionPerformed(evt);
            }
        });

        jButtonDelSelectedAdmin.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButtonDelSelectedAdmin.setText("Delete Selected Admin");
        jButtonDelSelectedAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDelSelectedAdminActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel30Layout = new javax.swing.GroupLayout(jPanel30);
        jPanel30.setLayout(jPanel30Layout);
        jPanel30Layout.setHorizontalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonSaveAdminData)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonDelSelectedAdmin)
                .addContainerGap())
        );
        jPanel30Layout.setVerticalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSaveAdminData, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonDelSelectedAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 586, Short.MAX_VALUE)
                    .addComponent(jPanel30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(41, 41, 41))
        );

        jTabbedPane2.addTab("2.CREATE NEW ADMIN", jPanel2);

        jPanel12.setBackground(new java.awt.Color(0, 153, 153));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel10.setText("ADMIN MANAGEMENT");

        jPanel22.setBackground(new java.awt.Color(0, 102, 102));

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton3.setText("Search Admin");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        lblSearchStatus.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        lblSearchStatus.setForeground(new java.awt.Color(255, 255, 255));
        lblSearchStatus.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSearchStatus.setText("Enter Keyword To Search");

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblSearchStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel22Layout.createSequentialGroup()
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(searchTxtIdNo, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblSearchStatus)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchTxtIdNo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jPanel23.setBackground(new java.awt.Color(0, 102, 102));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID No.", "Password", "First Name", "Last Name", "Address", "Position"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(40);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(40);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(40);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setPreferredWidth(40);
            jTable1.getColumnModel().getColumn(4).setResizable(false);
            jTable1.getColumnModel().getColumn(4).setPreferredWidth(100);
            jTable1.getColumnModel().getColumn(5).setResizable(false);
            jTable1.getColumnModel().getColumn(5).setPreferredWidth(80);
        }

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton1.setText("View All Admins");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnCreateNewAdmin.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnCreateNewAdmin.setText("Create/Delete Admin");
        btnCreateNewAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateNewAdminActionPerformed(evt);
            }
        });

        btnClearTableAdmin.setText("Clear View");
        btnClearTableAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearTableAdminActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addGap(121, 121, 121)
                .addComponent(btnClearTableAdmin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 146, Short.MAX_VALUE)
                .addComponent(btnCreateNewAdmin)
                .addContainerGap())
            .addComponent(jScrollPane1)
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 340, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCreateNewAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClearTableAdmin))
                .addContainerGap())
        );

        jPanel24.setBackground(new java.awt.Color(0, 102, 102));

        lblEdit.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        lblEdit.setForeground(new java.awt.Color(255, 255, 255));
        lblEdit.setText("Enter ID To Edit");

        btnSaveChanges.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnSaveChanges.setText("Save Changes");
        btnSaveChanges.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveChangesActionPerformed(evt);
            }
        });

        radBtnAdminPassAtt.setBackground(new java.awt.Color(0, 102, 102));
        buttonGroup1.add(radBtnAdminPassAtt);
        radBtnAdminPassAtt.setForeground(new java.awt.Color(255, 255, 255));
        radBtnAdminPassAtt.setText("Password");

        lblEditAttribute.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        lblEditAttribute.setForeground(new java.awt.Color(255, 255, 255));
        lblEditAttribute.setText("Select Attribute To Edit");

        radBtnAdminFNameAtt.setBackground(new java.awt.Color(0, 102, 102));
        buttonGroup1.add(radBtnAdminFNameAtt);
        radBtnAdminFNameAtt.setForeground(new java.awt.Color(255, 255, 255));
        radBtnAdminFNameAtt.setText("First Name");

        radBtnAdminLNameAtt.setBackground(new java.awt.Color(0, 102, 102));
        buttonGroup1.add(radBtnAdminLNameAtt);
        radBtnAdminLNameAtt.setForeground(new java.awt.Color(255, 255, 255));
        radBtnAdminLNameAtt.setText("Last Name");

        radBtnAdminAddressAtt.setBackground(new java.awt.Color(0, 102, 102));
        buttonGroup1.add(radBtnAdminAddressAtt);
        radBtnAdminAddressAtt.setForeground(new java.awt.Color(255, 255, 255));
        radBtnAdminAddressAtt.setText("Address");

        radBtnAdminPosAtt.setBackground(new java.awt.Color(0, 102, 102));
        buttonGroup1.add(radBtnAdminPosAtt);
        radBtnAdminPosAtt.setForeground(new java.awt.Color(255, 255, 255));
        radBtnAdminPosAtt.setText("Position");

        lblEditNewData.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        lblEditNewData.setForeground(new java.awt.Color(255, 255, 255));
        lblEditNewData.setText("Key In New Data");

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel24Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblEditNewData)
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(radBtnAdminAddressAtt, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(radBtnAdminPassAtt, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)
                        .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(radBtnAdminFNameAtt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(radBtnAdminPosAtt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(radBtnAdminLNameAtt)
                .addGap(14, 14, 14))
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtFieldEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblEditAttribute)))
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(lblEdit))
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtFieldEditNewData)
                            .addComponent(btnSaveChanges, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lblEdit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFieldEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(lblEditAttribute)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(radBtnAdminLNameAtt)
                    .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(radBtnAdminPassAtt)
                        .addComponent(radBtnAdminFNameAtt)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radBtnAdminAddressAtt)
                    .addComponent(radBtnAdminPosAtt))
                .addGap(18, 18, 18)
                .addComponent(lblEditNewData)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFieldEditNewData, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSaveChanges, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(28, 28, 28)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(185, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("3.ADMIN", jPanel12);

        jPanel4.setBackground(new java.awt.Color(0, 153, 153));

        jLabel27.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("Add New Product To Inventory");

        jPanel35.setBackground(new java.awt.Color(0, 102, 102));

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("Enter New Product Details");

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("Product No : ");

        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("Product Name : ");

        jLabel31.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setText("Product Price :");

        jLabel32.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setText("Product Type :");

        jLabel33.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setText("Product Brand :");

        jLabel34.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(255, 255, 255));
        jLabel34.setText("Product Stock :");

        jButtonAddNewProduct.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButtonAddNewProduct.setText("Add Product");
        jButtonAddNewProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddNewProductActionPerformed(evt);
            }
        });

        jLabelPreAddingAdminValidationStatus1.setFont(new java.awt.Font("Tahoma", 3, 10)); // NOI18N
        jLabelPreAddingAdminValidationStatus1.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPreAddingAdminValidationStatus1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelPreAddingAdminValidationStatus1.setText("*Validation Status*");

        jRadButtonProdTypeFragile.setBackground(new java.awt.Color(0, 102, 102));
        buttonGroup4.add(jRadButtonProdTypeFragile);
        jRadButtonProdTypeFragile.setForeground(new java.awt.Color(255, 255, 255));
        jRadButtonProdTypeFragile.setText("Fragile");

        jRadButtonProdTypeNonFragile.setBackground(new java.awt.Color(0, 102, 102));
        buttonGroup4.add(jRadButtonProdTypeNonFragile);
        jRadButtonProdTypeNonFragile.setForeground(new java.awt.Color(255, 255, 255));
        jRadButtonProdTypeNonFragile.setSelected(true);
        jRadButtonProdTypeNonFragile.setText("Non-Fragile");
        jRadButtonProdTypeNonFragile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadButtonProdTypeNonFragileActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel35Layout = new javax.swing.GroupLayout(jPanel35);
        jPanel35.setLayout(jPanel35Layout);
        jPanel35Layout.setHorizontalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel35Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel35Layout.createSequentialGroup()
                        .addGroup(jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel29)
                            .addComponent(jLabel30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(1, 1, 1)
                        .addGroup(jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldNewProdName)
                            .addComponent(jTextFieldNewProdPrice)
                            .addComponent(jTextFieldNewProdNo)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel35Layout.createSequentialGroup()
                        .addGroup(jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel33)
                            .addComponent(jLabel34)
                            .addComponent(jLabel32))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldNewProdBrand, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextFieldNewProdStock, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel35Layout.createSequentialGroup()
                                .addComponent(jRadButtonProdTypeFragile)
                                .addGap(10, 10, 10)
                                .addComponent(jRadButtonProdTypeNonFragile)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(70, 70, 70))
            .addGroup(jPanel35Layout.createSequentialGroup()
                .addGroup(jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel35Layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(jLabel28))
                    .addGroup(jPanel35Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabelPreAddingAdminValidationStatus1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel35Layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(jButtonAddNewProduct)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel35Layout.setVerticalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel35Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldNewProdNo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel29))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldNewProdName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel30))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldNewProdPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel31))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel32)
                    .addComponent(jRadButtonProdTypeFragile)
                    .addComponent(jRadButtonProdTypeNonFragile))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldNewProdBrand, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel33))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel34)
                    .addComponent(jTextFieldNewProdStock, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61)
                .addComponent(jButtonAddNewProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelPreAddingAdminValidationStatus1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTable6.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product No.", "Name", "Price", "Type", "Brand", "Stock"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable6.getTableHeader().setReorderingAllowed(false);
        jScrollPane6.setViewportView(jTable6);
        if (jTable6.getColumnModel().getColumnCount() > 0) {
            jTable6.getColumnModel().getColumn(0).setResizable(false);
            jTable6.getColumnModel().getColumn(1).setResizable(false);
            jTable6.getColumnModel().getColumn(1).setPreferredWidth(110);
            jTable6.getColumnModel().getColumn(2).setResizable(false);
            jTable6.getColumnModel().getColumn(2).setPreferredWidth(80);
            jTable6.getColumnModel().getColumn(3).setResizable(false);
            jTable6.getColumnModel().getColumn(3).setPreferredWidth(60);
            jTable6.getColumnModel().getColumn(4).setResizable(false);
            jTable6.getColumnModel().getColumn(4).setPreferredWidth(80);
            jTable6.getColumnModel().getColumn(5).setResizable(false);
            jTable6.getColumnModel().getColumn(5).setPreferredWidth(50);
        }

        jPanel36.setBackground(new java.awt.Color(0, 102, 102));

        jButtonSaveProductData.setText("Save Data to Text File");
        jButtonSaveProductData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSaveProductDataActionPerformed(evt);
            }
        });

        jButtonDelSelectedProduct.setText("Delete Selected Product");
        jButtonDelSelectedProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDelSelectedProductActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel36Layout = new javax.swing.GroupLayout(jPanel36);
        jPanel36.setLayout(jPanel36Layout);
        jPanel36Layout.setHorizontalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel36Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonSaveProductData)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonDelSelectedProduct)
                .addContainerGap())
        );
        jPanel36Layout.setVerticalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel36Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSaveProductData, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonDelSelectedProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel27)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jPanel35, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 607, Short.MAX_VALUE)
                            .addComponent(jPanel36, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(46, 46, 46))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel35, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(198, 198, 198))
        );

        jTabbedPane2.addTab("4.CREATE NEW PRODUCT", jPanel4);

        jPanel7.setBackground(new java.awt.Color(0, 153, 153));

        jLabel44.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(255, 255, 255));
        jLabel44.setText("Manage Order Item");

        jPanel40.setBackground(new java.awt.Color(0, 102, 102));

        jTable9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));
        jTable9.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product No.", "Name", "Price", "Type", "Brand", "Stock", "Order No.", "Quantity", "Item Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable9.setGridColor(new java.awt.Color(102, 255, 255));
        jTable9.setSelectionForeground(new java.awt.Color(204, 204, 204));
        jTable9.getTableHeader().setReorderingAllowed(false);
        jScrollPane9.setViewportView(jTable9);
        if (jTable9.getColumnModel().getColumnCount() > 0) {
            jTable9.getColumnModel().getColumn(0).setResizable(false);
            jTable9.getColumnModel().getColumn(0).setPreferredWidth(40);
            jTable9.getColumnModel().getColumn(1).setResizable(false);
            jTable9.getColumnModel().getColumn(1).setPreferredWidth(100);
            jTable9.getColumnModel().getColumn(2).setResizable(false);
            jTable9.getColumnModel().getColumn(2).setPreferredWidth(30);
            jTable9.getColumnModel().getColumn(3).setResizable(false);
            jTable9.getColumnModel().getColumn(3).setPreferredWidth(60);
            jTable9.getColumnModel().getColumn(4).setResizable(false);
            jTable9.getColumnModel().getColumn(4).setPreferredWidth(50);
            jTable9.getColumnModel().getColumn(5).setResizable(false);
            jTable9.getColumnModel().getColumn(5).setPreferredWidth(30);
            jTable9.getColumnModel().getColumn(6).setResizable(false);
            jTable9.getColumnModel().getColumn(6).setPreferredWidth(40);
            jTable9.getColumnModel().getColumn(7).setResizable(false);
            jTable9.getColumnModel().getColumn(7).setPreferredWidth(30);
            jTable9.getColumnModel().getColumn(8).setResizable(false);
            jTable9.getColumnModel().getColumn(8).setPreferredWidth(60);
        }

        jButtonViewAllOrderItem.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButtonViewAllOrderItem.setText("View All Order Item");
        jButtonViewAllOrderItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonViewAllOrderItemActionPerformed(evt);
            }
        });

        btnDeleteOrderItem.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnDeleteOrderItem.setText("Delete Order Item");
        btnDeleteOrderItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteOrderItemActionPerformed(evt);
            }
        });

        btnClearTableOrderItem.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnClearTableOrderItem.setText("Clear View");
        btnClearTableOrderItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearTableOrderItemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel40Layout = new javax.swing.GroupLayout(jPanel40);
        jPanel40.setLayout(jPanel40Layout);
        jPanel40Layout.setHorizontalGroup(
            jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel40Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane9)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel40Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnDeleteOrderItem))
                    .addGroup(jPanel40Layout.createSequentialGroup()
                        .addComponent(jButtonViewAllOrderItem)
                        .addGap(173, 173, 173)
                        .addComponent(btnClearTableOrderItem, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel40Layout.setVerticalGroup(
            jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel40Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonViewAllOrderItem, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDeleteOrderItem, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClearTableOrderItem, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel42.setBackground(new java.awt.Color(0, 102, 102));

        jButtonSearchOrderItem.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButtonSearchOrderItem.setText("Search Order Item");
        jButtonSearchOrderItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSearchOrderItemActionPerformed(evt);
            }
        });

        lblSearchStatus5.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        lblSearchStatus5.setForeground(new java.awt.Color(255, 255, 255));
        lblSearchStatus5.setText("Enter Keyword To Search");

        javax.swing.GroupLayout jPanel42Layout = new javax.swing.GroupLayout(jPanel42);
        jPanel42.setLayout(jPanel42Layout);
        jPanel42Layout.setHorizontalGroup(
            jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel42Layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(searchTxtOrderItemNo)
                        .addComponent(jButtonSearchOrderItem))
                    .addComponent(lblSearchStatus5, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel42Layout.setVerticalGroup(
            jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel42Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblSearchStatus5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(searchTxtOrderItemNo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonSearchOrderItem, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jPanel43.setBackground(new java.awt.Color(0, 102, 102));

        lblEdit1.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        lblEdit1.setForeground(new java.awt.Color(255, 255, 255));
        lblEdit1.setText("Enter Product No. To Edit");

        btnSaveChangesOrderItemQuantity.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnSaveChangesOrderItemQuantity.setText("Save Changes");
        btnSaveChangesOrderItemQuantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveChangesOrderItemQuantityActionPerformed(evt);
            }
        });

        radBtnAdminPassAtt1.setBackground(new java.awt.Color(0, 102, 102));
        buttonGroup6.add(radBtnAdminPassAtt1);
        radBtnAdminPassAtt1.setForeground(new java.awt.Color(255, 255, 255));
        radBtnAdminPassAtt1.setSelected(true);
        radBtnAdminPassAtt1.setText("Quantity");

        lblEditAttribute1.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        lblEditAttribute1.setForeground(new java.awt.Color(255, 255, 255));
        lblEditAttribute1.setText("Select Attribute To Edit");

        lblEditNewData1.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        lblEditNewData1.setForeground(new java.awt.Color(255, 255, 255));
        lblEditNewData1.setText("Key In New Data");

        jLabel35.setBackground(new java.awt.Color(0, 0, 0));
        jLabel35.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(255, 255, 255));
        jLabel35.setText("Enter Order No. To Edit");

        txtFieldEditItemOrderNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFieldEditItemOrderNoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel43Layout = new javax.swing.GroupLayout(jPanel43);
        jPanel43.setLayout(jPanel43Layout);
        jPanel43Layout.setHorizontalGroup(
            jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel43Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEdit1))
                .addGap(0, 21, Short.MAX_VALUE))
            .addGroup(jPanel43Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtFieldEditNewOrderItemQuantity)
                    .addComponent(btnSaveChangesOrderItemQuantity, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel43Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel43Layout.createSequentialGroup()
                        .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtFieldEditItemOrderNo, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel43Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblEditNewData1)
                                    .addComponent(radBtnAdminPassAtt1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(36, 36, 36))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel43Layout.createSequentialGroup()
                        .addComponent(txtFieldEditOrderItem, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel43Layout.createSequentialGroup()
                        .addComponent(lblEditAttribute1)
                        .addGap(36, 36, 36))))
        );
        jPanel43Layout.setVerticalGroup(
            jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel43Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblEdit1)
                .addGap(18, 18, 18)
                .addComponent(txtFieldEditOrderItem, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel35)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFieldEditItemOrderNo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(lblEditAttribute1)
                .addGap(18, 18, 18)
                .addComponent(radBtnAdminPassAtt1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblEditNewData1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtFieldEditNewOrderItemQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSaveChangesOrderItemQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        jPanel44.setBackground(new java.awt.Color(0, 102, 102));

        jLabel38.setBackground(new java.awt.Color(0, 0, 0));
        jLabel38.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(255, 255, 255));
        jLabel38.setText("Enter Quantity");

        txtFieldAddOrderIDforItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFieldAddOrderIDforItemActionPerformed(evt);
            }
        });

        jLabel39.setBackground(new java.awt.Color(0, 0, 0));
        jLabel39.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(255, 255, 255));
        jLabel39.setText("Enter Order No.");

        jLabel40.setBackground(new java.awt.Color(0, 0, 0));
        jLabel40.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(255, 255, 255));
        jLabel40.setText("Enter Prod No.");

        jLabelPreAddingOrder_ItemValidationStatus.setBackground(new java.awt.Color(255, 255, 255));
        jLabelPreAddingOrder_ItemValidationStatus.setFont(new java.awt.Font("Tahoma", 3, 10)); // NOI18N
        jLabelPreAddingOrder_ItemValidationStatus.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPreAddingOrder_ItemValidationStatus.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelPreAddingOrder_ItemValidationStatus.setText("* Validation Status*");

        btnAddOrderItem.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnAddOrderItem.setText("Add Order Item");
        btnAddOrderItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddOrderItemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel44Layout = new javax.swing.GroupLayout(jPanel44);
        jPanel44.setLayout(jPanel44Layout);
        jPanel44Layout.setHorizontalGroup(
            jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel44Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel44Layout.createSequentialGroup()
                        .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel44Layout.createSequentialGroup()
                                .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtFieldAddOrderItemID, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel44Layout.createSequentialGroup()
                                .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtFieldAddOrderItemQuantity)))
                        .addGap(18, 18, 18)
                        .addComponent(jLabelPreAddingOrder_ItemValidationStatus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel44Layout.createSequentialGroup()
                        .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFieldAddOrderIDforItem, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                        .addComponent(btnAddOrderItem, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33))))
        );
        jPanel44Layout.setVerticalGroup(
            jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel44Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFieldAddOrderItemID, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel40))
                .addGap(18, 18, 18)
                .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFieldAddOrderIDforItem, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel39)
                    .addComponent(btnAddOrderItem, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFieldAddOrderItemQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel38)
                    .addComponent(jLabelPreAddingOrder_ItemValidationStatus))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel44)
                        .addContainerGap())
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel42, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel43, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanel40, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 180, Short.MAX_VALUE)
                                .addComponent(jPanel44, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(160, 160, 160))))))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jPanel42, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel43, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jPanel40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel44, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(103, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("5.EDIT ORDER", jPanel7);

        jPanel8.setBackground(new java.awt.Color(0, 153, 153));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 980, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 658, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("6.?", jPanel8);

        jPanel9.setBackground(new java.awt.Color(0, 153, 102));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 980, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 658, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("7.?", jPanel9);

        jPanel10.setBackground(new java.awt.Color(0, 153, 102));

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 980, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 658, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("8.?", jPanel10);

        jPanel21.setBackground(new java.awt.Color(0, 102, 153));

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 980, Short.MAX_VALUE)
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 658, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("9.?", jPanel21);

        jPanel13.setBackground(new java.awt.Color(0, 153, 153));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel12.setText("ORDER MANAGEMENT");

        jPanel37.setBackground(new java.awt.Color(0, 102, 102));

        jButtonSearchOrder.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButtonSearchOrder.setText("Search Order");
        jButtonSearchOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSearchOrderActionPerformed(evt);
            }
        });

        lblSearchStatus4.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        lblSearchStatus4.setForeground(new java.awt.Color(255, 255, 255));
        lblSearchStatus4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSearchStatus4.setText("Enter Keyword To Search");

        javax.swing.GroupLayout jPanel37Layout = new javax.swing.GroupLayout(jPanel37);
        jPanel37.setLayout(jPanel37Layout);
        jPanel37Layout.setHorizontalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel37Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(lblSearchStatus4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel37Layout.createSequentialGroup()
                        .addComponent(jButtonSearchOrder)
                        .addGap(18, 18, 18)
                        .addComponent(searchTxtOrderNo, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel37Layout.setVerticalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel37Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblSearchStatus4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSearchOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchTxtOrderNo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jPanel38.setBackground(new java.awt.Color(0, 102, 102));

        btnEditOrder.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnEditOrder.setText("Manage Order Item");
        btnEditOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditOrderActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel38Layout = new javax.swing.GroupLayout(jPanel38);
        jPanel38.setLayout(jPanel38Layout);
        jPanel38Layout.setHorizontalGroup(
            jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel38Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(btnEditOrder)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel38Layout.setVerticalGroup(
            jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel38Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnEditOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel39.setBackground(new java.awt.Color(0, 102, 102));

        jTable7.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Order No.", "Customer ID", "Order Date", "Order Total", "Item Count"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable7.getTableHeader().setReorderingAllowed(false);
        jScrollPane7.setViewportView(jTable7);
        if (jTable7.getColumnModel().getColumnCount() > 0) {
            jTable7.getColumnModel().getColumn(0).setResizable(false);
            jTable7.getColumnModel().getColumn(1).setResizable(false);
            jTable7.getColumnModel().getColumn(2).setResizable(false);
            jTable7.getColumnModel().getColumn(2).setPreferredWidth(80);
            jTable7.getColumnModel().getColumn(3).setResizable(false);
            jTable7.getColumnModel().getColumn(3).setPreferredWidth(60);
            jTable7.getColumnModel().getColumn(4).setResizable(false);
        }

        jButtonViewAllOrders.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButtonViewAllOrders.setText("View All Orders");
        jButtonViewAllOrders.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonViewAllOrdersActionPerformed(evt);
            }
        });

        btnCreateNewOrder.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnCreateNewOrder.setText("Delete Selected Order");
        btnCreateNewOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateNewOrderActionPerformed(evt);
            }
        });

        btnClearTableOrder.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnClearTableOrder.setText("Clear View");
        btnClearTableOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearTableOrderActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel39Layout = new javax.swing.GroupLayout(jPanel39);
        jPanel39.setLayout(jPanel39Layout);
        jPanel39Layout.setHorizontalGroup(
            jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane7)
            .addGroup(jPanel39Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonViewAllOrders)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 145, Short.MAX_VALUE)
                .addComponent(btnClearTableOrder)
                .addGap(110, 110, 110)
                .addComponent(btnCreateNewOrder)
                .addContainerGap())
        );
        jPanel39Layout.setVerticalGroup(
            jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel39Layout.createSequentialGroup()
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonViewAllOrders, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnCreateNewOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnClearTableOrder)))
                .addContainerGap())
        );

        jPanel41.setBackground(new java.awt.Color(0, 102, 102));

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton2.setText("Create New Order");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel36.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(255, 255, 255));
        jLabel36.setText("New Order's Customer ID");

        jLabel37.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(255, 255, 255));
        jLabel37.setText("New Order ID");

        jLabelOrderValidationStatus.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabelOrderValidationStatus.setForeground(new java.awt.Color(255, 255, 255));
        jLabelOrderValidationStatus.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelOrderValidationStatus.setText("*Validation Test*");

        javax.swing.GroupLayout jPanel41Layout = new javax.swing.GroupLayout(jPanel41);
        jPanel41.setLayout(jPanel41Layout);
        jPanel41Layout.setHorizontalGroup(
            jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel41Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(addTxtOrderID, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(addTxtOrderCustomerID, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel41Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel37)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel41Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelOrderValidationStatus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel41Layout.setVerticalGroup(
            jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel41Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelOrderValidationStatus)
                .addGap(18, 18, 18)
                .addComponent(jLabel37)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(addTxtOrderID, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addTxtOrderCustomerID, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel41, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel37, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel38, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(40, 40, 40)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(jPanel39, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(jPanel37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel41, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel39, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(189, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("10.ORDER", jPanel13);

        jPanel14.setBackground(new java.awt.Color(0, 153, 153));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel13.setText("CUSTOMER MANAGEMENT");

        jPanel26.setBackground(new java.awt.Color(0, 102, 102));

        jButtonSearchCust.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButtonSearchCust.setText("Search Customer");
        jButtonSearchCust.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSearchCustActionPerformed(evt);
            }
        });

        lblSearchStatus2.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        lblSearchStatus2.setForeground(new java.awt.Color(255, 255, 255));
        lblSearchStatus2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSearchStatus2.setText("Enter Keyword To Search");

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblSearchStatus2, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel26Layout.createSequentialGroup()
                        .addComponent(jButtonSearchCust, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchTxtCustID, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel26Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblSearchStatus2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSearchCust, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchTxtCustID, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jPanel27.setBackground(new java.awt.Color(0, 102, 102));

        lblEdit2.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        lblEdit2.setForeground(new java.awt.Color(255, 255, 255));
        lblEdit2.setText("Enter Customer ID to Edit");

        btnSaveChanges2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnSaveChanges2.setText("Save Changes");
        btnSaveChanges2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveChanges2ActionPerformed(evt);
            }
        });

        radBtnCustPassAtt.setBackground(new java.awt.Color(0, 102, 102));
        buttonGroup2.add(radBtnCustPassAtt);
        radBtnCustPassAtt.setForeground(new java.awt.Color(255, 255, 255));
        radBtnCustPassAtt.setText("Password");

        lblEditAttribute2.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        lblEditAttribute2.setForeground(new java.awt.Color(255, 255, 255));
        lblEditAttribute2.setText("Select Attribute To Edit");

        radBtnCustFNameAtt.setBackground(new java.awt.Color(0, 102, 102));
        buttonGroup2.add(radBtnCustFNameAtt);
        radBtnCustFNameAtt.setForeground(new java.awt.Color(255, 255, 255));
        radBtnCustFNameAtt.setText("First Name");

        radBtnCustLNameAtt.setBackground(new java.awt.Color(0, 102, 102));
        buttonGroup2.add(radBtnCustLNameAtt);
        radBtnCustLNameAtt.setForeground(new java.awt.Color(255, 255, 255));
        radBtnCustLNameAtt.setText("Last Name");

        radBtnCustAddressAtt.setBackground(new java.awt.Color(0, 102, 102));
        buttonGroup2.add(radBtnCustAddressAtt);
        radBtnCustAddressAtt.setForeground(new java.awt.Color(255, 255, 255));
        radBtnCustAddressAtt.setText("Address");

        radBtnCustEmailAtt.setBackground(new java.awt.Color(0, 102, 102));
        buttonGroup2.add(radBtnCustEmailAtt);
        radBtnCustEmailAtt.setForeground(new java.awt.Color(255, 255, 255));
        radBtnCustEmailAtt.setText("Email");

        lblEditNewData2.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        lblEditNewData2.setForeground(new java.awt.Color(255, 255, 255));
        lblEditNewData2.setText("Key In New Data");

        radBtnCustHPAtt.setBackground(new java.awt.Color(0, 102, 102));
        buttonGroup2.add(radBtnCustHPAtt);
        radBtnCustHPAtt.setForeground(new java.awt.Color(255, 255, 255));
        radBtnCustHPAtt.setText("Phone Number");

        javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
        jPanel27.setLayout(jPanel27Layout);
        jPanel27Layout.setHorizontalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel27Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel27Layout.createSequentialGroup()
                        .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblEditAttribute2)
                            .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(lblEdit2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtFieldEdit2)))
                        .addGap(75, 75, 75))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel27Layout.createSequentialGroup()
                        .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(radBtnCustAddressAtt, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(radBtnCustPassAtt, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)
                        .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblEditNewData2)
                            .addGroup(jPanel27Layout.createSequentialGroup()
                                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(radBtnCustFNameAtt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(radBtnCustEmailAtt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(radBtnCustLNameAtt)
                                    .addComponent(radBtnCustHPAtt))))
                        .addContainerGap())))
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtFieldEditNewData2)
                    .addComponent(btnSaveChanges2, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel27Layout.setVerticalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblEdit2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFieldEdit2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblEditAttribute2)
                .addGap(18, 18, 18)
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(radBtnCustLNameAtt)
                    .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(radBtnCustPassAtt)
                        .addComponent(radBtnCustFNameAtt)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radBtnCustAddressAtt)
                    .addComponent(radBtnCustEmailAtt)
                    .addComponent(radBtnCustHPAtt))
                .addGap(18, 18, 18)
                .addComponent(lblEditNewData2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtFieldEditNewData2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSaveChanges2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jPanel28.setBackground(new java.awt.Color(0, 102, 102));

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID No.", "Password", "First Name", "Last Name", "Address", "Email", "Phone Number"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable3.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(jTable3);
        if (jTable3.getColumnModel().getColumnCount() > 0) {
            jTable3.getColumnModel().getColumn(0).setResizable(false);
            jTable3.getColumnModel().getColumn(0).setPreferredWidth(30);
            jTable3.getColumnModel().getColumn(1).setResizable(false);
            jTable3.getColumnModel().getColumn(1).setPreferredWidth(40);
            jTable3.getColumnModel().getColumn(2).setResizable(false);
            jTable3.getColumnModel().getColumn(2).setPreferredWidth(50);
            jTable3.getColumnModel().getColumn(3).setResizable(false);
            jTable3.getColumnModel().getColumn(3).setPreferredWidth(50);
            jTable3.getColumnModel().getColumn(4).setResizable(false);
            jTable3.getColumnModel().getColumn(4).setPreferredWidth(110);
            jTable3.getColumnModel().getColumn(5).setResizable(false);
            jTable3.getColumnModel().getColumn(5).setPreferredWidth(110);
            jTable3.getColumnModel().getColumn(6).setResizable(false);
            jTable3.getColumnModel().getColumn(6).setPreferredWidth(100);
        }

        btnViewCust.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnViewCust.setText("View All Customers");
        btnViewCust.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewCustActionPerformed(evt);
            }
        });

        btnCreateNewCustomer.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnCreateNewCustomer.setText("Create/Delete Customer");
        btnCreateNewCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateNewCustomerActionPerformed(evt);
            }
        });

        btnClearTableCust.setText("Clear View");
        btnClearTableCust.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearTableCustActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel28Layout = new javax.swing.GroupLayout(jPanel28);
        jPanel28.setLayout(jPanel28Layout);
        jPanel28Layout.setHorizontalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnViewCust)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnClearTableCust)
                .addGap(114, 114, 114)
                .addComponent(btnCreateNewCustomer)
                .addContainerGap())
            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 648, Short.MAX_VALUE)
        );
        jPanel28Layout.setVerticalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnViewCust, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCreateNewCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClearTableCust))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(25, 25, 25))
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(308, 308, 308)
                .addComponent(jLabel13)
                .addContainerGap(322, Short.MAX_VALUE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(jPanel26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 199, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("11.CUSTOMER", jPanel14);

        jPanel15.setBackground(new java.awt.Color(0, 153, 153));

        jPanel29.setBackground(new java.awt.Color(0, 102, 102));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Enter New Customer Details");

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Customer ID : ");

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Password : ");

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("First Name : ");

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Last Name : ");

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Address : ");

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Email :");

        jButtonAddNewCust.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButtonAddNewCust.setText("Add Customer");
        jButtonAddNewCust.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddNewCustActionPerformed(evt);
            }
        });

        jLabelPreAddingCustValidationStatus.setFont(new java.awt.Font("Tahoma", 3, 10)); // NOI18N
        jLabelPreAddingCustValidationStatus.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPreAddingCustValidationStatus.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelPreAddingCustValidationStatus.setText("*Validation Status*");

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("Phone Number :");

        javax.swing.GroupLayout jPanel29Layout = new javax.swing.GroupLayout(jPanel29);
        jPanel29.setLayout(jPanel29Layout);
        jPanel29Layout.setHorizontalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel29Layout.createSequentialGroup()
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelPreAddingCustValidationStatus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel29Layout.createSequentialGroup()
                        .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel29Layout.createSequentialGroup()
                                .addGap(75, 75, 75)
                                .addComponent(jLabel18))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel29Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel19)
                                .addGap(43, 43, 43)
                                .addComponent(jTextFieldNewCustID, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel29Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel29Layout.createSequentialGroup()
                                .addComponent(jLabel22)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextFieldNewCustLName, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel29Layout.createSequentialGroup()
                                .addComponent(jLabel21)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextFieldNewCustFName, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel29Layout.createSequentialGroup()
                                .addComponent(jLabel20)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextFieldNewCustPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel29Layout.createSequentialGroup()
                                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel23)
                                    .addComponent(jLabel24))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextFieldNewCustHP)
                                    .addComponent(jTextFieldNewCustEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                                    .addComponent(jTextFieldNewCustAddress))))))
                .addGap(34, 34, 34))
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel29Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel26))
                    .addGroup(jPanel29Layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(jButtonAddNewCust)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel29Layout.setVerticalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldNewCustID, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldNewCustPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldNewCustFName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldNewCustLName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldNewCustAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(jTextFieldNewCustEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(jTextFieldNewCustHP, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addComponent(jButtonAddNewCust)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelPreAddingCustValidationStatus)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Create New Customer Profile");

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID No.", "Password", "First Name", "Last Name", "Address", "Email", "Phone Number"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable4.getTableHeader().setReorderingAllowed(false);
        jScrollPane4.setViewportView(jTable4);
        if (jTable4.getColumnModel().getColumnCount() > 0) {
            jTable4.getColumnModel().getColumn(0).setResizable(false);
            jTable4.getColumnModel().getColumn(1).setResizable(false);
            jTable4.getColumnModel().getColumn(1).setPreferredWidth(80);
            jTable4.getColumnModel().getColumn(2).setResizable(false);
            jTable4.getColumnModel().getColumn(2).setPreferredWidth(80);
            jTable4.getColumnModel().getColumn(3).setResizable(false);
            jTable4.getColumnModel().getColumn(3).setPreferredWidth(80);
            jTable4.getColumnModel().getColumn(4).setResizable(false);
            jTable4.getColumnModel().getColumn(4).setPreferredWidth(110);
            jTable4.getColumnModel().getColumn(5).setResizable(false);
            jTable4.getColumnModel().getColumn(5).setPreferredWidth(100);
            jTable4.getColumnModel().getColumn(6).setResizable(false);
            jTable4.getColumnModel().getColumn(6).setPreferredWidth(100);
        }

        jPanel31.setBackground(new java.awt.Color(0, 102, 102));

        jButtonSaveCustData.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButtonSaveCustData.setText("Save Data to Text File");
        jButtonSaveCustData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSaveCustDataActionPerformed(evt);
            }
        });

        jButtonDelSelectedCust.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButtonDelSelectedCust.setText("Delete Selected Customer");
        jButtonDelSelectedCust.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDelSelectedCustActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel31Layout = new javax.swing.GroupLayout(jPanel31);
        jPanel31.setLayout(jPanel31Layout);
        jPanel31Layout.setHorizontalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel31Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonSaveCustData)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonDelSelectedCust)
                .addContainerGap())
        );
        jPanel31Layout.setVerticalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel31Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonSaveCustData, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                    .addComponent(jButtonDelSelectedCust, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel25)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addComponent(jPanel29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 563, Short.MAX_VALUE)
                            .addComponent(jPanel31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(70, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("12.CREATE NEW CUSTOMER", jPanel15);

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 980, Short.MAX_VALUE)
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 658, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("13.?", jPanel16);

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 980, Short.MAX_VALUE)
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 658, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("14.?", jPanel17);

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 980, Short.MAX_VALUE)
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 658, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("15.?", jPanel18);

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 980, Short.MAX_VALUE)
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 658, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("16.?", jPanel19);

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 980, Short.MAX_VALUE)
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 658, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("17.?", jPanel20);

        jPanel6.setBackground(new java.awt.Color(0, 153, 153));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 980, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 658, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("18.?", jPanel6);

        jPanel3.setBackground(new java.awt.Color(0, 153, 102));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 980, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 658, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("19.?", jPanel3);

        getContentPane().add(jTabbedPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, -50, 980, 700));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
        jTabbedPane2.setSelectedIndex(0);
        jLabel9.setText(AdminLoginID);
        jLabel42.setText(String.valueOf(java.time.LocalDate.now()));
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        jTabbedPane2.setSelectedIndex(11);
        lblSearchStatus2.setText("Enter Keyword To Search");
        DefaultTableModel model = (DefaultTableModel)jTable3.getModel();
        model.setRowCount(0);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        jTabbedPane2.setSelectedIndex(10);
        DefaultTableModel model = (DefaultTableModel)jTable7.getModel();
        model.setRowCount(0);
        lblSearchStatus4.setText("Enter Keyword To Search");
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        lblSearchStatus.setText("Enter Keyword To Search");
        jTabbedPane2.setSelectedIndex(3);
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        model.setRowCount(0);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        jTabbedPane2.setSelectedIndex(1);
        lblSearchStatus3.setText("Enter Keyword To Search");
        DefaultTableModel model = (DefaultTableModel)jTable5.getModel();
        model.setRowCount(0);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
        System.exit(0); // stop program
    }//GEN-LAST:event_jButton12ActionPerformed

    private void btnCreateNewAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateNewAdminActionPerformed
        // TODO add your handling code here:
        jTabbedPane2.setSelectedIndex(2);
        DefaultTableModel model = (DefaultTableModel)jTable2.getModel();
        model.setRowCount(0);
        String adminclass = "Admin";
        String adminFilePath = "Admin.txt";
        FileOperations fops = new FileOperations();
        ArrayList <String[]> AdmintempList = (fops.viewOperations(adminFilePath,adminclass));
        for (String[] lines: AdmintempList){
            model.addRow(lines);
          }
        jLabelPreAddingAdminValidationStatus.setText("*Validation Status*");

    }//GEN-LAST:event_btnCreateNewAdminActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      // TODO add your handling code here:
      DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
      model.setRowCount(0);
      String adminclass = "Admin";
      String adminFilePath = "Admin.txt";
      FileOperations fops = new FileOperations();
      ArrayList <String[]> AdmintempList = (fops.viewOperations(adminFilePath,adminclass));
      for (String[] lines: AdmintempList){
          model.addRow(lines);
      }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        model.setRowCount(0);
        String searchInputAdmin = searchTxtIdNo.getText().trim();
        String adminclass = "Admin";
        String adminFilePath = "Admin.txt";
        FileOperations fops = new FileOperations();
        boolean processSuccessful = false;

        ArrayList <String[]> AdmintempList = (fops.searchOperations(searchInputAdmin,adminFilePath,adminclass));
        for (String[] lines: AdmintempList){
            model.addRow(lines);
            processSuccessful = true;
        }
        if (processSuccessful == true){
            searchTxtIdNo.setText("");
            lblSearchStatus.setText("Search Result Found!");
        }else if(processSuccessful == false){
            searchTxtIdNo.setText("");
            lblSearchStatus.setText("No Search Result Found!");
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButtonDelSelectedAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDelSelectedAdminActionPerformed
        // TODO add your handling code here:
        if(jTable2.getSelectedRow() != -1) {
          DefaultTableModel model = (DefaultTableModel)jTable2.getModel();
          model.removeRow(jTable2.getSelectedRow());
          JOptionPane.showMessageDialog(null, "Selected row deleted successfully");
        }else {JOptionPane.showMessageDialog(null, "Please select a row to delete");}
    }//GEN-LAST:event_jButtonDelSelectedAdminActionPerformed

    private void jButtonSaveAdminDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaveAdminDataActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)jTable2.getModel();
        String adminFilePath = "Admin.txt";
        String adminclass = "Admin";
        FileOperations fops = new FileOperations();

        String[] wordsInLines = new String[6];
        int nrow = jTable2.getRowCount();
        int ncol = jTable2.getColumnCount();
        Object[][] tableData = new Object[nrow][ncol];
        String[] OrderToKeep = new String[nrow];

        for(int row = 0; row < jTable2.getRowCount(); row++) {
          for(int column = 0; column < jTable2.getColumnCount(); column++) {
            tableData[row][column] = jTable2.getValueAt(row, column);
          }
          OrderToKeep[row] = String.valueOf(jTable2.getValueAt(row, 0));
        }

         String Orderclass = "Order";
         String OrderFilePath = "Order.txt";
         ArrayList <String[]> OrderWriteList = new ArrayList <String[]>();
         ArrayList <String[]> OrderViewList = (fops.viewOperations(OrderFilePath));
         ArrayList <String> order_ItemsToRemove = new ArrayList<String>();

          for (String[] lines: OrderViewList){
           boolean transfer = true;
           if (Arrays.asList(OrderToKeep).contains(lines[1]) || lines[1].startsWith("IDC".substring(0,3))){
           }else{
             transfer = false;
             order_ItemsToRemove.add(lines[0]);
           }
           if (transfer == true){
              OrderWriteList.add(lines);
           }
         }


         ArrayList <String[]> Order_ItemList = new ArrayList <String[]>();
         ArrayList <String[]> Order_ItemRemovingList = (fops.viewOperations("Order_Item.txt"));
         for (String[] lines: Order_ItemRemovingList){
           if (order_ItemsToRemove.contains(lines[1])){
           }else{
             Order_ItemList.add(lines);
           }
         }

       fops.write2File(Order_ItemList,"Order_Item.txt","Order_Item");
       fops.write2File(OrderWriteList,OrderFilePath,Orderclass);
       fops.write2File(tableData,adminFilePath,adminclass);
       JOptionPane.showMessageDialog(null, "Data Successfully Overwritten to Text File");

    }//GEN-LAST:event_jButtonSaveAdminDataActionPerformed

    private void jButtonAddNewAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddNewAdminActionPerformed
        // TODO add your handling code here:
        String adminFilePath = "Admin.txt";
        String adminclass = "Admin";
        FileOperations fops = new FileOperations();
        boolean addingDataSufficient = true;
        String[] addedAdminData = new String[6];

        addedAdminData[0] = jTextFieldNewAdminID.getText().trim();
        addedAdminData[1] = jTextFieldNewAdminPassword.getText().trim();
        addedAdminData[2] = jTextFieldNewAdminFName.getText().trim();
        addedAdminData[3] = jTextFieldNewAdminLName.getText().trim();
        addedAdminData[4] = jTextFieldNewAdminAddress.getText().trim();
        addedAdminData[5] = jTextFieldNewAdminPosition.getText().trim();

        for (String items: addedAdminData){
         if(items.isEmpty()){
            addingDataSufficient = false;
          }
        }

        if(addingDataSufficient == true){
          addedAdminData[0] = fops.capitalizeEveryWord(addedAdminData[0],3);

          String IDformat = "IDA";
          if (addedAdminData[0].startsWith(IDformat.substring(0,IDformat.length()))){
            addingDataSufficient = fops.DuplicateCheckOperation(addedAdminData[0],adminFilePath,adminclass);
            for(int count = 2; count < addedAdminData.length; count++) {
                addedAdminData[count] = fops.capitalizeEveryWord(addedAdminData[count],1);
            }
          }else{
            addingDataSufficient = false;
          }
        }

        if(addingDataSufficient == true){
        DefaultTableModel model = (DefaultTableModel)jTable2.getModel();
        model.addRow(addedAdminData);
        jLabelPreAddingAdminValidationStatus.setText("New Data Added, Now go Save!");
        }else{
          jLabelPreAddingAdminValidationStatus.setText("Wrong inputs, please try again");
        }

        jTextFieldNewAdminID.setText("");
        jTextFieldNewAdminPassword.setText("");
        jTextFieldNewAdminFName.setText("");
        jTextFieldNewAdminLName.setText("");
        jTextFieldNewAdminAddress.setText("");
        jTextFieldNewAdminPosition.setText("");

    }//GEN-LAST:event_jButtonAddNewAdminActionPerformed

    private void jButtonSearchCustActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSearchCustActionPerformed
        // TODO add your handling code here:

        DefaultTableModel model = (DefaultTableModel)jTable3.getModel();
        model.setRowCount(0);
        String searchInputCustomer = searchTxtCustID.getText().trim();
        String Customerclass = "Customer";
        String CustomerFilePath = "Customer.txt";
        FileOperations fops = new FileOperations();
        boolean processSuccessful = false;

        ArrayList <String[]> CustomertempList = (fops.searchOperations(searchInputCustomer,CustomerFilePath,Customerclass));
        for (String[] lines: CustomertempList){
            model.addRow(lines);
            processSuccessful = true;
        }
        if (processSuccessful == true){
            searchTxtCustID.setText("");
            lblSearchStatus2.setText("Search Result Found!");
        }else if(processSuccessful == false){
            searchTxtCustID.setText("");
            lblSearchStatus2.setText("No Search Result Found!");
        }
    }//GEN-LAST:event_jButtonSearchCustActionPerformed

    private void btnViewCustActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewCustActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)jTable3.getModel();
        model.setRowCount(0);
        String Customerclass = "Customer";
        String CustomerFilePath = "Customer.txt";
        FileOperations fops = new FileOperations();
        ArrayList <String[]> CustomertempList = (fops.viewOperations(CustomerFilePath,Customerclass));
        for (String[] lines: CustomertempList){
            model.addRow(lines);
        }

    }//GEN-LAST:event_btnViewCustActionPerformed

    private void btnCreateNewCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateNewCustomerActionPerformed
        // TODO add your handling code here:
        jTabbedPane2.setSelectedIndex(12);
        jLabelPreAddingCustValidationStatus.setText("*Validation Status*");
        DefaultTableModel model = (DefaultTableModel)jTable4.getModel();
        model.setRowCount(0);
        String Customerclass = "Customer";
        String CustomerFilePath = "Customer.txt";
        FileOperations fops = new FileOperations();
        ArrayList <String[]> CustomertempList = (fops.viewOperations(CustomerFilePath,Customerclass));
        for (String[] lines: CustomertempList){
            model.addRow(lines);
        }
    }//GEN-LAST:event_btnCreateNewCustomerActionPerformed

    private void btnClearTableAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearTableAdminActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        model.setRowCount(0);
    }//GEN-LAST:event_btnClearTableAdminActionPerformed

    private void btnClearTableCustActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearTableCustActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)jTable3.getModel();
        model.setRowCount(0);
    }//GEN-LAST:event_btnClearTableCustActionPerformed

    private void jButtonAddNewCustActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddNewCustActionPerformed
        // TODO add your handling code here:
        String CustomerFilePath = "Customer.txt";
        String Customerclass = "Customer";
        FileOperations fops = new FileOperations();
        boolean addingDataSufficient = true;
        String[] addedCustomerData = new String[7];

        addedCustomerData[0] = jTextFieldNewCustID.getText().trim();
        addedCustomerData[1] = jTextFieldNewCustPassword.getText().trim();
        addedCustomerData[2] = jTextFieldNewCustFName.getText().trim();
        addedCustomerData[3] = jTextFieldNewCustLName.getText().trim();
        addedCustomerData[4] = jTextFieldNewCustAddress.getText().trim();
        addedCustomerData[5] = jTextFieldNewCustEmail.getText().trim();
        addedCustomerData[6] = jTextFieldNewCustHP.getText().trim();

        for (String items: addedCustomerData){
         if(items.isEmpty()){
            addingDataSufficient = false;
          }
        }

        if(addingDataSufficient == true){
          addedCustomerData[0] = fops.capitalizeEveryWord(addedCustomerData[0],3);

          String IDformat = "IDC";
          if (addedCustomerData[0].startsWith(IDformat.substring(0,IDformat.length()))){
            addingDataSufficient = fops.DuplicateCheckOperation(addedCustomerData[0],CustomerFilePath,Customerclass);
            for(int count = 2; count < addedCustomerData.length; count++) {
                addedCustomerData[count] = fops.capitalizeEveryWord(addedCustomerData[count],1);
            }
          }else{
            addingDataSufficient = false;
          }
        }

        if(addingDataSufficient == true){
          DefaultTableModel model = (DefaultTableModel)jTable4.getModel();
          model.addRow(addedCustomerData);
          jLabelPreAddingCustValidationStatus.setText("New Data Added, Now go Save!");
        }else{
          jLabelPreAddingCustValidationStatus.setText("Wrong inputs, please try again");
        }

        jTextFieldNewCustID.setText("");
        jTextFieldNewCustPassword.setText("");
        jTextFieldNewCustFName.setText("");
        jTextFieldNewCustLName.setText("");
        jTextFieldNewCustAddress.setText("");
        jTextFieldNewCustEmail.setText("");
        jTextFieldNewCustHP.setText("");

    }//GEN-LAST:event_jButtonAddNewCustActionPerformed

    private void jButtonSaveCustDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaveCustDataActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)jTable4.getModel();
        String CustomerFilePath = "Customer.txt";
        String Customerclass = "Customer";
        FileOperations fops = new FileOperations();

        String[] wordsInLines = new String[7];
        int nrow = jTable4.getRowCount();
        int ncol = jTable4.getColumnCount();
        Object[][] tableData = new Object[nrow][ncol];
        String[] OrderToKeep = new String[nrow];

        for(int row = 0; row < jTable4.getRowCount(); row++) {
          for(int column = 0; column < jTable4.getColumnCount(); column++) {
            tableData[row][column] = jTable4.getValueAt(row, column);
          }
          OrderToKeep[row] = String.valueOf(jTable4.getValueAt(row, 0));
        }

         String Orderclass = "Order";
         String OrderFilePath = "Order.txt";
         ArrayList <String[]> OrderWriteList = new ArrayList <String[]>();
         ArrayList <String[]> OrderViewList = (fops.viewOperations(OrderFilePath));
         ArrayList <String> order_ItemsToRemove = new ArrayList<String>();

          for (String[] lines: OrderViewList){
           boolean transfer = true;
           if (Arrays.asList(OrderToKeep).contains(lines[1]) || lines[1].startsWith("IDA".substring(0,3))){
           }else{
             transfer = false;
             order_ItemsToRemove.add(lines[0]);
           }
           if (transfer == true){
              OrderWriteList.add(lines);
           }
         }

         ArrayList <String[]> Order_ItemList = new ArrayList <String[]>();
         ArrayList <String[]> Order_ItemRemovingList = (fops.viewOperations("Order_Item.txt"));
         for (String[] lines: Order_ItemRemovingList){
           if (order_ItemsToRemove.contains(lines[1])){
           }else{
             Order_ItemList.add(lines);
           }
         }

       fops.write2File(Order_ItemList,"Order_Item.txt","Order_Item");
       fops.write2File(OrderWriteList,OrderFilePath,Orderclass);
       fops.write2File(tableData,CustomerFilePath,Customerclass);
       JOptionPane.showMessageDialog(null, "Data Successfully Overwritten to Text File");

    }//GEN-LAST:event_jButtonSaveCustDataActionPerformed

    private void jButtonDelSelectedCustActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDelSelectedCustActionPerformed
        // TODO add your handling code here:
        if(jTable4.getSelectedRow() != -1) {
          // remove selected row from the model
          DefaultTableModel model = (DefaultTableModel)jTable4.getModel();
          model.removeRow(jTable4.getSelectedRow());
          JOptionPane.showMessageDialog(null, "Selected row deleted successfully");
        }else {JOptionPane.showMessageDialog(null, "Please select a row to delete");}

    }//GEN-LAST:event_jButtonDelSelectedCustActionPerformed

    private void btnSaveChangesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveChangesActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        model.setRowCount(0);
        String adminFilePath = "Admin.txt";
        String adminclass = "Admin";
        FileOperations fops = new FileOperations();
        boolean ProcessSuccessful = false;
        ArrayList <String[]> AdminViewList = new ArrayList<String[]>();
        String updatedValue = txtFieldEditNewData.getText();
        String editingID = txtFieldEdit.getText();

        int index = 0;
        if (radBtnAdminPassAtt.isSelected()){
          index = 1;
        } else if (radBtnAdminFNameAtt.isSelected()){
          index = 2;
        }else if (radBtnAdminLNameAtt.isSelected()){
          index = 3;
        }else if (radBtnAdminAddressAtt.isSelected()){
          index = 4;
        }else if (radBtnAdminPosAtt.isSelected()){
          index = 5;
        }

        if (updatedValue.isEmpty() || editingID.isEmpty() || index == 0){  }
        else{
         if (index > 1){
           updatedValue = fops.capitalizeEveryWord(updatedValue,1);
         }
         editingID = fops.capitalizeEveryWord(editingID,3);
         AdminViewList = (fops.viewOperations(adminFilePath,adminclass));
         for (String[] line: AdminViewList){
           if (line[0].equals(editingID)){
             line[index] = updatedValue;
             ProcessSuccessful = true;
            }
          }
        }

       if (ProcessSuccessful == true){
       fops.write2File(AdminViewList,adminFilePath,adminclass);
        ArrayList <String[]> AdminDisplayList = (fops.viewOperations(adminFilePath,adminclass));
        for (String[] lines: AdminDisplayList){
            model.addRow(lines);
        }
        JOptionPane.showMessageDialog(null, "Data Successfully Edited");
       }else{
           JOptionPane.showMessageDialog(null, "wrong Inputs, Please try again");
       }

    }//GEN-LAST:event_btnSaveChangesActionPerformed

    private void jButtonSearchProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSearchProductActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)jTable5.getModel();
        model.setRowCount(0);
        String searchInputProduct = searchTxtProduct.getText().trim();
        String Productclass = "Product";
        String ProductFilePath = "Product.txt";
        FileOperations fops = new FileOperations();
        boolean processSuccessful = false;

        ArrayList <String[]> ProducttempList = (fops.searchOperations(searchInputProduct,ProductFilePath,Productclass));
        for (String[] lines: ProducttempList){
            model.addRow(lines);
            processSuccessful = true;
        }
        if (processSuccessful == true){
            searchTxtProduct.setText("");
            lblSearchStatus3.setText("Search Result Found!");
        }else if(processSuccessful == false){
            searchTxtProduct.setText("");
            lblSearchStatus3.setText("No Search Result Found!");
        }
    }//GEN-LAST:event_jButtonSearchProductActionPerformed

    private void btnSaveChanges2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveChanges2ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)jTable3.getModel();
        model.setRowCount(0);
        String CustomerFilePath = "Customer.txt";
        String Customerclass = "Customer";
        FileOperations fops = new FileOperations();

        boolean ProcessSuccessful = false;
        ArrayList <String[]> CustomerViewList = new ArrayList<String[]>();

        String updatedValue = txtFieldEditNewData2.getText();
        String editingID = txtFieldEdit2.getText();

        int index = 0;
        if (radBtnCustPassAtt.isSelected()){
          index = 1;
        } else if (radBtnCustFNameAtt.isSelected()){
          index = 2;
        }else if (radBtnCustLNameAtt.isSelected()){
          index = 3;
        }else if (radBtnCustAddressAtt.isSelected()){
          index = 4;
        }else if (radBtnCustEmailAtt.isSelected()){
          index = 5;
        }else if (radBtnCustHPAtt.isSelected()){
          index = 6;
        }

        if (updatedValue.isEmpty() || editingID.isEmpty() || index == 0){  }
        else{
         if (index > 1){
           updatedValue = fops.capitalizeEveryWord(updatedValue,1);
         }
         editingID = fops.capitalizeEveryWord(editingID,3);
         CustomerViewList = (fops.viewOperations(CustomerFilePath,Customerclass));
         for (String[] line: CustomerViewList){
           if (line[0].equals(editingID)){
             line[index] = updatedValue;
             ProcessSuccessful = true;
            }
          }
        }

       if (ProcessSuccessful == true){
       fops.write2File(CustomerViewList,CustomerFilePath,Customerclass);
        ArrayList <String[]> CustomerDisplayList = (fops.viewOperations(CustomerFilePath,Customerclass));
        for (String[] lines: CustomerDisplayList){
          model.addRow(lines);
        }
        JOptionPane.showMessageDialog(null, "Data Successfully Edited");
       }else{
        JOptionPane.showMessageDialog(null, "wrong Inputs, Please try again");
       }

    }//GEN-LAST:event_btnSaveChanges2ActionPerformed

    private void btnSaveChangesProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveChangesProductActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)jTable5.getModel();
        model.setRowCount(0);
        String ProductFilePath = "Product.txt";
        String Productclass = "Product";
        FileOperations fops = new FileOperations();
        boolean ProcessSuccessful = false;
        ArrayList <String[]> ProductViewList = new ArrayList<String[]>();
        String updatedValue = txtFieldEditNewDataProduct.getText();
        String editingID = txtFieldEditableProductNumber1.getText();

        int index = 0;
        if (radBtnProdNameAtt1.isSelected()){
          index = 1;
        } else if (radBtnProdPriceAtt1.isSelected()){
          index = 2;
        }else if (radBtnProdTypeAtt1.isSelected()){
          index = 3;
        }else if (radBtnProdBrandAtt1.isSelected()){
          index = 4;
        }else if (radBtnProdStockAtt1.isSelected()){
          index = 5;
        }

        if (updatedValue.isEmpty() || editingID.isEmpty() || index == 0){  }
        else{
         if (index > 1){
           updatedValue = fops.capitalizeEveryWord(updatedValue,1);
         }
         editingID = fops.capitalizeEveryWord(editingID,4);
         ProductViewList = (fops.viewOperations(ProductFilePath,Productclass));
         for (String[] line: ProductViewList){
           if (line[0].equals(editingID)){
             line[index] = updatedValue;
             ProcessSuccessful = true;
            }
          }
        }

       if (ProcessSuccessful == true){
       fops.write2File(ProductViewList,ProductFilePath,Productclass);
        ArrayList <String[]> ProductDisplayList = (fops.viewOperations(ProductFilePath,Productclass));
        for (String[] lines: ProductDisplayList){
            model.addRow(lines);
        }
        JOptionPane.showMessageDialog(null, "Data Successfully Edited");
       }else{
           JOptionPane.showMessageDialog(null, "wrong Inputs, Please try again");
       }

    }//GEN-LAST:event_btnSaveChangesProductActionPerformed

    private void jButtonViewAllProductsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonViewAllProductsActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)jTable5.getModel();
        model.setRowCount(0);
        String Productclass = "Product";
        String ProductFilePath = "Product.txt";
        FileOperations fops = new FileOperations();
        ArrayList <String[]> ProducttempList = (fops.viewOperations(ProductFilePath,Productclass));
        for (String[] lines: ProducttempList){
            model.addRow(lines);
        }
    }//GEN-LAST:event_jButtonViewAllProductsActionPerformed

    private void btnCreateNewProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateNewProductActionPerformed
        // TODO add your handling code here:
        jTabbedPane2.setSelectedIndex(4);
        DefaultTableModel model = (DefaultTableModel)jTable6.getModel();
        model.setRowCount(0);
        String Productclass = "Product";
        String ProductFilePath = "Product.txt";
        FileOperations fops = new FileOperations();
        ArrayList <String[]> ProducttempList = (fops.viewOperations(ProductFilePath,Productclass));
        for (String[] lines: ProducttempList){
            model.addRow(lines);
        }
        jLabelPreAddingAdminValidationStatus1.setText("*Validation Status*");
    }//GEN-LAST:event_btnCreateNewProductActionPerformed

    private void btnClearTableProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearTableProductActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)jTable5.getModel();
        model.setRowCount(0);
    }//GEN-LAST:event_btnClearTableProductActionPerformed

    private void jButtonAddNewProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddNewProductActionPerformed
        // TODO add your handling code here:
        String ProductFilePath = "Product.txt";
        String Productclass = "Product";
        FileOperations fops = new FileOperations();
        boolean addingDataSufficient = true;

        String[] addedProductData = new String[6];
        addedProductData[0] = jTextFieldNewProdNo.getText().trim();
        addedProductData[1] = jTextFieldNewProdName.getText().trim();
        addedProductData[2] = jTextFieldNewProdPrice.getText().trim();
        addedProductData[4] = jTextFieldNewProdBrand.getText().trim();
        addedProductData[5] = jTextFieldNewProdStock.getText().trim();
        if (jRadButtonProdTypeFragile.isSelected()){
          addedProductData[3] = "Fragile";
        } else if (jRadButtonProdTypeNonFragile.isSelected()){
          addedProductData[3] = "Non-Fragile";
        }

        for (String items: addedProductData){
         if(items.isEmpty()){
            addingDataSufficient = false;
          }
        }


        if(addingDataSufficient == true){
          addedProductData[0] = fops.capitalizeEveryWord(addedProductData[0],4);

          String IDformat = "PROD";
          if (addedProductData[0].startsWith(IDformat.substring(0,IDformat.length()))){
            addingDataSufficient = fops.DuplicateCheckOperation(addedProductData[0],ProductFilePath,Productclass);
            for(int count = 3; count < addedProductData.length; count++) {
                addedProductData[count] = fops.capitalizeEveryWord(addedProductData[count],1);
            }
          }else{
            addingDataSufficient = false;
          }
        }




        if(addingDataSufficient == true){
          DefaultTableModel model = (DefaultTableModel)jTable6.getModel();
          model.addRow(addedProductData);
          jLabelPreAddingAdminValidationStatus1.setText("New Data Added, Now go Save!");
        }else{
          jLabelPreAddingAdminValidationStatus1.setText("Wrong inputs, please try again");
        }



        jTextFieldNewProdNo.setText("");
        jTextFieldNewProdName.setText("");
        jTextFieldNewProdPrice.setText("");
        jTextFieldNewProdBrand.setText("");
        jTextFieldNewProdStock.setText("");

    }//GEN-LAST:event_jButtonAddNewProductActionPerformed

    private void jButtonSaveProductDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaveProductDataActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)jTable6.getModel();
        String ProductFilePath = "Product.txt";
        String Productclass = "Product";
        FileOperations fops = new FileOperations();

        String[] wordsInLines = new String[6];
        int nrow = jTable6.getRowCount();
        int ncol = jTable6.getColumnCount();
        Object[][] tableData = new Object[nrow][ncol];

        Object[] Order_ItemsToKeep = new Object[nrow];
        for(int row = 0; row < jTable6.getRowCount(); row++) {
          for(int column = 0; column < jTable6.getColumnCount(); column++) {
            tableData[row][column] = jTable6.getValueAt(row, column);
          }
          Order_ItemsToKeep[row] = jTable6.getValueAt(row, 0);
        }
        fops.write2File(tableData,ProductFilePath,Productclass);

        String Order_Itemclass = "Order_Item";
        String Order_ItemFilePath = "Order_Item.txt";
        ArrayList <String[]> Order_ItemWriteList = new ArrayList <String[]>();
        ArrayList <String[]> Order_ItemViewList = (fops.viewOperations(Order_ItemFilePath));
        for (String[] lines: Order_ItemViewList){
          for (Object prodIDs: Order_ItemsToKeep){
            if (lines[0].equals(prodIDs)){
              Order_ItemWriteList.add(lines);
              }
            }
          }
        fops.write2File(Order_ItemWriteList,Order_ItemFilePath,Order_Itemclass);

        JOptionPane.showMessageDialog(null, "Data Successfully Overwritten to Text File");

    }//GEN-LAST:event_jButtonSaveProductDataActionPerformed

    private void jButtonDelSelectedProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDelSelectedProductActionPerformed
        // TODO add your handling code here:
        if(jTable6.getSelectedRow() != -1) {
          DefaultTableModel model = (DefaultTableModel)jTable6.getModel();
          model.removeRow(jTable6.getSelectedRow());
          JOptionPane.showMessageDialog(null, "Selected row deleted successfully");
        }else {JOptionPane.showMessageDialog(null, "Please select a row to delete");}
    }//GEN-LAST:event_jButtonDelSelectedProductActionPerformed

    private void jButtonSearchOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSearchOrderActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)jTable7.getModel();
        model.setRowCount(0);
        String searchInputOrder = searchTxtOrderNo.getText();
        String orderclass = "Order";
        String orderFilePath = "Order.txt";
        FileOperations fops = new FileOperations();
        boolean processSuccessful = false;



        ArrayList <String[]> OrdertempList = (fops.objectBasedSearchOperations(searchInputOrder,orderFilePath,orderclass));
        for (String[] lines: OrdertempList){
          model.addRow(lines);
          processSuccessful = true;
        }
        if (processSuccessful == true){
          searchTxtOrderNo.setText("");
          lblSearchStatus4.setText("Search Result Found!");
        }else if(processSuccessful == false){
          searchTxtOrderNo.setText("");
          lblSearchStatus4.setText("No Search Result Found!");
        }


    }//GEN-LAST:event_jButtonSearchOrderActionPerformed

    private void btnEditOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditOrderActionPerformed
        // TODO add your handling code here:
        jTabbedPane2.setSelectedIndex(5);
        DefaultTableModel model = (DefaultTableModel)jTable9.getModel();
        model.setRowCount(0);
        jLabelPreAddingOrder_ItemValidationStatus.setText("* Validation Status*");
    }//GEN-LAST:event_btnEditOrderActionPerformed

    private void jButtonViewAllOrdersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonViewAllOrdersActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)jTable7.getModel();
        model.setRowCount(0);
        String Orderclass = "Order";
        String OrderFilePath = "Order.txt";
        FileOperations fops = new FileOperations();
        ArrayList <String[]> OrdertempList = (fops.viewOperations(OrderFilePath,Orderclass));
        for (String[] lines: OrdertempList){
          model.addRow(lines);
        }

    }//GEN-LAST:event_jButtonViewAllOrdersActionPerformed

    private void btnCreateNewOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateNewOrderActionPerformed
        // TODO add your handling code here:

        if(jTable7.getSelectedRow() != -1) {
          DefaultTableModel model = (DefaultTableModel)jTable7.getModel();

          String Orderclass = "Order";
          String OrderFilePath = "Order.txt";
          FileOperations fops = new FileOperations();

          int column = 0;
          int row = jTable7.getSelectedRow();
          String orderID = jTable7.getModel().getValueAt(row, 0).toString();

          ArrayList <String[]> OrderWriteList = new ArrayList <String[]>();
          ArrayList <String[]> OrderViewList = (fops.viewOperations(OrderFilePath));
          for (String[] lines: OrderViewList){
            if (lines[0].equals(orderID)){
            }else{
              OrderWriteList.add(lines);
            }
          }
          fops.write2File(OrderWriteList,OrderFilePath,Orderclass);

          ArrayList <String[]> Order_ItemWriteList = new ArrayList <String[]>();
          ArrayList <String[]> Order_ItemRemovingList = (fops.viewOperations("Order_Item.txt"));
          for (String[] lines: Order_ItemRemovingList){
            if (lines[1].equals(orderID)){
            }else{
              Order_ItemWriteList.add(lines);
            }
          }
          fops.write2File(Order_ItemWriteList,"Order_Item.txt","Order_Item");

          JOptionPane.showMessageDialog(null, "Selected row deleted successfully");
          model.setRowCount(0);
        }else{
          JOptionPane.showMessageDialog(null, "Please select a row to delete");
            }

    }//GEN-LAST:event_btnCreateNewOrderActionPerformed

    private void btnClearTableOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearTableOrderActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)jTable7.getModel();
        model.setRowCount(0);
    }//GEN-LAST:event_btnClearTableOrderActionPerformed

    private void jButtonViewAllOrderItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonViewAllOrderItemActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)jTable9.getModel();
        model.setRowCount(0);
        String Order_Itemclass = "Order_Item";
        String Order_ItemFilePath = "Order_Item.txt";
        FileOperations fops = new FileOperations();
        ArrayList <String[]> Order_ItemtempList = (fops.viewOperations(Order_ItemFilePath,Order_Itemclass));
        for (String[] lines: Order_ItemtempList){
            model.addRow(lines);
        }

    }//GEN-LAST:event_jButtonViewAllOrderItemActionPerformed

    private void btnDeleteOrderItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteOrderItemActionPerformed
        // TODO add your handling code here:
        if(jTable9.getSelectedRow() != -1) {
        DefaultTableModel model = (DefaultTableModel)jTable9.getModel();
        String Order_Itemclass = "Order_Item";
        String Order_ItemFilePath = "Order_Item.txt";
        FileOperations fops = new FileOperations();

        int column = 0;
        int row = jTable9.getSelectedRow();
        String prodnumber = jTable9.getModel().getValueAt(row, column).toString();

        column = 6;
        String ordernumber = jTable9.getModel().getValueAt(row, column).toString();

        ArrayList <String[]> Order_ItemWriteList = new ArrayList <String[]>();
        ArrayList <String[]> Order_ItemViewList = (fops.viewOperations(Order_ItemFilePath));
        for (String[] lines: Order_ItemViewList){
          if (lines[0].equals(prodnumber) && lines[1].equals(ordernumber)){
          }else{
            Order_ItemWriteList.add(lines);
          }
        }
      fops.write2File(Order_ItemWriteList,Order_ItemFilePath,Order_Itemclass);
      JOptionPane.showMessageDialog(null, "Selected row deleted successfully");
      model.setRowCount(0);
    }else{
      JOptionPane.showMessageDialog(null, "Please select a row to delete");
        }
    }//GEN-LAST:event_btnDeleteOrderItemActionPerformed

    private void btnClearTableOrderItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearTableOrderItemActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)jTable9.getModel();
        model.setRowCount(0);


    }//GEN-LAST:event_btnClearTableOrderItemActionPerformed

    private void jButtonSearchOrderItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSearchOrderItemActionPerformed
        // TODO add your handling code here:

        DefaultTableModel model = (DefaultTableModel)jTable9.getModel();
        model.setRowCount(0);
        String searchInputOrder_Item = searchTxtOrderItemNo.getText().trim();
        String Order_Itemclass = "Order_Item";
        String Order_ItemFilePath = "Order_Item.txt";
        FileOperations fops = new FileOperations();
        boolean processSuccessful = false;

        ArrayList <String[]> Order_ItemtempList = (fops.objectBasedSearchOperations(searchInputOrder_Item,Order_ItemFilePath,Order_Itemclass));
        for (String[] lines: Order_ItemtempList){
            model.addRow(lines);
            processSuccessful = true;

        }
        if (processSuccessful == true){
            searchTxtIdNo.setText("");
            lblSearchStatus5.setText("Search Result Found!");
        }else if(processSuccessful == false){
            searchTxtIdNo.setText("");
            lblSearchStatus5.setText("No Search Result Found!");
        }
    }//GEN-LAST:event_jButtonSearchOrderItemActionPerformed

    private void btnSaveChangesOrderItemQuantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveChangesOrderItemQuantityActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)jTable9.getModel();
        model.setRowCount(0);
        String Order_ItemFilePath = "Order_Item.txt";
        String Order_Itemclass = "Order_Item";
        FileOperations fops = new FileOperations();

        boolean ProcessSuccessful = false;
        ArrayList <String[]> Order_ItemViewList = new ArrayList<String[]>();

        String updatedValue = txtFieldEditNewOrderItemQuantity.getText().trim();
        String editingID = txtFieldEditOrderItem.getText().trim();
        String editingOrderID = txtFieldEditItemOrderNo.getText().trim();

        if (updatedValue.isEmpty() || editingID.isEmpty()|| editingOrderID.isEmpty()){  }
        else{
         editingID = fops.capitalizeEveryWord(editingID,4);
         editingOrderID = fops.capitalizeEveryWord(editingOrderID,3);
         Order_ItemViewList = (fops.viewOperations(Order_ItemFilePath));
         for (String[] line: Order_ItemViewList){
           if (line[0].equals(editingID) && line[1].equals(editingOrderID)){
             line[2] = updatedValue;
             ProcessSuccessful = true;
            }
          }
        }

        if (ProcessSuccessful == true){
        fops.write2File(Order_ItemViewList,Order_ItemFilePath,Order_Itemclass);
        ArrayList <String[]> Order_ItemDisplayList = (fops.viewOperations(Order_ItemFilePath,Order_Itemclass));
        for (String[] lines: Order_ItemDisplayList){
          model.addRow(lines);
        }
        JOptionPane.showMessageDialog(null, "Data Successfully Edited");
        }else{
        JOptionPane.showMessageDialog(null, "wrong Inputs, Please try again");
        }

    }//GEN-LAST:event_btnSaveChangesOrderItemQuantityActionPerformed

    private void jRadButtonProdTypeNonFragileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadButtonProdTypeNonFragileActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadButtonProdTypeNonFragileActionPerformed

    private void btnAddOrderItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddOrderItemActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)jTable9.getModel();
        String Order_ItemFilePath = "Order_Item.txt";
        String Order_Itemclass = "Order_Item";
        FileOperations fops = new FileOperations();
        boolean addingDataSufficient = true;
        String[] addedOrder_ItemData = new String[3];

        addedOrder_ItemData[0] = txtFieldAddOrderItemID.getText().trim();
        addedOrder_ItemData[1] = txtFieldAddOrderIDforItem.getText().trim();
        addedOrder_ItemData[2] = txtFieldAddOrderItemQuantity.getText().trim();

        for (String items: addedOrder_ItemData){
         if(items.isEmpty()){
            addingDataSufficient = false;
          }
        }

        if(addingDataSufficient == true){
          addedOrder_ItemData[0] = fops.capitalizeEveryWord(addedOrder_ItemData[0],4);

          addedOrder_ItemData[1] = fops.capitalizeEveryWord(addedOrder_ItemData[1],3);

          String IDformatA = "PROD";
          String IDformatB = "ORD";
          if (fops.DuplicateCheckOperation(addedOrder_ItemData[1],"Order.txt","Order") == false && fops.DuplicateCheckOperation(addedOrder_ItemData[0],"Product.txt","Product") == false){

            if (addedOrder_ItemData[0].startsWith(IDformatA.substring(0,4))){
              if(addedOrder_ItemData[1].startsWith(IDformatB.substring(0,3))){
                addingDataSufficient = fops.MultiDuplicateCheckOperation(addedOrder_ItemData[0],addedOrder_ItemData[1],6,Order_ItemFilePath,Order_Itemclass);
              }else{
              addingDataSufficient = false;  }
            }else{
              addingDataSufficient = false;  }
          }else{
          addingDataSufficient = false;   }
        }

        if(addingDataSufficient == true){
          fops.append2File(addedOrder_ItemData,Order_ItemFilePath,Order_Itemclass);
          model.setRowCount(0);
          jLabelPreAddingOrder_ItemValidationStatus.setText("New Data Added!");
        }else{
          jLabelPreAddingOrder_ItemValidationStatus.setText("Wrong Inputs, Please Try Again");
        }

        txtFieldAddOrderItemID.setText("");
        txtFieldAddOrderItemQuantity.setText("");
        txtFieldAddOrderIDforItem.setText("");

    }//GEN-LAST:event_btnAddOrderItemActionPerformed

    private void txtFieldEditItemOrderNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFieldEditItemOrderNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFieldEditItemOrderNoActionPerformed

    private void txtFieldAddOrderIDforItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFieldAddOrderIDforItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFieldAddOrderIDforItemActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      // TODO add your handling code here:
      DefaultTableModel model = (DefaultTableModel)jTable7.getModel();
      model.setRowCount(0);
      String OrderFilePath = "Order.txt";
      String Orderclass = "Order";
      FileOperations fops = new FileOperations();
      boolean addingDataSufficient = true;

      String[] addedOrderData = new String[3];
      addedOrderData[0] = addTxtOrderID.getText().trim();
      addedOrderData[1] = addTxtOrderCustomerID.getText().trim();
      addedOrderData[2] = String.valueOf(java.time.LocalDate.now());
      for (String items: addedOrderData){
        if(items.isEmpty()){
           addingDataSufficient = false;
         }
       }

       String IDformatA = "ORD";
       String IDformatB1 = "IDC";
       String IDformatB2 = "IDA";

      if(addingDataSufficient == true){
         addedOrderData[0] = fops.capitalizeEveryWord(addedOrderData[0],3);
         addedOrderData[1] = fops.capitalizeEveryWord(addedOrderData[1],3);
         if (fops.DuplicateCheckOperation(addedOrderData[0],"Order.txt","Order") == true && (fops.DuplicateCheckOperation(addedOrderData[1],"Customer.txt","Customer") == false || fops.DuplicateCheckOperation(addedOrderData[1],"Admin.txt","Admin") == false )){

           if (addedOrderData[0].startsWith(IDformatA.substring(0,3))){
             if(addedOrderData[1].startsWith(IDformatB1.substring(0,3)) || addedOrderData[1].startsWith(IDformatB2.substring(0,3))){
               addingDataSufficient = fops.MultiDuplicateCheckOperation(addedOrderData[0],addedOrderData[1],6,OrderFilePath,Orderclass);
             }else{
             addingDataSufficient = false;  }
           }else{
             addingDataSufficient = false;  }
         }else{
         addingDataSufficient = false;   }
       }

       if(addingDataSufficient == true){
         fops.append2File(addedOrderData,OrderFilePath,Orderclass);
         model.setRowCount(0);
         jLabelOrderValidationStatus.setText("New Data Added, Now go Save!");
       }else{
         jLabelOrderValidationStatus.setText("Wrong inputs, please try again");
       }

       txtFieldAddOrderItemID.setText("");
       txtFieldAddOrderItemQuantity.setText("");

    }//GEN-LAST:event_jButton2ActionPerformed


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
            java.util.logging.Logger.getLogger(AdminJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addTxtOrderCustomerID;
    private javax.swing.JTextField addTxtOrderID;
    private javax.swing.JButton btnAddOrderItem;
    private javax.swing.JToggleButton btnClearTableAdmin;
    private javax.swing.JToggleButton btnClearTableCust;
    private javax.swing.JToggleButton btnClearTableOrder;
    private javax.swing.JToggleButton btnClearTableOrderItem;
    private javax.swing.JToggleButton btnClearTableProduct;
    private javax.swing.JButton btnCreateNewAdmin;
    private javax.swing.JButton btnCreateNewCustomer;
    private javax.swing.JButton btnCreateNewOrder;
    private javax.swing.JButton btnCreateNewProduct;
    private javax.swing.JButton btnDeleteOrderItem;
    private javax.swing.JButton btnEditOrder;
    private javax.swing.JButton btnSaveChanges;
    private javax.swing.JButton btnSaveChanges2;
    private javax.swing.JButton btnSaveChangesOrderItemQuantity;
    private javax.swing.JButton btnSaveChangesProduct;
    private javax.swing.JButton btnViewCust;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.ButtonGroup buttonGroup6;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JButton jButtonAddNewAdmin;
    private javax.swing.JButton jButtonAddNewCust;
    private javax.swing.JButton jButtonAddNewProduct;
    private javax.swing.JButton jButtonDelSelectedAdmin;
    private javax.swing.JButton jButtonDelSelectedCust;
    private javax.swing.JButton jButtonDelSelectedProduct;
    private javax.swing.JButton jButtonSaveAdminData;
    private javax.swing.JButton jButtonSaveCustData;
    private javax.swing.JButton jButtonSaveProductData;
    private javax.swing.JButton jButtonSearchCust;
    private javax.swing.JButton jButtonSearchOrder;
    private javax.swing.JButton jButtonSearchOrderItem;
    private javax.swing.JButton jButtonSearchProduct;
    private javax.swing.JButton jButtonViewAllOrderItem;
    private javax.swing.JButton jButtonViewAllOrders;
    private javax.swing.JButton jButtonViewAllProducts;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelOrderValidationStatus;
    private javax.swing.JLabel jLabelPreAddingAdminValidationStatus;
    private javax.swing.JLabel jLabelPreAddingAdminValidationStatus1;
    private javax.swing.JLabel jLabelPreAddingCustValidationStatus;
    private javax.swing.JLabel jLabelPreAddingOrder_ItemValidationStatus;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JPanel jPanel34;
    private javax.swing.JPanel jPanel35;
    private javax.swing.JPanel jPanel36;
    private javax.swing.JPanel jPanel37;
    private javax.swing.JPanel jPanel38;
    private javax.swing.JPanel jPanel39;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel40;
    private javax.swing.JPanel jPanel41;
    private javax.swing.JPanel jPanel42;
    private javax.swing.JPanel jPanel43;
    private javax.swing.JPanel jPanel44;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JRadioButton jRadButtonProdTypeFragile;
    private javax.swing.JRadioButton jRadButtonProdTypeNonFragile;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTable jTable5;
    private javax.swing.JTable jTable6;
    private javax.swing.JTable jTable7;
    private javax.swing.JTable jTable9;
    private javax.swing.JTextField jTextFieldNewAdminAddress;
    private javax.swing.JTextField jTextFieldNewAdminFName;
    private javax.swing.JTextField jTextFieldNewAdminID;
    private javax.swing.JTextField jTextFieldNewAdminLName;
    private javax.swing.JTextField jTextFieldNewAdminPassword;
    private javax.swing.JTextField jTextFieldNewAdminPosition;
    private javax.swing.JTextField jTextFieldNewCustAddress;
    private javax.swing.JTextField jTextFieldNewCustEmail;
    private javax.swing.JTextField jTextFieldNewCustFName;
    private javax.swing.JTextField jTextFieldNewCustHP;
    private javax.swing.JTextField jTextFieldNewCustID;
    private javax.swing.JTextField jTextFieldNewCustLName;
    private javax.swing.JTextField jTextFieldNewCustPassword;
    private javax.swing.JTextField jTextFieldNewProdBrand;
    private javax.swing.JTextField jTextFieldNewProdName;
    private javax.swing.JTextField jTextFieldNewProdNo;
    private javax.swing.JTextField jTextFieldNewProdPrice;
    private javax.swing.JTextField jTextFieldNewProdStock;
    private javax.swing.JLabel lblEdit;
    private javax.swing.JLabel lblEdit1;
    private javax.swing.JLabel lblEdit2;
    private javax.swing.JLabel lblEditAttribute;
    private javax.swing.JLabel lblEditAttribute1;
    private javax.swing.JLabel lblEditAttribute2;
    private javax.swing.JLabel lblEditAttributeLabel;
    private javax.swing.JLabel lblEditLabel;
    private javax.swing.JLabel lblEditNewData;
    private javax.swing.JLabel lblEditNewData1;
    private javax.swing.JLabel lblEditNewData2;
    private javax.swing.JLabel lblEditNewData3;
    private javax.swing.JLabel lblSearchStatus;
    private javax.swing.JLabel lblSearchStatus2;
    private javax.swing.JLabel lblSearchStatus3;
    private javax.swing.JLabel lblSearchStatus4;
    private javax.swing.JLabel lblSearchStatus5;
    private javax.swing.JRadioButton radBtnAdminAddressAtt;
    private javax.swing.JRadioButton radBtnAdminFNameAtt;
    private javax.swing.JRadioButton radBtnAdminLNameAtt;
    private javax.swing.JRadioButton radBtnAdminPassAtt;
    private javax.swing.JRadioButton radBtnAdminPassAtt1;
    private javax.swing.JRadioButton radBtnAdminPosAtt;
    private javax.swing.JRadioButton radBtnCustAddressAtt;
    private javax.swing.JRadioButton radBtnCustEmailAtt;
    private javax.swing.JRadioButton radBtnCustFNameAtt;
    private javax.swing.JRadioButton radBtnCustHPAtt;
    private javax.swing.JRadioButton radBtnCustLNameAtt;
    private javax.swing.JRadioButton radBtnCustPassAtt;
    private javax.swing.JRadioButton radBtnProdBrandAtt1;
    private javax.swing.JRadioButton radBtnProdNameAtt1;
    private javax.swing.JRadioButton radBtnProdPriceAtt1;
    private javax.swing.JRadioButton radBtnProdStockAtt1;
    private javax.swing.JRadioButton radBtnProdTypeAtt1;
    private javax.swing.JTextField searchTxtCustID;
    private javax.swing.JTextField searchTxtIdNo;
    private javax.swing.JTextField searchTxtOrderItemNo;
    private javax.swing.JTextField searchTxtOrderNo;
    private javax.swing.JTextField searchTxtProduct;
    private javax.swing.JTextField txtFieldAddOrderIDforItem;
    private javax.swing.JTextField txtFieldAddOrderItemID;
    private javax.swing.JTextField txtFieldAddOrderItemQuantity;
    private javax.swing.JTextField txtFieldEdit;
    private javax.swing.JTextField txtFieldEdit2;
    private javax.swing.JTextField txtFieldEditItemOrderNo;
    private javax.swing.JTextField txtFieldEditNewData;
    private javax.swing.JTextField txtFieldEditNewData2;
    private javax.swing.JTextField txtFieldEditNewDataProduct;
    private javax.swing.JTextField txtFieldEditNewOrderItemQuantity;
    private javax.swing.JTextField txtFieldEditOrderItem;
    private javax.swing.JTextField txtFieldEditableProductNumber1;
    // End of variables declaration//GEN-END:variables

    private static class jTabbedPane2 {

        private static void setSelectedIndex(int i) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
}
