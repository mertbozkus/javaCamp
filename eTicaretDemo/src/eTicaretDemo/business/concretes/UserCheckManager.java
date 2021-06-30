package eTicaretDemo.business.concretes;

import eTicaretDemo.business.abstracts.UserCheckService;
import eTicaretDemo.core.RegexService;
import eTicaretDemo.entities.concretes.User;

public class UserCheckManager implements UserCheckService{
	
	private RegexService regexService;
	
	public UserCheckManager(RegexService regexService) {
		super();
		this.regexService = regexService;
	}

	@Override
	public boolean checkFirstName(User user) {
		
		if(user.getFirstName().isEmpty()) {
			System.out.println("Zorunlu alanlar bos birakilamaz.");
			return false;
		} else {
			if(user.getFirstName().length() <=1) {
				System.out.println("Isminiz 2 karakterden kisa olamaz.");
				return false;
			}
		}
		return true;
	}

	@Override
	public boolean checkLastName(User user) {
		if (user.getLastName().isEmpty()) {
			System.out.println("Zorunlu alanlar bos birakilamaz.");
			return false;
		} else {
				if (user.getLastName().length() <=1) {
					System.out.println("Isminiz 2 karakterden kisa olamaz.");
					return false;
				}
		}
		return true;
	}

	@Override
	public boolean chechEmailValidation(User user) {
		if (this.regexService.checkEmailFormat(user.getMail()) == true) {
			return true;
		} else {
			System.out.println("Mail formati uygun degil.");
			return false;
		}
		
		
	}

	@Override
	public boolean checkPassword(User user) {
		if (user.getPassword().isEmpty()) {
			System.out.println("Zorunlu alanlar bos birakilamaz.");
			return false;
		} else {
			if (user.getPassword().length() <6) {
				System.out.println("Sifreniz 6 karakterden kisa olamaz.");
				return false;
			}
		}
		
		return true;
	}

}
