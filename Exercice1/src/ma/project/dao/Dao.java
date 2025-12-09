package ma.project.dao;

import java.util.List;

public interface Dao<T> {
	void creat(T o);

	T update(T o);

	boolean delete(int id);

	T findById(int id);

	List<T> findAll();
}
