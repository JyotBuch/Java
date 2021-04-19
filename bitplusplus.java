import java.util.Scanner;

public class bitplusplus {
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            String operation[]=new String[n];
            int count=0;
            for(int i=0;i<n;i++)
            {
                operation[i]=sc.next();
                if(operation[i].equalsIgnoreCase("++x") || operation[i].equalsIgnoreCase("x++"))
                    ++count;
                else if(operation[i].equalsIgnoreCase("--x") || operation[i].equalsIgnoreCase("x--"))
                    --count;
            }
            System.out.println(count);
            /*for(int i=0;i<n;i++)
            {
                System.out.print(operation[i]+" ");
            }*/
            
        }
}
