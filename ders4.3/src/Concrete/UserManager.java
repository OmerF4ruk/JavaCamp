package Concrete;

import Abstract.IUserCheckService;
import Abstract.IUserService;
import Entities.User;

public class UserManager implements IUserService {
	private IUserCheckService userCheckService;
	
	public UserManager(IUserCheckService userCheckService) {
		super();
		this.userCheckService = userCheckService;
		
	}

	@Override
	public void signUp(User user) {
		System.out.println("Kullan�c� Ekleme ");
		if(userCheckService.CheckIfRealPerson(user)) {
			System.out.println("Kay�t Ba�ar�l�. ");
			
		}else {
			System.out.println("Kimlik Uyu�mas� Tamamlanamad�. ");
		}
		
	}
	
	@Override
	public void update(User user) {
		System.out.println("Kullan�c� G�ncelleme. ");
		if(userCheckService.CheckIfRealPerson(user)) {
			System.out.println("Kullan�c� G�ncellendi. ");
		}else {
			System.out.println("Kimlik Uyu�mas� Tamamlanamad�.");
		}
		
	}

	@Override
	public void delete(User user) {
		delete(user);
		System.out.println("Kullan�c� Silme. ");
	
	}

	
	
	
}
