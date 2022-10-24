/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.github.ffrancoc.controlacademico.controller.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author francisco
 */
public class Conexion {
    private static final Logger LOGGER = Logger.getLogger(Conexion.class.getName());
    private static Connection conn = null;

    public static Connection getConexion() {
        try {
            String url = "jdbc:mariadb://localhost/control_academico";
            Class.forName("org.mariadb.jdbc.Driver");            
            conn = DriverManager.getConnection(url, "root", "@dmin22");                
        } catch (ClassNotFoundException | SQLException ex) {
            LOGGER.log(Level.SEVERE, "Error la conectar con la base de datos: {0}", ex.getMessage());
        }
        return conn;
    }
}
