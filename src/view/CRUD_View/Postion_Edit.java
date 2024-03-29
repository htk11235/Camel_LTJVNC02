package view.CRUD_View;

import model.Postion;
import service.PostionService;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Postion_Edit extends javax.swing.JFrame {

        private int x;
        PostionService postionService;

        public Postion_Edit(int id) {
                x = id;
                postionService = new PostionService();
                initComponents();
                jLabel_Id_16.setText(String.valueOf(x));

                try {
                        name_TextFiled_16.setText(postionService.getPostionById(x).getPostion_Name());
                } catch (SQLException ex) {
                        Logger.getLogger(Postion_Edit.class.getName()).log(Level.SEVERE, null, ex);
                }

        }

        @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                jPanel1 = new javax.swing.JPanel();
                jPanel2 = new javax.swing.JPanel();
                jLabel1 = new javax.swing.JLabel();
                Edit_Button_16 = new javax.swing.JButton();
                jLabel2 = new javax.swing.JLabel();
                name_TextFiled_16 = new javax.swing.JTextField();
                jLabel3 = new javax.swing.JLabel();
                jLabel_Id_16 = new javax.swing.JLabel();

                setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

                jPanel1.setBackground(new java.awt.Color(255, 255, 255));

                jPanel2.setBackground(new java.awt.Color(51, 153, 255));

                jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
                jLabel1.setForeground(new java.awt.Color(255, 255, 255));
                jLabel1.setText("Edit Postion");

                javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
                jPanel2.setLayout(jPanel2Layout);
                jPanel2Layout.setHorizontalGroup(
                        jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1)
                                .addGap(114, 114, 114))
                );
                jPanel2Layout.setVerticalGroup(
                        jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addContainerGap(34, Short.MAX_VALUE)
                                .addComponent(jLabel1)
                                .addGap(25, 25, 25))
                );

                Edit_Button_16.setBackground(new java.awt.Color(51, 153, 255));
                Edit_Button_16.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                Edit_Button_16.setForeground(new java.awt.Color(255, 255, 255));
                Edit_Button_16.setText("Edit");
                Edit_Button_16.setMaximumSize(new java.awt.Dimension(100, 40));
                Edit_Button_16.setPreferredSize(new java.awt.Dimension(75, 30));
                Edit_Button_16.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                Edit_Button_16MouseClicked(evt);
                        }
                });
                Edit_Button_16.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                Edit_Button_16ActionPerformed(evt);
                        }
                });

                jLabel2.setForeground(new java.awt.Color(0, 0, 0));
                jLabel2.setText("Name:");

                jLabel3.setForeground(new java.awt.Color(0, 0, 0));
                jLabel3.setText("Id:");

                jLabel_Id_16.setText("0");

                javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
                jPanel1.setLayout(jPanel1Layout);
                jPanel1Layout.setHorizontalGroup(
                        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Edit_Button_16, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(21, 21, 21))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel_Id_16, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(name_TextFiled_16, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(52, Short.MAX_VALUE))
                );
                jPanel1Layout.setVerticalGroup(
                        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel_Id_16))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(name_TextFiled_16, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Edit_Button_16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(21, Short.MAX_VALUE))
                );

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                );

                pack();
                setLocationRelativeTo(null);
        }// </editor-fold>//GEN-END:initComponents

    private void Edit_Button_16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Edit_Button_16MouseClicked
            PostionService PostionService;
            PostionService = new PostionService();
            Postion dep = new Postion();
            dep.setPostion_Name(name_TextFiled_16.getText());
            try {
                    PostionService.addPostion(dep);
                    this.dispose();
            } catch (SQLException ex) {
                    Logger.getLogger(Postion_Add.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_Edit_Button_16MouseClicked

    private void Edit_Button_16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Edit_Button_16ActionPerformed

            Postion dep = new Postion();

            dep.setPostion_Id(x);
            dep.setPostion_Name(name_TextFiled_16.getText());

            try {
                    postionService.updatePostion(dep);
                    this.dispose();
            } catch (SQLException ex) {
                    Logger.getLogger(Postion_Edit.class.getName()).log(Level.SEVERE, null, ex);
            }

    }//GEN-LAST:event_Edit_Button_16ActionPerformed

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JButton Edit_Button_16;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JLabel jLabel_Id_16;
        private javax.swing.JPanel jPanel1;
        private javax.swing.JPanel jPanel2;
        private javax.swing.JTextField name_TextFiled_16;
        // End of variables declaration//GEN-END:variables
}
