
package DP;

import java.util.*;
import java.io.*;
import java.lang.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class CustomerJFrame extends javax.swing.JFrame {
     public static String CustomerLoginID;

    CustomerJFrame(String LoginID) {
        CustomerLoginID = LoginID;
        initComponents();
    }

    public CustomerJFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelMainMenuCustomerJFrame = new javax.swing.JLabel();
        jButtonHomepageCustomerJFrame = new javax.swing.JButton();
        jButtonManageOrderCustomerJFrame = new javax.swing.JButton();
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
        jPanel34 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable5 = new javax.swing.JTable();
        jButtonViewAllProducts = new javax.swing.JButton();
        btnClearTableProduct = new javax.swing.JToggleButton();
        jLabel11 = new javax.swing.JLabel();
        jPanel32 = new javax.swing.JPanel();
        jButtonSearchProduct = new javax.swing.JButton();
        searchTxtProduct = new javax.swing.JTextField();
        lblSearchStatus3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel44 = new javax.swing.JLabel();
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
        jPanel40 = new javax.swing.JPanel();
        jScrollPane9 = new javax.swing.JScrollPane();
        jTable9 = new javax.swing.JTable();
        jButtonViewAllOrderItem = new javax.swing.JButton();
        btnDeleteOrderItem = new javax.swing.JButton();
        btnClearTableOrderItem = new javax.swing.JToggleButton();
        jPanel44 = new javax.swing.JPanel();
        txtFieldAddOrderItemQuantity = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        txtFieldAddOrderIDforItem = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        txtFieldAddOrderItemID = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        jLabelPreAddingOrder_ItemValidationStatus = new javax.swing.JLabel();
        btnAddOrderItem = new javax.swing.JButton();
        jPanel12 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jPanel21 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jPanel39 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTable7 = new javax.swing.JTable();
        jButtonViewAllOrder = new javax.swing.JButton();
        btnCreateNewOrder = new javax.swing.JButton();
        btnClearTableOrder = new javax.swing.JToggleButton();
        jPanel41 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jLabel37 = new javax.swing.JLabel();
        addTxtOrderID = new javax.swing.JTextField();
        jLabelOrderValidationStatus = new javax.swing.JLabel();
        jPanel37 = new javax.swing.JPanel();
        jButtonSearchOrder = new javax.swing.JButton();
        searchTxtOrderNo = new javax.swing.JTextField();
        lblSearchStatus4 = new javax.swing.JLabel();
        jPanel38 = new javax.swing.JPanel();
        btnEditOrder = new javax.swing.JButton();
        jPanel14 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        jPanel18 = new javax.swing.JPanel();
        jPanel19 = new javax.swing.JPanel();
        jPanel20 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 102, 153));

        jLabelMainMenuCustomerJFrame.setBackground(new java.awt.Color(255, 255, 255));
        jLabelMainMenuCustomerJFrame.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelMainMenuCustomerJFrame.setForeground(new java.awt.Color(255, 255, 255));
        jLabelMainMenuCustomerJFrame.setText("Main Menu");

        jButtonHomepageCustomerJFrame.setBackground(new java.awt.Color(102, 255, 102));
        jButtonHomepageCustomerJFrame.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonHomepageCustomerJFrame.setText("HOMEPAGE");
        jButtonHomepageCustomerJFrame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonHomepageCustomerJFrameActionPerformed(evt);
            }
        });

        jButtonManageOrderCustomerJFrame.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButtonManageOrderCustomerJFrame.setText("MANAGE ORDER");
        jButtonManageOrderCustomerJFrame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonManageOrderCustomerJFrameActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton6.setText("VIEW PRODUCT");
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
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonHomepageCustomerJFrame, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonManageOrderCustomerJFrame, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabelMainMenuCustomerJFrame)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelMainMenuCustomerJFrame)
                .addGap(35, 35, 35)
                .addComponent(jButtonHomepageCustomerJFrame, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonManageOrderCustomerJFrame, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(314, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, 610));

        jTabbedPane2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel5.setBackground(new java.awt.Color(0, 153, 153));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Customer Side");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Account Type       :  Customer");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Customer ID         :");

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
        jLabel42.setText("DATE");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel41)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(343, 343, 343)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 104, Short.MAX_VALUE)))
                        .addGap(242, 242, 242)))
                .addContainerGap())
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton12)
                .addGap(386, 386, 386))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(296, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("0.HOME", jPanel5);

        jPanel11.setBackground(new java.awt.Color(0, 153, 153));

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

        jButtonViewAllProducts.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButtonViewAllProducts.setText("View All Product");
        jButtonViewAllProducts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonViewAllProductsActionPerformed(evt);
            }
        });

        btnClearTableProduct.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
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
                .addGap(290, 290, 290)
                .addComponent(jButtonViewAllProducts)
                .addGap(52, 52, 52)
                .addComponent(btnClearTableProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(296, Short.MAX_VALUE))
            .addComponent(jScrollPane5)
        );
        jPanel34Layout.setVerticalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel34Layout.createSequentialGroup()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonViewAllProducts, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClearTableProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel11.setText("VIEW PRODUCT");

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

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(339, 339, 339)
                        .addComponent(jPanel32, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(363, 363, 363)
                        .addComponent(jLabel11))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jPanel34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 33, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("1.PRODUCT", jPanel11);

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));

        jLabel44.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(255, 255, 255));
        jLabel44.setText("Manage Order Item");

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
                    .addComponent(txtFieldEditNewOrderItemQuantity, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel44)
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel42, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel43, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanel40, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 142, Short.MAX_VALUE)
                                .addComponent(jPanel44, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(160, 160, 160))))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel42, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel43, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel44, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(68, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("2.ORDER ITEM", jPanel2);

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 945, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 623, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("3.?", jPanel12);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 945, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 623, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("4.?", jPanel4);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 945, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 623, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("5.?", jPanel7);

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 945, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 623, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("6.?", jPanel8);

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 945, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 623, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("7.?", jPanel9);

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 945, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 623, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("8.?", jPanel10);

        jPanel21.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 945, Short.MAX_VALUE)
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 623, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("9.?", jPanel21);

        jPanel13.setBackground(new java.awt.Color(0, 153, 153));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel12.setText("ORDER MANAGEMENT");

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

        jButtonViewAllOrder.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButtonViewAllOrder.setText("View All Orders");
        jButtonViewAllOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonViewAllOrderActionPerformed(evt);
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
                .addComponent(jButtonViewAllOrder)
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
                    .addComponent(jButtonViewAllOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                        .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addGap(27, 27, 27))
        );

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

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(317, 317, 317)
                .addComponent(jLabel12)
                .addContainerGap(360, Short.MAX_VALUE))
            .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel13Layout.createSequentialGroup()
                    .addGap(12, 12, 12)
                    .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jPanel41, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel37, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel38, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGap(40, 40, 40)
                    .addComponent(jPanel39, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(13, Short.MAX_VALUE)))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(566, Short.MAX_VALUE))
            .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel13Layout.createSequentialGroup()
                    .addGap(100, 100, 100)
                    .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel13Layout.createSequentialGroup()
                            .addComponent(jPanel37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jPanel41, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jPanel38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jPanel39, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addContainerGap(207, Short.MAX_VALUE)))
        );

        jTabbedPane2.addTab("10.ORDER", jPanel13);

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 945, Short.MAX_VALUE)
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 623, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("11.?", jPanel14);

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 945, Short.MAX_VALUE)
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 623, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("12.?", jPanel15);

        jPanel16.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 945, Short.MAX_VALUE)
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 623, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("13.?", jPanel16);

        jPanel17.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 945, Short.MAX_VALUE)
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 623, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("14.?", jPanel17);

        jPanel18.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 945, Short.MAX_VALUE)
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 623, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("15.?", jPanel18);

        jPanel19.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 945, Short.MAX_VALUE)
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 623, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("16.?", jPanel19);

        jPanel20.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 945, Short.MAX_VALUE)
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 623, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("17.?", jPanel20);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 945, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 623, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("18.?", jPanel6);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 945, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 623, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("19.?", jPanel3);

        getContentPane().add(jTabbedPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, -40, 950, 650));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonHomepageCustomerJFrameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonHomepageCustomerJFrameActionPerformed
        // TODO add your handling code here:
        jTabbedPane2.setSelectedIndex(0);
        jLabel9.setText(CustomerLoginID);
        jLabel42.setText(String.valueOf(java.time.LocalDate.now()));
    }//GEN-LAST:event_jButtonHomepageCustomerJFrameActionPerformed

    private void jButtonManageOrderCustomerJFrameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonManageOrderCustomerJFrameActionPerformed
        // TODO add your handling code here:
        jTabbedPane2.setSelectedIndex(10);
    }//GEN-LAST:event_jButtonManageOrderCustomerJFrameActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
        System.exit(0); // stop program
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        jTabbedPane2.setSelectedIndex(1);
        lblSearchStatus3.setText("Enter Keyword To Search");
        DefaultTableModel model = (DefaultTableModel)jTable5.getModel();
        model.setRowCount(0);
    }//GEN-LAST:event_jButton6ActionPerformed

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

    private void btnClearTableProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearTableProductActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)jTable5.getModel();
        model.setRowCount(0);
    }//GEN-LAST:event_btnClearTableProductActionPerformed

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

    private void jButtonViewAllOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonViewAllOrderActionPerformed
        // TODO add your handling code here:

        DefaultTableModel model = (DefaultTableModel)jTable7.getModel();
        model.setRowCount(0);
        String Orderclass = "Order";
        String OrderFilePath = "Order.txt";
        FileOperations fops = new FileOperations();
        ArrayList <String[]> OrdertempList = (fops.viewOperations(OrderFilePath,Orderclass));
        for (String[] lines: OrdertempList){
            if (lines[1].equals(CustomerLoginID)){
            model.addRow(lines);
          }
        }
    }//GEN-LAST:event_jButtonViewAllOrderActionPerformed

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
        addedOrderData[1] = CustomerLoginID;
        addedOrderData[2] = String.valueOf(java.time.LocalDate.now());

        for (String items: addedOrderData){
            if(items.isEmpty()){
              addingDataSufficient = false;
              }
        }

        String IDformatA = "ORD";
        String IDformatB1 = "IDC";
        String errorMessage = "Wrong inputs, please try again";

        if(addingDataSufficient == true){
            addedOrderData[0] = fops.capitalizeEveryWord(addedOrderData[0],3);
            if (fops.DuplicateCheckOperation(addedOrderData[0],"Order.txt","Order") == true){
                if (addedOrderData[0].startsWith(IDformatA.substring(0,3))){
                  addingDataSufficient = fops.MultiDuplicateCheckOperation(addedOrderData[0],addedOrderData[1],6,OrderFilePath,Orderclass);
                }else{
                    addingDataSufficient = false;  }
            }else{
              errorMessage = "ID Already Exists for a User, Try Again";
              addingDataSufficient = false;   }
        }
        if(addingDataSufficient == true){
            fops.append2File(addedOrderData,OrderFilePath,Orderclass);
            model.setRowCount(0);
            jLabelOrderValidationStatus.setText("New Data Added, Now go Save!");
        }else{
            jLabelOrderValidationStatus.setText(errorMessage);
        }
        txtFieldAddOrderItemID.setText("");
        txtFieldAddOrderItemQuantity.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed

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
          if (lines[1].equals(CustomerLoginID)){
            model.addRow(lines);
            processSuccessful = true;
          }
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
        jTabbedPane2.setSelectedIndex(2);
        DefaultTableModel model = (DefaultTableModel)jTable9.getModel();
        model.setRowCount(0);
        jLabelPreAddingOrder_ItemValidationStatus.setText("* Validation Status*");
    }//GEN-LAST:event_btnEditOrderActionPerformed

    private void jButtonSearchOrderItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSearchOrderItemActionPerformed
        // TODO add your handling code here:

        DefaultTableModel model = (DefaultTableModel)jTable9.getModel();
        model.setRowCount(0);
        String searchInputOrder_Item = searchTxtOrderItemNo.getText().trim();
        String Order_Itemclass = "Order_Item";
        String Order_ItemFilePath = "Order_Item.txt";
        FileOperations fops = new FileOperations();
        boolean processSuccessful = false;

        ArrayList <String> CustomerOrderIDs = new ArrayList <String>() ;
        String Orderclass = "Order";
        String OrderFilePath = "Order.txt";
        ArrayList <String[]> OrdertempList = (fops.viewOperations(OrderFilePath,Orderclass));
        for (String[] lines: OrdertempList){
            if (lines[1].equals(CustomerLoginID)){
              CustomerOrderIDs.add(lines[0]);
            }
        }

        ArrayList <String[]> Order_ItemtempList = (fops.objectBasedSearchOperations(searchInputOrder_Item,Order_ItemFilePath,Order_Itemclass));
        for (String[] lines: Order_ItemtempList){
         if (CustomerOrderIDs.contains(lines[6])){
            model.addRow(lines);
            processSuccessful = true;
         }
        }
        if (processSuccessful == true){
            searchTxtOrderItemNo.setText("");
            lblSearchStatus5.setText("Search Result Found!");
        }else if(processSuccessful == false){
            searchTxtOrderItemNo.setText("");
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


            ArrayList <String> CustomerOrderIDs = new ArrayList <String>() ;
            String Orderclass = "Order";
            String OrderFilePath = "Order.txt";
            ArrayList <String[]> OrdertempList = (fops.viewOperations(OrderFilePath,Orderclass));
            for (String[] lines: OrdertempList){
                if (lines[1].equals(CustomerLoginID)){
                  CustomerOrderIDs.add(lines[0]);
                }
            }

            Order_ItemViewList = (fops.viewOperations(Order_ItemFilePath));
            for (String[] line: Order_ItemViewList){
                if (CustomerOrderIDs.contains(line[1]) && line[0].equals(editingID) && line[1].equals(editingOrderID)){
                    line[2] = updatedValue;
                    ProcessSuccessful = true;
                }
            }
        }

        if (ProcessSuccessful == true){
            fops.write2File(Order_ItemViewList,Order_ItemFilePath,Order_Itemclass);
            model.setRowCount(0);
            JOptionPane.showMessageDialog(null, "Data Successfully Edited");
        }else{
            JOptionPane.showMessageDialog(null, "wrong Inputs, Please try again");
        }
    }//GEN-LAST:event_btnSaveChangesOrderItemQuantityActionPerformed

    private void txtFieldEditItemOrderNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFieldEditItemOrderNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFieldEditItemOrderNoActionPerformed

    private void jButtonViewAllOrderItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonViewAllOrderItemActionPerformed
        // TODO add your handling code here:

        DefaultTableModel model = (DefaultTableModel)jTable9.getModel();
        model.setRowCount(0);
        String Order_Itemclass = "Order_Item";
        String Order_ItemFilePath = "Order_Item.txt";
        FileOperations fops = new FileOperations();

        ArrayList <String> CustomerOrderIDs = new ArrayList <String>() ;
        String Orderclass = "Order";
        String OrderFilePath = "Order.txt";
        ArrayList <String[]> OrdertempList = (fops.viewOperations(OrderFilePath,Orderclass));
        for (String[] lines: OrdertempList){
            if (lines[1].equals(CustomerLoginID)){
              CustomerOrderIDs.add(lines[0]);
            }
        }

        ArrayList <String[]> Order_ItemtempList = (fops.viewOperations(Order_ItemFilePath,Order_Itemclass));
        for (String[] lines: Order_ItemtempList){
          if (CustomerOrderIDs.contains(lines[6])){
            model.addRow(lines);
          }
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

    private void txtFieldAddOrderIDforItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFieldAddOrderIDforItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFieldAddOrderIDforItemActionPerformed

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


            ArrayList <String> CustomerOrderIDs = new ArrayList <String>() ;
            String Orderclass = "Order";
            String OrderFilePath = "Order.txt";
            ArrayList <String[]> OrdertempList = (fops.viewOperations(OrderFilePath,Orderclass));
            for (String[] lines: OrdertempList){
                if (lines[1].equals(CustomerLoginID)){
                  CustomerOrderIDs.add(lines[0]);
                }
            }

            String IDformatA = "PROD";
            String IDformatB = "ORD";
            if (fops.DuplicateCheckOperation(addedOrder_ItemData[1],"Order.txt","Order") == false && fops.DuplicateCheckOperation(addedOrder_ItemData[0],"Product.txt","Product") == false){
                if (addedOrder_ItemData[0].startsWith(IDformatA.substring(0,4))){
                    if(addedOrder_ItemData[1].startsWith(IDformatB.substring(0,3))){
                      if (CustomerOrderIDs.contains(addedOrder_ItemData[1])){
                        addingDataSufficient = fops.MultiDuplicateCheckOperation(addedOrder_ItemData[0],addedOrder_ItemData[1],6,Order_ItemFilePath,Order_Itemclass);
                      }else{
                          addingDataSufficient = false;  }
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
            java.util.logging.Logger.getLogger(CustomerJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addTxtOrderID;
    private javax.swing.JButton btnAddOrderItem;
    private javax.swing.JToggleButton btnClearTableOrder;
    private javax.swing.JToggleButton btnClearTableOrderItem;
    private javax.swing.JToggleButton btnClearTableProduct;
    private javax.swing.JButton btnCreateNewOrder;
    private javax.swing.JButton btnDeleteOrderItem;
    private javax.swing.JButton btnEditOrder;
    private javax.swing.JButton btnSaveChangesOrderItemQuantity;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButtonHomepageCustomerJFrame;
    private javax.swing.JButton jButtonManageOrderCustomerJFrame;
    private javax.swing.JButton jButtonSearchOrder;
    private javax.swing.JButton jButtonSearchOrderItem;
    private javax.swing.JButton jButtonSearchProduct;
    private javax.swing.JButton jButtonViewAllOrder;
    private javax.swing.JButton jButtonViewAllOrderItem;
    private javax.swing.JButton jButtonViewAllProducts;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelMainMenuCustomerJFrame;
    private javax.swing.JLabel jLabelOrderValidationStatus;
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
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel34;
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
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTable jTable5;
    private javax.swing.JTable jTable7;
    private javax.swing.JTable jTable9;
    private javax.swing.JLabel lblEdit1;
    private javax.swing.JLabel lblEditAttribute1;
    private javax.swing.JLabel lblEditNewData1;
    private javax.swing.JLabel lblSearchStatus3;
    private javax.swing.JLabel lblSearchStatus4;
    private javax.swing.JLabel lblSearchStatus5;
    private javax.swing.JRadioButton radBtnAdminPassAtt1;
    private javax.swing.JTextField searchTxtOrderItemNo;
    private javax.swing.JTextField searchTxtOrderNo;
    private javax.swing.JTextField searchTxtProduct;
    private javax.swing.JTextField txtFieldAddOrderIDforItem;
    private javax.swing.JTextField txtFieldAddOrderItemID;
    private javax.swing.JTextField txtFieldAddOrderItemQuantity;
    private javax.swing.JTextField txtFieldEditItemOrderNo;
    private javax.swing.JTextField txtFieldEditNewOrderItemQuantity;
    private javax.swing.JTextField txtFieldEditOrderItem;
    // End of variables declaration//GEN-END:variables
}
