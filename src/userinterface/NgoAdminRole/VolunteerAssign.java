/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.NgoAdminRole;

import Business.BusinessModel;
import Business.DeliveryMan.DeliveryMan;
import Business.NGO.NGO;
import Business.UserAccount.UserAccount;
import Business.Volunteer.Volunteer;
import Business.WarehouseOrder.WarehouseOrder;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nidhitiwari
 */
public class VolunteerAssign extends javax.swing.JPanel {
    private JPanel userProcessContainer;
    private UserAccount account;
    WarehouseOrder order;
    BusinessModel business;
    String orgName;
    /**
     * Creates new form VolunteerAssign
     */
    
    public VolunteerAssign(JPanel userProcessContainer, UserAccount account, WarehouseOrder order, BusinessModel business, String orgName) {
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.order = order;
        this.business = business;
        this.orgName = orgName;
        initComponents();
        populateOrderVolunteerTable();
    }
    
    private void populateOrderVolunteerTable() {
        jLabel1.setText("Order ID:"+ order.getOrderID());
        DefaultTableModel model = (DefaultTableModel) tblVolunteerAssign.getModel();
        
        model.setRowCount(0);
        
        for(Volunteer volt:business.getVolunteerDirectory().getVolunteerList()){
               Object[] row = new Object[1];
                row[0] = volt; 
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

        btnAssignOrder = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblVolunteerAssign = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblAssignDeliveryMan = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        btnAssignOrder.setBackground(new java.awt.Color(0, 153, 255));
        btnAssignOrder.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnAssignOrder.setText("Assign Order to Deliver");
        btnAssignOrder.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAssignOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignOrderActionPerformed(evt);
            }
        });

        tblVolunteerAssign.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Volunteer Name"
            }
        ));
        jScrollPane1.setViewportView(tblVolunteerAssign);

        btnBack.setBackground(new java.awt.Color(0, 153, 255));
        btnBack.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnBack.setText("Back");
        btnBack.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 32)); // NOI18N
        jLabel1.setText("<value>");

        lblAssignDeliveryMan.setFont(new java.awt.Font("Times New Roman", 1, 32)); // NOI18N
        lblAssignDeliveryMan.setText("Volunteer Assignation");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesNgo/volunteer_image.jpg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(151, 151, 151)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblAssignDeliveryMan)
                            .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 446, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addComponent(btnAssignOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2))
                .addGap(50, 50, 50))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(lblAssignDeliveryMan)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(btnAssignOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAssignOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignOrderActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblVolunteerAssign.getSelectedRow();
        if(selectedRow<0){
            JOptionPane.showMessageDialog(null,"Please select a row from the table");
        }
        else
        {

            Volunteer volt  = (Volunteer)tblVolunteerAssign.getValueAt(selectedRow, 0);
            volt.getOrderList().add(order);
            order.setStatus("Assigned to Volunteeer");
            order.setOrgName(orgName);

//            for(NGO ngo:business.getNgoDirectory().getNGOList()){
//                System.out.print("order.getNgoName() " + order.getNgoName());
//                System.out.print("order.getNgoName() " + ngo.getUsername());
//                System.out.print("orgName " + orgName);
//                if(order.getNgoName().equals(ngo.getUsername())){
//                    for(WarehouseOrder order : ngo.getOrderList()){
//                        order.setStatus("Assigned to Volunteer");
//                        order.setOrgName(orgName);
//                    }
//                }
//            }
            userProcessContainer.remove(this);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.previous(userProcessContainer);

        }
    }//GEN-LAST:event_btnAssignOrderActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAssignOrder;
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAssignDeliveryMan;
    private javax.swing.JTable tblVolunteerAssign;
    // End of variables declaration//GEN-END:variables
}
