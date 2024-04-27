package exp;
import java.util.Scanner;

public class Whileloop {

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		int a;
		System.out.println("input any number");
		@SuppressWarnings({ "unused", "resource" })
		Scanner obj=new Scanner(System.in);
		a=obj.nextInt();
		while(a>=0)
		{
			if(a%2==0)
			{
				System.out.println("even number");
				break;
			}
			else
			{
				System.out.println("odd number");
				break;
			}
		

	}

}
}
