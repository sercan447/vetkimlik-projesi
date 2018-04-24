package org.vetkimlik.restful.config;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class SpringApplicationContext implements ApplicationContextAware {

	private static ApplicationContext appContext;
	
	@Override
	public void setApplicationContext(ApplicationContext arg0) throws BeansException {
		
		this.appContext = arg0;

	}
	
	public static Object getBean(String beanName) {
		return appContext.getBean(beanName);
	}
	
	/*public static <T> Object getBean(Class<T> beanClass) {
		return appContext.getBean(beanClass);
	}
*/
}
