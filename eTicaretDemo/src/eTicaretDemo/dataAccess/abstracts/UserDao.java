package eTicaretDemo.dataAccess.abstracts;

import java.util.List;

import eTicaretDemo.entities.concretes.User;

public interface UserDao {
	void add(User user);
	List<User> getAll();
	boolean mailCheck(String mail);
	boolean passwordCheck(String password);
}
