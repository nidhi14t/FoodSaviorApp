/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.DistributorAdminRole;

import Business.BusinessModel;
import Business.DeliveryMan.DeliveryMan;
import Business.Role.DeliveryManRole;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nidhitiwari
 */
public class ManageDeliveryMan extends javax.swing.JPanel {

    /**
     * Creates new form ManageDeliveryMan
     */
    private JPanel userProcessContainer;
    private BusinessModel business;
    private UserAccount user;
    public ManageDeliveryMan(JPanel userProcessContainer, BusinessModel business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.business = business;
        populateManageDeliveryManTable();
        btnConfirm.setEnabled(false);
    }
    
    private void populateManageDeliveryManTable() {
        DefaultTableModel model = (DefaultTableModel) tblManageDeli.getModel();
        
        model.setRowCount(0);
        
        for (UserAccount user : business.getUserAccountDirectory().getUserAccountList()) {
            if ("Business.Role.DeliveryManRole".equals(user.getRole().getClass().getName())) {
                Object[] row = new Object[3];
               
                row[0] = user.getName();
                row[1] = user.getUsername();
                row[2] = user.getPassword();
                
                model.addRow(row);
            }
            
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

        btnDelete = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        lblManageCustomerTitle = new javax.swing.JLabel();
        lblRestaurantName = new javax.swing.JLabel();
        lblRestaurantUsername = new javax.swing.JLabel();
        lblRestaurantPassword = new javax.swing.JLabel();
        txtDeliveryManName = new javax.swing.JTextField();
        txtDeliveryManUserName = new javax.swing.JTextField();
        txtDeliveryManPassword = new javax.swing.JTextField();
        btnUpdate = new javax.swing.JButton();
        btnSubmit = new javax.swing.JButton();
        btnConfirm = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblManageDeli = new javax.swing.JTable();

        btnDelete.setBackground(new java.awt.Color(204, 0, 0));
        btnDelete.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnBack.setBackground(new java.awt.Color(0, 153, 255));
        btnBack.setFont(new java.awt.Font("Lucida Grande", 3, 13)); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        lblManageCustomerTitle.setFont(new java.awt.Font("Lucida Grande", 3, 18)); // NOI18N
        lblManageCustomerTitle.setText("Manage Delivery Man");

        lblRestaurantName.setText("Delivery Man Name");

        lblRestaurantUsername.setText("Username");

        lblRestaurantPassword.setText("Password");

        btnUpdate.setBackground(new java.awt.Color(0, 153, 255));
        btnUpdate.setFont(new java.awt.Font("Lucida Grande", 3, 13)); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnSubmit.setBackground(new java.awt.Color(0, 153, 255));
        btnSubmit.setFont(new java.awt.Font("Lucida Grande", 3, 13)); // NOI18N
        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        btnConfirm.setBackground(new java.awt.Color(0, 153, 255));
        btnConfirm.setFont(new java.awt.Font("Lucida Grande", 3, 13)); // NOI18N
        btnConfirm.setText("Confirm Update");
        btnConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmActionPerformed(evt);
            }
        });

        tblManageDeli.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "DeliveryMan Name", "Username", "Password"
            }
        ));
        jScrollPane1.setViewportView(tblManageDeli);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblRestaurantName)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(lblRestaurantPassword))
                            .addComponent(lblRestaurantUsername))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtDeliveryManName, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                            .addComponent(txtDeliveryManUserName)
                            .addComponent(txtDeliveryManPassword)
                            .addComponent(btnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnBack)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(43, 43, 43)
                                    .addComponent(btnConfirm)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnDelete))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 533, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(177, 177, 177)
                        .addComponent(lblManageCustomerTitle)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(btnBack)
                .addGap(8, 8, 8)
                .addComponent(lblManageCustomerTitle)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblRestaurantName)
                            .addComponent(txtDeliveryManName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblRestaurantUsername)
                            .addComponent(txtDeliveryManUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addComponent(lblRestaurantPassword))
                    .addComponent(txtDeliveryManPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(btnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelete))
                .addContainerGap(91, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblManageDeli.getSelectedRow();
        if(selectedRow>=0){
            int selectionButton = JOptionPane.YES_NO_OPTION;
            int selectionResult = JOptionPane.showConfirmDialog(null, "Confirm Delete ? ","Warning",selectionButton);
            if(selectionResult == JOptionPane.YES_OPTION){
                String username= (String) tblManageDeli.getValueAt(selectedRow, 1);
                String pwd= (String) tblManageDeli.getValueAt(selectedRow, 2);
                UserAccount user=business.getUserAccountDirectory().authenticateUser(username, pwd);
                business.getUserAccountDirectory().deleteUserAccount(user);
                business.getDeliveryManDirectory().deleteDeliveryMan(user.getUsername());

                populateManageDeliveryManTable();
            }
        }else{
            JOptionPane.showMessageDialog(null, "Please select a Row!!");
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:    
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        DistributorAdminWorkAreaJPanel distAdminwjp = (DistributorAdminWorkAreaJPanel) component;
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        int selectRow = tblManageDeli.getSelectedRow();

        if(selectRow>=0){
            String username= (String) tblManageDeli.getValueAt(selectRow, 1);
            String pwd= (String) tblManageDeli.getValueAt(selectRow, 2);
            user=business.getUserAccountDirectory().authenticateUser(username, pwd);

            txtDeliveryManName.setText(user.getName()+"");
            txtDeliveryManUserName.setText(user.getUsername()+"");
            txtDeliveryManPassword.setText(user.getPassword()+"");

        }
        else {
            JOptionPane.showMessageDialog(null,"Please select a row");
        }

        btnSubmit.setEnabled(false);
        btnDelete.setEnabled(false);
        btnUpdate.setEnabled(false);
        btnConfirm.setEnabled(true);
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:
        String name = txtDeliveryManName.getText();
        String username=txtDeliveryManUserName.getText();
        String password=txtDeliveryManPassword.getText();

        Pattern pattern = Pattern.compile("^[a-zA-Z'\\-\\s]+$");

        try {
            if(name==null || name.isEmpty()){

                throw new NullPointerException("Name cannot be empty");

            } else if (pattern.matcher(name).find() == false){

                throw new Exception("Please enter valid  Name");

            }
        } catch(NullPointerException e){

            JOptionPane.showMessageDialog(null, "Name is empty");

            return;

        } catch (Exception e){

            JOptionPane.showMessageDialog(null, "Name is invalid");

            return;
        }

        try {
            if(username==null || username.isEmpty()){

                throw new NullPointerException("User Name cannot be empty");

            } else if (username.length()<3){
                throw new Exception("Please enter valid User Name");

            }
        } catch(NullPointerException e){

            JOptionPane.showMessageDialog(null, "User Name is Empty");

            return;

        }catch (Exception e){

            JOptionPane.showMessageDialog(null, "User Name is invalid");

            return;
        }

        if (business.getUserAccountDirectory().checkIfUsernameIsUnique(username)==false) {
            JOptionPane.showMessageDialog(null,"User Name already exists ");
        }else{

            UserAccount ua1 =business.getUserAccountDirectory().createUserAccount(name, username,password, null, new DeliveryManRole());
            DeliveryMan deliveryMan= business.getDeliveryManDirectory().createDeliveryMan(name, username);
            populateManageDeliveryManTable();
            txtDeliveryManName.setText("");
            txtDeliveryManUserName.setText("");
            txtDeliveryManPassword.setText("");
        }
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void btnConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmActionPerformed
        // TODO add your handling code here:
        String name = txtDeliveryManName.getText();
        String username=txtDeliveryManUserName.getText();
        String password=txtDeliveryManPassword.getText();

        Pattern pattern = Pattern.compile("^[a-zA-Z'\\-\\s]+$");

        try {
            if(name==null || name.isEmpty()){

                throw new NullPointerException("Name cannot be empty");

            } else if (pattern.matcher(name).find() == false){

                throw new Exception("Please enter valid  Name");

            }
        } catch(NullPointerException e){

            JOptionPane.showMessageDialog(null, "Name is empty");

            return;

        } catch (Exception e){

            JOptionPane.showMessageDialog(null, "Name is invalid");

            return;
        }

        try {
            if(username==null || username.isEmpty()){

                throw new NullPointerException("User Name cannot be empty");

            } else if (username.length()<3){
                throw new Exception("Please enter valid User Name");

            }
        } catch(NullPointerException e){

            JOptionPane.showMessageDialog(null, "User Name is Empty");

            return;

        }catch (Exception e){

            JOptionPane.showMessageDialog(null, "User Name is invalid");

            return;
        }

        business.getUserAccountDirectory().updateUserAccount(user,name,username,password);
        populateManageDeliveryManTable();
        btnSubmit.setEnabled(true);
        btnDelete.setEnabled(true);
        btnUpdate.setEnabled(true);
        btnConfirm.setEnabled(false);
        txtDeliveryManName.setText("");
        txtDeliveryManUserName.setText("");
        txtDeliveryManPassword.setText("");
    }//GEN-LAST:event_btnConfirmActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnConfirm;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblManageCustomerTitle;
    private javax.swing.JLabel lblRestaurantName;
    private javax.swing.JLabel lblRestaurantPassword;
    private javax.swing.JLabel lblRestaurantUsername;
    private javax.swing.JTable tblManageDeli;
    private javax.swing.JTextField txtDeliveryManName;
    private javax.swing.JTextField txtDeliveryManPassword;
    private javax.swing.JTextField txtDeliveryManUserName;
    // End of variables declaration//GEN-END:variables
}
