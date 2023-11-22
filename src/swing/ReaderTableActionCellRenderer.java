
package swing;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

public class ReaderTableActionCellRenderer extends DefaultTableCellRenderer
{
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column)
    {
        
        Component com = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        ReaderButton readerButton = new ReaderButton();
        if(isSelected == false && row % 2 == 0)
        {
            readerButton.setBackground(Color.WHITE);
        }
        else
        {
            readerButton.setBackground(com.getBackground());
        }
        return readerButton;
    }
    
}
