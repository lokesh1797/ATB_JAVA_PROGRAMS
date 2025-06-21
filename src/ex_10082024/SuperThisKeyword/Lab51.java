package ex_10082024.SuperThisKeyword;

public class Lab51 {
    public static void main(String[] args) {
        Car s=new Car();
        s.display();
    }


}

class Car extends Vehicle{
    private int maxSpeed=200;

    Car()
    {
        super();//Constroctor chaining
        System.out.println("Super inside car constructor");
    }

     public void display()
    {
        System.out.println("this car speed is "+this.maxSpeed);
        System.out.println("vehicle speed is "+super.maxSpeed);
    }
}

class Vehicle{
    public int maxSpeed=100;

    Vehicle()
    {
        System.out.println("Vehicle constructor called");
    }

    void message()
    {
       System.out.println("hello vehicle");
    }

}
