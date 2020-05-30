// program to print rate of interest based on predefined conditions.
import java.util.*;
class numbers
{
  public static void main(String[] args)
    {
    Scanner s = new Scanner(System.in);
    double i;
    System.out.println("Enter gender- m for Male and f for Female");
    char g=s.next().charAt(0);
    System.out.println("Enter age- range 1 to 120");
    int age=s.nextInt();
    if((g=='f' || g=='F') && age<=58 && age>=1)
        i=8.2;
    else if((g=='f' || g=='F') && age<=120 && age>=59)
        i=7.6;
    else if((g=='m' || g=='M') && age<=60 && age>=1)
        i=9.2;
    else if((g=='m' || g=='M') && age<=120 && age>=60)
        i=8.3;
    else
        System.out.println("Invalid input");
    System.out.println("The interest is-"+i+"%");
    }
}
