package Observer;

public interface Subject {
	
	//��ӹ۲���
	void addObserver(Observer obj);
	//�Ƴ��۲���
	void deleteObserver(Observer obj);
	//�����ⷽ���ı�ʱ��������������ã�֪ͨ�۲���
	void notifyObserver();

}
