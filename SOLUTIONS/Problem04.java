import java.util.Scanner;

public class Problem04 {
    public static void main(String[] args) {
        char[] mathOperators = {'+', '-', '*', '/'};
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        try {
            int index = n;
            for (int i = 1; i <= n; i++) {
                index = i;
                if (i > 4) {
                    if (i % 4 == 0) {
                        index = 4;
                    } else {
                        index = index % 4;
                    }
                }
                index -= 1;
                System.out.print(mathOperators[index]);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}