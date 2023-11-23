package swing;

import event.TableActionEvent;
import java.awt.Color;
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
        ThreeFunctionButton bookButton = new ThreeFunctionButton();
        bookButton.initEvent(event, row);
        return bookButton;
    }
}
