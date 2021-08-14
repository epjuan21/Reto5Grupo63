package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Conexion {

    private static String UBICACION_BD = "ProyectosConstruccion.db";

    String url = "jdbc:sqlite:" + UBICACION_BD;

    Connection conn = null;

    public static Connection getConnection() throws SQLException {
        String url = "jdbc:sqlite:" + UBICACION_BD;
        return DriverManager.getConnection(url);
    }

    public Conexion() {
        try {
            Class.forName("org.sqlite.JDBC");
            conn = DriverManager.getConnection(url);
            System.out.println("Conexion Exitosa");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public ResultSet consultarRegistros(String url) {
        try {
            PreparedStatement pstm = conn.prepareStatement(url);
            ResultSet Respuesta = pstm.executeQuery();
            return Respuesta;
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }
}