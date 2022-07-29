package innterface_con;

public class Test_3 implements Test_1{

	@Override
	public void m1() 
	{
	 System.out.println("method");	
	}

	@Override
	public void m2() 
	{
	System.out.println("method 2");	
	}

	@Override
	public void m3() 
	{
	System.out.println("method 3");	
	}

	Test_1 t=new Test_3();
	
//here 100% of abstraction possible pure abstract method only
// its not like abstract class where concrete method also 	
}
