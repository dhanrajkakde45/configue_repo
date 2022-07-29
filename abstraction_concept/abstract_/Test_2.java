package abstract_;

    public class Test_2 extends Test_1 {
	
	void m1() 
	{
		System.out.println("method 1");  
	}
	void  m2() 
	{
		System.out.println("method 2");  	
	}
    
	public static void main(String[] args) 
	{
	Test_2 obj=new Test_2();     //we can create object of normal class Test_2
		obj.m1();                //not possible to create object of abstract class Test_1
		obj.m2();
	
	
	Test_1 ref=new Test_2();   ///here we created ref of Test_1(abstract class)
	                           //and object of Test_2 normal class
	ref.m1();
	ref.m2();
	ref.m3();
	
	}
		
	}
	
	

