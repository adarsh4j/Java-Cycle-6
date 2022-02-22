import java.util.*;

public class Account{ 

	static void Balance(int money){ 		
		   if(money<500) 

			throw new ArithmeticException("Sorry,balance amount  is less than 500"); 

		else

			System.out.println("Money is withdrawed"); 

	} 

	public static void main(String args[]){

		System.out.println("How many money you need");

		Scanner obj = new Scanner(System.in);	

		int a = obj.nextInt();	

		Balance(a);

		

	} 

}
