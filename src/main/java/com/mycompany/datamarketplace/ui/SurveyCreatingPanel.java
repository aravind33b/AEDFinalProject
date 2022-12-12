/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.datamarketplace.ui;

import com.mycompany.datamarketplace.backend.DBFeaturesUtils;
import com.mycompany.datamarketplace.datamodels.Person;
import com.mycompany.datamarketplace.datamodels.community.Developer;
import com.mycompany.datamarketplace.datamodels.university.Professor;
import com.mycompany.datamarketplace.datamodels.university.Student;
import javax.swing.JOptionPane;

public class SurveyCreatingPanel extends javax.swing.JPanel {

    /**
     * Creates new form SurveyCreatinPane
     */
    DBFeaturesUtils dbFeaturesUtils = new DBFeaturesUtils();
    public SurveyCreatingPanel() {
        initComponents();
    }
    
    Student studentObj;
    public SurveyCreatingPanel(Student studentObj) {
        initComponents();
        this.studentObj = studentObj;
    }
    
    Professor professorObj;
    public SurveyCreatingPanel(Professor professorObj) {
        initComponents();
        this.professorObj = professorObj;
    }
    
    Developer developerObj;
    public SurveyCreatingPanel(Developer developerObj) {
        initComponents();
        this.developerObj = developerObj;
    }
    
    Person personObj;
    public SurveyCreatingPanel(Person personObj) {
        initComponents();
        this.personObj = personObj;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea4 = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextArea5 = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        publishSurveyBtn = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel1.setText("Q1. Descriptive");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setText("Q2. Descriptive");

        jTextArea3.setColumns(20);
        jTextArea3.setRows(5);
        jScrollPane3.setViewportView(jTextArea3);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setText("Q3. Descriptive");

        jTextArea4.setColumns(20);
        jTextArea4.setRows(5);
        jScrollPane4.setViewportView(jTextArea4);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel4.setText("Q4. Opinion (Agree/Disagree)");

        jTextArea5.setColumns(20);
        jTextArea5.setRows(5);
        jScrollPane5.setViewportView(jTextArea5);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel5.setText("Q5. Opinion (Agree/Disagree)");

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton1.setText("Discard");

        publishSurveyBtn.setBackground(new java.awt.Color(255, 255, 255));
        publishSurveyBtn.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        publishSurveyBtn.setText("Publish Survey");
        publishSurveyBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                publishSurveyBtnActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel6.setText("Survey Title");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(213, 213, 213)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(publishSurveyBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(28, 28, 28)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(28, 28, 28)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(28, 28, 28)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(28, 28, 28)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(28, 28, 28)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jScrollPane1)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(407, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(publishSurveyBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(44, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void publishSurveyBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_publishSurveyBtnActionPerformed
        // TODO add your handling code here:
    if (studentObj!=null){
        String surveyTitle = jTextField1.getText();
        String surveyQuestion1 = jTextArea1.getText();
        String surveyQuestion2 = jTextArea2.getText();
        String surveyQuestion3 = jTextArea3.getText();
        String surveyQuestion4 = jTextArea4.getText();
        String surveyQuestion5 = jTextArea5.getText();
        String owner = studentObj.getEmail();
        
        Boolean isSuccess = dbFeaturesUtils.createSurvey(
                surveyTitle,
                surveyQuestion1,
                surveyQuestion2,
                surveyQuestion3,
                surveyQuestion4,
                surveyQuestion5,
                owner
        );
        
        if(isSuccess){
            JOptionPane.showMessageDialog(this, "Survey created successfully");
            jTextField1.setText("");
            jTextArea1.setText("");
            jTextArea2.setText("");
            jTextArea3.setText("");
            jTextArea4.setText("");
            jTextArea5.setText("");
            return;    
        }
        
        else{
            JOptionPane.showMessageDialog(this, "Survey not created");
            return;  
        }
    }
    else if(professorObj!=null){
        String surveyTitle = jTextField1.getText();
        String surveyQuestion1 = jTextArea1.getText();
        String surveyQuestion2 = jTextArea2.getText();
        String surveyQuestion3 = jTextArea3.getText();
        String surveyQuestion4 = jTextArea4.getText();
        String surveyQuestion5 = jTextArea5.getText();
        String owner = professorObj.getEmail();
        
        Boolean isSuccess = dbFeaturesUtils.createSurvey(
                surveyTitle,
                surveyQuestion1,
                surveyQuestion2,
                surveyQuestion3,
                surveyQuestion4,
                surveyQuestion5,
                owner
        );
        
        if(isSuccess){
            JOptionPane.showMessageDialog(this, "Survey created successfully");
            jTextField1.setText("");
            jTextArea1.setText("");
            jTextArea2.setText("");
            jTextArea3.setText("");
            jTextArea4.setText("");
            jTextArea5.setText("");
            return;    
        }
        
        else{
            JOptionPane.showMessageDialog(this, "Survey not created");
            return;  
        }
    }
    else if(developerObj!=null){
        String surveyTitle = jTextField1.getText();
        String surveyQuestion1 = jTextArea1.getText();
        String surveyQuestion2 = jTextArea2.getText();
        String surveyQuestion3 = jTextArea3.getText();
        String surveyQuestion4 = jTextArea4.getText();
        String surveyQuestion5 = jTextArea5.getText();
        String owner = developerObj.getEmail();
        
        Boolean isSuccess = dbFeaturesUtils.createSurvey(
                surveyTitle,
                surveyQuestion1,
                surveyQuestion2,
                surveyQuestion3,
                surveyQuestion4,
                surveyQuestion5,
                owner
        );
        
        if(isSuccess){
            JOptionPane.showMessageDialog(this, "Survey created successfully");
            jTextField1.setText("");
            jTextArea1.setText("");
            jTextArea2.setText("");
            jTextArea3.setText("");
            jTextArea4.setText("");
            jTextArea5.setText("");
            return;    
        }
        
        else{
            JOptionPane.showMessageDialog(this, "Survey not created");
            return;  
        }
    }
    else if(personObj!=null){
        String surveyTitle = jTextField1.getText();
        String surveyQuestion1 = jTextArea1.getText();
        String surveyQuestion2 = jTextArea2.getText();
        String surveyQuestion3 = jTextArea3.getText();
        String surveyQuestion4 = jTextArea4.getText();
        String surveyQuestion5 = jTextArea5.getText();
        String owner = personObj.getEmail();
        
        Boolean isSuccess = dbFeaturesUtils.createSurvey(
                surveyTitle,
                surveyQuestion1,
                surveyQuestion2,
                surveyQuestion3,
                surveyQuestion4,
                surveyQuestion5,
                owner
        );
        
        if(isSuccess){
            JOptionPane.showMessageDialog(this, "Survey created successfully");
            jTextField1.setText("");
            jTextArea1.setText("");
            jTextArea2.setText("");
            jTextArea3.setText("");
            jTextArea4.setText("");
            jTextArea5.setText("");
            return;    
        }
        
        else{
            JOptionPane.showMessageDialog(this, "Survey not created");
            return;  
        }
    }
    else{
        JOptionPane.showMessageDialog(this, "Please login again!!!");
            return;
    }
        
    }//GEN-LAST:event_publishSurveyBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextArea jTextArea4;
    private javax.swing.JTextArea jTextArea5;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton publishSurveyBtn;
    // End of variables declaration//GEN-END:variables
}
