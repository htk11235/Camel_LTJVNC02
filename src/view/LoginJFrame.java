package view;

import com.formdev.flatlaf.FlatLightLaf;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Employee;
import dao.EmployeeDAO;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class LoginJFrame extends javax.swing.JFrame {

        Employee user;
        EmployeeDAO userDao;

        public LoginJFrame() {
                initComponents();

                user = new Employee();
                userDao = new EmployeeDAO();
                passwordField1_61.setEchoChar((char) 0);
        }

        @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                jPanel1_61 = new javax.swing.JPanel();
                passwordField1_61 = new javax.swing.JPasswordField();
                email_TextField_61 = new javax.swing.JTextField();
                jLabel2_61 = new javax.swing.JLabel();
                jLabel3_61 = new javax.swing.JLabel();
                jPanel2_61 = new javax.swing.JPanel();
                jLabel4 = new javax.swing.JLabel();
                jLabel5 = new javax.swing.JLabel();
                jPanel3_loginbutton_61 = new javax.swing.JPanel();
                jLabel1_61 = new javax.swing.JLabel();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
                setTitle("Login");
                setBounds(new java.awt.Rectangle(0, 0, 650, 500));
                setPreferredSize(new java.awt.Dimension(918, 630));

                jPanel1_61.setBackground(new java.awt.Color(255, 255, 255));
                jPanel1_61.setForeground(new java.awt.Color(255, 255, 255));
                jPanel1_61.setPreferredSize(new java.awt.Dimension(865, 630));

                passwordField1_61.setBackground(new java.awt.Color(255, 255, 255));
                passwordField1_61.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
                passwordField1_61.setForeground(new java.awt.Color(0, 0, 0));
                passwordField1_61.setText("password");
                passwordField1_61.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
                passwordField1_61.addFocusListener(new java.awt.event.FocusAdapter() {
                        public void focusGained(java.awt.event.FocusEvent evt) {
                                passwordField1_61FocusGained(evt);
                        }
                        public void focusLost(java.awt.event.FocusEvent evt) {
                                passwordField1_61FocusLost(evt);
                        }
                });

                email_TextField_61.setBackground(new java.awt.Color(255, 255, 255));
                email_TextField_61.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
                email_TextField_61.setForeground(new java.awt.Color(0, 0, 0));
                email_TextField_61.setText("username");
                email_TextField_61.setToolTipText("");
                email_TextField_61.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
                email_TextField_61.addFocusListener(new java.awt.event.FocusAdapter() {
                        public void focusGained(java.awt.event.FocusEvent evt) {
                                email_TextField_61FocusGained(evt);
                        }
                        public void focusLost(java.awt.event.FocusEvent evt) {
                                email_TextField_61FocusLost(evt);
                        }
                });

                jLabel2_61.setBackground(new java.awt.Color(38, 51, 57));
                jLabel2_61.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
                jLabel2_61.setForeground(new java.awt.Color(38, 51, 57));
                jLabel2_61.setText("Sign in to your account");

                jLabel3_61.setBackground(new java.awt.Color(38, 51, 57));
                jLabel3_61.setFont(new java.awt.Font("Tw Cen MT", 1, 48)); // NOI18N
                jLabel3_61.setForeground(new java.awt.Color(38, 51, 57));
                jLabel3_61.setText("Hello!");

                jPanel2_61.setBackground(new java.awt.Color(255, 255, 255));
                jPanel2_61.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 2, new java.awt.Color(204, 204, 204)));

                jLabel4.setBackground(new java.awt.Color(255, 255, 255));
                jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/undraw_Co_workers_re_1i6i (1).png"))); // NOI18N
                jLabel4.setPreferredSize(new java.awt.Dimension(389, 389));

                jLabel5.setFont(new java.awt.Font("Tw Cen MT", 1, 39)); // NOI18N
                jLabel5.setForeground(new java.awt.Color(0, 0, 0));
                jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                jLabel5.setText("Employee Management");
                jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

                javax.swing.GroupLayout jPanel2_61Layout = new javax.swing.GroupLayout(jPanel2_61);
                jPanel2_61.setLayout(jPanel2_61Layout);
                jPanel2_61Layout.setHorizontalGroup(
                        jPanel2_61Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2_61Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
                                .addContainerGap())
                        .addGroup(jPanel2_61Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                );
                jPanel2_61Layout.setVerticalGroup(
                        jPanel2_61Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2_61Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(60, Short.MAX_VALUE))
                );

                jPanel3_loginbutton_61.setBackground(new java.awt.Color(0, 0, 0));
                jPanel3_loginbutton_61.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
                jPanel3_loginbutton_61.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                jPanel3_loginbutton_61MouseClicked(evt);
                        }
                });

                jLabel1_61.setBackground(new java.awt.Color(0, 0, 0));
                jLabel1_61.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
                jLabel1_61.setForeground(new java.awt.Color(255, 255, 255));
                jLabel1_61.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                jLabel1_61.setText("Sign in");

                javax.swing.GroupLayout jPanel3_loginbutton_61Layout = new javax.swing.GroupLayout(jPanel3_loginbutton_61);
                jPanel3_loginbutton_61.setLayout(jPanel3_loginbutton_61Layout);
                jPanel3_loginbutton_61Layout.setHorizontalGroup(
                        jPanel3_loginbutton_61Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3_loginbutton_61Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1_61, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
                );
                jPanel3_loginbutton_61Layout.setVerticalGroup(
                        jPanel3_loginbutton_61Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3_loginbutton_61Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1_61, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                                .addContainerGap())
                );

                javax.swing.GroupLayout jPanel1_61Layout = new javax.swing.GroupLayout(jPanel1_61);
                jPanel1_61.setLayout(jPanel1_61Layout);
                jPanel1_61Layout.setHorizontalGroup(
                        jPanel1_61Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1_61Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(jPanel2_61, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1_61Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1_61Layout.createSequentialGroup()
                                                .addGap(46, 46, 46)
                                                .addGroup(jPanel1_61Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(passwordField1_61, javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(email_TextField_61)
                                                        .addComponent(jPanel3_loginbutton_61, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addGap(90, 90, 90))
                                        .addGroup(jPanel1_61Layout.createSequentialGroup()
                                                .addGroup(jPanel1_61Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel1_61Layout.createSequentialGroup()
                                                                .addGap(65, 65, 65)
                                                                .addComponent(jLabel2_61))
                                                        .addGroup(jPanel1_61Layout.createSequentialGroup()
                                                                .addGap(122, 122, 122)
                                                                .addComponent(jLabel3_61)))
                                                .addContainerGap(94, Short.MAX_VALUE))))
                );
                jPanel1_61Layout.setVerticalGroup(
                        jPanel1_61Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1_61Layout.createSequentialGroup()
                                .addContainerGap(46, Short.MAX_VALUE)
                                .addGroup(jPanel1_61Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1_61Layout.createSequentialGroup()
                                                .addComponent(jLabel3_61)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel2_61)
                                                .addGap(57, 57, 57)
                                                .addComponent(email_TextField_61, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(30, 30, 30)
                                                .addComponent(passwordField1_61, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(66, 66, 66)
                                                .addComponent(jPanel3_loginbutton_61, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(117, 117, 117))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1_61Layout.createSequentialGroup()
                                                .addComponent(jPanel2_61, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(73, 73, 73))))
                );

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1_61, javax.swing.GroupLayout.PREFERRED_SIZE, 918, javax.swing.GroupLayout.PREFERRED_SIZE)
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1_61, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                );

                getAccessibleContext().setAccessibleName("Sign In");

                pack();
                setLocationRelativeTo(null);
        }// </editor-fold>//GEN-END:initComponents

        private void email_TextField_61FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_email_TextField_61FocusGained
                // TODO add your handling code here:
                if (email_TextField_61.getText().equals("username")) {
                        email_TextField_61.setText("");
                }
        }//GEN-LAST:event_email_TextField_61FocusGained

        private void email_TextField_61FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_email_TextField_61FocusLost
                // TODO add your handling code here:
                if (email_TextField_61.getText().equals("")) {
                        email_TextField_61.setText("username");
                }
        }//GEN-LAST:event_email_TextField_61FocusLost

        private void passwordField1_61FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordField1_61FocusGained
                // TODO add your handling code here:
                if (passwordField1_61.getText().equals("password")) {
                        passwordField1_61.setEchoChar('*');
                        passwordField1_61.setText("");
                }
        }//GEN-LAST:event_passwordField1_61FocusGained

        private void passwordField1_61FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordField1_61FocusLost
                // TODO add your handling code here:
                if (passwordField1_61.getText().equals("")) {
                        passwordField1_61.setEchoChar((char) 0);
                        passwordField1_61.setText("password");
                }
        }//GEN-LAST:event_passwordField1_61FocusLost

    private void jPanel3_loginbutton_61MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3_loginbutton_61MouseClicked
            // TODO add your handling code here:
            user.setEmail(email_TextField_61.getText());
            user.setPass(String.valueOf(passwordField1_61.getPassword()));
            try {
                    if (userDao.isLoginUser(user)) {
                            user = userDao.getEmployeeByEmail(user.getEmail());
                            MainFrame m = new MainFrame();
                            m.ChangeName("hi, " + user.getEmployee_Name());
                            m.setVisible(true);
                            this.dispose();
                    } else {
                            JOptionPane.showMessageDialog(this, "The username or password you entered is incorrect.", "Wrong", JOptionPane.WARNING_MESSAGE);
                    }
            } catch (SQLException ex) {
                    Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_jPanel3_loginbutton_61MouseClicked

        public static void main(String args[]) throws UnsupportedLookAndFeelException {
                /* Set the Nimbus look and feel */
                //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
                /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
                 */
                UIManager.setLookAndFeel(new FlatLightLaf());
                //</editor-fold>
                //</editor-fold>

                /* Create and display the form */
                java.awt.EventQueue.invokeLater(new Runnable() {
                        public void run() {
                                new LoginJFrame().setVisible(true);
                        }
                });
        }

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JTextField email_TextField_61;
        private javax.swing.JLabel jLabel1_61;
        private javax.swing.JLabel jLabel2_61;
        private javax.swing.JLabel jLabel3_61;
        private javax.swing.JLabel jLabel4;
        private javax.swing.JLabel jLabel5;
        private javax.swing.JPanel jPanel1_61;
        private javax.swing.JPanel jPanel2_61;
        private javax.swing.JPanel jPanel3_loginbutton_61;
        private javax.swing.JPasswordField passwordField1_61;
        // End of variables declaration//GEN-END:variables
}
