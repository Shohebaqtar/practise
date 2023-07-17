package scannerdemo;
import java.util.Scanner;
public class PersonDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("enter your name");
		String name=sc.next();
		System.out.println("enter your age");
		int age=sc.nextInt();
		System.out.println("enter your gender");
		String gender=sc.next();
		System.out.println("enter yout Income");
		int income=sc.nextInt();
		System.out.println("your tax is  ");
		Person p1=new Person();
		p1.setAge(age);
		p1.setGender(gender);
		p1.setName(name);
		p1.setIncome(income);
		
		TaxCalculation cal = new TaxCalculation();
		cal.calculateTax(p1);
		System.out.println(p1);
		
		
		
		
		
		
		
		
		
		
		
	
		
		

	}

}
