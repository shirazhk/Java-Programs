// program to check if a number is positive, negative or zero
import java.util.*;
class numbers
{
  public static void main(String[] args)
    {
    Scanner s = new Scanner(System.in);
    System.out.println("Enter a number");
    int n=s.nextInt();
    System.out.println("The number is "+((n>0)?"positive":(n<0)?"negative":"zero"));
    }
}
