package vn.edu.eaut.java.swing;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;

public class bai7 extends JFrame {

    private final JTextField display;
    private String expression = "";

    public bai7() {
        super("Máy tính mini");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(320, 430);
        setLocationRelativeTo(null);
        setResizable(false);

        display = new JTextField();
        display.setEditable(false);
        display.setHorizontalAlignment(JTextField.RIGHT);
        display.setPreferredSize(new Dimension(300, 60));
        display.setFont(new java.awt.Font("SansSerif", java.awt.Font.BOLD, 26));

        JPanel buttonPanel = new JPanel(new GridLayout(5, 4, 8, 8));
        buttonPanel.setBorder(BorderFactory.createEmptyBorder(12, 12, 12, 12));

        String[] buttons = {
            "C", "/", "*", "<-",
            "7", "8", "9", "-",
            "4", "5", "6", "+",
            "1", "2", "3", "=",
            "0", ".", "(", ")"
        };

        for (String text : buttons) {
            JButton button = new JButton(text);
            button.setFont(new java.awt.Font("SansSerif", java.awt.Font.BOLD, 18));
            button.addActionListener((ActionEvent e) -> handleButtonClick(text));
            buttonPanel.add(button);
        }

        setLayout(new BorderLayout(10, 10));
        add(display, BorderLayout.NORTH);
        add(buttonPanel, BorderLayout.CENTER);
    }

    private void handleButtonClick(String text) {
        switch (text) {
            case "C":
                expression = "";
                display.setText("");
                break;
            case "<-":
                if (!expression.isEmpty()) {
                    expression = expression.substring(0, expression.length() - 1);
                    display.setText(expression);
                }
                break;
            case "=":
                calculate();
                break;
            default:
                expression += text;
                display.setText(expression);
                break;
        }
    }

    private void calculate() {
        if (expression.isEmpty()) {
            return;
        }

        try {
            ScriptEngine engine = new ScriptEngineManager().getEngineByName("JavaScript");
            Object result = engine.eval(expression);
            display.setText(String.valueOf(result));
            expression = String.valueOf(result);
        } catch (ScriptException ex) {
            JOptionPane.showMessageDialog(this, "Biểu thức không hợp lệ!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            expression = "";
            display.setText("");
        }
    }

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(() -> new bai7().setVisible(true));
    }
}
