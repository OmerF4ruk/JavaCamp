package Abstract;

import Entities.User;

public interface IUserService {
	public void signUp(User user);
	public void update(User user);
	public void delete(User user);
	

}
