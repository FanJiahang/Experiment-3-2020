package experiment3;

public class Test{
public static void main(String args[]){
	course course1 = new course(1, "�ߴ�", "��101��", "����9��30");
    course course2 = new course(2, "JAVA", "102","����7��50");
    course course3 = new course(3, "����", "103��01��","����8:00");;
       student student1 = new student(123,"С��","��",course2);
       System.out.println(student1);
       teacher teacher1 = new teacher(123, "С����ʦ", "Ů",course2);
       System.out.println("�ον�ʦΪ��" + teacher1);
       course1.remove();
       System.out.println("ɾ���γ�֮��������γ̣�"+"1��" +course3.toString() +"��2��"+ course2.toString());
       System.out.println("ɾ���Ŀγ̣�"+course1.toString());
}
}