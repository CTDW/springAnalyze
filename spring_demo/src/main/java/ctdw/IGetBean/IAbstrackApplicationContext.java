package ctdw.IGetBean;

import ctdw.IGetBean.Bean.IBeanFactory;

public abstract class IAbstrackApplicationContext implements IBeanFactory {
	private final IDefaultListAbleBeanFactory iDefaultListAbleBeanFactory = new IDefaultListAbleBeanFactory();

	@Override
	public  <T>T getBean(String name,Class<T> T) throws IllegalAccessException, InstantiationException {
		return iDefaultListAbleBeanFactory.getBean(name,T);
	}


}
