package experiment3;

public class teacher extends  people {
    protected   course course;
    public course getCourse() {
        return course;
    }
    public teacher(int ID, String Name, String Sex, course course) {
        super(ID, Name, Sex);
        this.course = course;
    }
    public void setCourse(course course) {
        this.course = course;
    }
    @Override
    public String toString() {
        return Name +"老师"+
          ", 工号" + ID + 
                ", 性别:" + Sex + 
                ",所授课程:" + course ;
    }
}