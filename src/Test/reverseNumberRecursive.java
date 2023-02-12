package Test;

public class reverseNumberRecursive {

    public static void rev(int num)
    {
        if(num<10)
        {
            System.out.print(num);
        }
        else
        {
            System.out.print(num%10);
            rev(num/10);
        }
    }

    public static void main(String[] args) {

        // int num =123
        // while(num>0)
        //int rev = num%10;
       // System.out.println(rev);
        // num=num/10;
          rev(345);

    }

}

