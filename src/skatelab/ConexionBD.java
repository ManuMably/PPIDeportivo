
package skatelab;


import java.sql.*;
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
    
    public void imprimirDatos(){
        try {
            // preparamos el statement para solicitar los datos 
            con = DriverManager.getConnection(url, usuario, clave);
            stmt = con.createStatement();
            rs = stmt.executeQuery("SELECT * FROM usuario");
            rs.next();
            do {                
                System.out.println(rs.getString("nombres"));
            } while (rs.next());
        } catch (SQLException e) {
            System.out.println("Error al conectar con la base de datos: " + e.getMessage());
        }
    
    }
    // Insersiones: Usuarios,claseParticular-------------------------------------------
    public <T extends Usuario> void InsertarUsuario(T instancia) {
        if (instancia instanceof Alumno) {
                    try {
                // Preparamos la conexión y la sentencia SQL para insertar los datos
                con = DriverManager.getConnection(url, usuario, clave);
                String sql = "INSERT INTO usuario (id_cedula, clave, respuesta_seguridad, nombres, apellidos, celular, correo, ocupacion) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
                PreparedStatement pstmt = con.prepareStatement(sql);

                // Establecemos los valores de los parámetros en la sentencia SQL
                pstmt.setInt(1, ((Alumno) instancia).getCedula());
                pstmt.setString(2, String.valueOf(instancia.getContrasena()));
                pstmt.setString(3, instancia.getRespuestaSeguridad());
                pstmt.setString(4, instancia.getNombres());
                pstmt.setString(5, instancia.getApellidos());
                pstmt.setString(6, String.valueOf(instancia.getCelular()));
                pstmt.setString(7, instancia.getCorreo());
                pstmt.setString(8, ((Alumno) instancia).getOcupacion());

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
        else if (instancia instanceof Instructor) {
            try {
                // Preparamos la conexión y la sentencia SQL para insertar los datos
                con = DriverManager.getConnection(url, usuario, clave);
                String sql = "INSERT INTO usuario (id_cedula, clave, respuesta_seguridad, nombres, apellidos, celular, correo, dias_disponibles) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
                PreparedStatement pstmt = con.prepareStatement(sql);

                // Establecemos los valores de los parámetros en la sentencia SQL
                pstmt.setInt(1, ((Instructor) instancia).getCedula());
                pstmt.setString(2, String.valueOf(instancia.getContrasena()));
                pstmt.setString(3, instancia.getRespuestaSeguridad());
                pstmt.setString(4, instancia.getNombres());
                pstmt.setString(5, instancia.getApellidos());
                pstmt.setString(6, String.valueOf(instancia.getCelular()));
                pstmt.setString(7, instancia.getCorreo());
                pstmt.setString(8, ((Instructor) instancia).getDiasDisp());

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
        if (instancia instanceof Alumno) {
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
                pstmt.setString(7, ((Alumno) instancia).getOcupacion());
                pstmt.setInt(8, ((Alumno) instancia).getCedula());

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
        else if (instancia instanceof Instructor) {
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
                pstmt.setString(7, ((Instructor) instancia).getDiasDisp());
                pstmt.setInt(8, ((Instructor) instancia).getCedula());

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
    
}
