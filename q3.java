//program to find sum of last two digits of a number
import java.util.*;
class Codechef
{
	public static void main (String[] args)
	{
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		if(n>=10){
		    int d1=n%10;
		    n/=10;
		    int d2=n%10;
		    d1+=d2;
		    System.out.print(d1);
		}
		else{
		    System.out.print("Enter a number with two or more digits.");
		}
	}
}
