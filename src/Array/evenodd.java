package Array;

public class evenodd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {67,43,23,12,34,56,76,45};
		int even[]=new int[6];
		int odd[]=new int[6];
		
		int evenStart=0;
		int oddStart=0;
		for(int i=0;i<=arr.length-1;i++)
		{
			if(arr[i]%2==0)
			{
				even[evenStart]=arr[i];
				evenStart=evenStart+1;
			}
			else
			{
				odd[oddStart]=arr[i];
				oddStart=oddStart+1;
			}
		}
		
		for(int i=0;i<=even.length-1;i++)
		{
			if(even[i] >0) {
					System.out.println("The even number : is" + even[i]);
			}
		}
		for(int i=0;i<=odd.length-1;i++)
		{
			if(odd[i] >0) {
			System.out.println("The odd number :is" + odd[i]);
			}
		}
		
	}

}
