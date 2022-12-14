/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.datamarketplace.ui;

import com.mycompany.datamarketplace.backend.DBUtils;
import com.mycompany.datamarketplace.datamodels.Person;
import com.mycompany.datamarketplace.datamodels.community.Developer;
import com.mycompany.datamarketplace.datamodels.university.Professor;
import com.mycompany.datamarketplace.datamodels.university.Student;
import javax.swing.JSplitPane;
import java.awt.Cursor;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class LoginPane extends javax.swing.JPanel {

    JSplitPane mainSplitPane;
    DBUtils dbUtils;
    /**
     * Creates new form LoginPane
     */
    public LoginPane(JSplitPane splitPane) {
        mainSplitPane = splitPane;
        initComponents();
        navigateToRegisterLabel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        
        dbUtils = new DBUtils();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        emailTxt = new javax.swing.JTextField();
        userNameLabel = new javax.swing.JLabel();
        passwordTxt = new javax.swing.JTextField();
        passwordLabel = new javax.swing.JLabel();
        roleLabel = new javax.swing.JLabel();
        rolesComboBox = new javax.swing.JComboBox<>();
        loginButton = new javax.swing.JButton();
        navigateToRegisterLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        emailTxt.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        userNameLabel.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        userNameLabel.setText("Email:");

        passwordTxt.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        passwordLabel.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        passwordLabel.setText("Password:");

        roleLabel.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        roleLabel.setText("Select Role:");

        rolesComboBox.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        rolesComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select your role", "Developer", "General", "Manager", "Professor", "Student" }));
        rolesComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rolesComboBoxActionPerformed(evt);
            }
        });

        loginButton.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        loginButton.setText("Login");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        navigateToRegisterLabel.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        navigateToRegisterLabel.setText("New User? Click here to register.");
        navigateToRegisterLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                navigateToRegisterLabelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(445, 445, 445)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(navigateToRegisterLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 257, Short.MAX_VALUE)
                    .addComponent(loginButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rolesComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(passwordTxt)
                    .addComponent(roleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emailTxt)
                    .addComponent(userNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(498, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(128, Short.MAX_VALUE)
                .addComponent(userNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(emailTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(passwordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwordTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(roleLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rolesComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addComponent(navigateToRegisterLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(95, 95, 95))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void rolesComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rolesComboBoxActionPerformed
        
    }//GEN-LAST:event_rolesComboBoxActionPerformed

    private void navigateToRegisterLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_navigateToRegisterLabelMouseClicked
        
        RegisterPane registerPane = new RegisterPane(mainSplitPane);
        mainSplitPane.setBottomComponent(registerPane);
        mainSplitPane.setDividerSize(0);
    }//GEN-LAST:event_navigateToRegisterLabelMouseClicked

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        
        Student studentObj = null;
        Professor professorObj;
        Person personObj;
        Developer devObj;
          
        String email = emailTxt.getText();
        String password = passwordTxt.getText();
        String role = (String.valueOf(rolesComboBox.getEditor().getItem()));
        
        LogoutPanel logoutPanel = new LogoutPanel(mainSplitPane, studentObj);
        switch (role) {
            case "Student":
                studentObj = dbUtils.checkIfStudentUserExists(email, password, role);
                if(studentObj == null) {
                    JOptionPane.showMessageDialog(this, "Student account does not exist");
                    return;
                }
                else{
                    System.out.println(studentObj.getUniversityName());
                    JOptionPane.showMessageDialog(this, "Student login success!");
                    StudentScreen studentScreen = new StudentScreen(mainSplitPane, studentObj);
                    mainSplitPane.setBottomComponent(studentScreen);
                    mainSplitPane.setTopComponent(logoutPanel);
                    mainSplitPane.setDividerSize(0);
                    emailTxt.setText("");
                    passwordTxt.setText("");
                    return;
                }
            case "Professor":
                professorObj = dbUtils.checkIfProfessorUserExists(email, password, role);
                if(professorObj == null) {
                    JOptionPane.showMessageDialog(this, "Professor account does not exist");
                    return;
                }
                else{
                    JOptionPane.showMessageDialog(this, "Professor login success!");
                    ProfessorScreen professorScreen = new ProfessorScreen(mainSplitPane, professorObj);
                    mainSplitPane.setBottomComponent(professorScreen);
                    mainSplitPane.setTopComponent(logoutPanel);
                    mainSplitPane.setDividerSize(0);
                    emailTxt.setText("");
                    passwordTxt.setText("");
                    return;
                }
            case "General":
                personObj = dbUtils.checkIfUserExists(email, password, role);
                if(personObj == null) {
                    JOptionPane.showMessageDialog(this, "User does not exist");
                    return;
                }
                else{
                    JOptionPane.showMessageDialog(this, "User login success!");
                    GeneralUserScreen generalUserScreen = new GeneralUserScreen(mainSplitPane, personObj);
                    mainSplitPane.setBottomComponent(generalUserScreen);
                    mainSplitPane.setTopComponent(logoutPanel);
                    mainSplitPane.setDividerSize(0);
                    emailTxt.setText("");
                    passwordTxt.setText("");
                    return;
                }
                
            case "Developer":
                devObj = dbUtils.checkIfDeveloperUserExists(email, password, role);
                if(devObj == null) {
                    JOptionPane.showMessageDialog(this, "Developer does not exist");
                    return;
                }
                else{
                    JOptionPane.showMessageDialog(this, "Developer login success!");
                    DeveloperScreen developerScreen = new DeveloperScreen(mainSplitPane, devObj);
                    mainSplitPane.setBottomComponent(developerScreen);
                    mainSplitPane.setTopComponent(logoutPanel);
                    mainSplitPane.setDividerSize(0);
                    emailTxt.setText("");
                    passwordTxt.setText("");
                    return;
                }
                
            case "Manager":
                personObj = dbUtils.checkIfUserExists(email, password, role);
                if(personObj == null) {
                    JOptionPane.showMessageDialog(this, "Manager does not exist");
                    return;
                }
                else{
                    JOptionPane.showMessageDialog(this, "Manager login success!");
                    ProductManagerScreen managerScreen = new ProductManagerScreen();
                    mainSplitPane.setBottomComponent(managerScreen);
                    mainSplitPane.setTopComponent(logoutPanel);
                    mainSplitPane.setDividerSize(0);
                    emailTxt.setText("");
                    passwordTxt.setText("");
                    return;
                }
        }
    }//GEN-LAST:event_loginButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField emailTxt;
    private javax.swing.JButton loginButton;
    private javax.swing.JLabel navigateToRegisterLabel;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JTextField passwordTxt;
    private javax.swing.JLabel roleLabel;
    private javax.swing.JComboBox<String> rolesComboBox;
    private javax.swing.JLabel userNameLabel;
    // End of variables declaration//GEN-END:variables
}
