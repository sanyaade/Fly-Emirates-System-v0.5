/*
 * MSN_FlyEmiratesView.java
 */
package msn_flyemirates;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.jdesktop.application.Action;
import org.jdesktop.application.ResourceMap;
import org.jdesktop.application.SingleFrameApplication;
import org.jdesktop.application.FrameView;
import org.jdesktop.application.TaskMonitor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;
import javax.swing.Icon;
import javax.swing.JDialog;
import javax.swing.JFrame;

/**
 * The application's main frame.
 */
public class MSN_FlyEmiratesView extends FrameView {

    public MSN_FlyEmiratesView(SingleFrameApplication app) {


        super(app);

        initComponents();
        lblUser.setText("  Logged as : " + jfrmLogin.UserType);

        if (jfrmLogin.Admin == 1) {
            jMenuAdmin.setEnabled(true);
        } else {
            jMenuAdmin.setEnabled(false);
        }

        // status bar initialization - message timeout, idle icon and busy animation, etc

        ResourceMap resourceMap = getResourceMap();
        int messageTimeout = resourceMap.getInteger("StatusBar.messageTimeout");
        messageTimer = new Timer(messageTimeout, new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                statusMessageLabel.setText("");
            }
        });
        messageTimer.setRepeats(false);
        int busyAnimationRate = resourceMap.getInteger("StatusBar.busyAnimationRate");
        for (int i = 0; i < busyIcons.length; i++) {
            busyIcons[i] = resourceMap.getIcon("StatusBar.busyIcons[" + i + "]");
        }
        busyIconTimer = new Timer(busyAnimationRate, new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                busyIconIndex = (busyIconIndex + 1) % busyIcons.length;
                statusAnimationLabel.setIcon(busyIcons[busyIconIndex]);
            }
        });
        idleIcon = resourceMap.getIcon("StatusBar.idleIcon");
        statusAnimationLabel.setIcon(idleIcon);
        progressBar.setVisible(false);

        // connecting action tasks to status bar via TaskMonitor
        TaskMonitor taskMonitor = new TaskMonitor(getApplication().getContext());
        taskMonitor.addPropertyChangeListener(new java.beans.PropertyChangeListener() {

            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                String propertyName = evt.getPropertyName();
                if ("started".equals(propertyName)) {
                    if (!busyIconTimer.isRunning()) {
                        statusAnimationLabel.setIcon(busyIcons[0]);
                        busyIconIndex = 0;
                        busyIconTimer.start();
                    }
                    progressBar.setVisible(true);
                    progressBar.setIndeterminate(true);
                } else if ("done".equals(propertyName)) {
                    busyIconTimer.stop();
                    statusAnimationLabel.setIcon(idleIcon);
                    progressBar.setVisible(false);
                    progressBar.setValue(0);
                } else if ("message".equals(propertyName)) {
                    String text = (String) (evt.getNewValue());
                    statusMessageLabel.setText((text == null) ? "" : text);
                    messageTimer.restart();
                } else if ("progress".equals(propertyName)) {
                    int value = (Integer) (evt.getNewValue());
                    progressBar.setVisible(true);
                    progressBar.setIndeterminate(false);
                    progressBar.setValue(value);
                }
            }
        });


    }

    @Action
    public void showAboutBox() {
        if (aboutBox == null) {
            JFrame mainFrame = MSN_FlyEmiratesApp.getApplication().getMainFrame();
            aboutBox = new MSN_FlyEmiratesAboutBox(mainFrame);
            aboutBox.setLocationRelativeTo(mainFrame);
        }
        MSN_FlyEmiratesApp.getApplication().show(aboutBox);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        jToolBar1 = new javax.swing.JToolBar();
        jButtonBooking = new javax.swing.JButton();
        jButtonAbbr = new javax.swing.JButton();
        jButtonSchedule = new javax.swing.JButton();
        jButtonTblBook = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButtonBook = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        lblUser = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        statusPanel1 = new javax.swing.JPanel();
        javax.swing.JSeparator statusPanelSeparator1 = new javax.swing.JSeparator();
        statusMessageLabel1 = new javax.swing.JLabel();
        statusAnimationLabel1 = new javax.swing.JLabel();
        progressBar = new javax.swing.JProgressBar();
        statusAnimationLabel = new javax.swing.JLabel();
        statusMessageLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        javax.swing.JMenu fileMenu = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem16 = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        jMenuAdmin = new javax.swing.JMenu();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenuItem17 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem10 = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        javax.swing.JMenuItem exitMenuItem = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jSeparator6 = new javax.swing.JPopupMenu.Separator();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        javax.swing.JMenu helpMenu = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        javax.swing.JMenuItem aboutMenuItem = new javax.swing.JMenuItem();
        labelUser = new javax.swing.JLabel();

        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(msn_flyemirates.MSN_FlyEmiratesApp.class).getContext().getResourceMap(MSN_FlyEmiratesView.class);
        mainPanel.setBackground(resourceMap.getColor("mainPanel.background")); // NOI18N
        mainPanel.setForeground(resourceMap.getColor("mainPanel.foreground")); // NOI18N
        mainPanel.setName("mainPanel"); // NOI18N

        jToolBar1.setBackground(resourceMap.getColor("jToolBar1.background")); // NOI18N
        jToolBar1.setRollover(true);
        jToolBar1.setName("jToolBar1"); // NOI18N

        jButtonBooking.setIcon(new javax.swing.ImageIcon("C:\\Users\\Harsha\\Desktop\\icons\\add_flight.gif")); // NOI18N
        jButtonBooking.setText(resourceMap.getString("jButtonBooking.text")); // NOI18N
        jButtonBooking.setToolTipText(resourceMap.getString("jButtonBooking.toolTipText")); // NOI18N
        jButtonBooking.setName("jButtonBooking"); // NOI18N
        jButtonBooking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBookingActionPerformed(evt);
            }
        });
        jToolBar1.add(jButtonBooking);

        jButtonAbbr.setIcon(new javax.swing.ImageIcon("C:\\Users\\Harsha\\Desktop\\icons\\airport.gif")); // NOI18N
        jButtonAbbr.setText(resourceMap.getString("jButtonAbbr.text")); // NOI18N
        jButtonAbbr.setToolTipText(resourceMap.getString("jButtonAbbr.toolTipText")); // NOI18N
        jButtonAbbr.setName("jButtonAbbr"); // NOI18N
        jButtonAbbr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAbbrActionPerformed(evt);
            }
        });
        jToolBar1.add(jButtonAbbr);

        jButtonSchedule.setIcon(new javax.swing.ImageIcon("C:\\Users\\Harsha\\Desktop\\icons\\clock.gif")); // NOI18N
        jButtonSchedule.setText(resourceMap.getString("jButtonSchedule.text")); // NOI18N
        jButtonSchedule.setToolTipText(resourceMap.getString("jButtonSchedule.toolTipText")); // NOI18N
        jButtonSchedule.setName("jButtonSchedule"); // NOI18N
        jButtonSchedule.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonScheduleActionPerformed(evt);
            }
        });
        jToolBar1.add(jButtonSchedule);

        jButtonTblBook.setIcon(new javax.swing.ImageIcon("C:\\Users\\Harsha\\Desktop\\icons\\find.gif")); // NOI18N
        jButtonTblBook.setText(resourceMap.getString("jButtonTblBook.text")); // NOI18N
        jButtonTblBook.setToolTipText(resourceMap.getString("jButtonTblBook.toolTipText")); // NOI18N
        jButtonTblBook.setName("jButtonTblBook"); // NOI18N
        jButtonTblBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTblBookActionPerformed(evt);
            }
        });
        jToolBar1.add(jButtonTblBook);

        jButton5.setIcon(new javax.swing.ImageIcon("C:\\Users\\Harsha\\Desktop\\icons\\transport.gif")); // NOI18N
        jButton5.setToolTipText(resourceMap.getString("jButton5.toolTipText")); // NOI18N
        jButton5.setName("jButton5"); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton5);

        jButton7.setIcon(new javax.swing.ImageIcon("C:\\Users\\Harsha\\Desktop\\icons\\hotel.gif")); // NOI18N
        jButton7.setToolTipText(resourceMap.getString("jButton7.toolTipText")); // NOI18N
        jButton7.setName("jButton7"); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton7);

        jButtonBook.setIcon(new javax.swing.ImageIcon("C:\\Users\\Harsha\\Desktop\\icons\\courier.gif")); // NOI18N
        jButtonBook.setText(resourceMap.getString("jButtonBook.text")); // NOI18N
        jButtonBook.setToolTipText(resourceMap.getString("jButtonBook.toolTipText")); // NOI18N
        jButtonBook.setName("jButtonBook"); // NOI18N
        jButtonBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBookActionPerformed(evt);
            }
        });
        jToolBar1.add(jButtonBook);

        jButton3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Harsha\\Desktop\\icons\\tourist_industry.gif")); // NOI18N
        jButton3.setToolTipText(resourceMap.getString("jButton3.toolTipText")); // NOI18N
        jButton3.setName("jButton3"); // NOI18N
        jToolBar1.add(jButton3);

        jButton4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Harsha\\Desktop\\icons\\jeep.gif")); // NOI18N
        jButton4.setName("jButton4"); // NOI18N
        jToolBar1.add(jButton4);

        jButton8.setIcon(new javax.swing.ImageIcon("C:\\Users\\Harsha\\Desktop\\icons\\square_earth.gif")); // NOI18N
        jButton8.setName("jButton8"); // NOI18N
        jToolBar1.add(jButton8);

        jButton6.setIcon(new javax.swing.ImageIcon("C:\\Users\\Harsha\\Desktop\\icons\\railway.gif")); // NOI18N
        jButton6.setName("jButton6"); // NOI18N
        jToolBar1.add(jButton6);

        jButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Harsha\\Desktop\\icons\\exit.gif")); // NOI18N
        jButton1.setText(resourceMap.getString("jButton1.text")); // NOI18N
        jButton1.setName("jButton1"); // NOI18N
        jToolBar1.add(jButton1);

        lblUser.setBackground(resourceMap.getColor("lblUser.background")); // NOI18N
        lblUser.setFont(resourceMap.getFont("lblUser.font")); // NOI18N
        lblUser.setText(resourceMap.getString("lblUser.text")); // NOI18N
        lblUser.setName("lblUser"); // NOI18N
        jToolBar1.add(lblUser);
        lblUser.getAccessibleContext().setAccessibleName(resourceMap.getString("lblUser.AccessibleContext.accessibleName")); // NOI18N

        jLabel1.setText(resourceMap.getString("jLabel1.text")); // NOI18N
        jLabel1.setName("jLabel1"); // NOI18N

        statusPanel1.setName("statusPanel1"); // NOI18N

        statusPanelSeparator1.setName("statusPanelSeparator1"); // NOI18N

        statusMessageLabel1.setName("statusMessageLabel1"); // NOI18N

        statusAnimationLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        statusAnimationLabel1.setName("statusAnimationLabel1"); // NOI18N

        progressBar.setName("progressBar"); // NOI18N

        statusAnimationLabel.setText(resourceMap.getString("statusAnimationLabel.text")); // NOI18N
        statusAnimationLabel.setName("statusAnimationLabel"); // NOI18N

        statusMessageLabel.setText(resourceMap.getString("statusMessageLabel.text")); // NOI18N
        statusMessageLabel.setName("statusMessageLabel"); // NOI18N

        javax.swing.GroupLayout statusPanel1Layout = new javax.swing.GroupLayout(statusPanel1);
        statusPanel1.setLayout(statusPanel1Layout);
        statusPanel1Layout.setHorizontalGroup(
            statusPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(statusPanelSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 289, Short.MAX_VALUE)
            .addGroup(statusPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(statusMessageLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(statusMessageLabel)
                .addGap(27, 27, 27)
                .addComponent(statusAnimationLabel)
                .addGap(18, 18, 18)
                .addComponent(progressBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(statusAnimationLabel1)
                .addContainerGap())
        );
        statusPanel1Layout.setVerticalGroup(
            statusPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(statusPanel1Layout.createSequentialGroup()
                .addComponent(statusPanelSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addGroup(statusPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(statusPanel1Layout.createSequentialGroup()
                        .addGroup(statusPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(statusMessageLabel1)
                            .addComponent(statusAnimationLabel1)
                            .addComponent(progressBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(3, 3, 3))
                    .addComponent(statusAnimationLabel)))
            .addGroup(statusPanel1Layout.createSequentialGroup()
                .addComponent(statusMessageLabel)
                .addContainerGap())
        );

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Harsha\\Desktop\\icons\\fly_Emirates_logo_by_REDFLOOD.jpg")); // NOI18N
        jLabel2.setText(resourceMap.getString("jLabel2.text")); // NOI18N
        jLabel2.setName("jLabel2"); // NOI18N

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(490, 490, 490)
                .addComponent(statusPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(619, Short.MAX_VALUE))
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 855, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(254, Short.MAX_VALUE))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(statusPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        menuBar.setName("menuBar"); // NOI18N

        fileMenu.setText(resourceMap.getString("fileMenu.text")); // NOI18N
        fileMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fileMenuActionPerformed(evt);
            }
        });

        jMenuItem3.setText(resourceMap.getString("jMenuItem3.text")); // NOI18N
        jMenuItem3.setName("jMenuItem3"); // NOI18N
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        fileMenu.add(jMenuItem3);

        jSeparator2.setName("jSeparator2"); // NOI18N
        fileMenu.add(jSeparator2);

        jMenuItem1.setText(resourceMap.getString("jMenuItem1.text")); // NOI18N
        jMenuItem1.setName("jMenuItem1"); // NOI18N
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        fileMenu.add(jMenuItem1);

        jMenuItem16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem16ActionPerformed1(evt);
            }
        });
        fileMenu.add(jMenuItem16);

        jSeparator3.setName("jSeparator3"); // NOI18N
        fileMenu.add(jSeparator3);

        jMenuAdmin.setText(resourceMap.getString("jMenuAdmin.text")); // NOI18N
        jMenuAdmin.setName("jMenuAdmin"); // NOI18N

        jMenuItem11.setText(resourceMap.getString("jMenuItem11.text")); // NOI18N
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed1(evt);
            }
        });
        jMenuAdmin.add(jMenuItem11);

        jMenuItem14.setText(resourceMap.getString("jMenuItem14.text")); // NOI18N
        jMenuItem14.setName("jMenuItem14"); // NOI18N
        jMenuItem14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem14ActionPerformed(evt);
            }
        });
        jMenuAdmin.add(jMenuItem14);

        jMenuItem17.setText(resourceMap.getString("jMenuItem17.text")); // NOI18N
        jMenuItem17.setName("jMenuItem17"); // NOI18N
        jMenuItem17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem17ActionPerformed(evt);
            }
        });
        jMenuAdmin.add(jMenuItem17);

        jSeparator1.setName("jSeparator1"); // NOI18N
        jMenuAdmin.add(jSeparator1);

        jMenuItem10.setText(resourceMap.getString("jMenuItem10.text")); // NOI18N
        jMenuItem10.setName("jMenuItem10"); // NOI18N
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenuAdmin.add(jMenuItem10);

        fileMenu.add(jMenuAdmin);

        jSeparator4.setName("jSeparator4"); // NOI18N
        fileMenu.add(jSeparator4);

        javax.swing.ActionMap actionMap = org.jdesktop.application.Application.getInstance(msn_flyemirates.MSN_FlyEmiratesApp.class).getContext().getActionMap(MSN_FlyEmiratesView.class, this);
        exitMenuItem.setAction(actionMap.get("quit")); // NOI18N
        exitMenuItem.setName("exitMenuItem"); // NOI18N
        fileMenu.add(exitMenuItem);

        menuBar.add(fileMenu);

        jMenu1.setText(resourceMap.getString("jMenu1.text")); // NOI18N
        jMenu1.setName("jMenu1"); // NOI18N
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        jMenuItem5.setText(resourceMap.getString("jMenuItem5.text")); // NOI18N
        jMenuItem5.setName("jMenuItem5"); // NOI18N
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem5);

        jMenuItem2.setText(resourceMap.getString("jMenuItem2.text")); // NOI18N
        jMenuItem2.setName("jMenuItem2"); // NOI18N
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jSeparator5.setName("jSeparator5"); // NOI18N
        jMenu1.add(jSeparator5);

        jMenuItem7.setText(resourceMap.getString("jMenuItem7.text")); // NOI18N
        jMenuItem7.setName("jMenuItem7"); // NOI18N
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem7);

        jMenuItem8.setText(resourceMap.getString("jMenuItem8.text")); // NOI18N
        jMenuItem8.setName("jMenuItem8"); // NOI18N
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem8);

        jSeparator6.setName("jSeparator6"); // NOI18N
        jMenu1.add(jSeparator6);

        jMenuItem4.setText(resourceMap.getString("jMenuItem4.text")); // NOI18N
        jMenuItem4.setName("jMenuItem4"); // NOI18N
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuItem9.setText(resourceMap.getString("jMenuItem9.text")); // NOI18N
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem9);

        menuBar.add(jMenu1);

        helpMenu.setText(resourceMap.getString("helpMenu.text")); // NOI18N
        helpMenu.setName("helpMenu"); // NOI18N

        jMenuItem6.setText(resourceMap.getString("jMenuItem6.text")); // NOI18N
        jMenuItem6.setName("jMenuItem6"); // NOI18N
        helpMenu.add(jMenuItem6);

        aboutMenuItem.setAction(actionMap.get("showAboutBox")); // NOI18N
        aboutMenuItem.setText(resourceMap.getString("aboutMenuItem.text")); // NOI18N
        aboutMenuItem.setName("aboutMenuItem"); // NOI18N
        helpMenu.add(aboutMenuItem);

        menuBar.add(helpMenu);

        labelUser.setText(resourceMap.getString("labelUser.text")); // NOI18N
        labelUser.setName("labelUser"); // NOI18N

        setComponent(mainPanel);
        setMenuBar(menuBar);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        jfrmBooking bb = new jfrmBooking();
        bb.setVisible(true);


    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        try {
            jfrmTableBookings table = new jfrmTableBookings();
            table.setVisible(true);
        } catch (Exception ex) {
            Logger.getLogger(MSN_FlyEmiratesView.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        try {
            jfrmTableAbbr ab = new jfrmTableAbbr();
            ab.setVisible(true);
        } catch (Exception ex) {
            Logger.getLogger(MSN_FlyEmiratesView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jButtonBookingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBookingActionPerformed
        jfrmBooking bb = new jfrmBooking();
        bb.setVisible(true);
    }//GEN-LAST:event_jButtonBookingActionPerformed

    private void jButtonAbbrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAbbrActionPerformed
        jfrmAbbr jj = new jfrmAbbr();
        jj.setVisible(true);

        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonAbbrActionPerformed

    private void jButtonScheduleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonScheduleActionPerformed
        jfrmSchedules n = new jfrmSchedules();
        n.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonScheduleActionPerformed

    private void jButtonBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBookActionPerformed
        try {
            jfrmTableBookings aa = new jfrmTableBookings();
            aa.setVisible(true);
            // TODO add your handling code here:
        } catch (Exception ex) {
            Logger.getLogger(MSN_FlyEmiratesView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonBookActionPerformed

    private void fileMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fileMenuActionPerformed

        jfrmAbbr a = new jfrmAbbr();
        a.setVisible(true);

        // TODO add your handling code here:
    }//GEN-LAST:event_fileMenuActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        JfrmManageUsers n = new JfrmManageUsers();
        n.setVisible(true);

    }//GEN-LAST:event_jMenuItem10ActionPerformed
////////

    /////////
    private void jMenuItem3ActionPerformed1(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed1
        jfrmBooking bb = new jfrmBooking();
        bb.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem3ActionPerformed1

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed

        jfrmSchedules s = new jfrmSchedules();
        s.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        jfrmAbbrforAdmin n = new jfrmAbbrforAdmin();
        n.setVisible(true);

        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void jMenuItem14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem14ActionPerformed
        jfrmFlightsAdmin nn = new jfrmFlightsAdmin();
        nn.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem14ActionPerformed

    private void jMenuItem16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem16ActionPerformed
        jfrmFlights nn = new jfrmFlights();
        nn.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem16ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        jfrmAbbr cc = new jfrmAbbr();
        cc.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jButtonTblBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTblBookActionPerformed
        try {
            jfrmTableBookings bb = new jfrmTableBookings();
            bb.setVisible(true);
            // TODO add your handling code here:
        } catch (Exception ex) {
            Logger.getLogger(MSN_FlyEmiratesView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonTblBookActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        try {
            jfrmTableFlights nn = new jfrmTableFlights();
            nn.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem8ActionPerformed
 catch (Exception ex) {
            Logger.getLogger(MSN_FlyEmiratesView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        try {
            jfrmTableManifest tt = new jfrmTableManifest();
            tt.setVisible(true);
        } catch (Exception ex) {
            Logger.getLogger(MSN_FlyEmiratesView.class.getName()).log(Level.SEVERE, null, ex);
        }


        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem17ActionPerformed
        try {
            jfrmSchedulesAdmin s = new jfrmSchedulesAdmin();
            s.setVisible(true);        // TODO add yo
        } catch (Exception e) {
        }

    }//GEN-LAST:event_jMenuItem17ActionPerformed

    private void jMenuItem16ActionPerformed1(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem16ActionPerformed1

        jfrmFlights ff=new jfrmFlights();
        ff.setVisible(true);

        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem16ActionPerformed1

    private void jMenuItem11ActionPerformed1(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed1
jfrmAbbrforAdmin aa=new jfrmAbbrforAdmin();
aa.setVisible(true);

        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem11ActionPerformed1

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
  jfrmSchedules s = new jfrmSchedules();
        s.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed

        jfrmFlights ff=new jfrmFlights();
        ff.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        try {
            jfrmTableFlightLegs aa = new jfrmTableFlightLegs();
            aa.setVisible(true); // TODO add your handling code here:
        } catch (Exception ex) {
            Logger.getLogger(MSN_FlyEmiratesView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButtonAbbr;
    private javax.swing.JButton jButtonBook;
    private javax.swing.JButton jButtonBooking;
    private javax.swing.JButton jButtonSchedule;
    private javax.swing.JButton jButtonTblBook;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenuAdmin;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem17;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JPopupMenu.Separator jSeparator6;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel labelUser;
    public javax.swing.JLabel lblUser;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JProgressBar progressBar;
    private javax.swing.JLabel statusAnimationLabel;
    private javax.swing.JLabel statusAnimationLabel1;
    private javax.swing.JLabel statusMessageLabel;
    private javax.swing.JLabel statusMessageLabel1;
    private javax.swing.JPanel statusPanel1;
    // End of variables declaration//GEN-END:variables
    private final Timer messageTimer;
    private final Timer busyIconTimer;
    private final Icon idleIcon;
    private final Icon[] busyIcons = new Icon[15];
    private int busyIconIndex = 0;
    private JDialog aboutBox;
}
