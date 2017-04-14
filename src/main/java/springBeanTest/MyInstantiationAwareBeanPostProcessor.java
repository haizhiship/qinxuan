package springBeanTest;

import java.beans.PropertyDescriptor;

import org.springframework.beans.BeansException;
import org.springframework.beans.PropertyValues;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessorAdapter;

/*
 * InstantiationAwareBeanPostProcessor �ӿڱ�����BeanPostProcessor���ӽӿ�
 *һ�����Ǽ̳�SpringΪ���ṩ����������InstantiationAwareBeanPostProcessor Adapter��ʹ����
 */


public class MyInstantiationAwareBeanPostProcessor extends
	InstantiationAwareBeanPostProcessorAdapter{
	
	public MyInstantiationAwareBeanPostProcessor(){
		super();
		System.out
			.println("����InstantiationAwareBeanPostProcessorAdapterʵ���๹��������");
	}
	
	@Override
	// �ӿڷ�����ʵ����Bean֮ǰ����
	public Object postProcessBeforeInstantiation(Class beanClass,
			String beanName) throws BeansException{
		System.out
		.println("InstantiationAwareBeanPostProcessor����postProcessBeforeInstantiation����");
		return null;	
	}
	
	@Override
	// �ӿڷ�����ʵ����Bean֮�����
	public Object postProcessAfterInitialization(Object bean, String beanName)
			throws BeansException {
		 System.out
		 	.println("InstantiationAwareBeanPostProcessor����postProcessAfterInitialization����");
		 return bean;
	}
	@Override
	public PropertyValues postProcessPropertyValues(PropertyValues pvs,
			PropertyDescriptor[] pds, Object bean, String beanName)
					throws BeansException {
		System.out
				.println("InstantiationAwareBeanPostProcessor����postProcessPropertyValues����");
		return pvs;
	}

}
