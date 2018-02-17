import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Main1 {
	public static void main(String[] args) {
		
		Random rand = new Random();
		lotto(rand.nextInt(101)+1);		
	}
	
	static void lotto(int random){
		int a;
		Scanner scan = new Scanner(System.in);
		System.out.println("Zgadnij liczbe: ");
		a = scan.nextInt();
		
		
		try{
			if(a<random){
				System.out.println("Za mało!");
				lotto(random);
			}
			else if(a>random){
				System.out.println("Za duzo!");
				lotto(random);
			}
			else if(a==random){
				System.out.println("Zgadłeś!");
			}
		}
		catch(InputMismatchException e){
			System.out.println("Podaj liczbe");
			lotto(random);
		}
		scan.close();
	}

}
