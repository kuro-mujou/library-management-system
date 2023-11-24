package UIClass;

import UIComponent.ReaderDetail;
import event.TableActionEvent;
import javax.swing.table.DefaultTableModel;
import swing.ThreeFunctionActionCellRenderer;
import swing.TableActionCellEditor;

public class ReaderManagement extends javax.swing.JPanel
{
    public ReaderManagement()
    {
        initComponents();
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
                new ReaderDetail(true,true).setVisible(true);
            }

            @Override
            public void onDelete(int row)
            {
                if (Table.isEditing())
                {
                    Table.getCellEditor().stopCellEditing();
                }
                DefaultTableModel model = (DefaultTableModel) Table.getModel();
                model.removeRow(row);
                //thieu remove data trong database
            }

            @Override
            public void onView(int row)
            {
                //hien thi chi tiet thong tin sach
                //them data vao new bookdetail(data go here)
                new ReaderDetail(false,true).setVisible(true);
            }
        };
        Table.getColumnModel().getColumn(6).setCellRenderer(new ThreeFunctionActionCellRenderer());
        Table.getColumnModel().getColumn(6).setCellEditor(new TableActionCellEditor(event));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jScrollPane1 = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();
        AddTableItem = new swing.Button();
        SearchTable = new swing.Button();
        textField1 = new swing.TextField();
        jLabel1 = new javax.swing.JLabel();

        setOpaque(false);

        Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String []
            {
                "ID", "Book name", "Title 3", "Title 4", "null", "null", "Action"
            }
        )
        {
            boolean[] canEdit = new boolean []
            {
                false, false, false, false, false, false, true
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

        textField1.setLabelText("Search");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/SearchIcon.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 966, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(AddTableItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textField1, javax.swing.GroupLayout.DEFAULT_SIZE, 823, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SearchTable, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(textField1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(SearchTable, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 448, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AddTableItem, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void AddTableItemActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_AddTableItemActionPerformed
    {//GEN-HEADEREND:event_AddTableItemActionPerformed
        new ReaderDetail(true,false).setVisible(true);
    }//GEN-LAST:event_AddTableItemActionPerformed

    private void SearchTableActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_SearchTableActionPerformed
    {//GEN-HEADEREND:event_SearchTableActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SearchTableActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private swing.Button AddTableItem;
    private swing.Button SearchTable;
    private javax.swing.JTable Table;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private swing.TextField textField1;
    // End of variables declaration//GEN-END:variables
}
