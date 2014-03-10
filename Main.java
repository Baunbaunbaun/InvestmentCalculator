//investment calculator. Execise 16.5 in Liang 9th edition.

package Ex165;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        Calculator frame = new Calculator();
        frame.pack();
        frame.setTitle("Calculate Future Investment");
        frame.setLocationRelativeTo(null); //center frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
