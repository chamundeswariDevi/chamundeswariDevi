package Array;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int  arr[] =  {12, 23, 44, 65, 76,78};  
	        System.out.println("Original array: ");  
	        for (int i = 0; i < arr.length; i++)
	        {  
	            System.out.print(arr[i] + " ");  
	        }  
	        System.out.println();  
	        System.out.println("Array in reverse order: ");  
	         
	        for (int i = arr.length-1; i >= 0; i--)
	        {  
	            System.out.print(arr[i] + " ");  
	        }  
	}

}
