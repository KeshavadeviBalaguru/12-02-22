package nestedifcondition;
import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {
		
		int n=652;
		if(n>0){
			{
				System.out.println("It is a positive number");
			}
			if(n%2 == 0)
			{
				System.out.println("it is a even number");
			}
			else
			{
				System.out.println("it is a odd number");
			}
		}
		else
		{
			System.out.println("It is a negative number");
		}
	}
	
}
