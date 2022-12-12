/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.datamarketplace.ui;

import com.mycompany.datamarketplace.backend.DBUtils;
import com.mycompany.datamarketplace.datamodels.community.Community;
import com.mycompany.datamarketplace.datamodels.company.Company;
import com.mycompany.datamarketplace.datamodels.company.ProductManager;
import java.awt.Cursor;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Admin
 */
public class CompanyAdminPane extends javax.swing.JPanel {

    DBUtils dbUtils;
    ArrayList<ProductManager> productManagerLists = new ArrayList<>();
    public CompanyAdminPane() {
        initComponents();
        dbUtils = new DBUtils();
        productManagerLists = dbUtils.retrieveAllProductManagers(); 
        populatePMTable(productManagerLists);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        companyIdTxt = new javax.swing.JTextField();
        companyNameTxt = new javax.swing.JTextField();
        emailTxt = new javax.swing.JTextField();
        cityTxt = new javax.swing.JTextField();
        phoneNumberTxt = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        countryTxt = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        passwordTxt1 = new javax.swing.JTextField();
        jTextField19 = new javax.swing.JTextField();
        userNameLabel5 = new javax.swing.JLabel();
        emailTxt2 = new javax.swing.JTextField();
        firstNameTxt1 = new javax.swing.JTextField();
        lastNameTxt1 = new javax.swing.JTextField();
        phNoLabel1 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        userNameLabel4 = new javax.swing.JLabel();
        phoneNumberTxt2 = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        idLabel1 = new javax.swing.JLabel();
        deleteCompanyBtn1 = new javax.swing.JButton();
        userNameLabel7 = new javax.swing.JLabel();
        createCompanyBtn1 = new javax.swing.JButton();
        studentIdTxt1 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();

        jTabbedPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTabbedPane1MouseEntered(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel25.setBackground(java.awt.Color.white);
        jLabel25.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel25.setText("Contact No:");

        jLabel19.setBackground(java.awt.Color.white);
        jLabel19.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel19.setText("Company Name");

        companyIdTxt.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        companyNameTxt.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        emailTxt.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        cityTxt.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        phoneNumberTxt.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jLabel20.setBackground(java.awt.Color.white);
        jLabel20.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel20.setText("Country");

        countryTxt.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jLabel21.setBackground(java.awt.Color.white);
        jLabel21.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel21.setText("Company ID:");

        jLabel17.setBackground(java.awt.Color.white);
        jLabel17.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel17.setText("City");

        jLabel24.setBackground(java.awt.Color.white);
        jLabel24.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel24.setText("Email:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(252, 252, 252)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(114, 114, 114)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(countryTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(companyNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cityTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(companyIdTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emailTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(phoneNumberTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(547, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(companyNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cityTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(countryTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(companyIdTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emailTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(phoneNumberTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(248, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Manage Company", jPanel1);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        passwordTxt1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        userNameLabel5.setBackground(java.awt.Color.white);
        userNameLabel5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        userNameLabel5.setText("Last Name:");

        phNoLabel1.setBackground(java.awt.Color.white);
        phNoLabel1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        phNoLabel1.setText("Phone Number:");

        jLabel30.setBackground(java.awt.Color.white);
        jLabel30.setText("Search Product Manager:");

        jLabel6.setBackground(java.awt.Color.white);
        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel6.setText("Password:");

        userNameLabel4.setBackground(java.awt.Color.white);
        userNameLabel4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        userNameLabel4.setText("Email:");

        jScrollPane4.setBackground(java.awt.Color.white);

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "First Name", "Last Name", "Email", "Employee ID"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(jTable4);

        idLabel1.setBackground(java.awt.Color.white);
        idLabel1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        idLabel1.setText("Employee ID");

        deleteCompanyBtn1.setBackground(java.awt.Color.white);
        deleteCompanyBtn1.setText("Delete");
        deleteCompanyBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteCompanyBtn1ActionPerformed(evt);
            }
        });

        userNameLabel7.setBackground(java.awt.Color.white);
        userNameLabel7.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        userNameLabel7.setText("First Name:");

        createCompanyBtn1.setBackground(java.awt.Color.white);
        createCompanyBtn1.setText("Create");
        createCompanyBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createCompanyBtn1ActionPerformed(evt);
            }
        });

        studentIdTxt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentIdTxt1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addComponent(createCompanyBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(deleteCompanyBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(userNameLabel7)
                            .addComponent(userNameLabel5)
                            .addComponent(userNameLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(phNoLabel1)
                            .addComponent(idLabel1))
                        .addGap(155, 155, 155)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lastNameTxt1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(firstNameTxt1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(emailTxt2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(passwordTxt1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(phoneNumberTxt2, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(studentIdTxt1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 175, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField19, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(127, 127, 127))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField19)
                    .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(firstNameTxt1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(userNameLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(userNameLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lastNameTxt1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(userNameLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(emailTxt2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(passwordTxt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(phoneNumberTxt2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(phNoLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(idLabel1)
                            .addComponent(studentIdTxt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(createCompanyBtn1)
                            .addComponent(deleteCompanyBtn1))))
                .addContainerGap(215, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Manage Product manager", jPanel2);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1195, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 573, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Manage Survey", jPanel3);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1195, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 573, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Manage Beta Testing", jPanel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void deleteCompanyBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteCompanyBtn1ActionPerformed
        // TODO add your handling code here:
        int selectedRowInd = jTable4.getSelectedRow();
        
        if(selectedRowInd < 0){
            JOptionPane.showMessageDialog(this, "Please select a row");
            return;
        }
        
        DefaultTableModel tableModel = (DefaultTableModel) jTable4.getModel();
        ProductManager selectedEmployee = (ProductManager)tableModel.getValueAt(selectedRowInd, 0);
        String companyIdToBeDeleted = selectedEmployee.getEmail();
        productManagerLists.remove(selectedEmployee);
        JOptionPane.showMessageDialog(this, "Records deleted");
        dbUtils.deletePM(companyIdToBeDeleted);
        populatePMTable(productManagerLists);
    }//GEN-LAST:event_deleteCompanyBtn1ActionPerformed

    private void createCompanyBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createCompanyBtn1ActionPerformed
        // TODO add your handling code here:
        ProductManager productManager = null;
       String firstName = firstNameTxt1.getText();
       String lastName = lastNameTxt1.getText();
       String email = emailTxt2.getText();
       String gender = "";
       int age = 0;
       String universityName = "";
       String studentId ="";
       String role = "product_manager";
       String generalId = "";
       String password = passwordTxt1.getText();
       String phoneNo = phoneNumberTxt2.getText();
       String employeeId = studentIdTxt1.getText();
       
       if(dbUtils.checkIfEmailIsUnique(email, role) && dbUtils.checkIfIdIsUnique(employeeId, role)){
          
            Boolean isSuccess = dbUtils.insertValuesBasedOnRoles(
                firstName,
                lastName,
                email,
                password,
                gender,
                age,
                universityName,
                studentId,
                employeeId,
                generalId,
                role,
                phoneNo
            );  
          
          if(isSuccess){
            firstNameTxt1.setText("");
            lastNameTxt1.setText("");
            emailTxt2.setText("");
            phoneNumberTxt2.setText("");
            emailTxt.setText("");
            studentIdTxt1.setText("");
            passwordTxt1.setText("");
            JOptionPane.showMessageDialog(this, "Your details are saved");
            productManager= dbUtils.retrievePMDetails(email, "product_manager");
            productManagerLists.add(productManager);
            populatePMTable(productManagerLists);
            return; 
            }
          else{
              JOptionPane.showMessageDialog(this, "Please check your errors");
              return;
          }
          
        }
    }//GEN-LAST:event_createCompanyBtn1ActionPerformed

    private void studentIdTxt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentIdTxt1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_studentIdTxt1ActionPerformed

    private void jTabbedPane1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane1MouseEntered
        // TODO add your handling code here:
        jTabbedPane1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_jTabbedPane1MouseEntered


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cityTxt;
    private javax.swing.JTextField companyIdTxt;
    private javax.swing.JTextField companyNameTxt;
    private javax.swing.JTextField countryTxt;
    private javax.swing.JButton createCompanyBtn1;
    private javax.swing.JButton deleteCompanyBtn1;
    private javax.swing.JTextField emailTxt;
    private javax.swing.JTextField emailTxt2;
    private javax.swing.JTextField firstNameTxt1;
    private javax.swing.JLabel idLabel1;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable4;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField lastNameTxt1;
    private javax.swing.JTextField passwordTxt1;
    private javax.swing.JLabel phNoLabel1;
    private javax.swing.JTextField phoneNumberTxt;
    private javax.swing.JTextField phoneNumberTxt2;
    private javax.swing.JTextField studentIdTxt1;
    private javax.swing.JLabel userNameLabel4;
    private javax.swing.JLabel userNameLabel5;
    private javax.swing.JLabel userNameLabel7;
    // End of variables declaration//GEN-END:variables

    private void populatePMTable(ArrayList<ProductManager> productManagerLists) {
     DefaultTableModel tableModel = (DefaultTableModel) jTable4.getModel();
        tableModel.setRowCount(0 );
        
        for(ProductManager itr: productManagerLists){
          if(itr != null){
            Object[] rowOfRecord =  new Object[5];
            rowOfRecord[0] = itr;
            rowOfRecord[1] = itr.getLastName();
            rowOfRecord[2] = itr.getEmail();
            tableModel.addRow(rowOfRecord);      
        }     
        }    
    }
}
