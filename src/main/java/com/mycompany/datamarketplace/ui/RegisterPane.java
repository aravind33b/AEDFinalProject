/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.datamarketplace.ui;

import com.mycompany.datamarketplace.backend.DBUtils;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JSplitPane;

/**
 *
 * @author Admin
 */
public class RegisterPane extends javax.swing.JPanel {
    

    JSplitPane mainSplitPane;
    /**
     * Creates new form RegisterPane
     */
    DBUtils dbUtils;
    public RegisterPane(JSplitPane splitPane) {
        mainSplitPane = splitPane;
        initComponents();
        roleSelector.setVisible(false);
        universityLabel.setVisible(false);
        universityNameTxt.setVisible(false);
        idLabel.setVisible(false);
        studentIdTxt.setVisible(false);
        empLabel.setVisible(false);
        employeeIdTxt.setVisible(false);
        empLabel2.setVisible(false);
        communityNameTxt.setVisible(false);
        generalUserLabel.setVisible(false);
        generalUserText.setVisible(false);
        
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

        roleButtonGroup = new javax.swing.ButtonGroup();
        genderButtonGroup = new javax.swing.ButtonGroup();
        RegisterButton = new javax.swing.JButton();
        userNameLabel = new javax.swing.JLabel();
        firstNameTxt = new javax.swing.JTextField();
        userNameLabel1 = new javax.swing.JLabel();
        emailTxt = new javax.swing.JTextField();
        userNameLabel2 = new javax.swing.JLabel();
        ageTxt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        roleYes = new javax.swing.JRadioButton();
        roleNo = new javax.swing.JRadioButton();
        roleSelector = new javax.swing.JComboBox<>();
        universityLabel = new javax.swing.JLabel();
        universityNameTxt = new javax.swing.JTextField();
        idLabel = new javax.swing.JLabel();
        studentIdTxt = new javax.swing.JTextField();
        empLabel = new javax.swing.JLabel();
        employeeIdTxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        passwordTxt = new javax.swing.JTextField();
        userNameLabel3 = new javax.swing.JLabel();
        lastNameTxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        maleRadio = new javax.swing.JRadioButton();
        femaleRadio = new javax.swing.JRadioButton();
        undisclosedRadio = new javax.swing.JRadioButton();
        communityNameTxt = new javax.swing.JTextField();
        empLabel2 = new javax.swing.JLabel();
        generalUserLabel = new javax.swing.JLabel();
        generalUserText = new javax.swing.JTextField();
        phNoLabel = new javax.swing.JLabel();
        phoneNumberTxt = new javax.swing.JTextField();
        validationLbl = new javax.swing.JLabel();

        RegisterButton.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        RegisterButton.setText("Register");
        RegisterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterButtonActionPerformed(evt);
            }
        });

        userNameLabel.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        userNameLabel.setText("First Name:");

        firstNameTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                firstNameTxtKeyReleased(evt);
            }
        });

        userNameLabel1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        userNameLabel1.setText("Email:");

        emailTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                emailTxtKeyReleased(evt);
            }
        });

        userNameLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        userNameLabel2.setText("Age:");

        ageTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ageTxtKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ageTxtKeyReleased(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel1.setText("Student / Professor / Developer?");

        roleButtonGroup.add(roleYes);
        roleYes.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        roleYes.setText("Yes");
        roleYes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roleYesActionPerformed(evt);
            }
        });

        roleButtonGroup.add(roleNo);
        roleNo.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        roleNo.setText("No");
        roleNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roleNoActionPerformed(evt);
            }
        });

        roleSelector.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        roleSelector.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select your role", "Student", "Professor", "Developer" }));
        roleSelector.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roleSelectorActionPerformed(evt);
            }
        });

        universityLabel.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        universityLabel.setText("University Name:");

        universityNameTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                universityNameTxtActionPerformed(evt);
            }
        });

        idLabel.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        idLabel.setText("ID Number:");

        studentIdTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentIdTxtActionPerformed(evt);
            }
        });

        empLabel.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        empLabel.setText("Employee ID:");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel5.setText("Password:");

        passwordTxt.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        userNameLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        userNameLabel3.setText("Last Name:");

        lastNameTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                lastNameTxtKeyReleased(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setText("Gender:");

        genderButtonGroup.add(maleRadio);
        maleRadio.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        maleRadio.setText("Male");
        maleRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maleRadioActionPerformed(evt);
            }
        });

        genderButtonGroup.add(femaleRadio);
        femaleRadio.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        femaleRadio.setText("Female");
        femaleRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                femaleRadioActionPerformed(evt);
            }
        });

        genderButtonGroup.add(undisclosedRadio);
        undisclosedRadio.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        undisclosedRadio.setText("Rather not say");
        undisclosedRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                undisclosedRadioActionPerformed(evt);
            }
        });

        empLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        empLabel2.setText("Community Name:");

        generalUserLabel.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        generalUserLabel.setText("Role:");

        generalUserText.setEditable(false);
        generalUserText.setText("General");

        phNoLabel.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        phNoLabel.setText("Phone Number:");

        phoneNumberTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                phoneNumberTxtKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(254, 254, 254)
                        .addComponent(RegisterButton, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(validationLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 456, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(userNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(userNameLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(userNameLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(userNameLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(phNoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(universityLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(empLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(idLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(empLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(generalUserLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(45, 45, 45)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(generalUserText, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(communityNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(studentIdTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(universityNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(employeeIdTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(roleSelector, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(roleYes)
                                        .addGap(18, 18, 18)
                                        .addComponent(roleNo, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(lastNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(firstNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(emailTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(ageTxt, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(passwordTxt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(maleRadio)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(femaleRadio, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(undisclosedRadio))
                                        .addComponent(phoneNumberTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(463, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userNameLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lastNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userNameLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emailTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(passwordTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(userNameLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                    .addComponent(ageTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(maleRadio, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(femaleRadio, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(undisclosedRadio, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(phNoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(phoneNumberTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(roleYes, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(roleNo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addComponent(roleSelector, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(universityLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(universityNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(idLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(studentIdTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(15, 15, 15)
                                .addComponent(empLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(employeeIdTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addComponent(empLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(communityNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(generalUserLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(generalUserText, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(validationLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(RegisterButton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void RegisterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterButtonActionPerformed
        // TODO add your handling code here:
        String commonId = "";
        String firstName = firstNameTxt.getText();
        if(firstName.isEmpty() || firstName.isBlank()){
            JOptionPane.showMessageDialog(this, "First Name is Empty");
            return;
        }
        
        String lastName = lastNameTxt.getText();
        if(lastName.isEmpty() || lastName.isBlank()){
            JOptionPane.showMessageDialog(this, "Last Name is Empty");
            return;
        }
        
        String email = emailTxt.getText();
        if(email.isEmpty() || email.isBlank()){
            JOptionPane.showMessageDialog(this, "Email is Empty");
            return;
        }
        
        String password = passwordTxt.getText();
        if(password.isEmpty() || password.isBlank()){
            JOptionPane.showMessageDialog(this, "Password is Empty");
            return;
        }
        
        String gender = populateGenderBasedOnRadio();
        if(gender.isEmpty() || gender.isBlank()){
            JOptionPane.showMessageDialog(this, "Gender is Empty");
            return;
        }
        
        String ageText = ageTxt.getText();
        if(ageText.isEmpty() || ageText.isBlank()){
            JOptionPane.showMessageDialog(this, "Age is Empty");
            return;
        }
        int age = Integer.parseInt(ageText);
        
        String phoneNo = phoneNumberTxt.getText();
        if(phoneNo.isEmpty() || phoneNo.isBlank()){
            JOptionPane.showMessageDialog(this, "Phone Number is Empty");
            return;
        }
        //String phoneNumber = Integer.parseInt(phoneNo);
        
        String universityName = universityNameTxt.getText();
        
        
        String studentId = studentIdTxt.getText();
        String employeeId = employeeIdTxt.getText();
        String communityName = communityNameTxt.getText();
        String generalRole = generalUserText.getText();
        String generalId = "";
        
        String role =(String.valueOf(roleSelector.getEditor().getItem()));
        
        if(role.equalsIgnoreCase("student")){
            commonId = studentId;
        }
                
        else if(role.equalsIgnoreCase("professor")){
            commonId = employeeId;
        }
        
        else if(role.equalsIgnoreCase("developer")){
            commonId = studentId;
            generalId = studentId;
            commonId = studentId;
            studentId = "";
            universityName = communityName;
        }
        
        
        
        else{
            role = generalRole;
            generalId = studentId;
            commonId = studentId;
            studentId = "";
        }
        
        if(dbUtils.checkIfEmailIsUnique(email, role) && dbUtils.checkIfIdIsUnique(commonId, role)){
          
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
            firstNameTxt.setText("");
            lastNameTxt.setText("");
            ageTxt.setText("");
            genderButtonGroup.clearSelection();
            roleButtonGroup.clearSelection();
            roleSelector.setSelectedItem("Select your role");
            phoneNumberTxt.setText("");
            universityNameTxt.setText("");
            emailTxt.setText("");
            passwordTxt.setText("");
            studentIdTxt.setText("");
            employeeIdTxt.setText("");
            JOptionPane.showMessageDialog(this, "Your details are saved");
            return; 
            }
          else{
              JOptionPane.showMessageDialog(this, "Please check your errors");
              return;
          }
          
        }
        
        else{
            JOptionPane.showMessageDialog(this, "Email or ID already exists");
            return;
        }
        
        
    }//GEN-LAST:event_RegisterButtonActionPerformed

    private void roleSelectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roleSelectorActionPerformed
        // TODO add your handling code here:
        String temp =(String.valueOf(roleSelector.getEditor().getItem()));
        
        if(temp.equals("Student"))
        {
            universityLabel.setVisible(true);
            universityNameTxt.setVisible(true);
            idLabel.setVisible(true);
            studentIdTxt.setVisible(true);
            empLabel.setVisible(false);
            employeeIdTxt.setVisible(false);
            empLabel2.setVisible(false);
            communityNameTxt.setVisible(false);
            generalUserLabel.setVisible(false);
            generalUserText.setVisible(false);
        }
        else if(temp.equals("Professor"))
        {
            universityLabel.setVisible(true);
            universityNameTxt.setVisible(true);
            empLabel.setVisible(true);
            employeeIdTxt.setVisible(true);
            idLabel.setVisible(false);
            studentIdTxt.setVisible(false);  
            generalUserLabel.setVisible(false);
            generalUserText.setVisible(false);
            empLabel2.setVisible(false);
            communityNameTxt.setVisible(false);
        }
        else if(temp.equals("Developer"))
        {
            universityLabel.setVisible(false);
            universityNameTxt.setVisible(false);
            idLabel.setVisible(true);
            studentIdTxt.setVisible(true);
            empLabel.setVisible(false);
            employeeIdTxt.setVisible(false);
            empLabel2.setVisible(true);
            communityNameTxt.setVisible(true);
            generalUserLabel.setVisible(false);
            generalUserText.setVisible(false);
        }
        else
        {
            universityLabel.setVisible(false);
            universityNameTxt.setVisible(false);
            idLabel.setVisible(false);
            studentIdTxt.setVisible(false);
            empLabel.setVisible(false);
            employeeIdTxt.setVisible(false);
            empLabel2.setVisible(false);
            communityNameTxt.setVisible(false);
            generalUserLabel.setVisible(false);
            generalUserText.setVisible(false);
        }
    }//GEN-LAST:event_roleSelectorActionPerformed

    private void universityNameTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_universityNameTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_universityNameTxtActionPerformed

    private void studentIdTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentIdTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_studentIdTxtActionPerformed

    private void maleRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maleRadioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_maleRadioActionPerformed

    private void femaleRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_femaleRadioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_femaleRadioActionPerformed

    private void undisclosedRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_undisclosedRadioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_undisclosedRadioActionPerformed

    private void roleNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roleNoActionPerformed
        // TODO add your handling code here:
        if(roleNo.isSelected() == true)
        {
            roleSelector.setVisible(false);
            universityLabel.setVisible(false);
            universityNameTxt.setVisible(false);
            idLabel.setVisible(true);
            studentIdTxt.setVisible(true);
            empLabel.setVisible(false);
            employeeIdTxt.setVisible(false);
            empLabel2.setVisible(false);
            communityNameTxt.setVisible(false);
            generalUserLabel.setVisible(true);
            generalUserText.setVisible(true);
        }
    }//GEN-LAST:event_roleNoActionPerformed

    private void roleYesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roleYesActionPerformed
        // TODO add your handling code here:
                if(roleYes.isSelected() == true)
                {
                        roleSelector.setVisible(true);
                        universityLabel.setVisible(false);
                        universityNameTxt.setVisible(false);
                        idLabel.setVisible(false);
                        studentIdTxt.setVisible(false);
                        empLabel.setVisible(false);
                        employeeIdTxt.setVisible(false);
                        empLabel2.setVisible(false);
                        communityNameTxt.setVisible(false);
                        generalUserLabel.setVisible(false);
                        generalUserText.setVisible(false);
                    }
    }//GEN-LAST:event_roleYesActionPerformed

    private void ageTxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ageTxtKeyReleased
        // TODO add your handling code here:
        
    }//GEN-LAST:event_ageTxtKeyReleased

    private void ageTxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ageTxtKeyPressed
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(Character.isLetter(c)){
            ageTxt.setEditable(false);
            validationLbl.setText("* Age must be number");
            RegisterButton.setEnabled(false);
        }
        else{
            ageTxt.setEditable(true);
            validationLbl.setText("");
            RegisterButton.setEnabled(true);
        }
    }//GEN-LAST:event_ageTxtKeyPressed

    private void phoneNumberTxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_phoneNumberTxtKeyReleased
        // TODO add your handling code here:
        String p = phoneNumberTxt.getText();
       
        if(Pattern.matches("^\\+?[1-9][0-9]{9,14}$", p)){
              validationLbl.setText("");
              RegisterButton.setEnabled(true);
         }
        else{
            validationLbl.setText("You must enter valid Cell Phone Number");
            RegisterButton.setEnabled(false);
        }
    }//GEN-LAST:event_phoneNumberTxtKeyReleased

    private void emailTxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_emailTxtKeyReleased
        // TODO add your handling code here:
        String e = emailTxt.getText();
       
        if(Pattern.matches("^(.+)@(\\S+)$", e)){
              validationLbl.setText("");
              RegisterButton.setEnabled(true);
         }
        else{
            validationLbl.setText("You must enter valid Email address");
            RegisterButton.setEnabled(false);
        }
        
    }//GEN-LAST:event_emailTxtKeyReleased

    private void firstNameTxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_firstNameTxtKeyReleased
        // TODO add your handling code here:
        String fn = firstNameTxt.getText();
        if(Pattern.matches("^[a-z][a-z '-.,]{3,31}$", fn)){
              validationLbl.setText("");
              RegisterButton.setEnabled(true);
         }
        else{
            validationLbl.setText("Please Enter Valid First Name");
            RegisterButton.setEnabled(false);
        }
    }//GEN-LAST:event_firstNameTxtKeyReleased

    private void lastNameTxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lastNameTxtKeyReleased
        // TODO add your handling code here:
        String ln = lastNameTxt.getText();
        if(Pattern.matches("^[a-z][a-z '-.,]{3,31}$", ln)){
              validationLbl.setText("");
              RegisterButton.setEnabled(true);
         }
        else{
            validationLbl.setText("Please Enter Valid Last Name");
            RegisterButton.setEnabled(false);
        }
    }//GEN-LAST:event_lastNameTxtKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton RegisterButton;
    private javax.swing.JTextField ageTxt;
    private javax.swing.JTextField communityNameTxt;
    private javax.swing.JTextField emailTxt;
    private javax.swing.JLabel empLabel;
    private javax.swing.JLabel empLabel2;
    private javax.swing.JTextField employeeIdTxt;
    private javax.swing.JRadioButton femaleRadio;
    private javax.swing.JTextField firstNameTxt;
    private javax.swing.ButtonGroup genderButtonGroup;
    private javax.swing.JLabel generalUserLabel;
    private javax.swing.JTextField generalUserText;
    private javax.swing.JLabel idLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField lastNameTxt;
    private javax.swing.JRadioButton maleRadio;
    private javax.swing.JTextField passwordTxt;
    private javax.swing.JLabel phNoLabel;
    private javax.swing.JTextField phoneNumberTxt;
    private javax.swing.ButtonGroup roleButtonGroup;
    private javax.swing.JRadioButton roleNo;
    private javax.swing.JComboBox<String> roleSelector;
    private javax.swing.JRadioButton roleYes;
    private javax.swing.JTextField studentIdTxt;
    private javax.swing.JRadioButton undisclosedRadio;
    private javax.swing.JLabel universityLabel;
    private javax.swing.JTextField universityNameTxt;
    private javax.swing.JLabel userNameLabel;
    private javax.swing.JLabel userNameLabel1;
    private javax.swing.JLabel userNameLabel2;
    private javax.swing.JLabel userNameLabel3;
    private javax.swing.JLabel validationLbl;
    // End of variables declaration//GEN-END:variables

    private String populateGenderBasedOnRadio() {
        if(maleRadio.isSelected())
            return "Male";
        else if(femaleRadio.isSelected()){
            return "Female";
        }
        return "Undisclosed";
    }
}
