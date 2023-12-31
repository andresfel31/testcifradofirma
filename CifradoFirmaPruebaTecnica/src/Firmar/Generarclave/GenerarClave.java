/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Firmar.Generarclave;

import Firmar.modelo.Controler;
import Firmar.CrearFirma;
import Firmar.modelo.inicio;
import Firmar.seteoPasswd;
import interfaz.Iniciar;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;

/**
 *
 * @author andre
 */
public class GenerarClave extends javax.swing.JFrame {

    /**
     * Creates new form GenerarClave
     */
   private inicio inicio;

   
    public GenerarClave(inicio inicio) {
        this.inicio=inicio;
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
        ClaveRSA = new javax.swing.JButton();
        ExportClavePublic = new javax.swing.JButton();
        pass1 = new javax.swing.JPasswordField();
        pass2 = new javax.swing.JPasswordField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        volver = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("password para la clave privada:");

        jLabel2.setText("Ingrese nuevamente password:");

        ClaveRSA.setText("Generar Clave RSA");
        ClaveRSA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClaveRSAActionPerformed(evt);
            }
        });

        ExportClavePublic.setText("Exportar Clave Publica");
        ExportClavePublic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExportClavePublicActionPerformed(evt);
            }
        });

        jMenu1.setText("File");

        volver.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        volver.setText("Volver ventana anterior");
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(ClaveRSA)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 96, Short.MAX_VALUE)
                        .addComponent(ExportClavePublic))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(62, 62, 62)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(pass2, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                            .addComponent(pass1))))
                .addGap(76, 76, 76))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(pass1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(pass2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ClaveRSA)
                    .addComponent(ExportClavePublic))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverActionPerformed
        this.setVisible(false);
        CrearFirma ventanaInicio = new CrearFirma(inicio);
        ventanaInicio.setVisible(true);
        ventanaInicio.setLocationRelativeTo(null);
    }//GEN-LAST:event_volverActionPerformed

    private void ClaveRSAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClaveRSAActionPerformed
       
        String password1 = String.valueOf(pass1.getText());
        String password2 = String.valueOf(pass2.getText());
        
        if (password1.equals(password2)) {
            JOptionPane.showMessageDialog(this, "Se generaron correctamente las claves", "Respuesta", JOptionPane.INFORMATION_MESSAGE);
            seteoPasswd pswd = new seteoPasswd();
            Controler controlador=inicio.getControlador();
            controlador.generarclave(password1);
            pswd.setPass1(password1);
            pass1.setText("");
            pass2.setText("");
            
        } else {
            if (password1.equals("") || password2.equals("")) {
                JOptionPane.showMessageDialog(this, "El password no puede ser vacio", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                if (password1.equals(password2) == false) {
                    JOptionPane.showMessageDialog(this, "No coindice el password", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_ClaveRSAActionPerformed

    private void ExportClavePublicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExportClavePublicActionPerformed
        Controler controlador=inicio.getControlador();
        JPanel panel = new JPanel();
        JLabel label = new JLabel("Digite el password:");
        JPasswordField pass = new JPasswordField(10);
        panel.add(label);
        panel.add(pass);
        String[] options = new String[]{"OK", "Cancelar"};
        int option = JOptionPane.showOptionDialog(null, panel, "Clave", JOptionPane.NO_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, options[1]);
        
        if (option == 0) {

            String password = new String(pass.getPassword());
            JOptionPane.showMessageDialog(this, "Seleccione donde quiere guardar el archivo");
            JFileChooser fc = new JFileChooser();
            fc.setDialogTitle("Guardar archivo");
            int seleccion = fc.showSaveDialog(this);

            if (seleccion == JFileChooser.APPROVE_OPTION) {
                File fichero = fc.getSelectedFile();
                String rutaClavePublica = fichero.getAbsolutePath();

                try {
                    controlador.exportarClavePublica(rutaClavePublica, password);
                    JOptionPane.showMessageDialog(this, "Clave exportada exitosamente", "Respuesta", JOptionPane.INFORMATION_MESSAGE);
                } catch (Exception e) {

                    JOptionPane.showMessageDialog(this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }

            }
        }
    }//GEN-LAST:event_ExportClavePublicActionPerformed

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
            java.util.logging.Logger.getLogger(GenerarClave.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GenerarClave.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GenerarClave.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GenerarClave.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ClaveRSA;
    private javax.swing.JButton ExportClavePublic;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPasswordField pass1;
    private javax.swing.JPasswordField pass2;
    private javax.swing.JMenuItem volver;
    // End of variables declaration//GEN-END:variables
}
