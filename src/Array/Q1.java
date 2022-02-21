package Array;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ar[]= {'H','E','L','L','O'};
		//for(int i=ar.length-1;i>=0;i--)
		//{
			//System.out.println(ar[i] +" ");
		//}
		for(int i=ar.length-1;i>=0;i--)
		{
		     for(int j=0;j<=i;j++)
		    {
		        
		        System.out.print(ar[j]+" ");
		        
		    }
		
		   
		    System.out.println();		
		    
		}
		for(int i=0;i<=ar.length-2;i++)
		{
		    for(int j=0;j<=i+1;j++)
		    {
		        if(j<=ar.length-1)
		        {
		        System.out.print(ar[j]+" ");
		        
		        }
		        else
		        {
		        	break;
		        }
		        
		    }
		
		   
		    System.out.println();		
		    
		}
	}

}
