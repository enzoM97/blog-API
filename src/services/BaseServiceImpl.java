package services;

import beans.BaseBean;
import daos.BaseDaoImpl;

public class BaseServiceImpl<B extends BaseBean, D extends BaseDaoImpl<B>> implements IBaseService<B> {
	private D _dao;
	
	public BaseServiceImpl(String uri) {
		
	}
	
	public void setDao(D dao) {
		_dao = dao;
	}
	
	@Override
	public B getById(int id) {
		return _dao.getById(id);
	}
}
