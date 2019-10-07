package daos.user;

import java.util.List;
import beans.User;
import daos.IBaseDao;

public interface IUserDao extends IBaseDao<User> {

	public void save(User user);
	public void update(User user);
	public void delete(User user);
	public List<User> list();
	
}
