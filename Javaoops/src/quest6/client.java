package quest6;

public class client {
public static void main(String args[])
{
	Persistence p1=new Persistence() {
	public void persist() {
		
			System.out.println("the client created an object of persistence and invoking the method");
		
	}
};
p1.persist();
}
}