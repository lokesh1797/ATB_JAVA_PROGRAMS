package ex_04082024;

public class Person {

    String name;
    long Phone;
    Person()
    {
        System.out.println("constructor is called");
    }

    Person(String nameGiven)
    {
        this.name="lokesh";
    }
    Person(String nameGivenFinal,long PhoneFinal)
    {
        this.name=nameGivenFinal;
        this.Phone=PhoneFinal;
    }

}
