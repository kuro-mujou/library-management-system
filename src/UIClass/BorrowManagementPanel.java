package UIClass;

import databaseClass.DocGia;
import databaseClass.DocGiaCRUD;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class BorrowManagementPanel extends javax.swing.JPanel
{
    MainInterface main;
    DocGiaCRUD docGiaDAO = new DocGiaCRUD();
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
    private void updateDanhSachBookDaMuon()
    {
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jLabel1 = new javax.swing.JLabel();
        TextFindReader = new swing.TextField_noLabel();
        jLabel2 = new javax.swing.JLabel();
        nameCardNumber = new javax.swing.JLabel();
        nameAddess = new javax.swing.JLabel();
        nameReaderName = new javax.swing.JLabel();
        nameReaderID = new javax.swing.JLabel();
        ReaderIDTextField = new javax.swing.JTextField();
        ReaderNameTextField = new javax.swing.JTextField();
        ReaderAddressTextField = new javax.swing.JTextField();
        ReaderCardIDTextField = new javax.swing.JTextField();
        FindBtn = new swing.Button();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableWhite1 = new swing.TableWhite();
        BorrowBtn = new swing.Button();
        AddreaderBtn = new swing.Button();

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

        nameReaderName.setText("Reader Name");
        nameReaderName.setToolTipText("");
        nameReaderName.setPreferredSize(new java.awt.Dimension(30, 16));

        nameReaderID.setText("Reader ID");
        nameReaderID.setToolTipText("");
        nameReaderID.setPreferredSize(new java.awt.Dimension(30, 16));

        FindBtn.setBackground(new java.awt.Color(213, 213, 213));
        FindBtn.setText("FIND");
        FindBtn.setRadius(15);
        FindBtn.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                FindBtnActionPerformed(evt);
            }
        });

        tableWhite1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String []
            {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tableWhite1.setEnabled(false);
        jScrollPane1.setViewportView(tableWhite1);

        BorrowBtn.setBackground(new java.awt.Color(213, 213, 213));
        BorrowBtn.setText("BORROW");
        BorrowBtn.setRadius(15);

        AddreaderBtn.setBackground(new java.awt.Color(213, 213, 213));
        AddreaderBtn.setText("ADD READER");
        AddreaderBtn.setRadius(15);
        AddreaderBtn.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                AddreaderBtnActionPerformed(evt);
            }
        });

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
                            .addComponent(nameReaderName, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TextFindReader, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
                            .addComponent(ReaderIDTextField)
                            .addComponent(ReaderNameTextField)
                            .addComponent(ReaderAddressTextField)
                            .addComponent(ReaderCardIDTextField))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(FindBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BorrowBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AddreaderBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 485, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameAddess, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameCardNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 485, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(369, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(TextFindReader, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(FindBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(nameReaderID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ReaderIDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(BorrowBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ReaderNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(AddreaderBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(nameReaderName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nameAddess, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ReaderAddressTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nameCardNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ReaderCardIDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(52, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void AddreaderBtnActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_AddreaderBtnActionPerformed
    {//GEN-HEADEREND:event_AddreaderBtnActionPerformed
        ReaderManagementPanel readerManagement = new ReaderManagementPanel(main);
        JPanel p = main.getPanel();
        p.removeAll();
        p.add(readerManagement);
        main.LoadChange();
        readerManagement.initCustom();
        p.validate();
        p.repaint();
    }//GEN-LAST:event_AddreaderBtnActionPerformed

    private void FindBtnActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_FindBtnActionPerformed
    {//GEN-HEADEREND:event_FindBtnActionPerformed
//        try
//        {
//            int input = Integer.parseInt(TextFindReader.getText());
//            DocGia docgia = docGiaDAO.FindDocGiaTheoID(input);
//            if (docgia != null)
//            {
//                ReaderIDTextField.setText(""+docgia.getMaDocGia());
//                ReaderNameTextField.setText(docgia.getTenDocGia());
//                ReaderAddressTextField.setText(docgia.getDiaChiDG());
//                ReaderCardIDTextField.setText(""+docgia.getSoThe());
//            } else
//            {
//                System.out.println("int");
//                JOptionPane.showMessageDialog(this,"Khong tim thay doc gia");
//            }
//        } catch (Exception e)
//        {
//            String input =TextFindReader.getText();
//            DocGia docgia = docGiaDAO.FindDocGiaTheoTen(input);
//            if (docgia != null)
//            {
//                ReaderIDTextField.setText(""+docgia.getMaDocGia());
//                ReaderNameTextField.setText(docgia.getTenDocGia());
//                ReaderAddressTextField.setText(docgia.getDiaChiDG());
//                ReaderCardIDTextField.setText(""+docgia.getSoThe());
//            } else
//            {
//                System.out.println("string");
//                JOptionPane.showMessageDialog(this,"Khong tim thay doc gia");
//            }
//        }
    }//GEN-LAST:event_FindBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private swing.Button AddreaderBtn;
    private swing.Button BorrowBtn;
    private swing.Button FindBtn;
    private javax.swing.JTextField ReaderAddressTextField;
    private javax.swing.JTextField ReaderCardIDTextField;
    private javax.swing.JTextField ReaderIDTextField;
    private javax.swing.JTextField ReaderNameTextField;
    private swing.TextField_noLabel TextFindReader;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel nameAddess;
    private javax.swing.JLabel nameCardNumber;
    private javax.swing.JLabel nameReaderID;
    private javax.swing.JLabel nameReaderName;
    private swing.TableWhite tableWhite1;
    // End of variables declaration//GEN-END:variables

}
