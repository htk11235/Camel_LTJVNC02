package view.CRUD_View;

import model.Department;
import service.DepartmentService;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Department_Edit extends javax.swing.JFrame {

        private int x12;
        DepartmentService departmentService12;

        public Department_Edit(int id12) {
                initComponents();

                x12 = id12;
                departmentService12 = new DepartmentService();
                jLabel_Id_12.setText(String.valueOf(x12));
                try {
                        name_TextFiled_12.setText(departmentService12.getDepartmentById(x12).getDepartment_Name());
                } catch (SQLException ex) {
                        Logger.getLogger(Department_Edit.class.getName()).log(Level.SEVERE, null, ex);
                }
        }

        @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                jPanel1_12 = new javax.swing.JPanel();
                jPanel2_12 = new javax.swing.JPanel();
                jLabel1_12 = new javax.swing.JLabel();
                Edit_Button_12 = new javax.swing.JButton();
                jLabel2_12 = new javax.swing.JLabel();
                name_TextFiled_12 = new javax.swing.JTextField();
                jLabel3_12 = new javax.swing.JLabel();
                jLabel_Id_12 = new javax.swing.JLabel();

                setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

                jPanel1_12.setBackground(new java.awt.Color(255, 255, 255));

                jPanel2_12.setBackground(new java.awt.Color(51, 153, 255));

                jLabel1_12.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
                jLabel1_12.setForeground(new java.awt.Color(255, 255, 255));
                jLabel1_12.setText("Edit Department");

                javax.swing.GroupLayout jPanel2_12Layout = new javax.swing.GroupLayout(jPanel2_12);
                jPanel2_12.setLayout(jPanel2_12Layout);
                jPanel2_12Layout.setHorizontalGroup(
                        jPanel2_12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2_12Layout.createSequentialGroup()
                                .addGap(90, 90, 90)
                                .addComponent(jLabel1_12)
                                .addContainerGap(90, Short.MAX_VALUE))
                );
                jPanel2_12Layout.setVerticalGroup(
                        jPanel2_12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2_12Layout.createSequentialGroup()
                                .addContainerGap(33, Short.MAX_VALUE)
                                .addComponent(jLabel1_12)
                                .addGap(26, 26, 26))
                );

                Edit_Button_12.setBackground(new java.awt.Color(51, 153, 255));
                Edit_Button_12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                Edit_Button_12.setForeground(new java.awt.Color(255, 255, 255));
                Edit_Button_12.setText("Edit");
                Edit_Button_12.setMaximumSize(new java.awt.Dimension(100, 40));
                Edit_Button_12.setPreferredSize(new java.awt.Dimension(75, 30));
                Edit_Button_12.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                Edit_Button_12MouseClicked(evt);
                        }
                });
                Edit_Button_12.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                Edit_Button_12ActionPerformed(evt);
                        }
                });

                jLabel2_12.setForeground(new java.awt.Color(0, 0, 0));
                jLabel2_12.setText("Name:");

                jLabel3_12.setForeground(new java.awt.Color(0, 0, 0));
                jLabel3_12.setText("Id:");

                jLabel_Id_12.setText("0");

                javax.swing.GroupLayout jPanel1_12Layout = new javax.swing.GroupLayout(jPanel1_12);
                jPanel1_12.setLayout(jPanel1_12Layout);
                jPanel1_12Layout.setHorizontalGroup(
                        jPanel1_12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel2_12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1_12Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Edit_Button_12, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(21, 21, 21))
                        .addGroup(jPanel1_12Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(jPanel1_12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1_12Layout.createSequentialGroup()
                                                .addComponent(jLabel3_12, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel_Id_12, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jLabel2_12, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(name_TextFiled_12, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                );
                jPanel1_12Layout.setVerticalGroup(
                        jPanel1_12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1_12Layout.createSequentialGroup()
                                .addComponent(jPanel2_12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1_12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel3_12)
                                        .addComponent(jLabel_Id_12))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2_12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(name_TextFiled_12, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Edit_Button_12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void Edit_Button_12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Edit_Button_12MouseClicked
            DepartmentService departmentService12;
            departmentService12 = new DepartmentService();
            Department dep12 = new Department();
            dep12.setDepartment_Name(name_TextFiled_12.getText());
            try {
                    departmentService12.addDepartment(dep12);
                    this.dispose();
            } catch (SQLException ex) {
                    Logger.getLogger(Department_Add.class.getName()).log(Level.SEVERE, null, ex);
            }

    }//GEN-LAST:event_Edit_Button_12MouseClicked

    private void Edit_Button_12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Edit_Button_12ActionPerformed

            Department dep12 = new Department();

            dep12.setDepartment_Id(x12);
            dep12.setDepartment_Name(name_TextFiled_12.getText());

            try {
                    departmentService12.updateDepartment(dep12);
                    this.dispose();
            } catch (SQLException ex) {
                    Logger.getLogger(Department_Add.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_Edit_Button_12ActionPerformed

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JButton Edit_Button_12;
        private javax.swing.JLabel jLabel1_12;
        private javax.swing.JLabel jLabel2_12;
        private javax.swing.JLabel jLabel3_12;
        private javax.swing.JLabel jLabel_Id_12;
        private javax.swing.JPanel jPanel1_12;
        private javax.swing.JPanel jPanel2_12;
        private javax.swing.JTextField name_TextFiled_12;
        // End of variables declaration//GEN-END:variables
}
