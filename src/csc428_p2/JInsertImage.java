/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csc428_p2;

/**
 *
 * @author ting
 */
public class JInsertImage extends javax.swing.JInternalFrame {

    private JInternalPPT parent;
    
    /**
     * Creates new form pptFrame
     * @param parent - the parent frame
     */
    public JInsertImage(JInternalPPT parent) {
        this.parent = parent;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        butngrpInsertImage = new javax.swing.ButtonGroup();
        pnlPPT = new javax.swing.JPanel();
        lblInsertImageTitle = new javax.swing.JLabel();
        lblInsertCat = new javax.swing.JLabel();
        rbtnInsertCat = new javax.swing.JRadioButton();
        lblInsertDog = new javax.swing.JLabel();
        rbtnInsertDog = new javax.swing.JRadioButton();
        lblInsertBird = new javax.swing.JLabel();
        rbtnInsertBird = new javax.swing.JRadioButton();
        btnCancelInsert = new javax.swing.JButton();
        btnInsert = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        lblInsertImageTitle.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblInsertImageTitle.setText("Please select the image to insert:");

        lblInsertCat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/csc428_p2/image/cat_thumbnail.png"))); // NOI18N

        butngrpInsertImage.add(rbtnInsertCat);
        rbtnInsertCat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnInsertCatActionPerformed(evt);
            }
        });

        lblInsertDog.setIcon(new javax.swing.ImageIcon(getClass().getResource("/csc428_p2/image/dog_thumbnail.png"))); // NOI18N

        butngrpInsertImage.add(rbtnInsertDog);

        lblInsertBird.setIcon(new javax.swing.ImageIcon(getClass().getResource("/csc428_p2/image/bird_thumbnail.png"))); // NOI18N

        butngrpInsertImage.add(rbtnInsertBird);

        btnCancelInsert.setText("Cancel");
        btnCancelInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelInsertActionPerformed(evt);
            }
        });

        btnInsert.setText("Insert");
        btnInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlPPTLayout = new javax.swing.GroupLayout(pnlPPT);
        pnlPPT.setLayout(pnlPPTLayout);
        pnlPPTLayout.setHorizontalGroup(
            pnlPPTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPPTLayout.createSequentialGroup()
                .addGroup(pnlPPTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlPPTLayout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(lblInsertImageTitle))
                    .addGroup(pnlPPTLayout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(lblInsertCat, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59)
                        .addComponent(lblInsertDog)
                        .addGap(60, 60, 60)
                        .addComponent(lblInsertBird)))
                .addContainerGap(99, Short.MAX_VALUE))
            .addGroup(pnlPPTLayout.createSequentialGroup()
                .addGap(136, 136, 136)
                .addComponent(rbtnInsertCat)
                .addGap(138, 138, 138)
                .addComponent(rbtnInsertDog)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rbtnInsertBird)
                .addGap(137, 137, 137))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPPTLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnInsert)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCancelInsert)
                .addContainerGap())
        );
        pnlPPTLayout.setVerticalGroup(
            pnlPPTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPPTLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblInsertImageTitle)
                .addGap(18, 18, 18)
                .addGroup(pnlPPTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblInsertCat)
                    .addComponent(lblInsertDog)
                    .addComponent(lblInsertBird))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlPPTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbtnInsertDog)
                    .addComponent(rbtnInsertCat)
                    .addComponent(rbtnInsertBird))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 163, Short.MAX_VALUE)
                .addGroup(pnlPPTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelInsert)
                    .addComponent(btnInsert))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPPT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPPT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbtnInsertCatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnInsertCatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtnInsertCatActionPerformed

    private void btnCancelInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelInsertActionPerformed
        parent.setContentsVisible();
        this.dispose();
    }//GEN-LAST:event_btnCancelInsertActionPerformed

    private void btnInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertActionPerformed
        if (rbtnInsertCat.isSelected()) {
            parent.mapImageToSlide("cat");
        } else if (rbtnInsertDog.isSelected()) {
            parent.mapImageToSlide("dog");
        } else if (rbtnInsertBird.isSelected()) {
            parent.mapImageToSlide("bird");
        }
        parent.setContentsVisible();
        this.dispose();
    }//GEN-LAST:event_btnInsertActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelInsert;
    private javax.swing.JButton btnInsert;
    private javax.swing.ButtonGroup butngrpInsertImage;
    private javax.swing.JLabel lblInsertBird;
    private javax.swing.JLabel lblInsertCat;
    private javax.swing.JLabel lblInsertDog;
    private javax.swing.JLabel lblInsertImageTitle;
    private javax.swing.JPanel pnlPPT;
    private javax.swing.JRadioButton rbtnInsertBird;
    private javax.swing.JRadioButton rbtnInsertCat;
    private javax.swing.JRadioButton rbtnInsertDog;
    // End of variables declaration//GEN-END:variables
}
