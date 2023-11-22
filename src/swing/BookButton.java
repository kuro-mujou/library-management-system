
package swing;

public class BookButton extends javax.swing.JPanel
{

    public BookButton()
    {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        ItemDetail = new swing.ActionButton();
        ItemDelete = new swing.ActionButton();
        ItemEdit = new swing.ActionButton();

        ItemDetail.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/menuIcon.png"))); // NOI18N

        ItemDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/delete.png"))); // NOI18N
        ItemDelete.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                ItemDeleteActionPerformed(evt);
            }
        });

        ItemEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/edit.png"))); // NOI18N
        ItemEdit.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                ItemEditActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(ItemEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ItemDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ItemDetail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ItemEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(ItemDetail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(ItemDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void ItemDeleteActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_ItemDeleteActionPerformed
    {//GEN-HEADEREND:event_ItemDeleteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ItemDeleteActionPerformed

    private void ItemEditActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_ItemEditActionPerformed
    {//GEN-HEADEREND:event_ItemEditActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ItemEditActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private swing.ActionButton ItemDelete;
    private swing.ActionButton ItemDetail;
    private swing.ActionButton ItemEdit;
    // End of variables declaration//GEN-END:variables
}
