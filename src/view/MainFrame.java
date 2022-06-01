package view;

import bean.DanhMucBean;
import controller.ChuyenManHinh;
import java.awt.Color;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.swing.border.MatteBorder;

public class MainFrame extends javax.swing.JFrame {

        int checkMode = 1;

        public MainFrame() throws SQLException {

                initComponents();

                setTitle("Quan Ly");

                ChuyenManHinh controller = new ChuyenManHinh(jPanel_view_61);
                controller.setDashboard(jPanel2_Departement_61, jLabel_Department_61);
                List<DanhMucBean> listDanhMuc = new ArrayList<>();
                listDanhMuc.add(new DanhMucBean("Department", jPanel2_Departement_61, jLabel_Department_61));
                listDanhMuc.add(new DanhMucBean("Employee", jPanel1_Employee_61, jLabel1_Employee_61));
                listDanhMuc.add(new DanhMucBean("Timekeeping", jPanel1_Timekeeping_61, jLabel1_Timekeeping_61));
                listDanhMuc.add(new DanhMucBean("Postion", jPanel1_Postion_61, jLabel1_Postion_61));
                listDanhMuc.add(new DanhMucBean("Salary", jPanel2_Salary_61, jLabel_Salary_61));

                controller.setEvent(listDanhMuc);

                LocalDate myObj = LocalDate.now();
                jLabel9_datetime1_61.setText("  " + myObj.toString());

                this.setLocationRelativeTo(null);
        }

        @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel_Background_61 = new javax.swing.JPanel();
        jPanel_view_61 = new javax.swing.JPanel();
        jPanel1_Navbar_61 = new javax.swing.JPanel();
        jPanel2_Departement_61 = new javax.swing.JPanel();
        jLabel_Department_61 = new javax.swing.JLabel();
        jLabel3_61 = new javax.swing.JLabel();
        jPanel1_Employee_61 = new javax.swing.JPanel();
        jLabel1_Employee_61 = new javax.swing.JLabel();
        jLabel1_61 = new javax.swing.JLabel();
        jPanel1_Timekeeping_61 = new javax.swing.JPanel();
        jLabel1_Timekeeping_61 = new javax.swing.JLabel();
        jLabel2_61 = new javax.swing.JLabel();
        jPanel1_Postion_61 = new javax.swing.JPanel();
        jLabel1_Postion_61 = new javax.swing.JLabel();
        jLabel4_61 = new javax.swing.JLabel();
        jPanel2_Salary_61 = new javax.swing.JPanel();
        jLabel_Salary_61 = new javax.swing.JLabel();
        jLabel5_61 = new javax.swing.JLabel();
        jLabel6_61 = new javax.swing.JLabel();
        jPanel1_Logo_61 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel1_61 = new javax.swing.JPanel();
        jLabel9_moon_icon_61 = new javax.swing.JLabel();
        jLabel9_sun_icon_61 = new javax.swing.JLabel();
        user_61 = new javax.swing.JLabel();
        jLabel9_datetime1_61 = new javax.swing.JLabel();
        logout_61 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel_Background_61.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_Background_61.setForeground(new java.awt.Color(255, 255, 255));

