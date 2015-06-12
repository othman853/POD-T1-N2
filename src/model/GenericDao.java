package model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

public abstract class GenericDao {

	protected void executeSQL(String sql, Object... parameters)
			throws Exception {
		
		try {
			PreparedStatement pstm = ConnectionManager.getInstance()
					.getConnection().prepareStatement(sql);

			for (int i = 0; i < parameters.length; i++) {
				pstm.setObject(i + 1, parameters[i]);
			}
			pstm.execute();

		} catch (Exception ex) {
			throw new Exception("Erro SQL: " + ex.getMessage());
		}
	}
	
	protected ResultSet executeQuery(String sql) throws Exception{
		try {
			PreparedStatement pstm = ConnectionManager.getInstance()
					.getConnection().prepareStatement(sql);
						
			ResultSet result = pstm.executeQuery();
			
			pstm.close();
			
			return result;

		} catch (Exception ex) {
			throw new Exception("Erro SQL: " + ex.getMessage());
		}		
	}

	protected ResultSet executeQuery(String sql, Object... parameters) throws Exception{

		try {
			PreparedStatement pstm = ConnectionManager.getInstance()
					.getConnection().prepareStatement(sql);

			for (int i = 0; i < parameters.length; i++) {
				pstm.setObject(i + 1, parameters[i]);
			}
			
			ResultSet result = pstm.executeQuery();
			
			pstm.close();
			
			return result;

		} catch (Exception ex) {
			throw new Exception("Erro SQL: " + ex.getMessage());
		}

	}
}
