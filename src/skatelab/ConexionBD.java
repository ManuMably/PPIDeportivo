
package skatelab;


import java.sql.*;
import java.util.ArrayList;
import java.util.List;
public class ConexionBD {
    
    //Atributos
    String usuario = "root";
    String clave = "";
    String url = "jdbc:mysql://localhost:3306/bd_skatelab";
    Connection con;
    Statement stmt;
    ResultSet rs;
    
    //Pruebas de conexion
    public void conectar() {
        try {
            // Establecer la conexión
            con = DriverManager.getConnection(url, usuario, clave);
            System.out.println("Conexión exitosa.");
        } catch (SQLException e) {
            System.out.println("Error al conectar con la base de datos: " + e.getMessage());
        }
    }

    public void desconectar() {
        try {
            if (con != null) {
                con.close();
                System.out.println("Desconexión exitosa.");
            }
        } catch (SQLException e) {
            System.out.println("Error al cerrar la conexión: " + e.getMessage());
        }
    }
    
    public List cargarListaUsuarios(){
        List<Usuario> perfilesbdList = new ArrayList<>();
        try {
            // preparamos el statement para solicitar los datos 
            con = DriverManager.getConnection(url, usuario, clave);
            stmt = con.createStatement();
            rs = stmt.executeQuery("SELECT * FROM usuario");
            rs.next();
            do {
                if (rs.getString("ocupacion")!= null) {
                    Integer cedula = rs.getInt("id_cedula");
                    Integer contrasena = Integer.parseInt(rs.getString("clave"));
                    String respuestaSeguridad = rs.getString("respuesta_seguridad");
                    String nombres = rs.getString("nombres");
                    String apellidos = rs.getString("apellidos");
                    Long celular = Long.parseLong(rs.getString("celular"));
                    String correo = rs.getString("correo");
                    String ocupacion = rs.getString("ocupacion");
                    
                    Estudiante alumnoBD = new Estudiante(cedula, contrasena, respuestaSeguridad, nombres, apellidos, celular, correo, ocupacion);
                    perfilesbdList.add(alumnoBD);
                }
                else if (rs.getString("segundaClave")!= null) {
                    Integer cedula = rs.getInt("id_cedula");
                    Integer contrasena = Integer.parseInt(rs.getString("clave"));
                    String respuestaSeguridad = rs.getString("respuesta_seguridad");
                    String nombres = rs.getString("nombres");
                    String apellidos = rs.getString("apellidos");
                    Long celular = Long.parseLong(rs.getString("celular"));
                    String correo = rs.getString("correo");
                    String contrasena2 = rs.getString("segundaClave");
                    
                    Administrativo administrativoBD = new Administrativo(cedula, contrasena, respuestaSeguridad, nombres, apellidos, celular, correo, contrasena2);
                    perfilesbdList.add(administrativoBD);
                    
                }else{
                    Integer cedula = rs.getInt("id_cedula");
                    Integer contrasena = Integer.parseInt(rs.getString("clave"));
                    String respuestaSeguridad = rs.getString("respuesta_seguridad");
                    String nombres = rs.getString("nombres");
                    String apellidos = rs.getString("apellidos");
                    Long celular = Long.parseLong(rs.getString("celular"));
                    String correo = rs.getString("correo");
                    String diasDisponibles = rs.getString("dias_disponibles");
                    
                    Docente instructorBD = new Docente(cedula, contrasena, respuestaSeguridad, nombres, apellidos, celular, correo, diasDisponibles);
                    perfilesbdList.add(instructorBD);
                    
                }
                System.out.println(rs.getString("id_cedula"));
            } while (rs.next());
        } catch (SQLException e) {
            System.out.println("Error al conectar con la base de datos: " + e.getMessage());
        }
        return perfilesbdList;
    }
    // Insersiones: Usuarios,claseParticular-------------------------------------------
    public <T extends Usuario> void InsertarUsuario(T instancia) {
        if (instancia instanceof Estudiante) {
                    try {
                // Preparamos la conexión y la sentencia SQL para insertar los datos
                con = DriverManager.getConnection(url, usuario, clave);
                String sql = "INSERT INTO usuario (id_cedula, clave, respuesta_seguridad, nombres, apellidos, celular, correo, ocupacion) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
                PreparedStatement pstmt = con.prepareStatement(sql);

                // Establecemos los valores de los parámetros en la sentencia SQL
                pstmt.setInt(1, ((Estudiante) instancia).getCedula());
                pstmt.setString(2, String.valueOf(instancia.getContrasena()));
                pstmt.setString(3, instancia.getRespuestaSeguridad());
                pstmt.setString(4, instancia.getNombres());
                pstmt.setString(5, instancia.getApellidos());
                pstmt.setString(6, String.valueOf(instancia.getCelular()));
                pstmt.setString(7, instancia.getCorreo());
                pstmt.setString(8, ((Estudiante) instancia).getOcupacion());

                // Ejecutamos la sentencia SQL para insertar los datos
                int filasAfectadas = pstmt.executeUpdate();

                if (filasAfectadas > 0) {
                    System.out.println("Los datos se han insertado correctamente.");
                } else {
                    System.out.println("No se han insertado datos.");
                }
            } catch (SQLException e) {
                System.out.println("Error al conectar con la base de datos o al insertar datos: " + e.getMessage());
            } finally {
                // Cerramos los recursos
                try {
                    if (stmt != null) stmt.close();
                    if (con != null) con.close();
                } catch (SQLException e) {
                    System.out.println("Error al cerrar la conexión: " + e.getMessage());
                }
            }
            
        }
        else if (instancia instanceof Docente) {
            try {
                // Preparamos la conexión y la sentencia SQL para insertar los datos
                con = DriverManager.getConnection(url, usuario, clave);
                String sql = "INSERT INTO usuario (id_cedula, clave, respuesta_seguridad, nombres, apellidos, celular, correo, dias_disponibles) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
                PreparedStatement pstmt = con.prepareStatement(sql);

                // Establecemos los valores de los parámetros en la sentencia SQL
                pstmt.setInt(1, ((Docente) instancia).getCedula());
                pstmt.setString(2, String.valueOf(instancia.getContrasena()));
                pstmt.setString(3, instancia.getRespuestaSeguridad());
                pstmt.setString(4, instancia.getNombres());
                pstmt.setString(5, instancia.getApellidos());
                pstmt.setString(6, String.valueOf(instancia.getCelular()));
                pstmt.setString(7, instancia.getCorreo());
                pstmt.setString(8, ((Docente) instancia).getDiasDisp());

                // Ejecutamos la sentencia SQL para insertar los datos
                int filasAfectadas = pstmt.executeUpdate();

                if (filasAfectadas > 0) {
                    System.out.println("Los datos se han insertado correctamente.");
                } else {
                    System.out.println("No se han insertado datos.");
                }
            } catch (SQLException e) {
                System.out.println("Error al conectar con la base de datos o al insertar datos: " + e.getMessage());
            } finally {
                // Cerramos los recursos
                try {
                    if (stmt != null) stmt.close();
                    if (con != null) con.close();
                } catch (SQLException e) {
                    System.out.println("Error al cerrar la conexión: " + e.getMessage());
                }
            }
            
        }
        else{
            try {
                // Preparamos la conexión y la sentencia SQL para insertar los datos
                con = DriverManager.getConnection(url, usuario, clave);
                String sql = "INSERT INTO usuario (id_cedula, clave, respuesta_seguridad, nombres, apellidos, celular, correo, segundaClave) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
                PreparedStatement pstmt = con.prepareStatement(sql);

                // Establecemos los valores de los parámetros en la sentencia SQL
                pstmt.setInt(1, ((Administrativo) instancia).getCedula());
                pstmt.setString(2, String.valueOf(instancia.getContrasena()));
                pstmt.setString(3, instancia.getRespuestaSeguridad());
                pstmt.setString(4, instancia.getNombres());
                pstmt.setString(5, instancia.getApellidos());
                pstmt.setString(6, String.valueOf(instancia.getCelular()));
                pstmt.setString(7, instancia.getCorreo());
                pstmt.setString(8, ((Administrativo) instancia).getContrasena2());

                // Ejecutamos la sentencia SQL para insertar los datos
                int filasAfectadas = pstmt.executeUpdate();

                if (filasAfectadas > 0) {
                    System.out.println("Los datos se han insertado correctamente.");
                } else {
                    System.out.println("No se han insertado datos.");
                }
            } catch (SQLException e) {
                System.out.println("Error al conectar con la base de datos o al insertar datos: " + e.getMessage());
            } finally {
                // Cerramos los recursos
                try {
                    if (stmt != null) stmt.close();
                    if (con != null) con.close();
                } catch (SQLException e) {
                    System.out.println("Error al cerrar la conexión: " + e.getMessage());
                }
            }
        }
    }
    
