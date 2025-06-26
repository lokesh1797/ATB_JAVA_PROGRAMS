package ex_24082024;

public class Lab74 {
    public static void main(String[] args) {
        temp("lokesh");
        temp(true);
        temp(123);
// T any data type
        print(123);
        print(true);
        print("toy");
        print('a');

    }

    public static <T> void temp(T name){
        System.out.println(name);
    }

    public static <lokesh> void print(lokesh a){
        System.out.println(a);
    }
}
