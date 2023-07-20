package scannerdemo;
//example of student details
public class StudentDemo {
	String name;
	int roll_no;
	String section;
	String gender;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRoll_no() {
		return roll_no;
	}
	public void setRoll_no(int roll_no) {
		this.roll_no = roll_no;
	}
	public String getSection() {
		return section;
	}
	public void setSection(String section) {
		this.section = section;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "StudentDemo [name=" + name + ", roll_no=" + roll_no + ", section=" + section + ", gender=" + gender
				+ "]";
	}
	
	
	

}
