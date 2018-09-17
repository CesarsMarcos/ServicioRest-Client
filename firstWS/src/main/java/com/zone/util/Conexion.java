package com.zone.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
	
	
	 private static String url = "jdbc:mysql://localhost/testupload?useSSL=false"
	 		+ "";
	    private static String user = "root";
	    private static String pass = "1234";
	    private static String driver = "com.mysql.jdbc.Driver";

	    public static Connection getConexion() throws SQLException {
	     
	        Connection cn = null;
	        try {
	            Class.forName(driver);
	            cn = DriverManager.getConnection(url, user, pass);
	            System.out.println("CONEXION EXITOSA");
	        } catch (ClassNotFoundException e) {
	            System.out.println("Error al conectar" + e.getMessage());
	        }
	        return cn;
	    }

	    public static void main(String[] args) throws SQLException {
	        Conexion.getConexion();
	    }



}
