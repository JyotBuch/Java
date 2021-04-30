import java.util.Scanner;

public class AntonandPolyhedrons{
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = 0;
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            if (s.equals("Tetrahedron")) res += 4;
            else if (s.equals("Cube")) res += 6;
            else if (s.equals("Octahedron")) res += 8;
            else if (s.equals("Dodecahedron")) res += 12;
            else if (s.equals("Icosahedron")) res += 20;
        }
        System.out.println(res);
    }
}