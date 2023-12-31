/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Firmar.comprobadora;

import Firmar.CrearFirma;
import Firmar.modelo.Controler;
import Firmar.modelo.inicio;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author andre
 */
public class Verificadora extends javax.swing.JFrame {

    /**
     * Creates new form Verificadora
     */
    private inicio inicio;
    private String rutaArchivo;
    private String rutaFirma;
    private String rutaClavePublica;

    public Verificadora(inicio inicio) {
        this.inicio = inicio;
        rutaArchivo = "";
        rutaFirma = "";
        rutaClavePublica = "";
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

        addArchivo = new javax.swing.JButton();
        addfirm = new javax.swing.JButton();
        addkey = new javax.swing.JButton();
        comprobar = new javax.swing.JButton();
        addFile = new javax.swing.JTextField();
        addFirma = new javax.swing.JTextField();
        addkeyprivate = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        volver = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        addArchivo.setText("Subir Archivo ");
        addArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addArchivoActionPerformed(evt);
            }
        });

        addfirm.setText("Subir Firma");
        addfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addfirmActionPerformed(evt);
            }
        });

        addkey.setText("Subir clave publica");
        addkey.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addkeyActionPerformed(evt);
            }
        });

        comprobar.setText("Comprobar");
        comprobar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comprobarActionPerformed(evt);
            }
        });

        jMenu1.setText("File");

        volver.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        volver.setText("Volver");
        volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverActionPerformed(evt);
            }
        });
        jMenu1.add(volver);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(addkey)
                            .addComponent(addArchivo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(addfirm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addFile, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addFirma, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addkeyprivate, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(157, 157, 157)
                        .addComponent(comprobar)))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addArchivo)
                    .addComponent(addFile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addfirm)
                    .addComponent(addFirma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addkey)
                    .addComponent(addkeyprivate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(comprobar)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverActionPerformed
        this.setVisible(false);
        CrearFirma ventanaInicio = new CrearFirma(inicio);
        ventanaInicio.setVisible(true);
        ventanaInicio.setLocationRelativeTo(null);
    }//GEN-LAST:event_volverActionPerformed

    private void comprobarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comprobarActionPerformed
        if (rutaArchivo.equals("") || rutaFirma.equals("") || rutaClavePublica.equals("")) {
            JOptionPane.showMessageDialog(this, "Para verificar una firma debe especificar un archivo, la firma y la clave publica del remitente",
                    "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            Controler controlador = inicio.getControlador();
            try {
                boolean respuesta = controlador.validarFirma(rutaArchivo, rutaFirma, rutaClavePublica);
                if (respuesta) {

                    JOptionPane.showMessageDialog(this, "La firma es CORRECTA", "Respuesta", JOptionPane.INFORMATION_MESSAGE);
                } else {

                    JOptionPane.showMessageDialog(this, "La firma es INCORRECTA", "Respuesta", JOptionPane.INFORMATION_MESSAGE);

                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "La firma es incorrecta","Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_comprobarActionPerformed

    private void addfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addfirmActionPerformed
        JFileChooser fc = new JFileChooser();
        fc.setDialogTitle("Seleccionar firma");
        int seleccion = fc.showOpenDialog(this);

        if (seleccion == JFileChooser.APPROVE_OPTION) {
            File fichero = fc.getSelectedFile();
            rutaFirma = fichero.getAbsolutePath();
            addFirma.setText(fichero.getName());
        }
    }//GEN-LAST:event_addfirmActionPerformed

    private void addArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addArchivoActionPerformed
        JFileChooser fc = new JFileChooser();
        fc.setDialogTitle("Seleccionar archivo");
        int seleccion = fc.showOpenDialog(this);

        if (seleccion == JFileChooser.APPROVE_OPTION) {
            File fichero = fc.getSelectedFile();
            rutaArchivo = fichero.getAbsolutePath();
            addFile.setText(fichero.getName());
        }
    }//GEN-LAST:event_addArchivoActionPerformed

    private void addkeyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addkeyActionPerformed
        JFileChooser fc = new JFileChooser();
        fc.setDialogTitle("Seleccionar clave publica");
        int seleccion = fc.showOpenDialog(this);

        if (seleccion == JFileChooser.APPROVE_OPTION) {
            File fichero = fc.getSelectedFile();
            rutaClavePublica = fichero.getAbsolutePath();
            addkeyprivate.setText(fichero.getName());
        }
    }//GEN-LAST:event_addkeyActionPerformed

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
            java.util.logging.Logger.getLogger(Verificadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Verificadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Verificadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Verificadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addArchivo;
    private javax.swing.JTextField addFile;
    private javax.swing.JTextField addFirma;
    private javax.swing.JButton addfirm;
    private javax.swing.JButton addkey;
    private javax.swing.JTextField addkeyprivate;
    private javax.swing.JButton comprobar;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem volver;
    // End of variables declaration//GEN-END:variables
}
