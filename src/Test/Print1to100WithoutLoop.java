package Test;

import java.util.stream.IntStream;

public class Print1to100WithoutLoop {

    public static void main(String[] args) {

        printNumber(1);
        printNumber(1,100);
        IntStream.range(1,101).forEach(e-> System.out.println(e));
    }
    public static void printNumber(int num)
    {
        if(num<=100) {
            System.out.println(num);
            num++;
            printNumber(num);
        }
    }
    public static void printNumber(int stnum, int endnum)
    {
        if(stnum<=endnum) {
            System.out.println(stnum);
            stnum++;
            printNumber(stnum,endnum);
        }
    }
}

