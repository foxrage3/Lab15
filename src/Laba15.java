import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Laba15 extends JFrame {
    Laba15(){
        setSize(400,400);
        JLabel label = new JLabel("Number");
        JTextField value = new JTextField("0");
        value.setEditable(false);
        JButton inc = new JButton("+1");
        JButton dec = new JButton("-1");

        inc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int a = Integer.parseInt(value.getText());
                if (a < 3) {
                    a++;
                    value.setText(Integer.toString(a));
                }
            }
        });

        dec.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int a = Integer.parseInt(value.getText());
                if (a > -5) {
                    a--;
                    value.setText(Integer.toString(a));
                }
            }
        });

        setLayout(new FlowLayout());
        add(label);
        add(value);
        add(inc);
        add(dec);
        setLocation(500,300);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Laba15();
    }
}
