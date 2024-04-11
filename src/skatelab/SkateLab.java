
package skatelab;

import com.sun.source.tree.InstanceOfTree;
import java.util.List;



public class SkateLab {

    
    public static void main(String[] args) {
        ConexionBD conectorBD= new ConexionBD();
        
         /*Integer cedula = 1036665962;
         Integer contrasena = 123456;
         String respuestaSeguridad = "rosita";
         String nombres = "royer manuel";
         String apellidos = "pineda Martinez ";
         Integer celular = 5787039;
         String correo = "rmst58@gmail.com";
         String ocupacion = "cartero";
         
         Alumno alumno1 = new Alumno(cedula, contrasena, respuestaSeguridad, nombres, apellidos, celular, correo, ocupacion);
         conectorBD.actualizarUsuario(alumno1);*/
         
         List<Usuario> usuariosBD = conectorBD.cargarListaUsuarios();
         for (Usuario usuario : usuariosBD) {
             System.out.println( usuario.getClass());
        }
        
        
    }
    
}
