/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexiones;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author steven
 */
public class ConexionMySQL {

    private static ConexionMySQL instance; //sibgleton
    private Connection cnn;
    private String driver = "com.mysql.cj.jdbc.Driver";
    private String user = "root";
    private String pss = "";
    private String nom_bd = "bd_tallerjavaweb";
    private String url = "jdbc:mysql://localhost:3308/";

    private ConexionMySQL() {

        try {
            Class.forName(driver);
            cnn = DriverManager.getConnection(url + nom_bd, user, pss);
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("error en driver mysql: " + ex.getMessage());
        }
    }

    public static synchronized ConexionMySQL getIntance() {
        if (instance == null) {
            instance = new ConexionMySQL();
        }
        return instance;
    }

    public Connection getCnn() {
        return cnn;
    }

    public void cerrarConexion() {
//        if (cnn != null) {
//            try {
//                cnn.close();
//            } catch (SQLException ex) {
//                System.out.println("error al cerrar la conexion: " + ex.getMessage());
//            }
//        }
        instance = null;
    }
}
