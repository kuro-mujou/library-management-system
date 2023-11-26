package UIClass;

import UIComponent.ReaderDetail;
import databaseClass.DocGiaCRUD;
import databaseClass.DocGia;
import databaseClass.SachCRUD;
import event.TableActionEvent;
import javax.swing.table.DefaultTableModel;
import swing.ThreeFunctionActionCellRenderer;
import swing.TableActionCellEditor;

public class ReaderManagement extends javax.swing.JPanel
{
     DocGiaCRUD docgiaDAO = new DocGiaCRUD();
    int idUser = -1;
    public ReaderManagement()
    {
        initComponents();
        fillDataTable();
        init();
    }

    private void init()
    {
        TableActionEvent event = new TableActionEvent()
        {
            @Override
            public void onEdit(int row)
            {
                //code ham edit table row
                //them data vao new bookdetail(data go here)
                ReaderDetail update= new ReaderDetail(true,false);
                update.setVisible(true);
                String baa = String.valueOf(Table.getValueAt(row, 0));

                idUser = Integer.parseInt(baa);
                
                DocGia docGia = docgiaDAO.findSachById(idUser);
                if (docGia != null) {
//                    resetDataTable();
                    System.out.println("tim dc roi");
//                  
                } else {
                    System.out.println("khong tim duoc gia tri can tim");
                }

                update.setModel(docGia);
                update.setVisible(true);
                fillDataTable();

            }

            @Override
            public void onDelete(int row)
            {
                if (Table.isEditing())
                {
                    Table.getCellEditor().stopCellEditing();
                }
                DefaultTableModel model = (DefaultTableModel) Table.getModel();
                String baa = String.valueOf(Table.getValueAt(row, 0));
                idUser = Integer.parseInt(baa);
                System.out.println("id"+idUser);
                if (docgiaDAO.delete(idUser) > 0) {
                    System.out.println("xoa thanh cong");
                    model.removeRow(row);
                }
            }

            @Override
            public void onView(int row)
            {
                //hien thi chi tiet thong tin sach
                //them data vao new bookdetail(data go here)
             ReaderDetail a=   new ReaderDetail(false,true);
                      a.setVisible(true);
                String baa = String.valueOf(Table.getValueAt(row, 0));

                idUser = Integer.parseInt(baa);
     
                DocGia docGia = docgiaDAO.findSachById(idUser);
                if (docGia!= null) {
//                    resetDataTable();
                    System.out.println("tim dc roi");
//                    fillOneDataTable(sach);
//                 a.resetForm();
                } else {
                    System.out.println("khong tim duoc gia tri can tim");
                }

                a.setModel(docGia);
            }
        };
        Table.getColumnModel().getColumn(Table.getColumnModel().getColumnCount() - 1).setCellRenderer(new ThreeFunctionActionCellRenderer());
        Table.getColumnModel().getColumn(Table.getColumnModel().getColumnCount() - 1).setCellEditor(new TableActionCellEditor(event));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jScrollPane1 = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();
        AddTableItem = new swing.Button();
        SearchTable = new swing.Button();
        textFind = new swing.TextField();
        jLabel1 = new javax.swing.JLabel();
        ReloadTable = new swing.Button();

        setOpaque(false);

        Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String []
            {
                "ID", "Ten", "DienThoai", "DiaChi", "Email", "GioiTinh", "Tuoi", "Title 8"
            }
        )
        {
            boolean[] canEdit = new boolean []
            {
                false, false, false, false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex)
            {
                return canEdit [columnIndex];
            }
        });
        Table.setRowHeight(40);
        Table.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(Table);

        AddTableItem.setText("ADD NEW READER");
        AddTableItem.setColor(new java.awt.Color(255, 204, 0));
        AddTableItem.setRadius(15);
        AddTableItem.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                AddTableItemActionPerformed(evt);
            }
        });

        SearchTable.setText("Search");
        SearchTable.setColor(new java.awt.Color(255, 204, 0));
        SearchTable.setRadius(15);
        SearchTable.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                SearchTableActionPerformed(evt);
            }
        });

        textFind.setLabelText("Search");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/SearchIcon.png"))); // NOI18N

        ReloadTable.setText("RELOAD");
        ReloadTable.setColor(new java.awt.Color(255, 204, 0));
        ReloadTable.setRadius(15);
        ReloadTable.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                ReloadTableActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 966, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ReloadTable, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(AddTableItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textFind, javax.swing.GroupLayout.DEFAULT_SIZE, 823, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SearchTable, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(textFind, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(SearchTable, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 448, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddTableItem, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ReloadTable, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents
public void fillDataTable() {
        DefaultTableModel tbModel = (DefaultTableModel) Table.getModel();
        tbModel.setRowCount(0);
        for (DocGia b : docgiaDAO.getAll()) {
            Object dataRow[] = new Object[7];
            dataRow[0] = b.getUserID();
            dataRow[1] = b.getName();
            dataRow[2] = b.getPhone();
            dataRow[3] = b.getAdrress();
            dataRow[4] = b.getEmail();
            dataRow[5] = b.getGender();
            dataRow[6] = b.getAge();
            tbModel.addRow(dataRow);
        }

    }
   public void fillOneDataTable(DocGia b) {
        DefaultTableModel tbModel = (DefaultTableModel) Table.getModel();
        tbModel.setRowCount(0);
        Object dataRow[] = new Object[7];
        dataRow[0] = b.getUserID();
            dataRow[1] = b.getName();
            dataRow[2] = b.getPhone();
            dataRow[3] = b.getAdrress();
            dataRow[4] = b.getEmail();
            dataRow[5] = b.getGender();
            dataRow[6] = b.getAge();
        tbModel.addRow(dataRow);
    }
    public void resetDataTable() {
        DefaultTableModel dm = (DefaultTableModel) Table.getModel();
        dm.getDataVector().removeAllElements();
        dm.fireTableDataChanged();
    }
    private void AddTableItemActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_AddTableItemActionPerformed
    {//GEN-HEADEREND:event_AddTableItemActionPerformed
        new ReaderDetail(true,false).setVisible(true);
        fillDataTable();
    }//GEN-LAST:event_AddTableItemActionPerformed

    private void SearchTableActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_SearchTableActionPerformed
    {//GEN-HEADEREND:event_SearchTableActionPerformed
        // TODO add your handling code here:
        idUser = Integer.parseInt(textFind.getText());
        System.out.println(">>>>>>>Id Sach" + idUser);
        DocGia docGia = docgiaDAO.findSachById(idUser);
        if (docGia != null) {
            resetDataTable();
            System.out.println("tim dc roi");
            fillOneDataTable(docGia);
//            resetForm();
        } else {
            System.out.println("khong tim duoc gia tri can tim");
        }
    }//GEN-LAST:event_SearchTableActionPerformed

    private void ReloadTableActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_ReloadTableActionPerformed
    {//GEN-HEADEREND:event_ReloadTableActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ReloadTableActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private swing.Button AddTableItem;
    private swing.Button ReloadTable;
    private swing.Button SearchTable;
    private javax.swing.JTable Table;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private swing.TextField textFind;
    // End of variables declaration//GEN-END:variables
}
