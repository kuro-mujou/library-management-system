package swing;

import databaseClass.DocGia;
import databaseClass.Sach;

public class ReaderItem extends javax.swing.JPanel
{
    public ReaderItem(DocGia readerData,Sach bookData)
    {
        initComponents();
        init();
    }
    private void init()
    {
        setOpaque(false);
        ItemMenuPanel.setVisible(false);
    }
    private void toggleCollapsibleState()
    {
        ItemMenuPanel.setVisible(!ItemMenuPanel.isVisible());
        revalidate();
        repaint();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        ReaderID = new javax.swing.JLabel();
        ReaderName = new javax.swing.JLabel();
        ReaderAge = new javax.swing.JLabel();
        ReaderGender = new javax.swing.JLabel();
        ReaderPhoneNum = new javax.swing.JLabel();
        ReaderAddress = new javax.swing.JLabel();
        DropDownIcon = new swing.PictureBox();
        ItemMenuPanel = new javax.swing.JPanel();
        deleteBtn = new swing.PictureBox();
        editBtn = new swing.PictureBox();
        TITLE = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        BookName = new javax.swing.JLabel();
        BorrowDay = new javax.swing.JLabel();
        ReturnDay = new javax.swing.JLabel();
        CurrentStatus = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        ReaderID.setText("ID");
        ReaderID.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        ReaderName.setText("Ten Reader");

        ReaderAge.setText("Tuoi");
        ReaderAge.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        ReaderGender.setText("GioiTinh");

        ReaderPhoneNum.setText("SDT");

        ReaderAddress.setText("Diachi");
        ReaderAddress.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        DropDownIcon.setImage(new javax.swing.ImageIcon(getClass().getResource("/Icon/drop-down-icon.png"))); // NOI18N
        DropDownIcon.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                DropDownIconMouseClicked(evt);
            }
        });

        deleteBtn.setImage(new javax.swing.ImageIcon(getClass().getResource("/Icon/delete.png"))); // NOI18N

        editBtn.setImage(new javax.swing.ImageIcon(getClass().getResource("/Icon/edit.png"))); // NOI18N

        TITLE.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        TITLE.setText("BOOK BORROW INFOMATION");

        jLabel3.setText("Current borrow book:");

        jLabel4.setText("Borrow day:");

        jLabel5.setText("Return day:");

        jLabel6.setText("Status:");

        BookName.setText("Book Name");

        BorrowDay.setText("DAY START");

        ReturnDay.setText("DAY END");

        CurrentStatus.setText("IS_RETURN");

        javax.swing.GroupLayout ItemMenuPanelLayout = new javax.swing.GroupLayout(ItemMenuPanel);
        ItemMenuPanel.setLayout(ItemMenuPanelLayout);
        ItemMenuPanelLayout.setHorizontalGroup(
            ItemMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ItemMenuPanelLayout.createSequentialGroup()
                .addGroup(ItemMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ItemMenuPanelLayout.createSequentialGroup()
                        .addComponent(TITLE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ItemMenuPanelLayout.createSequentialGroup()
                        .addGroup(ItemMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(ItemMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(ReturnDay, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BookName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BorrowDay, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(CurrentStatus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(editBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, 0))
        );
        ItemMenuPanelLayout.setVerticalGroup(
            ItemMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ItemMenuPanelLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(ItemMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(TITLE, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(deleteBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ItemMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(editBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(ItemMenuPanelLayout.createSequentialGroup()
                        .addGroup(ItemMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(BookName))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(ItemMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(BorrowDay))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ItemMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(ReturnDay))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ItemMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ItemMenuPanelLayout.createSequentialGroup()
                        .addComponent(CurrentStatus)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jLabel1.setText("Gmail");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ItemMenuPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ReaderID, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ReaderName, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ReaderAge, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ReaderGender)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ReaderPhoneNum, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ReaderAddress, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DropDownIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ReaderID, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(ReaderName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ReaderAge, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ReaderGender, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ReaderPhoneNum, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ReaderAddress, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(DropDownIcon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ItemMenuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void DropDownIconMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_DropDownIconMouseClicked
    {//GEN-HEADEREND:event_DropDownIconMouseClicked
        toggleCollapsibleState();
    }//GEN-LAST:event_DropDownIconMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BookName;
    private javax.swing.JLabel BorrowDay;
    private javax.swing.JLabel CurrentStatus;
    private swing.PictureBox DropDownIcon;
    private javax.swing.JPanel ItemMenuPanel;
    private javax.swing.JLabel ReaderAddress;
    private javax.swing.JLabel ReaderAge;
    private javax.swing.JLabel ReaderGender;
    private javax.swing.JLabel ReaderID;
    private javax.swing.JLabel ReaderName;
    private javax.swing.JLabel ReaderPhoneNum;
    private javax.swing.JLabel ReturnDay;
    private javax.swing.JLabel TITLE;
    private swing.PictureBox deleteBtn;
    private swing.PictureBox editBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}
