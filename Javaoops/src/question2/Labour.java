package question2;

public class Labour extends Employee{
public double overtime;
public double labsal;
public Labour(double labsal,double overtime)
{
	this.labsal=labsal;
	this.overtime=overtime;
}
public double totallabsal() {
	double totallabsal=labsal+overtime;
	return totallabsal;
}
public void gettotalsal()
{
	System.out.println("labour total salary: "+totallabsal());
}
}
