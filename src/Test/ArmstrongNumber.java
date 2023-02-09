package Test;

public class ArmstrongNumber {

    // Eg : 151 : 1*1*1 + 5*5*5 + 1*1*1


        public static void isArmstrong(int num)
        {
            int cube=0;
            int r=0;
            int t;

            t=num;

            while(num>0)
            {
                r=num%10;
                num=num/10;
                cube=cube+(r*r*r);

            }
            if(t==cube)
            {
                System.out.println("Armstong number");
            }

            else
            {
                System.out.println("Not an armstrong number");
            }
        }

        public static void main(String[] args) {

            isArmstrong(153);
            isArmstrong(370);
            isArmstrong(371);
            isArmstrong(375);


        }
    }

