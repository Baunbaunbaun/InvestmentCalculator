//investment calculator. Execise 16.5 in Liang 9th edition.

package Ex165;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame {

    private JTextField investedAmount = new JTextField();
    private JTextField years = new JTextField();
    private JTextField annualIntRate = new JTextField();
    private JTextField future = new JTextField();

    private JButton jbtCalculate = new JButton("Calculate");

    public Calculator() {

        //panel p1 to hold labels and fields
        JPanel p1 = new JPanel(new GridLayout(4, 2));
        p1.add(new JLabel("Invested Amount"));      p1.add(this.investedAmount);
        p1.add(new JLabel("Years"));                p1.add(this.years);
        p1.add(new JLabel("Annual Interest Rate")); p1.add(this.annualIntRate);
        p1.add(new JLabel("Future Value"));         p1.add(this.future);
        p1.setBorder(new TitledBorder("Enter invested amount, years and interest rate to calculate investment"));

        //panel p2 to hold the calculate button
        JPanel p2 = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        p2.add(this.jbtCalculate);

        //add panels to frame
        add(p1, BorderLayout.CENTER);
        add(p2, BorderLayout.SOUTH);

        //register listner
        this.jbtCalculate.addActionListener(new ButtonListener());
    }

    private class ButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {

            //get values from text fields
            double invest = Double.parseDouble(investedAmount.getText());
            int year = Integer.parseInt(years.getText());
            double rate = Double.parseDouble(annualIntRate.getText());

            //create investment object
            Investment newInvestment = new Investment(invest, year, rate);

            //display result
            future.setText(String.format("%.2f", newInvestment.getFutureInvestment()));
        }
    }
}
