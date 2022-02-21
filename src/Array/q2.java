package Array;

public class q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char arr[]= {'C','O','B','O','L'};
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(arr[j]+" ");
			}
			System.out.println();
		}
		for(int i=arr.length-2;i>=0;i--)
		{
			for(int j=0;j<=i;j++)
			{
				
					System.out.print(arr[j]+" ");
				
				
			}
			System.out.println();
		}
	}

}
