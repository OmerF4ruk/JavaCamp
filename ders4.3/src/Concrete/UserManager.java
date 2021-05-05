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
		System.out.println("Kullanýcý Ekleme ");
		if(userCheckService.CheckIfRealPerson(user)) {
			System.out.println("Kayýt Baþarýlý. ");
			
		}else {
			System.out.println("Kimlik Uyuþmasý Tamamlanamadý. ");
		}
		
	}
	
	@Override
	public void update(User user) {
		System.out.println("Kullanýcý Güncelleme. ");
		if(userCheckService.CheckIfRealPerson(user)) {
			System.out.println("Kullanýcý Güncellendi. ");
		}else {
			System.out.println("Kimlik Uyuþmasý Tamamlanamadý.");
		}
		
	}

	@Override
	public void delete(User user) {
		delete(user);
		System.out.println("Kullanýcý Silme. ");
	
	}

	
	
	
}
