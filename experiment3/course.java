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
        return "�γ̺�:" + this.ID +
                ",�γ�:" + this.Name +
                ", �ص�:" +this.Place +
                ",ʱ��:" + this.time+"\n";
}
	public  void remove() {
		this.ID = 0;
        this.Name = "��";
        this.Place ="��";
        this.time = "��";
	}
}