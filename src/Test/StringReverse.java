package Test;

public class StringReverse {

    public static void main(String[] args)
    {
        String s ="Selenium";
        // Using For loop
//
//        int len = s.length();
//        String rev ="";
//
//        for(int i=len-1;i>=0;i--)
//        {
//            rev = rev+ s.charAt(i);
//
//        }
//        System.out.println(rev);

//        Using String Buffer Class

        StringBuffer sf = new StringBuffer(s);
        System.out.println(sf.reverse());

    }
}
