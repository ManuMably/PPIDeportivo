/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaces_graficas;

import javax.swing.JOptionPane;
import skatelab.Administrativo;
import skatelab.ControladorPerfiles;

/**
 *
 * @author ROGER
 */
public class Perfiles extends javax.swing.JFrame {

    /**
     * Creates new form Perfiles
     */
    public Perfiles() {
        initComponents();
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

        I_Volver = new javax.swing.JLabel();
        lbl_Perfiles = new javax.swing.JLabel();
        Panel_PerfilActual = new javax.swing.JPanel();
        lbl_PerfilActual = new javax.swing.JLabel();
        lbl_Cedula = new javax.swing.JLabel();
        lbl_Nombres = new javax.swing.JLabel();
        lbl_Apellidos = new javax.swing.JLabel();
        lbl_Celular = new javax.swing.JLabel();
        lbl_Correo = new javax.swing.JLabel();
        campo_Cedula = new javax.swing.JLabel();
        campo_Nombres = new javax.swing.JLabel();
        campo_Apellidos = new javax.swing.JLabel();
        campo_Celular = new javax.swing.JLabel();
        campo_Correo = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btn_RegistrarPerf = new javax.swing.JButton();
        btn_ModiPerfil = new javax.swing.JButton();
        btn_ListaPerf = new javax.swing.JButton();
        I_RegistPerf = new javax.swing.JLabel();
        I_ModifPerf = new javax.swing.JLabel();
        I_ListaPerfiles = new javax.swing.JLabel();
        btn_Volver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                formPropertyChange(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        I_Volver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaces_graficas/Imagenes/volver.png"))); // NOI18N

        lbl_Perfiles.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        lbl_Perfiles.setText("Perfiles");

        Panel_PerfilActual.setBackground(new java.awt.Color(204, 255, 255));

        lbl_PerfilActual.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lbl_PerfilActual.setText("Perfil Actual");

        lbl_Cedula.setForeground(new java.awt.Color(0, 0, 0));
        lbl_Cedula.setText("Cedula:");

        lbl_Nombres.setForeground(new java.awt.Color(0, 0, 0));
        lbl_Nombres.setText("Nombres:");

        lbl_Apellidos.setForeground(new java.awt.Color(0, 0, 0));
        lbl_Apellidos.setText("Apellidos:");

        lbl_Celular.setForeground(new java.awt.Color(0, 0, 0));
        lbl_Celular.setText("Celular:");

        lbl_Correo.setForeground(new java.awt.Color(0, 0, 0));
        lbl_Correo.setText("Correo:");

        campo_Cedula.setText("UsuarioCed");

        campo_Nombres.setText("UsuarioNom");

        campo_Apellidos.setText("UsuarioApe");

        campo_Celular.setText("UsuarioCel");

        campo_Correo.setText("UsuarioCor");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaces_graficas/Imagenes/logopequeno.png"))); // NOI18N

        javax.swing.GroupLayout Panel_PerfilActualLayout = new javax.swing.GroupLayout(Panel_PerfilActual);
        Panel_PerfilActual.setLayout(Panel_PerfilActualLayout);
        Panel_PerfilActualLayout.setHorizontalGroup(
            Panel_PerfilActualLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_PerfilActualLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Panel_PerfilActualLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel_PerfilActualLayout.createSequentialGroup()
                        .addGroup(Panel_PerfilActualLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_Cedula)
                            .addComponent(lbl_Correo))
                        .addGap(46, 46, 46)
                        .addGroup(Panel_PerfilActualLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campo_Correo)
                            .addComponent(campo_Nombres)
                            .addComponent(campo_Cedula)
                            .addComponent(campo_Apellidos)
                            .addComponent(campo_Celular))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_PerfilActualLayout.createSequentialGroup()
                        .addComponent(lbl_PerfilActual)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                        .addComponent(jLabel5))
                    .addGroup(Panel_PerfilActualLayout.createSequentialGroup()
                        .addGroup(Panel_PerfilActualLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_Nombres)
                            .addComponent(lbl_Apellidos)
                            .addComponent(lbl_Celular))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        Panel_PerfilActualLayout.setVerticalGroup(
            Panel_PerfilActualLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_PerfilActualLayout.createSequentialGroup()
                .addGroup(Panel_PerfilActualLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(Panel_PerfilActualLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(lbl_PerfilActual)))
                .addGap(19, 19, 19)
                .addGroup(Panel_PerfilActualLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_Cedula)
                    .addComponent(campo_Cedula))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Panel_PerfilActualLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_Nombres)
                    .addComponent(campo_Nombres))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Panel_PerfilActualLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_Apellidos)
                    .addComponent(campo_Apellidos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Panel_PerfilActualLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_Celular)
                    .addComponent(campo_Celular))
                .addGap(7, 7, 7)
                .addGroup(Panel_PerfilActualLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_Correo)
                    .addComponent(campo_Correo))
                .addContainerGap(87, Short.MAX_VALUE))
        );

        btn_RegistrarPerf.setText("Registrar Perfil");
        btn_RegistrarPerf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RegistrarPerfActionPerformed(evt);
            }
        });

        btn_ModiPerfil.setText("Modificar Perfil");
        btn_ModiPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ModiPerfilActionPerformed(evt);
            }
        });

        btn_ListaPerf.setText("Lista de Perfiles");
        btn_ListaPerf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ListaPerfActionPerformed(evt);
            }
        });

        I_RegistPerf.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaces_graficas/Imagenes/registrar.png"))); // NOI18N

        I_ModifPerf.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaces_graficas/Imagenes/modificarP.png"))); // NOI18N

        I_ListaPerfiles.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaces_graficas/Imagenes/listaP.png"))); // NOI18N

        btn_Volver.setText("Volver");
        btn_Volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_VolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(I_Volver)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(I_ListaPerfiles)
                            .addComponent(I_RegistPerf)
                            .addComponent(I_ModifPerf))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_RegistrarPerf)
                            .addComponent(btn_ModiPerfil)
                            .addComponent(btn_ListaPerf))
                        .addGap(128, 128, 128)
                        .addComponent(Panel_PerfilActual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_Volver)
                        .addGap(136, 136, 136)
                        .addComponent(lbl_Perfiles)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(I_Volver)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btn_Volver)
                        .addComponent(lbl_Perfiles)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(btn_RegistrarPerf)
                                .addGap(50, 50, 50)
                                .addComponent(btn_ModiPerfil)
                                .addGap(44, 44, 44)
                                .addComponent(btn_ListaPerf))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(I_RegistPerf)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(I_ModifPerf)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(I_ListaPerfiles)))
                        .addContainerGap(163, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Panel_PerfilActual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(108, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_VolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_VolverActionPerformed
        // TODO add your handling code here:
        // Cerrar la ventana actual
        this.dispose();
        // Crear una instancia de la ventana del menú principal 
        MenuPrincipal menuPrincipal = new MenuPrincipal();
        menuPrincipal.setVisible(true);
    }//GEN-LAST:event_btn_VolverActionPerformed

    private void btn_RegistrarPerfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RegistrarPerfActionPerformed
        // TODO add your handling code here:
        // Cerrar la ventana actual
        this.dispose();
        // Crear una instancia de la ventana Registrar Perfil
        RegistrarPerfil ventanaRegistrarPerfil = new RegistrarPerfil();
        ventanaRegistrarPerfil.setVisible(true);
    }//GEN-LAST:event_btn_RegistrarPerfActionPerformed

    private void btn_ModiPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ModiPerfilActionPerformed
        // TODO add your handling code here:
        // Cerrar la ventana actual
        this.dispose();
        // Crear una instancia de la ventana Modificar Perfil
        ModificarPerfil ventanaModificarPerfil = new ModificarPerfil();
        ventanaModificarPerfil.setVisible(true);
    }//GEN-LAST:event_btn_ModiPerfilActionPerformed

    private void btn_ListaPerfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ListaPerfActionPerformed
        // TODO add your handling code here:
        // Cerrar la ventana actual
        if (ControladorPerfiles.getSesionActualUsuario() instanceof Administrativo) {
            this.dispose();
        // Crear una instancia de la ventana lista Perfiles
        ListaPerfiles ventanaListaPerfiles = new ListaPerfiles();
        ventanaListaPerfiles.setVisible(true);            
            
        }else{
            JOptionPane.showMessageDialog(null, "No cuentas con el acceso de administrador, comunicate con un administrador para visualizar todos los perfiles");        
        }
        
    }//GEN-LAST:event_btn_ListaPerfActionPerformed

    private void formPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_formPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_formPropertyChange

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        Integer valorCedulaSesion = ControladorPerfiles.getSesionActualUsuario().getCarnet();
        campo_Cedula.setText(String.valueOf(valorCedulaSesion));
        String valorNombre = ControladorPerfiles.getSesionActualUsuario().getNombres();
        campo_Nombres.setText(valorNombre);
        String valorApellido = ControladorPerfiles.getSesionActualUsuario().getApellidos();
        campo_Apellidos.setText(valorApellido);
        String valorCelular = ControladorPerfiles.getSesionActualUsuario().getCelular();
        campo_Celular.setText(valorCelular);
        String valorCorreo = ControladorPerfiles.getSesionActualUsuario().getCorreo();
        campo_Correo.setText(valorCorreo);
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(Perfiles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Perfiles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Perfiles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Perfiles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Perfiles().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel I_ListaPerfiles;
    private javax.swing.JLabel I_ModifPerf;
    private javax.swing.JLabel I_RegistPerf;
    private javax.swing.JLabel I_Volver;
    private javax.swing.JPanel Panel_PerfilActual;
    private javax.swing.JButton btn_ListaPerf;
    private javax.swing.JButton btn_ModiPerfil;
    private javax.swing.JButton btn_RegistrarPerf;
    private javax.swing.JButton btn_Volver;
    private javax.swing.JLabel campo_Apellidos;
    private javax.swing.JLabel campo_Cedula;
    private javax.swing.JLabel campo_Celular;
    private javax.swing.JLabel campo_Correo;
    private javax.swing.JLabel campo_Nombres;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lbl_Apellidos;
    private javax.swing.JLabel lbl_Cedula;
    private javax.swing.JLabel lbl_Celular;
    private javax.swing.JLabel lbl_Correo;
    private javax.swing.JLabel lbl_Nombres;
    private javax.swing.JLabel lbl_PerfilActual;
    private javax.swing.JLabel lbl_Perfiles;
    // End of variables declaration//GEN-END:variables
}
