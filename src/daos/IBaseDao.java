package daos;

import beans.BaseBean;

public interface IBaseDao<T extends BaseBean> {
	public abstract T getById(long id);
}
