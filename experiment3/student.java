package experiment3;

public class student extends people {
    protected   course course;
    public student(int ID, String Name, String Sex, course course) {
        super(ID, Name, Sex);
        this.course = course;
    }
    public String toString() {
        return "学生姓名:" + Name +
                ",学号:" + ID +
                ", 性别:" + Sex +
                ",所选课程:" + course;
    }
}