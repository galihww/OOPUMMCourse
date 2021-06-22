package serial;

public class Course implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	private String name;
	private String type;
	private String courseCode;
	private int passingScore;
	
	public Course(String name, String type, String courseCode, int passingScore) {
		this.name = name;
		this.type = type;
		this.courseCode = courseCode;
		this.passingScore = passingScore;	
	}//end constructor
	
	//public static long getSerialversionuid() {
		//return serialVersionUID;
	//}//end method getSerialversionuid

	public String getName() {
		return name;
	}//end method getName
	
	public void setName(String name) {
		this.name = name;
	}//end method setName
	
	public String getType() {
		return type;
	}//end method getType
	
	public void setType(String type) {
		this.type = type;
	}//end method setType
	
	public String getCourseCode() {
		return courseCode;
	}//end method getCourseCode
	
	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}//end method setCourseCode
	
	public int getPassingScore() {
		return passingScore;
	}//end method getPassingScore
	
	public void setPassingScore(int passingScore) {
		this.passingScore = passingScore;
	}//end method setPassingScore

	public String toString() {
	     return    "Name      : " + this.name
	           + "\nType      : " + this.type
	           + "\nCode      : " + this.courseCode
	           + "\nPass Score: " + this.passingScore;
	}//end method toString
}//end class Course

