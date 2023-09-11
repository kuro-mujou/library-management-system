
package UIClass;

import java.awt.BorderLayout;
import java.awt.Image;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JPanel;


public class MainInterface extends javax.swing.JFrame {

    public MainInterface() {
        initComponents();
        initComponentsCustom();
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
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LIBRARY MANAGEMENT SYSTEM");
        setLocationByPlatform(true);
        setResizable(false);
        setSize(new java.awt.Dimension(1280, 720));

        BackGround.setImage(new javax.swing.ImageIcon(getClass().getResource("/Image/Black & white technology store Desktop Prototype.png"))); // NOI18N

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

        jLabel5.setFont(new java.awt.Font("Poppins", 0, 20)); // NOI18N
        jLabel5.setText("Setting");

        jLabel6.setFont(new java.awt.Font("Poppins", 0, 20)); // NOI18N
        jLabel6.setText("Exit");

        jPanel1.setOpaque(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 860, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        BackGround.setLayer(LaptopIcon, javax.swing.JLayeredPane.DEFAULT_LAYER);
        BackGround.setLayer(Group6Btn, javax.swing.JLayeredPane.DEFAULT_LAYER);
        BackGround.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        BackGround.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        BackGround.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        BackGround.setLayer(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        BackGround.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

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
                        .addComponent(jLabel6))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(Group6Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );
        BackGroundLayout.setVerticalGroup(
            BackGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackGroundLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(BackGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(BackGroundLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(Group6Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(589, 589, 589))
                    .addGroup(BackGroundLayout.createSequentialGroup()
                        .addGroup(BackGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(BackGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4)
                                .addComponent(jLabel5)
                                .addComponent(jLabel6))
                            .addComponent(LaptopIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
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
        jPanel1.removeAll();
        MainPanel main = new MainPanel(this);
        jPanel1.setLayout(new BorderLayout());
        jPanel1.add(main);
        jPanel1.validate();
        jPanel1.repaint();
    }//GEN-LAST:event_jLabel3MouseClicked

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainInterface().setVisible(true);
            }
        });
    }
    public JPanel getPanel()
    {
        return this.jPanel1;
    }
    private void initComponentsCustom() {
//        setExtendedState(JFrame.MAXIMIZED_BOTH);
//        ImageIcon imgIcon = new ImageIcon(getClass().getResource("/Image/11.png"));
//        Image image = (imgIcon).getImage().getScaledInstance(jLabel1.getWidth(), jLabel1.getHeight(), Image.SCALE_SMOOTH);
//        imgIcon = new ImageIcon(image);
//        jLabel1.setIcon(imgIcon);
        ImageIcon icon = new ImageIcon("src/Image/StackOfBooksIcon.png");
        setIconImage(icon.getImage());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private swing.PictureBox BackGround;
    private swing.Button Group6Btn;
    private swing.PictureBox LaptopIcon;
    private javax.swing.JPanel MainPanel;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
