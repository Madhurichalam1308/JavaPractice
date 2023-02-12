package Test;

public class LengthOfString {

    public static void main(String[] args) {
        String str = "testing";

        System.out.println(str.lastIndexOf(""));
        System.out.println(str.toCharArray().length);
        System.out.println(str.split("").length);
        int count =0;
        for(char c : str.toCharArray())
        {
            count++;
        }
        System.out.println(count);
    }
}

