package PlaceholderTest;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Car {

	private String brand;
	private String maxSpeed;
	private int price;
	
	

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		
		this.brand = brand;
	}
	
	
	public String getMaxSpeed() {
		return maxSpeed;
	}


	public void setMaxSpeed(String maxSpeed) {
		System.out.println("��ע�����ԡ�ע������address");
		this.maxSpeed = maxSpeed;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		System.out.println("��ע�����ԡ�ע������phone");
		this.price = price;
	}
	
}
