package swing;

import UIModel.ModelMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.DefaultListCellRenderer;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;
import javax.swing.SwingUtilities;

public class ListMenu<E extends Object> extends JList<E>
{
    private final DefaultListModel model;
    private int selectedIndex = -1;

    public ListMenu()
    {
        model = new DefaultListModel();
        setModel(model);
        addMouseListener(new MouseAdapter()
        {
            @Override
            public void mousePressed(MouseEvent e)
            {
                if (SwingUtilities.isLeftMouseButton(e))
                {
                    int index = locationToIndex(e.getPoint());
                    Object O = model.getElementAt(index);
                    if (O instanceof ModelMenu)
                    {
                        ModelMenu menu = (ModelMenu) O;
                        if (menu.getType() == ModelMenu.MenuType.MENU)
                        {
                            selectedIndex = index;
                        }
                    } else
                    {                        
                        selectedIndex = index;
                    }
                }
                repaint();
            }
            
        });
    }
    
    @Override
    public ListCellRenderer<? super E> getCellRenderer()
    {
        return new DefaultListCellRenderer()
        {
            @Override
            public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected, boolean cellHasFocus)
            {
                ModelMenu data;
                if (value instanceof ModelMenu)
                {
                    data = (ModelMenu) value;
                } else
                {
                    data = new ModelMenu("", value + "", ModelMenu.MenuType.EMPTY);
                }
                MenuItem item = new MenuItem(data);
                item.setSelected(selectedIndex == index);
                return item;
            }
            
        };
    }

    public void addItem(ModelMenu data)
    {
        model.addElement(data);
    }
}
