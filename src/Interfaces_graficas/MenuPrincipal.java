/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaces_graficas;

/**
 *
 * @author ROGER
 */
public class MenuPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form MenuPrincipal
     */
    public MenuPrincipal() {
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

        iconoPerfiles = new javax.swing.JLabel();
        iconoEntrenamientos = new javax.swing.JLabel();
        iconoAgendamiento = new javax.swing.JLabel();
        iconoInformes = new javax.swing.JLabel();
        lbl_MenuPPal = new javax.swing.JLabel();
        imgCerrarSesion = new javax.swing.JLabel();
        btn_Perfiles = new javax.swing.JButton();
        btn_Agendamiento = new javax.swing.JButton();
        btn_EntrenamientosAgendados = new javax.swing.JButton();
        btn_InformesEntrenamientos = new javax.swing.JButton();
        bnt_CerrarSesion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        iconoPerfiles.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaces_graficas/Imagenes/Perfiles.png"))); // NOI18N

        iconoEntrenamientos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaces_graficas/Imagenes/Entrenamientos Agendados.png"))); // NOI18N

        iconoAgendamiento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaces_graficas/Imagenes/Agendamiento.png"))); // NOI18N

        iconoInformes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaces_graficas/Imagenes/Informes Entrenamientos.png"))); // NOI18N

        lbl_MenuPPal.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lbl_MenuPPal.setText("Menu Principal");

        imgCerrarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaces_graficas/Imagenes/Cerrar Sesion.png"))); // NOI18N

        btn_Perfiles.setText("Perfiles");
        btn_Perfiles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_PerfilesActionPerformed(evt);
            }
        });

        btn_Agendamiento.setText("Agendamiento");

        btn_EntrenamientosAgendados.setText("Entrenamientos Agendados");

        btn_InformesEntrenamientos.setText("Informes Entrenamientos");

        bnt_CerrarSesion.setText("Cerrar Sesion");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(imgCerrarSesion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(bnt_CerrarSesion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 110, Short.MAX_VALUE)
                        .addComponent(lbl_MenuPPal)
                        .addGap(269, 269, 269))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(iconoEntrenamientos)
                            .addComponent(iconoPerfiles)
                            .addComponent(btn_Perfiles)
                            .addComponent(btn_EntrenamientosAgendados))
                        .addGap(67, 67, 67)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(iconoAgendamiento)
                            .addComponent(iconoInformes)
                            .addComponent(btn_Agendamiento)
                            .addComponent(btn_InformesEntrenamientos))
                        .addGap(137, 137, 137))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_MenuPPal)
                            .addComponent(bnt_CerrarSesion))
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(iconoAgendamiento)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_Agendamiento))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(iconoPerfiles)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_Perfiles)))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(iconoEntrenamientos, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(iconoInformes, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_EntrenamientosAgendados)
                            .addComponent(btn_InformesEntrenamientos))
                        .addGap(56, 56, 56))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(imgCerrarSesion)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_PerfilesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_PerfilesActionPerformed
        // TODO add your handling code here:
        
        //cierro la ventana actual
        this.dispose();
        // creo una instacia de la ventana de Perfiles
        Perfiles ventanaPerfiles = new Perfiles();
        // hacemos la ventana visible
        ventanaPerfiles.setVisible(true);
    }//GEN-LAST:event_btn_PerfilesActionPerformed

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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bnt_CerrarSesion;
    private javax.swing.JButton btn_Agendamiento;
    private javax.swing.JButton btn_EntrenamientosAgendados;
    private javax.swing.JButton btn_InformesEntrenamientos;
    private javax.swing.JButton btn_Perfiles;
    private javax.swing.JLabel iconoAgendamiento;
    private javax.swing.JLabel iconoEntrenamientos;
    private javax.swing.JLabel iconoInformes;
    private javax.swing.JLabel iconoPerfiles;
    private javax.swing.JLabel imgCerrarSesion;
    private javax.swing.JLabel lbl_MenuPPal;
    // End of variables declaration//GEN-END:variables
}
