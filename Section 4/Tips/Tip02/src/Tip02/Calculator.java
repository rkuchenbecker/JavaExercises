
package Tip02;

public class Calculator {
    public double tax = .05;
    public double tip = .15;  //Change tax and tip if you prefer different values
    public double originalPrice = 0;
    
    public void findTotal(int price){
        //Calculate an individual's total after tax and tip
        //Print this value
        originalPrice = price;
        double total = originalPrice*(1+tax+tip);
        System.out.println(total);
    }
}
