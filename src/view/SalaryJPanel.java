package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import model.Salary;
import model.Timekeeping;
import service.EmployeeService;
import service.SalaryService;
import service.TimekeepingService;

public class SalaryJPanel extends javax.swing.JPanel {

        private EmployeeService employeeService;
        private SalaryService salaryService;
        private TimekeepingService timekeepingService;
        DefaultTableModel defaultTableModel;

        public SalaryJPanel() throws SQLException, ParseException {
                initComponents();

                employeeService = new EmployeeService();
                salaryService = new SalaryService();
                timekeepingService = new TimekeepingService();
                defaultTableModel = new DefaultTableModel();

                tableSalary_53.setModel(defaultTableModel);
                defaultTableModel.addColumn("id");
                defaultTableModel.addColumn("name_emp");
                defaultTableModel.addColumn("year");
                defaultTableModel.addColumn("month");
                defaultTableModel.addColumn("coefficient_salary");
                defaultTableModel.addColumn("work day");
                defaultTableModel.addColumn("S/D");
                defaultTableModel.addColumn("bonus");
                defaultTableModel.addColumn("total");
                tableSalary_53.getTableHeader().setOpaque(false);

                //header design
                DefaultTableCellRenderer headerRenderer = new DefaultTableCellRenderer();
                headerRenderer.setBackground(new Color(102, 102, 102));
                headerRenderer.setForeground(Color.white);
                for (int i = 0; i < tableSalary_53.getModel().getColumnCount(); i++) {
                        tableSalary_53.getColumnModel().getColumn(i).setHeaderRenderer(headerRenderer);
                }

                //design column 
                tableSalary_53.setGridColor(new Color(51, 51, 51));
                tableSalary_53.getTableHeader().setFont(new Font("Tohoma", Font.BOLD, 14));
                tableSalary_53.getTableHeader().setPreferredSize(new Dimension(100, 50));
                tableSalary_53.setRowHeight(30);
                tableSalary_53.validate();
                tableSalary_53.repaint();
                tableSalary_53.setOpaque(true);
                tableSalary_53.setFillsViewportHeight(true);
                tableSalary_53.setBackground(new Color(255, 255, 255));
                setTableData(Integer.parseInt(jComboBox2_53.getSelectedItem().toString()), Integer.parseInt(jComboBox1_53.getSelectedItem().toString()));

        }

        private void setTableData(int m, int y) throws SQLException, ParseException {
                employeeService = new EmployeeService();
                salaryService = new SalaryService();
                timekeepingService = new TimekeepingService();
                DefaultTableModel model = (DefaultTableModel) tableSalary_53.getModel();
                model.setRowCount(0);

                List<Timekeeping> timekeepings = new ArrayList<Timekeeping>();
                timekeepings = timekeepingService.getAllTimekeepingByMT(m, y, y);
                List<Salary> salariesList = new ArrayList<Salary>();
                salariesList = salaryService.getSalaryByYearAndMonth(m, y);
                for (Salary i : salariesList) {
                        double sd, bonus, total;
                        sd = 100;
                        int x = 0;
                        timekeepings = timekeepingService.getAllTimekeepingByMT(m, y, i.getEmployee_Id());

                        for (Timekeeping j : timekeepings) {
                                if (j.getStatus_().equals("Yes")) {
                                        x++;
                                }
                        }
                        sd = sd * i.getCoefficient_salary();
                        bonus = i.getBonus();
                        total = sd * x + bonus;
                        model.addRow(new Object[]{i.getSalary_Id(),
                                employeeService.getEmployeeById(i.getEmployee_Id()).getEmployee_Name(),
                                y,
                                m,
                                i.getCoefficient_salary(),
                                x,
                                sd + "$",
                                bonus + "$",
                                total + "$"});
                }
        }

        @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1_53 = new javax.swing.JLabel();
        jLabel2_53 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableSalary_53 = new javax.swing.JTable();
        jComboBox1_53 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jComboBox2_53 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jButton_find_53 = new javax.swing.JButton();
        jButton_save_53 = new javax.swing.JButton();

