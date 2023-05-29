package Handling_of_Multiple_element;

public class sample3 
{
public static void main(String[] args) 
{
	String s1="hello world";
	String ar[]=s1.split(" ");
	String rev=" ";
//	System.out.println(ar[0]);
	for(int i=s1.length()-1;i>=0;i--) 
	{
		rev=rev+ar[i].charAt(i);
	}
	System.out.println(rev);
}
}
