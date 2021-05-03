
package casting01;

public class Casting01 {
    public static void main(String[] args) {
        //Declare and initialize a byte with a value of 128
        //Observe NetBeans' complaint
        byte a = (byte) 128; //value too high for byte
        
        //Declare and initialize a short with a value of 128
        //Create a print statement that casts this short to a byte
        short b = 128;
        System.out.println(b = a);
        
        //Declare and initialize a byte with a value of 127
        //Add 1 to this variable and print it
        //Add 1 to this variable again and print it again
        byte c = 127;
        System.out.println(c++);
        System.out.println(c++);
        
    }    
}
