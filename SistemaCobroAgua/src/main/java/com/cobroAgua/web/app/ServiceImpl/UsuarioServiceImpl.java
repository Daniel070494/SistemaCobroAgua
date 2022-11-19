package com.cobroAgua.web.app.ServiceImpl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.cobroAgua.web.app.Model.Usuario;
import com.cobroAgua.web.app.Service.UsuarioService;

@Repository("usuarioServiceImpl")
public class UsuarioServiceImpl implements UsuarioService {
	
	@Autowired
	@Qualifier("jdbcTemplate")
	private JdbcTemplate jdbcTemplate;

	@SuppressWarnings("unchecked")
	@Override
	public List<Usuario> getUsuarios() {
		StringBuffer query = new StringBuffer();
		
		List<Usuario> lista = null;
		
		query.append("\n SELECT user_n, nombre, ap_paterno, ap_materno FROM usuario");
		
		System.out.println("Query lista usuarios: " + query.toString());
		
		try {
			lista = (List<Usuario>) jdbcTemplate.query(query.toString(), new UsuarioMapper());
		} catch (DataAccessException e){
			System.out.println("Error al consultar: " + e.toString());
		}
		return lista;
	}

	@SuppressWarnings("rawtypes")
	  private static final class UsuarioMapper implements RowMapper {
	    public Usuario mapRow(ResultSet rs, int rowNum) throws SQLException {
	    	Usuario datos = new Usuario();
 
	    	datos.setUser_n(rs.getInt("user_n"));
	    	datos.setNombre(rs.getNString("nombre"));
	    	datos.setApPaterno(rs.getString("ap_paterno"));
	    	datos.setApMaterno(rs.getString("ap_materno"));
	    	
	    	return datos;
	    }
	}    
}