        jPanel_view_61.setBackground(new java.awt.Color(235, 236, 240));
        jPanel_view_61.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 1, true));
        jPanel_view_61.setForeground(new java.awt.Color(255, 255, 255));
        jPanel_view_61.setPreferredSize(new java.awt.Dimension(650, 600));

        javax.swing.GroupLayout jPanel_view_61Layout = new javax.swing.GroupLayout(jPanel_view_61);
        jPanel_view_61.setLayout(jPanel_view_61Layout);
        jPanel_view_61Layout.setHorizontalGroup(
            jPanel_view_61Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 829, Short.MAX_VALUE)
        );
        jPanel_view_61Layout.setVerticalGroup(
            jPanel_view_61Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel1_Navbar_61.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1_Navbar_61.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        jPanel1_Navbar_61.setRequestFocusEnabled(false);

        jPanel2_Departement_61.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2_Departement_61.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel2_Departement_61.setPreferredSize(new java.awt.Dimension(200, 60));

        jLabel_Department_61.setBackground(new java.awt.Color(119, 119, 119));
        jLabel_Department_61.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel_Department_61.setForeground(new java.awt.Color(119, 119, 119));
        jLabel_Department_61.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel_Department_61.setText("Department");

        jLabel3_61.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cil_room-1.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2_Departement_61Layout = new javax.swing.GroupLayout(jPanel2_Departement_61);
        jPanel2_Departement_61.setLayout(jPanel2_Departement_61Layout);
        jPanel2_Departement_61Layout.setHorizontalGroup(
            jPanel2_Departement_61Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2_Departement_61Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3_61, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_Department_61, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel2_Departement_61Layout.setVerticalGroup(
            jPanel2_Departement_61Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2_Departement_61Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2_Departement_61Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel_Department_61, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                    .addComponent(jLabel3_61, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1_Employee_61.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1_Employee_61.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1_Employee_61.setPreferredSize(new java.awt.Dimension(200, 60));

        jLabel1_Employee_61.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1_Employee_61.setForeground(new java.awt.Color(119, 119, 119));
        jLabel1_Employee_61.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1_Employee_61.setText("Employee");

        jLabel1_61.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconoir_group (1).png"))); // NOI18N

        javax.swing.GroupLayout jPanel1_Employee_61Layout = new javax.swing.GroupLayout(jPanel1_Employee_61);
        jPanel1_Employee_61.setLayout(jPanel1_Employee_61Layout);
        jPanel1_Employee_61Layout.setHorizontalGroup(
            jPanel1_Employee_61Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1_Employee_61Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1_61, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1_Employee_61, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel1_Employee_61Layout.setVerticalGroup(
            jPanel1_Employee_61Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1_61, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
            .addComponent(jLabel1_Employee_61, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1_Timekeeping_61.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1_Timekeeping_61.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1_Timekeeping_61.setPreferredSize(new java.awt.Dimension(200, 60));

        jLabel1_Timekeeping_61.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1_Timekeeping_61.setForeground(new java.awt.Color(119, 119, 119));
        jLabel1_Timekeeping_61.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1_Timekeeping_61.setText("Timekeeping");

        jLabel2_61.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/la_business-time.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1_Timekeeping_61Layout = new javax.swing.GroupLayout(jPanel1_Timekeeping_61);
        jPanel1_Timekeeping_61.setLayout(jPanel1_Timekeeping_61Layout);
        jPanel1_Timekeeping_61Layout.setHorizontalGroup(
            jPanel1_Timekeeping_61Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1_Timekeeping_61Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2_61, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1_Timekeeping_61, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel1_Timekeeping_61Layout.setVerticalGroup(
            jPanel1_Timekeeping_61Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2_61, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
            .addComponent(jLabel1_Timekeeping_61, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1_Postion_61.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1_Postion_61.setPreferredSize(new java.awt.Dimension(200, 60));

        jLabel1_Postion_61.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1_Postion_61.setForeground(new java.awt.Color(119, 119, 119));
        jLabel1_Postion_61.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1_Postion_61.setText("Postion");

        jLabel4_61.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/material-symbols_business-center-outline-sharp-1.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1_Postion_61Layout = new javax.swing.GroupLayout(jPanel1_Postion_61);
        jPanel1_Postion_61.setLayout(jPanel1_Postion_61Layout);
        jPanel1_Postion_61Layout.setHorizontalGroup(
            jPanel1_Postion_61Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1_Postion_61Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4_61, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1_Postion_61, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1_Postion_61Layout.setVerticalGroup(
            jPanel1_Postion_61Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4_61, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
            .addComponent(jLabel1_Postion_61, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2_Salary_61.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2_Salary_61.setPreferredSize(new java.awt.Dimension(200, 60));

        jLabel_Salary_61.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel_Salary_61.setForeground(new java.awt.Color(119, 119, 119));
        jLabel_Salary_61.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel_Salary_61.setText("Salary");

        jLabel5_61.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/carbon_piggy-bank.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2_Salary_61Layout = new javax.swing.GroupLayout(jPanel2_Salary_61);
        jPanel2_Salary_61.setLayout(jPanel2_Salary_61Layout);
        jPanel2_Salary_61Layout.setHorizontalGroup(
            jPanel2_Salary_61Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2_Salary_61Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5_61, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_Salary_61, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2_Salary_61Layout.setVerticalGroup(
            jPanel2_Salary_61Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5_61, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
            .addComponent(jLabel_Salary_61, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel6_61.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6_61.setText("Copyright © by Camel");

        jPanel1_Logo_61.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1_Logo_61.setPreferredSize(new java.awt.Dimension(0, 80));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/emojione_camel (1).png"))); // NOI18N

        jLabel8.setFont(new java.awt.Font("MV Boli", 0, 36)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("CAMEL");

        javax.swing.GroupLayout jPanel1_Logo_61Layout = new javax.swing.GroupLayout(jPanel1_Logo_61);
        jPanel1_Logo_61.setLayout(jPanel1_Logo_61Layout);
        jPanel1_Logo_61Layout.setHorizontalGroup(
            jPanel1_Logo_61Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1_Logo_61Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(95, 95, 95))
        );
        jPanel1_Logo_61Layout.setVerticalGroup(
            jPanel1_Logo_61Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1_Logo_61Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1_Logo_61Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1_Navbar_61Layout = new javax.swing.GroupLayout(jPanel1_Navbar_61);
        jPanel1_Navbar_61.setLayout(jPanel1_Navbar_61Layout);
        jPanel1_Navbar_61Layout.setHorizontalGroup(
            jPanel1_Navbar_61Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1_Navbar_61Layout.createSequentialGroup()
                .addGroup(jPanel1_Navbar_61Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1_Navbar_61Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6_61, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1_Navbar_61Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel1_Navbar_61Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel2_Departement_61, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel1_Employee_61, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel1_Timekeeping_61, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel1_Postion_61, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel2_Salary_61, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(19, Short.MAX_VALUE))
            .addComponent(jPanel1_Logo_61, javax.swing.GroupLayout.PREFERRED_SIZE, 255, Short.MAX_VALUE)
        );
        jPanel1_Navbar_61Layout.setVerticalGroup(
            jPanel1_Navbar_61Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1_Navbar_61Layout.createSequentialGroup()
                .addComponent(jPanel1_Logo_61, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2_Departement_61, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jPanel1_Employee_61, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1_Timekeeping_61, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1_Postion_61, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2_Salary_61, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 242, Short.MAX_VALUE)
                .addComponent(jLabel6_61)
                .addContainerGap())
        );

        jPanel1_61.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1_61.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        jPanel1_61.setForeground(new java.awt.Color(255, 255, 255));

        jLabel9_moon_icon_61.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Group.png"))); // NOI18N
        jLabel9_moon_icon_61.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel9_moon_icon_61.setPreferredSize(new java.awt.Dimension(36, 40));
        jLabel9_moon_icon_61.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9_moon_icon_61MouseClicked(evt);
            }
        });

        jLabel9_sun_icon_61.setBackground(new java.awt.Color(60, 255, 240));
        jLabel9_sun_icon_61.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/clarity_sun-solid.png"))); // NOI18N
        jLabel9_sun_icon_61.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 4, 0, new java.awt.Color(255, 210, 51)));
        jLabel9_sun_icon_61.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel9_sun_icon_61.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9_sun_icon_61MouseClicked(evt);
            }
        });

        user_61.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        user_61.setForeground(new java.awt.Color(255, 102, 102));
        user_61.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bi_person-circle.png"))); // NOI18N
        user_61.setText("hi, camel");

        jLabel9_datetime1_61.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9_datetime1_61.setForeground(new java.awt.Color(119, 119, 119));
        jLabel9_datetime1_61.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/uiw_date.png"))); // NOI18N
        jLabel9_datetime1_61.setText("jLabel9");

        logout_61.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Vector.png"))); // NOI18N
        logout_61.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logout_61.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logout_61MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1_61Layout = new javax.swing.GroupLayout(jPanel1_61);
        jPanel1_61.setLayout(jPanel1_61Layout);
        jPanel1_61Layout.setHorizontalGroup(
            jPanel1_61Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1_61Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel9_moon_icon_61, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9_sun_icon_61)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9_datetime1_61, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(99, 99, 99)
                .addComponent(user_61, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(logout_61, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1_61Layout.setVerticalGroup(
            jPanel1_61Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1_61Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1_61Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(logout_61, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1_61Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(user_61)
                        .addComponent(jLabel9_datetime1_61, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel9_sun_icon_61, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel9_moon_icon_61, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel_Background_61Layout = new javax.swing.GroupLayout(jPanel_Background_61);
        jPanel_Background_61.setLayout(jPanel_Background_61Layout);
        jPanel_Background_61Layout.setHorizontalGroup(
            jPanel_Background_61Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_Background_61Layout.createSequentialGroup()
                .addComponent(jPanel1_Navbar_61, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(jPanel_Background_61Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel_view_61, javax.swing.GroupLayout.DEFAULT_SIZE, 831, Short.MAX_VALUE)
                    .addComponent(jPanel1_61, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel_Background_61Layout.setVerticalGroup(
            jPanel_Background_61Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1_Navbar_61, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel_Background_61Layout.createSequentialGroup()
                .addComponent(jPanel1_61, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel_view_61, javax.swing.GroupLayout.DEFAULT_SIZE, 634, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_Background_61, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel_Background_61, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel9_moon_icon_61MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9_moon_icon_61MouseClicked
            jLabel9_moon_icon_61.setBorder(new MatteBorder(0, 0, 4, 0, new Color(151, 71, 255)));

            if (checkMode == 1) {
                    jPanel_Background_61.setBackground(Color.GRAY);
                    jPanel_Background_61.setForeground(Color.white);
                    jPanel_view_61.setBackground(Color.GRAY);
                    jPanel_view_61.setForeground(Color.white);
                    jPanel1_Navbar_61.setBackground(Color.GRAY);
                    jPanel1_Navbar_61.setForeground(Color.white);
                    jPanel1_61.setBackground(Color.GRAY);
                    jPanel1_61.setForeground(Color.white);
                    jLabel9_datetime1_61.setForeground(Color.white);
                    user_61.setForeground(Color.white);
                    checkMode = 0;
            }

            jLabel9_sun_icon_61.setBorder(null);
    }//GEN-LAST:event_jLabel9_moon_icon_61MouseClicked

    private void jLabel9_sun_icon_61MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9_sun_icon_61MouseClicked
            jLabel9_moon_icon_61.setBorder(null);
            if (checkMode == 0) {
                    jPanel_Background_61.setBackground(Color.white);
                    jPanel_Background_61.setForeground(Color.GRAY);
                    jPanel_view_61.setBackground(Color.white);
                    jPanel_view_61.setForeground(Color.GRAY);
                    jPanel1_Navbar_61.setBackground(Color.white);
                    jPanel1_Navbar_61.setForeground(Color.GRAY);
                    jPanel1_61.setBackground(Color.white);
                    jPanel1_61.setForeground(Color.GRAY);
                    jLabel9_datetime1_61.setForeground(Color.black);
                    user_61.setForeground(Color.black);
                    checkMode = 1;
            }
            jLabel9_sun_icon_61.setBorder(new MatteBorder(0, 0, 4, 0, new Color(255, 210, 51)));
    }//GEN-LAST:event_jLabel9_sun_icon_61MouseClicked

    private void logout_61MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logout_61MouseClicked
            this.dispose();
            new LoginJFrame().setVisible(true);
    }//GEN-LAST:event_logout_61MouseClicked
        public void ChangeName(String name) {
                user_61.setText(name);
        }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1_61;
    private javax.swing.JLabel jLabel1_Employee_61;
    private javax.swing.JLabel jLabel1_Postion_61;
    private javax.swing.JLabel jLabel1_Timekeeping_61;
    private javax.swing.JLabel jLabel2_61;
    private javax.swing.JLabel jLabel3_61;
    private javax.swing.JLabel jLabel4_61;
    private javax.swing.JLabel jLabel5_61;
    private javax.swing.JLabel jLabel6_61;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9_datetime1_61;
    private javax.swing.JLabel jLabel9_moon_icon_61;
    private javax.swing.JLabel jLabel9_sun_icon_61;
    private javax.swing.JLabel jLabel_Department_61;
    private javax.swing.JLabel jLabel_Salary_61;
    private javax.swing.JPanel jPanel1_61;
    private javax.swing.JPanel jPanel1_Employee_61;
    private javax.swing.JPanel jPanel1_Logo_61;
    private javax.swing.JPanel jPanel1_Navbar_61;
    private javax.swing.JPanel jPanel1_Postion_61;
    private javax.swing.JPanel jPanel1_Timekeeping_61;
    private javax.swing.JPanel jPanel2_Departement_61;
    private javax.swing.JPanel jPanel2_Salary_61;
    private javax.swing.JPanel jPanel_Background_61;
    private javax.swing.JPanel jPanel_view_61;
    private javax.swing.JLabel logout_61;
    private javax.swing.JLabel user_61;
    // End of variables declaration//GEN-END:variables
}
