import java.io.*;
import java.util.*;

class Solution {

    public static void main(String args[])throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the words with a single space between each of them.");
        String s[] = sc.nextLine().split(" ");
        for(int i = 1; i <= 5; i++) {
            System.out.println("Test case #0"+i+":");
            System.out.print("\tInput: ");
            int x = (sc.nextInt()%s.length)-1;
            if(x == -1) x += s.length;
            System.out.println("\tOutput: " + s[x]);
        }
        sc.close();
	}
}
