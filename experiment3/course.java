package experiment3;
import java.util.regex.*;
import java.util.*;
public class course {
    private  int ID; 
    private  String Name;
    private  String Place; 
    private  String time;

    public course(int ID, String Name, String Place, String time) {
        this.ID = ID;
        this.Name = Name;
        this.Place = Place;
        this.time = time;
        
    }
    public String toString() {
        return "课程号:" + this.ID +
                ",课程:" + this.Name +
                ", 地点:" +this.Place +
                ",时间:" + this.time+"\n";
}
	public  void remove() {
		this.ID = 0;
        this.Name = "无";
        this.Place ="无";
        this.time = "无";
	}
}