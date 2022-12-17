package com.cobroAgua.web.app.ServiceImpl;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.cobroAgua.web.app.Model.Usuario;
import com.cobroAgua.web.app.Service.LoginService;

@Repository("loginServiceImpl")
public class LoginServiceImpl implements LoginService {
	
	@Autowired
	@Qualifier("jdbcTemplate")
	private JdbcTemplate jdbcTemplate;

	@SuppressWarnings("unchecked")
	@Override
	public Usuario obtenUnsuario(String usuario) {
		StringBuffer query = new StringBuffer();
		Usuario datos = new Usuario();
		
		query.append("\n SELECT ");
		query.append("\n     u.user_n,");
		query.append("\n     u.nombre,");
		query.append("\n     u.ap_paterno,");
		query.append("\n     u.ap_materno,");
		query.append("\n     u.user_name,");
		query.append("\n     u.password,");
		query.append("\n     u.est_n,");
		query.append("\n     u.rol_n,");
		query.append("\n     e.est_l,");
		query.append("\n     r.rol_l");
		query.append("\n FROM ");
		query.append("\n     usuario u,");
		query.append("\n     rol r,");
		query.append("\n     estatus e");
		query.append("\n WHERE ");
		query.append("\n     1 = 1 ");
		query.append("\n     AND u.est_n = e.est_n");
		query.append("\n 	AND u.rol_n = r.rol_n");
		query.append("\n 	AND u.user_name = '" + usuario + "'");

		System.out.println("Query obten datos actor: " + query.toString());
		
	    try {
	        datos = (Usuario) jdbcTemplate.queryForObject(query.toString(), new UsuarioMapper());
	      } catch (Exception e) {
	        System.out.println("Exception login:" + e.toString());
	      }
		
		return datos;
	}

	  @SuppressWarnings("rawtypes")
	  private static final class UsuarioMapper implements RowMapper {
	  
	    public Usuario mapRow(ResultSet rs, int rowNum) throws SQLException {
	    	Usuario user = new Usuario();
	      
	    	user.setUser_n(rs.getInt("user_n"));
	    	user.setNombre(rs.getString("nombre"));
	      
	      return user;
	    }
	  }
}
