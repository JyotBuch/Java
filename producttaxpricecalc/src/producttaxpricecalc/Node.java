package producttaxpricecalc;

public class Node {
    String name;
    String type;
    double price;
    int quantity;
    double st;
    double fp;
    Node next; 
    
    Node(String name,String type,double price,int quantity) {
       
        this.name = name;
        this.type = type;
        this.price = price;
        this.quantity = quantity;
    }

}
