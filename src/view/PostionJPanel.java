package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import model.Postion;
import service.PostionService;
import view.CRUD_View.Postion_Add;
import view.CRUD_View.Postion_Edit;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class PostionJPanel extends javax.swing.JPanel {

        private PostionService postionService16;

        public PostionJPanel() throws SQLException {
                initComponents();
                postionService16 = new PostionService();

                defaultTableModel_16 = new DefaultTableModel() {
                        @Override
                        public boolean isCellEditable(int row, int column) {
                                return false;
                        }
                };
                jTable_16.setModel(defaultTableModel_16);
                defaultTableModel_16.addColumn("id");
                defaultTableModel_16.addColumn("name");
                setTableData(postionService16.getAllPostion());

                jTable_16.setModel(defaultTableModel_16);
                jTable_16.getTableHeader().setOpaque(false);

                //header design
                DefaultTableCellRenderer headerRenderer = new DefaultTableCellRenderer();
                headerRenderer.setBackground(new Color(102, 102, 102));
                headerRenderer.setForeground(Color.white);
                headerRenderer.setFont(new Font("Tohoma", Font.BOLD, 18));
                for (int i = 0; i < jTable_16.getModel().getColumnCount(); i++) {
                        jTable_16.getColumnModel().getColumn(i).setHeaderRenderer(headerRenderer);
                }
                //design column 
                jTable_16.setGridColor(new Color(51, 51, 51));
                jTable_16.getTableHeader().setPreferredSize(new Dimension(100, 50));
                jTable_16.setRowHeight(30);
                jTable_16.validate();
                jTable_16.repaint();
                jTable_16.setOpaque(true);
                jTable_16.setFillsViewportHeight(true);
                jTable_16.setBackground(new Color(255, 255, 255));
        }

        public DefaultTableModel getModelTable() {
                DefaultTableModel model16 = (DefaultTableModel) jTable_16.getModel();
                return model16;
        }

        public void searchTable(String value) {
                TableRowSorter<DefaultTableModel> trs = new TableRowSorter<>(getModelTable());
                jTable_16.setRowSorter(trs);
                trs.setRowFilter(RowFilter.regexFilter(value));
        }

        DefaultTableModel defaultTableModel_16;

        private void setTableData(List<Postion> postion) {
                for (Postion Pos : postion) {
                        defaultTableModel_16.addRow(new Object[]{Pos.getPostion_Id(), Pos.getPostion_Name()});
                }
        }

        private void refreshTableData(List<Postion> postion) {
                defaultTableModel_16.setRowCount(0);
                setTableData(postion);
        }

        @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                jLabel1 = new javax.swing.JLabel();
                jTextField_search_16 = new javax.swing.JTextField();
                jScrollPane1 = new javax.swing.JScrollPane();
                jTable_16 = new javax.swing.JTable();
                jButton_Add_16 = new javax.swing.JButton();
                jButton_Edit_16 = new javax.swing.JButton();
                jButton_Del_16 = new javax.swing.JButton();
                jLabel_DpScreen_16 = new javax.swing.JLabel();
                jButton_Refresh_12 = new javax.swing.JButton();

                setPreferredSize(new java.awt.Dimension(831, 598));

                jLabel1.setText("Search");

                jTextField_search_16.addKeyListener(new java.awt.event.KeyAdapter() {
                        public void keyReleased(java.awt.event.KeyEvent evt) {
                                jTextField_search_16KeyReleased(evt);
                        }
                });

                jTable_16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
                jTable_16.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
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
                jTable_16.setShowGrid(true);
                jScrollPane1.setViewportView(jTable_16);

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

                jLabel_DpScreen_16.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
                jLabel_DpScreen_16.setText("Postion Screen");

                jButton_Refresh_12.setBackground(new java.awt.Color(226, 226, 226));
                jButton_Refresh_12.setForeground(new java.awt.Color(51, 51, 51));
                jButton_Refresh_12.setText("Refresh");
                jButton_Refresh_12.setBorder(null);
                jButton_Refresh_12.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton_Refresh_12ActionPerformed(evt);
                        }
                });

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
                this.setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 857, Short.MAX_VALUE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel_DpScreen_16)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jTextField_search_16, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel1))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jButton_Refresh_12, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(jButton_Add_16, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jButton_Edit_16, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jButton_Del_16, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap())
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel_DpScreen_16, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(23, 23, 23)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jTextField_search_16, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jButton_Refresh_12, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButton_Add_16, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton_Edit_16, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton_Del_16, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap())
                );
        }// </editor-fold>//GEN-END:initComponents

    private void jTextField_search_16KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_search_16KeyReleased
            searchTable(jTextField_search_16.getText());
    }//GEN-LAST:event_jTextField_search_16KeyReleased

    private void jButton_Add_16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Add_16ActionPerformed

            new Postion_Add().setVisible(true);
    }//GEN-LAST:event_jButton_Add_16ActionPerformed

    private void jButton_Edit_16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Edit_16ActionPerformed
            DefaultTableModel tblModel = (DefaultTableModel) jTable_16.getModel();
            int id = Integer.parseInt(tblModel.getValueAt(jTable_16.getSelectedRow(), 0).toString());
            System.out.println(id);
            new Postion_Edit(id).setVisible(true);
    }//GEN-LAST:event_jButton_Edit_16ActionPerformed

    private void jButton_Del_16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Del_16ActionPerformed
            DefaultTableModel tblModel = (DefaultTableModel) jTable_16.getModel();
            int id = Integer.parseInt(tblModel.getValueAt(jTable_16.getSelectedRow(), 0).toString());

            try {
                    postionService16.deletePostion(id);
                    refreshTableData(postionService16.getAllPostion());
            } catch (SQLException ex) {
                    Logger.getLogger(PostionJPanel.class.getName()).log(Level.SEVERE, null, ex);
            }

    }//GEN-LAST:event_jButton_Del_16ActionPerformed

    private void jButton_Refresh_12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Refresh_12ActionPerformed
            try {
                    refreshTableData(postionService16.getAllPostion());
            } catch (SQLException ex) {
                    Logger.getLogger(PostionJPanel.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_jButton_Refresh_12ActionPerformed

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JButton jButton_Add_16;
        private javax.swing.JButton jButton_Del_16;
        private javax.swing.JButton jButton_Edit_16;
        private javax.swing.JButton jButton_Refresh_12;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel_DpScreen_16;
        private javax.swing.JScrollPane jScrollPane1;
        private javax.swing.JTable jTable_16;
        private javax.swing.JTextField jTextField_search_16;
        // End of variables declaration//GEN-END:variables
}
