package scannerdemo;

public class Person {
	private String name;
	private String gender;
	private int age;
	private int tax;
	private int income;
	//getter & setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getTax() {
		return tax;
	}
	public void setTax(int tax) {
		this.tax = tax;
	}
	public int getIncome() {
		return income;
	}
	public void setIncome(int income) {
		this.income = income;
		
	}
	//to string method
	@Override
	public String toString() {
		return "Person [name=" + name + ", gender=" + gender + ", age=" + age + ", tax=" + tax + ", income=" + income
				+ "]";
	}
	
	
   

}
