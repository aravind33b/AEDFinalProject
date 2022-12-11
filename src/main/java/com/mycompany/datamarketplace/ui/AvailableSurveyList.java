/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.datamarketplace.ui;
import com.mycompany.datamarketplace.backend.DBFeaturesUtils;
import com.mycompany.datamarketplace.datamodels.community.Community;
import com.mycompany.datamarketplace.datamodels.company.Company;
import javax.swing.JOptionPane;
import javax.swing.JSplitPane;
import com.mycompany.datamarketplace.datamodels.feature.survey.SurveyQuestions;
import com.mycompany.datamarketplace.datamodels.university.Student;
import com.mycompany.datamarketplace.ui.StudentScreen;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Admin
 */
public class AvailableSurveyList extends javax.swing.JPanel {

    /**
     * Creates new form AvailableSurveyList
     */
    JSplitPane splitPane;
    DBFeaturesUtils dbFeaturesUtils = new DBFeaturesUtils();
    ArrayList<SurveyQuestions> surveyList = dbFeaturesUtils.retrieveAllSurveyList();
    String ownerOfTheEmail = "";
    public AvailableSurveyList() {
        initComponents();
        
    }
    
    Student studentObj;
    public AvailableSurveyList(Student studentObj, JSplitPane splitPane) {
        initComponents();
        this.studentObj = studentObj;
        this.splitPane = splitPane;
        ownerOfTheEmail = studentObj.getEmail();
        populateSurveyTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        availableSurveyPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        surveyListTable = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        surveyListTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "SurveyID", "Survey Title"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(surveyListTable);

        jButton1.setText("Take Survey");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout availableSurveyPanelLayout = new javax.swing.GroupLayout(availableSurveyPanel);
        availableSurveyPanel.setLayout(availableSurveyPanelLayout);
        availableSurveyPanelLayout.setHorizontalGroup(
            availableSurveyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(availableSurveyPanelLayout.createSequentialGroup()
                .addContainerGap(134, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(118, 118, 118))
            .addGroup(availableSurveyPanelLayout.createSequentialGroup()
                .addGap(297, 297, 297)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        availableSurveyPanelLayout.setVerticalGroup(
            availableSurveyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(availableSurveyPanelLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(136, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 704, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(availableSurveyPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 516, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(availableSurveyPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        int selectedRowInd = surveyListTable.getSelectedRow();
        
        if(selectedRowInd < 0){
            JOptionPane.showMessageDialog(this, "Please select a row");
            return;
        }
        
        DefaultTableModel tableModel = (DefaultTableModel) surveyListTable.getModel();
        SurveyQuestions selectedSurvey = (SurveyQuestions)tableModel.getValueAt(selectedRowInd, 0);
        TakeSurveyPane takeSurvey;
        if(studentObj!=null){
            takeSurvey = new TakeSurveyPane(splitPane, studentObj, selectedSurvey);
            splitPane.setBottomComponent(takeSurvey);
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel availableSurveyPanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable surveyListTable;
    // End of variables declaration//GEN-END:variables

    private void populateSurveyTable() {
        DefaultTableModel tableModel = (DefaultTableModel) surveyListTable.getModel();
        tableModel.setRowCount(0 );
        
        for(SurveyQuestions itr: surveyList){
            
            if(itr!=null && !itr.getOwner().equalsIgnoreCase(ownerOfTheEmail)){
                Object[] rowOfRecord =  new Object[5];
                rowOfRecord[0] = itr;
                tableModel.addRow(rowOfRecord); 
        }
        }
    }
}
