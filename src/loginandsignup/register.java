
package loginandsignup;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;

public class  extends javax.swing.JFrame {

        public () {
                initComponents();
        }

        @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated
        // Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                jPanel1 = new javax.swing.JPanel();
                Right = new javax.swing.JPanel();
                jLabel5 = new javax.swing.JLabel();
                jLabel6 = new javax.swing.JLabel();
                jLabel7 = new javax.swing.JLabel();
                jLabel8 = new javax.swing.JLabel();
                jLabel9 = new javax.swing.JLabel();
                Left = new javax.swing.JPanel();
                jLabel1 = new javax.swing.JLabel();
                jLabel2 = new javax.swing.JLabel();
                email = new javax.swing.JTextField();
                jLabel3 = new javax.swing.JLabel();
                password = new javax.swing.JPasswordField();
                RegisterBtn = new javax.swing.JButton();
                jLabel4 = new javax.swing.JLabel();
                jButton2 = new javax.swing.JButton();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
                setTitle("Register Your Child Here");
                setPreferredSize(new java.awt.Dimension(1200, 800));

                jPanel1.setBackground(new java.awt.Color(255, 255, 255));
                jPanel1.setPreferredSize(new java.awt.Dimension(1200, 800));
                jPanel1.setLayout(null);

                Right.setBackground(new java.awt.Color(0, 102, 102));
                Right.setPreferredSize(new java.awt.Dimension(600, 800));

                jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/logo.png"))); // NOI18N

                jLabel8.setFont(new java.awt.Font("Showcard Gothic", 1, 24)); // NOI18N
                jLabel8.setForeground(new java.awt.Color(255, 255, 255));
                jLabel8.setText("Company Name");

                jLabel9.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
                jLabel9.setForeground(new java.awt.Color(204, 204, 204));
                jLabel9.setText("copyright © company name All rights reserved");

