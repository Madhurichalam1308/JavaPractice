package Test;

import java.util.regex.Matcher;

public class Substring {

    public static void main(String[] args) {

        System.out.println(isSubstring("testing","test"));

    }

    public static boolean isSubstring(String main , String sub)
    {
        return main.matches((".*")+sub+(".*"));
    }
}
