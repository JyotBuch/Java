import java.util.Scanner;
 
public class petya {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        String a = input.next().toLowerCase();
        String b = input.next().toLowerCase();
        if(a.compareTo(b) > 0){
            System.out.println("1");

        }else if(a.compareTo(b) < 0){
            System.out.println("-1");
        }
        else if(a.compareTo(b) == 0){
        System.out.println("0");
        }
    }
}