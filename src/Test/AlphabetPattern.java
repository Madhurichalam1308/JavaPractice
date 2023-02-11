package Test;

public class AlphabetPattern {

    public static void main(String[] args) {
//    To Print the below pattern
//    A
//    A B
//    A B C
//    A B C D
//    A B C D E

        int alpha = 65;
        for(int i=0;i<=5;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print((char)(alpha+j)+" ");
            }
            System.out.println("");
        }

    }
}
