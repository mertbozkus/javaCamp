package eTicaretDemo.core;

import eTicaretDemo.googleRegister.GoogleRegisterManager;

public class GoogleRegisterManagerAdapter implements GoogleRegisterService {

	@Override
	public void signUpWithGoogle(String message) {
		
		GoogleRegisterManager googleRegister = new GoogleRegisterManager();
		googleRegister.add(message);
		
	}

}