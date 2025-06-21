package ex_04082024.accessModifiers.police;

public class Cop {
    int gun;
    String id;

    public Cop(int gun)
    {
        this.gun=gun;
    }

    protected void canIShoot()
    {
        System.out.println("yes u can shoot");
    }
}
