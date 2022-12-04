/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.datamarketplace.ui;

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
    
    public RegisterPane(JSplitPane splitPane) {
        mainSplitPane = splitPane;
        initComponents();
        roleSelector.setVisible(false);
        universityLabel.setVisible(false);
        universityField.setVisible(false);
        idLabel.setVisible(false);
        idField.setVisible(false);
        empLabel.setVisible(false);
        empField.setVisible(false);
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
        RegisterButton = new javax.swing.JButton();
        userNameLabel = new javax.swing.JLabel();
        userNameField = new javax.swing.JTextField();
        userNameLabel1 = new javax.swing.JLabel();
        userNameField1 = new javax.swing.JTextField();
        userNameLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        roleYes = new javax.swing.JRadioButton();
        roleNo = new javax.swing.JRadioButton();
        roleSelector = new javax.swing.JComboBox<>();
        universityLabel = new javax.swing.JLabel();
        universityField = new javax.swing.JTextField();
        idLabel = new javax.swing.JLabel();
        idField = new javax.swing.JTextField();
        empLabel = new javax.swing.JLabel();
        empField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();

        RegisterButton.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        RegisterButton.setText("Register");
        RegisterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterButtonActionPerformed(evt);
            }
        });

        userNameLabel.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        userNameLabel.setText("Full Name:");

        userNameLabel1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        userNameLabel1.setText("Email:");

        userNameLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        userNameLabel2.setText("Age:");

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel1.setText("Are you a Student or Professor?");

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
        roleSelector.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select your role", "Student", "Professor" }));
        roleSelector.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roleSelectorActionPerformed(evt);
            }
        });

        universityLabel.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        universityLabel.setText("University Name:");

        universityField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                universityFieldActionPerformed(evt);
            }
        });

        idLabel.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        idLabel.setText("ID Number:");

        idField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idFieldActionPerformed(evt);
            }
        });

        empLabel.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        empLabel.setText("Employee ID:");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel5.setText("Password:");

        jTextField5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(roleSelector, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(userNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(userNameLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(userNameLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(idLabel)
                            .addComponent(empLabel)
                            .addComponent(universityLabel)
                            .addComponent(jLabel5)
                            .addComponent(jLabel1))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(userNameField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                    .addComponent(userNameField1, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField5, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(roleYes)
                                        .addGap(18, 18, 18)
                                        .addComponent(roleNo)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(idField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(empField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(universityField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 156, Short.MAX_VALUE))))))
            .addGroup(layout.createSequentialGroup()
                .addGap(306, 306, 306)
                .addComponent(RegisterButton)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(userNameField1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userNameLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userNameLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(roleYes)
                    .addComponent(roleNo))
                .addGap(11, 11, 11)
                .addComponent(roleSelector, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(universityLabel)
                    .addComponent(universityField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idLabel)
                    .addComponent(idField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(empLabel)
                    .addComponent(empField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(RegisterButton)
                .addContainerGap(166, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void RegisterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RegisterButtonActionPerformed

    private void roleYesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roleYesActionPerformed
        // TODO add your handling code here:
        if(roleYes.isSelected() == true)
        {
            roleSelector.setVisible(true);
            
        }
    }//GEN-LAST:event_roleYesActionPerformed

    private void roleSelectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roleSelectorActionPerformed
        // TODO add your handling code here:
        String temp =(String.valueOf(roleSelector.getEditor().getItem()));
        
        if(temp.equals("Student"))
        {
            universityLabel.setVisible(true);
            universityField.setVisible(true);
            idLabel.setVisible(true);
            idField.setVisible(true);
            empLabel.setVisible(false);
            empField.setVisible(false);
        }
        else if(temp.equals("Professor"))
        {
            universityLabel.setVisible(true);
            universityField.setVisible(true);
            empLabel.setVisible(true);
            empField.setVisible(true);
            idLabel.setVisible(false);
            idField.setVisible(false);
        }
        else
        {
            universityLabel.setVisible(false);
            universityField.setVisible(false);
            idLabel.setVisible(false);
            idField.setVisible(false);
            empLabel.setVisible(false);
            empField.setVisible(false);
        }
    }//GEN-LAST:event_roleSelectorActionPerformed

    private void universityFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_universityFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_universityFieldActionPerformed

    private void idFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idFieldActionPerformed

    private void roleNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roleNoActionPerformed
        // TODO add your handling code here:
        if(roleNo.isSelected() == true)
        {
            roleSelector.setVisible(false);
            universityLabel.setVisible(false);
            universityField.setVisible(false);
            idLabel.setVisible(false);
            idField.setVisible(false);
            empLabel.setVisible(false);
            empField.setVisible(false);
        }
    }//GEN-LAST:event_roleNoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton RegisterButton;
    private javax.swing.JTextField empField;
    private javax.swing.JLabel empLabel;
    private javax.swing.JTextField idField;
    private javax.swing.JLabel idLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField5;
    private javax.swing.ButtonGroup roleButtonGroup;
    private javax.swing.JRadioButton roleNo;
    private javax.swing.JComboBox<String> roleSelector;
    private javax.swing.JRadioButton roleYes;
    private javax.swing.JTextField universityField;
    private javax.swing.JLabel universityLabel;
    private javax.swing.JTextField userNameField;
    private javax.swing.JTextField userNameField1;
    private javax.swing.JLabel userNameLabel;
    private javax.swing.JLabel userNameLabel1;
    private javax.swing.JLabel userNameLabel2;
    // End of variables declaration//GEN-END:variables
}
