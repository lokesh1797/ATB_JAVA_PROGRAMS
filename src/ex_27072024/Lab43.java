package ex_27072024;

public class Lab43 {
    public static void main(String[] args) {
        //Strings are immutable in nature
        String s1="Lokesh";

        StringBuffer SB=new StringBuffer("loki");
        //change the value of sting -buffer
        SB.append("kumar");
        System.out.println(SB);

        StringBuilder sbuild=new StringBuilder("lucky");
        sbuild.append("kumar");
        System.out.println(sbuild);
    }
}
