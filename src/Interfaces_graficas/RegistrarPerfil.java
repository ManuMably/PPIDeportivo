/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaces_graficas;

/**
 *
 * @author ROGER
 */
public class RegistrarPerfil extends javax.swing.JFrame {

    /**
     * Creates new form RegistrarPerfil
     */
    public RegistrarPerfil() {
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

        I_Volver = new javax.swing.JLabel();
        bnt_Volver = new javax.swing.JButton();
        lbl_RegistrarPerfil = new javax.swing.JLabel();
        I_RAlumno = new javax.swing.JLabel();
        I_RInstructor = new javax.swing.JLabel();
        I_RAdmin = new javax.swing.JLabel();
        btn_AlumnoR = new javax.swing.JButton();
        btn_InstructorR = new javax.swing.JButton();
        btn_AdminR = new javax.swing.JButton();
        lbl_PreguntaTipo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        I_Volver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaces_graficas/Imagenes/volver.png"))); // NOI18N

        bnt_Volver.setText("Volver");

        lbl_RegistrarPerfil.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        lbl_RegistrarPerfil.setText("Registrar Perfil");

        I_RAlumno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaces_graficas/Imagenes/registrarPrf.JPG"))); // NOI18N

        I_RInstructor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaces_graficas/Imagenes/registrarPrf.JPG"))); // NOI18N

        I_RAdmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaces_graficas/Imagenes/registrarPrf.JPG"))); // NOI18N

        btn_AlumnoR.setText("Alumno");

        btn_InstructorR.setText("Instructor");

        btn_AdminR.setText("Administrativo");

        lbl_PreguntaTipo.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lbl_PreguntaTipo.setText("¿Que tipo de Perfil desea registrar?");

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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(I_RAlumno)
                            .addComponent(btn_AlumnoR))
                        .addGap(134, 134, 134)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(I_RInstructor)
                            .addComponent(btn_InstructorR))
                        .addGap(134, 134, 134)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_AdminR)
                            .addComponent(I_RAdmin)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bnt_Volver)
                        .addGap(131, 131, 131)
                        .addComponent(lbl_RegistrarPerfil)))
                .addContainerGap(94, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbl_PreguntaTipo)
                .addGap(164, 164, 164))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 96, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(I_RInstructor)
                    .addComponent(I_RAlumno)
                    .addComponent(I_RAdmin))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_AlumnoR)
                    .addComponent(btn_InstructorR)
                    .addComponent(btn_AdminR))
                .addGap(114, 114, 114))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
    private javax.swing.JLabel I_RAlumno;
    private javax.swing.JLabel I_RInstructor;
    private javax.swing.JLabel I_Volver;
    private javax.swing.JButton bnt_Volver;
    private javax.swing.JButton btn_AdminR;
    private javax.swing.JButton btn_AlumnoR;
    private javax.swing.JButton btn_InstructorR;
    private javax.swing.JLabel lbl_PreguntaTipo;
    private javax.swing.JLabel lbl_RegistrarPerfil;
    // End of variables declaration//GEN-END:variables
}
