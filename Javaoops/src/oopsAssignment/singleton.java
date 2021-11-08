package oopsAssignment;

public class singleton {
private static singleton obj;
private singleton()
{
	System.out.println("singleton instance created");
}
public static void createobject()
{
	if(obj==null)
	{
		obj=new singleton();
	}
	else
	{
		System.out.println("object cannot be created");
	}
}
}
