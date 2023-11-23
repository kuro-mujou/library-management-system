
package UIClass;

import swing.ScrollBarCustom;

public class Setting extends javax.swing.JPanel
{
    private MainDashboard main;
    public Setting(MainDashboard mainDashboard)
    {
        initComponents();
        this.main = mainDashboard;
        init();
    }
    private void init()
    {
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        LogoutButton = new swing.Button();

        LogoutButton.setText("Log out");
        LogoutButton.setColor(new java.awt.Color(255, 204, 0));
        LogoutButton.setRadius(15);
        LogoutButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                LogoutButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(788, Short.MAX_VALUE)
                .addComponent(LogoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(500, Short.MAX_VALUE)
                .addComponent(LogoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void LogoutButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_LogoutButtonActionPerformed
    {//GEN-HEADEREND:event_LogoutButtonActionPerformed
        main.dispose();
        new MainInterface().setVisible(true);
        
    }//GEN-LAST:event_LogoutButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private swing.Button LogoutButton;
    // End of variables declaration//GEN-END:variables
}
