package eTicaretDemo.business.abstracts;

import eTicaretDemo.entities.concretes.User;

public interface UserService {
	void signIn(String mail, String password);
	void signUp(User user);
	void userVerify(User user);
}
