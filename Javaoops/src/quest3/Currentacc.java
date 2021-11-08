package quest3;

public class Currentacc extends Bank{
public double cashcredit;
Currentacc(double balance,double cashcredit)
{
	super(balance);
	this.cashcredit=cashcredit;
}
public double getbalance() {
	double currentbalance=balance+cashcredit;
	return currentbalance;
}
public void display()
{
	System.out.println("..............current account...............");
	System.out.println("initial balance: "+balance);
	System.out.println("cash credit: "+cashcredit);
	System.out.println("total current balance: "+getbalance());
}
}
