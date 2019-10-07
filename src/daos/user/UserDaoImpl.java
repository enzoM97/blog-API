package daos.user;

import java.io.IOException;
import java.net.URL;
import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import beans.User;
import daos.BaseDaoImpl;

public class UserDaoImpl extends BaseDaoImpl<User> implements IUserDao {

	static ObjectMapper mapper = new ObjectMapper();
	
	public UserDaoImpl(String resourceUri) {
		super(resourceUri);
	}

	@Override
	public void save(User user) {
	}

	@Override
	public void update(User user) {
	}

	@Override
	public void delete(User user) {
	}

	@Override
	public List<User> list() {
		return null;
	}

	@Override
	public User getById(long id) {
		return null;
	}
	
	private User convertToBean() {
		User user = null;
		
		try {
			user = mapper.readValue(new URL(super.getResourceUrl()), User.class);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return user;
	}
	
	private String convertToJson(Object user) {
		String json = "";
		try {
			json = mapper.writeValueAsString(user);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		return json;
	}

}
