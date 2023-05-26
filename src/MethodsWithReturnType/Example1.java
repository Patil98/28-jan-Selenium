package MethodsWithReturnType;

public class Example1 

{
	
	//Example of method with return type with
	// return type--->> void , int , string

	public static void main(String[] args)
	{
		  int num1= add(10,20);
		System.out.println(num1);
		

		System.out.println("...........");
		
		System.out.println(add(num1,10));
		
		System.out.println(add(5,6));
		
		System.out.println(".........");
		
		Example1 e = new Example1();
		int num2 = e.mul(15, 3);
		System.out.println(num2);
		System.out.println(".......");
		System.out.println(e.mul(12, 4));
		
		System.out.println("..............");
		
		String s5 = Example2.convertNameToUpperCase("bhushan");
		System.out.println(s5);
		
		System.out.println(".........");
		
		System.out.println(Example2.convertNameToUpperCase("bhushan"));
		
		System.out.println(".........................");
		
		     Example2  s=new Example2();
		       String  s3 = s.convertNameToLowerCase("ANIL");
		       System.out.println(s3);
		       
		       System.out.println(s.convertNameToLowerCase("ATUL"));
		       
	}
	
	// static method with int return type
	public static int add(int a,int b)
	{
		int c = a+b;
		return c;
	}
	
	//non-static method with int data type
	public int mul(int c,int d) 
	{
	      int mulvalue=c*d;
	      return mulvalue;
	}
	
	
	
	
	
	
	
	
	
	
	
}
