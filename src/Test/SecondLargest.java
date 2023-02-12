package Test;

import java.util.Arrays;

public class SecondLargest {

    public static void main(String[] args) {

        int [] numbers = {15,17,22,78,90,34,54,89};
        int firstlargest = 0;
        int n = numbers.length;

        for (int i=0;i<numbers.length;i++)
        {
            if(numbers[i]>firstlargest)
            {
                firstlargest=numbers[i];
            }
        }
        System.out.println(firstlargest);
        Arrays.sort(numbers);
        int secondlargest =0;
        for(int j = n-2;j>=0;j--)
        {
            if(numbers[j]!= firstlargest)
            {
                secondlargest=numbers[j];
                break;
            }
        }
        System.out.println(secondlargest);
    }
}
