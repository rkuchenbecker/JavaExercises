package input04;

import java.util.Scanner;

public class Input04 {
    public static void main(String[] args){
        Scanner sc = new Scanner(Input04.class.getResourceAsStream("input04text.txt"));      
        
        //Edit these lines to advance the scanner
        String Line1 = sc.nextLine();
        String Line2 = sc.nextLine();
        String Line3 = sc.nextLine();
        String Line4 = sc.nextLine();
        System.out.println(Line1);
        System.out.println(Line2);
        System.out.println(Line3);
        System.out.println(Line4);
        
        //Does this line contain "BlueBumper"?
        System.out.println(sc.findInLine("BlueBumper"));

        //Store the next two numbers as xPosition and yPosition
        //Print these positions
        String scanX = sc.next(Line4);
        
        System.out.println("X: "        +", Y: "        );
        sc.close();
    }    
}
