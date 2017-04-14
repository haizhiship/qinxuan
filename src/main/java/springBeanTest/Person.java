package springBeanTest;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Person implements BeanFactoryAware,BeanNameAware,
	InitializingBean, DisposableBean{

	private String name;
	private String address;
	private int phone;
	
	private BeanFactory beanFactory;
	private String beanName;
	
	public Person(){
		System.out.println("��������������Person�Ĺ�����ʵ����");
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("��ע�����ԡ�ע������name");
		this.name = name;
	}
	
	
	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		System.out.println("��ע�����ԡ�ע������address");
		this.address = address;
	}


	public int getPhone() {
		return phone;
	}


	public void setPhone(int phone) {
		System.out.println("��ע�����ԡ�ע������phone");
		this.phone = phone;
	}
	
	@Override
	public String toString(){
		return "Person [address=" +address+ ", name="+ name+ ",phone=" + phone+ "]";
	}

	// ����DiposibleBean�ӿڷ���
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		 System.out.println("��DiposibleBean�ӿڡ�����DiposibleBean.destory()");
	}
	
	// ����InitializingBean�ӿڷ���
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		  System.out.println("��InitializingBean�ӿڡ�����InitializingBean.afterPropertiesSet()");
	}
	
	// ����BeanNameAware�ӿڷ���
	public void setBeanName(String arg0) {
		// TODO Auto-generated method stub
		System.out.println("��BeanNameAware�ӿڡ�����BeanNameAware.setBeanName()");
		this.beanName = arg0;
	}

	// ����BeanFactoryAware�ӿڷ���
	public void setBeanFactory(BeanFactory arg0) throws BeansException {
		// TODO Auto-generated method stub
		System.out
				.println("��BeanFactoryAware�ӿڡ�����BeanFactoryAware.setBeanFactory()");
		this.beanFactory = arg0;
	}
	
	// ͨ��<bean>��init-method����ָ���ĳ�ʼ������
	public void myInit(){
		System.out.println("��init-method������<bean>��init-method����ָ���ĳ�ʼ������");
	}
	
	// ͨ��<bean>��destroy-method����ָ���ĳ�ʼ������
	public void myDestory(){
		 System.out.println("��destroy-method������<bean>��destroy-method����ָ���ĳ�ʼ������");
	}


}
