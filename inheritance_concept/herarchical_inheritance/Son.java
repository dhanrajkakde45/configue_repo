package herarchical_inheritance;

    public class Son extends Parent{

    void s1() 
    {
    System.out.println("s1 method from son class");	    	
    }
    
    void s2()
    {
    System.out.println("s2 method from son class");
    }
    
    public static void main(String[] args) 
    {
    	Son ref=new Son();
        ref.p1();
        ref.p2();
        ref.s1();
        ref.s2();
        //we inherited class Parent here
    	
    	
    	
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    }
