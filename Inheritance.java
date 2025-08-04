//Inheritance

class Inheritance
{
    public static void main(String arg[])
    {
        Car myCar= new Car();
        myCar.display();
        Audi ob1= new Audi();
        ob1.display();
        Bmw ob2= new Bmw();
        ob2.display();

    }
}

class Car
{
    //Construnctor
    Car()
    {
        System.out.println("This is a Car");
    }

    void display()
    {
        System.out.println("Speed");
        System.out.println("Fuel");
        System.out.println("Distance");
    }
    
}
//class Audi extends Car ->Single Inheritance - > one parent class for a child class



// Single Inheritance: Car → Audi
class Audi extends Car
{
    //Construnctor not need return type(int,void)
    Audi()
    {
        System.out.println("This is a Audi Car");
    }

    //Method overriding
    void display()
    {
        System.out.println("Audi_Speed");
        System.out.println("Audi_Fuel");
        System.out.println("Audi_Distance");
    }
}

//class Bmw extends Audi -> Multilevel Inheritance -> one  grandparent class -> one parent class -> child class
//OR
//class Bmw extends Car  and  class Audi extends Car ->Herirical  Inheritance ->  one parent class for many child class



// Multilevel Inheritance: Car → Audi → Bmw
class Bmw extends Audi
{
    Bmw()
    {
        System.out.println("This is a Bmw");
    }
    void display()
    {
        System.out.println("Bmw_Speed");
        System.out.println("Bmw_Fuel");
        System.out.println("Bmw_Distance");
    }
}


