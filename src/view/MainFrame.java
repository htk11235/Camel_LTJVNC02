/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import bean.DanhMucBean;
import controller.ChuyenManHinh;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jonny Dam
 */
public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    public MainFrame() throws SQLException {
        initComponents();
        
        setTitle("Quan Ly");
        
        ChuyenManHinh controller = new ChuyenManHinh(jPanel_view);
        controller.setDashboard(jPanel2_Departement, jLabel_Department);
        List<DanhMucBean> listDanhMuc = new ArrayList<>();
        listDanhMuc.add(new DanhMucBean("Department", jPanel2_Departement, jLabel_Department));
        listDanhMuc.add(new DanhMucBean("Employee", jPanel1_Employee, jLabel1_Employee));
        listDanhMuc.add(new DanhMucBean("Timekeeping", jPanel1_Timekeeping, jLabel1_Timekeeping));
        listDanhMuc.add(new DanhMucBean("Postion", jPanel1_Postion, jLabel1_Postion));
        listDanhMuc.add(new DanhMucBean("Salary", jPanel2_Salary, jLabel_Salary));
        
        controller.setEvent(listDanhMuc);
        
        
        
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1_Navbar = new javax.swing.JPanel();
        jPanel2_Departement = new javax.swing.JPanel();
        jLabel_Department = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1_Employee = new javax.swing.JPanel();
        jLabel1_Employee = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1_Timekeeping = new javax.swing.JPanel();
        jLabel1_Timekeeping = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1_Postion = new javax.swing.JPanel();
        jLabel1_Postion = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2_Salary = new javax.swing.JPanel();
        jLabel_Salary = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel1_Logo = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel_view = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(906, 600));

        jPanel1_Navbar.setBackground(new java.awt.Color(0, 28, 24));
        jPanel1_Navbar.setRequestFocusEnabled(false);

        jPanel2_Departement.setBackground(new java.awt.Color(99, 99, 99));
        jPanel2_Departement.setPreferredSize(new java.awt.Dimension(200, 60));

        jLabel_Department.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel_Department.setForeground(new java.awt.Color(232, 232, 232));
        jLabel_Department.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel_Department.setText("Department");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/376915 (1).png"))); // NOI18N

        javax.swing.GroupLayout jPanel2_DepartementLayout = new javax.swing.GroupLayout(jPanel2_Departement);
        jPanel2_Departement.setLayout(jPanel2_DepartementLayout);
        jPanel2_DepartementLayout.setHorizontalGroup(
            jPanel2_DepartementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2_DepartementLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_Department, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel2_DepartementLayout.setVerticalGroup(
            jPanel2_DepartementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2_DepartementLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2_DepartementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_Department, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1_Employee.setBackground(new java.awt.Color(99, 99, 99));
        jPanel1_Employee.setPreferredSize(new java.awt.Dimension(200, 60));

        jLabel1_Employee.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1_Employee.setForeground(new java.awt.Color(232, 232, 232));
        jLabel1_Employee.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1_Employee.setText("Employee");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/6186048 (1).png"))); // NOI18N

        javax.swing.GroupLayout jPanel1_EmployeeLayout = new javax.swing.GroupLayout(jPanel1_Employee);
        jPanel1_Employee.setLayout(jPanel1_EmployeeLayout);
        jPanel1_EmployeeLayout.setHorizontalGroup(
            jPanel1_EmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1_EmployeeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1_Employee, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel1_EmployeeLayout.setVerticalGroup(
            jPanel1_EmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1_EmployeeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1_EmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1_Employee, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1_Timekeeping.setBackground(new java.awt.Color(99, 99, 99));
        jPanel1_Timekeeping.setPreferredSize(new java.awt.Dimension(200, 60));

        jLabel1_Timekeeping.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1_Timekeeping.setForeground(new java.awt.Color(232, 232, 232));
        jLabel1_Timekeeping.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1_Timekeeping.setText("Timekeeping");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/favpng_timesheet-icon-design (1).png"))); // NOI18N

        javax.swing.GroupLayout jPanel1_TimekeepingLayout = new javax.swing.GroupLayout(jPanel1_Timekeeping);
        jPanel1_Timekeeping.setLayout(jPanel1_TimekeepingLayout);
        jPanel1_TimekeepingLayout.setHorizontalGroup(
            jPanel1_TimekeepingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1_TimekeepingLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1_Timekeeping, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel1_TimekeepingLayout.setVerticalGroup(
            jPanel1_TimekeepingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1_TimekeepingLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1_TimekeepingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                    .addGroup(jPanel1_TimekeepingLayout.createSequentialGroup()
                        .addComponent(jLabel1_Timekeeping, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        jPanel1_Postion.setBackground(new java.awt.Color(99, 99, 99));
        jPanel1_Postion.setPreferredSize(new java.awt.Dimension(200, 60));

        jLabel1_Postion.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1_Postion.setForeground(new java.awt.Color(232, 232, 232));
        jLabel1_Postion.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1_Postion.setText("Postion");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/1570970 (1).png"))); // NOI18N

        javax.swing.GroupLayout jPanel1_PostionLayout = new javax.swing.GroupLayout(jPanel1_Postion);
        jPanel1_Postion.setLayout(jPanel1_PostionLayout);
        jPanel1_PostionLayout.setHorizontalGroup(
            jPanel1_PostionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1_PostionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1_Postion, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1_PostionLayout.setVerticalGroup(
            jPanel1_PostionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
            .addGroup(jPanel1_PostionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1_Postion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2_Salary.setBackground(new java.awt.Color(99, 99, 99));
        jPanel2_Salary.setPreferredSize(new java.awt.Dimension(200, 60));

        jLabel_Salary.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel_Salary.setForeground(new java.awt.Color(232, 232, 232));
        jLabel_Salary.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel_Salary.setText("Salary");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/3135706 (1).png"))); // NOI18N

        javax.swing.GroupLayout jPanel2_SalaryLayout = new javax.swing.GroupLayout(jPanel2_Salary);
        jPanel2_Salary.setLayout(jPanel2_SalaryLayout);
        jPanel2_SalaryLayout.setHorizontalGroup(
            jPanel2_SalaryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2_SalaryLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_Salary, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2_SalaryLayout.setVerticalGroup(
            jPanel2_SalaryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2_SalaryLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2_SalaryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2_SalaryLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabel_Salary, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Copyright © by Camel");

        jPanel1_Logo.setBackground(new java.awt.Color(238, 238, 238));
        jPanel1_Logo.setPreferredSize(new java.awt.Dimension(0, 80));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Camel_logo_camel-700x946 (2).png"))); // NOI18N

        jLabel8.setFont(new java.awt.Font("MV Boli", 0, 36)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("CAMEL");

        javax.swing.GroupLayout jPanel1_LogoLayout = new javax.swing.GroupLayout(jPanel1_Logo);
        jPanel1_Logo.setLayout(jPanel1_LogoLayout);
        jPanel1_LogoLayout.setHorizontalGroup(
            jPanel1_LogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1_LogoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addGap(49, 49, 49))
        );
        jPanel1_LogoLayout.setVerticalGroup(
            jPanel1_LogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1_LogoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1_LogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1_NavbarLayout = new javax.swing.GroupLayout(jPanel1_Navbar);
        jPanel1_Navbar.setLayout(jPanel1_NavbarLayout);
        jPanel1_NavbarLayout.setHorizontalGroup(
            jPanel1_NavbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1_Logo, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
            .addGroup(jPanel1_NavbarLayout.createSequentialGroup()
                .addGroup(jPanel1_NavbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1_NavbarLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1_NavbarLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel1_NavbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel2_Departement, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel1_Employee, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel1_Timekeeping, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel1_Postion, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel2_Salary, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel1_NavbarLayout.setVerticalGroup(
            jPanel1_NavbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1_NavbarLayout.createSequentialGroup()
                .addComponent(jPanel1_Logo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2_Departement, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1_Employee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1_Timekeeping, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1_Postion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2_Salary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addContainerGap())
        );

        jPanel_view.setBackground(new java.awt.Color(238, 238, 238));
        jPanel_view.setPreferredSize(new java.awt.Dimension(650, 600));

        javax.swing.GroupLayout jPanel_viewLayout = new javax.swing.GroupLayout(jPanel_view);
        jPanel_view.setLayout(jPanel_viewLayout);
        jPanel_viewLayout.setHorizontalGroup(
            jPanel_viewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 650, Short.MAX_VALUE)
        );
        jPanel_viewLayout.setVerticalGroup(
            jPanel_viewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1_Navbar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel_view, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_view, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1_Navbar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               
                try {
                    new MainFrame().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
               
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel1_Employee;
    private javax.swing.JLabel jLabel1_Postion;
    private javax.swing.JLabel jLabel1_Timekeeping;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel_Department;
    private javax.swing.JLabel jLabel_Salary;
    private javax.swing.JPanel jPanel1_Employee;
    private javax.swing.JPanel jPanel1_Logo;
    private javax.swing.JPanel jPanel1_Navbar;
    private javax.swing.JPanel jPanel1_Postion;
    private javax.swing.JPanel jPanel1_Timekeeping;
    private javax.swing.JPanel jPanel2_Departement;
    private javax.swing.JPanel jPanel2_Salary;
    private javax.swing.JPanel jPanel_view;
    // End of variables declaration//GEN-END:variables
}
