package Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FindDupliactesInString {
    public static void main(String[] args) {
        PrintDuplicateCharacters("A");
        PrintDuplicateCharacters("");
    //    PrintDuplicateCharacters(null);
        PrintDuplicateCharacters("opayo");
        PrintDuplicateCharacters("tom");
        PrintDuplicateCharacters("1000");
        PrintDuplicateCharacters("007 James Bond");
    }

    public static void PrintDuplicateCharacters(String str)
    {
        if(str == null )
        {
            System.out.println("NULL String");
        }
        if(str.isEmpty())
        {
            System.out.println("Empty String");
        }
        if(str.length()==1)
        {
            System.out.println("Single Char String");
        }

        char words[] = str.toCharArray(); //java
        Map<Character,Integer> charMap = new HashMap<Character,Integer>();
        for (Character ch : words)
        {
            if(charMap.containsKey(ch))
            {
                charMap.put(ch,charMap.get(ch)+1);
            }
            else
            {
                charMap.put(ch,1);
            }
        }
        //print the map

        Set<Map.Entry<Character,Integer>> entrySet = charMap.entrySet();
        for(Map.Entry<Character,Integer> entry : entrySet )
        {
            if(entry.getValue()>1)
            {
                System.out.println(entry.getKey() + ":" + entry.getValue());
            }
        }

    }
}
