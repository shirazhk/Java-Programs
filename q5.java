import java.util.*;
public class Solution{
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String res="";
        String alphabet="abcdefghijklmnopqrstuvwxyz";
        String s1 = scanner.nextLine();
        String[] s = s1.split(" ");
        for(int i=0;i<s.length;i++)
        {   
            s[i]=s[i].toLowerCase();
            if(s[i].length()%2==0 && s[i].length()>1)//even letter word
            {   
                int n=0;
                for(int j=0;j<s[i].length()/2;j++)
                {
                    int c1=s[i].charAt(j);
                    int c2=s[i].charAt(s[i].length()-j-1);
                    c1-=96;
                    c2-=96;
                    c1=(c1>=c2)?c1-c2:c2-c1;
                    n+=c1;
                }
                res+=""+n;
            }
            else if(s[i].length()%2!=0 && s[i].length()>1)//odd letter word
            {
                int n=0;
                for(int j=0;j<s[i].length()/2;j++)
                {
                    int c1=s[i].charAt(j);
                    int c2=s[i].charAt(s[i].length()-j-1);
                    c1-=96;
                    c2-=96;
                    c1=(c1>=c2)?c1-c2:c2-c1;
                    n+=c1;
                }
                n+=s[i].charAt(s[i].length()/2);
                n-=96;
                res+=""+n;
            }
            else if(s[i].length()==1 && alphabet.indexOf(s[i].charAt(0))!=-1)//single character
            {
                int c = (int)s[i].charAt(0);
                c-=96;
                res+=""+c;
            }
        }
        System.out.println(res);
        
     }
}
