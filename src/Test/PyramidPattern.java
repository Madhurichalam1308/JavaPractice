package Test;

public class PyramidPattern {

    public static void main(String[] args) {
//        To print the below pattern
//                *
//               * *
//              * * *
//             * * * *

        for(int i=0;i<=4;i++)
        {
            for(int j=3;j>=i;j--)
            {
                System.out.print(" ");
            }
            for(int k=0;k<=i;k++)
            {
                System.out.print(" *");
            }
            System.out.println("");
        }

    }
}