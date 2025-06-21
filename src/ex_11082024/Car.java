package ex_11082024;

public class Car extends Engine{
    @Override
    void start() {
        System.out.println("Start");
    }

    @Override
    void stop() {
        System.out.println("stop");
    }

    @Override
    void partGearBox() {
        System.out.println("part gear box");
    }

    @Override
    void openCar() {
        System.out.println("open car");
    }
}
