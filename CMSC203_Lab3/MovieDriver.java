import java.util.Scanner;

public class MovieDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		Movie movie = new Movie();
		
		String option;
		
		do
		{
			System.out.println("Please enter the name of your movie: ");
			String title = input.nextLine();
		
			movie.setTitle(title);
		
			System.out.println("Now please enter your movie's rating: ");
			String rate = input.nextLine();
			
			movie.setRating(rate);
		
			System.out.println("Next, please enter the number of tickets sold at your theater: ");
			int tickets = input.nextInt();
		
			movie.setSoldTickets(tickets);
		
			System.out.println(movie.toString());
			
			String keyboard = input.nextLine();
			
			System.out.println("Would you like to enter another movie? (y/n)");
			option = input.nextLine();
			
		} while(option.equals("y"));
			
			System.out.println("Goodbye!");
	}

}
