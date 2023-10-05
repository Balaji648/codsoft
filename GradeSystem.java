package codeSoft;
import java.util.Scanner;
public class GradeSystem {
	public static void main(String[] args) {
		Scanner mark=new Scanner(System.in);
		System.out.println("Enter the tamil mark");
		int tamil=mark.nextInt();
		System.out.println("Enter the english mark");
		int english=mark.nextInt();
		System.out.println("Enter the math mark");
		int math=mark.nextInt();
		System.out.println("Enter the Science mark");
		int science=mark.nextInt();
		System.out.println("Enter the social mark");
		int social=mark.nextInt();
		int totalmark=tamil+english+math+science+social;
		double percentage = (totalmark/500)*100;
		if(tamil>=90) {
			System.out.println(tamil+" Tamil Grade = A+");
		}
		else if(tamil>=80) {
			System.out.println(tamil+" Tamil Grade = A");
		}
		else if(tamil>=70) {
			System.out.println(tamil+" Tamil Grade= B+");
		}
		else if(tamil>=60) {
			System.out.println(tamil+" Tamil Grade = B");
		}
		else if (tamil>=50) {
			System.out.println(tamil+" Tamil grade = C");
		}
		else if(tamil<50) {
			System.out.println(tamil+" Tamil = Fail");
		}
		
		if(english>=90) {
			System.out.println(english+" English Grade = A+");
		}
		else if(english>=80) {
			System.out.println(english+" English Grade = A");
		}
		else if(english>=70) {
			System.out.println(english+" English Grade= B+");
		}
		else if(english>=60) {
			System.out.println(english+" English Grade = B");
		}
		else if (english>=50) {
			System.out.println(english+" English grade = C");
		}
		else if(english<50) {
			System.out.println(english+" English = Fail");
		}
		
		if(math>=90) {
			System.out.println(math+" Math Grade = A+");
		}
		else if(math>=80) {
			System.out.println(math+"  Math Grade = A");
		}
		else if(math>=70) {
			System.out.println(math+"  Math Grade= B+");
		}
		else if(math>=60) {
			System.out.println(math+"  Math Grade = B");
		}
		else if (math>=50) {
			System.out.println(math+" Math grade = C");
		}
		else if(math<50) {
			System.out.println(math+" math = Fail");
		}
		
		if(science>=90) {
			System.out.println(science+" science Grade = A+");
		}
		else if(science>=80) {
			System.out.println(science+" science Grade = A");
		}
		else if(science>=70) {
			System.out.println(science+" science Grade= B+");
		}
		else if(science>=60) {
			System.out.println(science+" science Grade = B");
		}
		else if (science>=50) {
			System.out.println(science+" science grade = C");
		}
		else if(science<50) {
			System.out.println(science+" science = Fail");
		}
		
		if(social>=90) {
			System.out.println(social+" social Grade = A+");
		}
		else if(social>=80) {
			System.out.println(social+" social Grade = A");
		}
		else if(social>=70) {
			System.out.println(social+" social Grade= B+");
		}
		else if(social>=60) {
			System.out.println(social+" social Grade = B");
		}
		else if (social>=50) {
			System.out.println(social+" social grade = C");
		}
		else if(social<50) {
			System.out.println(social+" Social = Fail");
		}
			
			String grade;
	        if (percentage >= 90) {
	            grade = "A+";
	        } else if (percentage >= 80) {
	            grade = "A";
	        } else if (percentage >= 70) {
	            grade = "B";
	        } else if (percentage >= 60) {
	            grade = "C";
	        } else if (percentage >= 50) {
	            grade = "D";
	        } else {
	            grade = "F";
	        }

		System.out.println("The Total Mark is : " +totalmark);
		System.out.println("The percentage is : " +percentage);
		System.out.println("overall Grade : "+grade);
	}

}
