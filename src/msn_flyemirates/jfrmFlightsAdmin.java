package msn_flyemirates;

import com.mysql.jdbc.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class jfrmFlightsAdmin extends javax.swing.JFrame {

    public jfrmFlightsAdmin() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        txtAirID = new javax.swing.JTextField();
        txtAirNAme = new javax.swing.JTextField();
        txtAirSeats = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtAirCompany = new javax.swing.JTextField();
        cmdSearch = new javax.swing.JButton();
        cmdClose = new javax.swing.JButton();
        Airtype = new javax.swing.JComboBox();
        cmdSave = new javax.swing.JButton();
        cmdUpdate = new javax.swing.JButton();
        cmdDelete = new javax.swing.JButton();

        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(msn_flyemirates.MSN_FlyEmiratesApp.class).getContext().getResourceMap(jfrmFlightsAdmin.class);
        setTitle(resourceMap.getString("Form.title")); // NOI18N
        setName("Form"); // NOI18N

        jLabel6.setText(resourceMap.getString("jLabel6.text")); // NOI18N
        jLabel6.setName("jLabel6"); // NOI18N

        txtAirID.setName("txtAirID"); // NOI18N

        txtAirNAme.setName("txtAirNAme"); // NOI18N

        txtAirSeats.setName("txtAirSeats"); // NOI18N

        jLabel9.setText(resourceMap.getString("jLabel9.text")); // NOI18N
        jLabel9.setName("jLabel9"); // NOI18N

        jLabel8.setText(resourceMap.getString("jLabel8.text")); // NOI18N
        jLabel8.setName("jLabel8"); // NOI18N

        jLabel7.setText(resourceMap.getString("jLabel7.text")); // NOI18N
        jLabel7.setName("jLabel7"); // NOI18N

        jLabel5.setText(resourceMap.getString("jLabel5.text")); // NOI18N
        jLabel5.setName("jLabel5"); // NOI18N

        txtAirCompany.setName("txtAirCompany"); // NOI18N

        cmdSearch.setText(resourceMap.getString("cmdSearch.text")); // NOI18N
        cmdSearch.setName("cmdSearch"); // NOI18N
        cmdSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdSearchActionPerformed(evt);
            }
        });

        cmdClose.setText(resourceMap.getString("cmdClose.text")); // NOI18N
        cmdClose.setName("cmdClose"); // NOI18N
        cmdClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCloseActionPerformed(evt);
            }
        });

        Airtype.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "A", "B", "C" }));
        Airtype.setName("Airtype"); // NOI18N

        cmdSave.setText(resourceMap.getString("cmdSave.text")); // NOI18N
        cmdSave.setName("cmdSave"); // NOI18N
        cmdSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdSaveActionPerformed(evt);
            }
        });

        cmdUpdate.setText(resourceMap.getString("cmdUpdate.text")); // NOI18N
        cmdUpdate.setName("cmdUpdate"); // NOI18N
        cmdUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdUpdateActionPerformed(evt);
            }
        });

        cmdDelete.setText(resourceMap.getString("cmdDelete.text")); // NOI18N
        cmdDelete.setName("cmdDelete"); // NOI18N
        cmdDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(17, 17, 17)
                                .addComponent(txtAirID, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(cmdSearch))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(20, 20, 20)
                                .addComponent(txtAirNAme, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addComponent(cmdClose))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(9, 9, 9)
                                .addComponent(txtAirSeats, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(4, 4, 4)
                                .addComponent(Airtype, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(txtAirCompany, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(cmdSave)
                        .addGap(3, 3, 3)
                        .addComponent(cmdUpdate)
                        .addGap(13, 13, 13)
                        .addComponent(cmdDelete)))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(txtAirID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmdSearch))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel7))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(txtAirNAme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cmdClose))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAirSeats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(Airtype, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(txtAirCompany, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmdSave)
                    .addComponent(cmdUpdate)
                    .addComponent(cmdDelete))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmdSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdSearchActionPerformed


        try {
            DBConnection bConnection = new DBConnection();
            Connection con = bConnection.connect();
            Statement stm = con.createStatement();

            ResultSet results = stm.executeQuery("select * from Airplane where AirID='" + txtAirID.getText() + "'");

            while (results.next()) {
                txtAirNAme.setText(results.getString("AirName"));
                txtAirSeats.setText(results.getString("TotSeats"));
                Airtype.setSelectedItem(results.getString("AirType"));
                txtAirCompany.setText(results.getString("Company"));

            }

        } catch (Exception ee) {
            System.out.println(ee.getMessage());
        }

    }//GEN-LAST:event_cmdSearchActionPerformed

    private void cmdCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCloseActionPerformed
        Clear();
    }//GEN-LAST:event_cmdCloseActionPerformed

    private void cmdSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdSaveActionPerformed


        if (txtAirID.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Enter Details");
            return;
        }
        if (txtAirNAme.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Enter Details");
            return;
        }
        if (txtAirCompany.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Enter Details");
            return;
        }
        if (txtAirSeats.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Enter Details");
            return;
        }

        try {
            DBConnection bConnection = new DBConnection();
            Connection con = bConnection.connect();
            Statement stm = con.createStatement();


            PreparedStatement s1 = (PreparedStatement) con.prepareStatement("Insert into Airplane values(?,?,?,?,?)");
            s1.setString(1, txtAirID.getText());
            s1.setString(2, txtAirNAme.getText());
            s1.setString(3, txtAirSeats.getText());
            s1.setString(4, Airtype.getSelectedItem()+"");
            s1.setString(5, txtAirCompany.getText());

            int save = s1.executeUpdate();
            JOptionPane.showMessageDialog(this, "Data Saved Successfully!!");
            Clear();
        } catch (Exception ee) {
            System.out.println(ee.getMessage());
            JOptionPane.showMessageDialog(this, ee.getMessage());
        }


    }//GEN-LAST:event_cmdSaveActionPerformed

    private void cmdUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdUpdateActionPerformed


        if (txtAirID.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Enter Details");
            return;
        }
        if (txtAirNAme.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Enter Details");
            return;
        }
        if (txtAirCompany.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Enter Details");
            return;
        }
        if (txtAirSeats.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Enter Details");
            return;
        }


        try {
            DBConnection bConnection = new DBConnection();
            Connection con = bConnection.connect();
            Statement stm = con.createStatement();

            if (txtAirID.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Enter Details");
                return;
            }

            PreparedStatement s1 = (PreparedStatement) con.prepareStatement("update Airplane set AirName='" + txtAirNAme.getText() + "',TotSeats='" + txtAirSeats.getText() + "',AirType='" + Airtype.getSelectedItem() + "',Company='" + txtAirCompany.getText() + "' where AirID='" + txtAirID.getText() + "'");
            int update = s1.executeUpdate();
            JOptionPane.showMessageDialog(this, "Data Successfully Updated!!");
            Clear();
        } catch (Exception ee) {
            System.out.println(ee.getMessage());
        }
}//GEN-LAST:event_cmdUpdateActionPerformed

    private void cmdDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdDeleteActionPerformed


        try {
            DBConnection bConnection = new DBConnection();
            Connection con = bConnection.connect();
            Statement stm = con.createStatement();

            if (txtAirID.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Enter Details");
                return;
            }

            PreparedStatement s1 = (PreparedStatement) con.prepareStatement("delete from Airplane where AirID='" + txtAirID.getText() + "'");
            int delete = s1.executeUpdate();

            JOptionPane.showMessageDialog(this, "Row Deleted!!");
            Clear();
        } catch (Exception ee) {
            System.out.println(ee.getMessage());
        }
    }//GEN-LAST:event_cmdDeleteActionPerformed

    public void Clear() {

        txtAirCompany.setText("");
        txtAirSeats.setText("");
       txtAirID.setText("");
        txtAirNAme.setText("");
     

    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new jfrmFlightsAdmin().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox Airtype;
    private javax.swing.JButton cmdClose;
    private javax.swing.JButton cmdDelete;
    private javax.swing.JButton cmdSave;
    private javax.swing.JButton cmdSearch;
    private javax.swing.JButton cmdUpdate;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtAirCompany;
    private javax.swing.JTextField txtAirID;
    private javax.swing.JTextField txtAirNAme;
    private javax.swing.JTextField txtAirSeats;
    // End of variables declaration//GEN-END:variables
}
