package projectestructura;
import javax.swing.DefaultListModel;
import java.io.File;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
public class alquilarlibros extends javax.swing.JFrame {

    DefaultListModel agregar1= new DefaultListModel();
    
     DefaultListModel cosas= new DefaultListModel();
    
    
    JFileChooser seleccionado = new JFileChooser();
    File archivo;
    alquilar alquilar=new alquilar();
    public alquilarlibros() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ltotal = new javax.swing.JList();
        jLabel2 = new javax.swing.JLabel();
        txttitulo = new javax.swing.JTextField();
        btnatras = new javax.swing.JButton();
        btnagregar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtautor = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtnombreadquiriente = new javax.swing.JTextField();
        btnabrirarchivo = new javax.swing.JButton();
        btnguardararchivo = new javax.swing.JButton();
        btneliminar = new javax.swing.JButton();
        btncreararchivo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Libros");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 270, 70));

        jScrollPane1.setViewportView(ltotal);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 750, 240));

        jLabel2.setText("titulo");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, -1));
        jPanel1.add(txttitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, 200, -1));

        btnatras.setText("atras");
        btnatras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnatrasActionPerformed(evt);
            }
        });
        jPanel1.add(btnatras, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 480, -1, -1));

        btnagregar.setText("agregar");
        btnagregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnagregarActionPerformed(evt);
            }
        });
        jPanel1.add(btnagregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 480, -1, -1));

        jLabel3.setText("autor");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));
        jPanel1.add(txtautor, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, 200, -1));

        jLabel4.setText("nombre del adquiriente");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 110, -1, -1));
        jPanel1.add(txtnombreadquiriente, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 110, 200, -1));

        btnabrirarchivo.setText("abrir archivo");
        btnabrirarchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnabrirarchivoActionPerformed(evt);
            }
        });
        jPanel1.add(btnabrirarchivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 480, -1, -1));

        btnguardararchivo.setText("guardar archivo");
        btnguardararchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardararchivoActionPerformed(evt);
            }
        });
        jPanel1.add(btnguardararchivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 480, -1, -1));

        btneliminar.setText("eliminar");
        btneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btneliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 480, -1, -1));

        btncreararchivo.setText("crear archivo");
        btncreararchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncreararchivoActionPerformed(evt);
            }
        });
        jPanel1.add(btncreararchivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 440, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnagregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnagregarActionPerformed
    agregar1.addElement(txttitulo.getText()+"                      "+txtautor.getText()+"                      "+txtnombreadquiriente.getText());
    ltotal.setModel(agregar1);
    txttitulo.setText("");
    txtautor.setText("");
    txtnombreadquiriente.setText("");
    }//GEN-LAST:event_btnagregarActionPerformed

    private void btnabrirarchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnabrirarchivoActionPerformed
    if(seleccionado.showDialog(null,"abrir txt")==JFileChooser.APPROVE_OPTION)
     {
         archivo=seleccionado.getSelectedFile();
         if(archivo.canRead())
         {
             if(archivo.getName().endsWith("txt"))
             {
                 String contenido =alquilar.abrirarchivo(archivo);
                 cosas.addElement(contenido);
                 ltotal.setModel(cosas);
             }
         }
     }
    }//GEN-LAST:event_btnabrirarchivoActionPerformed

    private void btnguardararchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardararchivoActionPerformed
       if(seleccionado.showDialog(null,"guardar txt")== JFileChooser.APPROVE_OPTION)
        {
            archivo=seleccionado.getSelectedFile();
            if(archivo.getName().endsWith("txt"))
            {
                String contenido,respuesta;
                contenido=""+ltotal.getModel();
                
                respuesta = alquilar.guardararchivo(archivo, contenido);
                if(respuesta!=null)
                {
                    JOptionPane.showMessageDialog(null,respuesta);
                }else
                {
                    JOptionPane.showMessageDialog(null,"error al guardar texto");
                }
            }
        }
    }//GEN-LAST:event_btnguardararchivoActionPerformed

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed
    try{
    if(!agregar1.isEmpty())
    {
        agregar1.remove(ltotal.getSelectedIndex());
    }
    }
    catch(Error j)
    {
        JOptionPane.showMessageDialog(null,"seleccione una linea a eliminar");
    }
    }//GEN-LAST:event_btneliminarActionPerformed

    private void btncreararchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncreararchivoActionPerformed
      alquilar.creararchivo();
    }//GEN-LAST:event_btncreararchivoActionPerformed

    private void btnatrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnatrasActionPerformed
        logeo obj =new logeo();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnatrasActionPerformed

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
            java.util.logging.Logger.getLogger(alquilarlibros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(alquilarlibros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(alquilarlibros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(alquilarlibros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new alquilarlibros().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnabrirarchivo;
    private javax.swing.JButton btnagregar;
    private javax.swing.JButton btnatras;
    private javax.swing.JButton btncreararchivo;
    private javax.swing.JButton btneliminar;
    private javax.swing.JButton btnguardararchivo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList ltotal;
    private javax.swing.JTextField txtautor;
    private javax.swing.JTextField txtnombreadquiriente;
    private javax.swing.JTextField txttitulo;
    // End of variables declaration//GEN-END:variables
}
