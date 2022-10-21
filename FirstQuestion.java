package Assignment;

public class FirstQuestion {

	public static void main(String[] args) {
		int n=11;
		for(int i=0;i<n;i++)
		{
			//To print I
			for(int j=0;j<n;j++)
			{
				if((j==(n-1)))
				{
					System.out.print("@");
				}
				else
				{
					System.out.print(" ");
				}
				// To create space between letters.
				if(j==n-1)
					System.out.print(" ");
			}
		
            //To print N
			for(int j=0;j<n;j++)
			{
				if((j==0) || (j==(n-1)) || (i==j))
				{
					System.out.print("@");
				}
				else
				{
					System.out.print(" ");
				}
				if(j==n-1)
					System.out.print(" ");
			}
            //To print E
			for(int j=0;j<n;j++)
			{
				if((i==0) || (j==0) || (i==n-1) || (i==(n-1)/2))
				{
					System.out.print("@");
				}
				else
				{
					System.out.print(" ");
				}
				if(j==n-1)
					System.out.print(" ");
			}
            //To print U
			for(int j=0;j<n;j++)
			{
				if((j==0 && i<n-1) || (i==n-1 && j>0 && j<n-1) || (j==n-1 && i<n-1))
				{
					System.out.print("@");
				}
				else
				{
					System.out.print(" ");
				}
				if(j==n-1)
					System.out.print(" ");
			}
            //To print R
			for(int j=0;j<n;j++)
			{
				if((i==0 && j<n-1 ) || (j==0) || (i==(n-1)/2 && j<n-1) ||
						(j==(n-1) && i>0 && i<(n-1)/2) || (j-i==0 && j>=(n-1)/2 && i>=(n-1)/2))
				{
					System.out.print("@");
				}
				else
				{
					System.out.print(" ");
				}
				if(j==n-1)
					System.out.print(" ");
			}
            //To print O
			for(int j=0;j<n;j++)
			{
				if((j==0 && i<n-1 && i>0) || (i==n-1 && j>0 && j<n-1) || (j==n-1 && i>0 && i<n-1) || (i==0&& j>0 && j<n-1))
				{
					System.out.print("@");
				}
				else
				{
					System.out.print(" ");
				}
				if(j==n-1)
					System.out.print(" ");
			}
            //To print N
			for(int j=0;j<n;j++)
			{
				if((j==0) || (j==(n-1)) || (i==j))
				{
					System.out.print("@");
				}
				else
				{
					System.out.print(" ");
				}
				if(j==n-1)
					System.out.print(" ");
			}
			
			System.out.println();
		}

	}

}
