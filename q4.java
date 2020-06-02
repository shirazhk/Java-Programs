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
		for(int i=0;i<a.length;i++)
		{
		    System.out.println("Enter element "+(i+1)+":");
		    a[i]=s.nextInt();
		}//input
		int duplicate=0;
		for(int j=0;j<a.length;j++)
		{
		    if((search(a,j)==1))
		    {
		        duplicate++;
		    }
		}
		System.out.println("There are "+duplicate+" duplicate elements in the array.");
	}
}
