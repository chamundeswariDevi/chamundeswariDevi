package Array;
import java.util.Scanner;
public class repetivenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int ar[]=new int[200];
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the array size");
		int n=sc.nextInt();
		System.out.println("enter the array elements");
			for(int i=0;i<n;i++)
			 {
				ar[i]=sc.nextInt();
			 }
				System.out.println("given array elements are");
				for(int i=0;i<=n;i++)
					{
						System.out.println("a"+"["+i+"]"+"="+ar[i]); }
				int count=0;
				for(int i=0;i<=n;i++)
				{
					for(int j=i+1;j>0;j--)
					{
						System.out.println(ar[i] + "is a repetive number ");
					}
				}
			

		System.out.println("no.of Equal elements");
		System.out.println("count");
}
}



