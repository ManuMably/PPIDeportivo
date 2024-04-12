/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaces_graficas;

import skatelab.ConexionBD;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import skatelab.Administrativo;
import skatelab.Alumno;
import skatelab.ControladorPerfiles;
import skatelab.Instructor;
import skatelab.Usuario;

/**
 *
 * @author ROGER
 */
public class ListaPerfiles extends javax.swing.JFrame {
    DefaultTableModel modelo;
    

    /**
     * Creates new form ListaPerfiles
     */
    public ListaPerfiles() {
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btn_FiltroAlumnos = new javax.swing.JButton();
        btn_FiltroInstructores = new javax.swing.JButton();
        btn_FiltroAdmin = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaPerfiles = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txt_cedulaB = new javax.swing.JTextField();
        btn_BuscarCedula = new javax.swing.JButton();
        btn_ModificarP = new javax.swing.JButton();
        btn_EliminarP = new javax.swing.JButton();
        btn_ListaCompleta = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        I_Volver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaces_graficas/Imagenes/volver.png"))); // NOI18N

        btn_Volver.setText("Volver");
        btn_Volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_VolverActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaces_graficas/Imagenes/listaPP.JPG"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel2.setText("Lista Perfiles");

        btn_FiltroAlumnos.setText("Filtrar Alumnos");
        btn_FiltroAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_FiltroAlumnosActionPerformed(evt);
            }
        });

        btn_FiltroInstructores.setText("Filtrar Instructores");
        btn_FiltroInstructores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_FiltroInstructoresActionPerformed(evt);
            }
        });

        btn_FiltroAdmin.setText("Filtrar Administrativos");
        btn_FiltroAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_FiltroAdminActionPerformed(evt);
            }
        });

        tablaPerfiles.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cedula", "Contraseña", "Respuesta Seg", "Nombres", "Apellidos", "Celular", "Correo", "Ocupacion", "Contraseña 2", "Dias Disp"
            }
        ));
        jScrollPane1.setViewportView(tablaPerfiles);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Cedula:");

        txt_cedulaB.setText("Ingrese Cedula");

        btn_BuscarCedula.setText("Buscar Por Cedula");
        btn_BuscarCedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_BuscarCedulaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3)
                    .addComponent(btn_BuscarCedula, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_cedulaB))
                .addContainerGap(68, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_cedulaB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_BuscarCedula)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btn_ModificarP.setText("Modificar Perfil");
        btn_ModificarP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ModificarPActionPerformed(evt);
            }
        });

        btn_EliminarP.setText("eliminar perfil");
        btn_EliminarP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EliminarPActionPerformed(evt);
            }
        });

        btn_ListaCompleta.setText("Lista Completa");
        btn_ListaCompleta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ListaCompletaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btn_ListaCompleta)
                                        .addGap(208, 208, 208)
                                        .addComponent(btn_FiltroAlumnos)
                                        .addGap(59, 59, 59)
                                        .addComponent(btn_FiltroInstructores)
                                        .addGap(53, 53, 53)
                                        .addComponent(btn_FiltroAdmin))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(I_Volver)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn_Volver)
                                        .addGap(228, 228, 228)
                                        .addComponent(jLabel1)
                                        .addGap(64, 64, 64)
                                        .addComponent(jLabel2)))
                                .addGap(0, 268, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(229, 229, 229)
                        .addComponent(btn_ModificarP)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_EliminarP)
                        .addGap(47, 47, 47))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(btn_Volver))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(I_Volver))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(jLabel2)))))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_FiltroAlumnos)
                    .addComponent(btn_FiltroInstructores)
                    .addComponent(btn_FiltroAdmin)
                    .addComponent(btn_ListaCompleta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_ModificarP)
                        .addComponent(btn_EliminarP)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_VolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_VolverActionPerformed
        // TODO add your handling code here:
        // cerramos la ventana actual
        this.dispose();
        // creamos una instancia de la ventana anterior
        Perfiles ventanaPerfiles = new Perfiles();
        ventanaPerfiles.setVisible(true);
    }//GEN-LAST:event_btn_VolverActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        modelo = (DefaultTableModel) tablaPerfiles.getModel();
        String[] PerfilRegistrado = new String[10];
        
        for (int j = 0; j < ControladorPerfiles.getPerfilesBD().size(); j++) {
            PerfilRegistrado[0] = String.valueOf(ControladorPerfiles.getPerfilesBD().get(j).getCedula());
            PerfilRegistrado[1] = String.valueOf(ControladorPerfiles.getPerfilesBD().get(j).getContrasena());
            PerfilRegistrado[2] = ControladorPerfiles.getPerfilesBD().get(j).getRespuestaSeguridad();
            PerfilRegistrado[3] = ControladorPerfiles.getPerfilesBD().get(j).getNombres();
            PerfilRegistrado[4] = ControladorPerfiles.getPerfilesBD().get(j).getApellidos();
            PerfilRegistrado[5] = String.valueOf(ControladorPerfiles.getPerfilesBD().get(j).getCelular());
            PerfilRegistrado[6] = ControladorPerfiles.getPerfilesBD().get(j).getCorreo();
            if (ControladorPerfiles.getPerfilesBD().get(j) instanceof Alumno) {
                PerfilRegistrado[7] = ((Alumno)ControladorPerfiles.getPerfilesBD().get(j)).getOcupacion();
                PerfilRegistrado[8] = "null";
                PerfilRegistrado[9] = "null";
            }else if (ControladorPerfiles.getPerfilesBD().get(j) instanceof Administrativo) {
                PerfilRegistrado[7] = "null";
                PerfilRegistrado[8] = ((Administrativo)ControladorPerfiles.getPerfilesBD().get(j)).getContrasena2();
                PerfilRegistrado[9] = "null";
                
            }else{
                PerfilRegistrado[7] = "null";
                PerfilRegistrado[8] = "null";
                PerfilRegistrado[9] = ((Instructor)ControladorPerfiles.getPerfilesBD().get(j)).getDiasDisp();          
            }
            modelo.addRow(PerfilRegistrado);
        }
        
    }//GEN-LAST:event_formWindowOpened

    private void btn_FiltroAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_FiltroAlumnosActionPerformed
        // TODO add your handling code here:
        modelo = (DefaultTableModel) tablaPerfiles.getModel();
        modelo.setRowCount(0);
        String[] PerfilAlumno = new String[10];
        for (int j = 0; j < ControladorPerfiles.getPerfilesAlumno().size(); j++) {
            PerfilAlumno[0] = String.valueOf(ControladorPerfiles.getPerfilesAlumno().get(j).getCedula());
            PerfilAlumno[1] = String.valueOf(ControladorPerfiles.getPerfilesAlumno().get(j).getContrasena());
            PerfilAlumno[2] = ControladorPerfiles.getPerfilesAlumno().get(j).getRespuestaSeguridad();
            PerfilAlumno[3] = ControladorPerfiles.getPerfilesAlumno().get(j).getNombres();
            PerfilAlumno[4] = ControladorPerfiles.getPerfilesAlumno().get(j).getApellidos();
            PerfilAlumno[5] = String.valueOf(ControladorPerfiles.getPerfilesAlumno().get(j).getCelular());
            PerfilAlumno[6] = ControladorPerfiles.getPerfilesAlumno().get(j).getCorreo();
            PerfilAlumno[7] = ControladorPerfiles.getPerfilesAlumno().get(j).getOcupacion();
            PerfilAlumno[8] = "null";
            PerfilAlumno[9] = "null";
            modelo.addRow(PerfilAlumno);      
        }
    }//GEN-LAST:event_btn_FiltroAlumnosActionPerformed

    private void btn_FiltroInstructoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_FiltroInstructoresActionPerformed
        // TODO add your handling code here:
        modelo = (DefaultTableModel) tablaPerfiles.getModel();
        modelo.setRowCount(0);
        String[] PerfilInstructor = new String[10];
        for (int j = 0; j < ControladorPerfiles.getPerfilesInstruc().size(); j++) {
            PerfilInstructor[0] = String.valueOf(ControladorPerfiles.getPerfilesInstruc().get(j).getCedula());
            PerfilInstructor[1] = String.valueOf(ControladorPerfiles.getPerfilesInstruc().get(j).getContrasena());
            PerfilInstructor[2] = ControladorPerfiles.getPerfilesInstruc().get(j).getRespuestaSeguridad();
            PerfilInstructor[3] = ControladorPerfiles.getPerfilesInstruc().get(j).getNombres();
            PerfilInstructor[4] = ControladorPerfiles.getPerfilesInstruc().get(j).getApellidos();
            PerfilInstructor[5] = String.valueOf(ControladorPerfiles.getPerfilesInstruc().get(j).getCelular());
            PerfilInstructor[6] = ControladorPerfiles.getPerfilesInstruc().get(j).getCorreo();
            PerfilInstructor[7] = "null";
            PerfilInstructor[8] = "null";
            PerfilInstructor[9] = ControladorPerfiles.getPerfilesInstruc().get(j).getDiasDisp();
            modelo.addRow(PerfilInstructor);      
        }
    }//GEN-LAST:event_btn_FiltroInstructoresActionPerformed

    private void btn_FiltroAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_FiltroAdminActionPerformed
        // TODO add your handling code here:
        modelo = (DefaultTableModel) tablaPerfiles.getModel();
        modelo.setRowCount(0);
        String[] PerfilAdministrativo = new String[10];
        for (int j = 0; j < ControladorPerfiles.getPerfilesAdmin().size(); j++) {
            PerfilAdministrativo[0] = String.valueOf(ControladorPerfiles.getPerfilesAdmin().get(j).getCedula());
            PerfilAdministrativo[1] = String.valueOf(ControladorPerfiles.getPerfilesAdmin().get(j).getContrasena());
            PerfilAdministrativo[2] = ControladorPerfiles.getPerfilesAdmin().get(j).getRespuestaSeguridad();
            PerfilAdministrativo[3] = ControladorPerfiles.getPerfilesAdmin().get(j).getNombres();
            PerfilAdministrativo[4] = ControladorPerfiles.getPerfilesAdmin().get(j).getApellidos();
            PerfilAdministrativo[5] = String.valueOf(ControladorPerfiles.getPerfilesAdmin().get(j).getCelular());
            PerfilAdministrativo[6] = ControladorPerfiles.getPerfilesAdmin().get(j).getCorreo();
            PerfilAdministrativo[7] = "null";
            PerfilAdministrativo[8] = ControladorPerfiles.getPerfilesAdmin().get(j).getContrasena2();
            PerfilAdministrativo[9] = "null";
            modelo.addRow(PerfilAdministrativo);      
        }
    }//GEN-LAST:event_btn_FiltroAdminActionPerformed

    private void btn_ListaCompletaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ListaCompletaActionPerformed
        // TODO add your handling code here:
        modelo = (DefaultTableModel) tablaPerfiles.getModel();
        modelo.setRowCount(0);
        String[] PerfilRegistrado = new String[10];
        
        for (int j = 0; j < ControladorPerfiles.getPerfilesBD().size(); j++) {
            PerfilRegistrado[0] = String.valueOf(ControladorPerfiles.getPerfilesBD().get(j).getCedula());
            PerfilRegistrado[1] = String.valueOf(ControladorPerfiles.getPerfilesBD().get(j).getContrasena());
            PerfilRegistrado[2] = ControladorPerfiles.getPerfilesBD().get(j).getRespuestaSeguridad();
            PerfilRegistrado[3] = ControladorPerfiles.getPerfilesBD().get(j).getNombres();
            PerfilRegistrado[4] = ControladorPerfiles.getPerfilesBD().get(j).getApellidos();
            PerfilRegistrado[5] = String.valueOf(ControladorPerfiles.getPerfilesBD().get(j).getCelular());
            PerfilRegistrado[6] = ControladorPerfiles.getPerfilesBD().get(j).getCorreo();
            if (ControladorPerfiles.getPerfilesBD().get(j) instanceof Alumno) {
                PerfilRegistrado[7] = ((Alumno)ControladorPerfiles.getPerfilesBD().get(j)).getOcupacion();
                PerfilRegistrado[8] = "null";
                PerfilRegistrado[9] = "null";
            }else if (ControladorPerfiles.getPerfilesBD().get(j) instanceof Administrativo) {
                PerfilRegistrado[7] = "null";
                PerfilRegistrado[8] = ((Administrativo)ControladorPerfiles.getPerfilesBD().get(j)).getContrasena2();
                PerfilRegistrado[9] = "null";
                
            }else{
                PerfilRegistrado[7] = "null";
                PerfilRegistrado[8] = "null";
                PerfilRegistrado[9] = ((Instructor)ControladorPerfiles.getPerfilesBD().get(j)).getDiasDisp();          
            }
            modelo.addRow(PerfilRegistrado);
        }
    }//GEN-LAST:event_btn_ListaCompletaActionPerformed

    private void btn_ModificarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ModificarPActionPerformed
        // TODO add your handling code here:
        
                tablaPerfiles.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
                String[] filaDatos = new String[10];
                tablaPerfiles.getSelectionModel().addListSelectionListener(e -> {
                int filaSeleccionada = tablaPerfiles.getSelectedRow();
            
            if (filaSeleccionada != -1) {
                // Obtener los valores de la fila seleccionada
                
                for (int i = 0; i < filaDatos.length; i++) {
                    filaDatos[i] = (String) tablaPerfiles.getValueAt(filaSeleccionada, i);
                }
                // Mostrar los valores en la consola
                System.out.println("Datos de la fila seleccionada:");
                for (Object dato : filaDatos) {
                    System.out.println(dato);
                } 
            }
            Integer cedulaSeleccion = Integer.parseInt(filaDatos[0]);
                
                Usuario perfilUsuario = ControladorPerfiles.buscarPerfil(cedulaSeleccion);
                
                ModificarPerfil ventanaModificar = new ModificarPerfil();
                ventanaModificar.setUsuarioEnviado(perfilUsuario);
                this.dispose();
                ventanaModificar.setVisible(true); 
        });
        
    }//GEN-LAST:event_btn_ModificarPActionPerformed

    private void btn_BuscarCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_BuscarCedulaActionPerformed
        // TODO add your handling code here:
        Integer cedulaIngresada = Integer.parseInt(txt_cedulaB.getText());
        Usuario perfilSolicitado = ControladorPerfiles.buscarPerfil(cedulaIngresada);
        
        modelo = (DefaultTableModel) tablaPerfiles.getModel();
        modelo.setRowCount(0);
        String[] PerfilU = new String[10];
        
            PerfilU[0] = String.valueOf(perfilSolicitado.getCedula());
            PerfilU[1] = String.valueOf(perfilSolicitado.getContrasena());
            PerfilU[2] = perfilSolicitado.getRespuestaSeguridad();
            PerfilU[3] = perfilSolicitado.getNombres();
            PerfilU[4] = perfilSolicitado.getApellidos();
            PerfilU[5] = String.valueOf(perfilSolicitado.getCelular());
            PerfilU[6] = perfilSolicitado.getCorreo();
            if (perfilSolicitado instanceof Alumno) {
                PerfilU[7] = ((Alumno)perfilSolicitado).getOcupacion();
                PerfilU[8] = "null";
                PerfilU[9] = "null";
            }else if (perfilSolicitado instanceof Administrativo) {
                PerfilU[7] = "null";
                PerfilU[8] = ((Administrativo)perfilSolicitado).getContrasena2();
                PerfilU[9] = "null";
                
            }else{
                PerfilU[7] = "null";
                PerfilU[8] = "null";
                PerfilU[9] = ((Instructor)perfilSolicitado).getDiasDisp();          
            }
            modelo.addRow(PerfilU);
                
        
    }//GEN-LAST:event_btn_BuscarCedulaActionPerformed

    private void btn_EliminarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EliminarPActionPerformed
        // TODO add your handling code here:
        tablaPerfiles.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
                String[] filaDatos = new String[10];
                tablaPerfiles.getSelectionModel().addListSelectionListener(e -> {
                int filaSeleccionada = tablaPerfiles.getSelectedRow();
            
            if (filaSeleccionada != -1) {
                // Obtener los valores de la fila seleccionada
                
                for (int i = 0; i < filaDatos.length; i++) {
                    filaDatos[i] = (String) tablaPerfiles.getValueAt(filaSeleccionada, i);
                }
                // Mostrar los valores en la consola
                System.out.println("Datos de la fila seleccionada:");
                for (Object dato : filaDatos) {
                    System.out.println(dato);
                } 
            }
            Integer cedulaSeleccion = Integer.parseInt(filaDatos[0]);
                
                Usuario perfilUsuario = ControladorPerfiles.buscarPerfil(cedulaSeleccion);
                int opcion = JOptionPane.showOptionDialog(null, "seguro desea borrar el perfil?", "Advertencia", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE, null, new String[]{"Sí", "No"}, "Sí");

                if (opcion == JOptionPane.YES_OPTION) {
                    // El usuario seleccionó "Sí"
                    System.out.println("El usuario seleccionó 'Sí'");
                    ControladorPerfiles.borrarPerfil(perfilUsuario);
                    JOptionPane.showMessageDialog(null, "perfil borrado con exito");
                } else {
                    // El usuario seleccionó "No" o cerró el cuadro de diálogo
                    System.out.println("El usuario seleccionó 'No' o cerró el cuadro de diálogo");
                }
                
        });
    }//GEN-LAST:event_btn_EliminarPActionPerformed

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
            java.util.logging.Logger.getLogger(ListaPerfiles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListaPerfiles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListaPerfiles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListaPerfiles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListaPerfiles().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel I_Volver;
    private javax.swing.JButton btn_BuscarCedula;
    private javax.swing.JButton btn_EliminarP;
    private javax.swing.JButton btn_FiltroAdmin;
    private javax.swing.JButton btn_FiltroAlumnos;
    private javax.swing.JButton btn_FiltroInstructores;
    private javax.swing.JButton btn_ListaCompleta;
    private javax.swing.JButton btn_ModificarP;
    private javax.swing.JButton btn_Volver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaPerfiles;
    private javax.swing.JTextField txt_cedulaB;
    // End of variables declaration//GEN-END:variables
}
