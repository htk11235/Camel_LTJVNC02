package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class SalaryJPanel extends javax.swing.JPanel {

     DefaultTableModel defaultTableModel;
    public SalaryJPanel() {
        initComponents();
                defaultTableModel = new DefaultTableModel() {
//            @Override
//            public boolean isCellEditable(int row, int column) {
//                return false;
//            }
        };
        tableSalary_53.setModel(defaultTableModel);
        tableSalary_53.getTableHeader().setOpaque(false);
        
//        header design
            DefaultTableCellRenderer headerRenderer = new DefaultTableCellRenderer();
       headerRenderer.setBackground(new Color(102,102,102));
       headerRenderer.setForeground(Color.white);
       for (int i = 0; i < tableSalary_53.getModel().getColumnCount(); i++) {
               tableSalary_53.getColumnModel().getColumn(i).setHeaderRenderer(headerRenderer);
       }
       //design column 
       tableSalary_53.setGridColor(new Color (51,51,51));
        tableSalary_53.getTableHeader().setFont(new Font("Tohoma", Font.BOLD, 14));
        tableSalary_53.getTableHeader().setPreferredSize(new Dimension(100, 50));
        tableSalary_53.setRowHeight(30);
        tableSalary_53.validate();
        tableSalary_53.repaint();
        tableSalary_53.setOpaque(true);
        tableSalary_53.setFillsViewportHeight(true);
        tableSalary_53.setBackground( new Color(255,255,255));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1_53 = new javax.swing.JLabel();
        jLabel2_53 = new javax.swing.JLabel();
        jPanel2_53 = new javax.swing.JPanel();
        jTextField_Search_53 = new javax.swing.JTextField();
        jLabel4_53 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableSalary_53 = new javax.swing.JTable();
        jPanel1_53 = new javax.swing.JPanel();
        jButton_SelectMonth_53 = new javax.swing.JButton();
        jButton_SelectYear_53 = new javax.swing.JButton();
        jButton_edit_53 = new javax.swing.JButton();

        jLabel1_53.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/carbon_piggy-bank-1.png"))); // NOI18N

        jLabel2_53.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2_53.setForeground(new java.awt.Color(131, 189, 117));
        jLabel2_53.setText("Salary Screen");

        jPanel2_53.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jTextField_Search_53.setMinimumSize(new java.awt.Dimension(64, 24));
        jTextField_Search_53.setPreferredSize(new java.awt.Dimension(64, 24));
        jTextField_Search_53.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_Search_53ActionPerformed(evt);
            }
        });

        jLabel4_53.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-search-24.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2_53Layout = new javax.swing.GroupLayout(jPanel2_53);
        jPanel2_53.setLayout(jPanel2_53Layout);
        jPanel2_53Layout.setHorizontalGroup(
            jPanel2_53Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2_53Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField_Search_53, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4_53)
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel2_53Layout.setVerticalGroup(
            jPanel2_53Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTextField_Search_53, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
            .addGroup(jPanel2_53Layout.createSequentialGroup()
                .addComponent(jLabel4_53)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        tableSalary_53.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tableSalary_53);

        jButton_SelectMonth_53.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton_SelectMonth_53.setForeground(new java.awt.Color(78, 148, 79));
        jButton_SelectMonth_53.setText("Select Month");

        jButton_SelectYear_53.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton_SelectYear_53.setForeground(new java.awt.Color(78, 148, 79));
        jButton_SelectYear_53.setText("Select Year");

        javax.swing.GroupLayout jPanel1_53Layout = new javax.swing.GroupLayout(jPanel1_53);
        jPanel1_53.setLayout(jPanel1_53Layout);
        jPanel1_53Layout.setHorizontalGroup(
            jPanel1_53Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1_53Layout.createSequentialGroup()
                .addComponent(jButton_SelectMonth_53)
                .addGap(38, 38, 38)
                .addComponent(jButton_SelectYear_53)
                .addContainerGap(51, Short.MAX_VALUE))
        );
        jPanel1_53Layout.setVerticalGroup(
            jPanel1_53Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1_53Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1_53Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_SelectMonth_53)
                    .addComponent(jButton_SelectYear_53))
                .addContainerGap())
        );

        jButton_edit_53.setBackground(new java.awt.Color(25, 114, 219));
        jButton_edit_53.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton_edit_53.setForeground(new java.awt.Color(255, 255, 255));
        jButton_edit_53.setText("EDIT");
        jButton_edit_53.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_edit_53ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 522, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1_53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(71, 71, 71)
                                .addComponent(jPanel2_53, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel2_53)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jPanel1_53, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton_edit_53, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1_53)
                    .addComponent(jLabel2_53, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addComponent(jPanel2_53, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(jPanel1_53, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_edit_53, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField_Search_53ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_Search_53ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_Search_53ActionPerformed

    private void jButton_edit_53ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_edit_53ActionPerformed
       
    }//GEN-LAST:event_jButton_edit_53ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_SelectMonth_53;
    private javax.swing.JButton jButton_SelectYear_53;
    private javax.swing.JButton jButton_edit_53;
    private javax.swing.JLabel jLabel1_53;
    private javax.swing.JLabel jLabel2_53;
    private javax.swing.JLabel jLabel4_53;
    private javax.swing.JPanel jPanel1_53;
    private javax.swing.JPanel jPanel2_53;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField_Search_53;
    private javax.swing.JTable tableSalary_53;
    // End of variables declaration//GEN-END:variables
}
