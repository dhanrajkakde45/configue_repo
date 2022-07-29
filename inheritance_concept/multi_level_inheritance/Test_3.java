package multi_level_inheritance;

    public class Test_3 extends Test_2 {

    void GrandChild_1()
    {
    System.out.println("method Grand_Child1 from the Test_3 class");
    }
    void GrandChild_2()
    {
    System.out.println("method GrandChild_2 from the  Test_3 class");	
    }
    
    public static void main(String[] args) 
    {
    	
    Test_3 obj=new Test_3();
    obj.p1();  //here we can call with Test_3 reference to Test_1 class method
    obj.p2();  //indirectly we get Test_1 class proprties in Test_3 this i known as a Multi-level inheritance
               //class 1 to class 2 to class 3(withn class 3 class 1 property also we got)
    	
    	
    	
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    }
