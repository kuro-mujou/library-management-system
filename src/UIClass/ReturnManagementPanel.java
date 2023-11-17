package UIClass;

import databaseClass.Sach;
import databaseClass.SachCRUD;

public class ReturnManagementPanel extends javax.swing.JPanel
{
    MainInterface main;

    public ReturnManagementPanel(MainInterface main)
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
        bookType = new java.awt.Panel();
        nameId = new javax.swing.JLabel();
        valType = new javax.swing.JTextField();
        bookTitle = new java.awt.Panel();
        nameTitle = new javax.swing.JLabel();
        valTitle = new javax.swing.JTextField();
        bookPublicationYear = new java.awt.Panel();
        valPublicsher = new javax.swing.JTextField();
        nameTitle1 = new javax.swing.JLabel();
        bookAuthor = new java.awt.Panel();
        nameTitle2 = new javax.swing.JLabel();
        valAuthorName = new javax.swing.JTextField();
        bookQuantity = new java.awt.Panel();
        valQuantity = new javax.swing.JTextField();
        nameTitle4 = new javax.swing.JLabel();
        bookReaderID = new java.awt.Panel();
        valReaderID = new javax.swing.JTextField();
        nameReaderID = new javax.swing.JLabel();
        bookBorrowDate = new java.awt.Panel();
        valBorrowDate = new javax.swing.JTextField();
        nameBorrowDate = new javax.swing.JLabel();
        bookPublisher = new java.awt.Panel();
        valPublicsher1 = new javax.swing.JTextField();
        nameTitle3 = new javax.swing.JLabel();
        bookReturnDate = new java.awt.Panel();
        valReturnDate = new javax.swing.JTextField();
        nameReturnDate = new javax.swing.JLabel();
        bookPhoneNumber = new java.awt.Panel();
        valPhoneNumber = new javax.swing.JTextField();
        namePhoneNumber = new javax.swing.JLabel();
        btnBorrow = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        bookQuantity2 = new java.awt.Panel();
        valQuantity2 = new javax.swing.JTextField();
        nameTitle6 = new javax.swing.JLabel();

        setOpaque(false);

        Header.setFont(new java.awt.Font("Poppins", 1, 30)); // NOI18N
        Header.setText("Book Borrowing Management / Book Infomation");

