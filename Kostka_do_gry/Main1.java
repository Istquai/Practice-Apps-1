import java.util.StringTokenizer;

public class Main1 {
	
	public static void main(String[] args) {
		dice("2D10+10");
	}
	
	static void dice(String str){
		String[] tab = new String[3];
		StringTokenizer stringTokenizer = new StringTokenizer(str, "D");
		while(stringTokenizer.hasMoreTokens())
		{
		    tab[0] = stringTokenizer.nextToken();
		    System.out.println(tab[0]);
		}
		StringTokenizer stringTokenizer2 = new StringTokenizer(str, "+");
		while(stringTokenizer2.hasMoreTokens())
		{
		    tab[1] = stringTokenizer.nextToken();
		    System.out.println(tab[1]);
		    tab[2] = stringTokenizer.nextToken();
		    System.out.println(tab[2]);
		}
	}

}
