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
public class RegistrarPerfil extends javax.swing.JFrame {

    
    public Boolean bandera = false;
    public Boolean getBandera() {
        return bandera;
    }

    public void setBandera(Boolean bandera) {
        this.bandera = bandera;
    }

    /**
     * Creates new form RegistrarPerfil
     */
    public RegistrarPerfil() {
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
        bnt_Volver = new javax.swing.JButton();
        lbl_RegistrarPerfil = new javax.swing.JLabel();
        I_RAlumno = new javax.swing.JLabel();
        I_RInstructor = new javax.swing.JLabel();
        I_RAdmin = new javax.swing.JLabel();
        btn_EstudianteR = new javax.swing.JButton();
        btn_DocenteR = new javax.swing.JButton();
        btn_AdminR = new javax.swing.JButton();
        lbl_PreguntaTipo = new javax.swing.JLabel();
        I_RAdmin1 = new javax.swing.JLabel();
        btn_ExternoR = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        I_Volver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaces_graficas/Imagenes/volver.png"))); // NOI18N

        bnt_Volver.setText("Volver");
        bnt_Volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnt_VolverActionPerformed(evt);
            }
        });

        lbl_RegistrarPerfil.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        lbl_RegistrarPerfil.setText("Registrar Perfil");

        I_RAlumno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaces_graficas/Imagenes/registrarPrf.JPG"))); // NOI18N

        I_RInstructor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaces_graficas/Imagenes/registrarPrf.JPG"))); // NOI18N

        I_RAdmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaces_graficas/Imagenes/registrarPrf.JPG"))); // NOI18N

        btn_EstudianteR.setText("Estudiante");
        btn_EstudianteR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EstudianteRActionPerformed(evt);
            }
        });

        btn_DocenteR.setText("Docente");
        btn_DocenteR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_DocenteRActionPerformed(evt);
            }
        });

        btn_AdminR.setText("Administrativo");
        btn_AdminR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AdminRActionPerformed(evt);
            }
        });

        lbl_PreguntaTipo.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lbl_PreguntaTipo.setText("¿Que tipo de Perfil desea registrar?");

        I_RAdmin1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaces_graficas/Imagenes/registrarPrf.JPG"))); // NOI18N

        btn_ExternoR.setText("Externo");
        btn_ExternoR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ExternoRActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(I_Volver)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bnt_Volver)
                        .addGap(131, 131, 131)
                        .addComponent(lbl_RegistrarPerfil)
                        .addContainerGap(393, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(I_RAlumno)
                            .addComponent(btn_EstudianteR))
                        .addGap(134, 134, 134)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(I_RInstructor)
                            .addComponent(btn_DocenteR))
                        .addGap(134, 134, 134)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_AdminR)
                            .addComponent(I_RAdmin))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(I_RAdmin1)
                            .addComponent(btn_ExternoR))
                        .addGap(67, 67, 67))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbl_PreguntaTipo)
                .addGap(164, 164, 164))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(I_RAdmin1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_ExternoR))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(I_Volver))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(bnt_Volver))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lbl_RegistrarPerfil)))
                        .addGap(79, 79, 79)
                        .addComponent(lbl_PreguntaTipo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(I_RInstructor)
                            .addComponent(I_RAlumno)
                            .addComponent(I_RAdmin))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_EstudianteR)
                            .addComponent(btn_DocenteR)
                            .addComponent(btn_AdminR))))
                .addGap(143, 143, 143))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bnt_VolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnt_VolverActionPerformed
        // TODO add your handling code here:
        if (bandera) {
            bandera = false;
            this.dispose();
            InicioSesion ventanaInicio = new InicioSesion();
            ventanaInicio.setVisible(true);
            
        }else{// cerramos la ventana actual
        this.dispose();
        // creamos una instancia de la ventana anterior
        Perfiles ventanaPerfiles = new Perfiles();
        ventanaPerfiles.setVisible(true);}
        
    }//GEN-LAST:event_bnt_VolverActionPerformed

    private void btn_EstudianteRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EstudianteRActionPerformed
        // TODO add your handling code here:
        // cerramos la ventana actual
        this.dispose();
        // creamos una instancia de la ventana registrar alumno
        RegistrarEstudiante ventanaRegistrarAlumno = new RegistrarEstudiante();
        ventanaRegistrarAlumno.setVisible(true);
    }//GEN-LAST:event_btn_EstudianteRActionPerformed

    private void btn_DocenteRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_DocenteRActionPerformed
        // TODO add your handling code here:
        // cerramos la ventana actual
        this.dispose();
        // creamos una instancia de la ventana registrar alumno
        RegistrarDocente ventanaRegistrarInstructor = new RegistrarDocente();
        ventanaRegistrarInstructor.setVisible(true);
    }//GEN-LAST:event_btn_DocenteRActionPerformed

    private void btn_AdminRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AdminRActionPerformed
        // TODO add your handling code here:
        // cerramos la ventana actual
        if (ControladorPerfiles.getSesionActualUsuario() instanceof Administrativo){this.dispose();
        // creamos una instancia de la ventana registrar alumno
        RegistrarAdministrativo ventanaRegistrarAdministrativo = new RegistrarAdministrativo();
        ventanaRegistrarAdministrativo.setVisible(true);}else{
            JOptionPane.showMessageDialog(null, "No cuentas con el acceso de administrador, comunicate con un administrador para crear este perfil");        
        }
        
    }//GEN-LAST:event_btn_AdminRActionPerformed

    private void btn_ExternoRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ExternoRActionPerformed
        // TODO add your handling code here:
        // cerramos la ventana actual
        if (ControladorPerfiles.getSesionActualUsuario() instanceof Administrativo){this.dispose();
        // creamos una instancia de la ventana registrar alumno
        RegistrarExterno ventanaRegistrarExterno = new RegistrarExterno();
        ventanaRegistrarExterno.setVisible(true);}else{
            JOptionPane.showMessageDialog(null, "No cuentas con el acceso de administrador, comunicate con un administrador para crear este perfil");        
        }
    }//GEN-LAST:event_btn_ExternoRActionPerformed

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
            java.util.logging.Logger.getLogger(RegistrarPerfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrarPerfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrarPerfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrarPerfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrarPerfil().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel I_RAdmin;
    private javax.swing.JLabel I_RAdmin1;
    private javax.swing.JLabel I_RAlumno;
    private javax.swing.JLabel I_RInstructor;
    private javax.swing.JLabel I_Volver;
    private javax.swing.JButton bnt_Volver;
    private javax.swing.JButton btn_AdminR;
    private javax.swing.JButton btn_DocenteR;
    private javax.swing.JButton btn_EstudianteR;
    private javax.swing.JButton btn_ExternoR;
    private javax.swing.JLabel lbl_PreguntaTipo;
    private javax.swing.JLabel lbl_RegistrarPerfil;
    // End of variables declaration//GEN-END:variables
}
