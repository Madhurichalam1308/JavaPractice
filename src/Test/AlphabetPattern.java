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
        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print((char) (alpha + j) + " ");
            }
            System.out.println("");
        }
        System.out.println("---------------------");
        //    To Print the below pattern
//    A
//    B B
//    C C C
//    D D D D
//    E E E E E

        for (int k = 0; k <= 5; k++) {
            for (int l = 0; l <= k; l++) {
                System.out.print((char) (alpha) + " ");

            }
            alpha++;
            System.out.println("");
        }
    }
}
