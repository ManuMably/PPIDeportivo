/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaces_graficas;

import javax.swing.JOptionPane;
import skatelab.Administrativo;
import skatelab.ControladorPerfiles;
import skatelab.Docente;

/**
 *
 * @author ROGER
 */
public class RegistrarDocente extends javax.swing.JFrame {

    /**
     * Creates new form RegistrarInstructor
     */
    public RegistrarDocente() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        I_Volver = new javax.swing.JLabel();
        btn_Volver = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        PanelDiasDisp = new javax.swing.JPanel();
        lbl_DiasDisp = new javax.swing.JLabel();
        Ch_lunes = new javax.swing.JCheckBox();
        Ch_Martes = new javax.swing.JCheckBox();
        Ch_Miercoles = new javax.swing.JCheckBox();
        Ch_Jueves = new javax.swing.JCheckBox();
        Ch_Viernes = new javax.swing.JCheckBox();
        Ch_Sabado = new javax.swing.JCheckBox();
        Ch_Domingo = new javax.swing.JCheckBox();
        lbl_Cedula = new javax.swing.JLabel();
        txt_cedula = new javax.swing.JTextField();
        txt_contrasena = new javax.swing.JTextField();
        txt_Nombres = new javax.swing.JTextField();
        txt_Apellidos = new javax.swing.JTextField();
        txt_Celular = new javax.swing.JTextField();
        txt_Correo = new javax.swing.JTextField();
        txt_RespuestaSeg = new javax.swing.JTextField();
        listaPreguntas = new javax.swing.JComboBox<>();
        lbl_Contrasena = new javax.swing.JLabel();
        lbl_Nombres = new javax.swing.JLabel();
        lbl_Apellidos = new javax.swing.JLabel();
        lbl_Celular = new javax.swing.JLabel();
        lbl_Correo = new javax.swing.JLabel();
        lbl_PreguntSeg = new javax.swing.JLabel();
        lbl_RespSeg = new javax.swing.JLabel();
        btn_Registrar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        ch_si = new javax.swing.JCheckBox();
        ch_no = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        I_Volver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaces_graficas/Imagenes/volver.png"))); // NOI18N

        btn_Volver.setText("Volver");
        btn_Volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_VolverActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaces_graficas/Imagenes/registrarPrf.JPG"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel2.setText("Registrar Docente");

        PanelDiasDisp.setBackground(new java.awt.Color(204, 255, 255));

        lbl_DiasDisp.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbl_DiasDisp.setText("Dias Trabajo:");

        Ch_lunes.setText("Lunes");

        Ch_Martes.setText("Martes");

        Ch_Miercoles.setText("Miercoles");

        Ch_Jueves.setText("Jueves");

        Ch_Viernes.setText("Viernes");

        Ch_Sabado.setText("Sabado");

        Ch_Domingo.setText("Domingo");

