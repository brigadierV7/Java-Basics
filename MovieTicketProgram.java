package demotrial;

import java.util.Scanner;

public class MovieTicketProgram {
	public static void main(String[] args) {
		int a,b;
		Double sum = 0.0;
		Double c,d,e,f;
		String x = "movie name";
		String y = "movie time";
		boolean ValidChoice = true;
		Scanner s = new Scanner(System.in);
		do
		{
		System.out.println("-------****-------****-------****-------****-------");
		System.out.println("\t" +"Welcome to the Movie-Ticket Program!");
		System.out.println("-------****-------****-------****-------****-------");
		System.out.println("\n");
		System.out.println("Here are some of the movies you could choose:");
		System.out.println("\t" +"1 " +"- " +"The Invisible Man");
		System.out.println("\t" +"2 " +"- " +"Impractical Jokers");
		System.out.println("\t" +"3 " +"- " +"The Call Of The Wild");
		System.out.println("\t" +"4 " +"- " +"Sonic The Hedgehog");
		System.out.println("\t" +"5 " +"- " +"Fantasy Island");
		System.out.println("\t" +"6 " +"- " +"Quit");
		System.out.println("\n");
		System.out.print("Please enter the digit corresponding to your option: ");
		a = s.nextInt();
		switch(a)
		{
			case 1: 
				x = "The Invisible Man";
				ValidChoice = true;
				break;
			case 2: 
				x = "Impractical Jokers";
				ValidChoice = true;
				break;
			case 3: 
				x = "The Call Of The Wild";
				ValidChoice = true;
				break;
			case 4: 
				x = "Sonic The Hedgehog";
				ValidChoice = true;
				break;
			case 5: 
				x = "Fantasy Island";
				ValidChoice = true;
				break;
			case 6: 
				x = "Quit";
				ValidChoice = true;
				break;
			default: 
				System.out.println("Invalid choice try again");
				ValidChoice = false;
		}
		} while(ValidChoice==false);
		System.out.println("Here is the schedule for the movie you choose: ");
		System.out.println("\t" +"1 " +"- " +"IMAX 1:00-3:00");
		System.out.println("\t" +"2 " +"- " +"VIP 2:30-4:30");
		System.out.println("\t" +"3 " +"- " +"ULTRA AVX 2:30-4:30");
		System.out.println("\t" +"4 " +"- " +"Regular 4:45-6:45");
		System.out.println("\n");
		System.out.print("Please enter the digit corresponding to your option: ");
		b = s.nextInt();
		if (b==1)
		{
			y = "MAX 1:00-3:00";
			System.out.print("Please input the number of children: ");
			d = s.nextDouble();
			System.out.print("Please input the number of senior: ");
			e = s.nextDouble();
			System.out.print("Please input the number of general: ");
			f = s.nextDouble();
			sum = (d*18.5)+(e*19.5)+(f*20.99);
		}
		else if (b==2)
		{
			y = "VIP 2:30-4:30";
			System.out.print("Please input the number of adults: ");
			c = s.nextDouble();
			sum = c*19.99;
		}
		else if (b==3)
		{
			y = "ULTRA AVX 2:30-4:30";
			System.out.print("Please input the number of children: ");
			d = s.nextDouble();
			System.out.print("Please input the number of senior: ");
			e = s.nextDouble();
			System.out.print("Please input the number of general: ");
			f = s.nextDouble();
			sum = (d*13.5)+(e*14.5)+(f*17.99);
			
		}
		else if (b==4)
		{
			y = "Regular 4:45-6:45";
			System.out.print("Please input the number of children: ");
			d = s.nextDouble();
			System.out.print("Please input the number of senior: ");
			e = s.nextDouble();
			System.out.print("Please input the number of general: ");
			f = s.nextDouble();
			sum = (d*7.75)+(e*8.5)+(f*11.99);
		}
		System.out.println("\n");
		System.out.println("The movie is: " +x);
		System.out.println("Your schedule is: " +y);
		System.out.println("The total price you need to pay is: " +sum);
		System.out.println("\n");
		System.out.println("Thank you for using this program!!");
		s.close();
	}
}
