//Program for ATM functionalities-taking input from user
package ABSTRACTION_CLASS;
import java.util.Scanner;
class credit_debit_functions
{
	int total_amount=0;
	public void credited_money()
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter valid amount you want to credit in your account= ");
		int credited_amount=s.nextInt();
		this.total_amount=credited_amount+(this.total_amount);
		System.out.println("Total balance in your account is = " +total_amount +"Rs");
	}

	public void debited_money()
	{	
		Scanner s=new Scanner(System.in);
		System.out.print("Enter valid amount you want debit from your account= ");
		int debited_amount=s.nextInt();
		if(debited_amount<=total_amount){
		this.total_amount=this.total_amount-debited_amount;		
		System.out.println("Total remaining balance in your account is = " +total_amount +"Rs");
		}
		else{
			System.out.println("Insufficient amount.");
		}
	}
}
public class atm1 extends credit_debit_functions
{
	public static void main(String[] args) 
	{
		atm1 check=new atm1();
		check.credited_money();
		check.debited_money();
		check.credited_money();
		check.debited_money();
		check.credited_money();
	}
}
