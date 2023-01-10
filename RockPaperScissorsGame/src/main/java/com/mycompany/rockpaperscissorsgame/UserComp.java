
package com.mycompany.rockpaperscissorsgame;

import java.awt.Color;


public class UserComp extends javax.swing.JFrame {

   
    public UserComp() {
        initComponents();
         getContentPane().setBackground(Color.darkGray);
          jLabel1.setForeground(Color.white);
          jLabel5.setForeground(Color.white);
          jLabel6.setForeground(Color.white);
          kullanıcıText.setForeground(Color.white);
          bil3Text.setForeground(Color.white);
          bilskor.setForeground(Color.white);
          kulskor.setForeground(Color.white);
          
    }
    int player=0, computer=0, computerSkor= 0, playerSkor= 0;
    String playerName="";    

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        OAKutusu1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        OIDKutusu1 = new javax.swing.JTextField();
        OynaKB = new javax.swing.JButton();
        kullanıcıText = new javax.swing.JLabel();
        NesneKul = new javax.swing.JComboBox<>();
        bil3Text = new javax.swing.JLabel();
        NesneBkb = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        ButonR4 = new javax.swing.JButton();
        ButonR3 = new javax.swing.JButton();
        Sonuc = new javax.swing.JLabel();
        bilskor = new javax.swing.JLabel();
        kulskor = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("         KULLANICI  - BİLGİSAYAR");

        jLabel5.setText("Oyuncu ID:");

        OAKutusu1.setText("Oyuncu Adı");
        OAKutusu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OAKutusu1ActionPerformed(evt);
            }
        });

        jLabel6.setText("Oyuncu ID:");

        OIDKutusu1.setText("Oyuncu ID");
        OIDKutusu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OIDKutusu1ActionPerformed(evt);
            }
        });

        OynaKB.setText("OYNA");
        OynaKB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OynaKBActionPerformed(evt);
            }
        });

        kullanıcıText.setText("Kullanıcı:");

        NesneKul.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tas", "Kagit", "Makas" }));
        NesneKul.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                NesneKulItemStateChanged(evt);
            }
        });
        NesneKul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NesneKulActionPerformed(evt);
            }
        });

        bil3Text.setText("Bilgisayar :");

        NesneBkb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tas", "Kagit", "Makas" }));
        NesneBkb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NesneBkbActionPerformed(evt);
            }
        });

        jButton2.setText("BAŞLA");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        ButonR4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButonR4ActionPerformed(evt);
            }
        });

        bilskor.setText("0");

        kulskor.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bil3Text, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bilskor, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(NesneBkb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(OAKutusu1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(51, 51, 51)
                                .addComponent(OIDKutusu1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(106, 106, 106)
                                .addComponent(jButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(kullanıcıText, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(kulskor, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(75, 75, 75)))
                        .addComponent(NesneKul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ButonR3, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(123, 123, 123)
                        .addComponent(Sonuc, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59)
                        .addComponent(ButonR4, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(54, 54, 54))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(281, 281, 281)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(348, 348, 348)
                        .addComponent(OynaKB)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(OAKutusu1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(OIDKutusu1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(NesneBkb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bil3Text, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(kullanıcıText, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NesneKul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bilskor)
                            .addComponent(kulskor))
                        .addGap(30, 30, 30))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(OynaKB)
                        .addGap(64, 64, 64)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ButonR3, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButonR4, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(Sonuc, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(84, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void OIDKutusu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OIDKutusu1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_OIDKutusu1ActionPerformed

    private void OAKutusu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OAKutusu1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_OAKutusu1ActionPerformed

    private void OynaKBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OynaKBActionPerformed
       computer = (int) (Math.random() * 3);
        NesneBkb.setSelectedIndex(computer);
        if (computer == 0) {
            ButonR3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Photos/Rock.jpg")));
        } else if (computer == 1) {
            ButonR3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Photos/Paper.png")));
        } else if (computer == 2) {
            ButonR3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Photos/Scissors.jpg")));
        }   
    }//GEN-LAST:event_OynaKBActionPerformed
   public void kontrol() {
       
        if (player == 0 & computer == 0 || player == 1 & computer == 1 & player == 2 & computer == 2) {
            Sonuc.setText("Draw.");
        } else if (player == 0 & computer == 1 || player == 1 & computer == 2 || player == 2 & computer == 0) {
            Sonuc.setText("Computer won.");
            computerSkor++;
        } else if (player == 0 & computer == 2 || player == 1 & computer == 0 || player == 2 & computer == 1) {
            Sonuc.setText(playerName + " won.");
            playerSkor++;
        }
        kulskor.setText(String.valueOf(playerSkor));
        bilskor.setText(String.valueOf(computerSkor));

    }
    
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String ad2=OAKutusu1.getText();
        String Id2=OIDKutusu1.getText();
        NesneBkb.setEnabled(false);
        OAKutusu1.setEnabled(false);
        OIDKutusu1.setEnabled(false);
        ButonR3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Photos/Computer.jpg")));
        ButonR4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Photos/player.jpg")));
    }//GEN-LAST:event_jButton2ActionPerformed

    private void NesneBkbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NesneBkbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NesneBkbActionPerformed

    private void ButonR4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButonR4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ButonR4ActionPerformed

    private void NesneKulItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_NesneKulItemStateChanged
         if(String.valueOf(NesneKul.getSelectedItem())=="tas")
             ButonR4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Photos/Rock.jpg")));
        else if(String.valueOf(NesneKul.getSelectedItem())=="kagit")
            ButonR4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Photos/Paper.png")));
        else if(String.valueOf(NesneKul.getSelectedItem())=="makas")
              ButonR4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Photos/Scissors.jpg")));
    }//GEN-LAST:event_NesneKulItemStateChanged

    private void NesneKulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NesneKulActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NesneKulActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UserComp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserComp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserComp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserComp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserComp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButonR3;
    private javax.swing.JButton ButonR4;
    private javax.swing.JComboBox<String> NesneBkb;
    private javax.swing.JComboBox<String> NesneKul;
    private javax.swing.JTextField OAKutusu1;
    private javax.swing.JTextField OIDKutusu1;
    private javax.swing.JButton OynaKB;
    private javax.swing.JLabel Sonuc;
    private javax.swing.JLabel bil3Text;
    private javax.swing.JLabel bilskor;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel kullanıcıText;
    private javax.swing.JLabel kulskor;
    // End of variables declaration//GEN-END:variables
}
