package com.vision.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;

//  EnvironmentAware, InitializingBean, DisposableBean 구현한 클래스라야 빈의 생명주기를 활용할 수 있다.
//	생명주기를 사용하려면 위의 세개의 인터페이스를 활용해야 사용할 수 있다.
//	EnvironmentAware ~ 환경인식 할때 사용
//	InitializingBean ~ 빈을 초기화 할때 사용
//	DisposableBean ~ 빈을 다쓰고 버릴때 사용
public class AdminConnection implements EnvironmentAware, InitializingBean, DisposableBean{

	private Environment env;
	private String adminId;
	private String adminPw;
	
	@Override
	public void destroy() throws Exception {
		// TODO 빈을 다 쓰고 버릴때
		System.out.println("destroy() goodbye~~ ");
		
		
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		// 빈 생성 후 속성을 설정하는 작업 (propertiesSet)
		System.out.println("afterPropertiesSet()");
		setAdminId(env.getProperty("admin.id"));
		setAdminPw(env.getProperty("admin.pw"));
		
	}

	@Override
	public void setEnvironment(Environment environment) {
		System.out.println("setEnvironment()");
		setEnv(environment);
		
	}

	public Environment getEnv() {
		return env;
	}

	public void setEnv(Environment env) {
		this.env = env;
	}

	public String getAdminId() {
		return adminId;
	}

	public void setAdminId(String adminId) {
		this.adminId = adminId;
	}

	public String getAdminPw() {
		return adminPw;
	}

	public void setAdminPw(String adminPw) {
		this.adminPw = adminPw;
	}
	
	
}