                javax.swing.GroupLayout RightLayout = new javax.swing.GroupLayout(Right);
                Right.setLayout(RightLayout);
                RightLayout.setHorizontalGroup(
                                RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                RightLayout.createSequentialGroup()
                                                                                .addGap(0, 81, Short.MAX_VALUE)
                                                                                .addComponent(jLabel7)
                                                                                .addGap(40, 40, 40))
                                                .addGroup(RightLayout.createSequentialGroup()
                                                                .addGroup(RightLayout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(RightLayout
                                                                                                .createSequentialGroup()
                                                                                                .addGap(103, 103, 103)
                                                                                                .addComponent(jLabel6))
                                                                                .addGroup(RightLayout
                                                                                                .createSequentialGroup()
                                                                                                .addGap(145, 145, 145)
                                                                                                .addComponent(jLabel5)))
                                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)));
                RightLayout.setVerticalGroup(
                                RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(RightLayout.createSequentialGroup()
                                                                .addGap(136, 136, 136)
                                                                .addComponent(jLabel5)
                                                                .addGap(26, 26, 26)
                                                                .addComponent(jLabel6)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                91,
                                                                                Short.MAX_VALUE)
                                                                .addComponent(jLabel7)
                                                                .addGap(78, 78, 78)));

                jPanel1.add(Right);
                Right.setBounds(0, 0, 600, 800);

                Left.setBackground(new java.awt.Color(255, 255, 255));
                Left.setMinimumSize(new java.awt.Dimension(400, 500));

                jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
                jLabel1.setForeground(new java.awt.Color(0, 102, 102));
                jLabel1.setText("Register Your Child");

                jLabel2.setBackground(new java.awt.Color(102, 102, 102));
                jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
                jLabel2.setText("First Name");

                jLabel3.setBackground(new java.awt.Color(102, 102, 102));
                jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
                jLabel3.setText("Last Name");

                jLabel4.setBackground(new java.awt.Color(102, 102, 102));
                jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
                jLabel4.setText("Age");

                email.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
                email.setForeground(new java.awt.Color(102, 102, 102));

                jLabel5.setBackground(new java.awt.Color(102, 102, 102));
                jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
                jLabel5.setText("Password");

                RegisterBtn.setBackground(new java.awt.Color(0, 102, 102));
                RegisterBtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
                RegisterBtn.setForeground(new java.awt.Color(255, 255, 255));
                RegisterBtn.setText("Register");
                RegisterBtn.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                RegisterBtnActionPerformed(evt);
                        }
                });

                jLabel6.setText("I don't have an account");

                jButton2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
                jButton2.setForeground(new java.awt.Color(255, 51, 51));
                jButton2.setText("Sign Up");
                jButton2.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton2ActionPerformed(evt);
                        }
                });

                javax.swing.GroupLayout LeftLayout = new javax.swing.GroupLayout(Left);
                Left.setLayout(LeftLayout);
                LeftLayout.setHorizontalGroup(
                                LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(LeftLayout.createSequentialGroup()
                                                                .addGroup(LeftLayout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(LeftLayout
                                                                                                .createSequentialGroup()
                                                                                                .addGap(138, 138, 138)
                                                                                                .addComponent(jLabel1))
                                                                                .addGroup(LeftLayout
                                                                                                .createSequentialGroup()
                                                                                                .addGap(30, 30, 30)
                                                                                                .addGroup(LeftLayout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                .addGroup(LeftLayout
                                                                                                                                .createParallelGroup(
                                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                                                                false)
                                                                                                                                .addComponent(jLabel2)
                                                                                                                                .addComponent(email)
                                                                                                                                .addComponent(jLabel3)
                                                                                                                                .addComponent(email)
                                                                                                                                .addComponent(jLabel4)
                                                                                                                                .addComponent(email)
                                                                                                                                .addComponent(jLabel5)
                                                                                                                                .addComponent(password,
                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                343,
                                                                                                                                                Short.MAX_VALUE)
                                                                                                                                .addComponent(RegisterBtn,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                93,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                                .addGroup(LeftLayout
                                                                                                                                .createSequentialGroup()
                                                                                                                                .addComponent(jLabel6)
                                                                                                                                .addPreferredGap(
                                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                                                .addComponent(jButton2)))))
                                                                .addContainerGap(27, Short.MAX_VALUE)));
                LeftLayout.setVerticalGroup(
                                LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(LeftLayout.createSequentialGroup()
                                                                .addGap(51, 51, 51)
                                                                .addComponent(jLabel1)
                                                                .addGap(40, 40, 40)
                                                                .addComponent(jLabel2)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(email,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                40,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(jLabel3)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(email,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                40,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(jLabel4)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(password,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                40,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jLabel5)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(email,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                40,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(26, 26, 26)
                                                                .addComponent(RegisterBtn,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                36,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(33, 33, 33)
                                                                .addGroup(LeftLayout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(jLabel6)
                                                                                .addComponent(jButton2))
                                                                .addContainerGap(77, Short.MAX_VALUE)));

                jPanel1.add(Left);
                Left.setBounds(400, 0, 600, 800);

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jPanel1,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(0, 0, Short.MAX_VALUE)));
                layout.setVerticalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jPanel1,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(0, 0, Short.MAX_VALUE)));

                pack();
        }// </editor-fold>//GEN-END:initComponents

        private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton2ActionPerformed

                SignUp SignUpFrame = new SignUp();
                SignUpFrame.setVisible(true);
                SignUpFrame.pack();
                SignUpFrame.setLocationRelativeTo(null);
                this.dispose();
        }// GEN-LAST:event_jButton2ActionPerformed

        private void RegisterBtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_RegisterBtnActionPerformed
                // System.out.println("Sign up btn clicked");
                String Email, Password, query, fname = null, passDb = null;
                String SUrl, SUser, SPass;
                SUrl = "jdbc:MySQL://localhost:3306/java_user_database";
                SUser = "root";
                SPass = "";
                int notFound = 0;
                try {
                        Class.forName("com.mysql.cj.jdbc.Driver");
                        Connection con = DriverManager.getConnection(SUrl, SUser, SPass);
                        Statement st = con.createStatement();
                        if ("".equals(email.getText())) {
                                JOptionPane.showMessageDialog(new JFrame(), "Email Address is require", "Error",
                                                JOptionPane.ERROR_MESSAGE);
                        } else if ("".equals(password.getText())) {
                                JOptionPane.showMessageDialog(new JFrame(), "Password is require", "Error",
                                                JOptionPane.ERROR_MESSAGE);
                        } else {
                                Email = email.getText();
                                Password = password.getText();

                                query = "SELECT * FROM user WHERE email= '" + Email + "'";

                                ResultSet rs = st.executeQuery(query);
                                while (rs.next()) {
                                        passDb = rs.getString("password");
                                        fname = rs.getString("full_name");
                                        notFound = 1;
                                }
                                if (notFound == 1 && Password.equals(passDb)) {
                                        Home HomeFrame = new Home();
                                        HomeFrame.setUser(fname);
                                        HomeFrame.setVisible(true);
                                        HomeFrame.pack();
                                        HomeFrame.setLocationRelativeTo(null);
                                        this.dispose();
                                } else {
                                        JOptionPane.showMessageDialog(new JFrame(), "Incorrect email or password",
                                                        "Error",
                                                        JOptionPane.ERROR_MESSAGE);
                                }
                                password.setText("");

                        }
                } catch (Exception e) {
                        System.out.println("Error!" + e.getMessage());
                }

        }// GEN-LAST:event_RegisterBtnActionPerformed

        /**
         * @param args the commxand line arguments
         */

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JPanel Left;
        private javax.swing.JButton RegisterBtn;
        private javax.swing.JPanel Right;
        private javax.swing.JTextField email;
        private javax.swing.JButton jButton2;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JLabel jLabel4;
        private javax.swing.JLabel jLabel5;
        private javax.swing.JLabel jLabel6;
        private javax.swing.JLabel jLabel7;
        private javax.swing.JLabel jLabel8;
        private javax.swing.JLabel jLabel9;
        private javax.swing.JPanel jPanel1;
        private javax.swing.JPasswordField password;
        // End of variables declaration//GEN-END:variables
}