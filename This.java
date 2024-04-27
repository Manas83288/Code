package exp;

public class This 
{
	This()
	{
		this(10);
	}
	This(int a)
	{
		System.out.println(a);
	}
	

	public static void main(String[] args) 
	{
		
		@SuppressWarnings("unused")
		This r=new This(100);
		
		

	}

}
