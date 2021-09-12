package ctdw.Compent;

import org.springframework.stereotype.Component;

@Component
public class Student {
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
