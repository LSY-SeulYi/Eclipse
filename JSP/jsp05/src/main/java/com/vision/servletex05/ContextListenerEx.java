package com.vision.servletex05;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

// ��ü �������� �����ֱ⸦ �����ϴ� Ŭ����

@WebListener
public class ContextListenerEx implements ServletContextListener{

	public ContextListenerEx() {
		
	}
	
	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		System.out.println("contextDestroyed");
	}
	
	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		System.out.println("contextInitialized");
	}
	
}
