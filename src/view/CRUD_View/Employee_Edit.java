package view.CRUD_View;

import model.Department;
import model.Employee;
import model.Postion;
import service.DepartmentService;
import service.EmployeeService;
import service.PostionService;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Employee_Edit extends javax.swing.JFrame {

        private int x;
        private DepartmentService departmentService;
        private PostionService postionService;
        private EmployeeService employeeService;

        public Employee_Edit(int id) {
                x = id;
                departmentService = new DepartmentService();
                postionService = new PostionService();
                employeeService = new EmployeeService();
                initComponents();

                try {
                        setItem(departmentService.getAllDepartment(), postionService.getAllPostion());
                } catch (SQLException ex) {
                        Logger.getLogger(Employee_Edit.class.getName()).log(Level.SEVERE, null, ex);
                }
                setData();
        }

        public void setData() {
                jLabel_Id_16.setText(String.valueOf(x));
                try {
                        name_TextFiled1.setText(employeeService.getEmployeeById(x).getEmployee_Name());
                } catch (SQLException ex) {
                        Logger.getLogger(Employee_Edit.class.getName()).log(Level.SEVERE, null, ex);
                }
                try {
                        name_TextFiled_Email_16.setText(employeeService.getEmployeeById(x).getEmail());
                } catch (SQLException ex) {
                        Logger.getLogger(Employee_Edit.class.getName()).log(Level.SEVERE, null, ex);
                }
                DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
                String strDate = null;
                try {
                        strDate = dateFormat.format(employeeService.getEmployeeById(x).getBirthday());
                } catch (SQLException ex) {
                        Logger.getLogger(Employee_Edit.class.getName()).log(Level.SEVERE, null, ex);
                }

                name_TextFiled_BirthDay_16.setText(strDate);

                try {
                        name_TextFiled_Tel_16.setText(employeeService.getEmployeeById(x).getTel());
                } catch (SQLException ex) {
                        Logger.getLogger(Employee_Edit.class.getName()).log(Level.SEVERE, null, ex);
                }
                try {
                        jComboBox_Dep_16.setSelectedItem(departmentService.getDepartmentById(employeeService.getEmployeeById(x).getDepartment_Id()).getDepartment_Name());
                } catch (SQLException ex) {
                        Logger.getLogger(Employee_Edit.class.getName()).log(Level.SEVERE, null, ex);
                }
                try {
                        jComboBox_Sex_16.setSelectedItem(employeeService.getEmployeeById(x).getSex());
                } catch (SQLException ex) {
                        Logger.getLogger(Employee_Edit.class.getName()).log(Level.SEVERE, null, ex);
                }
        }

        public void setItem(List<Department> departments, List<Postion> postions) {
                for (Department department : departments) {
                        jComboBox_Dep_16.addItem(String.valueOf(department.getDepartment_Name()));
                }
                for (Postion postion : postions) {
                        jComboBox_Pos_16.addItem(String.valueOf(postion.getPostion_Name()));
                }

        }

        @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                jPanel1 = new javax.swing.JPanel();
                jPanel2 = new javax.swing.JPanel();
                jLabel1 = new javax.swing.JLabel();
                Add_Button = new javax.swing.JButton();
                jLabel2 = new javax.swing.JLabel();
                name_TextFiled_BirthDay_16 = new javax.swing.JTextField();
                jLabel3 = new javax.swing.JLabel();
                jComboBox_Dep_16 = new javax.swing.JComboBox<>();
                jLabel4 = new javax.swing.JLabel();
                jComboBox_Pos_16 = new javax.swing.JComboBox<>();
                jComboBox_Sex_16 = new javax.swing.JComboBox<>();
                jLabel5 = new javax.swing.JLabel();
                jLabel6 = new javax.swing.JLabel();
                name_TextFiled1 = new javax.swing.JTextField();
                jLabel7 = new javax.swing.JLabel();
                name_TextFiled_Email_16 = new javax.swing.JTextField();
                jLabel8 = new javax.swing.JLabel();
                name_TextFiled_Tel_16 = new javax.swing.JTextField();
                jLabel9 = new javax.swing.JLabel();
                jLabel_Id_16 = new javax.swing.JLabel();

                setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

                jPanel1.setBackground(new java.awt.Color(255, 255, 255));

                jPanel2.setBackground(new java.awt.Color(0, 102, 255));

                jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
                jLabel1.setForeground(new java.awt.Color(255, 255, 255));
                jLabel1.setText("Edit Employee");

                javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
                jPanel2.setLayout(jPanel2Layout);
                jPanel2Layout.setHorizontalGroup(
                        jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1)
                                .addGap(228, 228, 228))
                );
                jPanel2Layout.setVerticalGroup(
                        jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addContainerGap(33, Short.MAX_VALUE)
                                .addComponent(jLabel1)
                                .addGap(26, 26, 26))
                );

                Add_Button.setBackground(new java.awt.Color(0, 102, 204));
                Add_Button.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                Add_Button.setForeground(new java.awt.Color(255, 255, 255));
                Add_Button.setText("Edit");
                Add_Button.setMaximumSize(new java.awt.Dimension(100, 40));
                Add_Button.setPreferredSize(new java.awt.Dimension(75, 30));
                Add_Button.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                Add_ButtonActionPerformed(evt);
                        }
                });

                jLabel2.setForeground(new java.awt.Color(0, 0, 0));
                jLabel2.setText("Name:");

                jLabel3.setForeground(new java.awt.Color(0, 0, 0));
                jLabel3.setText("Department:");

                jLabel4.setForeground(new java.awt.Color(0, 0, 0));
                jLabel4.setText("Postion:");

                jComboBox_Sex_16.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "F", "M" }));

                jLabel5.setForeground(new java.awt.Color(0, 0, 0));
                jLabel5.setText("Sex:");

                jLabel6.setForeground(new java.awt.Color(0, 0, 0));
                jLabel6.setText("BirthDay:");

                jLabel7.setForeground(new java.awt.Color(0, 0, 0));
                jLabel7.setText("Email:");

                jLabel8.setForeground(new java.awt.Color(0, 0, 0));
                jLabel8.setText("Tel:");

                jLabel9.setForeground(new java.awt.Color(51, 51, 51));
                jLabel9.setText("Id:");

                jLabel_Id_16.setForeground(new java.awt.Color(102, 102, 102));
                jLabel_Id_16.setText("jLabel10");

                javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
                jPanel1.setLayout(jPanel1Layout);
                jPanel1Layout.setHorizontalGroup(
                        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(Add_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGap(29, 29, 29)
                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(jLabel7)
                                                                                .addComponent(name_TextFiled_Email_16, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                .addComponent(jComboBox_Pos_16, 0, 136, Short.MAX_VALUE))
                                                                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                .addComponent(jComboBox_Dep_16, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                                                                .addComponent(name_TextFiled1, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                .addGap(99, 99, 99)
                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                .addComponent(jComboBox_Sex_16, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addComponent(jLabel6)
                                                                        .addComponent(name_TextFiled_BirthDay_16, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabel8)
                                                                        .addComponent(name_TextFiled_Tel_16, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGap(253, 253, 253)
                                                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jLabel_Id_16, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(0, 40, Short.MAX_VALUE)))
                                .addContainerGap())
                );
                jPanel1Layout.setVerticalGroup(
                        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel9)
                                        .addComponent(jLabel_Id_16))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel5)
                                                        .addComponent(jComboBox_Sex_16, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(name_TextFiled1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(jComboBox_Dep_16, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jLabel3)))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(jLabel4)
                                                                .addComponent(jComboBox_Pos_16, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addComponent(name_TextFiled_BirthDay_16, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel7)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(name_TextFiled_Email_16, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel8)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(name_TextFiled_Tel_16, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Add_Button, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                );

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                );

                pack();
                setLocationRelativeTo(null);
        }// </editor-fold>//GEN-END:initComponents

    private void Add_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Add_ButtonActionPerformed
            SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
            Date ngaysinh = new Date();

            try {
                    ngaysinh = format.parse(name_TextFiled_BirthDay_16.getText());
            } catch (ParseException ex) {
                    Logger.getLogger(Employee_Add.class.getName()).log(Level.SEVERE, null, ex);
            }

            EmployeeService EmployeeService;
            EmployeeService = new EmployeeService();
            Employee emp = new Employee();
            emp.setEmployee_Id(x);
            emp.setEmployee_Name(name_TextFiled1.getText());
            try {
                    emp.setDepartment_Id(departmentService.getDepartmentByName(String.valueOf(jComboBox_Dep_16.getSelectedItem())).getDepartment_Id());
            } catch (SQLException ex) {
                    Logger.getLogger(Employee_Add.class.getName()).log(Level.SEVERE, null, ex);
            }
            emp.setSex(String.valueOf(jComboBox_Sex_16.getSelectedItem()));
            emp.setBirthday(new java.sql.Date(ngaysinh.getTime()));
            emp.setEmail(name_TextFiled_Email_16.getText());
            emp.setTel(name_TextFiled_Tel_16.getText());
            try {
                    EmployeeService.updateEmployee(emp);
            } catch (SQLException ex) {
                    Logger.getLogger(Employee_Add.class.getName()).log(Level.SEVERE, null, ex);
            }

            this.dispose();
    }//GEN-LAST:event_Add_ButtonActionPerformed

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JButton Add_Button;
        private javax.swing.JComboBox<String> jComboBox_Dep_16;
        private javax.swing.JComboBox<String> jComboBox_Pos_16;
        private javax.swing.JComboBox<String> jComboBox_Sex_16;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JLabel jLabel4;
        private javax.swing.JLabel jLabel5;
        private javax.swing.JLabel jLabel6;
        private javax.swing.JLabel jLabel7;
        private javax.swing.JLabel jLabel8;
        private javax.swing.JLabel jLabel9;
        private javax.swing.JLabel jLabel_Id_16;
        private javax.swing.JPanel jPanel1;
        private javax.swing.JPanel jPanel2;
        private javax.swing.JTextField name_TextFiled1;
        private javax.swing.JTextField name_TextFiled_BirthDay_16;
        private javax.swing.JTextField name_TextFiled_Email_16;
        private javax.swing.JTextField name_TextFiled_Tel_16;
        // End of variables declaration//GEN-END:variables
}
