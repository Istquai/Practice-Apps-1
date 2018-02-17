import java.util.Scanner;

public class Main1 {
	public static void main(String[] args) {
		
		System.out.println("Pomyśl liczbę od 0 do 1000, a ja ją zgadnę w max 10 próbach: ");
		int counter = 1;
		game(0,1000, counter);
	}
	
	static void game(int min, int max, int counter){
		
		Scanner scan = new Scanner(System.in);
		int guess;
		String answer = "";
		guess = ((max-min)/2)+min;
		System.out.println("Próba nr "+counter);
		counter++;
		System.out.println("Zgaduję: "+guess);
		answer = scan.nextLine();
		if(answer.equals("za dużo"))
			game(min, guess, counter);
		else if(answer.equals("za mało"))
			game(guess, max, counter);
		else if(answer.equals("zgadłeś"))
			System.err.println("Wygrałem!");
			
	}

}
