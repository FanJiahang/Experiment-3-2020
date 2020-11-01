package experiment3;

public class people {
	 protected  int ID; //±àºÅ
	    protected  String Name; 
	    protected  String  Sex;
	    public people(int ID, String Name, String Sex) {
	        this.ID = ID;
	        this.Name = Name;
	        this.Sex = Sex;
	    }
	public String toString() {
	        return "People" +
	                "ID:" + ID + '\'' +
	                ", Name:" + Name + '\'' +
	                ", Sex:" + Sex + '\'' ;
	}
}