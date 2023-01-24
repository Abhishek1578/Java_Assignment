package trai;
import java.util.Scanner;

public class triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a eagle1 ");
		int a1=s.nextInt();
		System.out.println("Enter a eagle2");
		int a2=s.nextInt();
		System.out.println("Enter a eagle3");
		int a3=s.nextInt();
		 int total=a1+a2+a3;
		 if(total==180)
		 {
			 if(a1==90 || a2==90 || a3==90)
			 {
				 System.out.println("Congratulation you won prize 2");
			 }
			 else if(a1==60 && a2==60 && a3==60)
			 {
				 System.out.println("Congratulation you won prize 3");
			 }
			 else
			 {
				 System.out.println("Prize 1");
			 }
		 }
		 else
		 {
			 System.out.println("No prize");
		 }
		 
		

	}

}
