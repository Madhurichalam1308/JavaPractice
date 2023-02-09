package Test;

public class StringManipulation {
    public static void main(String[] args) {
        String str = "The rains have started here";
        String str1 = "The rains Have started here";

        System.out.println("Length of the string is : "+str.length());
        System.out.println("The charcter at the 5th Position is : "+str.charAt(5));
        System.out.println("The first occurence of s in the string is at index : "+str.indexOf("s"));
        System.out.println("The second occurence of s in the string is at index : "+str.indexOf("s",str.indexOf("s")+1));
        System.out.println("The index of have is : "+str.indexOf("have"));
        System.out.println("The index of have is : "+str.indexOf("hello"));
        System.out.println(str.equals(str1));
        System.out.println(str.equalsIgnoreCase(str1));
        System.out.println(str.substring(0,8));

    }
}
