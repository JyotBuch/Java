//Solution to https://www.hackerrank.com/challenges/java-anagrams/problem

import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        if ( a.length() != b.length()) return false;

        a = a.toLowerCase();
        b = b.toLowerCase();
        
        java.util.HashMap<Character, Integer> hashmap = new java.util.HashMap<>();

        for (int k = 0; k < b.length(); k++){
            char letter = b.charAt(k);    

            if( ! hashmap.containsKey(letter)){
                 hashmap.put( letter, 1 );
            } else {
                Integer frequency = hashmap.get( letter );
                hashmap.put( letter, ++frequency );
    }
}
        for (int k = 0; k < a.length(); k++){
            char letter = a.charAt(k);

            if( ! hashmap.containsKey( letter ) )
                return false;

            Integer frequency = hashmap.get( letter );

            if( frequency == 0 )
                return false;
            else    
                hashmap.put( letter, --frequency);
            }
            return true;
    }

  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
