import java.lang.*;
import java.util.*;
import java.io.*;
public class Main
{
    static String  StringFormatter(String b[],int i)
    {
        char rev[]=b[i].toCharArray(); 
        String reverse="";
        for(int j=b[i].length()-1;j>=0;j--)
        {
           reverse+=rev[j];
        }
        System.out.print(reverse);
        return "";
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String a=sc.nextLine();
		int count=0;
		char[]ch=new char[a.length()];
		String b[]=a.split(" ");
		for(int i=0;i<a.length();i++)
		{
		    ch[i]=a.charAt(i);
		}
		char space=' ';
		for(int i=0;i<a.length();i++)
		{
		    if(ch[i]==space)
		    {
		        count++;
		    }
		}
		
		for(int i=count;i>=0;i--)
		{
		    System.out.print(StringFormatter(b,i)+" ");
		}
	}
}
