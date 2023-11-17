package UIClass;

import databaseClass.Sach;
import databaseClass.SachCRUD;

public class ReaderManagementPanel extends javax.swing.JPanel
{
    MainInterface main;

    public ReaderManagementPanel(MainInterface main)
    {
        initComponents();
        this.main = main;
    }

    public void initCustom()
    {
        main.getPictureBox().setImage(new javax.swing.ImageIcon(getClass().getResource("/Image/background.png")));
        main.getPictureBox().repaint();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Header = new javax.swing.JLabel();
        inputSearch = new javax.swing.JTextField();
        readerCardNumber = new java.awt.Panel();
        nameCardNumber = new javax.swing.JLabel();
        valCardNumber = new javax.swing.JTextField();
        readerReaderID = new java.awt.Panel();
        valReaderID = new javax.swing.JTextField();
        nameReaderID = new javax.swing.JLabel();
        readerReaderName = new java.awt.Panel();
        valReaderName = new javax.swing.JTextField();
        nameReaderName = new javax.swing.JLabel();
        readerPhoneNumber = new java.awt.Panel();
        valPhoneNumber = new javax.swing.JTextField();
        namePhoneNumber = new javax.swing.JLabel();
        readerAddress = new java.awt.Panel();
        valAddress = new javax.swing.JTextField();
        nameAddess = new javax.swing.JLabel();
        btnSearch = new javax.swing.JButton();
        groupData = new javax.swing.JScrollPane();
        containerValue = new javax.swing.JTable();

        setOpaque(false);

        Header.setFont(new java.awt.Font("Poppins", 1, 30)); // NOI18N
        Header.setText("Reader Information");

        inputSearch.setBackground(java.awt.SystemColor.control);
        inputSearch.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder("Search"), "Search by ID"));
        inputSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputSearchActionPerformed(evt);
            }
        });

        readerCardNumber.setPreferredSize(new java.awt.Dimension(341, 31));

        nameCardNumber.setText("Card Number");
        nameCardNumber.setToolTipText("");
        nameCardNumber.setPreferredSize(new java.awt.Dimension(30, 16));

        javax.swing.GroupLayout readerCardNumberLayout = new javax.swing.GroupLayout(readerCardNumber);
        readerCardNumber.setLayout(readerCardNumberLayout);
        readerCardNumberLayout.setHorizontalGroup(
            readerCardNumberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(readerCardNumberLayout.createSequentialGroup()
                .addComponent(nameCardNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(valCardNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        readerCardNumberLayout.setVerticalGroup(
            readerCardNumberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(readerCardNumberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(nameCardNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(valCardNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        readerReaderID.setPreferredSize(new java.awt.Dimension(341, 31));

        valReaderID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valReaderIDActionPerformed(evt);
            }
        });

        nameReaderID.setText("Reader ID");
        nameReaderID.setToolTipText("");
        nameReaderID.setPreferredSize(new java.awt.Dimension(30, 16));

        javax.swing.GroupLayout readerReaderIDLayout = new javax.swing.GroupLayout(readerReaderID);
        readerReaderID.setLayout(readerReaderIDLayout);
        readerReaderIDLayout.setHorizontalGroup(
            readerReaderIDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(readerReaderIDLayout.createSequentialGroup()
                .addComponent(nameReaderID, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addComponent(valReaderID, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        readerReaderIDLayout.setVerticalGroup(
            readerReaderIDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(valReaderID, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
            .addComponent(nameReaderID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        readerReaderName.setPreferredSize(new java.awt.Dimension(341, 31));

        nameReaderName.setText("Reader Name");
        nameReaderName.setToolTipText("");
        nameReaderName.setPreferredSize(new java.awt.Dimension(30, 16));

        javax.swing.GroupLayout readerReaderNameLayout = new javax.swing.GroupLayout(readerReaderName);
        readerReaderName.setLayout(readerReaderNameLayout);
        readerReaderNameLayout.setHorizontalGroup(
            readerReaderNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(readerReaderNameLayout.createSequentialGroup()
                .addComponent(nameReaderName, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addComponent(valReaderName, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        readerReaderNameLayout.setVerticalGroup(
            readerReaderNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(valReaderName, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
            .addComponent(nameReaderName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        readerPhoneNumber.setPreferredSize(new java.awt.Dimension(341, 31));

        namePhoneNumber.setText("Phone Number");
        namePhoneNumber.setToolTipText("");
        namePhoneNumber.setPreferredSize(new java.awt.Dimension(30, 16));

        javax.swing.GroupLayout readerPhoneNumberLayout = new javax.swing.GroupLayout(readerPhoneNumber);
        readerPhoneNumber.setLayout(readerPhoneNumberLayout);
        readerPhoneNumberLayout.setHorizontalGroup(
            readerPhoneNumberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(readerPhoneNumberLayout.createSequentialGroup()
                .addComponent(namePhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addComponent(valPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        readerPhoneNumberLayout.setVerticalGroup(
            readerPhoneNumberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(valPhoneNumber, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
            .addComponent(namePhoneNumber, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        readerAddress.setPreferredSize(new java.awt.Dimension(341, 31));

        nameAddess.setText("Address");
        nameAddess.setToolTipText("");
        nameAddess.setPreferredSize(new java.awt.Dimension(30, 16));

        javax.swing.GroupLayout readerAddressLayout = new javax.swing.GroupLayout(readerAddress);
        readerAddress.setLayout(readerAddressLayout);
        readerAddressLayout.setHorizontalGroup(
            readerAddressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(readerAddressLayout.createSequentialGroup()
                .addComponent(nameAddess, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addComponent(valAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        readerAddressLayout.setVerticalGroup(
            readerAddressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(valAddress, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
            .addComponent(nameAddess, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        containerValue.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"NguoI Soi", "1", "19/09/2023", "122312", null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Borrowed Books", "Book ID", "Borrow Date", "Return Date", "Quantity"
            }
        ));
        groupData.setViewportView(containerValue);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(readerAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(readerPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(readerReaderName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(readerReaderID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Header, javax.swing.GroupLayout.PREFERRED_SIZE, 907, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(inputSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 706, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnSearch))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(readerCardNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(groupData, javax.swing.GroupLayout.PREFERRED_SIZE, 791, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(189, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Header)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(readerReaderID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(readerReaderName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(readerPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(readerAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(readerCardNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67)
                .addComponent(groupData, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void inputSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputSearchActionPerformed


    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        SachCRUD queryDB = new SachCRUD();

        String id = inputSearch.getText();
        // Search data 
        Sach resultData = queryDB.findSachById(Integer.parseInt(id));

        // Render data in UI
//        valType.setText(resultData.getType());
//        valAuthorName.setText(resultData.getName());
//          valQuantity.setText(resultData.getSoLuong());
        System.out.println(resultData);
    }//GEN-LAST:event_btnSearchActionPerformed

    private void valReaderIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valReaderIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_valReaderIDActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Header;
    private javax.swing.JButton btnSearch;
    private javax.swing.JTable containerValue;
    private javax.swing.JScrollPane groupData;
    private javax.swing.JTextField inputSearch;
    private javax.swing.JLabel nameAddess;
    private javax.swing.JLabel nameCardNumber;
    private javax.swing.JLabel namePhoneNumber;
    private javax.swing.JLabel nameReaderID;
    private javax.swing.JLabel nameReaderName;
    private java.awt.Panel readerAddress;
    private java.awt.Panel readerCardNumber;
    private java.awt.Panel readerPhoneNumber;
    private java.awt.Panel readerReaderID;
    private java.awt.Panel readerReaderName;
    private javax.swing.JTextField valAddress;
    private javax.swing.JTextField valCardNumber;
    private javax.swing.JTextField valPhoneNumber;
    private javax.swing.JTextField valReaderID;
    private javax.swing.JTextField valReaderName;
    // End of variables declaration//GEN-END:variables

}
