import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Main1 {
	public static void main(String[] args) {
		
		int[] tab_lotto = new int[6];
		int[] tab_gen = new int[6];
		tab_lotto = lotto();
		tab_gen = generator();
		int counter = 0;
		
		for(int i=0; i<tab_lotto.length; i++){
			if(tab_lotto[i] == tab_gen[0] || tab_lotto[i] == tab_gen[1] || tab_lotto[2] == tab_gen[3] || tab_lotto[4] == tab_gen[5])
				counter++;
		}
		System.out.println("Trafiłeś "+ counter+ " liczb! Gratulacje!");
		
	}
	
	static int[] generator(){
		int[] tab = new int[6];
		Random rand = new Random();
		int temp;
		System.out.print("Wylosowane liczby to: ");
		for(int i=0; i<tab.length;i++){
			temp = rand.nextInt(49)+1;
			if(temp!= tab[0] && temp!= tab[1] && temp!= tab[2] && temp!= tab[3] && temp!= tab[4] && temp!= tab[5])
				tab[i]=temp;
			else{
				i--;
			}
		}
		Arrays.sort(tab);
		System.out.println(Arrays.toString(tab));
		return tab;
	}
	
	static int[] lotto(){
		Scanner scan = new Scanner(System.in);
		int temp;
		System.out.println("Podaj liczby");
		
		int[] tab = new int[6];
		
		try{
			for(int i=1; i<=6; i++){
				System.out.print(i+": ");
				temp = scan.nextInt();
				if(temp>49 || temp<1){
					System.out.println("Twoja liczba musi byc z zakresu 1-49");
					i--;
				}
				else if(temp == tab[0] || temp== tab[1] || temp == tab[2] || temp == tab[3] || temp == tab[4] || temp == tab[5]){
					System.out.println("Podawałeś juz tą liczbę!");
					i--;
				}
				else{
					tab[i-1] = temp;
				}
			}
		}
		catch(InputMismatchException e){
			System.out.println("Miales podać liczby! Zaczynamy od nowa.");
			lotto();
		}
		Arrays.sort(tab);
		System.out.println("Twoje liczby to: "+ Arrays.toString(tab));		
		scan.close();
		return tab;
		
		
	}

}
