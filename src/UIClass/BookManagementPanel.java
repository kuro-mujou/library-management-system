
package UIClass;

import databaseClass.NhaXuatBan;
import databaseClass.NhaXuatBanCRUD;
import databaseClass.Sach;
import databaseClass.TacGia;
import databaseClass.TacGiaCRUD;
import databaseClass.TheLoai;
import databaseClass.TheLoaiCRUD;
import databaseClass.sachCRUD;
import javax.swing.table.DefaultTableModel;

public class BookManagementPanel extends javax.swing.JPanel 
{
    sachCRUD sachDAO = new sachCRUD();
    NhaXuatBanCRUD NXBDAO = new NhaXuatBanCRUD();
    TacGiaCRUD tacgiaDAO = new TacGiaCRUD();
    TheLoaiCRUD theloaiDAO = new TheLoaiCRUD();
    int idSach = -1;
    MainInterface main;
    public BookManagementPanel(MainInterface main) 
    {
        initComponents();
        this.main = main;
        fillDataTable();
        initComponents();
    }
     public BookManagementPanel() 
    {
        initComponents();
        fillDataTable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        text_find = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        textMaSach = new javax.swing.JTextField();
        textTenSach = new javax.swing.JTextField();
        textMaTacGia = new javax.swing.JTextField();
        textMaNXB = new javax.swing.JTextField();
        textNamXB = new javax.swing.JTextField();
        textMaTheLoai = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        textSoLuong = new javax.swing.JTextField();
        btn_Find = new swing.Button();
        btn_Save = new swing.Button();
        btn_Add = new swing.Button();
        btn_Delete = new swing.Button();
        btn_Update = new swing.Button();
        btn_All = new swing.Button();

        setOpaque(false);

        jLabel1.setFont(new java.awt.Font("Poppins", 1, 30)); // NOI18N
        jLabel1.setText("Book Infomation");

        jLabel2.setFont(new java.awt.Font("Poppins", 0, 20)); // NOI18N
        jLabel2.setText("Book ID");

        jLabel3.setFont(new java.awt.Font("Poppins", 0, 20)); // NOI18N
        jLabel3.setText("Book Title");

        jLabel4.setFont(new java.awt.Font("Poppins", 0, 20)); // NOI18N
        jLabel4.setText("Author's name");

        jLabel5.setFont(new java.awt.Font("Poppins", 0, 20)); // NOI18N
        jLabel5.setText("Publisher");

        jLabel6.setFont(new java.awt.Font("Poppins", 0, 20)); // NOI18N
        jLabel6.setText("Publication year");

        jLabel7.setFont(new java.awt.Font("Poppins", 0, 20)); // NOI18N
        jLabel7.setText("Category");

        text_find.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_findActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "MaSach", "TenSach", "MaTacGia", "MaTheLoai", "MaNXB", "SoLuong", "NamXB"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        textMaNXB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textMaNXBActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Poppins", 0, 20)); // NOI18N
        jLabel8.setText("Quantity");

        btn_Find.setText("FIND");
        btn_Find.setRadius(15);
        btn_Find.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_FindMouseClicked(evt);
            }
        });

        btn_Save.setText("SAVE");
        btn_Save.setRadius(15);
        btn_Save.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_SaveMouseClicked(evt);
            }
        });

        btn_Add.setText("ADD");
        btn_Add.setRadius(15);
        btn_Add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_AddMouseClicked(evt);
            }
        });

        btn_Delete.setLabel("DELETE");
        btn_Delete.setRadius(15);
        btn_Delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_DeleteMouseClicked(evt);
            }
        });

        btn_Update.setText("UPDATE");
        btn_Update.setRadius(15);
        btn_Update.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_UpdateMouseClicked(evt);
            }
        });

        btn_All.setText("ALL");
        btn_All.setRadius(15);
        btn_All.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_AllMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 730, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textNamXB, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textMaSach, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textTenSach, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textMaTacGia, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textMaTheLoai, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textMaNXB, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(50, 50, 50)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btn_Find, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(42, 42, 42)
                                        .addComponent(text_find, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(btn_Add, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_Save, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_Update, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_All, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(136, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textMaSach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(text_find, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Find, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textTenSach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Save, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textMaTacGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Add, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textMaTheLoai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textMaNXB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Update, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(textSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_All, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textNamXB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6))
        );
    }// </editor-fold>//GEN-END:initComponents

    
    public void resetForm()
    {
        textMaSach.setText("");
        textTenSach.setText("");
        textMaNXB.setText("");
        textMaTheLoai.setText("");
        textNamXB.setText("");
        textMaTacGia.setText("");
        textSoLuong.setText("");
        textMaSach.setEnabled(true);
        textMaNXB.setEnabled(true);
        textMaTacGia.setEnabled(true);
        textMaTheLoai.setEnabled(true);
    }
    public void fillDataTable()
    {
        DefaultTableModel tbModel = (DefaultTableModel)jTable1.getModel();
        tbModel.setRowCount(0);
        for(Sach b: sachDAO.getAll())
        {
            Object  dataRow[] = new Object[7];
            dataRow[0]= b.getMaSach();
            dataRow[1]= b.getTenSach();
            dataRow[2]= b.getMaTacGia().getTenTacGia();
            dataRow[3]= b.getMaTheLoai().getTenTheLoai();
            dataRow[4]= b.getMaNXB().getTenNXB();
            dataRow[5]= b.getSoLuong();
            dataRow[6]= b.getNamXB();
            tbModel.addRow(dataRow);
        }
      
    }
    public void resetDataTable()
    {
        DefaultTableModel dm = (DefaultTableModel)jTable1.getModel();
        dm.getDataVector().removeAllElements();
        dm.fireTableDataChanged();
    }
    public void fillOneDataTable(Sach b)
    {
          DefaultTableModel tbModel = (DefaultTableModel)jTable1.getModel();
        tbModel.setRowCount(0);
        Object  dataRow[] = new Object[7];
            dataRow[0]= b.getMaSach();
            dataRow[1]= b.getTenSach();
            dataRow[2]= b.getMaTacGia().getTenTacGia();
            dataRow[3]= b.getMaTheLoai().getTenTheLoai();
            dataRow[4]= b.getMaNXB().getTenNXB();
            dataRow[5]= b.getSoLuong();
            dataRow[6]= b.getNamXB();
              tbModel.addRow(dataRow);
    }
    public Sach getModel()
    {
             Sach b = new Sach();
        b.setMaSach(Integer.parseInt(textMaSach.getText()));
        b.setTenSach(textTenSach.getText());
        NhaXuatBan nxb = NXBDAO.findNhaXuatBanByName(textMaNXB.getText());
        b.setMaNXB(nxb);
        TacGia tacgia = tacgiaDAO.findTacGiaByName(textMaTacGia.getText());
        b.setMaTacGia(tacgia);
        TheLoai theloai = theloaiDAO.findTheLoaiByName(textMaTheLoai.getText());
        b.setMaTheLoai(theloai);
        b.setSoLuong(Integer.parseInt(textSoLuong.getText()));
        b.setNamXB(Integer.parseInt(textNamXB.getText()));
        return b;
    }
    public Sach getModelId()
    {
        Sach b = new Sach();
        b.setMaSach(Integer.parseInt(textMaSach.getText()));
        b.setTenSach(textTenSach.getText());
        NhaXuatBan nxb = NXBDAO.findNhaXuatBanById(Integer.parseInt(textMaNXB.getText()));
        b.setMaNXB(nxb);
        TacGia tacgia = tacgiaDAO.findTacGiaById(Integer.parseInt(textMaTacGia.getText()));
        b.setMaTacGia(tacgia);
        TheLoai theloai = theloaiDAO.findTheLoaiById(Integer.parseInt(textMaTheLoai.getText()));
        b.setMaTheLoai(theloai);
        b.setSoLuong(Integer.parseInt(textSoLuong.getText()));
        b.setNamXB(Integer.parseInt(textNamXB.getText()));
        return b;
    }
    public void setModel(Sach b)         
    {
        textMaSach.setText(String.valueOf(b.getMaSach()));
        textTenSach.setText(b.getTenSach());
        textMaNXB.setText(b.getMaNXB().getTenNXB());
        textNamXB.setText(String.valueOf(b.getNamXB()));
        textSoLuong.setText(String.valueOf(b.getSoLuong()));
        textMaTacGia.setText( b.getMaTacGia().getTenTacGia());
        textMaTheLoai.setText(b.getMaTheLoai().getTenTheLoai());
    }   
    private void textMaNXBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textMaNXBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textMaNXBActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
         textMaSach.setEnabled(false);
           textMaNXB.setEnabled(false);
            textMaTacGia.setEnabled(false);
            textMaTheLoai.setEnabled(false);
            int position = jTable1.rowAtPoint(evt.getPoint());
            idSach = Integer.parseInt(jTable1.getValueAt(position,0).toString());
            Sach sach = sachDAO.findSachById(idSach);
            if(sach !=null)
            {
                setModel(sach);
            }
    }//GEN-LAST:event_jTable1MouseClicked

    private void text_findActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_findActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_findActionPerformed

    private void btn_FindMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_FindMouseClicked
        idSach = Integer.parseInt(text_find.getText());
        System.out.println(">>>>>>>Id Sach"+idSach);
        Sach sach = sachDAO.findSachById(idSach);
        if(sach !=null)
        {
            resetDataTable();
            System.out.println("tim dc roi");
            fillOneDataTable(sach);
            resetForm();
        }
        else System.out.println("khong tim duoc gia tri can tim");
    }//GEN-LAST:event_btn_FindMouseClicked

    private void btn_SaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_SaveMouseClicked
        try {
            Sach sach = getModelId();
            if(sachDAO.add(sach)>0)
            {
                System.out.println("them thanh cong ");
                fillDataTable();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btn_SaveMouseClicked

    private void btn_AddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_AddMouseClicked
        resetForm();
    }//GEN-LAST:event_btn_AddMouseClicked

    private void btn_DeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_DeleteMouseClicked
        Sach sach = getModel();
        if(sachDAO.delete(sach)>0 )
        {
            System.out.println("xoa thanh cong");
            fillDataTable();
            resetForm();
        }
    }//GEN-LAST:event_btn_DeleteMouseClicked

    private void btn_UpdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_UpdateMouseClicked
        try {
            Sach sach = getModel();
            if(sachDAO.update(sach)>0)
            {
                System.out.println("update xong");
                fillDataTable();
                resetForm();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btn_UpdateMouseClicked

    private void btn_AllMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_AllMouseClicked
        resetDataTable();
        fillDataTable();
    }//GEN-LAST:event_btn_AllMouseClicked
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
//                new FormQuanLySach().setVisible(true);
                new BookManagementPanel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private swing.Button btn_Add;
    private swing.Button btn_All;
    private swing.Button btn_Delete;
    private swing.Button btn_Find;
    private swing.Button btn_Save;
    private swing.Button btn_Update;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField textMaNXB;
    private javax.swing.JTextField textMaSach;
    private javax.swing.JTextField textMaTacGia;
    private javax.swing.JTextField textMaTheLoai;
    private javax.swing.JTextField textNamXB;
    private javax.swing.JTextField textSoLuong;
    private javax.swing.JTextField textTenSach;
    private javax.swing.JTextField text_find;
    // End of variables declaration//GEN-END:variables
}
