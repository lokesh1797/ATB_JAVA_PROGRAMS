package ex_27072024;

public class Lab40 {
    public static void main(String[] args) {
        int marks[]={10,20,30,40,50};
        String[] shoplist={"bread","butter","milk","curd"};
        int newmarks[]=new int[3];
        System.out.println(marks.length);
        System.out.println(marks[0]);
        newmarks[0]=11;
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);

        }
        System.out.println(newmarks[1]);
    }
}
