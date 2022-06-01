package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import model.Timekeeping;
import service.EmployeeService;
import service.TimekeepingService;

public class TimekeepingJPanel extends javax.swing.JPanel {

        private EmployeeService employeeService;
        private TimekeepingService timekeepingService;

        DefaultTableModel defaultTableModel;

        public TimekeepingJPanel() throws SQLException, ParseException {
                employeeService = new EmployeeService();
                timekeepingService = new TimekeepingService();
                initComponents();

                //header design
                DefaultTableCellRenderer headerRenderer = new DefaultTableCellRenderer();
                headerRenderer.setBackground(new Color(102, 102, 102));
                headerRenderer.setForeground(Color.white);
                for (int i = 0; i < jTable1_16.getModel().getColumnCount(); i++) {
                        jTable1_16.getColumnModel().getColumn(i).setHeaderRenderer(headerRenderer);
                }
                
                //design column 
                jTable1_16.setGridColor(new Color(51, 51, 51));
                jTable1_16.getTableHeader().setFont(new Font("Tohoma", Font.BOLD, 14));
                jTable1_16.getTableHeader().setPreferredSize(new Dimension(100, 50));
                jTable1_16.setRowHeight(30);
                jTable1_16.validate();
                jTable1_16.repaint();
                jTable1_16.setOpaque(true);
                jTable1_16.setFillsViewportHeight(true);
                jTable1_16.setBackground(new Color(255, 255, 255));

                setTableData("2/6/2022");
        }

        private void setTableData(String day) throws SQLException, ParseException {

                DefaultTableModel model = (DefaultTableModel) jTable1_16.getModel();
                model.setRowCount(0);
                SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
                Date date = new Date();
                date = format.parse(day);
                List<Timekeeping> timekeepings = new ArrayList<Timekeeping>();
                timekeepings = timekeepingService.getTimekeepingByDay(new java.sql.Date(date.getTime()));
                Timekeeping timekeeping = new Timekeeping();
                for (Timekeeping i : timekeepings) {
                        model.addRow(new Object[]{i.getTimekeeping_Id(), i.getDay_keeping(), i.getEmployee_Id(),
                                employeeService.getEmployeeById(i.getEmployee_Id()).getEmployee_Name(),
                                (i.getStatus_().equals("Yes") ? true : false)
                        });
                }
        }

        @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                jLabel1_16 = new javax.swing.JLabel();
                jScrollPane1_16 = new javax.swing.JScrollPane();
                jTable1_16 = new javax.swing.JTable();
                jButton_Save_16 = new javax.swing.JButton();
                jButton3_16 = new javax.swing.JButton();
                jDateChooser_16 = new com.toedter.calendar.JDateChooser();
                jLabel2 = new javax.swing.JLabel();
                jButton4_16 = new javax.swing.JButton();

                jLabel1_16.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
                jLabel1_16.setForeground(new java.awt.Color(119, 119, 119));
                jLabel1_16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/la_business-time-1.png"))); // NOI18N
                jLabel1_16.setText("timekeeping");

                jTable1_16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
                jTable1_16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
                jTable1_16.setModel(new javax.swing.table.DefaultTableModel(
                        new Object [][] {

                        },
                        new String [] {
                                "Id", "Date", "Emp_id", "Name", "Status"
                        }
                ) {
                        Class[] types = new Class [] {
                                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Boolean.class
                        };
                        boolean[] canEdit = new boolean [] {
                                false, false, false, false, true
                        };

                        public Class getColumnClass(int columnIndex) {
                                return types [columnIndex];
                        }

                        public boolean isCellEditable(int rowIndex, int columnIndex) {
                                return canEdit [columnIndex];
                        }
                });
                jTable1_16.setColumnSelectionAllowed(true);
                jTable1_16.setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
                jTable1_16.setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
                jTable1_16.setShowGrid(true);
                jScrollPane1_16.setViewportView(jTable1_16);
                jTable1_16.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
                if (jTable1_16.getColumnModel().getColumnCount() > 0) {
                        jTable1_16.getColumnModel().getColumn(0).setResizable(false);
                        jTable1_16.getColumnModel().getColumn(1).setResizable(false);
                        jTable1_16.getColumnModel().getColumn(2).setResizable(false);
                        jTable1_16.getColumnModel().getColumn(3).setResizable(false);
                }

