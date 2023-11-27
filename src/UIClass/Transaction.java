package UIClass;

import databaseClass.DocGia;
import databaseClass.DocGiaCRUD;
import databaseClass.Sach;
import databaseClass.SachCRUD;
import databaseClass.transactions;
import databaseClass.transactionsCRUD;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.swing.JOptionPane;

public class Transaction extends javax.swing.JPanel
{

    DocGiaCRUD Users = new DocGiaCRUD();
    SachCRUD Sach = new SachCRUD();
    transactionsCRUD transCRUD = new transactionsCRUD();
    DocGia docgia;

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

        checkbox1 = new java.awt.Checkbox();
        SearchReaderTXT = new swing.TextField_noLabel();
        jLabel1 = new javax.swing.JLabel();
        SearchReaderBtn = new swing.Button();
        readerInfoPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        ReadName = new javax.swing.JLabel();
        Phone = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Status = new javax.swing.JLabel();
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
        LableNgayTra = new javax.swing.JLabel();
        mess_err = new javax.swing.JLabel();
        IDtransactions = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();

        checkbox1.setLabel("checkbox1");

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

        ReadName.setText("Hien thi ten reader sau khi search");

        Phone.setText("Hien thi Sdt cua reader");

        jLabel6.setText("Status:");

        Status.setText("Neu khong co sach dang duoc muon thi status la ok cho phep muon sach moi, con k thi phai tra sach cu moi duoc muon sach moi");

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
                    .addComponent(ReadName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Phone, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Status, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)))
        );
        readerInfoPanelLayout.setVerticalGroup(
            readerInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(readerInfoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(readerInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(ReadName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(readerInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(Phone))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(readerInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(Status))
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
        quantity.setText("1");

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

        LableNgayTra.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        IDtransactions.setFont(new java.awt.Font("Poppins", 0, 20)); // NOI18N
        IDtransactions.setText(" ");

        jLabel19.setFont(new java.awt.Font("Poppins", 0, 20)); // NOI18N
        jLabel19.setText("Transactions ID");

        javax.swing.GroupLayout bookInfoPanelLayout = new javax.swing.GroupLayout(bookInfoPanel);
        bookInfoPanel.setLayout(bookInfoPanelLayout);
        bookInfoPanelLayout.setHorizontalGroup(
            bookInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(bookInfoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(bookInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bookInfoPanelLayout.createSequentialGroup()
                        .addComponent(SearchBookTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 786, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(SearchBookBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19))
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
                            .addComponent(textSoLuong, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 786, Short.MAX_VALUE)
                            .addComponent(textTacGia, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textTheLoai, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textTenSach, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textMaSach)
                            .addComponent(textNamXuatBan, javax.swing.GroupLayout.PREFERRED_SIZE, 733, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(bookInfoPanelLayout.createSequentialGroup()
                        .addGroup(bookInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(bookInfoPanelLayout.createSequentialGroup()
                                .addGroup(bookInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(bookInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(bookInfoPanelLayout.createSequentialGroup()
                                        .addComponent(Minus, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(Plus, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(mess_err, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(14, 14, 14))
                                    .addGroup(bookInfoPanelLayout.createSequentialGroup()
                                        .addComponent(textGhiChu, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bookInfoPanelLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(IDtransactions, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(445, 445, 445)))
                        .addComponent(LableNgayTra, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ConfirmBorrow, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(bookInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(bookInfoPanelLayout.createSequentialGroup()
                    .addGap(16, 16, 16)
                    .addComponent(jLabel19)
                    .addContainerGap(814, Short.MAX_VALUE)))
        );
        bookInfoPanelLayout.setVerticalGroup(
            bookInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bookInfoPanelLayout.createSequentialGroup()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(bookInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SearchBookBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SearchBookTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bookInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
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
                    .addComponent(LableNgayTra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(quantity, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ConfirmBorrow, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(bookInfoPanelLayout.createSequentialGroup()
                        .addComponent(mess_err)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(bookInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Minus, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                            .addComponent(Plus, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(IDtransactions, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                .addGap(4, 4, 4))
            .addGroup(bookInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(bookInfoPanelLayout.createSequentialGroup()
                    .addGap(402, 402, 402)
                    .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bookInfoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SearchReaderTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56)
                        .addComponent(SearchReaderBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(241, 241, 241)
                        .addComponent(readerInfoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(readerInfoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 71, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(SearchReaderTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(SearchReaderBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bookInfoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(92, Short.MAX_VALUE))
        );

        SearchReaderTXT.getAccessibleContext().setAccessibleName("ReaderID");
    }// </editor-fold>//GEN-END:initComponents

    private void MinusActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_MinusActionPerformed
    {//GEN-HEADEREND:event_MinusActionPerformed
        try
        {
            int num = Integer.parseInt(quantity.getText());
            if (num > 1)
            {
                num -= 1;
                quantity.setText(String.valueOf(num));
            } else
            {
                JOptionPane.showMessageDialog(this, "minimum quantity is 1");
            }
        } catch (Exception e)
        {

        }
    }//GEN-LAST:event_MinusActionPerformed

    private void PlusActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_PlusActionPerformed
    {//GEN-HEADEREND:event_PlusActionPerformed

        int max = Integer.parseInt(textSoLuong.getText());
        try
        {
            int num = Integer.parseInt(quantity.getText());
            if (num < max)
            {
                num += 1;
                quantity.setText(String.valueOf(num));
            } else if (num == max)
            {
                JOptionPane.showMessageDialog(this, "reach maximum quantity");
            }
        } catch (Exception e)
        {

        }
    }//GEN-LAST:event_PlusActionPerformed

    private void SearchReaderBtnActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_SearchReaderBtnActionPerformed
    {//GEN-HEADEREND:event_SearchReaderBtnActionPerformed
        try
        {
//            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
//            LocalDate now = LocalDate.now().plusDays(14);
//            LableNgayTra.setText(dtf.format(now));
            docgia = Users.findReaderById(Integer.parseInt(SearchReaderTXT.getText()));
            if (docgia != null)
            {
                if (docgia.getStatus() == DocGia.ReaderStatus.READY_TO_BORROW)
                {
                    ReadName.setText(docgia.getName());
                    Phone.setText(docgia.getPhone());
                    readerInfoPanel.setVisible(true);
                    bookInfoPanel.setVisible(true);
                    Status.setText("READY");
                } else
                {
                    JOptionPane.showMessageDialog(this, "Reader nay dang co sach chua tra");
                }
            } else
            {
                JOptionPane.showMessageDialog(this, "No reader found!");
            }
        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }//GEN-LAST:event_SearchReaderBtnActionPerformed

    private void SearchBookBtnActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_SearchBookBtnActionPerformed
    {//GEN-HEADEREND:event_SearchBookBtnActionPerformed
        try
        {
            Sach Sach1 = Sach.findSachById(Integer.parseInt(SearchBookTXT.getText()));
            textMaSach.setText(String.valueOf(Sach1.getBookId()));
            textTenSach.setText(Sach1.getNameBook());
            textTheLoai.setText(Sach1.getType());
            textTacGia.setText(Sach1.getWriting());
            textSoLuong.setText(String.valueOf(Sach1.getQuantity()));
            textNamXuatBan.setText(String.valueOf(Sach1.getYearRelease()));
            textGhiChu.setText(Sach1.getDescription());
        } catch (Exception e)
        {
        }


    }//GEN-LAST:event_SearchBookBtnActionPerformed

    private void ConfirmBorrowActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_ConfirmBorrowActionPerformed
    {//GEN-HEADEREND:event_ConfirmBorrowActionPerformed
        try
        {
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate now = LocalDate.now();
            LocalDate future = LocalDate.now().plusDays(14);

            LableNgayTra.setText(dtf.format(future));

            int bookquantity = Integer.parseInt(quantity.getText());
            int bookid = Integer.parseInt(textMaSach.getText());
            int userID = Integer.parseInt(SearchReaderTXT.getText());
            int transID = transCRUD.getIdTransactions() + 1;
            String startDay = now.toString();
            String endDay = future.toString();
            
            transactions T = new transactions(transID, startDay, endDay, bookquantity, bookid, userID);
            
            int checked = transCRUD.addNewTransaction(T);
            if (checked > 0)
            {
                transactions tras = transCRUD.getTransactionsByID(transID);
                IDtransactions.setText(String.valueOf(tras.getTransactionId()));
            }
            JOptionPane.showMessageDialog(this, "SUCCESS");
            SearchBookBtnActionPerformed(evt);
        } catch (Exception e)
        {
        }
    }//GEN-LAST:event_ConfirmBorrowActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private swing.Button ConfirmBorrow;
    private javax.swing.JLabel IDtransactions;
    private javax.swing.JLabel LableNgayTra;
    private swing.Button Minus;
    private javax.swing.JLabel Phone;
    private swing.Button Plus;
    private javax.swing.JLabel ReadName;
    private swing.Button SearchBookBtn;
    private swing.TextField_noLabel SearchBookTXT;
    private swing.Button SearchReaderBtn;
    private swing.TextField_noLabel SearchReaderTXT;
    private javax.swing.JLabel Status;
    private javax.swing.JPanel bookInfoPanel;
    private java.awt.Checkbox checkbox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel mess_err;
    private javax.swing.JLabel quantity;
    private javax.swing.JPanel readerInfoPanel;
    private javax.swing.JTextField textGhiChu;
    private javax.swing.JTextField textMaSach;
    private javax.swing.JTextField textNamXuatBan;
    private javax.swing.JTextField textSoLuong;
    private javax.swing.JTextField textTacGia;
    private javax.swing.JTextField textTenSach;
    private javax.swing.JTextField textTheLoai;
    // End of variables declaration//GEN-END:variables
}
