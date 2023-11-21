package swing;

import databaseClass.Sach;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JList;
import javax.swing.JOptionPane;

public class BookItem extends javax.swing.JPanel
{
    private boolean selected;
    private ItemMenu itemMenu;
    public void setSelected(boolean selected)
    {
        this.selected = selected;
        repaint();
    }
    public BookItem(Sach data)
    {
        initComponents();
        setOpaque(false);
//        BookAuthor.setText(data.getMaTacGia().getTenTacGia());
//        BookID.setText(""+data.getMaSach());
//        BookName.setText(data.getTenSach());
//        BookQuantity.setText(data.getSoLuong()+"");
//        BookType.setText(data.getMaTheLoai().getTenTheLoai());
//        BookYear.setText(data.getNamXB()+"");

        itemMenu = new ItemMenu(data);
    }
    public void UpdateItemMenuPanel(JList list)
    {
        System.out.println("passthrough BookItem");
        ItemMenuPanel.add(itemMenu);
        ItemMenuPanel.validate();
        ItemMenuPanel.repaint();
        list.validate();
        list.repaint();
    }
//    @Override
//    protected void paintComponent(Graphics g)
//    {
//////        System.out.println("pressed");
////        Graphics2D g2 = (Graphics2D) g;
////        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
////        g2.setColor(new Color(0, 0, 0, 80));
////        JOptionPane.showMessageDialog(null, "Button clicked!");
////        System.out.println("repainted");
//        super.paintComponent(g);
//    }
    
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

        setBackground(new java.awt.Color(229, 229, 229));

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

        ItemMenuPanel.setOpaque(false);

        javax.swing.GroupLayout ItemMenuPanelLayout = new javax.swing.GroupLayout(ItemMenuPanel);
        ItemMenuPanel.setLayout(ItemMenuPanelLayout);
        ItemMenuPanelLayout.setHorizontalGroup(
            ItemMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        ItemMenuPanelLayout.setVerticalGroup(
            ItemMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
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
                        .addComponent(BookName, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)
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
    // End of variables declaration//GEN-END:variables
}
