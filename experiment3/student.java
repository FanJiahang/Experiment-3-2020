package experiment3;

public class student extends people {
    protected   course course;
    public student(int ID, String Name, String Sex, course course) {
        super(ID, Name, Sex);
        this.course = course;
    }
    public String toString() {
        return "ѧ������:" + Name +
                ",ѧ��:" + ID +
                ", �Ա�:" + Sex +
                ",��ѡ�γ�:" + course;
    }
}