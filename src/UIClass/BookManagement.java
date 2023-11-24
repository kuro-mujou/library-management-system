package UIClass;

import UIComponent.BookDetail;
import databaseClass.Sach;
import event.TableActionEvent;
import javax.swing.table.DefaultTableModel;
import swing.ThreeFunctionActionCellRenderer;
import swing.TableActionCellEditor;
import databaseClass.Sach;
import databaseClass.SachCRUD;

public class BookManagement extends javax.swing.JPanel {

    SachCRUD sachDAO = new SachCRUD();
    int idSach = -1;

    public BookManagement() {
        initComponents();
        fillDataTable();
        init();
    }

    private void init() {
        TableActionEvent event = new TableActionEvent() {
            @Override
            public void onEdit(int row) {
                //code ham edit table row
                //them data vao new bookdetail(data go here)
                BookDetail update = new BookDetail(true);
               
               String baa = String.valueOf(Table.getValueAt(row, 0));

                idSach = Integer.parseInt(baa);
   
                Sach sach = sachDAO.findSachById(idSach);
                if (sach != null) {
//                    
                    System.out.println("tim dc roi");
//                  
                } else {
                    System.out.println("khong tim duoc gia tri can tim");
                }

                update.setModel(sach);
                resetDataTable();
                fillDataTable();
                update.setVisible(true);
               
            }

            @Override
            public void onDelete(int row) {
                if (Table.isEditing()) {
                    Table.getCellEditor().stopCellEditing();
                }
                DefaultTableModel model = (DefaultTableModel) Table.getModel();

                String baa = String.valueOf(Table.getValueAt(row, 0));
                idSach = Integer.parseInt(baa);
                if (sachDAO.delete(idSach) > 0) {
                    System.out.println("xoa thanh cong");
                    model.removeRow(row);
                }

                //thieu remove data trong database
            }

            @Override
            public void onView(int row) {
                //hien thi chi tiet thong tin sach
                //them data vao new bookdetail(data go here)
                BookDetail a = new BookDetail(false);
                a.setVisible(true);
                String baa = String.valueOf(Table.getValueAt(row, 0));

                idSach = Integer.parseInt(baa);
                System.out.println(">>>>>>>Id Sach" + idSach);
                Sach sach = sachDAO.findSachById(idSach);
                if (sach != null) {
                    
                    System.out.println("tim dc roi");
//                    fillOneDataTable(sach);
//                 a.resetForm();
                } else {
                    System.out.println("khong tim duoc gia tri can tim");
                }

                a.setModel(sach);
            }
        };
        Table.getColumnModel().getColumn(Table.getColumnModel().getColumnCount() - 1).setCellRenderer(new ThreeFunctionActionCellRenderer());
        Table.getColumnModel().getColumn(Table.getColumnModel().getColumnCount() - 1).setCellEditor(new TableActionCellEditor(event));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();
        AddTableItem = new swing.Button();
        SearchTable = new swing.Button();
        textFind = new swing.TextField();
        jLabel1 = new javax.swing.JLabel();
        AddTableItem1 = new swing.Button();

        setOpaque(false);

        Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Ten Sach", "Tac Gia", "So Luong", "The Loai", "NamXB", "MoTa", "Title 8"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Table.setRowHeight(40);
        Table.getTableHeader().setReorderingAllowed(false);
        Table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Table);

        AddTableItem.setText("ADD NEW BOOK");
        AddTableItem.setColor(new java.awt.Color(255, 204, 0));
        AddTableItem.setRadius(15);
        AddTableItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddTableItemActionPerformed(evt);
            }
        });

        SearchTable.setText("Search");
        SearchTable.setColor(new java.awt.Color(255, 204, 0));
        SearchTable.setRadius(15);
        SearchTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchTableActionPerformed(evt);
            }
        });

        textFind.setLabelText("Search");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/SearchIcon.png"))); // NOI18N

        AddTableItem1.setText("Reload");
        AddTableItem1.setColor(new java.awt.Color(255, 204, 0));
        AddTableItem1.setRadius(15);
        AddTableItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddTableItem1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 966, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(AddTableItem1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(AddTableItem, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
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
                    .addComponent(AddTableItem1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents
 public void fillDataTable() {
        DefaultTableModel tbModel = (DefaultTableModel) Table.getModel();
        tbModel.setRowCount(0);
        for (Sach b : sachDAO.getAll()) {
            Object dataRow[] = new Object[7];
            dataRow[0] = b.getBookId();
            dataRow[1] = b.getNameBook();
            dataRow[2] = b.getWriting();
            dataRow[3] = b.getQuantity();
            dataRow[4] = b.getType();
            dataRow[5] = b.getYearRelease();
            dataRow[6] = b.getDescription();
            tbModel.addRow(dataRow);
        }

    }

    public void fillOneDataTable(Sach b) {
        DefaultTableModel tbModel = (DefaultTableModel) Table.getModel();
        tbModel.setRowCount(0);
        Object dataRow[] = new Object[7];
        dataRow[0] = b.getBookId();
        dataRow[1] = b.getNameBook();
        dataRow[2] = b.getWriting();
        dataRow[3] = b.getQuantity();
        dataRow[4] = b.getType();
        dataRow[5] = b.getYearRelease();
        dataRow[6] = b.getDescription();
        tbModel.addRow(dataRow);
    }

    public void resetDataTable() {
        DefaultTableModel dm = (DefaultTableModel) Table.getModel();
        dm.getDataVector().removeAllElements();
        dm.fireTableDataChanged();
    }
    private void SearchTableActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_SearchTableActionPerformed
    {//GEN-HEADEREND:event_SearchTableActionPerformed
        idSach = Integer.parseInt(textFind.getText());
        System.out.println(">>>>>>>Id Sach" + idSach);
        Sach sach = sachDAO.findSachById(idSach);
        if (sach != null) {
            resetDataTable();
            System.out.println("tim dc roi");
            fillOneDataTable(sach);
//            resetForm();
        } else {
            System.out.println("khong tim duoc gia tri can tim");
        }
    }//GEN-LAST:event_SearchTableActionPerformed

    private void AddTableItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddTableItemActionPerformed
        BookDetail addbook = new BookDetail(true);
        addbook.setVisible(true);
//        fillDataTable();
    }//GEN-LAST:event_AddTableItemActionPerformed

    private void TableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableMouseClicked
        // TODO add your handling code here:
         resetDataTable();
         fillDataTable();
    }//GEN-LAST:event_TableMouseClicked

    private void AddTableItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddTableItem1ActionPerformed
        // TODO add your handling code here:
        resetDataTable();
         fillDataTable();
    }//GEN-LAST:event_AddTableItem1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private swing.Button AddTableItem;
    private swing.Button AddTableItem1;
    private swing.Button SearchTable;
    private javax.swing.JTable Table;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private swing.TextField textFind;
    // End of variables declaration//GEN-END:variables
}
