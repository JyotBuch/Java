import java.util.Scanner;

public class candiesandtwosisters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        // int a, b,j;
        // int count = 0;
        int ans[] = new int[t];
        while (t-- > 0) {
            // count = 0;
            int n = sc.nextInt();
            int res = 0;
            if (n < 2) {
                res = 0;
            } else if (n % 2 == 0) {
                res = n / 2 - 1;
            } else {
                res = n / 2;
            }

            System.out.println(res);
        }
    }
}