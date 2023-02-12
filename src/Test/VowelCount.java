package Test;

import com.google.common.base.CharMatcher;

import java.util.function.IntPredicate;

public class VowelCount {

    public static void main(String[] args) {
        String str = "Madhuri";
        System.out.println("Using Java");
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (isVowel(str.charAt(i))) {
                count++;
            }
        }
        System.out.println(count);
        System.out.println("Using Java 8 Streams");
        IntPredicate vowel = new IntPredicate() {
            @Override
            public boolean test(int c) {
                return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
            }
        };
        long vcount = str.chars().filter(vowel).count();
        System.out.println(vcount);
        System.out.println("Using Java Guava Library");
        int vocount = CharMatcher.anyOf("aeiou").countIn(str);
        System.out.println(vcount);
    }
    public static boolean isVowel(char c)

    {
        return c =='a'|| c == 'e'|| c == 'i'|| c=='o'||c=='u'||c =='A'|| c == 'E'|| c == 'I'|| c=='O'||c=='U';
    }
}