    // fin inserciones: ususarios, claseParticular-------------------------------------
    
    // actualizaciones  : ususarios, claseParticular-----------------------------------
    public <T extends Usuario> void actualizarUsuario(T instancia) {
        if (instancia instanceof Estudiante) {
                    try {
                // Preparamos la conexión y la sentencia SQL para insertar los datos
                con = DriverManager.getConnection(url, usuario, clave);
                String sql = "UPDATE usuario SET clave = ?, respuesta_seguridad = ?, nombres = ?, apellidos = ?, celular = ?, correo = ?, ocupacion = ? WHERE id_cedula = ?";
                PreparedStatement pstmt = con.prepareStatement(sql);

                // Establecemos los valores de los parámetros en la sentencia SQL
                
                pstmt.setString(1, String.valueOf(instancia.getContrasena()));
                pstmt.setString(2, instancia.getRespuestaSeguridad());
                pstmt.setString(3, instancia.getNombres());
                pstmt.setString(4, instancia.getApellidos());
                pstmt.setString(5, String.valueOf(instancia.getCelular()));
                pstmt.setString(6, instancia.getCorreo());
                pstmt.setString(7, ((Estudiante) instancia).getOcupacion());
                pstmt.setInt(8, ((Estudiante) instancia).getCedula());

                // Ejecutamos la sentencia SQL para insertar los datos
                int filasAfectadas = pstmt.executeUpdate();

                if (filasAfectadas > 0) {
                    System.out.println("Los datos se han actualizado correctamente.");
                } else {
                    System.out.println("No se han actualizado datos.");
                }
            } catch (SQLException e) {
                System.out.println("Error al conectar con la base de datos o al actualizar datos: " + e.getMessage());
            } finally {
                // Cerramos los recursos
                try {
                    if (stmt != null) stmt.close();
                    if (con != null) con.close();
                } catch (SQLException e) {
                    System.out.println("Error al cerrar la conexión: " + e.getMessage());
                }
            }
            
        }
        else if (instancia instanceof Docente) {
            try {
                // Preparamos la conexión y la sentencia SQL para insertar los datos
                con = DriverManager.getConnection(url, usuario, clave);
                String sql = "UPDATE usuario SET clave = ?, respuesta_seguridad = ?, nombres = ?, apellidos = ?, celular = ?, correo = ?, dias_disponibles = ? WHERE id_cedula = ?";
                PreparedStatement pstmt = con.prepareStatement(sql);

                // Establecemos los valores de los parámetros en la sentencia SQL
                
                pstmt.setString(1, String.valueOf(instancia.getContrasena()));
                pstmt.setString(2, instancia.getRespuestaSeguridad());
                pstmt.setString(3, instancia.getNombres());
                pstmt.setString(4, instancia.getApellidos());
                pstmt.setString(5, String.valueOf(instancia.getCelular()));
                pstmt.setString(6, instancia.getCorreo());
                pstmt.setString(7, ((Docente) instancia).getDiasDisp());
                pstmt.setInt(8, ((Docente) instancia).getCedula());

                // Ejecutamos la sentencia SQL para insertar los datos
                int filasAfectadas = pstmt.executeUpdate();

                if (filasAfectadas > 0) {
                    System.out.println("Los datos se han actualizado correctamente.");
                } else {
                    System.out.println("No se han actualizado datos.");
                }
            } catch (SQLException e) {
                System.out.println("Error al conectar con la base de datos o al actualizar datos: " + e.getMessage());
            } finally {
                // Cerramos los recursos
                try {
                    if (stmt != null) stmt.close();
                    if (con != null) con.close();
                } catch (SQLException e) {
                    System.out.println("Error al cerrar la conexión: " + e.getMessage());
                }
            }
            
        }
        else{
            try {
                // Preparamos la conexión y la sentencia SQL para insertar los datos
                con = DriverManager.getConnection(url, usuario, clave);
                String sql = "UPDATE usuario SET clave = ?, respuesta_seguridad = ?, nombres = ?, apellidos = ?, celular = ?, correo = ?, segundaClave = ? WHERE id_cedula = ?";
                PreparedStatement pstmt = con.prepareStatement(sql);

                // Establecemos los valores de los parámetros en la sentencia SQL
                
                pstmt.setString(1, String.valueOf(instancia.getContrasena()));
                pstmt.setString(2, instancia.getRespuestaSeguridad());
                pstmt.setString(3, instancia.getNombres());
                pstmt.setString(4, instancia.getApellidos());
                pstmt.setString(5, String.valueOf(instancia.getCelular()));
                pstmt.setString(6, instancia.getCorreo());
                pstmt.setString(7, ((Administrativo) instancia).getContrasena2());
                pstmt.setInt(8, ((Administrativo) instancia).getCedula());

                // Ejecutamos la sentencia SQL para insertar los datos
                int filasAfectadas = pstmt.executeUpdate();

                if (filasAfectadas > 0) {
                    System.out.println("Los datos se han insertado correctamente.");
                } else {
                    System.out.println("No se han insertado datos.");
                }
            } catch (SQLException e) {
                System.out.println("Error al conectar con la base de datos o al insertar datos: " + e.getMessage());
            } finally {
                // Cerramos los recursos
                try {
                    if (stmt != null) stmt.close();
                    if (con != null) con.close();
                } catch (SQLException e) {
                    System.out.println("Error al cerrar la conexión: " + e.getMessage());
                }
            }
        }
    }
    
