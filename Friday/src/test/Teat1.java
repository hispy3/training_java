package test;

class Operation007
{
	static
	{
		System.out.println("static");
	}
	public Operation007()
	{
		System.out.println("contructor");
	}
	
	{
		System.out.println("Init");
	}
	
}
public class Teat1 { 
	public static void main(String args[])
	{
	Operation007 op=new Operation007();
	Operation007 op1=new Operation007();
	Operation007 op2=new Operation007();
	}
}

	


