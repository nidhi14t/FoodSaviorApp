/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.DistributorAdminRole;

import Business.BusinessModel;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;
/**
 *
 * @author karpe.s@northeastern.edu
 */
public class DistributorAdminWorkAreaJPanel extends javax.swing.JPanel {
    
    JPanel userProcessContainer;
    BusinessModel business;
    UserAccount account;
    
    public DistributorAdminWorkAreaJPanel(JPanel userProcessContainer,
            UserAccount account,
            BusinessModel business) {
            initComponents();
            this.userProcessContainer = userProcessContainer;
            this.account = account;
            this.business = business;
            distnamelabel.setText(account.getName());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        distWAlabel = new javax.swing.JLabel();
        distLabel = new javax.swing.JLabel();
        distnamelabel = new javax.swing.JLabel();
        manageLogbtn = new javax.swing.JButton();
        manageDelManbtn = new javax.swing.JButton();
        manageOrderbtn = new javax.swing.JButton();
        manageDistInfoBtn = new javax.swing.JButton();

        distWAlabel.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        distWAlabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        distWAlabel.setText("Distributor Work Area ");

        distLabel.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        distLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        distLabel.setText("Distributor");

        distnamelabel.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        distnamelabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        distnamelabel.setText("<value>");

        manageLogbtn.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        manageLogbtn.setText("Manage Logistics");
        manageLogbtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        manageLogbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageLogbtnActionPerformed(evt);
            }
        });

        manageDelManbtn.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        manageDelManbtn.setText("Manage Delivery Man");
        manageDelManbtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        manageDelManbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageDelManbtnActionPerformed(evt);
            }
        });

        manageOrderbtn.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        manageOrderbtn.setText("Manage Order");
        manageOrderbtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        manageOrderbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageOrderbtnActionPerformed(evt);
            }
        });

        manageDistInfoBtn.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        manageDistInfoBtn.setText("Manage Distributor Info");
        manageDistInfoBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        manageDistInfoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageDistInfoBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(214, 214, 214)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(distLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(57, 57, 57)
                                .addComponent(distnamelabel, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(distWAlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(272, 272, 272)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(manageOrderbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(manageLogbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(manageDistInfoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(283, 283, 283))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(272, 272, 272)
                    .addComponent(manageDelManbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(336, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(distWAlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(distLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(distnamelabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addComponent(manageOrderbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72)
                .addComponent(manageLogbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(manageDistInfoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(191, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(217, 217, 217)
                    .addComponent(manageDelManbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(305, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void manageDelManbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageDelManbtnActionPerformed
        ManageDeliveryMan manageInfo=new ManageDeliveryMan(userProcessContainer,business);
        userProcessContainer.add("Manage Delivery Man",manageInfo);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageDelManbtnActionPerformed

    private void manageLogbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageLogbtnActionPerformed
        ManageLogistics manageItem=new ManageLogistics(userProcessContainer,account,business);
        userProcessContainer.add("Manage Logistics",manageItem);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageLogbtnActionPerformed

    private void manageOrderbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageOrderbtnActionPerformed
        // TODO add your handling code here:
        ManageOrder manageOrder=new ManageOrder(userProcessContainer,account,business);
        userProcessContainer.add("Manage Restaurants",manageOrder);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageOrderbtnActionPerformed

    private void manageDistInfoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageDistInfoBtnActionPerformed
        // TODO add your handling code here:
        DistributorInfo manageInfo=new DistributorInfo(userProcessContainer,account,business);
        userProcessContainer.add("Manage Restaurants",manageInfo);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        
    }//GEN-LAST:event_manageDistInfoBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel distLabel;
    private javax.swing.JLabel distWAlabel;
    private javax.swing.JLabel distnamelabel;
    private javax.swing.JButton manageDelManbtn;
    private javax.swing.JButton manageDistInfoBtn;
    private javax.swing.JButton manageLogbtn;
    private javax.swing.JButton manageOrderbtn;
    // End of variables declaration//GEN-END:variables
}
