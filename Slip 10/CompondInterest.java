import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
public class CompoundInterest extends Applet implements ActionListener {
    Label l1, l2, l3, l4, l5;
    TextField t1, t2, t3, t4, t5;
    Button b1, b2;
    String fileName = "data.txt"; 
    double p, r, n, a, i; 

    public void init() {
        l1 = new Label("Principal Amount");
        l2 = new Label("Interest Rate (%)");
        l3 = new Label("Time (years)");
        l4 = new Label("Total Amount");
        l5 = new Label("Interest Amount");
        t1 = new TextField(10);
        t2 = new TextField(10);
        t3 = new TextField(10);
        t4 = new TextField(10);
        t5 = new TextField(10);
        b1 = new Button("Read from File");
        b2 = new Button("Calculate");
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(l3);
        add(t3);
        add(l4);
        add(t4);
        add(l5);
        add(t5);
        add(b1);
        add(b2);
        b1.addActionListener(this);
        b2.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            try {
                BufferedReader br = new BufferedReader(new FileReader(fileName));
                p = Double.parseDouble(br.readLine());
                r = Double.parseDouble(br.readLine());
                n = Double.parseDouble(br.readLine());
                br.close();
                t1.setText(String.valueOf(p));
                t2.setText(String.valueOf(r));
                t3.setText(String.valueOf(n));
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        } else if (e.getSource() == b2) {
            a = p * Math.pow(1 + r / 100, n); 
            i = a - p; 
            t4.setText(String.format("%.2f", a));
            t5.setText(String.format("%.2f", i));
        }
    }
}
