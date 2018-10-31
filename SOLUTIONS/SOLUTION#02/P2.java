import java.io.*;
import java.util.*;

class Solution {

    public static void main(String args[])throws IOException {
        Scanner sc = new Scanner(System.in);
        Character l[] = {'q','w','e','r','t','a','s','d','f','g','z','x','c','v','b'};
        HashSet<Character> hsl = new HashSet<Character>(Arrays.asList(l));
        Character r[] = {'y','u','i','o','p','h','j','k','l','n','m'};
        HashSet<Character> hsr = new HashSet<Character>(Arrays.asList(r));
        for(int i = 1; i <= 5; i++) {
            System.out.println("Test case #0"+i+":");
            System.out.print("\tInput: ");
            String s = sc.nextLine().toLowerCase();
            boolean left = false, right = false;
            for(int j = 0; j < s.length(); j++) {
                char ch = s.charAt(j);
                if(hsl.contains(ch)) left = true;
                if(hsr.contains(ch)) right = true;
                if(left && right) break;
            }
            System.out.println("\tOutput: " + (left^right));
        }
        sc.close();
	}
}
