/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.DistributorAdminRole;

import Business.BusinessModel;
import Business.Customer.Customer;
import Business.DiscardedItem.DiscardedItem;
import Business.UserAccount.UserAccount;
import Business.WarehouseOrder.WarehouseOrder;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author karpe.s@northeastern.edu
 */
public class ManageOrderDetails extends javax.swing.JPanel {
    
    private JPanel userProcessContainer;
    private UserAccount account;
    WarehouseOrder order;
    BusinessModel business;

    /**
     * Creates new form ManageSellingItems
     */
    public ManageOrderDetails(JPanel userProcessContainer, UserAccount account, WarehouseOrder order, BusinessModel business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.order = order;
        this.business = business;
        populateTable();
    }
    
    private void populateTable() {
    lblManageOrderDetails.setText("Order ID:"+order.getOrderID());
     DefaultTableModel tblModel = (DefaultTableModel) tblManageOrder.getModel();
     tblModel.setRowCount(0);

     Object[] row = new Object[2];
            for(DiscardedItem item:order.getWarehouseOrder()){
                 row[0] = item;
                 row[1] = item.getPrice();
                 tblModel.addRow(row);
      }  
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblManageOrderDetailsLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblManageOrder = new javax.swing.JTable();
        btnStatus = new javax.swing.JButton();
        backbtn = new javax.swing.JButton();
        lblManageOrderDetails = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        lblManageOrderDetailsLabel.setFont(new java.awt.Font("Times New Roman", 1, 32)); // NOI18N
        lblManageOrderDetailsLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblManageOrderDetailsLabel.setText("Manage Order Details");

        tblManageOrder.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Items", "Price"
            }
        ));
        jScrollPane1.setViewportView(tblManageOrder);

        btnStatus.setBackground(new java.awt.Color(0, 153, 255));
        btnStatus.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnStatus.setText("Ready To Deliver");
        btnStatus.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStatusActionPerformed(evt);
            }
        });

        backbtn.setBackground(new java.awt.Color(0, 153, 255));
        backbtn.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        backbtn.setText("Back");
        backbtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        backbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbtnActionPerformed(evt);
            }
        });

        lblManageOrderDetails.setFont(new java.awt.Font("Times New Roman", 1, 32)); // NOI18N
        lblManageOrderDetails.setText("<value>");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/order.png"))); // NOI18N
        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addComponent(btnStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 538, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70)))
                .addGap(0, 19, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(backbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(lblManageOrderDetailsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblManageOrderDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(backbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(98, 98, 98))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblManageOrderDetailsLabel)
                            .addComponent(lblManageOrderDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(51, 51, 51)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(btnStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1))
                .addGap(107, 107, 107))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStatusActionPerformed
        // TODO add your handling code here:
        order.setStatus("Ready to Deliver");
        for(Customer cust:business.getCustomerDirectory().getCustomerList()){
            if(order.getCustomerName().equals(cust.getUsername())){
                for(WarehouseOrder order : cust.getOrderList()){
                    order.setStatus("Ready to Deliver");
                }
            }
        }
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnStatusActionPerformed

    private void backbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbtnActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backbtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backbtn;
    private javax.swing.JButton btnStatus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblManageOrderDetails;
    private javax.swing.JLabel lblManageOrderDetailsLabel;
    private javax.swing.JTable tblManageOrder;
    // End of variables declaration//GEN-END:variables
}
