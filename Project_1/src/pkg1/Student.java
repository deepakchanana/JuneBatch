package pkg1;
//{ } means boundary of the class
// we will keep(put) variable + method
// variable----which store some value and value can be change
// method------for performing any operation we will create method for it

public class Student
{    
   int a;  // declared a variable named a and it will store integer value
   
   public void deepak()  // () indicate this is a method
   {    // boundary of the method 
	   System.out.println("Welcome to all of you ");
   }
   public static void main(String[] args)   // piller2
   {
     Student abc=new Student(); // piller3
     abc.deepak();
     abc.deepak();
     abc.a=122;
     System.out.println(abc.a);
     abc.a=3444;
     System.out.println(abc.a);
   }
}
