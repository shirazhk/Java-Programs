import java.util.*;
class solution
{   
    static int search(int[] ar, int index)
    {   
        int flag=0;
        for(int k=index+1;k<ar.length;k++)
        {
            if(ar[k]==ar[index])
            flag=1;
        }
        if(flag==1)
            return 1;
        else
            return 0;
    }
	public static void main (String[] args)
	{
		System.out.println("Enter number of elements");
		Scanner s = new Scanner(System.in);
		int no=s.nextInt();
		int[] a = new int[no];
		for(int i :a)
		{
		    System.out.println("Enter element "+i+":");
		    a[i]=s.nextInt();
		}//input
		int duplicate=0;
		for(int j :a)
		{
		    if((search(a,j)==1))
		    {
		        duplicate++;
		    }
		}
		System.out.println("There are "+duplicate+" duplicate elements in the array.");
	}
}
