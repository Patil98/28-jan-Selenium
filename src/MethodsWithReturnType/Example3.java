package MethodsWithReturnType;

public class Example3 
{
	public static void main(String[] args) 
	{
		int num = add(10,20);
		System.out.println(num);

		System.out.println("..........");

		System.out.println(add(15,15));
		System.out.println(add(12,12));
		System.out.println("..........");

		int num1 = add1(15,60);
		System.out.println(num1);
		System.out.println(".......");

		System.out.println(add1(45,45));

	}

	public static int add (int e,int f)
	{
		int d = e+f;
		return d;
	}

	public static int add1 (int e, int f)
	{
		int k=e+f;
		return k;
	}




}
