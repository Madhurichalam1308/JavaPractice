package Test;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElementsInArray {

    public static void main(String[] args) {

        String names[] ={"Java","Javascript","Ruby","C","Python","Java"};

        //1. compare each element

        for(int i=0; i< names.length;i++)
        {
            for (int j=i+1;j< names.length;j++)
            {
                if(names[i].equals(names[j]))
                {
                    System.out.println("Duplicate Array Element is : "+ names[i]);
                }
            }
        }

        //2. using hash set

        Set<String> store = new HashSet<String>();
    }
}
