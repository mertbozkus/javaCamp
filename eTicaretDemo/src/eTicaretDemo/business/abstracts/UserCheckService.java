package eTicaretDemo.business.abstracts;

import eTicaretDemo.entities.concretes.User;

public interface UserCheckService {
	boolean checkFirstName(User user);
	boolean checkLastName(User user);
	boolean chechEmailValidation(User user);
	boolean checkPassword(User user);
}
