import java.util.*;
class FinalKeyword
{
    public static void main(String arg[])
    {
        //final -> non changable -> always must me initialized
        //In non primitive data type the final keyword variable can be changed
        final Student karthik = new Student("karthik",21,30);
        karthik.name="karthik_new";
        karthik.display();
    }
}
class Student
{
    // Declaration = you create empty slots for each property.
    String name;
    //final key word ids used here it will show the error Constructor ->(final int roll=90;) initialized ✅
    int roll=90;
    int mark;

    //Constructor = you fill those slots with real values.
    
    Student(String name,int roll,int marks)
    {
        this.name=name;
        //Error will show if final 
        this.roll=roll;
        //either this keyword or different variabeles can be used line below (mark=marks;)
        mark=marks;
    }

    void display()
    {
        System.out.println(name);
        System.out.println(roll);
        System.out.println(mark);
    }

}
