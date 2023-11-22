package UIClass;

import UIComponent.ReaderDetail;
import databaseClass.Sach;
import event.TableActionEvent;
import javax.swing.BoxLayout;
import javax.swing.table.DefaultTableModel;
import swing.BookItem;
import swing.ScrollBarCustom;
import swing.BookTableActionCellRenderer;
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
                new ReaderDetail(true).setVisible(true);
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
                new ReaderDetail(false).setVisible(true);
            }
        };
        Table.getColumnModel().getColumn(6).setCellRenderer(new BookTableActionCellRenderer());
        Table.getColumnModel().getColumn(6).setCellEditor(new TableActionCellEditor(event));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jScrollPane1 = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 966, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 519, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Table;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
