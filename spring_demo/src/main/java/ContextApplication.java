import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;


@ComponentScan(basePackages = {"ctdw.*"})
public class ContextApplication {
	public static void main(String[] args) {


		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
				ContextApplication.class
		);
		ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		try {
			Object student = context.getBean("student");
		}catch (Exception e){
			e.printStackTrace();
		}
		System.out.println("d");



	}
}
