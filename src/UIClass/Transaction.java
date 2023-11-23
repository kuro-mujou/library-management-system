package UIClass;

import javax.swing.JOptionPane;

public class Transaction extends javax.swing.JPanel
{
    public Transaction()
    {
        initComponents();
        init();
    }

    private void init()
    {
        bookInfoPanel.setVisible(false);
        readerInfoPanel.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        SearchReaderTXT = new swing.TextField_noLabel();
        jLabel1 = new javax.swing.JLabel();
        SearchReaderBtn = new swing.Button();
        readerInfoPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        bookInfoPanel = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        SearchBookTXT = new swing.TextField_noLabel();
        SearchBookBtn = new swing.Button();
        jLabel9 = new javax.swing.JLabel();
        textMaSach = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        textTenSach = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        textTheLoai = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        textTacGia = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        textSoLuong = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        textNamXuatBan = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        textGhiChu = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        Minus = new swing.Button();
        quantity = new javax.swing.JLabel();
        Plus = new swing.Button();
        ConfirmBorrow = new swing.Button();
        jLabel17 = new javax.swing.JLabel();
        textField_noLabel1 = new swing.TextField_noLabel();
        textField_noLabel2 = new swing.TextField_noLabel();
        textField_noLabel3 = new swing.TextField_noLabel();

        SearchReaderTXT.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel1.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Enter reader ID");

        SearchReaderBtn.setText("Search");
        SearchReaderBtn.setColor(new java.awt.Color(255, 204, 0));
        SearchReaderBtn.setRadius(15);
        SearchReaderBtn.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                SearchReaderBtnActionPerformed(evt);
            }
        });

        jLabel2.setText("Reader Name:");

        jLabel3.setText("Phone Number:");

        jLabel4.setText("Hien thi ten reader sau khi search");

        jLabel5.setText("Hien thi Sdt cua reader");

        jLabel6.setText("Status:");

        jLabel7.setText("Neu khong co sach dang duoc muon thi status la ok cho phep muon sach moi, con k thi phai tra sach cu moi duoc muon sach moi");

        javax.swing.GroupLayout readerInfoPanelLayout = new javax.swing.GroupLayout(readerInfoPanel);
        readerInfoPanel.setLayout(readerInfoPanelLayout);
        readerInfoPanelLayout.setHorizontalGroup(
            readerInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(readerInfoPanelLayout.createSequentialGroup()
                .addGroup(readerInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(readerInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)))
        );
        readerInfoPanelLayout.setVerticalGroup(
            readerInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(readerInfoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(readerInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(readerInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(readerInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel8.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Enter Book name");

        SearchBookTXT.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        SearchBookBtn.setText("Search");
        SearchBookBtn.setColor(new java.awt.Color(255, 204, 0));
        SearchBookBtn.setRadius(15);
        SearchBookBtn.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                SearchBookBtnActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Poppins", 0, 20)); // NOI18N
        jLabel9.setText("Book ID");

        textMaSach.setEditable(false);
        textMaSach.setBorder(null);

        jLabel10.setFont(new java.awt.Font("Poppins", 0, 20)); // NOI18N
        jLabel10.setText("Book Title");

        textTenSach.setEditable(false);
        textTenSach.setBorder(null);

        jLabel11.setFont(new java.awt.Font("Poppins", 0, 20)); // NOI18N
        jLabel11.setText("Category");

        textTheLoai.setEditable(false);
        textTheLoai.setBorder(null);

        jLabel12.setFont(new java.awt.Font("Poppins", 0, 20)); // NOI18N
        jLabel12.setText("Author");

        textTacGia.setEditable(false);
        textTacGia.setBorder(null);

        jLabel13.setFont(new java.awt.Font("Poppins", 0, 20)); // NOI18N
        jLabel13.setText("Quantity");

        textSoLuong.setEditable(false);
        textSoLuong.setBorder(null);

        jLabel14.setFont(new java.awt.Font("Poppins", 0, 20)); // NOI18N
        jLabel14.setText("Publication year");

        textNamXuatBan.setEditable(false);
        textNamXuatBan.setBorder(null);

        jLabel15.setFont(new java.awt.Font("Poppins", 0, 20)); // NOI18N
        jLabel15.setText("Description");

        textGhiChu.setEditable(false);
        textGhiChu.setBorder(null);

        jLabel16.setFont(new java.awt.Font("Poppins", 0, 20)); // NOI18N
        jLabel16.setText("Borrow quantity");

        Minus.setText("-");
        Minus.setColor(new java.awt.Color(255, 204, 0));
        Minus.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Minus.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Minus.setRadius(5);
        Minus.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                MinusActionPerformed(evt);
            }
        });

        quantity.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        quantity.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        quantity.setText("0");

        Plus.setText("+");
        Plus.setColor(new java.awt.Color(255, 204, 0));
        Plus.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Plus.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Plus.setRadius(5);
        Plus.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                PlusActionPerformed(evt);
            }
        });

        ConfirmBorrow.setText("Confirm");
        ConfirmBorrow.setColor(new java.awt.Color(255, 204, 0));
        ConfirmBorrow.setRadius(15);
        ConfirmBorrow.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                ConfirmBorrowActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Poppins", 0, 20)); // NOI18N
        jLabel17.setText("Return day");

        javax.swing.GroupLayout bookInfoPanelLayout = new javax.swing.GroupLayout(bookInfoPanel);
        bookInfoPanel.setLayout(bookInfoPanelLayout);
        bookInfoPanelLayout.setHorizontalGroup(
            bookInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bookInfoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(bookInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(bookInfoPanelLayout.createSequentialGroup()
                        .addComponent(SearchBookTXT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SearchBookBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(bookInfoPanelLayout.createSequentialGroup()
                        .addGroup(bookInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(bookInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(bookInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(textSoLuong, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textTacGia, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textTheLoai, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textTenSach, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textMaSach)
                            .addComponent(textNamXuatBan, javax.swing.GroupLayout.PREFERRED_SIZE, 733, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(bookInfoPanelLayout.createSequentialGroup()
                        .addGroup(bookInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(bookInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(bookInfoPanelLayout.createSequentialGroup()
                                .addComponent(Minus, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Plus, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(textField_noLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textField_noLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textField_noLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ConfirmBorrow, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(textGhiChu))))
                .addContainerGap())
        );
        bookInfoPanelLayout.setVerticalGroup(
            bookInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bookInfoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bookInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(SearchBookBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(SearchBookTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bookInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textMaSach, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bookInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textTenSach, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bookInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textTheLoai, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bookInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textTacGia, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bookInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bookInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textNamXuatBan, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bookInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textGhiChu, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bookInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(quantity, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addComponent(Minus, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addComponent(ConfirmBorrow, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addComponent(Plus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(textField_noLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(textField_noLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(textField_noLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bookInfoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 467, Short.MAX_VALUE)
                            .addComponent(SearchReaderTXT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SearchReaderBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(readerInfoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(SearchReaderBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(SearchReaderTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(readerInfoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bookInfoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(111, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void MinusActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_MinusActionPerformed
    {//GEN-HEADEREND:event_MinusActionPerformed
        try
        {
            int num = Integer.parseInt(quantity.getText());
            if (num > 0)
            {
                num -= 1;
                quantity.setText(String.valueOf(num));
            }
            else
                JOptionPane.showMessageDialog(this, "minimum quantity is 0");
        } catch (Exception e)
        {
            
        }
    }//GEN-LAST:event_MinusActionPerformed

    private void PlusActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_PlusActionPerformed
    {//GEN-HEADEREND:event_PlusActionPerformed
        //thay max = so luong sach trong data (quantity)
        int max = 10;
        try
        {
            int num = Integer.parseInt(quantity.getText());
            if (num<max)
            {
                num += 1;
                quantity.setText(String.valueOf(num));
            }
            else if(num==max)
                JOptionPane.showMessageDialog(this, "reach maximum quantity");
        } catch (Exception e)
        {
            
        }
    }//GEN-LAST:event_PlusActionPerformed

    private void SearchReaderBtnActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_SearchReaderBtnActionPerformed
    {//GEN-HEADEREND:event_SearchReaderBtnActionPerformed
        /*
        neu co reader thi display readerInfoPanel
        sau do load reader data vao readerInfoPanel
        sau do display bookInfoPanel
         */
        readerInfoPanel.setVisible(true);
        bookInfoPanel.setVisible(true);
        /*
        neu khong co reader:
         */
//        JOptionPane.showMessageDialog(this, "No reader name: "+SearchReaderTXT.getText()+" found!");
    }//GEN-LAST:event_SearchReaderBtnActionPerformed

    private void SearchBookBtnActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_SearchBookBtnActionPerformed
    {//GEN-HEADEREND:event_SearchBookBtnActionPerformed
        /*
        search co sach thi display thong tin cai sach do ra
         */
    }//GEN-LAST:event_SearchBookBtnActionPerformed

    private void ConfirmBorrowActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_ConfirmBorrowActionPerformed
    {//GEN-HEADEREND:event_ConfirmBorrowActionPerformed
        try
        {
            int num = Integer.parseInt(quantity.getText());
            /*
                lay so luong can dat roi tru cho so luong co trong database
            */
            JOptionPane.showMessageDialog(this, "success");
        } catch (Exception e)
        {
        }
    }//GEN-LAST:event_ConfirmBorrowActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private swing.Button ConfirmBorrow;
    private swing.Button Minus;
    private swing.Button Plus;
    private swing.Button SearchBookBtn;
    private swing.TextField_noLabel SearchBookTXT;
    private swing.Button SearchReaderBtn;
    private swing.TextField_noLabel SearchReaderTXT;
    private javax.swing.JPanel bookInfoPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel quantity;
    private javax.swing.JPanel readerInfoPanel;
    private swing.TextField_noLabel textField_noLabel1;
    private swing.TextField_noLabel textField_noLabel2;
    private swing.TextField_noLabel textField_noLabel3;
    private javax.swing.JTextField textGhiChu;
    private javax.swing.JTextField textMaSach;
    private javax.swing.JTextField textNamXuatBan;
    private javax.swing.JTextField textSoLuong;
    private javax.swing.JTextField textTacGia;
    private javax.swing.JTextField textTenSach;
    private javax.swing.JTextField textTheLoai;
    // End of variables declaration//GEN-END:variables
}
