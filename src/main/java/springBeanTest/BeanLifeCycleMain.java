package springBeanTest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleMain {
	
	public  static void main(String[] args){
		System.out.println("���ڿ�ʼ��ʼ������");
		
		ApplicationContext factory =new ClassPathXmlApplicationContext("springBeanTest/bean.xml");
		System.out.println("������ʼ���ɹ�");  
		
		Person person = factory.getBean("person",Person.class);
		System.out.println(person);
		
		System.out.println("���ڿ�ʼ�ر�������");
		((ClassPathXmlApplicationContext)factory).registerShutdownHook();
	}

}
