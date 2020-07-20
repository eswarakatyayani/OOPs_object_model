package oopss;
interface Students          //interface usage
{
abstract void section();      //abstract method
abstract int get_rollno();    //abstract method
abstract String get_name();  //abstract method
}
class Student implements Students
{
    private int rollno=5; 
    private String name="Eswara Katyayani"; //encapsulation 
    
    public void section()        //overriding method (polymorphism)
    {
        System.out.println("This student section is A");
    }
    public int get_rollno()
    {
        return rollno;
    }
    public String get_name()
    {
        return name;
    }
}
class OverridingClass extends Student 
{
    public void section()
    {
     System.out.println("Demo of overriding :Iam student of section is A");   
    }
}

public class Main
{
	public static void main(String[] args) 
	{
	 Students s=new OverridingClass();
	 s.section();
	 System.out.println("My roll is "+s.get_rollno());
	 System.out.println("My name is "+s.get_name());
	 
	}
}
