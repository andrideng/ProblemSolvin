import java.io.*;
import java.util.*;

class Solution {

    public static void main(String args[])throws IOException {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().toLowerCase();
        HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
        int etc = 0;
        ArrayList<Character> order = new ArrayList<Character>();
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(Character.isLetter(ch)) {
                if(hm.containsKey(ch)) hm.put(ch, hm.get(ch) + 1);
                else {
                    hm.put(ch, 1);
                    order.add(ch);
                }
            }
            else etc++;
        }
        System.out.println("{");
        for(Character ch : order) {
            System.out.println("\t" + ch + ": " + hm.get(ch) + ",");
        }
        System.out.println("\tetc: " + etc);
        System.out.println("}");
        sc.close();
	}
}
