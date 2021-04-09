import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.text.NumberFormat;
import java.util.Locale;

public class formatCurrency {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        // Write your code here.
         NumberFormat us     = NumberFormat.getCurrencyInstance(Locale.US);
        String india = NumberFormat.getCurrencyInstance(new Locale("en","IN")).format(payment).toString();
        
        String china = NumberFormat.getCurrencyInstance(new Locale("zh","CN")).format(payment).toString();
        
        String france =NumberFormat.getCurrencyInstance(new Locale("fr","FR")).format(payment).toString();
        
        System.out.println("US: " + us.format(payment));
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}