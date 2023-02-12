package Test;

public class FindMissingNumberInArray {

    public static void main(String[] args) {

        int num[]= {1,2,3,4,5,6,8,9,10};
        int n1 = findMissingNumber(num,10);
        System.out.println(n1);
    }
    public static int findMissingNumber(int num[],int totalcount)
    {
        int exSum = totalcount *(totalcount+1)/2;
        int actualSum = 0;
        for (int i : num)
        {
            actualSum+= i;
        }
        return exSum - actualSum;
    }
}
