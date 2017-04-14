package springBeanTest;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/*
 * BeanPostProcessor�ӿڰ���2������
 * postProcessAfterInitialization��postProcessBeforeInitialization
 *�����������ĵ�һ����������Ҫ�����Bean���󣬵ڶ�����������Bean��name��
 *����ֵҲ����Ҫ�����Bean����
 *����Ҫע�⡣
 */

public class MyBeanPostProcessor implements BeanPostProcessor{

	public MyBeanPostProcessor(){
		super();
		System.out.println("����BeanPostProcessorʵ���๹����.");
	}
	
	public Object postProcessAfterInitialization(Object arg0, String arg1) throws BeansException {
		// TODO Auto-generated method stub
		System.out
			.println("BeanPostProcessor�ӿڷ���postProcessAfterInitialization�����Խ��и��ģ�");
		return arg0;
	}

	public Object postProcessBeforeInitialization(Object arg0, String arg1) throws BeansException {
		// TODO Auto-generated method stub
		 System.out
		 	.println("BeanPostProcessor�ӿڷ���postProcessBeforeInitialization�����Խ��и��ģ�");
		return arg0;
	}

}
