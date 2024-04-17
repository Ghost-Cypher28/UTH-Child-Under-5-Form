
package loginandsignup;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;

public class Login extends javax.swing.JFrame {

        public Login() {
                initComponents();
        }

        @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated
        // Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                jPanel1 = new javax.swing.JPanel();
                jPanel2 = new javax.swing.JPanel();
                jLabel1 = new javax.swing.JLabel();
                jLabel2 = new javax.swing.JLabel();
                jLabel3 = new javax.swing.JLabel();
                jPanel3 = new javax.swing.JPanel();
                jLabel4 = new javax.swing.JLabel();
                jLabel5 = new javax.swing.JLabel();
                jLabel6 = new javax.swing.JLabel();
                fname = new javax.swing.JTextField();
                lname = new javax.swing.JTextField();
                age = new javax.swing.JTextField();
                genderComboBox = new javax.swing.JComboBox<>();
                immunizations = new javax.swing.JTextField();
                jLabel7 = new javax.swing.JLabel();
                jLabel8 = new javax.swing.JLabel();
                jLabel9 = new javax.swing.JLabel();
                SignUpBtn = new javax.swing.JButton();
                jButton2 = new javax.swing.JButton();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
                setTitle("Child Registration Form");
                setPreferredSize(new java.awt.Dimension(800, 700));

                jPanel1.setBackground(new java.awt.Color(255, 255, 255));
                jPanel1.setPreferredSize(new java.awt.Dimension(800, 800));
                jPanel1.setLayout(null);

                jPanel2.setBackground(new java.awt.Color(255, 165, 0));

                jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/logo.png"))); // NOI18N

                jLabel2.setFont(new java.awt.Font("Showcard Gothic", 0, 24)); // NOI18N
                jLabel2.setForeground(new java.awt.Color(255, 255, 255));
                jLabel2.setText("UTH UNDER 5 FORM");

                jLabel3.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
                jLabel3.setForeground(new java.awt.Color(255, 255, 255));
                jLabel3.setText("copyright © 2024. Ghost-Cypher28. All rights reserved.");

                javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
                jPanel2.setLayout(jPanel2Layout);
                jPanel2Layout.setHorizontalGroup(
                                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel2Layout.createSequentialGroup()
                                                                .addGroup(jPanel2Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(jPanel2Layout
                                                                                                .createSequentialGroup()
                                                                                                .addGap(72, 72, 72)
                                                                                                .addComponent(jLabel3))
                                                                                .addGroup(jPanel2Layout
                                                                                                .createSequentialGroup()
                                                                                                .addGap(104, 104, 104)
                                                                                                .addComponent(jLabel2))
                                                                                .addGroup(jPanel2Layout
                                                                                                .createSequentialGroup()
                                                                                                .addGap(139, 139, 139)
                                                                                                .addComponent(jLabel1)))
                                                                .addContainerGap(51, Short.MAX_VALUE)));
                jPanel2Layout.setVerticalGroup(
                                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel2Layout.createSequentialGroup()
                                                                .addGap(133, 133, 133)
                                                                .addComponent(jLabel1)
                                                                .addGap(26, 26, 26)
                                                                .addComponent(jLabel2)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                108,
                                                                                Short.MAX_VALUE)
                                                                .addComponent(jLabel3)
                                                                .addGap(64, 64, 64)));

                jPanel1.add(jPanel2);
                jPanel2.setBounds(0, 0, 400, 700);

                jPanel3.setBackground(new java.awt.Color(255, 255, 255));

                jLabel4.setBackground(new java.awt.Color(0, 102, 102));
                jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
                jLabel4.setText("CHILD REGISTER FORM");

                jLabel5.setBackground(new java.awt.Color(102, 102, 102));
                jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
                jLabel5.setText("First name");

                fname.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
                fname.setForeground(new java.awt.Color(102, 102, 102));

                jLabel6.setBackground(new java.awt.Color(102, 102, 102));
                jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
                jLabel6.setText("Last name");

                lname.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
                lname.setForeground(new java.awt.Color(102, 102, 102));

                jLabel7.setBackground(new java.awt.Color(102, 102, 102));
                jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
                jLabel7.setText("Age");

                age.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
                age.setForeground(new java.awt.Color(102, 102, 102));

                String[] genderOptions = { "Male", "Female" };
                genderComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(genderOptions));

                jLabel8.setBackground(new java.awt.Color(102, 102, 102));
                jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
                jLabel8.setText("Gender");

                gender = new javax.swing.JTextField();
                genderComboBox = new javax.swing.JComboBox<>(genderOptions);

                gender.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
                gender.setForeground(new java.awt.Color(102, 102, 102));

                jLabel9.setBackground(new java.awt.Color(102, 102, 102));
                jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
                jLabel9.setText("Immunizations");

                immunizations.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
                immunizations.setForeground(new java.awt.Color(102, 102, 102));

                SignUpBtn.setBackground(new java.awt.Color(255, 165, 0));
                SignUpBtn.setForeground(new java.awt.Color(255, 255, 255));
                SignUpBtn.setText("Register");
                SignUpBtn.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                SignUpBtnActionPerformed(evt);
                        }
                });

                jButton2.setBackground(new java.awt.Color(255, 165, 0));
                jButton2.setForeground(new java.awt.Color(0, 102, 102));
                jButton2.setBounds(0, 0, 100, 10);
                jButton2.setText("Show List");
                jButton2.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton2ActionPerformed(evt);
                        }
                });

                javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
                jPanel3.setLayout(jPanel3Layout);
                jPanel3Layout.setHorizontalGroup(
                                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel3Layout.createSequentialGroup()
                                                                .addGroup(jPanel3Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(jPanel3Layout
                                                                                                .createSequentialGroup()
                                                                                                .addGap(145, 145, 145)
                                                                                                .addComponent(jLabel4))
                                                                                .addGroup(jPanel3Layout
                                                                                                .createSequentialGroup()
                                                                                                .addGap(44, 44, 44)
                                                                                                .addGroup(jPanel3Layout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                .addGroup(jPanel3Layout
                                                                                                                                .createParallelGroup(
                                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                                                                false)
                                                                                                                                .addComponent(jLabel5)
                                                                                                                                .addComponent(fname)
                                                                                                                                .addComponent(jLabel6)
                                                                                                                                .addComponent(lname)
                                                                                                                                .addComponent(jLabel7)
                                                                                                                                .addComponent(age,
                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                332,
                                                                                                                                                Short.MAX_VALUE)
                                                                                                                                .addComponent(jLabel9)
                                                                                                                                .addComponent(immunizations)
                                                                                                                                .addComponent(jLabel8)
                                                                                                                                .addComponent(gender))
                                                                                                                .addComponent(SignUpBtn,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                91,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addGroup(jPanel3Layout
                                                                                                                                .createSequentialGroup()
                                                                                                                                .addComponent(jLabel9)
                                                                                                                                .addPreferredGap(
                                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                                                                .addComponent(jButton2,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                84,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                                                .addContainerGap(24, Short.MAX_VALUE)));
                jPanel3Layout.setVerticalGroup(
                                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel3Layout.createSequentialGroup()
                                                                .addGap(28, 28, 28)
                                                                .addComponent(jLabel4)
                                                                .addGap(29, 29, 29)
                                                                .addComponent(jLabel5)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(fname,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                40,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(29, 29, 29)
                                                                .addComponent(jLabel6)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(lname,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                40,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(29, 29, 29)
                                                                .addComponent(jLabel7)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(age,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                40,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)

                                                                .addGap(29, 29, 29)
                                                                .addComponent(jLabel8)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(gender,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                40,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(29, 29, 29)
                                                                .addComponent(jLabel9)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(immunizations,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                40,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(29, 29, 29)
                                                                .addComponent(SignUpBtn,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                37,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(24, 24, 24)
                                                                .addGroup(jPanel3Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(jLabel9)
                                                                                .addComponent(jButton2,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                31,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addContainerGap(45, Short.MAX_VALUE)));

                jPanel1.add(jPanel3);
                jPanel3.setBounds(400, 0, 400, 800);

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jPanel1,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(0, 113, Short.MAX_VALUE)));
                layout.setVerticalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jPanel1,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(0, 126, Short.MAX_VALUE)));

                pack();
        }// </editor-fold>//GEN-END:initComponents

        private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton2ActionPerformed
                // TODO add your handling code here:
                RegisterListView RegisterListViewFrame = new RegisterListView();
                RegisterListViewFrame.setVisible(true);
                RegisterListViewFrame.pack();
                RegisterListViewFrame.setLocationRelativeTo(null);
                this.dispose();
        }// GEN-LAST:event_jButton2ActionPerformed

        private void SignUpBtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_SignUpBtnActionPerformed
                // System.out.println("Sign up btn clicked");
                String firstName, lastName, Age, Gender, Immunizations, query;
                String SUrl, SUser, SPass;
                SUrl = "jdbc:MySQL://localhost:3306/java_child_register_form?useSSL=false";
                SUser = "root";
                SPass = "";
                try {
                        Class.forName("com.mysql.cj.jdbc.Driver");
                        Connection con = DriverManager.getConnection(SUrl, SUser, SPass);
                        Statement st = con.createStatement();
                        if ("".equals(fname.getText())) {
                                JOptionPane.showMessageDialog(new JFrame(), "First Name is require", "Error",
                                                JOptionPane.ERROR_MESSAGE);
                        } else if ("".equals(lname.getText())) {
                                JOptionPane.showMessageDialog(new JFrame(), "Last Name Address is require", "Error",
                                                JOptionPane.ERROR_MESSAGE);
                        } else if ("".equals(age.getText())) {
                                JOptionPane.showMessageDialog(new JFrame(), "Age is require", "Error",
                                                JOptionPane.ERROR_MESSAGE);
                        } else if ("".equals(gender.getText())) {
                                JOptionPane.showMessageDialog(new JFrame(), "Gender is require", "Error",
                                                JOptionPane.ERROR_MESSAGE);
                        } else if ("".equals(immunizations.getText())) {
                                JOptionPane.showMessageDialog(new JFrame(), "Immunizations is require", "Error",
                                                JOptionPane.ERROR_MESSAGE);
                        } else {
                                firstName = fname.getText();
                                lastName = lname.getText();
                                Age = age.getText();
                                Gender = gender.getText();
                                Immunizations = immunizations.getText();
                                System.out.println(fname);

                                query = "INSERT INTO registered_child(firstName, lastName, Age, Gender, Immunizations)"
                                                +
                                                "VALUES('" + firstName + "', '" + lastName + "' ,  '" + Age + "' , '"
                                                + Gender + "' , '" + Immunizations + "')";

                                st.execute(query);
                                fname.setText("");
                                lname.setText("");
                                age.setText("");
                                gender.setText("");
                                immunizations.setText("");
                                showMessageDialog(null, "Your Registration has been created successfully!");
                        }
                } catch (Exception e) {
                        System.out.println("Error!" + e.getMessage());
                }

        }// GEN-LAST:event_SignUpBtnActionPerformed

        /**
         * @param args the command line arguments
         */

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JComboBox<String> genderComboBox;
        private javax.swing.JCheckBox bcgCheckBox;
        private javax.swing.JCheckBox mmrCheckBox;
        private javax.swing.JButton SignUpBtn;
        private javax.swing.JTextField age;
        private javax.swing.JTextField gender;
        private javax.swing.JTextField immunizations;
        private javax.swing.JTextField fname;
        private javax.swing.JTextField lname;
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
        private javax.swing.JPanel jPanel2;
        private javax.swing.JPanel jPanel3;
        // End of variables declaration//GEN-END:variables
}