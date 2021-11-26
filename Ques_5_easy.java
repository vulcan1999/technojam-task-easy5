import java.util.*;
import java.math.*;
import java.io.*;
class Ques_5_easy
{
	public static void main()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		    int n = sc.nextInt();
		    long[] ar = new long[n];
		    int e= 0 , o= 0,e1,o1;
		    System.out.println("Enter the elements of array");
		    for(int i = 0 ; i < n ; i++)
		    {
		        ar[i] = sc.nextLong();
		        if(ar[i] % 2 == 0)
		        e++;
		        else
		        o++;
		    }
		    e1 = n / 2;
		    o1 = n - e1;
		    System.out.println(Math.min(e, o1) + Math.min(o, e1));
	}
}
