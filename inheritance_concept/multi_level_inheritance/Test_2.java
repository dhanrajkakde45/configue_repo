package multi_level_inheritance;

   public class Test_2 extends Test_1 {

   void c1() 
   {
	   System.out.println("method c1 from the Test_2 class");
   }  
   
   void c2() 
   {
	System.out.println("method c2 from the Test_2");   
	   
   }
   
   
   public static void main(String[] args) 
   {
	   Test_2 ref=new Test_2();
	   ref.p1();
	   ref.p2(); //simple  inheritance occure here 
	             //we can call class1 method by creating class2 object
	             //that is simple inheritance
	   ref.c1();
	   ref.c2();
	   
   }
   
   
   
   
   
   
   
   
   
   
   }
