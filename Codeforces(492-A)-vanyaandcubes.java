import java.util.Scanner;

public class vanyaandcubes {
    static int a;
    static int i = 0;
    static int last = 0;
    static int current = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        a=sc.nextInt();
        while (a > 0) {
            i++;
            current = last + i;
            last = current;
            a -= current;
            if (a < 0) 
            {
                i--;
            }
        }
        System.out.println(i);
    }
}

