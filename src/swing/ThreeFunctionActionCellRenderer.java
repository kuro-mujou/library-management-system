package swing;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableCellRenderer;

public class ThreeFunctionActionCellRenderer extends DefaultTableCellRenderer
{
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column)
    {
        
        Component com = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
//        setBorder(new LineBorder(new Color(217, 181, 68, 100), 1));
        ThreeFunctionButton bookButton = new ThreeFunctionButton();
        
        if (isSelected == true)
        {
//            bookButton.setBackground(Color.WHITE);
            if (row % 2 == 0)
            {
                bookButton.setBackground(new Color(179, 222, 252));
            } else
            {
                bookButton.setBackground(new Color(163, 217, 255));
            }
        } else
        {
//            bookButton.setBackground(com.getBackground());
            if (row % 2 == 0)
            {
                bookButton.setBackground(new Color(255, 255, 255));
            } else
            {
                bookButton.setBackground(new Color(245, 245, 245));
            }
        }
        return bookButton;
    }

}
