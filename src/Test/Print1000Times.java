package Test;

public class Print1000Times {

    public static void main(String[] args) {
        String name = "madhuri";
        String s = "i";

        s = s.replaceAll("i","iiiiiiiiii");
        s=s.replaceAll("i","iiiiiiiiii");
        s= s.replaceAll("i","iiiiiiiiii");
        s=s.replaceAll("i",name + "\n");
        System.out.println(s);

    }
}
