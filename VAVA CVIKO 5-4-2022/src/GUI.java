import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class GUI {
	static JFrame f;
	
	public GUI() {
		f = new JFrame("best app ever");
		JTextArea string=new JTextArea("type expression"); 
		string.setBounds(140, 15, 150, 20);
		f.add(string);
		JLabel l1 = new JLabel("Expression:");
		l1.setBounds(50, 15, 80, 20);
		f.add(l1);
		JTextField regex = new JTextField("type regex");
		regex.setBounds(140, 50, 150, 20);
		regex.setBorder(null);
		f.add(regex);		
		JLabel l2 = new JLabel("Regex:");
		l2.setBounds(50, 50, 50, 20);
		f.add(l2);
		
		JLabel r = new JLabel("");
		r.setBounds(15, 120, 120, 20);
		f.add(r);
		
		JButton b = new JButton("Confirm");
		b.setBounds(15, 85, 100, 20);
		f.add(b);
		
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Pattern p = Pattern.compile(regex.getText());
				Matcher m = p.matcher(string.getText());
				if (m.find()) {
					r.setText("Result: OK");
				} else r.setText("Result: NG");
				}
		});
		
		
		f.setSize(400,400);  
	    f.setLayout(null);  
	    f.setVisible(true);  
	}
}
