package model;

import java.util.ArrayList;

public interface Dao<T> {
	public void save(T obj) throws Exception;
	public void delete(T obj) throws Exception;
	public T find(T obj) throws Exception;
	public ArrayList<?> findAll() throws Exception;

}
