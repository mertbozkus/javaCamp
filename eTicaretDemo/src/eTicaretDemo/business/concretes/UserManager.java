package eTicaretDemo.business.concretes;

import eTicaretDemo.business.abstracts.UserCheckService;
import eTicaretDemo.business.abstracts.UserService;
import eTicaretDemo.core.EmailService;
import eTicaretDemo.dataAccess.abstracts.UserDao;
import eTicaretDemo.entities.concretes.User;

public class UserManager implements UserService{
	
	public boolean status = false;

	UserDao userDao;
	UserCheckService userCheckService;
	EmailService emailService;

	public UserManager(UserDao userDao, UserCheckService userCheckService, EmailService emailService) {
		super();
		this.userDao = userDao;
		this.userCheckService = userCheckService;
		this.emailService = emailService;

	}

	@Override
	public void signIn(String email, String password) {

		if (userDao.mailCheck(email) == false && userDao.passwordCheck(password) == false) {

			System.out.println("Girilen bilgiler yanlis.");

		} else if (userDao.mailCheck(email) == false) {

			System.out.println("Yanlis mail adresi girdiniz.");

		} else if (userDao.passwordCheck(password) == false) {

			System.out.println("Yanlis sifre girdiniz.");

		} else {
			System.out.println("Sisteme giris basarili.");
		}
	}

	@Override
	public void signUp(User user) {
		if (userCheckService.chechEmailValidation(user) == true && userCheckService.checkFirstName(user) == true
				&& userCheckService.checkLastName(user) == true && userCheckService.checkPassword(user) == true) {

			if (userDao.mailCheck(user.getMail()) == false) {
				emailService.sendEmail(user);
				status = true;
			} else {
				System.out.println("Mail daha önce kullanilmis.");
				status = false;
			}
		} else {
			status = false;
		}
	}

	@Override
	public void userVerify(User user) {
		if (status == true) {
			userDao.add(user);
			System.out
					.println("'" + user.getFirstName() + " " + user.getLastName() + "'" + " Kullanici sisteme eklendi.");
			status = false;
		} else {
			System.out.println("Böyle bir kullanici bulunamadi.");
			status = false;
		}
	}
}
