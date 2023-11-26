package UIComponent;

import UIClass.BookManagement;
import databaseClass.Sach;
import databaseClass.SachCRUD;
import javax.swing.table.DefaultTableModel;

public class BookDetail extends javax.swing.JFrame
{

    SachCRUD sachDAO = new SachCRUD();
    int idSach = -1;
    private boolean isEditRequest;
    private BookManagement bm;

    //them data vao new bookdetail(data go here)
    public BookDetail(boolean request, BookManagement bm)
    {
        this.isEditRequest = request;
        this.bm = bm;
        initComponents();
        initUI();
    }

    private void initUI()
    {
        confirm.setVisible(isEditRequest);
        textMaSach.setEditable(isEditRequest);
        textTenSach.setEditable(isEditRequest);
        textTheLoai.setEditable(isEditRequest);
        textTacGia.setEditable(isEditRequest);
        textSoLuong.setEditable(isEditRequest);
        textNamXuatBan.setEditable(isEditRequest);
        textGhiChu.setEditable(isEditRequest);
        revalidate();
        repaint();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        textTenSach = new javax.swing.JTextField();
        textMaSach = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        textNamXuatBan = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        textGhiChu = new javax.swing.JTextField();
        confirm = new swing.Button();
        textTacGia = new javax.swing.JTextField();
        textSoLuong = new javax.swing.JTextField();
        textTheLoai = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Poppins", 1, 30)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Book Infomation");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        textTenSach.setEditable(false);
        textTenSach.setBorder(null);

        textMaSach.setEditable(false);
        textMaSach.setBorder(null);

        jLabel6.setFont(new java.awt.Font("Poppins", 0, 20)); // NOI18N
        jLabel6.setText("NamXB");

        textNamXuatBan.setEditable(false);
        textNamXuatBan.setBorder(null);

        jLabel3.setFont(new java.awt.Font("Poppins", 0, 20)); // NOI18N
        jLabel3.setText("TenSach");

        jLabel5.setFont(new java.awt.Font("Poppins", 0, 20)); // NOI18N
        jLabel5.setText("TheLoai");

        jLabel7.setFont(new java.awt.Font("Poppins", 0, 20)); // NOI18N
        jLabel7.setText("SoLuong");

        jLabel2.setFont(new java.awt.Font("Poppins", 0, 20)); // NOI18N
        jLabel2.setText("Book ID");

        jLabel4.setFont(new java.awt.Font("Poppins", 0, 20)); // NOI18N
        jLabel4.setText("TacGia");

        jLabel8.setFont(new java.awt.Font("Poppins", 0, 20)); // NOI18N
        jLabel8.setText("Description");

        textGhiChu.setEditable(false);
        textGhiChu.setBorder(null);

        confirm.setBackground(new java.awt.Color(204, 204, 0));
        confirm.setText("Confirm");
        confirm.setColor(new java.awt.Color(204, 204, 0));
        confirm.setRadius(20);
        confirm.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                confirmActionPerformed(evt);
            }
        });

        textTacGia.setEditable(false);
        textTacGia.setBorder(null);

        textSoLuong.setEditable(false);
        textSoLuong.setBorder(null);

        textTheLoai.setEditable(false);
        textTheLoai.setBorder(null);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(textTenSach, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textMaSach)
                            .addComponent(textNamXuatBan)
                            .addComponent(textTacGia)
                            .addComponent(textSoLuong)
                            .addComponent(textTheLoai)))
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 482, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textGhiChu))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(confirm, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textMaSach, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textTenSach, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(textTacGia, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textTheLoai, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textNamXuatBan, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textGhiChu, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(confirm, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
  public Sach getModel()
    {
        Sach b = new Sach();
        b.setBookId(Integer.parseInt(textMaSach.getText()));
        b.setNameBook(textTenSach.getText());
        b.setDescription(textGhiChu.getText());
        b.setWriting(textTacGia.getText());
        b.setType(textTheLoai.getText());
        b.setQuantity(Integer.parseInt(textSoLuong.getText()));
        b.setYearRelease(Integer.parseInt(textNamXuatBan.getText()));
        return b;
    }

    public String gettest()
    {
        return textGhiChu.getText();
    }

    public void settest()
    {
        textGhiChu.setText("cmm");
    }

    public Sach getModelId()
    {
        Sach b = new Sach();
        b.setBookId(Integer.parseInt(textMaSach.getText()));
        System.out.println("s" + b.getBookId());
        b.setNameBook(textTenSach.getText());
        b.setDescription(textGhiChu.getText());
        b.setWriting(textTacGia.getText());
        b.setType(textTheLoai.getText());
        b.setQuantity(Integer.parseInt(textSoLuong.getText()));
        b.setYearRelease(Integer.parseInt(textNamXuatBan.getText()));
        return b;
    }

    public void setModel(Sach b)
    {
        textMaSach.setText(String.valueOf(b.getBookId()));
        textTenSach.setText(b.getNameBook());
        textGhiChu.setText(b.getDescription());
        textNamXuatBan.setText(String.valueOf(b.getYearRelease()));
        textSoLuong.setText(String.valueOf(b.getQuantity()));
        textTacGia.setText(b.getWriting());
        textTheLoai.setText(b.getType());
    }
    private void confirmActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_confirmActionPerformed
    {//GEN-HEADEREND:event_confirmActionPerformed
        try
        {
            Sach sach = getModelId();

            Sach sachtim = sachDAO.findSachById(sach.getBookId());
            if (sachtim == null)
            {
                if (sachDAO.add(sach) > 0)
                {
                }
            } else
            {
                if (sachDAO.update(sach) > 0)
                {
                }
            }
            bm.resetDataTable();
            bm.fillDataTable();

        } catch (Exception e)
        {
            e.printStackTrace();
        }
        this.dispose();
    }//GEN-LAST:event_confirmActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private swing.Button confirm;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField textGhiChu;
    private javax.swing.JTextField textMaSach;
    private javax.swing.JTextField textNamXuatBan;
    private javax.swing.JTextField textSoLuong;
    private javax.swing.JTextField textTacGia;
    private javax.swing.JTextField textTenSach;
    private javax.swing.JTextField textTheLoai;
    // End of variables declaration//GEN-END:variables
}
