
package win_button;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VerticalCollapsiblePanelExample extends JFrame {
    private JPanel mainPanel;

    public VerticalCollapsiblePanelExample() {
        setTitle("Vertical Collapsible Panel Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);

        mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));

        // Create collapsible panels
        for (int i = 1; i <= 10; i++) {
            CollapsiblePanel collapsiblePanel = new CollapsiblePanel("Collapsible Panel " + i);
            collapsiblePanel.setContent(createContentPanel());

            mainPanel.add(collapsiblePanel);
        }

        JScrollPane scrollPane = new JScrollPane(mainPanel);
        add(scrollPane);

        setContentPane(mainPanel);
        setVisible(true);
    }

    private JPanel createContentPanel() {
        JPanel contentPanel = new JPanel();
        contentPanel.setBackground(Color.lightGray);
        contentPanel.add(new JLabel("Content goes here"));

        return contentPanel;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new VerticalCollapsiblePanelExample());
    }
}

class CollapsiblePanel extends JPanel {
    private JToggleButton toggleButton;
    private JPanel contentPanel;

    public CollapsiblePanel(String title) {
        setLayout(new BorderLayout());

        // Create a toggle button to control the collapsible state
        toggleButton = new JToggleButton(title);
        toggleButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                toggleCollapsibleState();
            }
        });

        // Create an empty content panel
        contentPanel = new JPanel();
        contentPanel.setLayout(new BorderLayout());

        // Add the toggle button to the top of the panel
        add(toggleButton, BorderLayout.NORTH);
        // Add the content panel to the center of the panel
        add(contentPanel, BorderLayout.CENTER);
    }

    public void setContent(JPanel content) {
        // Set the content of the collapsible panel
        contentPanel.add(content, BorderLayout.CENTER);
        // Initially, set the panel to be collapsed
        contentPanel.setVisible(false);
        toggleButton.setSelected(false);
    }

    private void toggleCollapsibleState() {
        // Toggle the visibility of the content panel when the button is clicked
        contentPanel.setVisible(!contentPanel.isVisible());
        revalidate();
        repaint();
    }
}

