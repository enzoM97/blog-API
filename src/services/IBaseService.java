package services;

import beans.BaseBean;

public interface IBaseService<B extends BaseBean> {
	public B getById(int id);
}
