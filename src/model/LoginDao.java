package model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class LoginDao extends GenericDao implements Dao<Login>{
	
	private static final String SAVE = "INSERT INTO usuarios (cd_usuario, senha) VALUES (?, ?)";
	private static final String DELETE = "DELETE FROM usuarios WHERE cd_usuario = ? and senha = ?";
	private static final String FIND = "SELECT * FROM usuarios WHERE cd_usuario = ? and senha = ?";
	private static final String FIND_ALL = "SELECT FROM usuarios ";

	@Override
	public void save(Login obj) throws Exception {
		executeSQL(SAVE, obj.getUsuario(), obj.getSenha());		
	}

	@Override
	public void delete(Login obj) throws Exception {
		executeSQL(DELETE, obj.getUsuario(), obj.getSenha());
	}

	@Override
	public Login find(Login obj) throws Exception {		
		return (Login) tratarResultSet(executeQuery(FIND, obj.getUsuario(), obj.getSenha())).get(0);
	}

	@Override
	public ArrayList<Login> findAll() throws Exception {
		return tratarResultSet(executeQuery(FIND_ALL));		
	}
	
	private ArrayList<Login> tratarResultSet(ResultSet result){
		
		ArrayList<Login> logins = new ArrayList<>();
		
		try {
			while(result.next()){
				Login login = new Login(result.getString("cd_usuario"), result.getString("senha"));
				logins.add(login);
			}
		} catch (SQLException e) {
			System.out.println("[SQL ERROR]" + e.getMessage());
			e.printStackTrace();
		}
		
		return logins;	
	}

}
