package apllication;

import entities.Products;
import java.util.Scanner;


public class Program {

    
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        
        Products products = new Products();
        
        System.out.print("Enter product data ");
        System.out.print("Name ");
        products.name = sc.nextLine();
        System.out.println("Price ");
        products.price = sc.nextDouble();
        System.out.println("Quantity in stck ");
        products.quantity = sc.nextInt();
        
        System.out.println(products);
                
        
        sc.close();
        
    }
    
}
