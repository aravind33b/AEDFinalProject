/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.datamarketplace.ui;
import com.mycompany.datamarketplace.datamodels.feature.survey.SurveyQuestions;
import com.mycompany.datamarketplace.datamodels.university.Student;
import java.awt.CardLayout;
import javax.swing.JSplitPane;
//import com.mycompany.datamarketplace.ui.AvailableSurveyList;
import java.awt.Component;
import java.awt.GridLayout;
import javax.swing.JPanel;

/**
 *
 * @author Admin
 */
public class StudentScreen extends javax.swing.JPanel {

    /**
     * Creates new form StudentScreen
     */
    
    JSplitPane splitPane;
    AvailableSurveyList availableSurvey;
    SurveyCreatingPanel createNewSurvey;
    SurveyQuestions selSurveyData;
    RewardsPanel rewards;
    SupportPane supportRequest;
    AvailableBetaTestingList betaTestingList;
    CreateBetaTestingPanel createBetaTests;
    CardLayout layout;
    int selectedSurveyIndex;
    Student studentObj;
    public StudentScreen(JSplitPane splitPane, Student studentObj) {
        initComponents();
        this.studentObj = studentObj;
        this.splitPane = splitPane;
        availableSurvey = new AvailableSurveyList(studentObj, splitPane);
        createNewSurvey = new SurveyCreatingPanel(studentObj);
        rewards = new RewardsPanel(studentObj);
        supportRequest = new SupportPane(studentObj);
        betaTestingList = new AvailableBetaTestingList();
        createBetaTests = new CreateBetaTestingPanel();
        
        loadStudentDetails(studentObj);
//        StudentScreen.add(layout);
    }
    
//    public StudentScreen(JSplitPane splitPane, AvailableSurveyList surveyTable, SurveyQuestions selSurvey, int surveyIndex) {
//        initComponents();
//        this.splitPane = splitPane;
//        this.surveyTable = surveyTable;
//        this.selSurveyData = selSurvey;
//        this.selectedSurveyIndex = surveyIndex;
//        
////        takeSurveyPanel.add("workArea",surveyTable); 
////        CardLayout layout = (CardLayout) takeSurveyPanel.getLayout();
////        layout.next(takeSurveyPanel);
//    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        profilePanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        userNameLabel = new javax.swing.JLabel();
        firstNameTxt = new javax.swing.JTextField();
        userNameLabel1 = new javax.swing.JLabel();
        emailTxt = new javax.swing.JTextField();
        userNameLabel2 = new javax.swing.JLabel();
        ageTxt = new javax.swing.JTextField();
        universityLabel = new javax.swing.JLabel();
        universityNameTxt = new javax.swing.JTextField();
        idLabel = new javax.swing.JLabel();
        studentIdTxt = new javax.swing.JTextField();
        userNameLabel3 = new javax.swing.JLabel();
        lastNameTxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        phNoLabel = new javax.swing.JLabel();
        phoneNumberTxt = new javax.swing.JTextField();
        genderTxt = new javax.swing.JTextField();
        createSurveyPanel = new javax.swing.JPanel();
        takeSurveyPanel = new javax.swing.JPanel();
        createBetaTest = new javax.swing.JPanel();
        takeBetaTest = new javax.swing.JPanel();
        rewardsPanel = new javax.swing.JPanel();
        supportPanel = new javax.swing.JPanel();

        jTabbedPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPane1MouseClicked(evt);
            }
        });

        profilePanel.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        userNameLabel.setBackground(new java.awt.Color(255, 255, 255));
        userNameLabel.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        userNameLabel.setText("First Name:");

        firstNameTxt.setEditable(false);
        firstNameTxt.setBackground(new java.awt.Color(255, 255, 255));
        firstNameTxt.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        userNameLabel1.setBackground(new java.awt.Color(255, 255, 255));
        userNameLabel1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        userNameLabel1.setText("Email:");

        emailTxt.setEditable(false);
        emailTxt.setBackground(new java.awt.Color(255, 255, 255));
        emailTxt.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        userNameLabel2.setBackground(new java.awt.Color(255, 255, 255));
        userNameLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        userNameLabel2.setText("Age:");

        ageTxt.setEditable(false);
        ageTxt.setBackground(new java.awt.Color(255, 255, 255));
        ageTxt.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        universityLabel.setBackground(new java.awt.Color(255, 255, 255));
        universityLabel.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        universityLabel.setText("University Name:");

        universityNameTxt.setEditable(false);
        universityNameTxt.setBackground(new java.awt.Color(255, 255, 255));
        universityNameTxt.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        universityNameTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                universityNameTxtActionPerformed(evt);
            }
        });

        idLabel.setBackground(new java.awt.Color(255, 255, 255));
        idLabel.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        idLabel.setText("ID Number:");

        studentIdTxt.setEditable(false);
        studentIdTxt.setBackground(new java.awt.Color(255, 255, 255));
        studentIdTxt.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        studentIdTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentIdTxtActionPerformed(evt);
            }
        });

        userNameLabel3.setBackground(new java.awt.Color(255, 255, 255));
        userNameLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        userNameLabel3.setText("Last Name:");

        lastNameTxt.setEditable(false);
        lastNameTxt.setBackground(new java.awt.Color(255, 255, 255));
        lastNameTxt.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setText("Gender:");

        phNoLabel.setBackground(new java.awt.Color(255, 255, 255));
        phNoLabel.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        phNoLabel.setText("Phone Number:");

        phoneNumberTxt.setEditable(false);
        phoneNumberTxt.setBackground(new java.awt.Color(255, 255, 255));
        phoneNumberTxt.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        genderTxt.setEditable(false);
        genderTxt.setBackground(new java.awt.Color(255, 255, 255));
        genderTxt.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(153, 153, 153)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(userNameLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(userNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(userNameLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(userNameLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(phNoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(universityLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(idLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lastNameTxt)
                    .addComponent(emailTxt)
                    .addComponent(ageTxt)
                    .addComponent(firstNameTxt)
                    .addComponent(universityNameTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 305, Short.MAX_VALUE)
                    .addComponent(genderTxt)
                    .addComponent(phoneNumberTxt)
                    .addComponent(studentIdTxt))
                .addGap(103, 103, 103))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(75, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lastNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userNameLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userNameLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ageTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userNameLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(genderTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phoneNumberTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(phNoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(universityLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(universityNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(studentIdTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(130, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout profilePanelLayout = new javax.swing.GroupLayout(profilePanel);
        profilePanel.setLayout(profilePanelLayout);
        profilePanelLayout.setHorizontalGroup(
            profilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1195, Short.MAX_VALUE)
            .addGroup(profilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(profilePanelLayout.createSequentialGroup()
                    .addGap(0, 257, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 258, Short.MAX_VALUE)))
        );
        profilePanelLayout.setVerticalGroup(
            profilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 588, Short.MAX_VALUE)
            .addGroup(profilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(profilePanelLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("Profile", profilePanel);

        createSurveyPanel.setLayout(new java.awt.CardLayout());
        jTabbedPane1.addTab("Create Survey", createSurveyPanel);

        takeSurveyPanel.setLayout(new java.awt.CardLayout());
        jTabbedPane1.addTab("Take Survey", takeSurveyPanel);

        createBetaTest.setLayout(new java.awt.CardLayout());
        jTabbedPane1.addTab("Create Beta Testing", createBetaTest);

        takeBetaTest.setLayout(new java.awt.CardLayout());
        jTabbedPane1.addTab("Beta Testing", takeBetaTest);

        rewardsPanel.setLayout(new java.awt.CardLayout());
        jTabbedPane1.addTab("Rewards", rewardsPanel);

        supportPanel.setLayout(new java.awt.CardLayout());
        jTabbedPane1.addTab("Support", supportPanel);

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

    private void universityNameTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_universityNameTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_universityNameTxtActionPerformed

    private void studentIdTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentIdTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_studentIdTxtActionPerformed

    private void jTabbedPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane1MouseClicked
        //Component AvailableSurveyList;
        // TODO add your handling code here:
        
        createSurveyPanel.add("workArea",createNewSurvey); 
        layout = (CardLayout) createSurveyPanel.getLayout();
        layout.next(createSurveyPanel);
        
        takeSurveyPanel.add("workArea",availableSurvey); 
        layout = (CardLayout) takeSurveyPanel.getLayout();
        layout.next(takeSurveyPanel);
        
        createBetaTest.add("workArea", createBetaTests);
        layout = (CardLayout) createBetaTest.getLayout();
        layout.next(createBetaTest);
        
        takeBetaTest.add("workArea", betaTestingList);
        layout = (CardLayout) takeBetaTest.getLayout();
        layout.next(takeBetaTest);
        
        rewardsPanel.add("workArea",rewards); 
        layout = (CardLayout) rewardsPanel.getLayout();
        layout.next(rewardsPanel);
        
        supportPanel.add("workArea", supportRequest);
        layout = (CardLayout) supportPanel.getLayout();
        layout.next(supportPanel);

//          JPanel panel = new JPanel();
//          panel.setLayout(new GridLayout(2, 1));
////the first number is the number of rows, the second is the number of columns
//
//        JPanel topPanel = new JPanel();
//        JPanel bottomPanel = new JPanel();
//        panel.add(topPanel);
//        panel.add(bottomPanel);
    }//GEN-LAST:event_jTabbedPane1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ageTxt;
    private javax.swing.JPanel createBetaTest;
    private javax.swing.JPanel createSurveyPanel;
    private javax.swing.JTextField emailTxt;
    private javax.swing.JTextField firstNameTxt;
    private javax.swing.JTextField genderTxt;
    private javax.swing.JLabel idLabel;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField lastNameTxt;
    private javax.swing.JLabel phNoLabel;
    private javax.swing.JTextField phoneNumberTxt;
    private javax.swing.JPanel profilePanel;
    private javax.swing.JPanel rewardsPanel;
    private javax.swing.JTextField studentIdTxt;
    private javax.swing.JPanel supportPanel;
    private javax.swing.JPanel takeBetaTest;
    private javax.swing.JPanel takeSurveyPanel;
    private javax.swing.JLabel universityLabel;
    private javax.swing.JTextField universityNameTxt;
    private javax.swing.JLabel userNameLabel;
    private javax.swing.JLabel userNameLabel1;
    private javax.swing.JLabel userNameLabel2;
    private javax.swing.JLabel userNameLabel3;
    // End of variables declaration//GEN-END:variables

    private void loadStudentDetails(Student studentObj) {
        firstNameTxt.setText(studentObj.getFirstName());
        lastNameTxt.setText(studentObj.getLastName());
        emailTxt.setText(studentObj.getEmail());
        ageTxt.setText(String.valueOf(studentObj.getAge()));
        genderTxt.setText(studentObj.getGender());
        phoneNumberTxt.setText(String.valueOf(studentObj.getPhoneNumber()));
        universityNameTxt.setText(studentObj.getUniversityName());
        studentIdTxt.setText(studentObj.getStudentId());
    }
}
