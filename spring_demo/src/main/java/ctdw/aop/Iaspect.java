package ctdw.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Iaspect {

	@Pointcut("execution(* ctdw.Compent..*.*(..))")
	public void pointCut(){}


	@Before("pointCut()")
	public void test(){

	}
}
