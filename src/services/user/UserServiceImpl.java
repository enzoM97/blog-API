package services.user;

import services.BaseServiceImpl;
import beans.User;
import daos.user.UserDaoImpl;;

public class UserServiceImpl extends BaseServiceImpl<User, UserDaoImpl> implements IUserService {

	public UserServiceImpl(String uri) {
		super(uri);
	}

	@Override
	public User getById(int id) {
		return null;
	}
	
}
