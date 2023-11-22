
package swing;

import UIComponent.BookButton;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

public class TableActionCellRenderer extends DefaultTableCellRenderer
{
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column)
    {
        
        Component com = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        BookButton bookButton = new BookButton();
        return bookButton;
    }
    
}
