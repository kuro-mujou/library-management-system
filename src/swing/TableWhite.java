package swing;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.HashMap;
import java.util.Map;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableCellRenderer;

public class TableWhite extends JTable
{

    private TableHeader header;
    private TableCell cell;
    private Color colorSelection1;
    private Color colorSelection2;

    public Color getColorSelection1()
    {
        return colorSelection1;
    }

    public void setColorSelection1(Color colorSelection1)
    {
        this.colorSelection1 = colorSelection1;
    }

    public Color getColorSelection2()
    {
        return colorSelection2;
    }

    public void setColorSelection2(Color colorSelection2)
    {
        this.colorSelection2 = colorSelection2;
    }
    public TableWhite()
    {
        header = new TableHeader();
        cell = new TableCell();
        colorSelection1 = new Color(179, 222, 252);
        colorSelection2 = new Color(163, 217, 255);
        getTableHeader().setDefaultRenderer(header);
        getTableHeader().setPreferredSize(new Dimension(0, 35));
        setDefaultRenderer(Object.class, cell);
        setRowHeight(30);
    }

    public void setColumnAlignment(int column, int align)
    {
        header.setAlignment(column, align);
    }

    public void setCellAlignment(int column, int align)
    {
        cell.setAlignment(column, align);
    }

    public void setColumnWidth(int column, int width)
    {
        getColumnModel().getColumn(column).setPreferredWidth(width);
        getColumnModel().getColumn(column).setMinWidth(width);
        getColumnModel().getColumn(column).setMaxWidth(width);
        getColumnModel().getColumn(column).setMinWidth(10);
        getColumnModel().getColumn(column).setMaxWidth(10000);
    }

    public void fixTable(JScrollPane scroll)
    {
        scroll.setVerticalScrollBar(new TableScrollbarCustom());
        JPanel panel = new JPanel();
        panel.setBackground(new Color(255, 255, 255));
        scroll.setCorner(JScrollPane.UPPER_RIGHT_CORNER, panel);
        scroll.getViewport().setBackground(new Color(255, 255, 255));
        scroll.setBorder(BorderFactory.createLineBorder(new Color(232, 232, 232), 2));

    }

    private class TableHeader extends DefaultTableCellRenderer
    {

        private Map<Integer, Integer> alignment = new HashMap<>();

        public void setAlignment(int column, int align)
        {
            alignment.put(column, align);
        }

        @Override
        public Component getTableCellRendererComponent(JTable jtable, Object o, boolean bln, boolean bln1, int i, int i1)
        {
            Component com = super.getTableCellRendererComponent(jtable, o, bln, bln1, i, i1);
            com.setBackground(new Color(252, 210, 79));
            com.setForeground(new Color(0, 0, 0));
            com.setFont(com.getFont().deriveFont(Font.BOLD, 12));
            setBorder(new LineBorder(new Color(217, 181, 68, 100), 1));
            if (alignment.containsKey(i1))
            {
                setHorizontalAlignment(alignment.get(i1));
            } else
            {
                setHorizontalAlignment(JLabel.LEFT);
            }

            return com;
        }
    }

    private class TableCell extends DefaultTableCellRenderer
    {

        private Map<Integer, Integer> alignment = new HashMap<>();

        public void setAlignment(int column, int align)
        {
            alignment.put(column, align);
        }

        @Override
        public Component getTableCellRendererComponent(JTable jtable, Object o, boolean bln, boolean bln1, int row, int column)
        {
            Component com = super.getTableCellRendererComponent(jtable, o, bln, bln1, row, column);
            if (isCellSelected(row, column))
            {
                if (row % 2 == 0)
                {
                    com.setBackground(colorSelection1);
                } else
                {
                    com.setBackground(colorSelection2);
                }
            } else
            {
                if (row % 2 == 0)
                {
                    com.setBackground(new Color(255, 255, 255));
                } else
                {
                    com.setBackground(new Color(245, 245, 245));
                }
            }
            com.setForeground(new Color(0, 0, 0));
            setBorder(new LineBorder(new Color(217, 181, 68, 100), 1));
            if (alignment.containsKey(column))
            {
                setHorizontalAlignment(alignment.get(column));
            } else
            {
                setHorizontalAlignment(JLabel.LEFT);
            }
            jtable.getColumnModel().getColumn(getColumnCount() - 1).setCellRenderer(new ThreeFunctionActionCellRenderer());
            return com;
        }
    }
}
