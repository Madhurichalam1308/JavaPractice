package Test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DuplicateStringsInArray {

    public static void main(String[] args) {
        String infra[] = {"Amazon","Azure","GCP","Amazon","Ali Baba","Saucelabs","Azure","GCP"};
        //1.bruteforce
        //2.Hashset
        //3.hashmap
        //4.Streams

        System.out.println("******** Brute Force ********");
        for(int i=0;i< infra.length;i++)
        {
            for(int j=i+1;j<infra.length;j++)
            {
                if(infra[i].equals(infra[j]))
                {
                    System.out.println(infra[i]);
                }
            }
        }

        System.out.println("******** Hash Set ********");

        Set <String> data = new HashSet<String>();
        for(int i=0;i< infra.length;i++)
        {
            if(data.add(infra[i])== false)
            {
                System.out.println(infra[i]);
            }
        }
        System.out.println("******** Hash Map ********");

        Map<String,Integer> infraMap = new HashMap<String, Integer>();

        for(String e : infra)
        {
            Integer count =infraMap.get(e);
            if(count==null)
            {
                infraMap.put(e,1);
            }
            else
            {
                infraMap.put(e,++count);
            }

            Set<Map.Entry<String,Integer>> entrySet = infraMap.entrySet();
            for(Map.Entry<String,Integer> entry : entrySet ){
                if(entry.getValue()>1)
                {
                    System.out.println(entry.getKey());
                }
            }
        }


    }
}
