package view.CRUD_View;

import model.Department;
import service.DepartmentService;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Department_Add extends javax.swing.JFrame {

        public Department_Add() {
                initComponents();
        }

        @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                jPanel1_12 = new javax.swing.JPanel();
                jPanel2_12 = new javax.swing.JPanel();
                jLabel1_12 = new javax.swing.JLabel();
                Add_Button_12 = new javax.swing.JButton();
                jLabel2_12 = new javax.swing.JLabel();
                name_TextFiled_12 = new javax.swing.JTextField();

                setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

                jPanel1_12.setBackground(new java.awt.Color(255, 255, 255));

                jPanel2_12.setBackground(new java.awt.Color(0, 204, 153));

                jLabel1_12.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
                jLabel1_12.setForeground(new java.awt.Color(255, 255, 255));
                jLabel1_12.setText("Add Department");

                javax.swing.GroupLayout jPanel2_12Layout = new javax.swing.GroupLayout(jPanel2_12);
                jPanel2_12.setLayout(jPanel2_12Layout);
                jPanel2_12Layout.setHorizontalGroup(
                        jPanel2_12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2_12Layout.createSequentialGroup()
                                .addGap(90, 90, 90)
                                .addComponent(jLabel1_12)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                );
                jPanel2_12Layout.setVerticalGroup(
                        jPanel2_12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2_12Layout.createSequentialGroup()
                                .addContainerGap(33, Short.MAX_VALUE)
                                .addComponent(jLabel1_12)
                                .addGap(26, 26, 26))
                );

                Add_Button_12.setBackground(new java.awt.Color(0, 204, 153));
                Add_Button_12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                Add_Button_12.setForeground(new java.awt.Color(255, 255, 255));
                Add_Button_12.setText("ADD");
                Add_Button_12.setMaximumSize(new java.awt.Dimension(100, 40));
                Add_Button_12.setPreferredSize(new java.awt.Dimension(75, 30));
                Add_Button_12.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                Add_Button_12MouseClicked(evt);
                        }
                });

                jLabel2_12.setForeground(new java.awt.Color(0, 0, 0));
                jLabel2_12.setText("Name:");

                javax.swing.GroupLayout jPanel1_12Layout = new javax.swing.GroupLayout(jPanel1_12);
                jPanel1_12.setLayout(jPanel1_12Layout);
                jPanel1_12Layout.setHorizontalGroup(
                        jPanel1_12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel2_12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1_12Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addGroup(jPanel1_12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2_12, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(name_TextFiled_12, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(53, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1_12Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Add_Button_12, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(21, 21, 21))
                );
                jPanel1_12Layout.setVerticalGroup(
                        jPanel1_12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1_12Layout.createSequentialGroup()
                                .addComponent(jPanel2_12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(jLabel2_12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(name_TextFiled_12, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)
                                .addComponent(Add_Button_12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(21, Short.MAX_VALUE))
                );

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1_12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1_12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                );

                pack();
                setLocationRelativeTo(null);
        }// </editor-fold>//GEN-END:initComponents

    private void Add_Button_12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Add_Button_12MouseClicked
            DepartmentService dep12artmentService12;
            dep12artmentService12 = new DepartmentService();
            Department dep12 = new Department();
            dep12.setDepartment_Name(name_TextFiled_12.getText());
            try {
                    dep12artmentService12.addDepartment(dep12);
                    this.dispose();
            } catch (SQLException ex) {
                    Logger.getLogger(Department_Add.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_Add_Button_12MouseClicked

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JButton Add_Button_12;
        private javax.swing.JLabel jLabel1_12;
        private javax.swing.JLabel jLabel2_12;
        private javax.swing.JPanel jPanel1_12;
        private javax.swing.JPanel jPanel2_12;
        private javax.swing.JTextField name_TextFiled_12;
        // End of variables declaration//GEN-END:variables
}
