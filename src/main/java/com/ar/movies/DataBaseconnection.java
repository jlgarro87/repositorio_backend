package com.ar.movies;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBaseconnection {
    private static final String URL = "jdbc:mysql://localhost:3306/proyecto_movies_2024";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    public static Connection getConnection() {
        Connection connection = null;
        try {
            // DriverManager es una clase de java.sql.DriverManager
            // este getConnection, es un metodo static de la clase DriverManager
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Conexión a la base de datos establecida.");
        } catch (SQLException e) {
            System.err.println("Error al conectar a la base de datos: " + e.getMessage());
        }
        return connection;
    }

    public static void main(String[] args) {
        // Prueba de conexión
        Connection conn = DataBaseconnection.getConnection();
        if (conn != null) {
            try {
                conn.close();
                System.out.println("Conexión cerrada.");
            } catch (SQLException e) {
                System.err.println("Error al cerrar la conexión: " + e.getMessage());
            }
        }
    }
}
