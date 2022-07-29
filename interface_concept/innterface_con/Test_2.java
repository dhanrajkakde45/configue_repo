package innterface_con;

      public class Test_2 implements Test_1 {

   
      
      int a=10;
      String s="dhanraj123";
	@Override
	public void m1() {
		System.out.println("m1");
		
	}
	@Override
	public void m2() {
		System.out.println("m2");
	}
	@Override
	public void m3() {
		System.out.println("m3");
	} 
      
      public static  void main(String[] args) { 
      Test_1 ref=new Test_2();
      ref.m1();
      ref.m2();
      ref.m3();
      
      
      
      
      }
      
      
      
      
      } 
