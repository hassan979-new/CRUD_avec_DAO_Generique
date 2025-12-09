package ma.project.dao;

import java.util.ArrayList;
import java.util.List;

import ma.project.bean.Identifiable;

public class ListDao<T extends Identifiable> implements Dao<T> {

	protected final List<T> items = new ArrayList<>();

	@Override
	public void creat(T o) {
		items.add(o);
	}

	@Override
	public T update(T o) {
		for (int i = 0; i < items.size(); i++) {
			if (items.get(i).getId() == o.getId()) {
				items.set(i, o);
				return o;
			}
		}
		return null;
	}

	@Override
	public boolean delete(int id) {
		return items.removeIf(o -> o.getId() == id);
	}

	@Override
	public T findById(int id) {
		return items.stream().filter(o -> o.getId() == id).findFirst().orElse(null);
	}

	@Override
	public List<T> findAll() {
		return new ArrayList<>(items);
	}
}
