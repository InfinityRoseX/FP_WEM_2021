/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BDDC;

import javax.swing.JOptionPane;

/**
 *
 * @author dedei
 */
public class LogIn extends javax.swing.JDialog {

    private String nom;
    private String contra;

    /**
     * Creates new form LogIn
     */
    public LogIn(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        nom = "No";
        contra = "No";
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

        titulo = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        log = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();
        CajaNom = new javax.swing.JTextField();
        checkU = new javax.swing.JCheckBox();
        mio = new javax.swing.JCheckBox();
        CajaContra = new javax.swing.JPasswordField();
        mcontra = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Inicio de Sesion");

        titulo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        titulo.setText("Inicio de Sesión");

        jLabel1.setText("Usuario:");

        jLabel2.setText("Contraseña:");

        log.setText("Iniciar Sesion");
        log.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logActionPerformed(evt);
            }
        });

        cancelar.setText("Cerrar");
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });

        CajaNom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CajaNomActionPerformed(evt);
            }
        });

        checkU.setText("Pruebas clase");
        checkU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkUActionPerformed(evt);
            }
        });

        mio.setText("Pruebas casa");
        mio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mioActionPerformed(evt);
            }
        });

        mcontra.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        mcontra.setText("Mostrar contraseña");
        mcontra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mcontraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(checkU)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                        .addComponent(log)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cancelar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(mio)
                            .addComponent(titulo)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(CajaNom, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
                                    .addComponent(CajaContra))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(mcontra)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(CajaNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(CajaContra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mcontra))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(mio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(log)
                    .addComponent(cancelar)
                    .addComponent(checkU))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CajaNomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CajaNomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CajaNomActionPerformed

    private void logActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logActionPerformed
        if (CajaNom.getText().length() == 0 || CajaContra.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "No deje datos vacios", "Error", JOptionPane.INFORMATION_MESSAGE);
        } else {
            nom = CajaNom.getText().toString();
            contra = CajaContra.getText().toString();
            dispose();
        }
    }//GEN-LAST:event_logActionPerformed

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        dispose();
    }//GEN-LAST:event_cancelarActionPerformed

    private void checkUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkUActionPerformed
        if (this.checkU.isSelected()) {
            CajaNom.setText("root");
            CajaContra.setText("alumno2021");
            mio.setSelected(false);
        } else {
            CajaNom.setText("");
            CajaContra.setText("");
        }

    }//GEN-LAST:event_checkUActionPerformed

    private void mioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mioActionPerformed
        if (this.mio.isSelected()) {
            CajaNom.setText("root");
            CajaContra.setText("root");
            checkU.setSelected(false);
        } else {
            CajaNom.setText("");
            CajaContra.setText("");
        }
    }//GEN-LAST:event_mioActionPerformed

    private void mcontraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mcontraActionPerformed
        if(mcontra.isSelected() && !checkU.isSelected() && !mio.isSelected())
            CajaContra.setEchoChar((char)0);
        else
            CajaContra.setEchoChar('*');
    }//GEN-LAST:event_mcontraActionPerformed

    public String getUser() {
        String aux = nom;
        nom = "No";
        return aux;
    }

    public String getContra() {
        String aux = contra;
        contra = "No";
        return aux;
    }

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField CajaContra;
    private javax.swing.JTextField CajaNom;
    private javax.swing.JButton cancelar;
    private javax.swing.JCheckBox checkU;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton log;
    private javax.swing.JRadioButton mcontra;
    private javax.swing.JCheckBox mio;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
