package quest3;

public class savingAcc extends Bank{
public double fixedDep;
savingAcc(double balance,double fixedDep)
{
	super(balance);
	this.fixedDep=fixedDep;
}
public double getbalance()
{
	double Sbalance=balance+fixedDep;
	return Sbalance;
}
public void display()
{
	System.out.println("...............savings account...............s");
	System.out.println("initial balance: "+balance);
	System.out.println("fixed deposit: "+fixedDep);
	System.out.println("total balance: "+getbalance());
}
}
