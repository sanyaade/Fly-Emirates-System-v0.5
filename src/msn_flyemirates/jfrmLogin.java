package msn_flyemirates;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class jfrmLogin extends javax.swing.JFrame {

    public static String UserType = "";
    public static int Admin = 0;

    public jfrmLogin() {
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
        jtxtPass = new javax.swing.JPasswordField();
        javax.swing.JLabel imageLabel1 = new javax.swing.JLabel();

        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(msn_flyemirates.MSN_FlyEmiratesApp.class).getContext().getResourceMap(jfrmLogin.class);
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

        jtxtPass.setText(resourceMap.getString("jtxtPass.text")); // NOI18N
        jtxtPass.setName("jtxtPass"); // NOI18N

        imageLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Harsha\\Desktop\\icons\\login.jpg")); // NOI18N
        imageLabel1.setName("imageLabel1"); // NOI18N
        imageLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imageLabel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imageLabel1)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jtxtUser, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel2)
                .addGap(24, 24, 24)
                .addComponent(jtxtPass, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(jbutLog, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jbutClose, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(imageLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jtxtUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jtxtPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbutLog, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbutClose, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
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

            ResultSet results = stm.executeQuery("select strPass,strType from Login where strUser='" + jtxtUser.getText() + "'");
            String Pass = "";
            int flag = 0;
            while (results.next()) {
                
                UserType = results.getString("strType") + " | " + jtxtUser.getText();
                Pass = results.getString("strPass");

                if (results.getString("strType").equals("admin")) {
                    Admin = 1;
                } else {
                    Admin = 0;
                }

                if (jtxtPass.getText().equals(Pass)) {
                    flag = 1;
                    break;
                } else {
                    continue;
                }

            }

            if (flag == 1) {
                JOptionPane.showMessageDialog(this, "You are Welcome");
                MSN_FlyEmiratesApp app = new MSN_FlyEmiratesApp();
                app.startup11();
                dispose();

            } else {
                JOptionPane.showMessageDialog(this, "Incorrect Password");
            }

        } catch (Exception ee) {
            System.out.println(ee.getMessage());
        }
    }//GEN-LAST:event_jbutLogActionPerformed

    private void imageLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imageLabel1MouseClicked
}//GEN-LAST:event_imageLabel1MouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new jfrmLogin().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton jbutClose;
    private javax.swing.JButton jbutLog;
    private javax.swing.JPasswordField jtxtPass;
    private javax.swing.JTextField jtxtUser;
    // End of variables declaration//GEN-END:variables
}
