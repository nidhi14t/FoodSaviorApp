/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

import Business.BusinessModel;
import Business.FoodAuditor.FoodAuditor;
import Business.Role.FoodAuditorRole;
import Business.UserAccount.UserAccount;
import SendEmail.SendEmail;
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
public class ManageFoodAuditor extends javax.swing.JPanel {
    
    private JPanel userProcessContainer;
    private BusinessModel business;
    UserAccount user;
    /**
     * Creates new form ManageFoodAuditor
     */ 
    public ManageFoodAuditor(JPanel userProcessContainer, BusinessModel business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.business = business;
        btnConfirm.setEnabled(false);
        populateManageFATable();
    }
    
    private void populateManageFATable() {
        DefaultTableModel model = (DefaultTableModel) tblManageFoodAuditor.getModel();
        
        model.setRowCount(0);
        
        try {
            for (UserAccount user : business.getUserAccountDirectory().getUserAccountList()) {
            
            for (FoodAuditor fa:business.getFoodAuditorDirectory().getFoodAuditorList()) {
            if ("Business.Role.FoodAuditorRole".equals(user.getRole().getClass().getName()) && fa.getFoodAuditorUserName().equals(user.getUsername())) {
                Object[] row = new Object[5];
               
                row[0] = user.getName();
                row[1] = user.getUsername();
                row[2] = user.getPassword();
                row[3] = fa.getFoodAuditorContact();
                row[4] = fa.getFoodAuditorAddress();
                
                model.addRow(row);
            }
            }
            
        }
        } catch (Exception e) {
            System.out.println("error " + e);
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

        btnSubmit = new javax.swing.JButton();
        txtfaPassword = new javax.swing.JTextField();
        lblfaName = new javax.swing.JLabel();
        lblfaAddress = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblManageFoodAuditor = new javax.swing.JTable();
        txtfaAddress = new javax.swing.JTextField();
        lblfaContact = new javax.swing.JLabel();
        txtfaName = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();
        lblfaUsername = new javax.swing.JLabel();
        txtfaContact = new javax.swing.JTextField();
        btnUpdate = new javax.swing.JButton();
        txtfaUserName = new javax.swing.JTextField();
        btnConfirm = new javax.swing.JButton();
        lblfaPassword = new javax.swing.JLabel();
        lblManageNGOTitle = new javax.swing.JLabel();
        btnDelete = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        btnSubmit.setBackground(new java.awt.Color(0, 153, 255));
        btnSubmit.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnSubmit.setText("Submit");
        btnSubmit.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        lblfaName.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblfaName.setText("Food Auditor Company Name");

        lblfaAddress.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblfaAddress.setText("Address");

        tblManageFoodAuditor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Food Auditor Name", "Username", "Password", "Contact", "Address"
            }
        ));
        jScrollPane1.setViewportView(tblManageFoodAuditor);

        lblfaContact.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblfaContact.setText("Contact");

        btnBack.setBackground(new java.awt.Color(0, 153, 255));
        btnBack.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnBack.setText("Back");
        btnBack.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        lblfaUsername.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblfaUsername.setText("Username");

        txtfaContact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfaContactActionPerformed(evt);
            }
        });

        btnUpdate.setBackground(new java.awt.Color(0, 153, 255));
        btnUpdate.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnConfirm.setBackground(new java.awt.Color(0, 153, 255));
        btnConfirm.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnConfirm.setText("Confirm Update");
        btnConfirm.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmActionPerformed(evt);
            }
        });

        lblfaPassword.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblfaPassword.setText("Password");

        lblManageNGOTitle.setFont(new java.awt.Font("Times New Roman", 1, 32)); // NOI18N
        lblManageNGOTitle.setText("Manage Food Auditor");

        btnDelete.setBackground(new java.awt.Color(204, 51, 0));
        btnDelete.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/audit.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 477, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(183, 183, 183)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblfaName, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblfaContact, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblfaAddress, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblfaPassword, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblfaUsername, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(79, 79, 79)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtfaName)
                            .addComponent(txtfaUserName)
                            .addComponent(txtfaPassword)
                            .addComponent(txtfaAddress)
                            .addComponent(txtfaContact, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(btnConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(338, 338, 338)
                        .addComponent(lblManageNGOTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 672, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(128, 128, 128))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(lblManageNGOTitle)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblfaName)
                            .addComponent(txtfaName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtfaUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblfaUsername))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtfaPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblfaPassword))
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblfaAddress)
                            .addComponent(txtfaAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblfaContact)
                            .addComponent(txtfaContact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(37, 37, 37)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelete))
                .addGap(259, 259, 259))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnConfirm, btnDelete});

    }// </editor-fold>//GEN-END:initComponents

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:
        String name = txtfaName.getText();
        String username=txtfaUserName.getText();
        String password=txtfaPassword.getText();
        String address=txtfaAddress.getText();
        String contact=txtfaContact.getText();
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

        try {

            if(password==null || password.isEmpty()){

                throw new NullPointerException("Password cannot be empty");

            } else if (Pattern.matches("^(?=(.*[a-z]){1,})(?=(.*[\\d]){1,})(?=(.*[\\W]){1,})(?!.*\\s).{5,30}$", password)==false){

                throw new Exception("Invalid Password");
            }

        }  catch(NullPointerException e){

            JOptionPane.showMessageDialog(null, "Password is Empty");

            return;
        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "Password is invalid");

            return;
        }

        if (business.getUserAccountDirectory().checkIfUsernameIsUnique(username)==false) {
            JOptionPane.showMessageDialog(null,"User Name already exists ");
        }else{

            UserAccount ua1 =business.getUserAccountDirectory().createUserAccount(name,username,password,null, new FoodAuditorRole());
            FoodAuditor fa= business.getFoodAuditorDirectory().createFoodAuditor(name, username, address, contact);
            populateManageFATable();
            SendEmail se = new SendEmail(username, "Food Auditor Registration");
            se.sendEmailToUsers(username, "Food Auditor Registration");
            JOptionPane.showMessageDialog(null,"Email has been sent to the given Username. Please check");

            txtfaName.setText("");
            txtfaUserName.setText("");
            txtfaPassword.setText("");
            txtfaAddress.setText("");
            txtfaContact.setText("");
        }
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void txtfaContactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfaContactActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfaContactActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        int selectRow = tblManageFoodAuditor.getSelectedRow();

        if(selectRow>=0){
            String username= (String) tblManageFoodAuditor.getValueAt(selectRow, 1);
            String pwd= (String) tblManageFoodAuditor.getValueAt(selectRow, 2);
            user=business.getUserAccountDirectory().authenticateUser(username, pwd);

            txtfaName.setText(user.getName()+"");
            txtfaUserName.setText(user.getUsername()+"");
            txtfaPassword.setText(user.getPassword()+"");

        }
        else {
            JOptionPane.showMessageDialog(null,"Please select a row");
        }

        btnSubmit.setEnabled(false);
        btnDelete.setEnabled(false);
        btnUpdate.setEnabled(false);
        btnConfirm.setEnabled(true);
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmActionPerformed
        // TODO add your handling code here:
        String name = txtfaName.getText();
        String username=txtfaUserName.getText();
        String password=txtfaPassword.getText();
        String address=txtfaAddress.getText();
        String contact=txtfaContact.getText();

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
//        FoodAuditor fa= business.getFoodAuditorDirectory().updateFoodAuditor(fa, name, contact, address);
        populateManageFATable();
        btnSubmit.setEnabled(true);
        btnDelete.setEnabled(true);
        btnUpdate.setEnabled(true);
        btnConfirm.setEnabled(false);
        txtfaName.setText("");
        txtfaUserName.setText("");
        txtfaPassword.setText("");
    }//GEN-LAST:event_btnConfirmActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblManageFoodAuditor.getSelectedRow();
        if(selectedRow>=0){
            int selectionButton = JOptionPane.YES_NO_OPTION;
            int selectionResult = JOptionPane.showConfirmDialog(null, "Confirm Delete ? ","Warning",selectionButton);
            if(selectionResult == JOptionPane.YES_OPTION){
                String username= (String) tblManageFoodAuditor.getValueAt(selectedRow, 1);
                String pwd= (String) tblManageFoodAuditor.getValueAt(selectedRow, 2);
                UserAccount user=business.getUserAccountDirectory().authenticateUser(username, pwd);

                business.getUserAccountDirectory().deleteUserAccount(user);
                //                business.getCustomerDirectory().deleteCustomer(user.getUsername());
                business.getFoodAuditorDirectory().deleteFoodAuditor(username);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please select a Row to delete!");
        }
        populateManageFATable();
    }//GEN-LAST:event_btnDeleteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnConfirm;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblManageNGOTitle;
    private javax.swing.JLabel lblfaAddress;
    private javax.swing.JLabel lblfaContact;
    private javax.swing.JLabel lblfaName;
    private javax.swing.JLabel lblfaPassword;
    private javax.swing.JLabel lblfaUsername;
    private javax.swing.JTable tblManageFoodAuditor;
    private javax.swing.JTextField txtfaAddress;
    private javax.swing.JTextField txtfaContact;
    private javax.swing.JTextField txtfaName;
    private javax.swing.JTextField txtfaPassword;
    private javax.swing.JTextField txtfaUserName;
    // End of variables declaration//GEN-END:variables
}
