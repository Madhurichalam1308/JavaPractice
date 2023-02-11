package Test;

import java.util.stream.IntStream;

public class PrintNumbersWithoutLoop {

    //1.Using Recursive method
    //2.Java Streams

    public static void main(String[] args) {
  //      printnum(1);
        printnumber(1,100);
  //      IntStream.range(1,101).forEach(value -> System.out.println(value));
    }

    public static void printnum(int num)
    {
        if(num<=100)
        {
            System.out.println(num);
            num++;
            printnum(num);

        }

    }
    public static void printnumber(int stNum, int endNum)
    {
        if(stNum<=endNum)
        {
            System.out.println(stNum);
            stNum++;
            printnumber(stNum,endNum);
        }

    }

}
