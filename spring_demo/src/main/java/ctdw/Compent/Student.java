package ctdw.Compent;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.SmartFactoryBean;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

@Component
public class Student implements SmartFactoryBean{
	public Person person;

	@Override
	public boolean isEagerInit() {
		return true;
	}



	public Student() {
		System.out.println('d');
	}
	@Override
	public Object getObject() throws Exception {
		System.out.println("sdf");
		return null;
	}

	@Override
	public Class<?> getObjectType() {
		return null;
	}


	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	private Integer age;
	private String name;

	public void setAge(Integer age) {
		this.age = age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public String getName() {
		return name;
	}


}
