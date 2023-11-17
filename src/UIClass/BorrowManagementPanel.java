
package UIClass;


public class BorrowManagementPanel extends javax.swing.JPanel 
{
    MainInterface main;
    public BorrowManagementPanel(MainInterface main) 
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

        jLabel1 = new javax.swing.JLabel();
        textField_noLabel1 = new swing.TextField_noLabel();
        jLabel2 = new javax.swing.JLabel();
        nameCardNumber = new javax.swing.JLabel();
        nameAddess = new javax.swing.JLabel();
        namePhoneNumber = new javax.swing.JLabel();
        nameReaderName = new javax.swing.JLabel();
        nameReaderID = new javax.swing.JLabel();
        ReaderIDTextField = new javax.swing.JTextField();
        ReaderNameTextField = new javax.swing.JTextField();
        ReaderPhoneNumTextField = new javax.swing.JTextField();
        ReaderAddressTextField = new javax.swing.JTextField();
        ReaderCardIDTextField = new javax.swing.JTextField();
        button1 = new swing.Button();

        setOpaque(false);

        jLabel1.setFont(new java.awt.Font("Poppins", 1, 30)); // NOI18N
        jLabel1.setText("Check Reader Information");

        jLabel2.setText("Input Reader ID/Reader name");

        nameCardNumber.setText("Card Number");
        nameCardNumber.setToolTipText("");
        nameCardNumber.setPreferredSize(new java.awt.Dimension(30, 16));

        nameAddess.setText("Address");
        nameAddess.setToolTipText("");
        nameAddess.setPreferredSize(new java.awt.Dimension(30, 16));

        namePhoneNumber.setText("Phone Number");
        namePhoneNumber.setToolTipText("");
        namePhoneNumber.setPreferredSize(new java.awt.Dimension(30, 16));

        nameReaderName.setText("Reader Name");
        nameReaderName.setToolTipText("");
        nameReaderName.setPreferredSize(new java.awt.Dimension(30, 16));

        nameReaderID.setText("Reader ID");
        nameReaderID.setToolTipText("");
        nameReaderID.setPreferredSize(new java.awt.Dimension(30, 16));

        button1.setBackground(new java.awt.Color(213, 213, 213));
        button1.setText("FIND");
        button1.setRadius(15);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(nameReaderID, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nameReaderName, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(namePhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nameAddess, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nameCardNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ReaderCardIDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(textField_noLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
                                    .addComponent(ReaderIDTextField)
                                    .addComponent(ReaderNameTextField)
                                    .addComponent(ReaderPhoneNumTextField)
                                    .addComponent(ReaderAddressTextField))
                                .addGap(18, 18, 18)
                                .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 434, Short.MAX_VALUE)
                        .addGap(662, 662, 662))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textField_noLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nameReaderID, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ReaderIDTextField))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nameReaderName, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ReaderNameTextField))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(namePhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ReaderPhoneNumTextField))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nameAddess, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ReaderAddressTextField))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nameCardNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ReaderCardIDTextField))
                .addGap(271, 271, 271))
        );
    }// </editor-fold>//GEN-END:initComponents

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ReaderAddressTextField;
    private javax.swing.JTextField ReaderCardIDTextField;
    private javax.swing.JTextField ReaderIDTextField;
    private javax.swing.JTextField ReaderNameTextField;
    private javax.swing.JTextField ReaderPhoneNumTextField;
    private swing.Button button1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel nameAddess;
    private javax.swing.JLabel nameCardNumber;
    private javax.swing.JLabel namePhoneNumber;
    private javax.swing.JLabel nameReaderID;
    private javax.swing.JLabel nameReaderName;
    private swing.TextField_noLabel textField_noLabel1;
    // End of variables declaration//GEN-END:variables

    
}
