/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.datamarketplace.ui;

import com.mycompany.datamarketplace.datamodels.Person;
import com.mycompany.datamarketplace.datamodels.community.Developer;
import com.mycompany.datamarketplace.datamodels.university.Student;
import java.util.regex.Pattern;
import com.sendgrid.*;
import com.sendgrid.helpers.mail.Mail;
import com.sendgrid.helpers.mail.objects.*;
import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class SupportPane extends javax.swing.JPanel {

    /**
     * Creates new form SupportPane
     */
    public static final String ACCOUNT_SID = "";
    public static final String AUTH_TOKEN = "";
    public SupportPane() {
        initComponents();
    }
     Person personObj;
     
     public SupportPane(Person personObj) {
        initComponents();
        this.personObj = personObj;
    }
     
     Student studentObj;
     public SupportPane(Student studentObject) {
        initComponents();
        this.studentObj = studentObject;
    }
     
     Developer developerObj;
     public SupportPane(Developer developerObj) {
        initComponents();
        this.developerObj = developerObj;
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
        jLabel1 = new javax.swing.JLabel();
        subjectTxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        bodyTxt = new javax.swing.JTextArea();
        sendSupportBtn = new javax.swing.JButton();
        validationLbl = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        emailTxt.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        emailTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                emailTxtKeyReleased(evt);
            }
        });

        jLabel1.setBackground(java.awt.Color.white);
        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel1.setText("Your Email:");

        subjectTxt.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        subjectTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subjectTxtActionPerformed(evt);
            }
        });

        jLabel2.setBackground(java.awt.Color.white);
        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setText("Subject:");

        jLabel3.setBackground(java.awt.Color.white);
        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setText("Describe your issue:");

        jScrollPane1.setBackground(java.awt.Color.white);

        bodyTxt.setColumns(20);
        bodyTxt.setRows(5);
        jScrollPane1.setViewportView(bodyTxt);

        sendSupportBtn.setBackground(java.awt.Color.white);
        sendSupportBtn.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        sendSupportBtn.setText("Send Support request");
        sendSupportBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendSupportBtnActionPerformed(evt);
            }
        });

        validationLbl.setBackground(java.awt.Color.white);
        validationLbl.setForeground(new java.awt.Color(255, 51, 51));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(164, 164, 164)
                .addComponent(validationLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(464, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(sendSupportBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(subjectTxt)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(emailTxt)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(352, 352, 352))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(emailTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(subjectTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(sendSupportBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(validationLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(95, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void emailTxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_emailTxtKeyReleased
        // TODO add your handling code here:
        String e = emailTxt.getText();
       
        if(Pattern.matches("^(.+)@(\\S+)$", e)){
              validationLbl.setText("");
              sendSupportBtn.setEnabled(true);
         }
        else{
            validationLbl.setText("You must enter valid Email address");
            sendSupportBtn.setEnabled(false);
        }
    }//GEN-LAST:event_emailTxtKeyReleased

    private void sendSupportBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendSupportBtnActionPerformed
        // TODO add your handling code here:
        String emailAddressToBeSent = emailTxt.getText();
        String subjectOfTheEmail = subjectTxt.getText();
        String bodyOfTheEmail = bodyTxt.getText();
        String phoneNumberForSMS = "";
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
        
        if(personObj!=null){
            phoneNumberForSMS = personObj.getPhoneNumber();
        }
        
        if(studentObj!=null){
            phoneNumberForSMS = studentObj.getPhoneNumber();
        }
        
        
        System.out.println(phoneNumberForSMS);
        if(subjectOfTheEmail.isBlank() || subjectOfTheEmail.isEmpty()){
            JOptionPane.showMessageDialog(this, "Please fill email address");
            return;
        }
        
        if(subjectOfTheEmail.isBlank() || subjectOfTheEmail.isEmpty()){
            JOptionPane.showMessageDialog(this, "Please fill email address");
            return;
        }
        
        if(subjectOfTheEmail.isBlank() || subjectOfTheEmail.isEmpty()){
            JOptionPane.showMessageDialog(this, "Please fill email address");
            return;
        }
        
        System.out.println(bodyOfTheEmail);
        
        if(personObj!=null && personObj.getEmail().equalsIgnoreCase("kumar.anuj@northeastern.edu")){
            Message message = Message.creator(
                new PhoneNumber(phoneNumberForSMS),
                new PhoneNumber("+16692198128"), 
                bodyOfTheEmail).create();
            
            System.out.println(message.getSid());
        }
        
        if(studentObj!=null && studentObj.getEmail().equalsIgnoreCase("gururaj.b@northeastern.edu")){
            Message message = Message.creator(
                new PhoneNumber(phoneNumberForSMS),
                new PhoneNumber("+16692198128"), 
                bodyOfTheEmail).create();
            
            System.out.println(message.getSid());
        }
   
        try{
            
            Email from = new Email("murali.s@dewborn.com");
            Email to = new Email(emailAddressToBeSent); // To

            String subject = subjectOfTheEmail;
            Content content = new Content("text/html", bodyOfTheEmail);

            Mail mail = new Mail(from, subject, to, content);

            SendGrid sg = new SendGrid("");
            Request request = new Request();

            request.setMethod(Method.POST);
            request.setEndpoint("mail/send");
            request.setBody(mail.build());

            Response response = sg.api(request);
            
            System.out.println(response.getStatusCode());
            System.out.println(response.getHeaders());
            System.out.println(response.getBody());
            JOptionPane.showMessageDialog(this, "Details of the ticket sent to your email. Please check spam folder too");
            emailTxt.setText("");
            subjectTxt.setText("");
            bodyTxt.setText("");
       }
       catch(IOException e){
           System.out.println("Error occured at sending email" + e);
       }
        
    }//GEN-LAST:event_sendSupportBtnActionPerformed

    private void subjectTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subjectTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_subjectTxtActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea bodyTxt;
    private javax.swing.JTextField emailTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton sendSupportBtn;
    private javax.swing.JTextField subjectTxt;
    private javax.swing.JLabel validationLbl;
    // End of variables declaration//GEN-END:variables
}
