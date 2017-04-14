package Observer;

public class StudentObserver implements Observer{
	
	//����һ��Subject�����ã��Ժ����ȡ������
	private TeacherSubject t;
	//ѧ����������������ʶ��ͬ��ѧ������
	private String name;
	//����������ע��۲���
	public StudentObserver(String name,TeacherSubject t){
		this.name=name;
		this.t=t;
		//ÿ�½�һ��ѧ������Ĭ����ӵ��۲��ߵ�����
		t.addObserver(this);
	}
	
	
	public void update(String info) {
		// TODO Auto-generated method stub
		System.out.println(name + "�õ���ҵ:" + info);
		
	}

}
