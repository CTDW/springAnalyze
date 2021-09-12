package ctdw.IGetBean;

import ctdw.Compent.Student;
import ctdw.IGetBean.Bean.IBeanFactory;
import ctdw.IGetBean.Bean.IBeanRegistry;

import java.lang.reflect.Field;
import java.util.HashMap;

public abstract class IAbstractBeanFactory implements IBeanFactory, IBeanRegistry {


	private final HashMap<String,Object> cache1 = new HashMap<>();
	private final HashMap<String,Object> cache2 = new HashMap<>();


	@Override
	public <T>T getBean(String name, Class<T> T) throws InstantiationException, IllegalAccessException {
		return doGetBean(name,T);
	}

	@Override
	public void registryBean(String name, Object o) {

	}

	protected <T> T doGetBean(String name,Class<T> T) throws IllegalAccessException, InstantiationException {
		T t ;
		//完整对象
		if (cache1.get(name) != null){
			try {
				Object o = cache1.get(name);
				return (T)o;
			}catch (Exception e){
				return null;
			}
		}else {
			//实例化
			if (cache2.get(name) != null){
				t = (T)cache2.get(name);
			}
			t = T.newInstance();
			cache2.put(name,t);
			//初始化,判断成员变量是否有循环依赖
			Field[] fields = T.getDeclaredFields();
			for (Field f: fields){
				f.setAccessible(true);
				String name1 = f.getName();
				Class<?> type = f.getType();
				Object o = doGetBean(name1, type);
				f.set(t,o);
			}
			return t;
		}
	}


}
