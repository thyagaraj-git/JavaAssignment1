package quest3;

public class mainbank {
public static void main(String args[])
{
	savingAcc s1=new savingAcc(2000,10000);
	s1.display();
	
	Currentacc c1=new Currentacc(1000,20000);
	c1.display();
}
}
