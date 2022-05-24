/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.TextField;
import model.Department;
import service.DepartmentService;
import view.CRUD_View.Department_Add;
import view.CRUD_View.Department_Edit;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Jonny Dam
 */
public class DepartmentListJPanel extends javax.swing.JPanel {
    private DepartmentService departmentService;
    
    public DefaultTableModel getModelTable() {
        DefaultTableModel model = (DefaultTableModel) jTable_12.getModel();
        return model;
    }

    public void searchTable(String value) {
        TableRowSorter<DefaultTableModel> trs = new TableRowSorter<>(getModelTable());
        jTable_12.setRowSorter(trs);
        trs.setRowFilter(RowFilter.regexFilter(value));
    }

    DefaultTableModel defaultTableModel;

    public DepartmentListJPanel() throws SQLException {
        initComponents();
        departmentService = new DepartmentService();
        defaultTableModel = new DefaultTableModel() {
//            @Override
//            public boolean isCellEditable(int row, int column) {
//                return false;
//            }
        };
        jTable_12.setModel(defaultTableModel);
         defaultTableModel.addColumn("id");
        defaultTableModel.addColumn("name");
        setTableData(departmentService.getAllDepartment());
        
        //design table
         jTable_12.setModel(defaultTableModel);
        jTable_12.getTableHeader().setOpaque(false);
        
//        header design
            DefaultTableCellRenderer headerRenderer = new DefaultTableCellRenderer();
       headerRenderer.setBackground(new Color(102,102,102));
       headerRenderer.setForeground(Color.white);
       for (int i = 0; i < jTable_12.getModel().getColumnCount(); i++) {
               jTable_12.getColumnModel().getColumn(i).setHeaderRenderer(headerRenderer);
       }
       //design column 
       jTable_12.setGridColor(new Color (51,51,51));
        jTable_12.getTableHeader().setFont(new Font("Tohoma", Font.BOLD, 14));
        jTable_12.getTableHeader().setPreferredSize(new Dimension(100, 50));
        jTable_12.setRowHeight(30);
        jTable_12.validate();
        jTable_12.repaint();
        jTable_12.setOpaque(true);
        jTable_12.setFillsViewportHeight(true);
        jTable_12.setBackground( new Color(255,255,255));
    }

    private void setTableData(List<Department> departments) {
        for (Department department : departments) {
            defaultTableModel.addRow(new Object[]{department.getDepartment_Id(), department.getDepartment_Name()});
        }
    }

    private void refreshTableData(List<Department> departments) {
        defaultTableModel.setRowCount(0);
        setTableData(departments);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField_search_12 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_12 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton_Add_12 = new javax.swing.JButton();
        jButton_Del_12 = new javax.swing.JButton();
        jButton_Refresh_12 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(700, 600));
        setVerifyInputWhenFocusTarget(false);

        jTextField_search_12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField_search_12.setText("Search");
        jTextField_search_12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextField_search_12.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField_search_12FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField_search_12FocusLost(evt);
            }
        });
        jTextField_search_12.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_search_12KeyPressed(evt);
            }
        });

        jScrollPane1.setBackground(new java.awt.Color(0, 0, 0));
        jScrollPane1.setForeground(new java.awt.Color(255, 255, 255));

        jTable_12.setBackground(new java.awt.Color(102, 102, 102));
        jTable_12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jTable_12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTable_12.setForeground(new java.awt.Color(102, 102, 102));
        jTable_12.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable_12.setGridColor(new java.awt.Color(51, 51, 51));
        jTable_12.setShowGrid(true);
        jScrollPane1.setViewportView(jTable_12);

        jButton2.setBackground(new java.awt.Color(25, 114, 219));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("EDIT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton_Add_12.setBackground(new java.awt.Color(40, 133, 55));
        jButton_Add_12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton_Add_12.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Add_12.setText("ADD");
        jButton_Add_12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Add_12ActionPerformed(evt);
            }
        });

        jButton_Del_12.setBackground(new java.awt.Color(237, 74, 74));
        jButton_Del_12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton_Del_12.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Del_12.setText("DELETE");
        jButton_Del_12.setPreferredSize(new java.awt.Dimension(80, 21));
        jButton_Del_12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Del_12ActionPerformed(evt);
            }
        });

        jButton_Refresh_12.setBackground(new java.awt.Color(255, 255, 255));
        jButton_Refresh_12.setForeground(new java.awt.Color(51, 51, 51));
        jButton_Refresh_12.setText("Refresh");
        jButton_Refresh_12.setBorder(null);
        jButton_Refresh_12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Refresh_12ActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(180, 150));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Back-End");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 150, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Frame 2.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(180, 150));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Font-End");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 150, 40));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Frame 1.png"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setPreferredSize(new java.awt.Dimension(180, 150));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Marketing");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 150, 40));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Frame 3.png"))); // NOI18N
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(92, 92, 92)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextField_search_12, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton_Refresh_12, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton_Add_12, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton_Del_12, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_search_12, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Refresh_12, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Add_12, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Del_12, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_Add_12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Add_12ActionPerformed
        new Department_Add().setVisible(true);
    }//GEN-LAST:event_jButton_Add_12ActionPerformed

    private void jButton_Refresh_12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Refresh_12ActionPerformed
        DepartmentService departmentService;
        departmentService = new DepartmentService();
        try {
            refreshTableData(departmentService.getAllDepartment());
        } catch (SQLException ex) {
            Logger.getLogger(DepartmentListJPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton_Refresh_12ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         DefaultTableModel tblModel = (DefaultTableModel) jTable_12.getModel();
        int id = Integer.parseInt(tblModel.getValueAt(jTable_12.getSelectedRow(), 0).toString());
        System.out.println(id);
        new Department_Edit(id).setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed
    private void jButton_Del_12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Del_12ActionPerformed
         DefaultTableModel tblModel = (DefaultTableModel) jTable_12.getModel();
        int id = Integer.parseInt(tblModel.getValueAt(jTable_12.getSelectedRow(), 0).toString());
        try {
            departmentService.deleteDepartment(id);
        } catch (SQLException ex) {
            Logger.getLogger(DepartmentListJPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton_Del_12ActionPerformed

    private void jTextField_search_12KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_search_12KeyPressed
        searchTable(jTextField_search_12.getText());
    }//GEN-LAST:event_jTextField_search_12KeyPressed

    private void jTextField_search_12FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField_search_12FocusGained
        if(jTextField_search_12.getText().equals("Search"))
            jTextField_search_12.setText("");
    }//GEN-LAST:event_jTextField_search_12FocusGained

    private void jTextField_search_12FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField_search_12FocusLost
        if(jTextField_search_12.getText().equals(""))
            jTextField_search_12.setText("Search");
    }//GEN-LAST:event_jTextField_search_12FocusLost


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton_Add_12;
    private javax.swing.JButton jButton_Del_12;
    private javax.swing.JButton jButton_Refresh_12;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_12;
    private javax.swing.JTextField jTextField_search_12;
    // End of variables declaration//GEN-END:variables
}
