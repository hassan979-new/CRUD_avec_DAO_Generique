package ma.project.service;

import java.util.List;
import java.util.stream.Collectors;

import ma.project.bean.Profile;
import ma.project.bean.Utilisateur;
import ma.project.dao.Dao;
import ma.project.dao.ListDao;

public class UserService {
	private final Dao<Utilisateur> dao = new ListDao<>();

	public Utilisateur create(String login, String pwd, Profile p) {
		Utilisateur u = new Utilisateur(login, pwd, p);
		dao.creat(u);
		return u;
	}

	public Utilisateur update(Utilisateur u) {
		return dao.update(u);
	}

	public boolean delete(int id) {
		return dao.delete(id);
	}

	public Utilisateur findById(int id) {
		return dao.findById(id);
	}

	public List<Utilisateur> findAll() {
		return dao.findAll();
	}
	
	 public List<Utilisateur> findByProfile(Profile profile) {
	        return dao.findAll().stream()
	            .filter(u -> u.getProfile().getId() == profile.getId())
	            .collect(Collectors.toList());
	    }
}
