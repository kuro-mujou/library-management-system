
package UIClass;

import java.awt.Image;
import javax.swing.JFrame;
import javax.swing.ImageIcon;


public class LoginInterface extends javax.swing.JFrame {

    public LoginInterface() {
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
        loginBtn = new swing.Button();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        passwordField2 = new swing.PasswordField();
        textField1 = new swing.TextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LIBRARY MANAGEMENT SYSTEM");
        setLocationByPlatform(true);
        setResizable(false);
        setSize(new java.awt.Dimension(1280, 720));

        BackGround.setImage(new javax.swing.ImageIcon(getClass().getResource("/Image/Black & white technology store Desktop Prototype.png"))); // NOI18N

        LaptopIcon.setImage(new javax.swing.ImageIcon(getClass().getResource("/Image/laptopIcon.png"))); // NOI18N

        Group6Btn.setText("Group 6");
        Group6Btn.setFont(new java.awt.Font("Poppins SemiBold", 0, 36)); // NOI18N

        loginBtn.setBackground(new java.awt.Color(0, 0, 0));
        loginBtn.setForeground(new java.awt.Color(255, 255, 255));
        loginBtn.setText("Login");
        loginBtn.setColor(new java.awt.Color(0, 0, 0));
        loginBtn.setColorClick(new java.awt.Color(94, 94, 94));
        loginBtn.setColorOver(new java.awt.Color(128, 128, 128));
        loginBtn.setFont(new java.awt.Font("Poppins SemiBold", 0, 24)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Poppins", 0, 20)); // NOI18N
        jLabel3.setText("Home");
        jLabel3.setFocusable(false);

        jLabel4.setFont(new java.awt.Font("Poppins", 0, 20)); // NOI18N
        jLabel4.setText("About Us");

        jLabel5.setFont(new java.awt.Font("Poppins", 0, 20)); // NOI18N
        jLabel5.setText("Setting");

        jLabel6.setFont(new java.awt.Font("Poppins", 0, 20)); // NOI18N
        jLabel6.setText("Exit");

        passwordField2.setLabelText("Password: 0-9,a-z,A-Z");

        textField1.setLabelText("username / username@gmail.com");

        jLabel1.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        jLabel1.setText("Username");

        jLabel2.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        jLabel2.setText("Password");

        BackGround.setLayer(LaptopIcon, javax.swing.JLayeredPane.DEFAULT_LAYER);
        BackGround.setLayer(Group6Btn, javax.swing.JLayeredPane.DEFAULT_LAYER);
        BackGround.setLayer(loginBtn, javax.swing.JLayeredPane.DEFAULT_LAYER);
        BackGround.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        BackGround.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        BackGround.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        BackGround.setLayer(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        BackGround.setLayer(passwordField2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        BackGround.setLayer(textField1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        BackGround.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        BackGround.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout BackGroundLayout = new javax.swing.GroupLayout(BackGround);
        BackGround.setLayout(BackGroundLayout);
        BackGroundLayout.setHorizontalGroup(
            BackGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackGroundLayout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addGroup(BackGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BackGroundLayout.createSequentialGroup()
                        .addGroup(BackGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(BackGroundLayout.createSequentialGroup()
                                .addComponent(LaptopIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(80, 80, 80)
                                .addComponent(jLabel3)
                                .addGap(54, 54, 54)
                                .addComponent(jLabel4)
                                .addGap(54, 54, 54)
                                .addComponent(jLabel5)
                                .addGap(54, 54, 54))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackGroundLayout.createSequentialGroup()
                                .addComponent(loginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(248, 248, 248)))
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 242, Short.MAX_VALUE)
                        .addComponent(Group6Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26))
                    .addGroup(BackGroundLayout.createSequentialGroup()
                        .addGroup(BackGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(BackGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(passwordField2, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textField1, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
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
                .addGroup(BackGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(BackGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addComponent(loginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(227, 227, 227))
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
                new LoginInterface().setVisible(true);
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private swing.Button loginBtn;
    private swing.PasswordField passwordField2;
    private swing.TextField textField1;
    // End of variables declaration//GEN-END:variables
}
