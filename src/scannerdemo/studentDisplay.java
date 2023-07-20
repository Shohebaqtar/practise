package scannerdemo;
import java.util.Scanner;
public class studentDisplay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter your name");
		String name= s.next();
		System.out.println("enter your gender");
		String gender= s.next();
		System.out.println("enter your roll_no");
		int roll_no= s.nextInt();
		System.out.println("enter your section");
		String section= s.next();
		StudentDemo s1=new StudentDemo();
		s1.setName(name);
		s1.setGender(gender);
		s1.setRoll_no(roll_no);
		s1.setSection(section);
		System.out.println(s1);
		
		
		
		
		

	}

}
