package daos;

import beans.BaseBean;
import org.springframework.web.client.RestTemplate;

public abstract class BaseDaoImpl<T extends BaseBean> implements IBaseDao<T> {

	private final String BASE_API_PATH = "https://jsonplaceholder.typicode.com/";
	private final RestTemplate _restTemplate;
	private final String _resourceURL;
	
	public BaseDaoImpl(String resourceUri) {
		_resourceURL = getResourcePath(resourceUri);
		_restTemplate = new RestTemplate();
	}
	
	protected String getResourceUrl() {
		return _resourceURL;
	}

	protected RestTemplate getRestTemplate() {
		return _restTemplate;
	}

	private String getResourcePath(String uri) {
		return BASE_API_PATH + uri;
	}
	
}
