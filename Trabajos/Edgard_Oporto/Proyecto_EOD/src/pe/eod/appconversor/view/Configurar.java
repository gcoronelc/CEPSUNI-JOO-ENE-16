/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.eod.appconversor.view;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import pe.eod.appconversor.controller.AppController;

/**
 *
 * @author Master
 */
public class Configurar extends javax.swing.JPanel {

    /**
     * Creates new form NewJPanel
     */
    public Configurar() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtTasa = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnConfirmar = new javax.swing.JButton();

        jLabel1.setText("INGRESE TASA DE CAMBIO");

        jLabel2.setText("1 DOLAR = ");

        txtTasa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTasaActionPerformed(evt);
            }
        });

        jLabel3.setText("SOLES");

        btnConfirmar.setText("CONFIRMAR");
        btnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnConfirmar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTasa, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3))
                    .addComponent(jLabel1))
                .addContainerGap(209, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtTasa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(26, 26, 26)
                .addComponent(btnConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(147, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtTasaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTasaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTasaActionPerformed

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed
        // DEFINICION DE VARIABLES
        double tasa;

        // LECTURA DE DATOS
        tasa = Double.parseDouble(txtTasa.getText());

        // PROCESO 
        AppController controlador;
        controlador = new AppController();
        
        controlador.actualizarTasa(tasa);
        
        // REPORTE
        JOptionPane.showMessageDialog(null, "Tasa actualizada");        
        



// TODO add your handling code here:
    }//GEN-LAST:event_btnConfirmarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField txtTasa;
    // End of variables declaration//GEN-END:variables
}
