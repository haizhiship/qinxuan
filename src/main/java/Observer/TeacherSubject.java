package Observer;

import java.util.List;
import java.util.ArrayList;

public class TeacherSubject implements Subject {
	//������źͼ�¼�۲���
	private List<Observer> observers=new ArrayList<Observer>();
	//��¼״̬���ַ���
	private String info;
	
	
	public void addObserver(Observer obj){
		observers.add(obj);
	}
	
	public void deleteObserver(Observer obj){

		int i = observers.indexOf(obj);
		if(i>=0){
			observers.remove(obj);
		}
		
	}
	
	public void notifyObserver(){
		for(int i=0;i<observers.size();i++){
			Observer o=(Observer)observers.get(i);
			o.update(info);
		}
	}
	//������ҵ�ķ������ڷ��������Ҫ����notifyObserver��������
	//֪ͨ���й۲��߸���״̬
	public void setHomework(String info){
		this.info=info;
		System.out.println("�������ҵ�ǣ�"+info);
		this.notifyObserver();
	}


}
