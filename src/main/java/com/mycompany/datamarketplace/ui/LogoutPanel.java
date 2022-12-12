
package com.mycompany.datamarketplace.ui;
import javax.swing.JSplitPane;
import com.mycompany.datamarketplace.datamodels.university.Student;
import java.awt.Cursor;


public class LogoutPanel extends javax.swing.JPanel {

    JSplitPane splitPane;
    Student studentObject;
    
    public LogoutPanel(JSplitPane splitPane, Student studentObject) {
        initComponents();
        this.splitPane = splitPane;
        studentObject = studentObject;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        logoutBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(153, 204, 255));

        logoutBtn.setBackground(new java.awt.Color(255, 255, 255));
        logoutBtn.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        logoutBtn.setText("Logout");
        logoutBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                logoutBtnMouseEntered(evt);
            }
        });
        logoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutBtnActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/static/headerTitle.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 373, Short.MAX_VALUE)
                .addComponent(logoutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(logoutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void logoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBtnActionPerformed
        // TODO add your handling code here:
        studentObject = null;
        DefaultTopPanel defaultTop = new DefaultTopPanel(splitPane);
        DefaultBottomPanel defaultpane = new DefaultBottomPanel();
        splitPane.setTopComponent(defaultTop);
        splitPane.setBottomComponent(defaultpane);
    }//GEN-LAST:event_logoutBtnActionPerformed

    private void logoutBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutBtnMouseEntered
        // TODO add your handling code here:
        logoutBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_logoutBtnMouseEntered


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton logoutBtn;
    // End of variables declaration//GEN-END:variables
}
