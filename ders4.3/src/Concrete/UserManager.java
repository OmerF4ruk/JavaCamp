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
		System.out.println("Kullanıcı Ekleme ");
		if(userCheckService.CheckIfRealPerson(user)) {
			System.out.println("Kayıt Başarılı. ");
			
		}else {
			System.out.println("Kimlik Uyuşması Tamamlanamadı. ");
		}
		
	}
	
	@Override
	public void update(User user) {
		System.out.println("Kullanıcı Güncelleme. ");
		if(userCheckService.CheckIfRealPerson(user)) {
			System.out.println("Kullanıcı Güncellendi. ");
		}else {
			System.out.println("Kimlik Uyuşması Tamamlanamadı.");
		}
		
	}

	@Override
	public void delete(User user) {
		delete(user);
		System.out.println("Kullanıcı Silme. ");
	
	}

	
	
	
}
