
package skatelab;

import Interfaces_graficas.InicioSesion;
import Interfaces_graficas.MenuPrincipal;
import com.sun.source.tree.InstanceOfTree;
import java.util.List;



public class SkateLab {

    
    public static void main(String[] args) {
        
        
        
        
        
        
        //Primero cargamos los Datos a las Listas del Programa
        ControladorPerfiles.cargarOrganizarPerfiles();
        ControladorDepEsce.cargarGrupos();
        ControladorDepEsce.cargarDeportes();
        ControladorDepEsce.cargarEscenarios();
        
        System.out.println(ControladorPerfiles.getSesionActualUsuario());        
         // creamos una nueva instancia de la ventana Iniciar Sesion para Recorrer las funciones del Programa
                InicioSesion ventanaInicioSesion = new InicioSesion();
                ventanaInicioSesion.setVisible(true);
                
        //---------------------------------------------------------------------------------------------------------------------------
        
        // Prueba de insersion de usuarios
        //estudiante:
        /*String ProgramaMatriculado = "tecnico profesional en programacion de sistemas";
        Integer carnet = 1036665871;
        String nombres = "carmelo alejandro";
        String apellidos = "estrada parrie";
        String correo = "calespa2024@elpoli.edu.co";
        String celular = "5787030";
        String contrasena = "123456789";
        String respuestaSeguridad = "lupita";
        
        Estudiante estPrueba = new Estudiante(ProgramaMatriculado, carnet, nombres, apellidos, correo, celular, contrasena, respuestaSeguridad);
        ControladorPerfiles.actualizarPerfil(estPrueba);*/
        
        //docente:
        /*
        Boolean vinculado = true;
        String codigoDias = "0010001";
        Integer carnet2 = 1036665961;
        String nombres2 = "pablo roberto";
        String apellidos2 = "zapata munera";
        String correo2 = "parozamu2024@elpoli.edu.co";
        String celular2 = "5787030259";
        String contrasena2 = "123456789";
        String respuestaSeguridad2 = "casper";
        
        Docente docPrueba = new Docente(vinculado, codigoDias, carnet2, nombres2, apellidos2, correo2, celular2, contrasena2, respuestaSeguridad2);
        ControladorPerfiles.actualizarPerfil(docPrueba);*/
        
        //Administrativo:
        /*
        String claveAdmin = "123456789";
        Integer carnet3 = 22242558;
        String nombres3 = "maria elena";
        String apellidos3 = "camacho sandoval";
        String correo3 = "maelcasa23237@elpoli.edu.co";
        String celular3 = "5787030269";
        String contrasena3 = "123456789";
        String respuestaSeguridad3 = "estrellita";
        
        Administrativo admPrueba = new Administrativo(claveAdmin, carnet3, nombres3, apellidos3, correo3, celular3, contrasena3, respuestaSeguridad3);
        ControladorPerfiles.actualizarPerfil(admPrueba);*/
        
        //TrabajadorExterno:
        /*
        String ocupacion = "aseo general";
        Integer carnet4 = 1036665864;
        String nombres4 = "angel Roberto";
        String apellidos4 = "pedroza garcia";
        String correo4 = "anropegaso2034@elpoli.edu.co";
        String celular4 = "5787030269";
        String contrasena4 = "123456789";
        String respuestaSeguridad4 = "morado";
        
        TrabajadorExterno traPrueba = new TrabajadorExterno(ocupacion, carnet4, nombres4, apellidos4, correo4, celular4, contrasena4, respuestaSeguridad4);
        ControladorPerfiles.actualizarPerfil(traPrueba);*/
        
        
        
    }
    
}
