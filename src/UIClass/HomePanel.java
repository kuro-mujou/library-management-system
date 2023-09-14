
package UIClass;

import java.awt.Color;
import javax.swing.JPanel;

public class HomePanel extends JPanel {
    Color foreground = new Color(0,0,0,100);
    MainInterface main;
    public HomePanel(MainInterface main) {
        initComponents();
        initcustom();
        this.main = main;
    }
    void initcustom()
    {
        jLabel1.setForeground(foreground);
        jLabel2.setForeground(foreground);
        jLabel3.setForeground(foreground);
        jLabel4.setForeground(foreground);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        button1 = new swing.Button();
        button2 = new swing.Button();
        button4 = new swing.Button();
        button3 = new swing.Button();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setOpaque(false);

        button1.setBackground(new java.awt.Color(0, 0, 0));
        button1.setForeground(new java.awt.Color(255, 255, 255));
        button1.setText("BOOK");
        button1.setColor(new java.awt.Color(0, 0, 0));
        button1.setColorClick(new java.awt.Color(102, 102, 102));
        button1.setColorOver(new java.awt.Color(153, 153, 153));
        button1.setFont(new java.awt.Font("Poppins", 1, 15)); // NOI18N
        button1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button1MouseClicked(evt);
            }
        });
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });

        button2.setBackground(new java.awt.Color(0, 0, 0));
        button2.setForeground(new java.awt.Color(255, 255, 255));
        button2.setText("READER");
        button2.setColor(new java.awt.Color(0, 0, 0));
        button2.setColorClick(new java.awt.Color(102, 102, 102));
        button2.setColorOver(new java.awt.Color(153, 153, 153));
        button2.setFont(new java.awt.Font("Poppins", 1, 15)); // NOI18N
        button2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button2MouseClicked(evt);
            }
        });

        button4.setBackground(new java.awt.Color(0, 0, 0));
        button4.setForeground(new java.awt.Color(255, 255, 255));
        button4.setText("BORROW");
        button4.setColor(new java.awt.Color(0, 0, 0));
        button4.setColorClick(new java.awt.Color(102, 102, 102));
        button4.setColorOver(new java.awt.Color(153, 153, 153));
        button4.setFont(new java.awt.Font("Poppins", 1, 15)); // NOI18N
        button4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button4MouseClicked(evt);
            }
        });

        button3.setBackground(new java.awt.Color(0, 0, 0));
        button3.setForeground(new java.awt.Color(255, 255, 255));
        button3.setText("RETURN");
        button3.setColor(new java.awt.Color(0, 0, 0));
        button3.setColorClick(new java.awt.Color(102, 102, 102));
        button3.setColorOver(new java.awt.Color(153, 153, 153));
        button3.setFont(new java.awt.Font("Poppins", 1, 15)); // NOI18N
        button3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button3MouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Calibri", 2, 18)); // NOI18N
        jLabel1.setText("book management");

        jLabel2.setFont(new java.awt.Font("Calibri", 2, 18)); // NOI18N
        jLabel2.setText("readers management");

        jLabel3.setFont(new java.awt.Font("Calibri", 2, 18)); // NOI18N
        jLabel3.setText("borrow management");

        jLabel4.setFont(new java.awt.Font("Calibri", 2, 18)); // NOI18N
        jLabel4.setText("return management");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(button1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(button2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(button4, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                    .addComponent(button3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addContainerGap(197, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addContainerGap(53, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void button1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button1MouseClicked
        BookManagementPanel bookManagement = new BookManagementPanel(main);
        JPanel p = main.getPanel();
        p.removeAll();
        p.add(bookManagement);
        main.LoadChange();
        p.validate();
        p.repaint();
    }//GEN-LAST:event_button1MouseClicked

    private void button2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button2MouseClicked
        ReaderManagementPanel readerManagement = new ReaderManagementPanel(main);
        JPanel p = main.getPanel();
        p.removeAll();
        p.add(readerManagement);
        main.LoadChange();
        p.validate();
        p.repaint();
    }//GEN-LAST:event_button2MouseClicked

    private void button4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button4MouseClicked
        BorrowManagementPanel borrowManagement = new BorrowManagementPanel(main);
        JPanel p = main.getPanel();
        p.removeAll();
        p.add(borrowManagement);
        main.LoadChange();
        borrowManagement.initCustom();
        p.validate();
        p.repaint();
    }//GEN-LAST:event_button4MouseClicked

    private void button3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button3MouseClicked
        ReturnManagementPanel returnManagement = new ReturnManagementPanel(main);
        JPanel p = main.getPanel();
        p.removeAll();
        p.add(returnManagement);
        main.LoadChange();
        returnManagement.initCustom();
        p.validate();
        p.repaint();
    }//GEN-LAST:event_button3MouseClicked

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private swing.Button button1;
    private swing.Button button2;
    private swing.Button button3;
    private swing.Button button4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
