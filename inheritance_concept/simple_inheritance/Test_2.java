package simple_inheritance;

  public class Test_2 extends Test_1{

   void c11()	  
  {
	 
	System.out.println("method c1 from class Test_2"); 	 	 
  } 
	 
   void c2()
   {
	  System.out.println("method c2 from  class Test_2"); 
	   	   	   	   
   }  
	  
	  public static void main(String[] args) 
	  {
		  
		  Test_2 ref=new Test_2();
		  ref.p1();
		  ref.p2();
		  /*By extending class2 by class1 we can inherited the 
		  properties of Test_1 into Test_2 by creating reference of Test_2
		  from the object of Test2 class we can call the  Test_1 class method this is known as simple inheritance
		  
		  */
		  
		  
	  }
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
}
