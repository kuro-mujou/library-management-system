/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import databaseClass.NhaXuatBan;
import databaseClass.NhaXuatBanCRUD;
import databaseClass.Sach;
import databaseClass.TacGia;
import databaseClass.TacGiaCRUD;
import databaseClass.TheLoai;
import databaseClass.TheLoaiCRUD;
import databaseClass.SachCRUD;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ADMIN
 */
public class FormQuanLySach extends javax.swing.JFrame {

    /**
     * Creates new form FormQuanLySach
     */
    SachCRUD sachDAO = new SachCRUD();
    NhaXuatBanCRUD NXBDAO = new NhaXuatBanCRUD();
    TacGiaCRUD tacgiaDAO = new TacGiaCRUD();
    TheLoaiCRUD theloaiDAO = new TheLoaiCRUD();
    int idSach = -1;
    public FormQuanLySach() {
        initComponents();
        fillDataTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LableQuanLySach = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        labelMaNXB = new javax.swing.JLabel();
        labelMaTacGia = new javax.swing.JLabel();
        labelMaTheLoai = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        textMaSach = new javax.swing.JTextField();
        textTenSach = new javax.swing.JTextField();
        textMaNXB = new javax.swing.JTextField();
        textMaTacGia = new javax.swing.JTextField();
        textMaTheLoai = new javax.swing.JTextField();
        textNamXB = new javax.swing.JTextField();
        btnFInd = new javax.swing.JButton();
        BtnAdd = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        textSoLuong = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        LableQuanLySach.setText("QuanLySach");

        jLabel2.setText("Ma Sach");

        jLabel3.setText("TenSach");

        labelMaNXB.setText("TenNXB");

        labelMaTacGia.setText("TenTacGia");

        labelMaTheLoai.setText("TenTheLoai");

        jLabel7.setText("NamXB");

        textMaSach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textMaSachActionPerformed(evt);
            }
        });

        textTenSach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textTenSachActionPerformed(evt);
            }
        });

        textMaNXB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textMaNXBActionPerformed(evt);
            }
        });

        textMaTacGia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textMaTacGiaActionPerformed(evt);
            }
        });

        textNamXB.setText("2023");

        btnFInd.setText("Find");
        btnFInd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFIndActionPerformed(evt);
            }
        });

        BtnAdd.setText("Add");
        BtnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAddActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
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

        textSoLuong.setText("1");
        textSoLuong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textSoLuongActionPerformed(evt);
            }
        });

        jLabel1.setText("SoLuong");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 486, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
            .addGroup(layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(LableQuanLySach, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(labelMaTacGia)
                            .addComponent(labelMaTheLoai)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel1)
                                .addComponent(jLabel7))
                            .addComponent(labelMaNXB))
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(textMaTheLoai, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnUpdate))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(textSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnSave))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(textMaTacGia, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(textMaSach)
                                                .addComponent(textTenSach, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnFInd, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(BtnAdd, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(btnDelete, javax.swing.GroupLayout.Alignment.TRAILING))))
                                .addGap(42, 42, 42))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(textNamXB, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(textMaNXB, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LableQuanLySach)
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(textMaSach, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnFInd))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(BtnAdd)
                                    .addComponent(textTenSach, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnDelete)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(textMaTacGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(labelMaTacGia))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(jLabel3)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(btnUpdate))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(textMaTheLoai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelMaTheLoai))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(labelMaNXB)))
                        .addGap(7, 7, 7))
                    .addComponent(textMaNXB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(textSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(textNamXB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(btnSave)
                        .addGap(22, 22, 22)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
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
    private void textMaSachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textMaSachActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textMaSachActionPerformed

    private void textMaNXBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textMaNXBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textMaNXBActionPerformed

    private void textTenSachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textTenSachActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textTenSachActionPerformed

    private void textMaTacGiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textMaTacGiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textMaTacGiaActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        try {
            Sach sach = getModel();
            if(sachDAO.update(sach)>0)
            {
     
                fillDataTable();
                resetForm();
            }
            else System.out.println("chua updata dc");
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        try {
            Sach sach = getModelId();
            if(sachDAO.add(sach)>0)
            {
                fillDataTable();
            }
            else System.out.println("them khogn thanh con");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_btnSaveActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
//        if(evt.getClickCount()==2)
//        {
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
//        }   
    }//GEN-LAST:event_jTable1MouseClicked

    private void BtnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAddActionPerformed
        // TODO add your handling code here:
        resetForm();
        labelMaNXB.setText("MaNXB");
        labelMaTacGia.setText("MaTacGia");
        labelMaTheLoai.setText("MaTheLoai");
    }//GEN-LAST:event_BtnAddActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
//        int position = jTable1.rowAtPoint(evt.getPoint());
//        idSach = Integer.parseInt(jTable1.getValueAt(position,0).toString());
//        Sach sach = sachDAO.findSachById(idSach);
            Sach sach = getModel();
            if(sachDAO.delete(sach)>0 )
            {
                fillDataTable();
                resetForm();
            }
        
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void textSoLuongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textSoLuongActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textSoLuongActionPerformed

    private void btnFIndActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFIndActionPerformed
        // TODO add your handling code here:
   
//        textMaSach.setEnabled(false);
//        int position = jTable1.rowAtPoint(evt.getPoint());
        idSach = Integer.parseInt(textMaSach.getText());
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
    }//GEN-LAST:event_btnFIndActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(FormQuanLySach.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(FormQuanLySach.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(FormQuanLySach.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(FormQuanLySach.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new FormQuanLySach().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAdd;
    private javax.swing.JLabel LableQuanLySach;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnFInd;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    javax.swing.JLabel labelMaNXB;
    private javax.swing.JLabel labelMaTacGia;
    private javax.swing.JLabel labelMaTheLoai;
    private javax.swing.JTextField textMaNXB;
    private javax.swing.JTextField textMaSach;
    private javax.swing.JTextField textMaTacGia;
    private javax.swing.JTextField textMaTheLoai;
    private javax.swing.JTextField textNamXB;
    private javax.swing.JTextField textSoLuong;
    private javax.swing.JTextField textTenSach;
    // End of variables declaration//GEN-END:variables
}
