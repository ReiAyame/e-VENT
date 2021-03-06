package ui.dialog;

import java.awt.Toolkit;
import javax.swing.SwingUtilities;

/**
 *
 * @author Yumi Takuma
 */
public class AddEvent extends javax.swing.JDialog {

    /**
     * Creates new form AddEvent
     */
    public AddEvent(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
         try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AddEvent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddEvent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddEvent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddEvent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        SwingUtilities.updateComponentTreeUI(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addEventPanel = new javax.swing.JPanel();
        clientLbl = new javax.swing.JLabel();
        eventTypeLbl = new javax.swing.JLabel();
        dateLbl = new javax.swing.JLabel();
        timeLbl = new javax.swing.JLabel();
        venueLbl = new javax.swing.JLabel();
        detailsLbl = new javax.swing.JLabel();
        expenseLbl = new javax.swing.JLabel();
        profitLbl = new javax.swing.JLabel();
        clientTF = new javax.swing.JTextField();
        eventTypeCB = new javax.swing.JComboBox();
        daySpinner = new javax.swing.JSpinner();
        yearSpinner = new javax.swing.JSpinner();
        minStart = new javax.swing.JSpinner();
        hourStart = new javax.swing.JSpinner();
        sepStartLbl = new javax.swing.JLabel();
        toLbl = new javax.swing.JLabel();
        minEnd = new javax.swing.JSpinner();
        hourEnd = new javax.swing.JSpinner();
        sepEndLbl = new javax.swing.JLabel();
        venueTF = new javax.swing.JTextField();
        detailsSP = new javax.swing.JScrollPane();
        detailsTA = new javax.swing.JTextArea();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        doneBtn = new java.awt.Button();
        cancelBtn = new java.awt.Button();
        monthCB = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Add New Event");

        addEventPanel.setBackground(new java.awt.Color(255, 255, 255));

        clientLbl.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        clientLbl.setText("CLIENT:");

        eventTypeLbl.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        eventTypeLbl.setText("EVENT TYPE:");

        dateLbl.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        dateLbl.setText("DATE:");

        timeLbl.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        timeLbl.setText("TIME:");

        venueLbl.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        venueLbl.setText("VENUE:");

        detailsLbl.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        detailsLbl.setText("DETAILS:");

        expenseLbl.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        expenseLbl.setText("EXPENSE:");

        profitLbl.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        profitLbl.setText("PROFIT:");

        clientTF.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        clientTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clientTFActionPerformed(evt);
            }
        });

        eventTypeCB.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        eventTypeCB.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Anniversary", "Birthday", "Debut", "Graduation", "Wedding" }));

        daySpinner.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        daySpinner.setModel(new javax.swing.SpinnerNumberModel(1, 1, 31, 1));

        yearSpinner.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        yearSpinner.setModel(new javax.swing.SpinnerListModel(new String[] {"2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030", "2031", "2032", "2033", "2034", "2035", "2036"}));

        minStart.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        hourStart.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        sepStartLbl.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        sepStartLbl.setText(":");

        toLbl.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        toLbl.setText("to");

        minEnd.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        hourEnd.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        sepEndLbl.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        sepEndLbl.setText(":");

        venueTF.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        detailsTA.setColumns(20);
        detailsTA.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        detailsTA.setRows(5);
        detailsSP.setViewportView(detailsTA);

        jTextField1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jTextField2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        doneBtn.setBackground(new java.awt.Color(255, 255, 255));
        doneBtn.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        doneBtn.setLabel("DONE");
        doneBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doneBtnActionPerformed(evt);
            }
        });

        cancelBtn.setBackground(new java.awt.Color(255, 255, 255));
        cancelBtn.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        cancelBtn.setLabel("Cancel");
        cancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBtnActionPerformed(evt);
            }
        });

        monthCB.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        monthCB.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));

        javax.swing.GroupLayout addEventPanelLayout = new javax.swing.GroupLayout(addEventPanel);
        addEventPanel.setLayout(addEventPanelLayout);
        addEventPanelLayout.setHorizontalGroup(
            addEventPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addEventPanelLayout.createSequentialGroup()
                .addGroup(addEventPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(addEventPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(addEventPanelLayout.createSequentialGroup()
                            .addGap(74, 74, 74)
                            .addComponent(expenseLbl))
                        .addGroup(addEventPanelLayout.createSequentialGroup()
                            .addGap(45, 45, 45)
                            .addGroup(addEventPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(eventTypeLbl)
                                .addComponent(clientLbl)
                                .addComponent(dateLbl)
                                .addComponent(timeLbl)
                                .addComponent(venueLbl)
                                .addComponent(detailsLbl))))
                    .addGroup(addEventPanelLayout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(profitLbl)))
                .addGap(18, 18, 18)
                .addGroup(addEventPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(venueTF, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(clientTF, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(eventTypeCB, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(addEventPanelLayout.createSequentialGroup()
                        .addComponent(monthCB, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(daySpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(yearSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, addEventPanelLayout.createSequentialGroup()
                        .addComponent(hourStart, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sepStartLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(minStart, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(toLbl)
                        .addGap(18, 18, 18)
                        .addComponent(hourEnd, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sepEndLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(minEnd, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(detailsSP)
                    .addComponent(jTextField1)
                    .addComponent(jTextField2))
                .addContainerGap(40, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addEventPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(doneBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(cancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(110, 110, 110))
        );
        addEventPanelLayout.setVerticalGroup(
            addEventPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addEventPanelLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(addEventPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clientLbl)
                    .addComponent(clientTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(addEventPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eventTypeLbl)
                    .addComponent(eventTypeCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(addEventPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dateLbl)
                    .addComponent(daySpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(yearSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(monthCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(addEventPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(timeLbl)
                    .addComponent(minStart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hourStart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sepStartLbl)
                    .addComponent(toLbl)
                    .addComponent(minEnd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hourEnd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sepEndLbl))
                .addGap(18, 18, 18)
                .addGroup(addEventPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(venueLbl)
                    .addComponent(venueTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(addEventPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(detailsLbl)
                    .addComponent(detailsSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(addEventPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(expenseLbl)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(addEventPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(profitLbl)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(addEventPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(doneBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(addEventPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(addEventPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void clientTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clientTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clientTFActionPerformed

    private void doneBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doneBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_doneBtnActionPerformed

    private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cancelBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel addEventPanel;
    private java.awt.Button cancelBtn;
    private javax.swing.JLabel clientLbl;
    private javax.swing.JTextField clientTF;
    private javax.swing.JLabel dateLbl;
    private javax.swing.JSpinner daySpinner;
    private javax.swing.JLabel detailsLbl;
    private javax.swing.JScrollPane detailsSP;
    private javax.swing.JTextArea detailsTA;
    private java.awt.Button doneBtn;
    private javax.swing.JComboBox eventTypeCB;
    private javax.swing.JLabel eventTypeLbl;
    private javax.swing.JLabel expenseLbl;
    private javax.swing.JSpinner hourEnd;
    private javax.swing.JSpinner hourStart;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JSpinner minEnd;
    private javax.swing.JSpinner minStart;
    private javax.swing.JComboBox monthCB;
    private javax.swing.JLabel profitLbl;
    private javax.swing.JLabel sepEndLbl;
    private javax.swing.JLabel sepStartLbl;
    private javax.swing.JLabel timeLbl;
    private javax.swing.JLabel toLbl;
    private javax.swing.JLabel venueLbl;
    private javax.swing.JTextField venueTF;
    private javax.swing.JSpinner yearSpinner;
    // End of variables declaration//GEN-END:variables
}