    // fin actualizaciones  : ususarios, claseParticular-------------------------------

    
    // consultas : nombre, apellido, cedula--------------------------------------------
    public void buscarPorNombres(String nombreSolicitado){
        
        try {
            // preparamos el statement para solicitar los datos 
            con = DriverManager.getConnection(url, usuario, clave);
            stmt = con.createStatement();
            rs = stmt.executeQuery("SELECT * FROM usuario WHERE nombres LIKE '%"+nombreSolicitado+"%'");
            rs.next();
            
            do {                
                System.out.println(rs.getString("respuestaSeguridad"));
            } while (rs.next());
        } catch (SQLException e) {
            System.out.println("Error al conectar con la base de datos: " + e.getMessage());
        }
    
    }
    
    public void buscarPorApellidos(String apellidoSolicitado){
        
        try {
            // preparamos el statement para solicitar los datos 
            con = DriverManager.getConnection(url, usuario, clave);
            stmt = con.createStatement();
            rs = stmt.executeQuery("SELECT * FROM usuario WHERE apellidos LIKE '%"+apellidoSolicitado+"%'");
            rs.next();
            
            do {                
                System.out.println(rs.getString("correo"));
            } while (rs.next());
        } catch (SQLException e) {
            System.out.println("Error al conectar con la base de datos: " + e.getMessage());
        }
    
    }
    
