/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema_experto_rorschach;

/**
 *
 * @author boyst
 */
public class IMAGEN9 extends javax.swing.JFrame {

    /**
     * Creates new form IMAGEN9
     */
    public IMAGEN9() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    public static String puntos = "";

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        LOGO = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        IMAGEN9 = new javax.swing.JLabel();
        SIGUIENTE = new javax.swing.JButton();
        IMAGEN99 = new javax.swing.JLabel();
        VENADO = new javax.swing.JButton();
        JARDIN = new javax.swing.JButton();
        ORGANO = new javax.swing.JButton();
        SINFORMA = new javax.swing.JButton();
        PUNTOS = new javax.swing.JTextField();
        ENVIAR = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        LOGO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistema_experto_rorschach/1.jpg"))); // NOI18N
        LOGO.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 51)));

        jLabel2.setFont(new java.awt.Font("Century", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 51));
        jLabel2.setText("TEST DE PERSONALIDAD ");

        jLabel5.setFont(new java.awt.Font("Century", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 51));
        jLabel5.setText("RORSCHACH");

        IMAGEN9.setFont(new java.awt.Font("Century", 1, 14)); // NOI18N
        IMAGEN9.setForeground(new java.awt.Color(0, 0, 51));
        IMAGEN9.setText("IMAGEN 9");

        SIGUIENTE.setBackground(new java.awt.Color(153, 153, 255));
        SIGUIENTE.setFont(new java.awt.Font("Century", 1, 11)); // NOI18N
        SIGUIENTE.setForeground(new java.awt.Color(0, 0, 51));
        SIGUIENTE.setText("SIGUIENTE");
        SIGUIENTE.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        SIGUIENTE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SIGUIENTEMouseClicked(evt);
            }
        });

        IMAGEN99.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistema_experto_rorschach/FIGURA9.jpg"))); // NOI18N
        IMAGEN99.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        VENADO.setBackground(new java.awt.Color(153, 153, 255));
        VENADO.setFont(new java.awt.Font("Century", 1, 11)); // NOI18N
        VENADO.setForeground(new java.awt.Color(0, 0, 51));
        VENADO.setText("VENADO");
        VENADO.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        VENADO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VENADOActionPerformed(evt);
            }
        });

        JARDIN.setBackground(new java.awt.Color(153, 153, 255));
        JARDIN.setFont(new java.awt.Font("Century", 1, 11)); // NOI18N
        JARDIN.setForeground(new java.awt.Color(0, 0, 51));
        JARDIN.setText("JARDIN CON FLORES");
        JARDIN.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        JARDIN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JARDINActionPerformed(evt);
            }
        });

        ORGANO.setBackground(new java.awt.Color(153, 153, 255));
        ORGANO.setFont(new java.awt.Font("Century", 1, 11)); // NOI18N
        ORGANO.setForeground(new java.awt.Color(0, 0, 51));
        ORGANO.setText("ORGANO SEXUAL");
        ORGANO.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        ORGANO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ORGANOActionPerformed(evt);
            }
        });

        SINFORMA.setBackground(new java.awt.Color(153, 153, 255));
        SINFORMA.setFont(new java.awt.Font("Century", 1, 11)); // NOI18N
        SINFORMA.setForeground(new java.awt.Color(0, 0, 51));
        SINFORMA.setText("SIN FORMA");
        SINFORMA.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        SINFORMA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SINFORMAActionPerformed(evt);
            }
        });

        PUNTOS.setBackground(new java.awt.Color(204, 204, 255));
        PUNTOS.setFont(new java.awt.Font("Century", 1, 10)); // NOI18N
        PUNTOS.setForeground(new java.awt.Color(0, 0, 102));
        PUNTOS.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 255)));
        PUNTOS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PUNTOSActionPerformed(evt);
            }
        });

        ENVIAR.setBackground(new java.awt.Color(0, 0, 153));
        ENVIAR.setFont(new java.awt.Font("Century", 1, 10)); // NOI18N
        ENVIAR.setForeground(new java.awt.Color(0, 0, 102));
        ENVIAR.setText("ENVIAR");
        ENVIAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ENVIARActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(LOGO)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(113, 113, 113)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(149, 149, 149)
                                        .addComponent(IMAGEN9, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(VENADO, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(SINFORMA, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(ORGANO, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(JARDIN)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(29, 29, 29)
                                        .addComponent(PUNTOS, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(ENVIAR)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(IMAGEN99)
                        .addGap(39, 39, 39)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(SIGUIENTE, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(144, 144, 144))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(IMAGEN9, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5))
                    .addComponent(LOGO))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(VENADO, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(JARDIN, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addComponent(ORGANO, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(SINFORMA, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(PUNTOS, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(ENVIAR))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(IMAGEN99)))
                .addGap(18, 18, 18)
                .addComponent(SIGUIENTE, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 484, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JARDINActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JARDINActionPerformed
this.PUNTOS.setText("92");        // TODO add your handling code here:
    }//GEN-LAST:event_JARDINActionPerformed

    private void ORGANOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ORGANOActionPerformed
this.PUNTOS.setText("93");        // TODO add your handling code here:
    }//GEN-LAST:event_ORGANOActionPerformed

    private void SINFORMAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SINFORMAActionPerformed
this.PUNTOS.setText("94");        // TODO add your handling code here:
    }//GEN-LAST:event_SINFORMAActionPerformed

    private void SIGUIENTEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SIGUIENTEMouseClicked
IMAGEN10 imagen10= new IMAGEN10();
imagen10.setVisible( true);
this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_SIGUIENTEMouseClicked

    private void VENADOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VENADOActionPerformed
this.PUNTOS.setText("91");      // TODO add your handling code here:
    }//GEN-LAST:event_VENADOActionPerformed

    private void PUNTOSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PUNTOSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PUNTOSActionPerformed

    private void ENVIARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ENVIARActionPerformed

        // TODO add your handling code here:
    }//GEN-LAST:event_ENVIARActionPerformed

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
            java.util.logging.Logger.getLogger(IMAGEN9.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IMAGEN9.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IMAGEN9.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IMAGEN9.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IMAGEN9().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ENVIAR;
    private javax.swing.JLabel IMAGEN9;
    private javax.swing.JLabel IMAGEN99;
    private javax.swing.JButton JARDIN;
    private javax.swing.JLabel LOGO;
    private javax.swing.JButton ORGANO;
    private javax.swing.JTextField PUNTOS;
    private javax.swing.JButton SIGUIENTE;
    private javax.swing.JButton SINFORMA;
    private javax.swing.JButton VENADO;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
