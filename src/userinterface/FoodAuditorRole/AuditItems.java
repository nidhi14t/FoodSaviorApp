/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.FoodAuditorRole;

import Business.BusinessModel;
import Business.DiscardedItem.DiscardedItem;
import Business.UserAccount.UserAccount;
import Business.Warehouse.Warehouse;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nidhitiwari
 */
public class AuditItems extends javax.swing.JPanel {
    
    private JPanel userProcessContainer;
    double sum=0;
    private UserAccount userAccount;
    Warehouse ware;
    BusinessModel business;
    ArrayList<DiscardedItem> items=new ArrayList<DiscardedItem>();

    /**
     * Creates new form AuditItems
     */
    public AuditItems(JPanel userProcessContainer, UserAccount account, BusinessModel business, Warehouse ware) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.ware=ware;
        this.business=business;
        this.userAccount = account;
        populateTable();
        lblRestaurantName.setText(ware.getWarehouseName());
       
    }
    
    public void populateTable(){
            DefaultTableModel model = (DefaultTableModel) tblItems.getModel();
        
            model.setRowCount(0);
                Object[] row = new Object[2];
                for(DiscardedItem item:ware.getItem()){
                     row[0] = item;
                     row[1] = item.isGoodToConsume();
                     model.addRow(row);
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

        lblPlaceOrderTitle = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblItems = new javax.swing.JTable();
        lblRestaurantName = new javax.swing.JLabel();
        btnGoodToConsume = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        btnNotGoodToConsume = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        lblPlaceOrderTitle.setFont(new java.awt.Font("Times New Roman", 1, 32)); // NOI18N
        lblPlaceOrderTitle.setText("Add Order Items");

        tblItems.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Item Name", "Good To Consume"
            }
        ));
        jScrollPane2.setViewportView(tblItems);

        lblRestaurantName.setFont(new java.awt.Font("Times New Roman", 1, 32)); // NOI18N
        lblRestaurantName.setText("<Name>");

        btnGoodToConsume.setBackground(new java.awt.Color(0, 153, 255));
        btnGoodToConsume.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnGoodToConsume.setText("Good To Go");
        btnGoodToConsume.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGoodToConsumeActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(0, 153, 255));
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnNotGoodToConsume.setBackground(new java.awt.Color(0, 153, 255));
        btnNotGoodToConsume.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnNotGoodToConsume.setText("Not Good");
        btnNotGoodToConsume.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNotGoodToConsumeActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/food ok.JPG"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnGoodToConsume, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(76, 76, 76)
                        .addComponent(btnNotGoodToConsume, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(258, 258, 258)
                        .addComponent(lblPlaceOrderTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(lblRestaurantName, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(jButton1)))
                .addContainerGap(116, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPlaceOrderTitle)
                    .addComponent(lblRestaurantName))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnGoodToConsume, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnNotGoodToConsume, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel1))
                .addContainerGap(125, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnGoodToConsumeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGoodToConsumeActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblItems.getSelectedRow();
        if(selectedRow<0){
            JOptionPane.showMessageDialog(null,"Please select a row from the table","Warning",JOptionPane.WARNING_MESSAGE);
        }
        else{
            DiscardedItem item=(DiscardedItem)tblItems.getValueAt(selectedRow, 0);
            item.setGoodToConsume(true);

            populateTable();

        }
    }//GEN-LAST:event_btnGoodToConsumeActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        AuditWarehouseItems awi = (AuditWarehouseItems) component;
        awi.populateOrderRequestTable();
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnNotGoodToConsumeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNotGoodToConsumeActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblItems.getSelectedRow();
        if(selectedRow<0){
            JOptionPane.showMessageDialog(null,"Please select a row from the table","Warning",JOptionPane.WARNING_MESSAGE);
        }
        else{
            DiscardedItem item=(DiscardedItem)tblItems.getValueAt(selectedRow, 0);
            item.setGoodToConsume(false);

            populateTable();

        }
    }//GEN-LAST:event_btnNotGoodToConsumeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGoodToConsume;
    private javax.swing.JButton btnNotGoodToConsume;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblPlaceOrderTitle;
    private javax.swing.JLabel lblRestaurantName;
    private javax.swing.JTable tblItems;
    // End of variables declaration//GEN-END:variables
}
