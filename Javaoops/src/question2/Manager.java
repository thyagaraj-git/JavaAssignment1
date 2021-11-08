package question2;

public class Manager extends Employee {
public double incentive,mansal;
public Manager(double incentive,double mansal)
{
	this.mansal=mansal;
	this.incentive=incentive;
}
public double totalmansal() {
	double totalmansal=mansal+incentive;
	return totalmansal;
}
public void gettotalsal() {
	System.out.println("manager salary is: "+totalmansal());
}
}