                jButton_Save_16.setBackground(new java.awt.Color(0, 204, 102));
                jButton_Save_16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
                jButton_Save_16.setForeground(new java.awt.Color(255, 255, 255));
                jButton_Save_16.setText("Save");
                jButton_Save_16.setMaximumSize(new java.awt.Dimension(61, 23));
                jButton_Save_16.setMinimumSize(new java.awt.Dimension(61, 23));
                jButton_Save_16.setPreferredSize(new java.awt.Dimension(61, 23));
                jButton_Save_16.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton_Save_16ActionPerformed(evt);
                        }
                });

                jButton3_16.setBackground(new java.awt.Color(237, 74, 74));
                jButton3_16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
                jButton3_16.setForeground(new java.awt.Color(255, 255, 255));
                jButton3_16.setLabel(" Un Tick All");
                jButton3_16.setMaximumSize(new java.awt.Dimension(61, 23));
                jButton3_16.setMinimumSize(new java.awt.Dimension(61, 23));
                jButton3_16.setPreferredSize(new java.awt.Dimension(61, 23));
                jButton3_16.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton3_16ActionPerformed(evt);
                        }
                });

                jDateChooser_16.setDateFormatString("dd/MM/yyyy");
                jDateChooser_16.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                jDateChooser_16.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
                        public void propertyChange(java.beans.PropertyChangeEvent evt) {
                                jDateChooser_16PropertyChange(evt);
                        }
                });

                jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                jLabel2.setText("Select Day");

                jButton4_16.setBackground(new java.awt.Color(25, 114, 219));
                jButton4_16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
                jButton4_16.setForeground(new java.awt.Color(255, 255, 255));
                jButton4_16.setText("Tíck All");
                jButton4_16.setMaximumSize(new java.awt.Dimension(61, 23));
                jButton4_16.setMinimumSize(new java.awt.Dimension(61, 23));
                jButton4_16.setPreferredSize(new java.awt.Dimension(61, 23));
                jButton4_16.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton4_16ActionPerformed(evt);
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
                                                .addComponent(jLabel1_16)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                        .addComponent(jScrollPane1_16, javax.swing.GroupLayout.DEFAULT_SIZE, 810, Short.MAX_VALUE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                .addComponent(jLabel2)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(jDateChooser_16, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                .addComponent(jButton_Save_16, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(jButton4_16, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(jButton3_16, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addContainerGap())
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1_16, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jDateChooser_16, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane1_16, javax.swing.GroupLayout.DEFAULT_SIZE, 365, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButton3_16, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton_Save_16, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton4_16, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap())
                );

                jButton3_16.getAccessibleContext().setAccessibleName("Un Tick All");
        }// </editor-fold>//GEN-END:initComponents

    private void jButton_Save_16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Save_16ActionPerformed
            TimekeepingService timekeepingService = new TimekeepingService();
            Timekeeping timekeeping = new Timekeeping();
            DefaultTableModel model = (DefaultTableModel) jTable1_16.getModel();
            for (int i = 0; i < model.getRowCount(); i++) {
                    try {
                            timekeeping.setTimekeeping_Id(Integer.parseInt(model.getValueAt(i, 0).toString()));
                            timekeeping.setStatus_(model.getValueAt(i, 4).toString().equals("true") ? "Yes" : "No");

                            if (!(timekeeping.getStatus_().equals(timekeepingService.getTimekeepingById(timekeeping.getTimekeeping_Id()).getStatus_()))) {
                                    if (timekeepingService.updateTimekeeping(timekeeping) == 1) {
                                    }

                            }
                    } catch (SQLException ex) {
                            Logger.getLogger(TimekeepingJPanel.class.getName()).log(Level.SEVERE, null, ex);
                    }
            }

    }//GEN-LAST:event_jButton_Save_16ActionPerformed

    private void jDateChooser_16PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jDateChooser_16PropertyChange

            SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
            String date = null;

            if (jDateChooser_16.getDate() != null) {
                    date = format.format(jDateChooser_16.getDate());
            }

            if (jDateChooser_16.getDate() != null)
             try {
                    setTableData(date);
            } catch (SQLException ex) {
                    Logger.getLogger(TimekeepingJPanel.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ParseException ex) {
                    Logger.getLogger(TimekeepingJPanel.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_jDateChooser_16PropertyChange

    private void jButton4_16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4_16ActionPerformed
            DefaultTableModel model = (DefaultTableModel) jTable1_16.getModel();
            for (int i = 0; i < model.getRowCount(); i++) {
                    model.setValueAt(true, i, 4);
            }

    }//GEN-LAST:event_jButton4_16ActionPerformed

    private void jButton3_16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3_16ActionPerformed
            DefaultTableModel model = (DefaultTableModel) jTable1_16.getModel();
            for (int i = 0; i < model.getRowCount(); i++) {
                    model.setValueAt(false, i, 4);
            }
    }//GEN-LAST:event_jButton3_16ActionPerformed


        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JButton jButton3_16;
        private javax.swing.JButton jButton4_16;
        private javax.swing.JButton jButton_Save_16;
        private com.toedter.calendar.JDateChooser jDateChooser_16;
        private javax.swing.JLabel jLabel1_16;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JScrollPane jScrollPane1_16;
        private javax.swing.JTable jTable1_16;
        // End of variables declaration//GEN-END:variables
}
