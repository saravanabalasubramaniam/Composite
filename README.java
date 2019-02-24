import java.io.*;
import java.util.*;
class Composite
{
  public static void main(String args[])
  {
	Scanner input=new Scanner(System.in);
	int a=input.nextInt();
	int b=0;
	for(int i=1;i<=a;i++)
	{
		if(a%i==0)
		{
		b++;
		}
	}
	if(b==2)
	{
		System.out.println("no");
	}
	else
	{
		System.out.println("yes");
	}
	
  }
}	
