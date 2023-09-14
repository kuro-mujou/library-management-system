
package UIClass;

import java.awt.BorderLayout;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import swing.PictureBox;


public class MainInterface extends javax.swing.JFrame 
{
    private String CurrentPanel;
    private String PreviousPanel;
    private ArrayList<String> classname;
    public MainInterface() 
    {
        initComponents();
        initComponentsCustom();
        LoadChange();
    }
    private void LoadChange()
    {
        if(classname.contains(CurrentPanel))
            BackButton.setVisible(true);
        else if(CurrentPanel == "UIClass.MainPanel")
            BackButton.setVisible(false);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MainPanel = new javax.swing.JPanel();
        BackGround = new swing.PictureBox();
        LaptopIcon = new swing.PictureBox();
        Group6Btn = new swing.Button();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        ContentPanel = new javax.swing.JPanel();
        BackButton = new swing.Buttonver2();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LIBRARY MANAGEMENT SYSTEM");
        setLocationByPlatform(true);
        setPreferredSize(new java.awt.Dimension(1280, 800));
        setResizable(false);
        setSize(new java.awt.Dimension(1280, 800));

        BackGround.setImage(new javax.swing.ImageIcon(getClass().getResource("/Image/main_background.png"))); // NOI18N

        LaptopIcon.setImage(new javax.swing.ImageIcon(getClass().getResource("/Image/laptopIcon.png"))); // NOI18N

        Group6Btn.setText("Group 6");
        Group6Btn.setFont(new java.awt.Font("Poppins SemiBold", 0, 36)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Poppins", 0, 20)); // NOI18N
        jLabel3.setText("Home");
        jLabel3.setFocusable(false);
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Poppins", 0, 20)); // NOI18N
        jLabel4.setText("About Us");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Poppins", 0, 20)); // NOI18N
        jLabel5.setText("Setting");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Poppins", 0, 20)); // NOI18N
        jLabel6.setText("Exit");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });

        ContentPanel.setOpaque(false);

        javax.swing.GroupLayout ContentPanelLayout = new javax.swing.GroupLayout(ContentPanel);
        ContentPanel.setLayout(ContentPanelLayout);
        ContentPanelLayout.setHorizontalGroup(
            ContentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        ContentPanelLayout.setVerticalGroup(
            ContentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        BackButton.setText("BACK");
        BackButton.setFont(new java.awt.Font("Poppins SemiBold", 1, 20)); // NOI18N
        BackButton.setIsBackButton(true);
        BackButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackButtonMouseClicked(evt);
            }
        });

        BackGround.setLayer(LaptopIcon, javax.swing.JLayeredPane.DEFAULT_LAYER);
        BackGround.setLayer(Group6Btn, javax.swing.JLayeredPane.DEFAULT_LAYER);
        BackGround.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        BackGround.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        BackGround.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        BackGround.setLayer(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        BackGround.setLayer(ContentPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        BackGround.setLayer(BackButton, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout BackGroundLayout = new javax.swing.GroupLayout(BackGround);
        BackGround.setLayout(BackGroundLayout);
        BackGroundLayout.setHorizontalGroup(
            BackGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackGroundLayout.createSequentialGroup()
                .addGroup(BackGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BackGroundLayout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(LaptopIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(90, 90, 90)
                        .addComponent(jLabel3)
                        .addGap(54, 54, 54)
                        .addComponent(jLabel4)
                        .addGap(54, 54, 54)
                        .addComponent(jLabel5)
                        .addGap(54, 54, 54)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 242, Short.MAX_VALUE)
                        .addComponent(Group6Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackGroundLayout.createSequentialGroup()
                        .addComponent(ContentPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26))
        );
        BackGroundLayout.setVerticalGroup(
            BackGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackGroundLayout.createSequentialGroup()
                .addGroup(BackGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BackGroundLayout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(Group6Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(BackGroundLayout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(BackGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(BackGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4)
                                .addComponent(jLabel5)
                                .addComponent(jLabel6))
                            .addComponent(LaptopIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 584, Short.MAX_VALUE)
                .addComponent(BackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
            .addGroup(BackGroundLayout.createSequentialGroup()
                .addGap(144, 144, 144)
                .addComponent(ContentPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout MainPanelLayout = new javax.swing.GroupLayout(MainPanel);
        MainPanel.setLayout(MainPanelLayout);
        MainPanelLayout.setHorizontalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BackGround, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        MainPanelLayout.setVerticalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BackGround, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        PreviousPanel = ContentPanel.getComponent(0).getClass().getName();
        ContentPanel.removeAll();
        MainPanel main = new MainPanel(this);
        ContentPanel.add(main);
        CurrentPanel = ContentPanel.getComponent(0).getClass().getName();
        ContentPanel.validate();
        ContentPanel.repaint();
        LoadChange();
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        PreviousPanel = ContentPanel.getComponent(0).getClass().getName();
        ContentPanel.removeAll();
        SettingPanel setting = new SettingPanel(this);
        ContentPanel.add(setting);
        CurrentPanel = ContentPanel.getComponent(0).getClass().getName();
        ContentPanel.validate();
        ContentPanel.repaint();
        LoadChange();
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        PreviousPanel = ContentPanel.getComponent(0).getClass().getName();
        ContentPanel.removeAll();
        AboutUsPanel aboutus = new AboutUsPanel(this);
        ContentPanel.add(aboutus);
        CurrentPanel = ContentPanel.getComponent(0).getClass().getName();
        ContentPanel.validate();
        ContentPanel.repaint();
        LoadChange();
    }//GEN-LAST:event_jLabel4MouseClicked

    private void BackButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackButtonMouseClicked
        CurrentPanel = ContentPanel.getComponent(0).getClass().getName();
        
        
//        if(classname.contains(CurrentPanel))
//        {
//            BackGround.setImage(new javax.swing.ImageIcon(getClass().getResource("/Image/main_background.png")));
//        }
    }//GEN-LAST:event_BackButtonMouseClicked

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainInterface().setVisible(true);
            }
        });
    }
    public JPanel getPanel()
    {
        return this.ContentPanel;
    }
    public PictureBox getPictureBox()
    {
        return this.BackGround;
    }
    private void initComponentsCustom() 
    {
        ImageIcon icon = new ImageIcon("src/Image/StackOfBooksIcon.png");
        setIconImage(icon.getImage());
        MainPanel main = new MainPanel(this);
        ContentPanel.setLayout(new BorderLayout());
        ContentPanel.add(main);
        
        CurrentPanel = ContentPanel.getComponent(0).getClass().getName();
        PreviousPanel = ContentPanel.getComponent(0).getClass().getName();
        classname = new ArrayList<String>();      
//        classname.add("UIClass.MainPanel");
        classname.add("UIClass.AboutUsPanel");
        classname.add("UIClass.BookManagementPanel");
        classname.add("UIClass.HomePanel");
        classname.add("UIClass.ReaderManagementPanel");
        classname.add("UIClass.SettingPanel");
        classname.add("UIClass.LoginPanel");
        
//        LoadChange();
    }

    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private swing.Buttonver2 BackButton;
    private swing.PictureBox BackGround;
    private javax.swing.JPanel ContentPanel;
    private swing.Button Group6Btn;
    private swing.PictureBox LaptopIcon;
    private javax.swing.JPanel MainPanel;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}
