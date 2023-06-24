package pkg1;

public class Class1 
{
   int a;
   public void deepak()  // () indicate this is a method
   {
	 System.out.println("Welcome to all of you");  
   }
   public static void main(String[] args) 
   {
	Class1 ref=new Class1();
	ref.deepak();
	ref.a=122;
	System.out.println(ref.a);
   }
}
