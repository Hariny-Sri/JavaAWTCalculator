//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Calculator extends Frame implements ActionListener {
    TextField display;
    Button bt0, bt1, bt2, bt3, bt4, bt5, bt6, bt7, bt8, bt9, minus, plus, divide, multiply, clear, equalto;

    Calculator() {
        display = new TextField("0");
        display.setBounds(50, 50, 400, 50);

        bt0 = new Button("0");
        bt0.setBounds(50, 400, 80, 80);
        bt0.addActionListener(this);

        bt1 = new Button("1");
        bt1.setBounds(50, 300, 80, 80);
        bt1.addActionListener(this);

        bt2 = new Button("2");
        bt2.setBounds(150, 300, 80, 80);
        bt2.addActionListener(this);

        bt3 = new Button("3");
        bt3.setBounds(250, 300, 80, 80);
        bt3.addActionListener(this);

        bt4 = new Button("4");
        bt4.setBounds(50, 200, 80, 80);
        bt4.addActionListener(this);

        bt5 = new Button("5");
        bt5.setBounds(150, 200, 80, 80);
        bt5.addActionListener(this);

        bt6 = new Button("6");
        bt6.setBounds(250, 200, 80, 80);
        bt6.addActionListener(this);

        bt7 = new Button("7");
        bt7.setBounds(50, 100, 80, 80);
        bt7.addActionListener(this);

        bt8 = new Button("8");
        bt8.setBounds(150, 100, 80, 80);
        bt8.addActionListener(this);

        bt9 = new Button("9");
        bt9.setBounds(250, 100, 80, 80);
        bt9.addActionListener(this);

        plus = new Button("+");
        plus.setBounds(350, 300, 80, 80);
        plus.addActionListener(this);

        minus = new Button("-");
        minus.setBounds(350, 200, 80, 80);
        minus.addActionListener(this);

        multiply = new Button("*");
        multiply.setBounds(350, 100, 80, 80);
        multiply.addActionListener(this);

        divide = new Button("/");
        divide.setBounds(350, 400, 80, 80);
        divide.addActionListener(this);

        clear = new Button("C");
        clear.setBounds(250, 400, 80, 80);
        clear.addActionListener(this);

        equalto = new Button("=");
        equalto.setBounds(150, 400, 80, 80);
        equalto.addActionListener(this);

        add(display);
        add(bt0);
        add(bt1);
        add(bt2);
        add(bt3);
        add(bt4);
        add(bt5);
        add(bt6);
        add(bt7);
        add(bt8);
        add(bt9);
        add(plus);
        add(minus);
        add(multiply);
        add(divide);
        add(clear);
        add(equalto);


        setLayout(null);
        setVisible(true);
        setSize(500, 550);

        setTitle("Calc");
        addWindowListener(new WindowListener() {
            @Override
            public void windowOpened(WindowEvent e) {

            }

            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }

            @Override
            public void windowClosed(WindowEvent e) {

            }

            @Override
            public void windowIconified(WindowEvent e) {

            }

            @Override
            public void windowDeiconified(WindowEvent e) {

            }

            @Override
            public void windowActivated(WindowEvent e) {

            }

            @Override
            public void windowDeactivated(WindowEvent e) {

            }
        });

    }


    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == bt0) {
            String exp = display.getText();
            exp += "0";
            display.setText(exp);
        }
        if (e.getSource() == bt1) {
            String exp = display.getText();
            exp += "1";
            display.setText(exp);
        }

        if (e.getSource() == bt2) {
            String exp = display.getText();
            exp += "2";
            display.setText(exp);
        }

        if (e.getSource() == bt3) {
            String exp = display.getText();
            exp += "3";
            display.setText(exp);
        }

        if (e.getSource() == bt4) {
            String exp = display.getText();
            exp += "4";
            display.setText(exp);
        }

        if (e.getSource() == bt5) {
            String exp = display.getText();
            exp += "5";
            display.setText(exp);
        }

        if (e.getSource() == bt6) {
            String exp = display.getText();
            exp += "6";
            display.setText(exp);
        }

        if (e.getSource() == bt7) {
            String exp = display.getText();
            exp += "7";
            display.setText(exp);
        }

        if (e.getSource() == bt8) {
            String exp = display.getText();
            exp += "8";
            display.setText(exp);
        }

        if (e.getSource() == bt9) {
            String exp = display.getText();
            exp += "9";
            display.setText(exp);
        }
        if (e.getSource() == clear) {
            display.setText("0");
        }

        if (e.getSource() == plus) {
            String exp = display.getText();
            exp += "+";
            display.setText(exp);
        }

        if (e.getSource() == minus) {
            String exp = display.getText();
            exp += "-";
            display.setText(exp);
        }

        if (e.getSource() == multiply) {
            String exp = display.getText();
            exp += "*";
            display.setText(exp);
        }

        if (e.getSource() == divide) {
            String exp = display.getText();
            exp += "/";
            display.setText(exp);
        }

        if (e.getSource() == equalto) {

            int a, b, i;
            char operator = 0;
            String exp = display.getText();
            String tempa = "", tempB = "";

            for (i = 0; i < exp.length(); i++) {
                if (Character.isDigit(exp.charAt(i))) {
                    tempa += exp.charAt(i);
                } else {
                    operator = exp.charAt(i);
                    break;
                }
            }
            tempB = exp.substring(i + 1);
            a = Integer.parseInt(tempa);
            b = Integer.parseInt(tempB);
            int result = 0;
            switch (operator) {
                case '+':
                    result = a + b;
                    break;
                case '-':
                    result = a - b;
                    break;
                case '*':
                    result = a * b;
                    break;
                case '/':
                    result = a / b;
                    break;

            }
            display.setText(String.valueOf(result));
        }


    }


    public static void main(String[] args) {
        new Calculator();
    }
}