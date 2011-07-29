package msn_flyemirates;

import com.mysql.jdbc.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class jfrmBookingforAdmin extends javax.swing.JFrame {

  public jfrmBookingforAdmin() {
        initComponents();
        LoadData();
        generateNo();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cmdSave = new javax.swing.JButton();
        cmdUpdate = new javax.swing.JButton();
        cmdDelete = new javax.swing.JButton();
        cmdClear = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        txtReNo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        cmdSearch = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtFlightNo = new javax.swing.JTextField();
        txtArrTime = new javax.swing.JTextField();
        txtDepartTime = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtTo = new javax.swing.JTextField();
        txtFrom = new javax.swing.JTextField();
        txtAirType = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cmdLegIDSeeker = new javax.swing.JButton();
        txtFlightLegID = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtStatus = new javax.swing.JComboBox();
        txtClass = new javax.swing.JComboBox();
        txtSeatNo = new javax.swing.JTextField();
        txtPassport = new javax.swing.JTextField();
        txtCusName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtAge = new javax.swing.JTextField();
        txtGender = new javax.swing.JComboBox();
        txtFareType = new javax.swing.JComboBox();
        txtFare = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        txtBillDate = new javax.swing.JTextField();
        txtBillTime = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();

        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(msn_flyemirates.MSN_FlyEmiratesApp.class).getContext().getResourceMap(jfrmBookingforAdmin.class);
        setTitle(resourceMap.getString("Form.title")); // NOI18N
        setName("Form"); // NOI18N
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cmdSave.setText(resourceMap.getString("cmdSave.text")); // NOI18N
        cmdSave.setName("cmdSave"); // NOI18N
        cmdSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdSaveActionPerformed(evt);
            }
        });
        getContentPane().add(cmdSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 450, 80, 40));

        cmdUpdate.setText(resourceMap.getString("cmdUpdate.text")); // NOI18N
        cmdUpdate.setName("cmdUpdate"); // NOI18N
        cmdUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdUpdateActionPerformed(evt);
            }
        });
        getContentPane().add(cmdUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 450, 150, 40));

        cmdDelete.setText(resourceMap.getString("cmdDelete.text")); // NOI18N
        cmdDelete.setName("cmdDelete"); // NOI18N
        cmdDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdDeleteActionPerformed(evt);
            }
        });
        getContentPane().add(cmdDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 450, -1, 40));

        cmdClear.setText(resourceMap.getString("cmdClear.text")); // NOI18N
        cmdClear.setName("cmdClear"); // NOI18N
        cmdClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdClearActionPerformed(evt);
            }
        });
        getContentPane().add(cmdClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 450, 80, 40));

        jPanel1.setBackground(resourceMap.getColor("jPanel1.background")); // NOI18N
        jPanel1.setName("jPanel1"); // NOI18N

        txtReNo.setBackground(resourceMap.getColor("txtReNo.background")); // NOI18N
        txtReNo.setText(resourceMap.getString("txtReNo.text")); // NOI18N
        txtReNo.setName("txtReNo"); // NOI18N
        txtReNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtReNoActionPerformed(evt);
            }
        });

        jLabel1.setText(resourceMap.getString("jLabel1.text")); // NOI18N
        jLabel1.setName("jLabel1"); // NOI18N

        cmdSearch.setText(resourceMap.getString("cmdSearch.text")); // NOI18N
        cmdSearch.setName("cmdSearch"); // NOI18N
        cmdSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtReNo, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmdSearch)
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtReNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmdSearch)
                    .addComponent(jLabel1))
                .addGap(21, 21, 21))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 240, 50));

        jPanel2.setBackground(resourceMap.getColor("jPanel2.background")); // NOI18N
        jPanel2.setName("jPanel2"); // NOI18N

        jLabel9.setText(resourceMap.getString("jLabel9.text")); // NOI18N
        jLabel9.setName("jLabel9"); // NOI18N

        jLabel8.setText(resourceMap.getString("jLabel8.text")); // NOI18N
        jLabel8.setName("jLabel8"); // NOI18N

        jLabel7.setText(resourceMap.getString("jLabel7.text")); // NOI18N
        jLabel7.setName("jLabel7"); // NOI18N

        txtFlightNo.setBackground(resourceMap.getColor("txtDepartTime.background")); // NOI18N
        txtFlightNo.setText(resourceMap.getString("txtFlightNo.text")); // NOI18N
        txtFlightNo.setName("txtFlightNo"); // NOI18N

        txtArrTime.setBackground(resourceMap.getColor("txtDepartTime.background")); // NOI18N
        txtArrTime.setText(resourceMap.getString("txtArrTime.text")); // NOI18N
        txtArrTime.setName("txtArrTime"); // NOI18N

        txtDepartTime.setBackground(resourceMap.getColor("txtDepartTime.background")); // NOI18N
        txtDepartTime.setText(resourceMap.getString("txtDepartTime.text")); // NOI18N
        txtDepartTime.setName("txtDepartTime"); // NOI18N

        jLabel11.setText(resourceMap.getString("jLabel11.text")); // NOI18N
        jLabel11.setName("jLabel11"); // NOI18N

        jLabel10.setText(resourceMap.getString("jLabel10.text")); // NOI18N
        jLabel10.setName("jLabel10"); // NOI18N

        txtTo.setBackground(resourceMap.getColor("txtDepartTime.background")); // NOI18N
        txtTo.setText(resourceMap.getString("txtTo.text")); // NOI18N
        txtTo.setName("txtTo"); // NOI18N

        txtFrom.setBackground(resourceMap.getColor("txtDepartTime.background")); // NOI18N
        txtFrom.setText(resourceMap.getString("txtFrom.text")); // NOI18N
        txtFrom.setName("txtFrom"); // NOI18N

        txtAirType.setBackground(resourceMap.getColor("txtDepartTime.background")); // NOI18N
        txtAirType.setText(resourceMap.getString("txtAirType.text")); // NOI18N
        txtAirType.setName("txtAirType"); // NOI18N

        jLabel5.setText(resourceMap.getString("jLabel5.text")); // NOI18N
        jLabel5.setName("jLabel5"); // NOI18N

        cmdLegIDSeeker.setText(resourceMap.getString("cmdLegIDSeeker.text")); // NOI18N
        cmdLegIDSeeker.setName("cmdLegIDSeeker"); // NOI18N
        cmdLegIDSeeker.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdLegIDSeekerActionPerformed(evt);
            }
        });

        txtFlightLegID.setText(resourceMap.getString("txtFlightLegID.text")); // NOI18N
        txtFlightLegID.setName("txtFlightLegID"); // NOI18N

        jLabel6.setText(resourceMap.getString("jLabel6.text")); // NOI18N
        jLabel6.setName("jLabel6"); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(txtFlightLegID, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmdLegIDSeeker, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel7)
                        .addGap(31, 31, 31)
                        .addComponent(txtFlightNo, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(92, 92, 92)
                        .addComponent(jLabel5)
                        .addComponent(txtAirType, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel8)
                        .addGap(17, 17, 17)
                        .addComponent(txtArrTime, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(92, 92, 92)
                        .addComponent(jLabel11)
                        .addGap(39, 39, 39)
                        .addComponent(txtFrom, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel9)
                        .addGap(15, 15, 15)
                        .addComponent(txtDepartTime, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(92, 92, 92)
                        .addComponent(jLabel10)
                        .addGap(51, 51, 51)
                        .addComponent(txtTo, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtFlightLegID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmdLegIDSeeker))
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(txtFlightNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtAirType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(txtArrTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(txtFrom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(txtDepartTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(txtTo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 460, 160));

        jPanel3.setName("jPanel3"); // NOI18N

        jLabel2.setText(resourceMap.getString("jLabel2.text")); // NOI18N
        jLabel2.setName("jLabel2"); // NOI18N

        jLabel3.setText(resourceMap.getString("jLabel3.text")); // NOI18N
        jLabel3.setName("jLabel3"); // NOI18N

        jLabel17.setText(resourceMap.getString("jLabel17.text")); // NOI18N
        jLabel17.setName("jLabel17"); // NOI18N

        jLabel18.setText(resourceMap.getString("jLabel18.text")); // NOI18N
        jLabel18.setName("jLabel18"); // NOI18N

        jLabel13.setText(resourceMap.getString("jLabel13.text")); // NOI18N
        jLabel13.setName("jLabel13"); // NOI18N

        txtStatus.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ON", "OFF" }));
        txtStatus.setName("txtStatus"); // NOI18N

        txtClass.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "A", "B", "C" }));
        txtClass.setName("txtClass"); // NOI18N

        txtSeatNo.setText(resourceMap.getString("txtSeatNo.text")); // NOI18N
        txtSeatNo.setName("txtSeatNo"); // NOI18N

        txtPassport.setText(resourceMap.getString("txtPassport.text")); // NOI18N
        txtPassport.setName("txtPassport"); // NOI18N

        txtCusName.setText(resourceMap.getString("txtCusName.text")); // NOI18N
        txtCusName.setName("txtCusName"); // NOI18N

        jLabel4.setText(resourceMap.getString("jLabel4.text")); // NOI18N
        jLabel4.setName("jLabel4"); // NOI18N

        txtAge.setText(resourceMap.getString("txtAge.text")); // NOI18N
        txtAge.setName("txtAge"); // NOI18N

        txtGender.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Male", "Female" }));
        txtGender.setName("txtGender"); // NOI18N

        txtFareType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Full", "Half" }));
        txtFareType.setName("txtFareType"); // NOI18N

        txtFare.setText(resourceMap.getString("txtFare.text")); // NOI18N
        txtFare.setName("txtFare"); // NOI18N

        jLabel14.setText(resourceMap.getString("jLabel14.text")); // NOI18N
        jLabel14.setName("jLabel14"); // NOI18N

        jLabel12.setText(resourceMap.getString("jLabel12.text")); // NOI18N
        jLabel12.setName("jLabel12"); // NOI18N

        jLabel19.setText(resourceMap.getString("jLabel19.text")); // NOI18N
        jLabel19.setName("jLabel19"); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(10, 10, 10)
                        .addComponent(txtCusName, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(71, 71, 71)
                        .addComponent(jLabel4)
                        .addGap(34, 34, 34)
                        .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(28, 28, 28)
                        .addComponent(txtPassport, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(72, 72, 72)
                        .addComponent(jLabel12)
                        .addGap(18, 18, 18)
                        .addComponent(txtGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel17)
                        .addGap(45, 45, 45)
                        .addComponent(txtSeatNo, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(71, 71, 71)
                        .addComponent(jLabel19)
                        .addGap(4, 4, 4)
                        .addComponent(txtFareType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel13))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jLabel18)))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(txtClass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(169, 169, 169)
                                .addComponent(jLabel14)
                                .addGap(31, 31, 31)
                                .addComponent(txtFare, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel2))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(txtCusName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel4))
                    .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel3))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(txtPassport, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel12))
                    .addComponent(txtGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel17))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(txtSeatNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel19))
                    .addComponent(txtFareType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel13))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(txtClass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel14))
                    .addComponent(txtFare, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(txtStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 440, 190));

        jPanel4.setName("jPanel4"); // NOI18N

        jLabel15.setText(resourceMap.getString("jLabel15.text")); // NOI18N
        jLabel15.setName("jLabel15"); // NOI18N

        txtBillDate.setText(resourceMap.getString("txtBillDate.text")); // NOI18N
        txtBillDate.setName("txtBillDate"); // NOI18N

        txtBillTime.setText(resourceMap.getString("txtBillTime.text")); // NOI18N
        txtBillTime.setName("txtBillTime"); // NOI18N

        jLabel16.setText(resourceMap.getString("jLabel16.text")); // NOI18N
        jLabel16.setName("jLabel16"); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addGap(10, 10, 10)
                        .addComponent(txtBillDate, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addGap(10, 10, 10)
                        .addComponent(txtBillTime, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel15))
                    .addComponent(txtBillDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel16))
                    .addComponent(txtBillTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, -1, 80));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void generateNo() {

        try {
            DBConnection bConnection = new DBConnection();
            Connection conn = bConnection.connect();
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery("SELECT MAX(RecieptNo) FROM bookings");

            String id = "";
            while (rs.next()) {
                id = rs.getString(1);
            }
          
            int no = Integer.parseInt(id.substring(1));
            txtReNo.setText("B" + (++no));

        } catch (Exception ee) {
            System.out.println("Error " + ee.getMessage());
        }
    }

    private void LoadData() {

        txtBillTime.setText(DateUtils.now("H:mm:ss"));
        txtBillDate.setText(DateUtils.now("MM/dd/yy"));

    }

    private void txtReNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtReNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtReNoActionPerformed

    private void cmdLegIDSeekerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdLegIDSeekerActionPerformed


        try {
            DBConnection bConnection = new DBConnection();
            Connection con = bConnection.connect();
            Statement stm = con.createStatement();

            ResultSet results = stm.executeQuery("select * from FlightLegs where LegID='" + txtFlightLegID.getText() + "'");

            while (results.next()) {
                txtFlightNo.setText(results.getString("FlightNo"));
                txtAirType.setText(results.getString("AirType"));
                txtArrTime.setText(results.getString("ArrTime"));
                txtDepartTime.setText(results.getString("DepTime"));
                txtFrom.setText(results.getString("LegFrom"));
                txtTo.setText(results.getString("LegTo"));
            }

        } catch (Exception ee) {
            System.out.println(ee.getMessage());
        }

    }//GEN-LAST:event_cmdLegIDSeekerActionPerformed

    private void cmdSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdSearchActionPerformed

        try {
            DBConnection bConnection = new DBConnection();
            Connection con = bConnection.connect();
            Statement stm = con.createStatement();

            ResultSet results = stm.executeQuery("select * from Bookings where RecieptNo='" + txtReNo.getText() + "'");

            while (results.next()) {
                txtBillDate.setText(results.getString("BillDate"));
                txtBillTime.setText(results.getString("BillTime"));
                txtCusName.setText(results.getString("CusName"));
                txtPassport.setText(results.getString("PassportNo"));
                txtAge.setText(results.getString("Age"));
                txtGender.setSelectedItem("" + results.getString("Gender"));
                txtSeatNo.setText(results.getString("SeatNo"));
                txtFareType.setSelectedItem("" + results.getString("FareType"));
                txtClass.setSelectedItem("" + results.getString("FlightClass"));
                txtFare.setText(results.getString("Fare"));
                txtStatus.setSelectedItem(results.getString("Status"));
                txtFlightLegID.setText(results.getString("legid"));

            }
            try {
                ResultSet results1 = stm.executeQuery("select * from FlightLegs where LegID='" + txtFlightLegID.getText() + "'");

                while (results1.next()) {
                    txtFlightNo.setText(results1.getString("FlightNo"));
                    txtAirType.setText(results1.getString("AirType"));
                    txtArrTime.setText(results1.getString("ArrTime"));
                    txtDepartTime.setText(results1.getString("DepTime"));
                    txtFrom.setText(results1.getString("LegFrom"));
                    txtTo.setText(results1.getString("LegTo"));
                }

            } catch (Exception ee) {
                System.out.println(ee.getMessage());
            }
        } catch (Exception ee) {
            System.out.println(ee.getMessage());
        }

    }//GEN-LAST:event_cmdSearchActionPerformed

    private void cmdSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdSaveActionPerformed

        if ((txtBillDate.getText().equals("")) || (txtBillTime.getText().equals("")) || (txtCusName.getText().equals("")) || (txtPassport.getText().equals("")) || (txtAge.getText().equals("")) || (txtSeatNo.getText().equals("")) || (txtFare.getText().equals(""))  || (txtFlightLegID.getText().equals(""))) {
            JOptionPane.showMessageDialog(this, "Pls Enter Details");
            return;
        }

        try {
            DBConnection bConnection = new DBConnection();
            Connection con = bConnection.connect();
            Statement stm = con.createStatement();

            PreparedStatement s1 = (PreparedStatement) con.prepareStatement("Insert into Bookings values(?,?,?,?,?,?,?,?,?,?,?,?,?)");

            s1.setString(1, txtReNo.getText());
            s1.setString(2, txtBillDate.getText());
            s1.setString(3, txtBillTime.getText());
            s1.setString(4, txtCusName.getText());
            s1.setString(5, txtPassport.getText());
            s1.setString(6, txtAge.getText());
            s1.setString(7, txtGender.getSelectedItem() + "");
            s1.setString(8, txtSeatNo.getText());
            s1.setString(9, txtFareType.getSelectedItem() + "");
            s1.setString(10, txtClass.getSelectedItem() + "");
            s1.setString(11, txtFare.getText());
            s1.setString(12, txtStatus.getSelectedItem()+ "");
            s1.setString(13, txtFlightLegID.getText());

            int save = s1.executeUpdate();
            JOptionPane.showMessageDialog(this, "Data Saved Successfully!!");
            Clear();
        } catch (Exception ee) {
            System.out.println(ee.getMessage());
            JOptionPane.showMessageDialog(this, ee.getMessage());
        }



    }//GEN-LAST:event_cmdSaveActionPerformed

    private void cmdUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdUpdateActionPerformed


        if (txtReNo.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Enter the Reciept No to Search!!");
            return;
        }

        if ((txtBillDate.getText().equals("")) || (txtBillTime.getText().equals("")) || (txtCusName.getText().equals("")) || (txtPassport.getText().equals("")) || (txtAge.getText().equals("")) || (txtSeatNo.getText().equals("")) || (txtFare.getText().equals(""))  || (txtFlightLegID.getText().equals(""))) {
            JOptionPane.showMessageDialog(this, "Pls Enter Details");
            return;
        }


        try {
            DBConnection bConnection = new DBConnection();
            Connection con = bConnection.connect();
            Statement stm = con.createStatement();

            if (txtReNo.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Enter Reciept No!!");
                return;
            }

            PreparedStatement s1 = (PreparedStatement) con.prepareStatement("update Bookings set BillDate='" + txtBillDate.getText() + "',BillTime='" + txtBillTime.getText() + "',CusName='" + txtCusName.getText() + "',PassportNo='" + txtPassport.getText() + "',Age='" + txtAge.getText() + "',Gender='" + txtGender.getSelectedItem().toString() + "',SeatNo='" + txtSeatNo.getText() + "',FareType='" + txtFareType.getSelectedItem() + "',FlightClass='" + txtClass.getSelectedItem() + "',Fare='" + txtFare.getText() + "',Status='" + txtStatus.getSelectedItem() + "',Legid='" + txtFlightLegID.getText() + "' where RecieptNo='" + txtReNo.getText() + "'");
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

            if (txtReNo.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Enter Recipet No to Cancel !!");
                return;
            }

            PreparedStatement s1 = (PreparedStatement) con.prepareStatement("delete from Bookings where RecieptNo='" + txtReNo.getText() + "'");
            int delete = s1.executeUpdate();

            JOptionPane.showMessageDialog(this, "Row Deleted!!");
            Clear();
        } catch (Exception ee) {
            System.out.println(ee.getMessage());
        }
    }//GEN-LAST:event_cmdDeleteActionPerformed

    private void cmdClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdClearActionPerformed
        Clear();
    }//GEN-LAST:event_cmdClearActionPerformed
    public void Clear() {

        txtBillDate.setText("");
        txtBillTime.setText("");
        txtCusName.setText("");
        txtPassport.setText("");
        txtAge.setText("");
        txtSeatNo.setText("");

        txtFare.setText("");
    
        txtFlightLegID.setText("");

        txtAirType.setText("");
        txtArrTime.setText("");
        txtDepartTime.setText("");
        txtFlightNo.setText("");
        txtFrom.setText("");
        txtTo.setText("");
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new jfrmBookingforAdmin().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdClear;
    private javax.swing.JButton cmdDelete;
    private javax.swing.JButton cmdLegIDSeeker;
    private javax.swing.JButton cmdSave;
    private javax.swing.JButton cmdSearch;
    private javax.swing.JButton cmdUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
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
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtAirType;
    private javax.swing.JTextField txtArrTime;
    private javax.swing.JTextField txtBillDate;
    private javax.swing.JTextField txtBillTime;
    private javax.swing.JComboBox txtClass;
    private javax.swing.JTextField txtCusName;
    private javax.swing.JTextField txtDepartTime;
    private javax.swing.JTextField txtFare;
    private javax.swing.JComboBox txtFareType;
    private javax.swing.JTextField txtFlightLegID;
    private javax.swing.JTextField txtFlightNo;
    private javax.swing.JTextField txtFrom;
    private javax.swing.JComboBox txtGender;
    private javax.swing.JTextField txtPassport;
    private javax.swing.JTextField txtReNo;
    private javax.swing.JTextField txtSeatNo;
    private javax.swing.JComboBox txtStatus;
    private javax.swing.JTextField txtTo;
    // End of variables declaration//GEN-END:variables
}
