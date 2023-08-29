import javax.swing.*;
import java.awt.event.*;
public class gui {
    public static void main(String args[]){
        JFrame f = new JFrame();
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setTitle("First Gui");
        f.setBounds(100,100,500,500);
        f.setLayout(null); // Important for layout
        f.setLocationRelativeTo(null);
        f.setVisible(true);
        JTextField j = new JTextField();
        JTextField j1 = new JTextField();
        j1.setBounds(60,50,300,30);
        j.setBounds(60,10,300,30);
        JButton b = new JButton("+");
        b.setBounds(100,200,95,30);
        JButton b1 = new JButton("-");
        b1.setBounds(100,240,95,30);
        JButton b2 = new JButton("*");
        b2.setBounds(100,290,95,30);
        JButton b3 = new JButton("/");
        b3.setBounds(100,330,95,30);
        JTextField j2 = new JTextField();
        j2.setBounds(60,370,300,30);
        f.add(j);
        f.add(j1);
        f.add(b);
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(j2);
        b.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                try{
                    int a = Integer.parseInt(j.getText());
                int b = Integer.parseInt(j1.getText());
                int c = a+b;
                j2.setText(String.valueOf(c));
                }
                catch(Exception m){
                    JOptionPane n = new JOptionPane(m, 0, 0, null, args, e);
                }
                
            }
        } ); 

        b1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                int a = Integer.parseInt(j.getText());
                int b = Integer.parseInt(j1.getText());
                int c = a-b;
                j2.setText(String.valueOf(c));
            }
        } ); 

        b2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                int a = Integer.parseInt(j.getText());
                int b = Integer.parseInt(j1.getText());
                int c = a*b;
                j2.setText(String.valueOf(c));
            }
        } ); 

        b3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                int a = Integer.parseInt(j.getText());
                int b = Integer.parseInt(j1.getText());
                int c = a/b;
                j2.setText(String.valueOf(c));
            }
        } );                          
    }
}