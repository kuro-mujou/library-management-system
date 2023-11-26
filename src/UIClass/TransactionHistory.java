package UIClass;

import UIComponent.TransactionDetail;
import databaseClass.transactions;
import databaseClass.transactionsCRUD;
import event.TableActionEvent;
import javax.swing.table.DefaultTableModel;
import swing.ThreeFunctionActionCellRenderer;
import swing.TableActionCellEditor;

public final class TransactionHistory extends javax.swing.JPanel {

    static transactionsCRUD crud = new transactionsCRUD();

    public TransactionHistory() {

        initComponents();
        fillDataTable();
        init();
    }

    private void init() {
        TableActionEvent event = new TableActionEvent() {
            @Override
            public void onEdit(int row) {
                //code ham edit table row
                //them data vao new TransactionDetail(data go here)
                TransactionDetail transactionDetail = new TransactionDetail(true);

                transactions trans = crud.getTransactionsByID(Integer.parseInt(val_searchTrans.getText()));
                if (trans != null) {
                    System.out.println("tim dc roi");
                } else {
                    System.out.println("khong tim duoc gia tri can tim");
                }

                transactionDetail.setModel(trans);
                resetDataTable();
                fillDataTable();
                transactionDetail.setVisible(true);

            }

            @Override
            public void onDelete(int row) {
                if (TableTID.isEditing()) {
                    TableTID.getCellEditor().stopCellEditing();
                }
                DefaultTableModel model = (DefaultTableModel) TableTID.getModel();
                model.removeRow(row);
                //thieu remove data trong database
            }

            @Override
            public void onView(int row) {
                //hien thi chi tiet thong tin
                //them data vao new TransactionDetail(data go here)
                new TransactionDetail(false).setVisible(true);
            }
        };
        TableTID.getColumnModel().getColumn(6).setCellRenderer(new ThreeFunctionActionCellRenderer(TableTID.getSelectionBackground()));
        TableTID.getColumnModel().getColumn(6).setCellEditor(new TableActionCellEditor(event,TableTID.getSelectionBackground()));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        TableTID = new javax.swing.JTable();
        SearchTable = new swing.Button();
        val_searchTrans = new swing.TextField();
        jLabel1 = new javax.swing.JLabel();

        setOpaque(false);

        TableTID.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Transactions ID", "Start Day", "End Day", "Quantity", "Book ID", "Users ID", "Action"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TableTID.setRowHeight(40);
        TableTID.getTableHeader().setReorderingAllowed(false);
        TableTID.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableTIDMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TableTID);

        SearchTable.setText("Search");
        SearchTable.setColor(new java.awt.Color(255, 204, 0));
        SearchTable.setRadius(15);
        SearchTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchTableActionPerformed(evt);
            }
        });

        val_searchTrans.setLabelText("Search");
        val_searchTrans.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                val_searchTransActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/SearchIcon.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(val_searchTrans, javax.swing.GroupLayout.DEFAULT_SIZE, 811, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SearchTable, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(SearchTable, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(val_searchTrans, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 467, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void SearchTableActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_SearchTableActionPerformed
    {//GEN-HEADEREND:event_SearchTableActionPerformed
        // TODO add your handling code here:
        
        transactionsCRUD trans = new transactionsCRUD();
        int id = Integer.parseInt(val_searchTrans.getText());
        transactions transac = trans.getTransactionsByID(id);
        
        resetDataTable();
        fillOneDataTable(transac);

    }//GEN-LAST:event_SearchTableActionPerformed

    private void val_searchTransActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_val_searchTransActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_val_searchTransActionPerformed

    private void TableTIDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableTIDMouseClicked
        // TODO add your handling code here:
        resetDataTable();
        fillDataTable();
    }//GEN-LAST:event_TableTIDMouseClicked

    public void resetDataTable() {
        DefaultTableModel dm = (DefaultTableModel) TableTID.getModel();
        dm.getDataVector().removeAllElements();
        dm.fireTableDataChanged();
    }

    public void fillOneDataTable(transactions b) {
        DefaultTableModel tbModel = (DefaultTableModel) TableTID.getModel();
        tbModel.setRowCount(0);
        Object dataRow[] = new Object[7];
        dataRow[0] = b.getTransactionId();
        dataRow[1] = b.getStartDay();
        dataRow[2] = b.getEndDay();
        dataRow[3] = b.getQuantity();
        dataRow[4] = b.getBookid();
        dataRow[5] = b.getUserID();

        tbModel.addRow(dataRow);
    }

    public void fillDataTable() {
        transactionsCRUD trans = new transactionsCRUD();
        DefaultTableModel tbModel = (DefaultTableModel) TableTID.getModel();
        tbModel.setRowCount(0);
        for (transactions b : trans.getAllTransactions()) {
            Object dataRow[] = new Object[7];
            dataRow[0] = b.getTransactionId();
            dataRow[1] = b.getStartDay();
            dataRow[2] = b.getEndDay();
            dataRow[3] = b.getQuantity();
            dataRow[4] = b.getBookid();
            dataRow[5] = b.getUserID();

            tbModel.addRow(dataRow);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private swing.Button SearchTable;
    private javax.swing.JTable TableTID;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private swing.TextField val_searchTrans;
    // End of variables declaration//GEN-END:variables
}
