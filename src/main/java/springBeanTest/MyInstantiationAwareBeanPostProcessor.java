package springBeanTest;

import java.beans.PropertyDescriptor;

import org.springframework.beans.BeansException;
import org.springframework.beans.PropertyValues;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessorAdapter;

/*
 * InstantiationAwareBeanPostProcessor 接口本质是BeanPostProcessor的子接口
 *一般我们继承Spring为其提供的适配器类InstantiationAwareBeanPostProcessor Adapter来使用它
 */


public class MyInstantiationAwareBeanPostProcessor extends
	InstantiationAwareBeanPostProcessorAdapter{
	
	public MyInstantiationAwareBeanPostProcessor(){
		super();
		System.out
			.println("这是InstantiationAwareBeanPostProcessorAdapter实现类构造器！！");
	}
	
	@Override
	// 接口方法、实例化Bean之前调用
	public Object postProcessBeforeInstantiation(Class beanClass,
			String beanName) throws BeansException{
		System.out
		.println("InstantiationAwareBeanPostProcessor调用postProcessBeforeInstantiation方法");
		return null;	
	}
	
	@Override
	// 接口方法、实例化Bean之后调用
	public Object postProcessAfterInitialization(Object bean, String beanName)
			throws BeansException {
		 System.out
		 	.println("InstantiationAwareBeanPostProcessor调用postProcessAfterInitialization方法");
		 return bean;
	}
	@Override
	public PropertyValues postProcessPropertyValues(PropertyValues pvs,
			PropertyDescriptor[] pds, Object bean, String beanName)
					throws BeansException {
		System.out
				.println("InstantiationAwareBeanPostProcessor调用postProcessPropertyValues方法");
		return pvs;
	}

}
