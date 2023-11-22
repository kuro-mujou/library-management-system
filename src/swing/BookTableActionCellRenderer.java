
package swing;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

public class BookTableActionCellRenderer extends DefaultTableCellRenderer
{
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column)
    {
        
        Component com = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        BookButton bookButton = new BookButton();
        if(isSelected == false && row % 2 == 0)
        {
            bookButton.setBackground(Color.WHITE);
        }
        else
        {
            bookButton.setBackground(com.getBackground());
        }
        return bookButton;
    }
    
}
