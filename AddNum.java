 import java.util.Scanner;
 public class AddNum{
public static void main (String [] args)
{
	System.out.println("Enter two number");
	Scanner sc = new Scanner(System.in);

	int a = sc.nextInt();
	int b = sc.nextInt();
	int sum = a+b;
	System.out.println("Sum of the Two number :" + sum);
}


}