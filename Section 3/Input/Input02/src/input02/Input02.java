package input02;

import javax.swing.JOptionPane;

public class Input02 {
    public static void main(String[] args) {
        
        JOptionPane.showMessageDialog(null,
                "There's no input here, just a message",
                "Plain Message Dialog",
                1);

        
        String input1 = (String)JOptionPane.showInputDialog(null,
                "Is this a question?",
                "Question Dialog",
                3,
                null,
                null,
                "Type something here.");
        System.out.println(input1);
        
        
        String[] acceptableValues = {"Choice 1", "Choice 2", "Choice 3"};
        String input2 = (String)JOptionPane.showInputDialog(null,
                "Is this a question?",
                "Choice Dialog",
                2,
                null,
                acceptableValues,
                acceptableValues[1]);
        System.out.println(input2);
    }
}