        jLabel1_53.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/carbon_piggy-bank-1.png"))); // NOI18N

        jLabel2_53.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2_53.setForeground(new java.awt.Color(131, 189, 117));
        jLabel2_53.setText("Salary Screen");

        tableSalary_53.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tableSalary_53.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tableSalary_53.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Emp_Name", "Year", "Month", "coefficient_salary", "Work Day", "S/D", "Bonus", "Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableSalary_53.setColumnSelectionAllowed(true);
        tableSalary_53.setShowGrid(true);
        jScrollPane1.setViewportView(tableSalary_53);
        tableSalary_53.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        jComboBox1_53.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2022", "2021", "2020", "2019" }));

        jLabel2.setText("Select Year");

        jComboBox2_53.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));

        jLabel1.setText("Select Month");

        jButton_find_53.setBackground(new java.awt.Color(0, 153, 255));
        jButton_find_53.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton_find_53.setForeground(new java.awt.Color(255, 255, 255));
        jButton_find_53.setText("Find");
        jButton_find_53.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_find_53ActionPerformed(evt);
            }
        });

        jButton_save_53.setBackground(new java.awt.Color(0, 204, 0));
        jButton_save_53.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton_save_53.setForeground(new java.awt.Color(255, 255, 255));
        jButton_save_53.setText("Save");
        jButton_save_53.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_save_53ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1_53)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2_53)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 835, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jComboBox1_53, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBox2_53, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton_find_53, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton_save_53, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1_53)
                    .addComponent(jLabel2_53, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jComboBox1_53, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jComboBox2_53, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jButton_find_53, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 403, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton_save_53, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_find_53ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_find_53ActionPerformed
            try {
                    setTableData(Integer.parseInt(jComboBox2_53.getSelectedItem().toString()), Integer.parseInt(jComboBox1_53.getSelectedItem().toString()));
            } catch (SQLException ex) {
                    Logger.getLogger(SalaryJPanel.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ParseException ex) {
                    Logger.getLogger(SalaryJPanel.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_jButton_find_53ActionPerformed

    private void jButton_save_53ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_save_53ActionPerformed
            DefaultTableModel model = (DefaultTableModel) tableSalary_53.getModel();
            salaryService = new SalaryService();
            for (int i = 0; i < model.getRowCount(); i++) {
                    try {
                            if (salaryService.getSalaryById(Integer.parseInt(model.getValueAt(i, 0).toString())).getBonus() != Double.parseDouble(model.getValueAt(i, 7).toString().replace("$", "")) || salaryService.getSalaryById(Integer.parseInt(model.getValueAt(i, 0).toString())).getCoefficient_salary() != Integer.parseInt(model.getValueAt(i, 4).toString().replace("$", ""))) {
                                    Salary salary = new Salary();

                                    salary.setCoefficient_salary(Integer.parseInt(model.getValueAt(i, 4).toString().replace("$", "")));
                                    salary.setBonus(Double.parseDouble(model.getValueAt(i, 7).toString().replace("$", "")));
                                    salary.setSalary_Id(Integer.parseInt(model.getValueAt(i, 0).toString()));
                                    salaryService.updateSalary(salary);
                            }
                    } catch (SQLException ex) {
                            Logger.getLogger(SalaryJPanel.class.getName()).log(Level.SEVERE, null, ex);
                    }
            }

            try {
                    setTableData(Integer.parseInt(jComboBox2_53.getSelectedItem().toString()), Integer.parseInt(jComboBox1_53.getSelectedItem().toString()));
            } catch (SQLException ex) {
                    Logger.getLogger(SalaryJPanel.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ParseException ex) {
                    Logger.getLogger(SalaryJPanel.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_jButton_save_53ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_find_53;
    private javax.swing.JButton jButton_save_53;
    private javax.swing.JComboBox<String> jComboBox1_53;
    private javax.swing.JComboBox<String> jComboBox2_53;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel1_53;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel2_53;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableSalary_53;
    // End of variables declaration//GEN-END:variables
}
