package com.zone.ws.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import com.mysql.jdbc.PreparedStatement;
import com.zone.util.Conexion;
import com.zone.ws.vo.VOUsuario;

public class DUser {
	
	Connection cn=null;
	PreparedStatement ps=null;
	ResultSet rs=null;
	
	public List<VOUsuario> listar(){
		
		List<VOUsuario> lista = new ArrayList<VOUsuario>();
		VOUsuario u=null;
		
		try {
			cn=Conexion.getConexion();
			String sql="SELECT id_usuario,nombre,email,estado,id_perfil FROM usuario";
			ps=(PreparedStatement) cn.prepareStatement(sql);
			rs=ps.executeQuery();
			
			while(rs.next()){
				u = new VOUsuario();
				u.setIdUsuario(rs.getInt("id_usuario"));
				u.setUsuario(rs.getString("nombre"));
				u.setEmail(rs.getString("email"));
				u.setEstado(rs.getInt("estado"));
				u.setIdPerfil(rs.getInt("id_perfil"));
				lista.add(u);
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("ERROR AL LISTAR");
		}
		
		return lista;
	}
	
public Integer agregar (VOUsuario user ){
	Integer lineasafectadas=0;
	
	try {
		String sql="INSERT INTO USUARIO (nombre,email,estado,id_perfil) VALUES (?,?,?,?)";
		cn=Conexion.getConexion();
		ps= (PreparedStatement) cn.prepareStatement(sql);
		ps.setString(1, user.getUsuario());
		ps.setString(2, user.getEmail());
		ps.setInt(3, user.getEstado());
		ps.setInt(4, user.getIdPerfil());
		lineasafectadas=ps.executeUpdate();
		
	} catch (Exception e) {
		System.out.println("ERROR AL INSERTAR"+e.getMessage());
		// TODO: handle exception
	}finally {
		try {
			cn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	return lineasafectadas;
}

	public static void main(String[] args) {
	 /*
		DUser u = new DUser();
		VOUsuario user = new VOUsuario();
		user.setUsuario("Cesar Test Eclipse");
		user.setEmail("email.eclipse@gmail.com");
		user.setEstado(1);
		user.setIdPerfil(1);
		u.agregar(user);
		*/
		
		DUser us = new DUser();
		
		for(VOUsuario u:us.listar()){
		System.out.println(u.getEmail()) ;
		}
		
	}

}
