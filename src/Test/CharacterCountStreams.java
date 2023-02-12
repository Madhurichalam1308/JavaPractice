package Test;

public class CharacterCountStreams {
    public static void main(String[] args) {

        String str = " Testing solutions via naveen automation labs";
        System.out.println(countCharacters(str,'s'));
        System.out.println(countCharacters(str,'s','t'));
    }

    public static long countCharacters(String str,char c)
    {
        return str.chars().filter(e -> (char) e ==c).count();
    }

    public static long countCharacters(String str,char c1, char c2)
    {
        return str.chars().filter(e -> (char) e == c1 || (char) e == c2).count();
    }
}
