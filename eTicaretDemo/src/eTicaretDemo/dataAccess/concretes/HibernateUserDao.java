package eTicaretDemo.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import eTicaretDemo.dataAccess.abstracts.UserDao;
import eTicaretDemo.entities.concretes.User;

public class HibernateUserDao implements UserDao{
	
	List<User> users= new ArrayList<User>();

	@Override
	public void add(User user) {
		users.add(user);
		
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return users;
	}

	@Override
	public boolean mailCheck(String mail) {
		for(User i : users) {
			if(i.getMail() == mail) {
			return true;
			}
		}
		return false;
	}

	@Override
	public boolean passwordCheck(String password) {
		for(User i : users  ) {
			if(i.getPassword() == password) {
				return true;
			}
		}
		return false;
	}

}
