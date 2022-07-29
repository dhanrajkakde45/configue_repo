package encap_practice;

    public class guru_99_access {

    public static void main(String[] args) 
    {
    
    	guru_99_reg g=new guru_99_reg();
    	  
       g.setfullname("Hitanshu Bhagile");
       System.out.println(g.getfullname());
       
       g.setemail_id("hitubhagile123@");
       System.out.println(g.getemail_id());

       
       g.setpincode(431005);
       System.out.println(g.getpincode());
     
       g.setAbove_age18('Y');
      System.out.println(g.getAbove_age18());
    
    
    
    }
    }
