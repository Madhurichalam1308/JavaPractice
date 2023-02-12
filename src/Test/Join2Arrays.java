package Test;

import java.util.Arrays;
import java.util.stream.Stream;

import static java.util.Arrays.stream;

public class Join2Arrays {

    public static void main(String[] args) {

        String [] fruits = {"apple","orange","strawberry"};
        String [] vegetables = {"Potato","onion","peas"};

       Stream<String> sF = Arrays.stream(fruits);
       Stream<String> sV = Arrays.stream(vegetables);

       String[] all = Stream.concat(sF,sV).toArray(size-> new String[size]);

        for (String s:all) {
            System.out.println(s);

        }

    }
}
