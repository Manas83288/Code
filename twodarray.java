package exp;
import java.util.Scanner;
public class twodarray {

	public static void main(String[] args) {
		int a[][]=new int[2][2];
		System.out.println("enter array element: ");
		try (Scanner s = new Scanner(System.in)) {
			for(int i=0;i<2;i++)
			{
				for(int j=0;j<2;j++)
				{
					a[i][j]=s.nextInt();
				}
			}
		}
		System.out.println("\n matrix element:\n  ");
         for(int i=0;i<2;i++)
 		{
 			for(int j=0;j<2;j++)
 			{
 				System.out.println(a[i][j]+" ");;
 			}
 			System.out.println();
 		}
	}

}
