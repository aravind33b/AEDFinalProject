/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.datamarketplace.ui;
import javax.swing.JOptionPane;
import javax.swing.JSplitPane;
import com.mycompany.datamarketplace.datamodels.feature.survey.SurveyQuestions;
import com.mycompany.datamarketplace.ui.StudentScreen;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Admin
 */
public class AvailableSurveyList extends javax.swing.JPanel {

    /**
     * Creates new form AvailableSurveyList
     */
    public AvailableSurveyList() {
        initComponents();
        //StudentScreen studentScreen = new StudentScreen(null, this, selSurvey, selectedRowIndex);
        
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
                .addGroup(availableSurveyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, availableSurveyPanelLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(118, 118, 118))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, availableSurveyPanelLayout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(285, 285, 285))))
        );
        availableSurveyPanelLayout.setVerticalGroup(
            availableSurveyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(availableSurveyPanelLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jButton1)
                .addContainerGap(121, Short.MAX_VALUE))
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
//        int selectedRowIndex = surveyListTable.getSelectedRow();
//
//        if(selectedRowIndex<0)
//        {
//            JOptionPane.showMessageDialog(this, "Please select a survey to take.");
//            return;
//        }
//
//        DefaultTableModel survey = (DefaultTableModel) surveyListTable.getModel();
//        SurveyQuestions selSurvey = (SurveyQuestions) survey.getValueAt(selectedRowIndex, 0);
//
//        StudentScreen studentScreen = new StudentScreen(null, this, selSurvey, selectedRowIndex);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel availableSurveyPanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable surveyListTable;
    // End of variables declaration//GEN-END:variables
}
