
package swing;


import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.geom.Area;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RoundRectangle2D;
import java.util.Objects;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPopupMenu;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.border.AbstractBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.basic.BasicComboBoxUI;
import javax.swing.plaf.basic.BasicComboPopup;
import javax.swing.plaf.basic.ComboPopup;

public class Combobox<E> extends JComboBox<E>
{
    public Combobox()
    {
        setUI(new ComboboxUI(this));
        setBackground(new Color(0,0,0,0));
        setForeground(Color.red);
        setBorder(new RoundedCornerBorder(new Color(255,232,129),new Color(0,0,0)));
        DefaultListCellRenderer listRenderer = new DefaultListCellRenderer();
        listRenderer.setHorizontalAlignment(DefaultListCellRenderer.CENTER);
        this.setRenderer(listRenderer);
    }
    
    private class ComboboxUI extends BasicComboBoxUI
    {
        public ComboboxUI(Combobox combo)
        {
//            setContentAreaFilled(false);
            setAlignmentX(CENTER_ALIGNMENT);
            setAlignmentY(CENTER_ALIGNMENT);
        }
        private class ComboboxPopup extends BasicComboPopup
        {
            public ComboboxPopup(JComboBox<Object> combo) 
            {
                super(combo);
//                setOpaque(false);
                setBackground(new Color(255,232,129));
                setBorder(new SecondRoundedCornerBorder(new Color(255,232,129),new Color(0,0,0)));
            }
            @Override
            protected JScrollPane createScroller() {
                JScrollPane scroll = super.createScroller();
                list.setBackground(new Color(255,232,129));
                
                ScrollBarCustom sb = new ScrollBarCustom();
                sb.setPreferredSize(new Dimension(6, 70));
                sb.setBackground(new Color(255,232,129));
                scroll.setVerticalScrollBar(sb);
                ScrollBarCustom sbH = new ScrollBarCustom();
                sbH.setOrientation(JScrollBar.HORIZONTAL);
                scroll.setHorizontalScrollBar(sbH);
                scroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
                return scroll;
            }
        }
        private class ArrowButton extends JButton
        {
            public ArrowButton()
            {
                Dimension d = new Dimension(-5,getHeight());
                setPreferredSize(d);
                setContentAreaFilled(false);
                setBorder(new EmptyBorder(0,0,0,0));
//                setBorder(new RoundedCornerBorder(new Color(234,132,57),new Color(234,132,57)));
            }
            @Override
            public void paint(Graphics grphcs) {
                super.paint(grphcs);
                Graphics2D g2 = (Graphics2D) grphcs.create();
                g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
                int width = getWidth();
                int height = getHeight();
                int sizeX = 12;
                int sizeY = 8;
                int x = (width - sizeX) / 2;
                int y = (height - sizeY) / 2;
                int px[] = {x, x + sizeX, x + sizeX / 2};
                int py[] = {y, y, y + sizeY};
                g2.setColor(new Color(234,132,57));
                g2.fillPolygon(px, py, px.length);
                g2.dispose();
            }
        }
        @Override
        protected JButton createArrowButton() {
            return new ComboboxUI.ArrowButton();
        }
        @Override
        protected ComboPopup createPopup() {
            return new ComboboxUI.ComboboxPopup(comboBox);
        }
        @Override
        public void paintCurrentValueBackground(Graphics grphcs, Rectangle rctngl, boolean bln) 
        {
        }
    }
    class RoundedCornerBorder extends AbstractBorder 
    {
        private Color BackgroundColor, ForegroundColor;
        public RoundedCornerBorder(Color bg, Color fg)
        {
            this.BackgroundColor = bg;
            this.ForegroundColor = fg;
        }
        protected static final int ARC = 50;
        @Override public void paintBorder(
        Component c, Graphics g, int x, int y, int width, int height) 
        {
            Graphics2D g2 = (Graphics2D) g.create();
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                                RenderingHints.VALUE_ANTIALIAS_ON);
            int r = ARC;
            int w = width  -1;
            int h = height -1;

            Area round = new Area(new RoundRectangle2D.Float(x+1, y+1, w-2, h-1, r, r));
//            if (c instanceof JPopupMenu) 
//            {
                g2.setPaint(BackgroundColor);
                g2.fill(round);
//            }
//            else 
//            {
//                Container parent = c.getParent();
//                if (Objects.nonNull(parent)) 
//                {
//                    Area corner = new Area(new Rectangle2D.Float(x, y, width, height));
//                    corner.subtract(round);
//                    g2.setPaint(parent.getBackground());
//                    g2.fill(corner);
//                } 
//            }
            g2.setPaint(ForegroundColor);
            g2.draw(round);
            g2.dispose();
        }
        @Override public Insets getBorderInsets(Component c) {
            return new Insets(8, 8, 8, 8);
        }
        @Override public Insets getBorderInsets(Component c, Insets insets) {
            insets.set(8, 8, 8, 8);
            return insets;
        }
    }
    class SecondRoundedCornerBorder extends AbstractBorder 
    {
        private Color BackgroundColor, ForegroundColor;
        public SecondRoundedCornerBorder(Color bg, Color fg)
        {
            this.BackgroundColor = bg;
            this.ForegroundColor = fg;
        }
        protected static final int ARC = 50;
        @Override public void paintBorder(
        Component c, Graphics g, int x, int y, int width, int height) 
        {
            Graphics2D g2 = (Graphics2D) g.create();
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                                RenderingHints.VALUE_ANTIALIAS_ON);
            int r = ARC;
            int w = width  -1;
            int h = height -1;

            Area round = new Area(new RoundRectangle2D.Float(x+1, y+1, w-2, h-1, r, r));

                g2.setPaint(BackgroundColor);
                g2.fill(round);

            g2.setPaint(ForegroundColor);
            g2.draw(round);
            g2.dispose();
        }
        @Override public Insets getBorderInsets(Component c) {
            return new Insets(8, 8, 8, 8);
        }
        @Override public Insets getBorderInsets(Component c, Insets insets) {
            insets.set(8, 8, 8, 8);
            return insets;
        }
    }
}
