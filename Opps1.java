import java.util.*;
class Opps
{
    public static void main(String arg[])
    {
        // System.out.println("Hello;");
        // String[] name = new String[5];
        // int[] roll = new int[5];
        // int[] mark = new int[5];
        // int[] Student = new int[5];
        // Student[]  students= new Student[5];
        // Student sai;
        // System.out.println(Arrays.toString(students));

        //sai is a object
        Student sai = new Student("saikarthik",22,90);

        //sai is a karthik is a object
        Student karthik = new Student("karthik",21,30);
        sai.display();
        System.out.println();
        karthik.display();
    }
}
class Student
{
    // Declaration = you create empty slots for each property.
    String name;
    int roll;
    int mark;

    //Constructor = you fill those slots with real values.
    Student(String name,int roll,int marks)
    {
        this.name=name;
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
