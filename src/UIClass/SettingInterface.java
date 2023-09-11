
package UIClass;

import java.awt.Image;
import javax.swing.JFrame;
import javax.swing.ImageIcon;


public class SettingInterface extends javax.swing.JFrame {

    public SettingInterface() {
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
        jButton1 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        combobox2 = new swing.Combobox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LIBRARY MANAGEMENT SYSTEM");
        setLocationByPlatform(true);
        setPreferredSize(new java.awt.Dimension(1280, 720));
        setResizable(false);
        setSize(new java.awt.Dimension(1280, 720));

        BackGround.setImage(new javax.swing.ImageIcon(getClass().getResource("/Image/Black & white technology store Desktop Prototype.png"))); // NOI18N

        LaptopIcon.setImage(new javax.swing.ImageIcon(getClass().getResource("/Image/laptopIcon.png"))); // NOI18N

        Group6Btn.setText("Group 6");
        Group6Btn.setFont(new java.awt.Font("Poppins SemiBold", 0, 36)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Poppins", 0, 20)); // NOI18N
        jLabel3.setText("Home");
        jLabel3.setFocusable(false);

        jLabel4.setFont(new java.awt.Font("Poppins", 0, 20)); // NOI18N
        jLabel4.setText("About Us");

        jLabel5.setFont(new java.awt.Font("Poppins", 0, 20)); // NOI18N
        jLabel5.setText("Setting");

        jLabel6.setFont(new java.awt.Font("Poppins", 0, 20)); // NOI18N
        jLabel6.setText("Exit");

        jButton1.setText("jButton1");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        combobox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "English", "Coming soon.." }));
        combobox2.setFocusable(false);
        combobox2.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        combobox2.setOpaque(false);
        combobox2.setRequestFocusEnabled(false);
        combobox2.setVerifyInputWhenFocusTarget(false);

        BackGround.setLayer(LaptopIcon, javax.swing.JLayeredPane.DEFAULT_LAYER);
        BackGround.setLayer(Group6Btn, javax.swing.JLayeredPane.DEFAULT_LAYER);
        BackGround.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        BackGround.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        BackGround.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        BackGround.setLayer(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        BackGround.setLayer(jButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        BackGround.setLayer(jComboBox1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        BackGround.setLayer(combobox2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout BackGroundLayout = new javax.swing.GroupLayout(BackGround);
        BackGround.setLayout(BackGroundLayout);
        BackGroundLayout.setHorizontalGroup(
            BackGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackGroundLayout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(LaptopIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80)
                .addComponent(jLabel3)
                .addGap(54, 54, 54)
                .addComponent(jLabel4)
                .addGap(54, 54, 54)
                .addComponent(jLabel5)
                .addGap(64, 64, 64)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 242, Short.MAX_VALUE)
                .addComponent(Group6Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
            .addGroup(BackGroundLayout.createSequentialGroup()
                .addGroup(BackGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BackGroundLayout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(combobox2, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(BackGroundLayout.createSequentialGroup()
                        .addGap(185, 185, 185)
                        .addComponent(jButton1)
                        .addGap(110, 110, 110)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        BackGroundLayout.setVerticalGroup(
            BackGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackGroundLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(BackGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Group6Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(LaptopIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(BackGroundLayout.createSequentialGroup()
                        .addGroup(BackGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(179, 179, 179)
                .addComponent(combobox2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90)
                .addGroup(BackGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SettingInterface().setVisible(true);
            }
        });
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
    private swing.Combobox combobox2;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}
