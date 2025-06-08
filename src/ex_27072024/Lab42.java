package ex_27072024;

import java.util.Arrays;

public class Lab42 {
    public static void main(String[] args) {
        int[] salaries={99,65,98,35,66};
        int max=salaries[0],min=salaries[0];
        for (int i = 1; i < 5; i++) {
            if (salaries[i]>max)
            {
                max=salaries[i];
            }
            if (salaries[i]<min)
            {
                min=salaries[i];
            }

        }
        System.out.println("max is "+max);
        System.out.println("min is "+min);
        Arrays.sort(salaries);
        System.out.println(salaries[salaries.length-1]);
    }
}
