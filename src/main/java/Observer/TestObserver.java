package Observer;

public class TestObserver {

	public static void main(String[] args){
		
		TeacherSubject teacher = new TeacherSubject();
		StudentObserver zhangSan = new StudentObserver("张三",teacher);
		StudentObserver liSi = new StudentObserver("李四",teacher);
		StudentObserver wangWu = new StudentObserver("王五",teacher);
		
	
		
		teacher.setHomework("第二页第六题");
		teacher.setHomework("第三页第七题");
		teacher.setHomework("第五页第八题");

		
	}
}
