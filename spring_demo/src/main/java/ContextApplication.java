import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ContextApplication {
	public static void main(String[] args) {


		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
				ContextApplication.class
		);
	}
}