        javax.swing.GroupLayout PanelDiasDispLayout = new javax.swing.GroupLayout(PanelDiasDisp);
        PanelDiasDisp.setLayout(PanelDiasDispLayout);
        PanelDiasDispLayout.setHorizontalGroup(
            PanelDiasDispLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDiasDispLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelDiasDispLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_DiasDisp)
                    .addComponent(Ch_lunes)
                    .addComponent(Ch_Martes)
                    .addComponent(Ch_Miercoles)
                    .addComponent(Ch_Jueves)
                    .addComponent(Ch_Viernes)
                    .addComponent(Ch_Sabado)
                    .addComponent(Ch_Domingo))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        PanelDiasDispLayout.setVerticalGroup(
            PanelDiasDispLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDiasDispLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_DiasDisp)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Ch_lunes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Ch_Martes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Ch_Miercoles)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Ch_Jueves)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Ch_Viernes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Ch_Sabado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Ch_Domingo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lbl_Cedula.setText("Cedula:");

        txt_cedula.setText("Ingrese Cedula");

        txt_contrasena.setText("Ingrese Contraseña");
        txt_contrasena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_contrasenaActionPerformed(evt);
            }
        });

        txt_Nombres.setText("Ingrese Nombres");

        txt_Apellidos.setText("Ingrese Apellidos");

        txt_Celular.setText("Ingrese Celular");

        txt_Correo.setText("Ingrese Correo");

        txt_RespuestaSeg.setText("Ingrese Respuesta");

        listaPreguntas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nombre Mascota?", "color Favorito?", "nombre de la madre?", "libro preferido" }));

        lbl_Contrasena.setText("Contraseña:");

        lbl_Nombres.setText("Nombres:");

        lbl_Apellidos.setText("Apellidos:");

        lbl_Celular.setText("Celular:");

        lbl_Correo.setText("Correo:");

        lbl_PreguntSeg.setText("Pregunta Seguridad:");

        lbl_RespSeg.setText("Respuesta Seguridad:");

        btn_Registrar.setText("Registrar");
        btn_Registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RegistrarActionPerformed(evt);
            }
        });

        jLabel3.setText("Vinculado:");

        ch_si.setText("Si");
        ch_si.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ch_siActionPerformed(evt);
            }
        });

        ch_no.setText("No");
        ch_no.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ch_noActionPerformed(evt);
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
                        .addComponent(btn_Volver)
                        .addGap(30, 30, 30)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btn_Registrar)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_Cedula)
                                    .addComponent(lbl_Contrasena)
                                    .addComponent(lbl_Nombres)
                                    .addComponent(lbl_Apellidos)
                                    .addComponent(lbl_Celular)
                                    .addComponent(lbl_Correo)
                                    .addComponent(lbl_PreguntSeg)
                                    .addComponent(lbl_RespSeg)
                                    .addComponent(jLabel3))
                                .addGap(70, 70, 70)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txt_Celular)
                                    .addComponent(txt_Correo)
                                    .addComponent(txt_Apellidos)
                                    .addComponent(txt_Nombres)
                                    .addComponent(txt_contrasena, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                                    .addComponent(txt_cedula)
                                    .addComponent(txt_RespuestaSeg)
                                    .addComponent(listaPreguntas, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(ch_si)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ch_no)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 131, Short.MAX_VALUE)
                        .addComponent(PanelDiasDisp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(btn_Volver))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(I_Volver)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(jLabel2)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PanelDiasDisp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_cedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_Cedula))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_contrasena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_Contrasena))
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
                            .addComponent(listaPreguntas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_PreguntSeg))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_RespuestaSeg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_RespSeg))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(ch_si)
                    .addComponent(ch_no))
                .addGap(57, 57, 57)
                .addComponent(btn_Registrar)
                .addContainerGap(55, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_contrasenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_contrasenaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_contrasenaActionPerformed

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

                Integer carnetIngresado = Integer.parseInt(txt_cedula.getText());
                String contrasenaIngresada = txt_contrasena.getText();
                String respuestaSIngresada = txt_RespuestaSeg.getText();
                String nombresIngresados = txt_Nombres.getText();
                String apellidosIngresados = txt_Apellidos.getText();
                String celularIngresados = txt_Celular.getText();
                String correoIngresados = txt_Correo.getText();
                Boolean vinculadoBoolean=false;
                
                if (ch_si.isSelected()) {
                    vinculadoBoolean= true;                    
                }
                
                boolean estadoLunes = Ch_lunes.isSelected();
                boolean estadoMartes = Ch_Martes.isSelected();
                boolean estadoMiercoles = Ch_Miercoles.isSelected();
                boolean estadoJueves = Ch_Jueves.isSelected();
                boolean estadoViernes = Ch_Viernes.isSelected();
                boolean estadoSabado = Ch_Sabado.isSelected();
                boolean estadoDomingo = Ch_Domingo.isSelected();
                String codigoDias = "";
                
                boolean[] codigoDiasDisp = new boolean[7];
                codigoDiasDisp[0]=estadoLunes;
                codigoDiasDisp[1]=estadoMartes;
                codigoDiasDisp[2]=estadoMiercoles;
                codigoDiasDisp[3]=estadoJueves;
                codigoDiasDisp[4]=estadoViernes;
                codigoDiasDisp[5]=estadoSabado;
                codigoDiasDisp[6]=estadoDomingo;
                for (int i = 0; i < 7; i++) {
                    if (codigoDiasDisp[i]== true) {
                        codigoDias = codigoDias + (i+1);
                    }
                    
                }
                

                Docente nuevoDocente = new Docente(vinculadoBoolean, codigoDias, carnetIngresado, codigoDias, codigoDias, codigoDias, codigoDias, codigoDias, respuestaSIngresada);

                System.out.println(nuevoDocente.getCodigoDias());

                ControladorPerfiles.registrarPerfil(nuevoDocente);
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

    private void ch_siActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ch_siActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ch_siActionPerformed

    private void ch_noActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ch_noActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ch_noActionPerformed

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
            java.util.logging.Logger.getLogger(RegistrarDocente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrarDocente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrarDocente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrarDocente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrarDocente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox Ch_Domingo;
    private javax.swing.JCheckBox Ch_Jueves;
    private javax.swing.JCheckBox Ch_Martes;
    private javax.swing.JCheckBox Ch_Miercoles;
    private javax.swing.JCheckBox Ch_Sabado;
    private javax.swing.JCheckBox Ch_Viernes;
    private javax.swing.JCheckBox Ch_lunes;
    private javax.swing.JLabel I_Volver;
    private javax.swing.JPanel PanelDiasDisp;
    private javax.swing.JButton btn_Registrar;
    private javax.swing.JButton btn_Volver;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox ch_no;
    private javax.swing.JCheckBox ch_si;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lbl_Apellidos;
    private javax.swing.JLabel lbl_Cedula;
    private javax.swing.JLabel lbl_Celular;
    private javax.swing.JLabel lbl_Contrasena;
    private javax.swing.JLabel lbl_Correo;
    private javax.swing.JLabel lbl_DiasDisp;
    private javax.swing.JLabel lbl_Nombres;
    private javax.swing.JLabel lbl_PreguntSeg;
    private javax.swing.JLabel lbl_RespSeg;
    private javax.swing.JComboBox<String> listaPreguntas;
    private javax.swing.JTextField txt_Apellidos;
    private javax.swing.JTextField txt_Celular;
    private javax.swing.JTextField txt_Correo;
    private javax.swing.JTextField txt_Nombres;
    private javax.swing.JTextField txt_RespuestaSeg;
    private javax.swing.JTextField txt_cedula;
    private javax.swing.JTextField txt_contrasena;
    // End of variables declaration//GEN-END:variables
}