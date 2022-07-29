package abstract_;

   public abstract class Test_1 {

  abstract void m1();      //if you have to create abstract method 
                           // class must be abstract class
  abstract void m2();      //in abstract class we do data hiding
  
  void m3() {            //method may or may not be abstracted in abstract class 
	System.out.println("method 3");                     //class should be abstracted
  }


  public static void main(String[] args)
  {
    //Test_1 obj=new Test_1(); //we can not create object of abstract class	  
 	  
  }
 
  
   
}
