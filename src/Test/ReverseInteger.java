package Test;

public class ReverseInteger {

    public static void main(String[] args)
    {
        //Using algo
        int num = 12345;
//        int rev = 0;
//
//        while(num != 0)
//        {
//            rev = (rev * 10) + (num % 10);
//            num = num / 10;
//        }
//        System.out.println("Reverse of the interger is : " + rev);

        //Stringbuffer Object

        System.out.println("Reverse of the interger is : " + new StringBuffer(String.valueOf(num)).reverse());


    }
}
