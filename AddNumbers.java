import java.util.*;
public class AddNumbers
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of values to add : ");
		int num = sc.nextInt();
		int count = 0;
		for(int i=1; i<num+1; i++){
		    System.out.println("Enter number " + i + " : ");
		    int nn = sc.nextInt();
		    count += nn;  
		}
		 System.out.println("Sum of numbers is : " + count);
	}
}
