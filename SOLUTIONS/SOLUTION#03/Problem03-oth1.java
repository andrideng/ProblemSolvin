import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Problem03 {
    public static void main(String[] args) {
        char[] alphabet = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

        Scanner scanner = new Scanner(System.in);

        Map<Character, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < alphabet.length; i++) {
            hashMap.put(alphabet[i], 0);
        }
        hashMap.put('@', 0);

        String keyword = scanner.nextLine();
        boolean isValue;
        for (Character character : keyword.toUpperCase().toCharArray()) {
            isValue = false;
            for (int i = 0; i < alphabet.length; i++) {
                if (character == alphabet[i]) {
                    hashMap.put(character, hashMap.get(character) + 1);
                    isValue = true;
                    break;
                }
            }
            if (isValue == false) {
                hashMap.put('@', hashMap.get('@') + 1);
            }
        }
        Iterator iterator = hashMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry pair = (Map.Entry) iterator.next();
            if (Integer.parseInt(pair.getValue().toString()) != 0) {
                if (pair.getKey().equals('@')) {
                    System.out.println("etc = " + pair.getValue());
                } else {
                    System.out.println(pair.getKey() + " = " + pair.getValue());
                }
            }
            iterator.remove();
        }
    }
}