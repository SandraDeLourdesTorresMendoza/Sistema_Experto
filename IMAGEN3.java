/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema_experto_rorschach;

/**
 *
 * @author boyst
 */
public class IMAGEN3 extends javax.swing.JFrame {

    /**
     * Creates new form IMAGEN3
     */
    public IMAGEN3() {
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
        IMAGEN3 = new javax.swing.JLabel();
        SIGUIENTE = new javax.swing.JButton();
        IMAGEN33 = new javax.swing.JLabel();
        MESEROS = new javax.swing.JButton();
        DOSPERSONAS = new javax.swing.JButton();
        OSEXUAL = new javax.swing.JButton();
        nosedistingue = new javax.swing.JButton();
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

        IMAGEN3.setFont(new java.awt.Font("Century", 1, 14)); // NOI18N
        IMAGEN3.setForeground(new java.awt.Color(0, 0, 51));
        IMAGEN3.setText("IMAGEN 3");

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

        IMAGEN33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistema_experto_rorschach/FIGURA3.jpg"))); // NOI18N
        IMAGEN33.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        MESEROS.setBackground(new java.awt.Color(153, 153, 255));
        MESEROS.setFont(new java.awt.Font("Century", 1, 11)); // NOI18N
        MESEROS.setForeground(new java.awt.Color(0, 0, 51));
        MESEROS.setText("MESEROS");
        MESEROS.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        MESEROS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MESEROSActionPerformed(evt);
            }
        });

        DOSPERSONAS.setBackground(new java.awt.Color(153, 153, 255));
        DOSPERSONAS.setFont(new java.awt.Font("Century", 1, 11)); // NOI18N
        DOSPERSONAS.setForeground(new java.awt.Color(0, 0, 51));
        DOSPERSONAS.setText("DOS PERSONAS ");
        DOSPERSONAS.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        DOSPERSONAS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DOSPERSONASActionPerformed(evt);
            }
        });

        OSEXUAL.setBackground(new java.awt.Color(153, 153, 255));
        OSEXUAL.setFont(new java.awt.Font("Century", 1, 11)); // NOI18N
        OSEXUAL.setForeground(new java.awt.Color(0, 0, 51));
        OSEXUAL.setText("ORGANO SEXUAL");
        OSEXUAL.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        OSEXUAL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OSEXUALActionPerformed(evt);
            }
        });

        nosedistingue.setBackground(new java.awt.Color(153, 153, 255));
        nosedistingue.setFont(new java.awt.Font("Century", 1, 11)); // NOI18N
        nosedistingue.setForeground(new java.awt.Color(0, 0, 51));
        nosedistingue.setText("NO SE DISTINGUE");
        nosedistingue.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        nosedistingue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nosedistingueActionPerformed(evt);
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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(LOGO)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(113, 113, 113)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(149, 149, 149)
                                        .addComponent(IMAGEN3, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(MESEROS, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DOSPERSONAS, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nosedistingue, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(OSEXUAL)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(PUNTOS, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(ENVIAR)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(IMAGEN33)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(SIGUIENTE, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(127, 127, 127)))))
                .addContainerGap(15, Short.MAX_VALUE))
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
                        .addComponent(IMAGEN3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5))
                    .addComponent(LOGO))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(IMAGEN33)
                        .addGap(18, 18, 18)
                        .addComponent(SIGUIENTE, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(MESEROS, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(DOSPERSONAS, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(OSEXUAL, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(nosedistingue, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(PUNTOS, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ENVIAR)))
                .addContainerGap(23, Short.MAX_VALUE))
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

    private void DOSPERSONASActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DOSPERSONASActionPerformed
      this.PUNTOS.setText("32");  // TODO add your handling code here:
    }//GEN-LAST:event_DOSPERSONASActionPerformed

    private void OSEXUALActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OSEXUALActionPerformed
       this.PUNTOS.setText("33");// TODO add your handling code here:
    }//GEN-LAST:event_OSEXUALActionPerformed

    private void nosedistingueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nosedistingueActionPerformed
      this.PUNTOS.setText("34");                
    }//GEN-LAST:event_nosedistingueActionPerformed

    private void SIGUIENTEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SIGUIENTEMouseClicked
IMAGEN4 imagen4= new IMAGEN4();
imagen4.setVisible(true);
this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_SIGUIENTEMouseClicked

    private void MESEROSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MESEROSActionPerformed
     this.PUNTOS.setText("31");        // TODO add your handling code here:
    }//GEN-LAST:event_MESEROSActionPerformed

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
            java.util.logging.Logger.getLogger(IMAGEN3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IMAGEN3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IMAGEN3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IMAGEN3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IMAGEN3().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DOSPERSONAS;
    private javax.swing.JButton ENVIAR;
    private javax.swing.JLabel IMAGEN3;
    private javax.swing.JLabel IMAGEN33;
    private javax.swing.JLabel LOGO;
    private javax.swing.JButton MESEROS;
    private javax.swing.JButton OSEXUAL;
    private javax.swing.JTextField PUNTOS;
    private javax.swing.JButton SIGUIENTE;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton nosedistingue;
    // End of variables declaration//GEN-END:variables
}