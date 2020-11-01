package experiment3;

public class Test{
public static void main(String args[]){
	course course1 = new course(1, "线代", "教101室", "上午9：30");
    course course2 = new course(2, "JAVA", "102","上午7；50");
    course course3 = new course(3, "体育", "103教01室","上午8:00");;
       student student1 = new student(123,"小明","男",course2);
       System.out.println(student1);
       teacher teacher1 = new teacher(123, "小王老师", "女",course2);
       System.out.println("任课教师为：" + teacher1);
       course1.remove();
       System.out.println("删除课程之后的其他课程："+"1、" +course3.toString() +"；2、"+ course2.toString());
       System.out.println("删除的课程："+course1.toString());
}
}