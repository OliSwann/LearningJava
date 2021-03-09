package overloadingAndOverriding;

public class Overloading {
	 public void disp(char c)
	    {
	        System.out.println(c);
	    }
	 public void disp(int c)	//These two show you can pass through different data types
	 {
		 System.out.println(c);
	 }
	 public void show(char c, int num)  
	    {
	         System.out.println(c + " "+num);
	    }
	 public void show(int num, char c)  	//These two show you can pass the same data types, just in a different order
	    {
	         System.out.println(c + " "+num);
	    }
	 public void out(char c)
	 {
		 System.out.println(c);
	 }
	 public void out(char c, int a)		//These two show you can pass through different amounts of arguments
	 {
		 System.out.println(c + " " + a);
	 }
}

