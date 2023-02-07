package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.mysql.cj.xdevapi.Statement;

import conexion.ConexionBD;
import modelo.Libro;

public class LibroDao {

	private ConexionBD conexion;
	
	public LibroDao() {
		this.conexion=new ConexionBD();
	}
	
	public ArrayList<Libro> obtenerLibros(){
		//Obtener conexion a la base de datos
		Connection con = conexion.getConexion();
		Statement consulta=null;
		ResultSet resultado=null;
		ArrayList<Libro> lista= new ArrayList<Libro>();
		
		try {
			consulta = con.createStatement();
			resultado = consulta.executeQuery("select * from Libros");
			
			//Bucle para recorrer todas las filas que devuelve la consulta
			while(resultado.next()){
				int ISBN=resultado.getInt("ISBN");
				String titulo = resultado.getString("titulo");
				
			}
		}
	}
}
