/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.datamarketplace.ui;

import com.mycompany.datamarketplace.datamodels.feature.survey.SurveyQuestions;
import com.mycompany.datamarketplace.datamodels.Person;
import java.awt.CardLayout;
import java.awt.Component;
import java.awt.GridLayout;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
/**
 *
 * @author Admin
 */
public class GeneralUserScreen extends javax.swing.JPanel {

    /**
     * Creates new form GeneralUserScreen
     */
    
    JSplitPane splitPane;
    AvailableSurveyList availableSurvey;
    SurveyCreatingPanel createSurvey;
    RewardsPanel rewardsScreen;
    SurveyQuestions selSurveyData;
    SupportPane supportPanel;
    int selectedSurveyIndex;
    CardLayout layout;
    Person personObj;
    
    public GeneralUserScreen(JSplitPane splitPane, Person personObj) {
        initComponents();
        this.splitPane = splitPane;
        this.personObj = personObj;
        availableSurvey = new AvailableSurveyList(personObj, splitPane);
        createSurvey = new SurveyCreatingPanel(personObj);
        rewardsScreen = new RewardsPanel();
        supportPanel = new SupportPane(personObj);
        loadPersonDetails(personObj);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GeneralUser = new javax.swing.JTabbedPane();
        Profile = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        userNameLabel = new javax.swing.JLabel();
        firstNameTxt = new javax.swing.JTextField();
        userNameLabel1 = new javax.swing.JLabel();
        emailTxt = new javax.swing.JTextField();
        userNameLabel2 = new javax.swing.JLabel();
        ageTxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        passwordTxt = new javax.swing.JTextField();
        userNameLabel3 = new javax.swing.JLabel();
        lastNameTxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        phNoLabel = new javax.swing.JLabel();
        phoneNumberTxt = new javax.swing.JTextField();
        genderTxt = new javax.swing.JTextField();
        CreateSurvey = new javax.swing.JPanel();
        Reward = new javax.swing.JPanel();
        TakeSurvey = new javax.swing.JPanel();
        Support = new javax.swing.JPanel();

        GeneralUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                GeneralUserMouseClicked(evt);
            }
        });

        Profile.setLayout(new java.awt.CardLayout());

        userNameLabel.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        userNameLabel.setText("First Name:");

        firstNameTxt.setEditable(false);

        userNameLabel1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        userNameLabel1.setText("Email:");

        emailTxt.setEditable(false);

        userNameLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        userNameLabel2.setText("Age:");

        ageTxt.setEditable(false);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel5.setText("Password:");

        passwordTxt.setEditable(false);
        passwordTxt.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        userNameLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        userNameLabel3.setText("Last Name:");

        lastNameTxt.setEditable(false);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setText("Gender:");

        phNoLabel.setText("Phone Number:");

        phoneNumberTxt.setEditable(false);

        genderTxt.setEditable(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(255, 255, 255)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(userNameLabel3)
                    .addComponent(userNameLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(userNameLabel2)
                    .addComponent(phNoLabel)
                    .addComponent(jLabel2)
                    .addComponent(userNameLabel))
                .addGap(73, 73, 73)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lastNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emailTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(ageTxt, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(passwordTxt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(genderTxt, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(phoneNumberTxt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(firstNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(299, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(userNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(userNameLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(userNameLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(firstNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lastNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(emailTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(passwordTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(userNameLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ageTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(genderTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(phNoLabel)
                    .addComponent(phoneNumberTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(202, Short.MAX_VALUE))
        );

        Profile.add(jPanel3, "card2");

        GeneralUser.addTab("Profile", Profile);

        CreateSurvey.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                CreateSurveyFocusGained(evt);
            }
        });
        CreateSurvey.setLayout(new java.awt.CardLayout());
        GeneralUser.addTab("Create Survey", CreateSurvey);

        Reward.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                RewardFocusGained(evt);
            }
        });
        Reward.setLayout(new java.awt.CardLayout());
        GeneralUser.addTab("Reward", Reward);

        TakeSurvey.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TakeSurveyFocusGained(evt);
            }
        });
        TakeSurvey.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TakeSurveyMouseClicked(evt);
            }
        });
        TakeSurvey.setLayout(new java.awt.CardLayout());
        GeneralUser.addTab("Take Survey", TakeSurvey);

        Support.setLayout(new java.awt.CardLayout());
        GeneralUser.addTab("Support", Support);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(GeneralUser)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(GeneralUser, javax.swing.GroupLayout.PREFERRED_SIZE, 602, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void TakeSurveyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TakeSurveyMouseClicked
        // TODO add your handling code here:
        TakeSurvey.add("TakeSurvey",availableSurvey); 
        CardLayout layout = (CardLayout) TakeSurvey.getLayout();
        layout.next(TakeSurvey);
    }//GEN-LAST:event_TakeSurveyMouseClicked

    private void GeneralUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GeneralUserMouseClicked
        // TODO add your handling code here:
        CreateSurvey.add("CreateSurvey",createSurvey); 
         layout = (CardLayout) CreateSurvey.getLayout();
        layout.next(CreateSurvey);
        
        TakeSurvey.add("TakeSurvey",availableSurvey); 
         layout = (CardLayout) TakeSurvey.getLayout();
        layout.next(TakeSurvey);
        
        Reward.add("Rewards",rewardsScreen); 
         layout = (CardLayout) Reward.getLayout();
        layout.next(Reward);
        
        Support.add("Support",supportPanel); 
        layout = (CardLayout) Support.getLayout();
        layout.next(Support);
        
        
//        TakeSurvey.add("workArea",availableSurvey); 
//        CardLayout layout = (CardLayout) TakeSurvey.getLayout();
//        layout.next(TakeSurvey);
    }//GEN-LAST:event_GeneralUserMouseClicked

    private void TakeSurveyFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TakeSurveyFocusGained
        // TODO add your handling code here:
        
    }//GEN-LAST:event_TakeSurveyFocusGained

    private void CreateSurveyFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CreateSurveyFocusGained
        // TODO add your handling code here:
        
    }//GEN-LAST:event_CreateSurveyFocusGained

    private void RewardFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_RewardFocusGained
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_RewardFocusGained


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CreateSurvey;
    private javax.swing.JTabbedPane GeneralUser;
    private javax.swing.JPanel Profile;
    private javax.swing.JPanel Reward;
    private javax.swing.JPanel Support;
    private javax.swing.JPanel TakeSurvey;
    private javax.swing.JTextField ageTxt;
    private javax.swing.JTextField emailTxt;
    private javax.swing.JTextField firstNameTxt;
    private javax.swing.JTextField genderTxt;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField lastNameTxt;
    private javax.swing.JTextField passwordTxt;
    private javax.swing.JLabel phNoLabel;
    private javax.swing.JTextField phoneNumberTxt;
    private javax.swing.JLabel userNameLabel;
    private javax.swing.JLabel userNameLabel1;
    private javax.swing.JLabel userNameLabel2;
    private javax.swing.JLabel userNameLabel3;
    // End of variables declaration//GEN-END:variables

private void loadPersonDetails(Person personObj) {
        firstNameTxt.setText(personObj.getFirstName());
        lastNameTxt.setText(personObj.getLastName());
        emailTxt.setText(personObj.getEmail());
        ageTxt.setText(String.valueOf(personObj.getAge()));
        genderTxt.setText(personObj.getGender());
        phoneNumberTxt.setText(String.valueOf(personObj.getPhoneNumber()));
        
    }
}
