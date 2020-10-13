
public class MethodOverloaddingg 
{
	public void Yashraj()
	{
		System.out.println("Iphone");
	}
	
	public void Yashraj(char c)
	{
		System.out.println("Iphone XR");
	}
	
	public static void main(String[] args)
	{
		MethodOverloaddingg meth=new MethodOverloaddingg();
		meth.Yashraj();
		meth.Yashraj('l');
	}

}
