package codeSoft;
import java.util.Scanner.*;
import java.util.Random;
import java.util.Scanner;
import java.util.Random.*;
public class RandomNmber2 {
	public static void main(String[] args) {
		
			
			
			Scanner yr=new Scanner(System.in);
			Random uk=new Random();
			
			int lowvalue=1;
			int highvalue=100;
			int chances=5;
			int Score=0;
				System.out.println("welcome to the game 🙏");
				while(true) {
					int guessnumber=uk.nextInt(highvalue-lowvalue+1)+lowvalue;
						int attempt=0;
						System.out.println("The number between " +lowvalue + " to " + highvalue);
						while(attempt<chances) {
							System.out.println("Attemp "+(attempt+1)  +"/"+chances+"  guess the number");
							int guess;
							try {
								guess=yr.nextInt();
								
							}
							catch(java.util.InputMismatchException r) {
								System.out.println("enter the valid value");
								yr.nextLine();
								continue;
							}
							attempt++;
							if(guess<lowvalue || guess>highvalue) {
								System.out.println("please Ennter the number between"+lowvalue+ "to" +highvalue);
							}
							if(guess==guessnumber) {
								System.out.println("congratulation you guessed the number 👍"+guess +".");
								Score=chances-attempt;
								break;
							}
							else if(guessnumber<guess) {
								System.out.println("given value is too high 😮 ");
							}
							else {
								System.out.println("given value is too low 😮");
							}
						}
				
							if(Score==0) {
								System.out.println("you reached the maximum chances,your secret number was 👍"+guessnumber);
							}
							System.out.println("Do you want playagain (yes/no)");
							String playagain=yr.next().toLowerCase();
							if(!playagain.equals("yes")) {
								System.out.println("your score"+Score);
								System.out.println("thankyou for playing");
								break;
							}
							
						}
				yr.close();
			}
			
		}

	


