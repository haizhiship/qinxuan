package Observer;

public class TestObserver {

	public static void main(String[] args){
		
		TeacherSubject teacher = new TeacherSubject();
		StudentObserver zhangSan = new StudentObserver("����",teacher);
		StudentObserver liSi = new StudentObserver("����",teacher);
		StudentObserver wangWu = new StudentObserver("����",teacher);
		
	
		
		teacher.setHomework("�ڶ�ҳ������");
		teacher.setHomework("����ҳ������");
		teacher.setHomework("����ҳ�ڰ���");

		
	}
}