        inputSearch.setBackground(java.awt.SystemColor.control);
        inputSearch.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder("Search"), "Search by ID"));
        inputSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputSearchActionPerformed(evt);
            }
        });

        bookType.setPreferredSize(new java.awt.Dimension(341, 31));

        nameId.setText("Book Type");
        nameId.setToolTipText("");
        nameId.setPreferredSize(new java.awt.Dimension(30, 16));

        valType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valTypeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout bookTypeLayout = new javax.swing.GroupLayout(bookType);
        bookType.setLayout(bookTypeLayout);
        bookTypeLayout.setHorizontalGroup(
            bookTypeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bookTypeLayout.createSequentialGroup()
                .addComponent(nameId, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(valType, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE))
        );
        bookTypeLayout.setVerticalGroup(
            bookTypeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(valType, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
            .addComponent(nameId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        bookTitle.setPreferredSize(new java.awt.Dimension(341, 31));

        nameTitle.setText("Book Title");
        nameTitle.setToolTipText("");
        nameTitle.setPreferredSize(new java.awt.Dimension(30, 16));

        valTitle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valTitleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout bookTitleLayout = new javax.swing.GroupLayout(bookTitle);
        bookTitle.setLayout(bookTitleLayout);
        bookTitleLayout.setHorizontalGroup(
            bookTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bookTitleLayout.createSequentialGroup()
                .addComponent(nameTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addComponent(valTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        bookTitleLayout.setVerticalGroup(
            bookTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(nameTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(valTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
        );

        bookPublicationYear.setPreferredSize(new java.awt.Dimension(341, 31));

        valPublicsher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valPublicsherActionPerformed(evt);
            }
        });

        nameTitle1.setText("Publication Year");
        nameTitle1.setToolTipText("");
        nameTitle1.setPreferredSize(new java.awt.Dimension(30, 16));

        javax.swing.GroupLayout bookPublicationYearLayout = new javax.swing.GroupLayout(bookPublicationYear);
        bookPublicationYear.setLayout(bookPublicationYearLayout);
        bookPublicationYearLayout.setHorizontalGroup(
            bookPublicationYearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bookPublicationYearLayout.createSequentialGroup()
                .addComponent(nameTitle1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(valPublicsher, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE))
        );
        bookPublicationYearLayout.setVerticalGroup(
            bookPublicationYearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bookPublicationYearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(nameTitle1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(valPublicsher, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE))
        );

        nameTitle1.getAccessibleContext().setAccessibleName("Publisher");

        bookAuthor.setPreferredSize(new java.awt.Dimension(341, 31));

        nameTitle2.setText("Author's Name");
        nameTitle2.setToolTipText("");
        nameTitle2.setPreferredSize(new java.awt.Dimension(30, 16));

        valAuthorName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valAuthorNameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout bookAuthorLayout = new javax.swing.GroupLayout(bookAuthor);
        bookAuthor.setLayout(bookAuthorLayout);
        bookAuthorLayout.setHorizontalGroup(
            bookAuthorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bookAuthorLayout.createSequentialGroup()
                .addComponent(nameTitle2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addComponent(valAuthorName, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        bookAuthorLayout.setVerticalGroup(
            bookAuthorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(nameTitle2, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
            .addComponent(valAuthorName, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        bookQuantity.setPreferredSize(new java.awt.Dimension(341, 31));

        nameTitle4.setText("Quantity");
        nameTitle4.setToolTipText("");
        nameTitle4.setPreferredSize(new java.awt.Dimension(30, 16));

        javax.swing.GroupLayout bookQuantityLayout = new javax.swing.GroupLayout(bookQuantity);
        bookQuantity.setLayout(bookQuantityLayout);
        bookQuantityLayout.setHorizontalGroup(
            bookQuantityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bookQuantityLayout.createSequentialGroup()
                .addComponent(nameTitle4, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(valQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        bookQuantityLayout.setVerticalGroup(
            bookQuantityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(valQuantity, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
            .addComponent(nameTitle4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        bookReaderID.setPreferredSize(new java.awt.Dimension(341, 31));

        valReaderID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valReaderIDActionPerformed(evt);
            }
        });

        nameReaderID.setText("Reader ID");
        nameReaderID.setToolTipText("");
        nameReaderID.setPreferredSize(new java.awt.Dimension(30, 16));

        javax.swing.GroupLayout bookReaderIDLayout = new javax.swing.GroupLayout(bookReaderID);
        bookReaderID.setLayout(bookReaderIDLayout);
        bookReaderIDLayout.setHorizontalGroup(
            bookReaderIDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bookReaderIDLayout.createSequentialGroup()
                .addComponent(nameReaderID, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addComponent(valReaderID, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        bookReaderIDLayout.setVerticalGroup(
            bookReaderIDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(valReaderID, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
            .addComponent(nameReaderID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        bookBorrowDate.setPreferredSize(new java.awt.Dimension(341, 31));

        nameBorrowDate.setText("Borrow Date");
        nameBorrowDate.setToolTipText("");
        nameBorrowDate.setPreferredSize(new java.awt.Dimension(30, 16));

        javax.swing.GroupLayout bookBorrowDateLayout = new javax.swing.GroupLayout(bookBorrowDate);
        bookBorrowDate.setLayout(bookBorrowDateLayout);
        bookBorrowDateLayout.setHorizontalGroup(
            bookBorrowDateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bookBorrowDateLayout.createSequentialGroup()
                .addComponent(nameBorrowDate, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addComponent(valBorrowDate, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        bookBorrowDateLayout.setVerticalGroup(
            bookBorrowDateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(valBorrowDate, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
            .addComponent(nameBorrowDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        bookPublisher.setPreferredSize(new java.awt.Dimension(341, 31));

        nameTitle3.setText("Publisher");
        nameTitle3.setToolTipText("");
        nameTitle3.setPreferredSize(new java.awt.Dimension(30, 16));

        javax.swing.GroupLayout bookPublisherLayout = new javax.swing.GroupLayout(bookPublisher);
        bookPublisher.setLayout(bookPublisherLayout);
        bookPublisherLayout.setHorizontalGroup(
            bookPublisherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bookPublisherLayout.createSequentialGroup()
                .addComponent(nameTitle3, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addComponent(valPublicsher1, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        bookPublisherLayout.setVerticalGroup(
            bookPublisherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(valPublicsher1, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
            .addComponent(nameTitle3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        bookReturnDate.setPreferredSize(new java.awt.Dimension(341, 31));

        nameReturnDate.setText("Return Date");
        nameReturnDate.setToolTipText("");
        nameReturnDate.setPreferredSize(new java.awt.Dimension(30, 16));

        javax.swing.GroupLayout bookReturnDateLayout = new javax.swing.GroupLayout(bookReturnDate);
        bookReturnDate.setLayout(bookReturnDateLayout);
        bookReturnDateLayout.setHorizontalGroup(
            bookReturnDateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bookReturnDateLayout.createSequentialGroup()
                .addComponent(nameReturnDate, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addComponent(valReturnDate, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        bookReturnDateLayout.setVerticalGroup(
            bookReturnDateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(valReturnDate, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
            .addComponent(nameReturnDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        bookPhoneNumber.setPreferredSize(new java.awt.Dimension(341, 31));

        namePhoneNumber.setText("Phone Number");
        namePhoneNumber.setToolTipText("");
        namePhoneNumber.setPreferredSize(new java.awt.Dimension(30, 16));

        javax.swing.GroupLayout bookPhoneNumberLayout = new javax.swing.GroupLayout(bookPhoneNumber);
        bookPhoneNumber.setLayout(bookPhoneNumberLayout);
        bookPhoneNumberLayout.setHorizontalGroup(
            bookPhoneNumberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bookPhoneNumberLayout.createSequentialGroup()
                .addComponent(namePhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addComponent(valPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        bookPhoneNumberLayout.setVerticalGroup(
            bookPhoneNumberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(valPhoneNumber, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
            .addComponent(namePhoneNumber, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        btnBorrow.setText("Borrow");

        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        bookQuantity2.setPreferredSize(new java.awt.Dimension(341, 31));

        nameTitle6.setText("Quantity");
        nameTitle6.setToolTipText("");
        nameTitle6.setPreferredSize(new java.awt.Dimension(30, 16));

        javax.swing.GroupLayout bookQuantity2Layout = new javax.swing.GroupLayout(bookQuantity2);
        bookQuantity2.setLayout(bookQuantity2Layout);
        bookQuantity2Layout.setHorizontalGroup(
            bookQuantity2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bookQuantity2Layout.createSequentialGroup()
                .addComponent(nameTitle6, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(valQuantity2, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        bookQuantity2Layout.setVerticalGroup(
            bookQuantity2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bookQuantity2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(nameTitle6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(valQuantity2))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(Header, javax.swing.GroupLayout.PREFERRED_SIZE, 907, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(inputSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 706, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSearch)))
                .addContainerGap(43, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnCancel)
                        .addGap(86, 86, 86)
                        .addComponent(btnBorrow))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(bookPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(bookReturnDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(bookBorrowDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(bookReaderID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(bookQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bookQuantity2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bookAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bookPublisher, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bookTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bookType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bookPublicationYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(128, 128, 128))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Header)
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bookType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bookTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bookAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(bookPublisher, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bookPublicationYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bookReaderID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bookBorrowDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bookReturnDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(bookPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bookQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(bookQuantity2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBorrow, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(190, Short.MAX_VALUE))
        );

        bookType.getAccessibleContext().setAccessibleName("id");
    }// </editor-fold>//GEN-END:initComponents

    private void inputSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputSearchActionPerformed

    private void valAuthorNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valAuthorNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_valAuthorNameActionPerformed

    private void valTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_valTypeActionPerformed

    private void valTitleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valTitleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_valTitleActionPerformed

    private void valPublicsherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valPublicsherActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_valPublicsherActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancelActionPerformed


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
    private java.awt.Panel bookAuthor;
    private java.awt.Panel bookBorrowDate;
    private java.awt.Panel bookPhoneNumber;
    private java.awt.Panel bookPublicationYear;
    private java.awt.Panel bookPublisher;
    private java.awt.Panel bookQuantity;
    private java.awt.Panel bookQuantity2;
    private java.awt.Panel bookReaderID;
    private java.awt.Panel bookReturnDate;
    private java.awt.Panel bookTitle;
    private java.awt.Panel bookType;
    private javax.swing.JButton btnBorrow;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnSearch;
    private javax.swing.JTextField inputSearch;
    private javax.swing.JLabel nameBorrowDate;
    private javax.swing.JLabel nameId;
    private javax.swing.JLabel namePhoneNumber;
    private javax.swing.JLabel nameReaderID;
    private javax.swing.JLabel nameReturnDate;
    private javax.swing.JLabel nameTitle;
    private javax.swing.JLabel nameTitle1;
    private javax.swing.JLabel nameTitle2;
    private javax.swing.JLabel nameTitle3;
    private javax.swing.JLabel nameTitle4;
    private javax.swing.JLabel nameTitle6;
    private javax.swing.JTextField valAuthorName;
    private javax.swing.JTextField valBorrowDate;
    private javax.swing.JTextField valPhoneNumber;
    private javax.swing.JTextField valPublicsher;
    private javax.swing.JTextField valPublicsher1;
    private javax.swing.JTextField valQuantity;
    private javax.swing.JTextField valQuantity2;
    private javax.swing.JTextField valReaderID;
    private javax.swing.JTextField valReturnDate;
    private javax.swing.JTextField valTitle;
    private javax.swing.JTextField valType;
    // End of variables declaration//GEN-END:variables

}
