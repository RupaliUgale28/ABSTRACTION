//Program for ATM functionalities-without taking input from user
package ABSTRACTION_CLASS;
class credit_debit_function
{
	int total_amount=0;
	int total_amount2=0;
	
	public void credited_money(int credited_amount)
	{
		this.total_amount=credited_amount+(this.total_amount);
		System.out.println("Total balance in your account is = " +total_amount +"Rs");
	}

	public void debited_money(int debited_amount)
	{	
		this.total_amount=this.total_amount-debited_amount;		
		System.out.println("Total remaining balance in your account is = " +total_amount +"Rs");
	}
}

public class ATM extends credit_debit_function
{
	public static void main(String[] args) 
	{
		ATM check=new ATM();
		check.credited_money(500);
		check.credited_money(500);
		check.credited_money(500);
		
		check.debited_money(200);
		check.debited_money(300);
		check.debited_money(500);
	}
}
