/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csc428_p2;

import java.awt.Color;

/**
 *
 * @author Ignacio
 */
public class JInsertingImage extends javax.swing.JInternalFrame {

    private JInternalPPT parent;
    private boolean catSelected;
    private boolean dogSelected;
    private boolean birdSelected;
    private boolean rabbitSelected;
    private boolean fishSelected;
    private boolean turtleSelected;
    
    /**
     * Creates new form JInsertingImage
     */
    public JInsertingImage(JInternalPPT parent) {
        initComponents();
        this.parent = parent;
        initComponents();
        catSelected = false;
        dogSelected = false;
        birdSelected = false;
        rabbitSelected = false;
        fishSelected = false;
        turtleSelected = false;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btngrpInsert = new javax.swing.ButtonGroup();
        pnlInsert = new javax.swing.JPanel();
        btnInsert = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        pnlInsertCat = new javax.swing.JPanel();
        btnSelectCat = new javax.swing.JButton();
        lblCatTitle = new javax.swing.JLabel();
        pnlInsertDog = new javax.swing.JPanel();
        btnSelectDog = new javax.swing.JButton();
        lblDogTitle = new javax.swing.JLabel();
        pnlInsertBird = new javax.swing.JPanel();
        btnInsertBird = new javax.swing.JButton();
        lblBirdTitle = new javax.swing.JLabel();
        pnlInsertRabbit = new javax.swing.JPanel();
        btnSelectRabbit = new javax.swing.JButton();
        lblRabbitTitle = new javax.swing.JLabel();
        pnlInsertFish = new javax.swing.JPanel();
        btnSelectFish = new javax.swing.JButton();
        lblFishTitle = new javax.swing.JLabel();
        pnlInsertTurtle = new javax.swing.JPanel();
        btnSelectTurtle = new javax.swing.JButton();
        lblTurtleTitle = new javax.swing.JLabel();
        lblSidebar = new javax.swing.JLabel();

        pnlInsert.setBackground(new java.awt.Color(255, 255, 255));

        btnInsert.setFont(new java.awt.Font("Tahoma", 0, 39)); // NOI18N
        btnInsert.setText("Confirm");
        btnInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertActionPerformed(evt);
            }
        });

        btnCancel.setFont(new java.awt.Font("Tahoma", 0, 39)); // NOI18N
        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        pnlInsertCat.setBackground(new java.awt.Color(255, 255, 255));

        btnSelectCat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/csc428_p2/image/cat_thumbnail.png"))); // NOI18N
        btnSelectCat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelectCatActionPerformed(evt);
            }
        });

        lblCatTitle.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblCatTitle.setText("cat.jpg");

        javax.swing.GroupLayout pnlInsertCatLayout = new javax.swing.GroupLayout(pnlInsertCat);
        pnlInsertCat.setLayout(pnlInsertCatLayout);
        pnlInsertCatLayout.setHorizontalGroup(
            pnlInsertCatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInsertCatLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(pnlInsertCatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSelectCat, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCatTitle))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlInsertCatLayout.setVerticalGroup(
            pnlInsertCatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInsertCatLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnSelectCat, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCatTitle)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlInsertDog.setBackground(new java.awt.Color(255, 255, 255));

        btnSelectDog.setIcon(new javax.swing.ImageIcon(getClass().getResource("/csc428_p2/image/dog_thumbnail.png"))); // NOI18N
        btnSelectDog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelectDogActionPerformed(evt);
            }
        });

        lblDogTitle.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblDogTitle.setText("dog.jpg");

        javax.swing.GroupLayout pnlInsertDogLayout = new javax.swing.GroupLayout(pnlInsertDog);
        pnlInsertDog.setLayout(pnlInsertDogLayout);
        pnlInsertDogLayout.setHorizontalGroup(
            pnlInsertDogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInsertDogLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(pnlInsertDogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSelectDog, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDogTitle))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlInsertDogLayout.setVerticalGroup(
            pnlInsertDogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInsertDogLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnSelectDog, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblDogTitle)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlInsertBird.setBackground(new java.awt.Color(255, 255, 255));

        btnInsertBird.setIcon(new javax.swing.ImageIcon(getClass().getResource("/csc428_p2/image/bird_thumbnail.png"))); // NOI18N
        btnInsertBird.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertBirdActionPerformed(evt);
            }
        });

        lblBirdTitle.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblBirdTitle.setText("bird.jpg");

        javax.swing.GroupLayout pnlInsertBirdLayout = new javax.swing.GroupLayout(pnlInsertBird);
        pnlInsertBird.setLayout(pnlInsertBirdLayout);
        pnlInsertBirdLayout.setHorizontalGroup(
            pnlInsertBirdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInsertBirdLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(pnlInsertBirdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnInsertBird, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblBirdTitle))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlInsertBirdLayout.setVerticalGroup(
            pnlInsertBirdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInsertBirdLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnInsertBird, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblBirdTitle)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlInsertRabbit.setBackground(new java.awt.Color(255, 255, 255));

        btnSelectRabbit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/csc428_p2/image/rabbit_thumbnail.png"))); // NOI18N
        btnSelectRabbit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelectRabbitActionPerformed(evt);
            }
        });

        lblRabbitTitle.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblRabbitTitle.setText("rabbit.jpg");

        javax.swing.GroupLayout pnlInsertRabbitLayout = new javax.swing.GroupLayout(pnlInsertRabbit);
        pnlInsertRabbit.setLayout(pnlInsertRabbitLayout);
        pnlInsertRabbitLayout.setHorizontalGroup(
            pnlInsertRabbitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInsertRabbitLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(lblRabbitTitle)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlInsertRabbitLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSelectRabbit, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55))
        );
        pnlInsertRabbitLayout.setVerticalGroup(
            pnlInsertRabbitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInsertRabbitLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(btnSelectRabbit, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblRabbitTitle)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlInsertFish.setBackground(new java.awt.Color(255, 255, 255));

        btnSelectFish.setIcon(new javax.swing.ImageIcon(getClass().getResource("/csc428_p2/image/fish_thumbnail.png"))); // NOI18N
        btnSelectFish.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelectFishActionPerformed(evt);
            }
        });

        lblFishTitle.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblFishTitle.setText("fish.jpg");

        javax.swing.GroupLayout pnlInsertFishLayout = new javax.swing.GroupLayout(pnlInsertFish);
        pnlInsertFish.setLayout(pnlInsertFishLayout);
        pnlInsertFishLayout.setHorizontalGroup(
            pnlInsertFishLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInsertFishLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlInsertFishLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSelectFish, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFishTitle))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        pnlInsertFishLayout.setVerticalGroup(
            pnlInsertFishLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInsertFishLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnSelectFish, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblFishTitle)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlInsertTurtle.setBackground(new java.awt.Color(255, 255, 255));

        btnSelectTurtle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/csc428_p2/image/turtle_thumbnail.png"))); // NOI18N
        btnSelectTurtle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelectTurtleActionPerformed(evt);
            }
        });

        lblTurtleTitle.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblTurtleTitle.setText("turtle.jpg");

        javax.swing.GroupLayout pnlInsertTurtleLayout = new javax.swing.GroupLayout(pnlInsertTurtle);
        pnlInsertTurtle.setLayout(pnlInsertTurtleLayout);
        pnlInsertTurtleLayout.setHorizontalGroup(
            pnlInsertTurtleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInsertTurtleLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlInsertTurtleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTurtleTitle)
                    .addGroup(pnlInsertTurtleLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(btnSelectTurtle, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        pnlInsertTurtleLayout.setVerticalGroup(
            pnlInsertTurtleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInsertTurtleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnSelectTurtle, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTurtleTitle)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlInsertLayout = new javax.swing.GroupLayout(pnlInsert);
        pnlInsert.setLayout(pnlInsertLayout);
        pnlInsertLayout.setHorizontalGroup(
            pnlInsertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInsertLayout.createSequentialGroup()
                .addContainerGap(237, Short.MAX_VALUE)
                .addGroup(pnlInsertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(pnlInsertLayout.createSequentialGroup()
                        .addComponent(pnlInsertRabbit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pnlInsertFish, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlInsertLayout.createSequentialGroup()
                        .addComponent(pnlInsertCat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(151, 151, 151)
                        .addComponent(pnlInsertDog, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)))
                .addGap(102, 102, 102)
                .addGroup(pnlInsertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlInsertTurtle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlInsertBird, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(126, 126, 126))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlInsertLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnInsert)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCancel)
                .addGap(29, 29, 29))
        );
        pnlInsertLayout.setVerticalGroup(
            pnlInsertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInsertLayout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addGroup(pnlInsertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlInsertDog, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlInsertBird, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlInsertCat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(pnlInsertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlInsertLayout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(pnlInsertTurtle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlInsertLayout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(pnlInsertFish, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlInsertLayout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(pnlInsertRabbit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                .addGroup(pnlInsertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancel)
                    .addComponent(btnInsert))
                .addGap(27, 27, 27))
        );

        lblSidebar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/csc428_p2/image/InsertSidebar.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblSidebar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlInsert, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblSidebar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(pnlInsert, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Button even that checks which picture was selected and then sends it back
     * @param evt 
     */
    private void btnInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertActionPerformed
        if (catSelected) {
            parent.mapImageToSlide("cat");
        } else if (dogSelected) {
            parent.mapImageToSlide("dog");
        } else if (birdSelected) {
            parent.mapImageToSlide("bird");
        } else if (rabbitSelected) {
            parent.mapImageToSlide("rabbit");
        } else if (fishSelected) {
            parent.mapImageToSlide("fish");
        } else if (turtleSelected) {
            parent.mapImageToSlide("turtle");
        } 
        parent.setContentsVisible();
        this.dispose();
    }//GEN-LAST:event_btnInsertActionPerformed

    /**
     * Button that cancels the Insert Image screen and returns to the previous
     * page
     * @param evt 
     */
    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        parent.setContentsVisible();
        this.dispose();
    }//GEN-LAST:event_btnCancelActionPerformed

    /**
     * Selects the cat image and de-selects all others
     * @param evt 
     */
    private void btnSelectCatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelectCatActionPerformed
        catSelected = !catSelected;
        if (catSelected) {
            pnlInsertCat.setBackground(Color.LIGHT_GRAY);
            dogSelected = false;
            pnlInsertDog.setBackground(Color.WHITE);
            birdSelected = false;
            pnlInsertBird.setBackground(Color.WHITE);
            rabbitSelected = false;
            pnlInsertRabbit.setBackground(Color.WHITE);
            fishSelected = false;
            pnlInsertFish.setBackground(Color.WHITE);
            turtleSelected = false;
            pnlInsertTurtle.setBackground(Color.WHITE);
        } else {
            pnlInsertCat.setBackground(Color.WHITE);
        }
    }//GEN-LAST:event_btnSelectCatActionPerformed

    /**
     * Selects the dog image and de-selects all others
     * @param evt 
     */
    private void btnSelectDogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelectDogActionPerformed
        dogSelected = !dogSelected;
        if (dogSelected) {
            pnlInsertDog.setBackground(Color.LIGHT_GRAY);
            catSelected = false;
            pnlInsertCat.setBackground(Color.WHITE);
            birdSelected = false;
            pnlInsertBird.setBackground(Color.WHITE);
            rabbitSelected = false;
            pnlInsertRabbit.setBackground(Color.WHITE);
            fishSelected = false;
            pnlInsertFish.setBackground(Color.WHITE);
            turtleSelected = false;
            pnlInsertTurtle.setBackground(Color.WHITE);
        } else {
            pnlInsertDog.setBackground(Color.WHITE);
        }
    }//GEN-LAST:event_btnSelectDogActionPerformed

    /**
     * Selects the bird image and de-selects all others
     * @param evt 
     */
    private void btnInsertBirdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertBirdActionPerformed
        birdSelected = !birdSelected;
        if (birdSelected) {
            pnlInsertBird.setBackground(Color.LIGHT_GRAY);
            catSelected = false;
            pnlInsertCat.setBackground(Color.WHITE);
            dogSelected = false;
            pnlInsertDog.setBackground(Color.WHITE);
            rabbitSelected = false;
            pnlInsertRabbit.setBackground(Color.WHITE);
            fishSelected = false;
            pnlInsertFish.setBackground(Color.WHITE);
            turtleSelected = false;
            pnlInsertTurtle.setBackground(Color.WHITE);
        } else {
            pnlInsertBird.setBackground(Color.WHITE);
        }
    }//GEN-LAST:event_btnInsertBirdActionPerformed

    /**
     * Selects the rabbit image and de-selects all others
     * @param evt 
     */
    private void btnSelectRabbitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelectRabbitActionPerformed
        rabbitSelected = !rabbitSelected;
        if (rabbitSelected) {
            pnlInsertRabbit.setBackground(Color.LIGHT_GRAY);
            catSelected = false;
            pnlInsertCat.setBackground(Color.WHITE);
            dogSelected = false;
            pnlInsertDog.setBackground(Color.WHITE);
            birdSelected = false;
            pnlInsertBird.setBackground(Color.WHITE);
            fishSelected = false;
            pnlInsertFish.setBackground(Color.WHITE);
            turtleSelected = false;
            pnlInsertTurtle.setBackground(Color.WHITE);
        } else {
            pnlInsertRabbit.setBackground(Color.WHITE);
        }
    }//GEN-LAST:event_btnSelectRabbitActionPerformed

    /**
     * Selects the fish image and de-selects all others
     * @param evt 
     */
    private void btnSelectFishActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelectFishActionPerformed
        fishSelected = !fishSelected;
        if (fishSelected) {
            pnlInsertFish.setBackground(Color.LIGHT_GRAY);
            catSelected = false;
            pnlInsertCat.setBackground(Color.WHITE);
            dogSelected = false;
            pnlInsertDog.setBackground(Color.WHITE);
            birdSelected = false;
            pnlInsertBird.setBackground(Color.WHITE);
            rabbitSelected = false;
            pnlInsertRabbit.setBackground(Color.WHITE);
            turtleSelected = false;
            pnlInsertTurtle.setBackground(Color.WHITE);
        } else {
            pnlInsertFish.setBackground(Color.WHITE);
        }
    }//GEN-LAST:event_btnSelectFishActionPerformed

    /**
     * Selects the turtle image and de-selects all others
     * @param evt 
     */
    private void btnSelectTurtleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelectTurtleActionPerformed
        turtleSelected = !turtleSelected;
        if (turtleSelected) {
            pnlInsertTurtle.setBackground(Color.LIGHT_GRAY);
            catSelected = false;
            pnlInsertCat.setBackground(Color.WHITE);
            dogSelected = false;
            pnlInsertDog.setBackground(Color.WHITE);
            birdSelected = false;
            pnlInsertBird.setBackground(Color.WHITE);
            rabbitSelected = false;
            pnlInsertRabbit.setBackground(Color.WHITE);
            fishSelected = false;
            pnlInsertFish.setBackground(Color.WHITE);
        } else {
            pnlInsertTurtle.setBackground(Color.WHITE);
        }
    }//GEN-LAST:event_btnSelectTurtleActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnInsert;
    private javax.swing.JButton btnInsertBird;
    private javax.swing.JButton btnSelectCat;
    private javax.swing.JButton btnSelectDog;
    private javax.swing.JButton btnSelectFish;
    private javax.swing.JButton btnSelectRabbit;
    private javax.swing.JButton btnSelectTurtle;
    private javax.swing.ButtonGroup btngrpInsert;
    private javax.swing.JLabel lblBirdTitle;
    private javax.swing.JLabel lblCatTitle;
    private javax.swing.JLabel lblDogTitle;
    private javax.swing.JLabel lblFishTitle;
    private javax.swing.JLabel lblRabbitTitle;
    private javax.swing.JLabel lblSidebar;
    private javax.swing.JLabel lblTurtleTitle;
    private javax.swing.JPanel pnlInsert;
    private javax.swing.JPanel pnlInsertBird;
    private javax.swing.JPanel pnlInsertCat;
    private javax.swing.JPanel pnlInsertDog;
    private javax.swing.JPanel pnlInsertFish;
    private javax.swing.JPanel pnlInsertRabbit;
    private javax.swing.JPanel pnlInsertTurtle;
    // End of variables declaration//GEN-END:variables
}
