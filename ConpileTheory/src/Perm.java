
public class Perm {
	 public  void swap(int[] a,int i,int j){   
	        int temp;   
	        temp = a[i];   
	        a[i] = a[j];   
	        a[j] = temp;   
	    }   
	public void P(int[] a,int n,int s,int e)
	{
		if(n==1)
		{
			
			for(int i=0;i<4;i++)
			{
				System.out.print(a[i]+" ");
			}
			
			System.out.println("");
		}
		else
		{
			for(int i=0;i<n;i++)
			{
				//swap(a,s,e-1);
				
				P(a,n-1,s+1,e);
				if(n%2==0)swap(a,s,e);
				
				
				
			}
	
			
			/*P(a,n-1,s+1,e);
			swap(a,s,e);
			P(a,n-1,s+1,e);*/
		}
	}
	
	public static void main(String[] args) {
		Perm p=new Perm();
		int a[] ={3,1,2,4};
		p.P(a, 4, 0, 3);
	}

}
