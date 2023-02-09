package Test;

public class SwapIntegers {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

//         a = a+b;
//         b=a-b;
//         a=a-b;
//
//        System.out.println("The value of a after swapping is :"+a);
//        System.out.println("The value of b after swapping is :"+b);

//        a = a*b;
//        b=a/b;
//        a=a/b;
//
//        System.out.println("The value of a after swapping is :"+a);
//        System.out.println("The value of b after swapping is :"+b);


        a = a^b;
        b=a^b;
        a=a^b;

        System.out.println("The value of a after swapping is :"+a);
        System.out.println("The value of b after swapping is :"+b);


    }
}
