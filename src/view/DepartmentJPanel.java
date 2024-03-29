package view;

import bean.DanhMucBean;
import controller.ChuyenManHinh;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DepartmentJPanel extends javax.swing.JPanel {

        public DepartmentJPanel() throws SQLException {
                initComponents();

                ChuyenManHinh controller12 = new ChuyenManHinh(jPanel1_Screen_12);
                controller12.setDashboardOfDepartment(jPanel2_list_12, jLabel2_list_12);
                List<DanhMucBean> listDanhMuc12 = new ArrayList<>();
                listDanhMuc12.add(new DanhMucBean("DepartmentList", jPanel2_list_12, jLabel2_list_12));
                listDanhMuc12.add(new DanhMucBean("DepartmentChart", jPanel3_chart_12, jLabel3_chart12));

                controller12.setEvent(listDanhMuc12);
        }

        @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                jPanel1_Screen_12 = new javax.swing.JPanel();
                jPanel1_12 = new javax.swing.JPanel();
                jLabel1_12 = new javax.swing.JLabel();
                jPanel2_list_12 = new javax.swing.JPanel();
                jLabel2_list_12 = new javax.swing.JLabel();
                jPanel3_chart_12 = new javax.swing.JPanel();
                jLabel3_chart12 = new javax.swing.JLabel();
                jLabel2_12 = new javax.swing.JLabel();

                setBackground(new java.awt.Color(255, 255, 255));
                setPreferredSize(new java.awt.Dimension(831, 634));

                jPanel1_Screen_12.setBackground(new java.awt.Color(204, 204, 204));

                javax.swing.GroupLayout jPanel1_Screen_12Layout = new javax.swing.GroupLayout(jPanel1_Screen_12);
                jPanel1_Screen_12.setLayout(jPanel1_Screen_12Layout);
                jPanel1_Screen_12Layout.setHorizontalGroup(
                        jPanel1_Screen_12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE)
                );
                jPanel1_Screen_12Layout.setVerticalGroup(
                        jPanel1_Screen_12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 530, Short.MAX_VALUE)
                );

                jPanel1_12.setBackground(new java.awt.Color(255, 255, 255));

                jLabel1_12.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
                jLabel1_12.setText("Department Screen");

                jPanel2_list_12.setBackground(new java.awt.Color(255, 255, 255));

                jLabel2_list_12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/List.png"))); // NOI18N

                javax.swing.GroupLayout jPanel2_list_12Layout = new javax.swing.GroupLayout(jPanel2_list_12);
                jPanel2_list_12.setLayout(jPanel2_list_12Layout);
                jPanel2_list_12Layout.setHorizontalGroup(
                        jPanel2_list_12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2_list_12Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel2_list_12)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                );
                jPanel2_list_12Layout.setVerticalGroup(
                        jPanel2_list_12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2_list_12Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel2_list_12)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                );

                jPanel3_chart_12.setBackground(new java.awt.Color(255, 255, 255));

                jLabel3_chart12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Charticon.png"))); // NOI18N

                javax.swing.GroupLayout jPanel3_chart_12Layout = new javax.swing.GroupLayout(jPanel3_chart_12);
                jPanel3_chart_12.setLayout(jPanel3_chart_12Layout);
                jPanel3_chart_12Layout.setHorizontalGroup(
                        jPanel3_chart_12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3_chart_12Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel3_chart12)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                );
                jPanel3_chart_12Layout.setVerticalGroup(
                        jPanel3_chart_12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3_chart_12Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel3_chart12)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                );

                jLabel2_12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cil_room.png"))); // NOI18N

                javax.swing.GroupLayout jPanel1_12Layout = new javax.swing.GroupLayout(jPanel1_12);
                jPanel1_12.setLayout(jPanel1_12Layout);
                jPanel1_12Layout.setHorizontalGroup(
                        jPanel1_12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1_12Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1_12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1_12Layout.createSequentialGroup()
                                                .addComponent(jPanel2_list_12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jPanel3_chart_12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1_12Layout.createSequentialGroup()
                                                .addComponent(jLabel2_12)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel1_12, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(540, Short.MAX_VALUE))
                );
                jPanel1_12Layout.setVerticalGroup(
                        jPanel1_12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1_12Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1_12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel2_12)
                                        .addComponent(jLabel1_12, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1_12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jPanel2_list_12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jPanel3_chart_12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(50, 50, 50))
                );

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
                this.setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1_12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel1_Screen_12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jPanel1_12, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jPanel1_Screen_12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                );
        }// </editor-fold>//GEN-END:initComponents


        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JLabel jLabel1_12;
        private javax.swing.JLabel jLabel2_12;
        private javax.swing.JLabel jLabel2_list_12;
        private javax.swing.JLabel jLabel3_chart12;
        private javax.swing.JPanel jPanel1_12;
        private javax.swing.JPanel jPanel1_Screen_12;
        private javax.swing.JPanel jPanel2_list_12;
        private javax.swing.JPanel jPanel3_chart_12;
        // End of variables declaration//GEN-END:variables
}
