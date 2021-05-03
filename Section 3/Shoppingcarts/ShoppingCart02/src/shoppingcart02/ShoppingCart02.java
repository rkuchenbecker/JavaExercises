
package shoppingcart02;

public class ShoppingCart02 {
    public static void main(String[] args) {
        String custName = "Alex";
        String itemDesc = "Shirts";
        String message = custName+" wants to purchase a "+itemDesc;
        
        // Declare and initialize numeric fields: price, tax, quantity.   
        double price = 14.00;
        double tax = 0.79;
        int quantity = 2;
        
        // Declare and assign a calculated totalPrice
        double totalPrice = (price + tax) * quantity;
        
        // Modify message to include quantity 
        message = custName+" wants to purchase "+ quantity + " " + itemDesc;
        System.out.println(message);
        
        // Print another message with the total cost
        System.out.println("Total cost with Tax is: " + totalPrice);
    }    
}