    public void buscarPorCedula(Integer cedulaSolicitada){
        String cedula = Integer.toString(cedulaSolicitada);
        try {
            // preparamos el statement para solicitar los datos 
            con = DriverManager.getConnection(url, usuario, clave);
            stmt = con.createStatement();
            rs = stmt.executeQuery("SELECT * FROM usuario WHERE id_cedula LIKE '%"+cedula+"%'");
            rs.next();
            
            do {                
                System.out.println(rs.getString("celular"));
            } while (rs.next());
        } catch (SQLException e) {
            System.out.println("Error al conectar con la base de datos: " + e.getMessage());
        }
    
    }
    // FIN consultas : nombre, apellido, cedula--------------------------------------------
    
    // Eliminar datos BD: Usuarios---------------------------------------------------------
    public void eliminarUsuario(Usuario usuarioBorrar){
            String cedula = Integer.toString(usuarioBorrar.getCedula());
        try {
            con = DriverManager.getConnection(url, usuario, clave);
            stmt = con.createStatement();
            // Sentencia DELETE para eliminar el usuario con la cédula proporcionada
            String sql = "DELETE FROM usuario WHERE id_cedula = ?";
            PreparedStatement pstmt = con.prepareStatement(sql);
            pstmt.setString(1, cedula);

            int filasAfectadas = pstmt.executeUpdate();
            if (filasAfectadas > 0) {
                System.out.println("Usuario eliminado correctamente.");
            } else {
                System.out.println("No se encontró ningún usuario con la cédula proporcionada.");
            }

        } catch (SQLException e) {
            System.out.println("Error al conectar con la base de datos: " + e.getMessage());
        } finally {
            // Cerrar recursos
            try {
                if (stmt != null) stmt.close();
                if (con != null) con.close();
            } catch (SQLException e) {
                System.out.println("Error al cerrar la conexión: " + e.getMessage());
            }
        }
    }
    // Fin Eliminar datos BD: Usuarios-----------------------------------------------------
}
