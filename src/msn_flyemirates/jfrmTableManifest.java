package msn_flyemirates;

import java.sql.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class jfrmTableManifest extends javax.swing.JFrame {

    private Vector<Vector<String>> data;
    private Vector<String> header;
    public static String from = "";
    public static String to = "";

    public jfrmTableManifest() throws Exception {
        try {
            getVector();
            initComponents();
            getData();

        } catch (Exception ee) {
            System.out.println(ee.getMessage());
        }
    }

    private void getVector() {

        classTableManifest booking = new classTableManifest();
        try {
            data = booking.getPassenger();
        } catch (Exception ex) {
            Logger.getLogger(jfrmTableManifest.class.getName()).log(Level.SEVERE, null, ex);
        }

        header = new Vector<String>();
        header.add("RecieptNo");
        header.add("BillDate");
        header.add("BillTime");
        header.add("CusName");
        header.add("PassportNo");
        header.add("Age");
        header.add("Gender");
        header.add("SeatNo");
        header.add("FareType");
        header.add("FlightClass");
        header.add("Fare");
        header.add("Status");
        header.add("Leg ID");

    }

    private void getData() {
        try {
            DBConnection bConnection = new DBConnection();
            Connection con = bConnection.connect();
            Statement stm = con.createStatement();

            ResultSet results = stm.executeQuery("select * from Airport");

            while (results.next()) {
                jComboFrom.addItem(results.getString("AirAbbr"));
                jComboTo.addItem(results.getString("AirAbbr"));
            }

        } catch (Exception ee) {
            System.out.println(ee.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jComboFrom = new javax.swing.JComboBox();
        jLabel10 = new javax.swing.JLabel();
        jComboTo = new javax.swing.JComboBox();

        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(msn_flyemirates.MSN_FlyEmiratesApp.class).getContext().getResourceMap(jfrmTableManifest.class);
        setTitle(resourceMap.getString("Form.title")); // NOI18N
        setName("Form"); // NOI18N

        jScrollPane1.setName("jScrollPane1"); // NOI18N

        jTable1.setModel(new javax.swing.table.DefaultTableModel(data,header));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.setBackground(resourceMap.getColor("jPanel1.background")); // NOI18N
        jPanel1.setName("jPanel1"); // NOI18N

        jLabel11.setText(resourceMap.getString("jLabel11.text")); // NOI18N
        jLabel11.setName("jLabel11"); // NOI18N

        jComboFrom.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "None" }));
        jComboFrom.setName("jComboFrom"); // NOI18N
        jComboFrom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboFromActionPerformed(evt);
            }
        });

        jLabel10.setText(resourceMap.getString("jLabel10.text")); // NOI18N
        jLabel10.setName("jLabel10"); // NOI18N

        jComboTo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "None" }));
        jComboTo.setName("jComboTo"); // NOI18N
        jComboTo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboToActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboFrom, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboTo, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jComboFrom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(jComboTo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 619, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboFromActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboFromActionPerformed

        from = (String) jComboFrom.getSelectedItem();
        getVector();
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboFromActionPerformed

    private void jComboToActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboToActionPerformed
        to = (String) jComboTo.getSelectedItem();
        getVector();
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboToActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                try {
                    new jfrmTableManifest().setVisible(true);
                } catch (Exception e) {
                }
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox jComboFrom;
    private javax.swing.JComboBox jComboTo;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}

class classTableManifest {

    public Connection dbConnection() throws Exception {
        DBConnection bConnection = new DBConnection();
        return bConnection.connect();

    }

    public Vector getPassenger() throws Exception {
        Vector<Vector<String>> PassengerVector = new Vector<Vector<String>>();

        Connection conn = dbConnection();
        String Leg = "";
        try {
            DBConnection bConnection = new DBConnection();
            Connection con = bConnection.connect();
            Statement stm = con.createStatement();

            ResultSet results = stm.executeQuery("select LegID from FlightLegs where LegFrom='" + jfrmTableManifest.from + "' and LegTo='" + jfrmTableManifest.to + "'");

            while (results.next()) {
                Leg = results.getString("LegID");

                PreparedStatement pre2 = conn.prepareStatement("select * from bookings where legid='" + Leg + "'");
                ResultSet rs = pre2.executeQuery();
                while (rs.next()) {
                    Vector<String> Passenger = new Vector<String>();
                    Passenger.add(rs.getString(1));
                    Passenger.add(rs.getString(2));
                    Passenger.add(rs.getString(3));
                    Passenger.add(rs.getString(4));
                    Passenger.add(rs.getString(5));
                    Passenger.add(rs.getString(6));
                    Passenger.add(rs.getString(7));
                    Passenger.add(rs.getString(8));
                    Passenger.add(rs.getString(9));
                    Passenger.add(rs.getString(10));
                    Passenger.add(rs.getString(11));
                    Passenger.add(rs.getString(12));
                    Passenger.add(rs.getString(13));
                    PassengerVector.add(Passenger);

                    System.out.println(rs.getString(1));
                }
            }

        } catch (Exception ee) {
            System.out.println(ee.getMessage());
        }



        return PassengerVector;
    }
}
