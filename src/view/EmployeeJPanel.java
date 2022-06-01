/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import model.Employee;
import service.DepartmentService;
import service.EmployeeService;
import service.PostionService;
import view.CRUD_View.Employee_Add;
import view.CRUD_View.Employee_Edit;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import view.CRUD_View.Emp_Add;

public class EmployeeJPanel extends javax.swing.JPanel {

    private EmployeeService employeeService_61;
       private DepartmentService departmentService16;
    private PostionService postionService16;
    public DefaultTableModel getModelTable() {
        DefaultTableModel model_61 = (DefaultTableModel) jTable_16.getModel();
        return model_61;
    }

    public void searchTable(String value) {
        TableRowSorter<DefaultTableModel> trs = new TableRowSorter<>(getModelTable());
        jTable_16.setRowSorter(trs);
        trs.setRowFilter(RowFilter.regexFilter(value));
    }

    DefaultTableModel defaultTableModel_61;

    public EmployeeJPanel() {
         departmentService16 = new DepartmentService();
        postionService16 = new PostionService();
        initComponents();

        employeeService_61 = new EmployeeService();

        defaultTableModel_61 = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        jTable_16.setModel(defaultTableModel_61);
        defaultTableModel_61.addColumn("id");
        defaultTableModel_61.addColumn("name");
        defaultTableModel_61.addColumn("department");
        defaultTableModel_61.addColumn("position");
        defaultTableModel_61.addColumn("sex");
        defaultTableModel_61.addColumn("birthday");
        defaultTableModel_61.addColumn("email");
        defaultTableModel_61.addColumn("tel");
        try {
            setTableData(employeeService_61.getAllEmployee());
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeJPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
          jTable_16.setModel(defaultTableModel_61);
        jTable_16.getTableHeader().setOpaque(false);
        defaultTableModel_61.fireTableDataChanged();
        jTable_16.repaint();
              //design table
       
        
//        header design
            DefaultTableCellRenderer headerRenderer = new DefaultTableCellRenderer();
       headerRenderer.setBackground(new Color(102,102,102));
       headerRenderer.setForeground(Color.white);
       headerRenderer.setFont(new Font("Tohoma", Font.BOLD, 18));
       for (int i = 0; i < jTable_16.getModel().getColumnCount(); i++) {
               jTable_16.getColumnModel().getColumn(i).setHeaderRenderer(headerRenderer);
       }
       //design column 
       jTable_16.setGridColor(new Color (51,51,51));
        jTable_16.getTableHeader().setPreferredSize(new Dimension(100, 50));
        jTable_16.setRowHeight(30);
        jTable_16.validate();
        jTable_16.repaint();
        jTable_16.setOpaque(true);
        jTable_16.setFillsViewportHeight(true);
        jTable_16.setBackground( new Color(255,255,255));
    }

    private void setTableData(List<Employee> Employees) {
        for (Employee Employee : Employees) {
            try {
                defaultTableModel_61.addRow(new Object[]{Employee.getEmployee_Id(), 
                    Employee.getEmployee_Name(),
                    departmentService16.getDepartmentById(Employee.getDepartment_Id()).getDepartment_Name(),
                    postionService16.getPostionById(Employee.getPosition_Id()).getPostion_Name(),
                    Employee.getSex(),
                    Employee.getBirthday(),
                    Employee.getEmail(),Employee.getTel()});
            } catch (SQLException ex) {
                Logger.getLogger(EmployeeJPanel.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    private void refreshTableData(List<Employee> Employees) {
        defaultTableModel_61.setRowCount(0);
        
        try {
            setTableData(employeeService_61.getAllEmployee());
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeJPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField_search_16 = new javax.swing.JTextField();
        jScrollPane1_16 = new javax.swing.JScrollPane();
        jTable_16 = new javax.swing.JTable();
        jButton_Add_16 = new javax.swing.JButton();
        jButton_Edit_16 = new javax.swing.JButton();
        jButton_Del_16 = new javax.swing.JButton();
        jLabel_DpScreen_16 = new javax.swing.JLabel();
        jButton_Refresh1_16 = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(899, 598));

        jTextField_search_16.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField_search_16.setText("Search");
        jTextField_search_16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextField_search_16.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField_search_16FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField_search_16FocusLost(evt);
            }
        });
        jTextField_search_16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_search_16ActionPerformed(evt);
            }
        });
        jTextField_search_16.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField_search_16KeyReleased(evt);
            }
        });

        jTable_16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTable_16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTable_16.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable_16.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTable_16.setShowGrid(true);
        jScrollPane1_16.setViewportView(jTable_16);

        jButton_Add_16.setBackground(new java.awt.Color(40, 133, 55));
        jButton_Add_16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton_Add_16.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Add_16.setText("ADD");
        jButton_Add_16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Add_16ActionPerformed(evt);
            }
        });

        jButton_Edit_16.setBackground(new java.awt.Color(25, 114, 219));
        jButton_Edit_16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton_Edit_16.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Edit_16.setText("EDIT");
        jButton_Edit_16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Edit_16ActionPerformed(evt);
            }
        });

        jButton_Del_16.setBackground(new java.awt.Color(237, 74, 74));
        jButton_Del_16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton_Del_16.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Del_16.setText("DELETE");
        jButton_Del_16.setPreferredSize(new java.awt.Dimension(80, 21));
        jButton_Del_16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Del_16ActionPerformed(evt);
            }
        });

        jLabel_DpScreen_16.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel_DpScreen_16.setForeground(new java.awt.Color(119, 119, 119));
        jLabel_DpScreen_16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconoir_group.png"))); // NOI18N
        jLabel_DpScreen_16.setText("Employee Screen");

        jButton_Refresh1_16.setBackground(new java.awt.Color(226, 226, 226));
        jButton_Refresh1_16.setForeground(new java.awt.Color(51, 51, 51));
        jButton_Refresh1_16.setText("Refresh");
        jButton_Refresh1_16.setBorder(null);
        jButton_Refresh1_16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Refresh1_16ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1_16, javax.swing.GroupLayout.DEFAULT_SIZE, 893, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel_DpScreen_16)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jTextField_search_16, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton_Refresh1_16, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jButton_Add_16, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton_Edit_16, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton_Del_16, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel_DpScreen_16, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_search_16, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Refresh1_16, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1_16, javax.swing.GroupLayout.DEFAULT_SIZE, 439, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_Add_16, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Edit_16, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Del_16, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField_search_16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_search_16ActionPerformed
  
    }//GEN-LAST:event_jTextField_search_16ActionPerformed

    private void jTextField_search_16KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_search_16KeyReleased
        searchTable(jTextField_search_16.getText());
    }//GEN-LAST:event_jTextField_search_16KeyReleased

    private void jButton_Add_16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Add_16ActionPerformed
        Emp_Add employee_Add = new Emp_Add();
         employee_Add.setVisible(true);
            try {
                refreshTableData(employeeService_61.getAllEmployee());
            } catch (SQLException ex) {
                Logger.getLogger(EmployeeJPanel.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_jButton_Add_16ActionPerformed

    private void jButton_Edit_16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Edit_16ActionPerformed
        DefaultTableModel tblModel = (DefaultTableModel) jTable_16.getModel();
        int id = Integer.parseInt(tblModel.getValueAt(jTable_16.getSelectedRow(), 0).toString());
        System.out.println(id);
        new Employee_Edit(id).setVisible(true);
    }//GEN-LAST:event_jButton_Edit_16ActionPerformed

    private void jButton_Del_16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Del_16ActionPerformed
        DefaultTableModel tblModel = (DefaultTableModel) jTable_16.getModel();
        int id = Integer.parseInt(tblModel.getValueAt(jTable_16.getSelectedRow(), 0).toString());

        try {
            employeeService_61.deleteEmployee(id);
            refreshTableData(employeeService_61.getAllEmployee());
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeJPanel.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButton_Del_16ActionPerformed

    private void jTextField_search_16FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField_search_16FocusGained
               if(jTextField_search_16.getText().equals("Search"))
            jTextField_search_16.setText("");
    }//GEN-LAST:event_jTextField_search_16FocusGained

    private void jTextField_search_16FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField_search_16FocusLost
                if(jTextField_search_16.getText().equals(""))
            jTextField_search_16.setText("Search");
    }//GEN-LAST:event_jTextField_search_16FocusLost

    private void jButton_Refresh1_16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Refresh1_16ActionPerformed
        try {
                refreshTableData(employeeService_61.getAllEmployee());
            } catch (SQLException ex) {
                Logger.getLogger(EmployeeJPanel.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_jButton_Refresh1_16ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Add_16;
    private javax.swing.JButton jButton_Del_16;
    private javax.swing.JButton jButton_Edit_16;
    private javax.swing.JButton jButton_Refresh1_16;
    private javax.swing.JLabel jLabel_DpScreen_16;
    private javax.swing.JScrollPane jScrollPane1_16;
    private javax.swing.JTable jTable_16;
    private javax.swing.JTextField jTextField_search_16;
    // End of variables declaration//GEN-END:variables
}
