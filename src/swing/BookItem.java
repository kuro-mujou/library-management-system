package swing;

import databaseClass.Sach;
import java.awt.BorderLayout;
import javax.swing.JPanel;

public class BookItem extends javax.swing.JPanel
{
    public BookItem(Sach data)
    {
        initComponents();
        
//        BookAuthor.setText(data.getMaTacGia().getTenTacGia());
//        BookID.setText(""+data.getMaSach());
//        BookName.setText(data.getTenSach());
//        BookQuantity.setText(data.getSoLuong()+"");
//        BookType.setText(data.getMaTheLoai().getTenTheLoai());
//        BookYear.setText(data.getNamXB()+"");
//        itemMenu = new ItemMenu(data);
        init();
    }
    private void init()
    {
        setOpaque(false);
//        ItemMenuPanel.add(itemMenu);
        ItemMenuPanel.setVisible(false);
    }
    public void setContent(JPanel content)
    {
        
//        DropDownIcon.setSelected(false);
    }

    private void toggleCollapsibleState()
    {
        // Toggle the visibility of the content panel when the button is clicked
        ItemMenuPanel.setVisible(!ItemMenuPanel.isVisible());
        revalidate();
        repaint();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

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
        descriptionText = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

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
        DropDownIcon.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                DropDownIconMouseClicked(evt);
            }
        });

        deleteBtn.setImage(new javax.swing.ImageIcon(getClass().getResource("/Icon/delete.png"))); // NOI18N

        editBtn.setImage(new javax.swing.ImageIcon(getClass().getResource("/Icon/edit.png"))); // NOI18N

        descriptionText.setBackground(new java.awt.Color(255, 255, 255));
        descriptionText.setText("Mo ta");

        javax.swing.GroupLayout ItemMenuPanelLayout = new javax.swing.GroupLayout(ItemMenuPanel);
        ItemMenuPanel.setLayout(ItemMenuPanelLayout);
        ItemMenuPanelLayout.setHorizontalGroup(
            ItemMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ItemMenuPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(descriptionText, javax.swing.GroupLayout.DEFAULT_SIZE, 619, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(editBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        ItemMenuPanelLayout.setVerticalGroup(
            ItemMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ItemMenuPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ItemMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(editBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(descriptionText, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BookName, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BookQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BookAuthor, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BookType, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BookYear, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DropDownIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BookID, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(BookName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BookQuantity, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BookAuthor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BookType, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BookYear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(DropDownIcon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ItemMenuPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void DropDownIconMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_DropDownIconMouseClicked
    {//GEN-HEADEREND:event_DropDownIconMouseClicked
        System.out.println("icon");
        toggleCollapsibleState();
    }//GEN-LAST:event_DropDownIconMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BookAuthor;
    private javax.swing.JLabel BookID;
    private javax.swing.JLabel BookName;
    private javax.swing.JLabel BookQuantity;
    private javax.swing.JLabel BookType;
    private javax.swing.JLabel BookYear;
    private swing.PictureBox DropDownIcon;
    private javax.swing.JPanel ItemMenuPanel;
    private swing.PictureBox deleteBtn;
    private javax.swing.JLabel descriptionText;
    private swing.PictureBox editBtn;
    // End of variables declaration//GEN-END:variables
}
