package probema4;

public class Prob4 {
    public static void main(String[] args) {
        for (int i = 2; i <= 99; i++) {
            int x = 0;
            for (int j = 1; j * j <= i; j++) {
                if (i % j == 0) {
                    x++;
                }
            }
            if (x == 1) {
                System.out.println(i);
            }
        }
    }
}