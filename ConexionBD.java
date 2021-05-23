package modulo.altas.de.productos;

import java.sql.*;

public class ConexionBD {

    Connection conectar;

    String bd = "modulo_productos";
    String url = "jdbc:mysql://localhost/" + bd;
    String user = "root";
    String pass = "";

    public Connection conexion() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conectar = (Connection) DriverManager.getConnection(url, user, pass);
            System.out.println("se conecto");
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("no se conecto");
        }
        return conectar;

    }

}
