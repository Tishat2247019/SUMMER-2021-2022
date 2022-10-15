package ADMIN;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ItemEvent;
import LOGINPAGE.*;
import DATATABLES.*;
import ROOMS.*;
import FOODS.*;

public class Admin extends JFrame implements ActionListener,ItemListener {

	JLabel h;
	private JToggleButton button;
	private JButton b1, b5, b3, b2, b4, b6;
	Room1 r;

	public Admin() {
		super("Premium Alcazaba Hostel");
		this.setLayout(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		h = new JLabel("Premium Alcazaba Hostel");
		h.setBounds(50, 15, 400, 100);
		h.setFont(new Font("Rockwell Nova Light", Font.BOLD, 30));
		add(h);

		setJToggleButton();
		setAction();

		b1 = new JButton("New Profile");
		b1.setBounds(300, 200, 220, 50);
		b1.addActionListener(this);
		add(b1);

		b2 = new JButton("Employee");
		b2.setBounds(300, 280, 220, 50);
		b2.addActionListener(this);

		b3 = new JButton("Student");
		b3.setBounds(300, 360, 220, 50);
		b3.addActionListener(this);

		b4 = new JButton("Room");
		b4.setBounds(300, 440, 220, 50);
		b4.addActionListener(this);
		b5 = new JButton("Logout");

		b5.setBounds(480, 20, 120, 30);
		b5.addActionListener(this);

		add(b2);
		add(b3);
		add(b4);
		add(b5);
		add(b5);

		b6 = new JButton("FOOD");
		b6.setBounds(300, 520, 220, 50);
		b6.addActionListener(this);
		add(b6);

	
	/*  JLabel btn = new JLabel(new ImageIcon("hostel-tourists-flat-infographic.png"));
		btn.setBounds(20, 20, 180, 160);
		add(btn);*/

		this.setSize(800, 700);
		h = new JLabel(new ImageIcon("istockphoto-1203878857-612x612(1).jpg"));
		h.setBounds(00, 00, 800, 700);
		this.add(h);
		Image icon = Toolkit.getDefaultToolkit().getImage("hostel-sign-.jpg");
		this.setIconImage(icon);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}

	

	public void actionPerformed(ActionEvent ae) {
		if (ae.getSource() == b1) {
			Form2 f2 = new Form2();
			f2.setVisible(true);
			this.setVisible(false);
		}

		if (ae.getSource() == b5) {
			LoginPage l1 = new LoginPage();
			l1.setVisible(true);
			this.setVisible(false);
			this.dispose();
		}

		if (ae.getSource() == b3) {
			StudentData f2 = new StudentData();
			f2.Read();
			f2.setVisible(true);
			this.setVisible(false);
		}

		if (ae.getSource() == b2) {
			EmployeeData f2 = new EmployeeData();
			f2.Read();
			f2.setVisible(true);
			this.setVisible(false);
		}
		if (ae.getSource() == b4) {
			Room1 r = new Room1(this);
			r.countroom();
			r.setVisible(true);
			this.setVisible(false);
		}

		if (ae.getSource() == b6) {
			 Confirm1 c =  new Confirm1(this);
			 c.readFood();
			c.setVisible(true);
			this.setVisible(false);
		}

		
	}

private void setJToggleButton() {
	button = new JToggleButton("evsjv");
	button.setBounds(630, 20, 100, 30);
	button.setFont(new Font("SutonnyMJ", Font.PLAIN, 20));
	add(button);
}

private void setAction() 
	{		
        button.addItemListener(this);  
    }
@Override

public void itemStateChanged(ItemEvent e) {
	// TODO Auto-generated method stub
	if (button.isSelected()){  
		button.setText("English");  
		button.setFont(new Font("Arial", Font.PLAIN, 20));}
	else  {
		button.setText("evsjv"); 
		button.setFont(new Font("SutonnyMJ", Font.PLAIN, 25));}		
}
}
