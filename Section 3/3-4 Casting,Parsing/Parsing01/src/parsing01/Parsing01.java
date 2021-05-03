package parsing01;

public class Parsing01 {
    public static void main(String[] args) {
        //Declare and intitialize 3 Strings: shirtPrice, taxRate, and gibberish
        String shirtPrice = "15";
        String taxRate ="0.05";
        String gibberish ="asdu8oizwas67f89o";
        
        //Parse shirtPrice and taxRate, and print the total tax
        double tax = Double.parseDouble(shirtPrice) * Double.parseDouble(taxRate);
        System.out.println(tax);
        //Try to parse taxRate as an int
        //int taxRateInt = Integer.parseInt(taxRate); //Parsing fehler, kann float nicht in Int umwandeln
        //Try to parse gibberish as an int
        //int gibberishInt = Integer.parseInt(gibberish); //Parsing fehler, Value ist Text & Numeric, Int nimmt nur numerische Werte an
    }
    
}
