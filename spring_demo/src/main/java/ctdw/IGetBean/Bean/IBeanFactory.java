package ctdw.IGetBean.Bean;


public interface IBeanFactory {
	<T>T getBean(String name,Class<T> T) throws InstantiationException, IllegalAccessException;

}
