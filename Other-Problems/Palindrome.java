import java.util.*;
public class Palindrome {
	
	public static boolean checkpalindrome(String str)
	{
		char[] chr=str.toCharArray();
		int start=0;
		int end=str.length()-1;
		while(start<end)
		{
			if(chr[start]!=chr[end])
			{
				return false;
			}
			start++;
			end--;
		}
		return true;
	}
	
	public static void main(String arg[])
	{
		String str;
		System.out.println("Enter the string!!");
		Scanner sc=new Scanner(System.in);
		str=sc.nextLine();
		boolean flag=checkpalindrome(str);
		if(flag==true)
		{
			System.out.println("String you entered is a palindrome");
		}
		else {
			System.out.println("String you entered is not a palindrome");
		}
	}
}
