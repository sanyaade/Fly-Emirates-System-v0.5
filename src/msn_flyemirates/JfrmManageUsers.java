package msn_flyemirates;

import com.mysql.jdbc.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class JfrmManageUsers extends javax.swing.JFrame {
    public JfrmManageUsers() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jtxtUser = new javax.swing.JTextField();
        jbutLog = new javax.swing.JButton();
        jbutClose = new javax.swing.JButton();
        javax.swing.JLabel imageLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jtxtPass = new javax.swing.JTextField();

        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(msn_flyemirates.MSN_FlyEmiratesApp.class).getContext().getResourceMap(JfrmManageUsers.class);
        setTitle(resourceMap.getString("Form.title")); // NOI18N
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setName("Form"); // NOI18N

        jLabel1.setText(resourceMap.getString("jLabel1.text")); // NOI18N
        jLabel1.setName("jLabel1"); // NOI18N

        jLabel2.setText(resourceMap.getString("jLabel2.text")); // NOI18N
        jLabel2.setName("jLabel2"); // NOI18N

        jtxtUser.setText(resourceMap.getString("jtxtUser.text")); // NOI18N
        jtxtUser.setName("jtxtUser"); // NOI18N

        jbutLog.setText(resourceMap.getString("jbutLog.text")); // NOI18N
        jbutLog.setName("jbutLog"); // NOI18N
        jbutLog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbutLogActionPerformed(evt);
            }
        });

        jbutClose.setText(resourceMap.getString("jbutClose.text")); // NOI18N
        jbutClose.setName("jbutClose"); // NOI18N
        jbutClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbutCloseActionPerformed(evt);
            }
        });

        imageLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Harsha\\Documents\\NetBeansProjects\\MSN_FlyEmirates\\src\\msn_flyemirates\\resources\\key.png")); // NOI18N
        imageLabel1.setName("imageLabel1"); // NOI18N
        imageLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imageLabel1MouseClicked(evt);
            }
        });

        jLabel3.setText(resourceMap.getString("jLabel3.text")); // NOI18N
        jLabel3.setName("jLabel3"); // NOI18N

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "admin", "officer" }));
        jComboBox1.setName("jComboBox1"); // NOI18N

        jButton1.setText(resourceMap.getString("jButton1.text")); // NOI18N
        jButton1.setName("jButton1"); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText(resourceMap.getString("jButton2.text")); // NOI18N
        jButton2.setName("jButton2"); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText(resourceMap.getString("jButton3.text")); // NOI18N
        jButton3.setName("jButton3"); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jtxtPass.setText(resourceMap.getString("jtxtPass.text")); // NOI18N
        jtxtPass.setName("jtxtPass"); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(imageLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel1)
                        .addGap(10, 10, 10)
                        .addComponent(jtxtUser, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jtxtPass, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel3)
                        .addGap(40, 40, 40)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(87, 87, 87)
                        .addComponent(jButton3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jbutLog)
                        .addGap(10, 10, 10)
                        .addComponent(jbutClose)
                        .addGap(7, 7, 7)
                        .addComponent(jButton2)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(imageLabel1)
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jtxtUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton1))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel2))
                    .addComponent(jtxtPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel3))
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jButton3)))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbutLog)
                    .addComponent(jbutClose)
                    .addComponent(jButton2))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbutLogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbutLogActionPerformed

        if (jtxtUser.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Enter Details");
            return;
        }
        if (jtxtPass.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Enter Details");
            return;
        }

        try {
            DBConnection bConnection = new DBConnection();
            Connection con = bConnection.connect();
            Statement stm = con.createStatement();

            PreparedStatement s1 = (PreparedStatement) con.prepareStatement("Insert into login values(?,?,?)");
            s1.setString(1, jtxtUser.getText());
            s1.setString(2, jtxtPass.getText());
            s1.setString(3, (String) jComboBox1.getSelectedItem());


            int save = s1.executeUpdate();
            JOptionPane.showMessageDialog(this, "Data Saved Successfully!!");
            Clear();
        } catch (Exception ee) {
            System.out.println(ee.getMessage());
            JOptionPane.showMessageDialog(this, ee.getMessage());
        }
    }//GEN-LAST:event_jbutLogActionPerformed

    public void Clear() {
        jtxtPass.setText("");
        jtxtUser.setText("");
    }

    private void imageLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imageLabel1MouseClicked
        dispose();
        // TODO add your handling code here:
}//GEN-LAST:event_imageLabel1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        if (jtxtUser.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Enter UserName");
            return;
        }

        try {
            DBConnection bConnection = new DBConnection();
            Connection con = bConnection.connect();
            Statement stm = con.createStatement();

            ResultSet results = stm.executeQuery("select * from login where strUser='" + jtxtUser.getText() + "'");

            while (results.next()) {
                jtxtPass.setText(results.getString("strPass"));
                jComboBox1.setSelectedItem(results.getString("strType")+"");

            }

        } catch (Exception ee) {
            System.out.println(ee.getMessage());
        }


        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jbutCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbutCloseActionPerformed
        if (jtxtPass.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Enter Details");
            return;
        }
        if (jtxtUser.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Enter Details");
            return;
        }


        try {
            DBConnection bConnection = new DBConnection();
            Connection con = bConnection.connect();
            Statement stm = con.createStatement();


            PreparedStatement s1 = (PreparedStatement) con.prepareStatement("update login set strPass='" + jtxtPass.getText() + "',strType='" + (String)jComboBox1.getSelectedItem() + "" + "' where strUser='" + jtxtUser.getText() + "'");
            int update = s1.executeUpdate();
            JOptionPane.showMessageDialog(this, "Data Successfully Updated!!");
            Clear();
        } catch (Exception ee) {
            System.out.println(ee.getMessage());
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_jbutCloseActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            DBConnection bConnection = new DBConnection();
            Connection con = bConnection.connect();
            Statement stm = con.createStatement();

            if (jtxtUser.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Enter Details");
                return;
            }

            PreparedStatement s1 = (PreparedStatement) con.prepareStatement("delete from login where strUser='" + jtxtUser.getText() + "'");
            int delete = s1.executeUpdate();

            JOptionPane.showMessageDialog(this, "User Deleted!!");
            Clear();
        } catch (Exception ee) {
            System.out.println(ee.getMessage());
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Clear();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new JfrmManageUsers().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton jbutClose;
    private javax.swing.JButton jbutLog;
    private javax.swing.JTextField jtxtPass;
    private javax.swing.JTextField jtxtUser;
    // End of variables declaration//GEN-END:variables
}
