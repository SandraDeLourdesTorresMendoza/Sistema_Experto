/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema_experto_rorschach;

/**
 *
 * @author boyst
 */
public class IMAGEN4 extends javax.swing.JFrame {

    /**
     * Creates new form IMAGEN4
     */
    public IMAGEN4() {
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
        IMAGEN4 = new javax.swing.JLabel();
        SIGUIENTE = new javax.swing.JButton();
        IMAGEN44 = new javax.swing.JLabel();
        HOMBRE = new javax.swing.JButton();
        MONSTRUO = new javax.swing.JButton();
        BOTAS = new javax.swing.JButton();
        ANIMALRARO = new javax.swing.JButton();
        PUNTOS = new javax.swing.JTextField();
        ENVIAR1 = new javax.swing.JButton();

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

        IMAGEN4.setFont(new java.awt.Font("Century", 1, 14)); // NOI18N
        IMAGEN4.setForeground(new java.awt.Color(0, 0, 51));
        IMAGEN4.setText("IMAGEN 4");

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

        IMAGEN44.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistema_experto_rorschach/FIGURA4.jpg"))); // NOI18N
        IMAGEN44.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        HOMBRE.setBackground(new java.awt.Color(153, 153, 255));
        HOMBRE.setFont(new java.awt.Font("Century", 1, 11)); // NOI18N
        HOMBRE.setForeground(new java.awt.Color(0, 0, 51));
        HOMBRE.setText("HOMBRE ");
        HOMBRE.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        HOMBRE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HOMBREActionPerformed(evt);
            }
        });

        MONSTRUO.setBackground(new java.awt.Color(153, 153, 255));
        MONSTRUO.setFont(new java.awt.Font("Century", 1, 11)); // NOI18N
        MONSTRUO.setForeground(new java.awt.Color(0, 0, 51));
        MONSTRUO.setText("MONSTRUO");
        MONSTRUO.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        MONSTRUO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MONSTRUOActionPerformed(evt);
            }
        });

        BOTAS.setBackground(new java.awt.Color(153, 153, 255));
        BOTAS.setFont(new java.awt.Font("Century", 1, 11)); // NOI18N
        BOTAS.setForeground(new java.awt.Color(0, 0, 51));
        BOTAS.setText("BOTAS ");
        BOTAS.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        BOTAS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BOTASActionPerformed(evt);
            }
        });

        ANIMALRARO.setBackground(new java.awt.Color(153, 153, 255));
        ANIMALRARO.setFont(new java.awt.Font("Century", 1, 11)); // NOI18N
        ANIMALRARO.setForeground(new java.awt.Color(0, 0, 51));
        ANIMALRARO.setText("ANIMAL ATACADO");
        ANIMALRARO.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        ANIMALRARO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ANIMALRAROActionPerformed(evt);
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

        ENVIAR1.setBackground(new java.awt.Color(0, 0, 153));
        ENVIAR1.setFont(new java.awt.Font("Century", 1, 10)); // NOI18N
        ENVIAR1.setForeground(new java.awt.Color(0, 0, 102));
        ENVIAR1.setText("ENVIAR");
        ENVIAR1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ENVIAR1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(LOGO)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(113, 113, 113)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(149, 149, 149)
                                        .addComponent(IMAGEN4, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(BOTAS, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(HOMBRE, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(ANIMALRARO, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(MONSTRUO, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ENVIAR1)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(11, 11, 11)
                                        .addComponent(PUNTOS, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(SIGUIENTE, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(134, 134, 134))
                            .addComponent(IMAGEN44, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                        .addComponent(IMAGEN4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5))
                    .addComponent(LOGO))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(HOMBRE, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(MONSTRUO, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BOTAS, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ANIMALRARO, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addComponent(SIGUIENTE, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(PUNTOS, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(ENVIAR1))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(IMAGEN44, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MONSTRUOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MONSTRUOActionPerformed
this.PUNTOS.setText("42");        // TODO add your handling code here:
    }//GEN-LAST:event_MONSTRUOActionPerformed

    private void BOTASActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BOTASActionPerformed
this.PUNTOS.setText("43");     // TODO add your handling code here:
    }//GEN-LAST:event_BOTASActionPerformed

    private void ANIMALRAROActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ANIMALRAROActionPerformed
this.PUNTOS.setText("44"); // TODO add your handling code here:
    }//GEN-LAST:event_ANIMALRAROActionPerformed

    private void SIGUIENTEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SIGUIENTEMouseClicked
IMAGEN5 imagen5= new IMAGEN5();
imagen5.setVisible(true);
this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_SIGUIENTEMouseClicked

    private void HOMBREActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HOMBREActionPerformed
this.PUNTOS.setText("41");        // TODO add your handling code here:
    }//GEN-LAST:event_HOMBREActionPerformed

    private void PUNTOSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PUNTOSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PUNTOSActionPerformed

    private void ENVIAR1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ENVIAR1ActionPerformed

        // TODO add your handling code here:
    }//GEN-LAST:event_ENVIAR1ActionPerformed

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
            java.util.logging.Logger.getLogger(IMAGEN4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IMAGEN4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IMAGEN4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IMAGEN4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IMAGEN4().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ANIMALRARO;
    private javax.swing.JButton BOTAS;
    private javax.swing.JButton ENVIAR1;
    private javax.swing.JButton HOMBRE;
    private javax.swing.JLabel IMAGEN4;
    private javax.swing.JLabel IMAGEN44;
    private javax.swing.JLabel LOGO;
    private javax.swing.JButton MONSTRUO;
    private javax.swing.JTextField PUNTOS;
    private javax.swing.JButton SIGUIENTE;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
