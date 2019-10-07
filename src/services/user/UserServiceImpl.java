package services.user;

import services.BaseServiceImpl;
import beans.User;
import daos.user.UserDaoImpl;;

public class UserServiceImpl extends BaseService<User, UserDaoImpl> implements IUserService {
	
	public UserServiceImpl(String uri) {
		super.setDao(new UserDaoImpl(uri));
	}
	
}
