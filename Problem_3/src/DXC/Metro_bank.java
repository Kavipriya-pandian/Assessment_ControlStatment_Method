package DXC;
/*
 * The Metro Bank provides various types of loans such as car loans, 
business loans and house loans to its account holders, i.e., customers.
Implement a program to determine the eligible loan amount and the EMI 
that the bank can provide to its customers based on their salary and the 
loan type they expect to avail.
The values required for determining the eligible loan amount and the EMI 
are:
• account number of the customer
• account balance of the customer
• salary of the customer
• loan type
• expected loan amount
• expected no. of EMIs
The following validations should be performed:
• The account number should be of 4 digits and its first digit should 
be 1
• The customer should have a minimum balance of $1000 in the 
account
Display appropriate error messages if the validations fail.
If the validations pass, determine whether the bank would provide the 
loan or not.
The bank would provide the loan, only if the loan amount and the number 
of EMIs expected by the customer is less than or equal to the loan 
amount and the number of EMIs decided by the bank respectively. The 
bank decides the eligible loan amount and the number of EMIs based on the table 
 */
public class Metro_bank
{

	public static void main(String[] args) 
	{
		
		double accountNumber= 1001;
		double salary= 40000;
		double accountBalance= 250000;
		String loanType= "car";
		double loanAmountExpected=300000;
		int emisExpected=30;
		if ( accountNumber<2000 && salary>25000 && accountBalance>999 && loanType=="car" && loanAmountExpected<500000 && emisExpected<37)
		{
		    System.out.println("Your account number is "+accountNumber);
		    System.out.println("you are eligible for bank loan");
		    System.out.println("Eligible Loan amount is $"+loanAmountExpected);
		    emisExpected=36;
		    System.out.println("Eligible EMI is "+emisExpected);
		}
		else if (accountNumber<2000 && salary>50000 && accountBalance>999 && loanType=="house" && loanAmountExpected<6000000 && emisExpected<61)
		{
		System.out.println("Your account number is "+accountNumber);
		System.out.println("you are eligible for bank loan");
		System.out.println("Eligible Loan amount is $"+loanAmountExpected);
		emisExpected=60;
		System.out.println("Eligible EMI is "+emisExpected);
		}
		else if (accountNumber<2000 && salary>75000 && accountBalance>999 && loanType=="business" && loanAmountExpected<7500000 && emisExpected<85)
		{
		    System.out.println("Your account number is "+accountNumber);
		    System.out.println("you are eligible for bank loan");
		    System.out.println("Eligible Loan amount is $"+loanAmountExpected);
		    emisExpected=84;
		    System.out.println("Eligible EMI is "+emisExpected);
		}
		else 
		{
		    System.out.println("Sorry!!! you are not eligible");
		}
	}

	

}
