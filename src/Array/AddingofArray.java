package Array;

public class AddingofArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int ar[][]= {{2,12},{23,54}};
int ar1[][]= {{12,10},{32,65}};
System.out.println("The elements of an array are :");
for(int i=0;i<2;i++)
{
	for(int j=0;j<2;j++)
	{
		System.out.print(ar[i][j]+" ");
	}
	System.out.println();
}
System.out.println("The result of an array are :");
for(int i=0;i<2;i++)
{
	for(int j=0;j<2;j++)
	{
		System.out.print(ar[i][j]+" ");
	}
	System.out.println();
}
for(int i=0;i<2;i++)
{
	for(int j=0;j<2;j++)
	{
		System.out.print(ar[i][j]+ar1[i][j]+" ");
	}
	System.out.println();
}
	}

}
