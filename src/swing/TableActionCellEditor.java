package swing;

import event.TableActionEvent;
import java.awt.Component;
import javax.swing.DefaultCellEditor;
import javax.swing.JCheckBox;
import javax.swing.JTable;

public class TableActionCellEditor extends DefaultCellEditor
{
    private TableActionEvent event;
    
    public TableActionCellEditor(TableActionEvent event)
    {
        super(new JCheckBox());
        this.event = event;
    }
    
    @Override
    public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column)
    {
        BookButton button = new BookButton();
        button.initEvent(event, row);
        button.setBackground(table.getSelectionBackground());
        return button;
    }
}
