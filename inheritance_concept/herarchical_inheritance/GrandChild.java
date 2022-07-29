package herarchical_inheritance;
 
   public class GrandChild extends Parent {
   
   void gs1() 
   {
	System.out.println("method gs1 from the Parent class");   
   }
	void gs2()
	{
	System.out.println("method  gs2 from  the parent class");	
	}
	
	public static void main(String []args) 
	{
	
		GrandChild obj=new GrandChild();
		obj.p1();
		obj.p2();
		//i can't call with object of GrandChild class to son class
		//that is  known as a Hierarchical inheritance 
		//we can call current class method and the class which is extended
		
		
	}
	
	}
