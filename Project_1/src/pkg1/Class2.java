package pkg1;

public class Class2 
{
   public int sum(int a,int b)
   {
	   int c;
	   c=a+b;
	   System.out.println("sum result is "+c);
	   return c;
   }
   public int subtract(int x,int y)
   {
	   int z;
	   z=x-y;
	   System.out.println("sub result is "+z);
	   return z;
   }
   public void multi(int a1,int a2)
   {
	   int a3;
	   a3=a1*a2;
	   System.out.println("final result is "+a3);
   }
	public static void main(String[] args) 
	{
		Class2 ref=new Class2();
		int sumresult=ref.sum(10, 2);
		int subresult=ref.subtract(10, 2);
		ref.multi(sumresult, subresult);
	}
}
