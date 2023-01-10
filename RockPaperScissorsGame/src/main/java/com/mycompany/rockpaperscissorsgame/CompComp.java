
package com.mycompany.rockpaperscissorsgame;

import java.awt.Color;


public class CompComp extends javax.swing.JFrame {

    
    public CompComp() {
        initComponents();
         getContentPane().setBackground(Color.darkGray);
          bbText.setForeground(Color.white);
          oyuncuAdiText.setForeground(Color.white);
          oyuncuIDText.setForeground(Color.white);
          bil1Text.setForeground(Color.white);
          bil2Text.setForeground(Color.white);
          Skor1.setForeground(Color.white);
          Skor2.setForeground(Color.white);
          
    }
    int computer1= 0, computer2= 0, computerSkor1=0, computerSkor2=0;
    String user="";
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        bbText = new javax.swing.JLabel();
        oyuncuAdiText = new javax.swing.JLabel();
        oyuncuAdiSpace = new javax.swing.JTextField();
        oyuncuIDText = new javax.swing.JLabel();
        oyuncuIDSpace = new javax.swing.JTextField();
        Oyna = new javax.swing.JButton();
        Oynabb = new javax.swing.JButton();
        bil1Text = new javax.swing.JLabel();
        Nesne1 = new javax.swing.JComboBox<>();
        Nesne2 = new javax.swing.JComboBox<>();
        bil2Text = new javax.swing.JLabel();
        ButonR1 = new javax.swing.JButton();
        ButonR2 = new javax.swing.JButton();
        Sonuc = new javax.swing.JLabel();
        Skor1 = new javax.swing.JLabel();
        Skor2 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bbText.setText("         BİLGİSAYAR  - BİLGİSAYAR");

        oyuncuAdiText.setText("Oyuncu Adı:");

        oyuncuAdiSpace.setText("Oyuncu Adı");
        oyuncuAdiSpace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oyuncuAdiSpaceActionPerformed(evt);
            }
        });

        oyuncuIDText.setText("Oyuncu ID:");

        oyuncuIDSpace.setText("Oyuncu ID");
        oyuncuIDSpace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oyuncuIDSpaceActionPerformed(evt);
            }
        });

        Oyna.setText("BAŞLA");
        Oyna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OynaActionPerformed(evt);
            }
        });

        Oynabb.setText("OYNA");
        Oynabb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OynabbActionPerformed(evt);
            }
        });

        bil1Text.setText("Bilgisayar 1:");

        Nesne1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tas", "Kagit", "Makas" }));
        Nesne1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Nesne1ActionPerformed(evt);
            }
        });

        Nesne2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tas", "Kagit", "Makas" }));
        Nesne2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Nesne2ActionPerformed(evt);
            }
        });

        bil2Text.setText("Bilgisayar 2:");

        ButonR1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ButonR1ItemStateChanged(evt);
            }
        });

        ButonR2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButonR2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(oyuncuAdiText, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(31, 31, 31)
                                        .addComponent(oyuncuAdiSpace, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(179, 179, 179)
                                        .addComponent(bbText, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(bil1Text, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Skor1, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(56, 56, 56)
                                .addComponent(Nesne1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(oyuncuIDSpace, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(Oyna)
                                .addGap(142, 142, 142))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(bil2Text, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Skor2, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Nesne2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(70, 70, 70))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ButonR1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(115, 115, 115)
                        .addComponent(Sonuc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(97, 97, 97)
                        .addComponent(ButonR2, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(122, 122, 122))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Oynabb)
                    .addComponent(oyuncuIDText, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(375, 375, 375))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(bbText, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(oyuncuAdiText, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(oyuncuAdiSpace, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Oyna)
                        .addComponent(oyuncuIDSpace, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(oyuncuIDText, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(59, 59, 59)
                .addComponent(Oynabb)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bil1Text, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Nesne1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bil2Text, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Nesne2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Skor1)
                            .addComponent(Skor2))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(ButonR1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(65, 65, 65)
                                .addComponent(Sonuc, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(ButonR2, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 153, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void oyuncuAdiSpaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oyuncuAdiSpaceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_oyuncuAdiSpaceActionPerformed

    private void oyuncuIDSpaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oyuncuIDSpaceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_oyuncuIDSpaceActionPerformed

    private void OynaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OynaActionPerformed
        String ad1=oyuncuAdiSpace.getText();
        String Id1=oyuncuIDSpace.getText();       
        oyuncuAdiSpace.setEnabled(false);
        oyuncuIDSpace.setEnabled(false);
        ButonR1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Photos/Computer.jpg")));
        ButonR2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Photos/Computer.jpg")));
        
    }//GEN-LAST:event_OynaActionPerformed

    private void OynabbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OynabbActionPerformed
        
        computer1 = (int) (Math.random() * 3);
        Nesne1.setSelectedIndex(computer1);
        if (computer1 == 0) {
            ButonR1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Photos/Rock.jpg")));
        } else if (computer1 == 1) {
            ButonR1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Photos/Paper.png")));
        } else if (computer1 == 2) {
            ButonR1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Photos/Scissors.jpg")));
        }   
        computer2 = (int) (Math.random() * 3);
        Nesne2.setSelectedIndex(computer2);
        if (computer2 == 0) {
            ButonR2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Photos/Rock.jpg")));
        } else if (computer2 == 1) {
            ButonR2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Photos/Paper.png")));
        } else if (computer2 == 2) {
            ButonR2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Photos/Scissors.jpg")));
        }   
        kontrol();
    }//GEN-LAST:event_OynabbActionPerformed
        public void kontrol(){
            if (computer1 == 0 & computer2 == 0 ||computer1 == 1 & computer2 == 1 & computer1 == 2 & computer2 == 2) {
            Sonuc.setText("Draw.");
        } else if (computer1 == 0 & computer2 == 1 || computer1 == 1 & computer2 == 2 || computer1 == 2 & computer2 == 0) {
            Sonuc.setText("Computer2 won.");
            computerSkor2++;
        } else if (computer1 == 0 & computer2 == 2 || computer1 == 1 & computer2 == 0 || computer1 == 2 & computer2 == 1) {
            Sonuc.setText(" Computer1 won.");
            computerSkor1++;
        }
        Skor1.setText(String.valueOf(computerSkor1));
        Skor2.setText(String.valueOf(computerSkor2));
        }
    private void Nesne2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Nesne2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Nesne2ActionPerformed

    private void Nesne1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Nesne1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Nesne1ActionPerformed

    private void ButonR2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButonR2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ButonR2ActionPerformed

    private void ButonR1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ButonR1ItemStateChanged
          
    }//GEN-LAST:event_ButonR1ItemStateChanged

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
            java.util.logging.Logger.getLogger(CompComp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CompComp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CompComp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CompComp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CompComp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButonR1;
    private javax.swing.JButton ButonR2;
    private javax.swing.JComboBox<String> Nesne1;
    private javax.swing.JComboBox<String> Nesne2;
    private javax.swing.JButton Oyna;
    private javax.swing.JButton Oynabb;
    private javax.swing.JLabel Skor1;
    private javax.swing.JLabel Skor2;
    private javax.swing.JLabel Sonuc;
    private javax.swing.JLabel bbText;
    private javax.swing.JLabel bil1Text;
    private javax.swing.JLabel bil2Text;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField oyuncuAdiSpace;
    private javax.swing.JLabel oyuncuAdiText;
    private javax.swing.JTextField oyuncuIDSpace;
    private javax.swing.JLabel oyuncuIDText;
    // End of variables declaration//GEN-END:variables
}
