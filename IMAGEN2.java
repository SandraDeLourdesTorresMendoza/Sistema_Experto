/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema_experto_rorschach;

/**
 *
 * @author boyst
 */
public class IMAGEN2 extends javax.swing.JFrame {

    /**
     * Creates new form IMAGEN2
     */
    public IMAGEN2() {
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
        IMAGEN2 = new javax.swing.JLabel();
        SIGUIENTE = new javax.swing.JButton();
        IMAGEN22 = new javax.swing.JLabel();
        FHUMANAS = new javax.swing.JButton();
        PAYASOS = new javax.swing.JButton();
        ELEFANTES = new javax.swing.JButton();
        ORGSEXUAL = new javax.swing.JButton();
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

        IMAGEN2.setFont(new java.awt.Font("Century", 1, 14)); // NOI18N
        IMAGEN2.setForeground(new java.awt.Color(0, 0, 51));
        IMAGEN2.setText("IMAGEN 2");

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

        IMAGEN22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistema_experto_rorschach/FIGURA2.jpg"))); // NOI18N
        IMAGEN22.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        FHUMANAS.setBackground(new java.awt.Color(153, 153, 255));
        FHUMANAS.setFont(new java.awt.Font("Century", 1, 10)); // NOI18N
        FHUMANAS.setForeground(new java.awt.Color(0, 0, 51));
        FHUMANAS.setText("FIGURAS HUMANAS ");
        FHUMANAS.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        FHUMANAS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FHUMANASActionPerformed(evt);
            }
        });

        PAYASOS.setBackground(new java.awt.Color(153, 153, 255));
        PAYASOS.setFont(new java.awt.Font("Century", 1, 11)); // NOI18N
        PAYASOS.setForeground(new java.awt.Color(0, 0, 51));
        PAYASOS.setText("PAYASOS ");
        PAYASOS.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        PAYASOS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PAYASOSActionPerformed(evt);
            }
        });

        ELEFANTES.setBackground(new java.awt.Color(153, 153, 255));
        ELEFANTES.setFont(new java.awt.Font("Century", 1, 11)); // NOI18N
        ELEFANTES.setForeground(new java.awt.Color(0, 0, 51));
        ELEFANTES.setText("ELEFANTES");
        ELEFANTES.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        ELEFANTES.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ELEFANTESActionPerformed(evt);
            }
        });

        ORGSEXUAL.setBackground(new java.awt.Color(153, 153, 255));
        ORGSEXUAL.setFont(new java.awt.Font("Century", 1, 11)); // NOI18N
        ORGSEXUAL.setForeground(new java.awt.Color(0, 0, 51));
        ORGSEXUAL.setText("ORGANO SEXUAL");
        ORGSEXUAL.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        ORGSEXUAL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ORGSEXUALActionPerformed(evt);
            }
        });

        PUNTOS.setBackground(new java.awt.Color(204, 204, 255));
        PUNTOS.setFont(new java.awt.Font("Century", 1, 10)); // NOI18N
        PUNTOS.setForeground(new java.awt.Color(0, 0, 102));
        PUNTOS.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 255)));

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
                    .addGroup(jPanel1Layout.createSequentialGroup()
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
                                        .addComponent(IMAGEN2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(FHUMANAS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(PAYASOS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ELEFANTES, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ORGSEXUAL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(PUNTOS, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(ENVIAR)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(IMAGEN22, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(51, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(SIGUIENTE, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(135, 135, 135))))))
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
                        .addComponent(IMAGEN2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5))
                    .addComponent(LOGO))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(IMAGEN22)
                        .addGap(18, 18, 18)
                        .addComponent(SIGUIENTE, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(FHUMANAS, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(PAYASOS, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ELEFANTES, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ORGSEXUAL, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(PUNTOS, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ENVIAR)))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PAYASOSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PAYASOSActionPerformed
        this.PUNTOS.setText("22");// TODO add your handling code here:
    }//GEN-LAST:event_PAYASOSActionPerformed

    private void ELEFANTESActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ELEFANTESActionPerformed
      this.PUNTOS.setText("23");  // TODO add your handling code here:
    }//GEN-LAST:event_ELEFANTESActionPerformed

    private void ORGSEXUALActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ORGSEXUALActionPerformed
      this.PUNTOS.setText("24");// TODO add your handling code here:
    }//GEN-LAST:event_ORGSEXUALActionPerformed

    private void FHUMANASActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FHUMANASActionPerformed
       this.PUNTOS.setText("21"); // TODO add your handling code here:
    }//GEN-LAST:event_FHUMANASActionPerformed

    private void SIGUIENTEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SIGUIENTEMouseClicked
IMAGEN3 imagen3= new IMAGEN3();
imagen3.setVisible(true);
this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_SIGUIENTEMouseClicked

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
            java.util.logging.Logger.getLogger(IMAGEN2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IMAGEN2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IMAGEN2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IMAGEN2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IMAGEN2().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ELEFANTES;
    private javax.swing.JButton ENVIAR;
    private javax.swing.JButton FHUMANAS;
    private javax.swing.JLabel IMAGEN2;
    private javax.swing.JLabel IMAGEN22;
    private javax.swing.JLabel LOGO;
    private javax.swing.JButton ORGSEXUAL;
    private javax.swing.JButton PAYASOS;
    private javax.swing.JTextField PUNTOS;
    private javax.swing.JButton SIGUIENTE;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
