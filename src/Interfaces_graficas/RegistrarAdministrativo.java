/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaces_graficas;

import javax.swing.JOptionPane;
import skatelab.Administrativo;
import skatelab.Estudiante;
import skatelab.ControladorPerfiles;

/**
 *
 * @author ROGER
 */
public class RegistrarAdministrativo extends javax.swing.JFrame {

    /**
     * Creates new form RegistrarAdministrativo
     */
    public RegistrarAdministrativo() {
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
        btn_Volver = new javax.swing.JButton();
        I_RegistrarA = new javax.swing.JLabel();
        lbl_RegAdmin = new javax.swing.JLabel();
        lbl_Cedula = new javax.swing.JLabel();
        lbl_Contrasena = new javax.swing.JLabel();
        lbl_Nombres = new javax.swing.JLabel();
        lbl_Apellidos = new javax.swing.JLabel();
        lbl_Celular = new javax.swing.JLabel();
        lbl_Correo = new javax.swing.JLabel();
        lbl_PregSeg = new javax.swing.JLabel();
        lbl_RespSeg = new javax.swing.JLabel();
        lbl_SegundaContras = new javax.swing.JLabel();
        txt_Cedula = new javax.swing.JTextField();
        txt_Contrasena = new javax.swing.JTextField();
        txt_Nombres = new javax.swing.JTextField();
        txt_Apellidos = new javax.swing.JTextField();
        txt_Celular = new javax.swing.JTextField();
        txt_Correo = new javax.swing.JTextField();
        txt_RespSeg = new javax.swing.JTextField();
        txt_SegundaContras = new javax.swing.JTextField();
        btn_Registrar = new javax.swing.JButton();
        ListaPreguntas = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        I_Volver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaces_graficas/Imagenes/volver.png"))); // NOI18N

        btn_Volver.setText("Volver");
        btn_Volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_VolverActionPerformed(evt);
            }
        });

        I_RegistrarA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaces_graficas/Imagenes/registrarPrf.JPG"))); // NOI18N

        lbl_RegAdmin.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        lbl_RegAdmin.setText("Registrar Administrativo");

        lbl_Cedula.setText("Cedula:");

        lbl_Contrasena.setText("Contraseña:");

        lbl_Nombres.setText("Nombres:");

        lbl_Apellidos.setText("Apellidos:");

        lbl_Celular.setText("Celular:");

        lbl_Correo.setText("Correo:");

        lbl_PregSeg.setText("Pregunta Seguridad:");

        lbl_RespSeg.setText("Respuesta Seguridad:");

        lbl_SegundaContras.setText("Contraseña 2:");

        txt_Cedula.setText("Ingrese Cedula");

        txt_Contrasena.setText("Ingrese Contraseña");
        txt_Contrasena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_ContrasenaActionPerformed(evt);
            }
        });

        txt_Nombres.setText("Ingrese Nombres");

        txt_Apellidos.setText("Ingrese Apellidos");

        txt_Celular.setText("Ingrese Celular");

        txt_Correo.setText("Ingrese Correo");

        txt_RespSeg.setText("Ingrese Respuesta");

        txt_SegundaContras.setText("Ingrese Contraseña2");

        btn_Registrar.setText("Registrar");
        btn_Registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RegistrarActionPerformed(evt);
            }
        });

        ListaPreguntas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(I_Volver)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_Volver)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(I_RegistrarA)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_RegAdmin))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_Cedula)
                            .addComponent(lbl_Contrasena)
                            .addComponent(lbl_Nombres)
                            .addComponent(lbl_Apellidos)
                            .addComponent(lbl_Celular)
                            .addComponent(lbl_Correo)
                            .addComponent(lbl_PregSeg)
                            .addComponent(lbl_SegundaContras)
                            .addComponent(lbl_RespSeg))
                        .addGap(88, 88, 88)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_Contrasena)
                            .addComponent(txt_Nombres)
                            .addComponent(txt_Apellidos)
                            .addComponent(txt_Celular)
                            .addComponent(txt_Correo)
                            .addComponent(txt_RespSeg)
                            .addComponent(txt_SegundaContras)
                            .addComponent(txt_Cedula)
                            .addComponent(ListaPreguntas, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(48, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_Registrar)
                .addGap(298, 298, 298))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(btn_Volver))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(I_RegistrarA)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(lbl_RegAdmin))
                            .addComponent(I_Volver))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_Cedula)
                    .addComponent(txt_Cedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_Contrasena)
                    .addComponent(txt_Contrasena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_Nombres)
                    .addComponent(txt_Nombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_Apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_Apellidos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_Celular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_Celular))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_Correo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_Correo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_PregSeg)
                    .addComponent(ListaPreguntas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_RespSeg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_RespSeg))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_SegundaContras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_SegundaContras))
                .addGap(49, 49, 49)
                .addComponent(btn_Registrar)
                .addContainerGap(78, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_ContrasenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_ContrasenaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ContrasenaActionPerformed

    private void btn_VolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_VolverActionPerformed
        // TODO add your handling code here:
        // cerramos la ventana actual
        this.dispose();
        // creamos una nueva instancia de la ventana anterior
        RegistrarPerfil ventanaRegistrarPerfil = new RegistrarPerfil();
        ventanaRegistrarPerfil.setVisible(true);
    }//GEN-LAST:event_btn_VolverActionPerformed

    private void btn_RegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RegistrarActionPerformed
        // TODO add your handling code here:
        try {
            
            Integer cedulaIngresada = Integer.parseInt(txt_Cedula.getText());
            Integer contrasenaIngresada = Integer.parseInt(txt_Contrasena.getText());
            String respuestaSIngresada = txt_RespSeg.getText();
            String nombresIngresados = txt_Nombres.getText();
            String apellidosIngresados = txt_Apellidos.getText();
            Long celularIngresados = Long.parseLong(txt_Celular.getText());
            String correoIngresados = txt_Correo.getText();
            String conta2Ingresados = txt_SegundaContras.getText();
            
            Administrativo nuevoAdministrativo = new Administrativo(cedulaIngresada, contrasenaIngresada, respuestaSIngresada, nombresIngresados, apellidosIngresados, celularIngresados, correoIngresados, conta2Ingresados);
            
            System.out.println(nuevoAdministrativo);
            
            ControladorPerfiles.registrarPerfil(nuevoAdministrativo);
            JOptionPane.showMessageDialog(null, "Perfil Registrado Correctamente");
            
            //Cerramos la ventana Actual
            this.dispose();
            // creamos una instancia de la ventana anterior
            RegistrarPerfil ventanaRegistrarPerfil = new RegistrarPerfil();
            ventanaRegistrarPerfil.setVisible(true);
                                  
            
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Debes Ingresar Por lo Menos Un Dato Correcto, Verifica los datos ingresados sean Validos");
        }
    }//GEN-LAST:event_btn_RegistrarActionPerformed

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
            java.util.logging.Logger.getLogger(RegistrarAdministrativo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrarAdministrativo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrarAdministrativo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrarAdministrativo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrarAdministrativo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel I_RegistrarA;
    private javax.swing.JLabel I_Volver;
    private javax.swing.JComboBox<String> ListaPreguntas;
    private javax.swing.JButton btn_Registrar;
    private javax.swing.JButton btn_Volver;
    private javax.swing.JLabel lbl_Apellidos;
    private javax.swing.JLabel lbl_Cedula;
    private javax.swing.JLabel lbl_Celular;
    private javax.swing.JLabel lbl_Contrasena;
    private javax.swing.JLabel lbl_Correo;
    private javax.swing.JLabel lbl_Nombres;
    private javax.swing.JLabel lbl_PregSeg;
    private javax.swing.JLabel lbl_RegAdmin;
    private javax.swing.JLabel lbl_RespSeg;
    private javax.swing.JLabel lbl_SegundaContras;
    private javax.swing.JTextField txt_Apellidos;
    private javax.swing.JTextField txt_Cedula;
    private javax.swing.JTextField txt_Celular;
    private javax.swing.JTextField txt_Contrasena;
    private javax.swing.JTextField txt_Correo;
    private javax.swing.JTextField txt_Nombres;
    private javax.swing.JTextField txt_RespSeg;
    private javax.swing.JTextField txt_SegundaContras;
    // End of variables declaration//GEN-END:variables
}
