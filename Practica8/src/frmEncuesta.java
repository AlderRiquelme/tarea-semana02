
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Alder
 */
public class frmEncuesta extends javax.swing.JFrame {

    /**
     * Creates new form frmEncuesta
     */
    public frmEncuesta() {
        initComponents();
    setTitle("Mini Encuesta");
        setResizable(false);
        
        setLocationRelativeTo(null);
    
    
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        opcionesSistema = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        rboWindows = new javax.swing.JRadioButton();
        rboLinux = new javax.swing.JRadioButton();
        rboMac = new javax.swing.JRadioButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        ckbNetbeans = new javax.swing.JCheckBox();
        ckbEclipse = new javax.swing.JCheckBox();
        ckbJlitellldea = new javax.swing.JCheckBox();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        sdrHoras = new javax.swing.JSlider();
        jButton1 = new javax.swing.JButton();
        txtHoras = new javax.swing.JButton();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel1.setText("Elija un Sistema Operativo");

        rboWindows.setText("Windows");
        rboWindows.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rboWindowsActionPerformed(evt);
            }
        });

        rboLinux.setText("Linux");
        rboLinux.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rboLinuxActionPerformed(evt);
            }
        });

        rboMac.setText("Mac");

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel2.setText("Selecione herramientas Dev");

        ckbNetbeans.setText("Netbeans");
        ckbNetbeans.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ckbNetbeansActionPerformed(evt);
            }
        });

        ckbEclipse.setText("Eclipse");
        ckbEclipse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ckbEclipseActionPerformed(evt);
            }
        });

        ckbJlitellldea.setText("Jlitelldea");
        ckbJlitellldea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ckbJlitellldeaActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel3.setText("Horas dedicadas al Dev");

        sdrHoras.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sdrHorasStateChanged(evt);
            }
        });

        jButton1.setText("Generar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        txtHoras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHorasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(65, 65, 65)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rboMac)
                                    .addComponent(rboLinux)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(rboWindows)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(67, 67, 67)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ckbJlitellldea)
                                    .addComponent(ckbEclipse)
                                    .addComponent(ckbNetbeans)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(sdrHoras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtHoras)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(rboWindows)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rboLinux)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rboMac)
                .addGap(27, 27, 27)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(ckbNetbeans)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ckbEclipse)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ckbJlitellldea, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sdrHoras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHoras, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(66, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rboLinuxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rboLinuxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rboLinuxActionPerformed

    private void ckbNetbeansActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ckbNetbeansActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ckbNetbeansActionPerformed

    private void ckbEclipseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ckbEclipseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ckbEclipseActionPerformed

    private void ckbJlitellldeaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ckbJlitellldeaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ckbJlitellldeaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      String resultado = "Tu sistema operativo preferido es ";
        JRadioButton[] radios = {rboWindows,rboLinux,rboMac};
        for (int i = 0; i < 3; i++) {
            if (radios [i].isSelected()) {
                resultado = resultado + radios[i].getClass();
            }
 
        }
       resultado = resultado + ", \n tu entorno favoritos es";
        JCheckBox[] checks = {ckbNetbeans,ckbEclipse,ckbJlitellldea};
        for (int i = 0; i < 3; i++) {
            if (radios [i].isSelected()) {
                resultado += checks[i].getText();
            }
         resultado += "\n y el número de horas es " + txtHoras.getText();
            JOptionPane.showMessageDialog(this, resultado);
}
    }//GEN-LAST:event_jButton1ActionPerformed

    private void rboWindowsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rboWindowsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rboWindowsActionPerformed

    private void txtHorasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHorasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHorasActionPerformed

    private void sdrHorasStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sdrHorasStateChanged
        txtHoras.setText(String.valueOf(sdrHoras.getValue()));
        
        setTitle("Mini Encuesta");
        setResizable(false);
        
        setLocationRelativeTo(null);
        
    }//GEN-LAST:event_sdrHorasStateChanged

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
            java.util.logging.Logger.getLogger(frmEncuesta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmEncuesta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmEncuesta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmEncuesta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmEncuesta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox ckbEclipse;
    private javax.swing.JCheckBox ckbJlitellldea;
    private javax.swing.JCheckBox ckbNetbeans;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.ButtonGroup opcionesSistema;
    private javax.swing.JRadioButton rboLinux;
    private javax.swing.JRadioButton rboMac;
    private javax.swing.JRadioButton rboWindows;
    private javax.swing.JSlider sdrHoras;
    private javax.swing.JButton txtHoras;
    // End of variables declaration//GEN-END:variables
}
