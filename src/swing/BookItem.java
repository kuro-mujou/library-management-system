package swing;

import databaseClass.Sach;
import databaseClass.SachCRUD;

public class BookItem extends javax.swing.JPanel
{
        SachCRUD sachDAO = new SachCRUD();
    int idSach = -1;
    public BookItem(Sach data)
    {
        initComponents();
        
//        BookAuthor.setText(data.getMaTacGia().getTenTacGia());
//        BookID.setText(""+data.getMaSach());
//        BookName.setText(data.getTenSach());
//        BookQuantity.setText(data.getSoLuong()+"");
//        BookType.setText(data.getMaTheLoai().getTenTheLoai());
//        BookYear.setText(data.getNamXB()+"");
//        BookDescription.setText(data.getMoTa());
//        fillDataTable();
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
    private void initComponents() {

        BookID = new javax.swing.JLabel();
        BookName = new javax.swing.JLabel();
        BookQuantity = new javax.swing.JLabel();
        BookAuthor = new javax.swing.JLabel();
        BookType = new javax.swing.JLabel();
        BookYear = new javax.swing.JLabel();
        DropDownIcon = new swing.PictureBox();
        ItemMenuPanel = new javax.swing.JPanel();
        deleteBtn = new swing.PictureBox();
        editBtn = new swing.PictureBox();
        BookDescription = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        BookID.setText("ID");
        BookID.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        BookName.setText("Ten sach");

        BookQuantity.setText("So luong");
        BookQuantity.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        BookAuthor.setText("TacGia");

        BookType.setText("The Loai");

        BookYear.setText("NamXB");
        BookYear.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        DropDownIcon.setImage(new javax.swing.ImageIcon(getClass().getResource("/Icon/drop-down-icon.png"))); // NOI18N
        DropDownIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DropDownIconMouseClicked(evt);
            }
        });

        deleteBtn.setImage(new javax.swing.ImageIcon(getClass().getResource("/Icon/delete.png"))); // NOI18N

        editBtn.setImage(new javax.swing.ImageIcon(getClass().getResource("/Icon/edit.png"))); // NOI18N
        editBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editBtnMouseClicked(evt);
            }
        });

        BookDescription.setBackground(new java.awt.Color(255, 255, 255));
        BookDescription.setText("Mo ta");

        javax.swing.GroupLayout ItemMenuPanelLayout = new javax.swing.GroupLayout(ItemMenuPanel);
        ItemMenuPanel.setLayout(ItemMenuPanelLayout);
        ItemMenuPanelLayout.setHorizontalGroup(
            ItemMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ItemMenuPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BookDescription, javax.swing.GroupLayout.DEFAULT_SIZE, 608, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(editBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        ItemMenuPanelLayout.setVerticalGroup(
            ItemMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ItemMenuPanelLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(ItemMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(editBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BookDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ItemMenuPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BookID, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(68, 68, 68)
                        .addComponent(BookName, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(BookAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addComponent(BookQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BookType, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(68, 68, 68)
                        .addComponent(BookYear, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(87, 87, 87)
                        .addComponent(DropDownIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(BookID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BookQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(BookType, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BookYear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BookName)
                        .addComponent(BookAuthor))
                    .addComponent(DropDownIcon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(12, 12, 12)
                .addComponent(ItemMenuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
    }// </editor-fold>//GEN-END:initComponents

//        public void fillDataTable()
//    {
//       DefaultTableModel tbModel = (DefaultTableModel) jTable1.getModel();
//        tbModel.setRowCount(0);
//        for (Sach b : sachDAO.getAll())
//        {
//            Object dataRow[] = new Object[7];
//            dataRow[0] = b.getBookId();
//           dataRow[1] = b.getNameBook();
//            dataRow[2] = b.getWriting();
//            dataRow[3] = b.getQuantity();
//            dataRow[4] = b.getType();
//            dataRow[5] = b.getYearRelease();
//            dataRow[6] = b.getDescription();
//            tbModel.addRow(dataRow);
//        }
//    }
    private void DropDownIconMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_DropDownIconMouseClicked
    {//GEN-HEADEREND:event_DropDownIconMouseClicked
        toggleCollapsibleState();
    }//GEN-LAST:event_DropDownIconMouseClicked

    private void editBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editBtnMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_editBtnMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BookAuthor;
    private javax.swing.JLabel BookDescription;
    private javax.swing.JLabel BookID;
    private javax.swing.JLabel BookName;
    private javax.swing.JLabel BookQuantity;
    private javax.swing.JLabel BookType;
    private javax.swing.JLabel BookYear;
    private swing.PictureBox DropDownIcon;
    private javax.swing.JPanel ItemMenuPanel;
    private swing.PictureBox deleteBtn;
    private swing.PictureBox editBtn;
    // End of variables declaration//GEN-END:variables
}
