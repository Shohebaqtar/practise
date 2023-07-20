package scannerdemo;
import java.util.Scanner;
public class Percentage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float hin,eng,mat,sci,soc;
		double total,avg,percentage;
		Scanner s= new Scanner(System.in);
		System.out.println("enter your marks");
		System.out.println("enter hin marks");
		hin=s.nextFloat();
		System.out.println("enter eng marks");
		eng=s.nextFloat();
		System.out.println("enter mat marks");
		mat=s.nextFloat();
		System.out.println("enter sci marks");
		sci=s.nextFloat();
		System.out.println("enter soc marks");
		soc=s.nextFloat();
		total= hin+eng+mat+sci+soc;
		avg=(total/5);
		percentage=((total/500)*100);
		System.out.println("total marks"+total);
		System.out.println("average marks"+avg);
		System.out.println("total percentage"+percentage);
		
		
		
		
		

	}

}
