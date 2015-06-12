package model;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class LoginDao extends GenericDao implements Dao<Login>{
	
	private static final String SAVE = "INSERT INTO login () VALUES ()";
	private static final String DELETE = "DELETE FROM login WHERE";
	private static final String FIND = "SELECT  FROM login WHERE";
	private static final String FIND_ALL = "SELECT FROM login ";

	@Override
	public void save(Login obj) throws Exception {
		executeSQL(SAVE, parameters);		
	}

	@Override
	public void delete(Login obj) throws Exception {
		executeSQL(DELETE, parameters);
	}

	@Override
	public Login find(Login obj) throws Exception {
		executeQuery(FIND, parameters);
		return null;
	}

	@Override
	public ArrayList<?> findAll() throws Exception {
		return tratarResultSet(executeQuery(FIND_ALL));
		
	}
	
	private ArrayList<?> tratarResultSet(ResultSet result){
		
	}

}
