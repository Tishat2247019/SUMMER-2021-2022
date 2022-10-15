package ADMIN;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import DATAFILLUP.*;

public class Form2 extends JFrame implements ActionListener {
	private JPanel panel;
	private JButton backBtn, StuBtn, EmpBtn;
	//Room1 r;

	public Form2() {
		super("Form2");

		this.setSize(600, 400);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLayout(null);
		setTitle("Premium Alcazaba Hostel");
		Image icon = Toolkit.getDefaultToolkit().getImage("hostel-sign-.jpg");
		setIconImage(icon);
		new Font("Cambria", Font.PLAIN, 25);

		Toolkit toolkit = getToolkit();
		Dimension size = toolkit.getScreenSize();
		setLocation(size.width / 2 - getWidth() / 2, size.height / 2 - getHeight() / 2);

		panel = new JPanel();
		panel.setBounds(0, 0, 600, 400);
		panel.setLayout(null);
		panel.setBackground(new Color(240, 240, 240));

		StuBtn = new JButton("Student New Profile");
		StuBtn.setBounds(175, 75, 200, 50);
		StuBtn.addActionListener(this);
		panel.add(StuBtn);

		EmpBtn = new JButton("Employee New Profile");
		EmpBtn.setBounds(175, 175, 200, 50);
		EmpBtn.addActionListener(this);
		panel.add(EmpBtn);

		backBtn = new JButton("< Back");
		backBtn.setBounds(175, 275, 200, 50);
		backBtn.addActionListener(this);
		panel.add(backBtn);

		this.add(panel);
	}

	public void actionPerformed(ActionEvent ae) {
		if (ae.getSource() == backBtn) {
			Admin a = new Admin();
			a.setVisible(true);
			this.setVisible(false);
			this.dispose();
		}
		if (ae.getSource() == StuBtn) {
			FrameIntro FI = new FrameIntro();
			FI.setVisible(true);
			this.setVisible(false);
		}
		if (ae.getSource() == EmpBtn) {
			FrameIntro FI = new FrameIntro();
			FI.setVisible(true);
			FI.getinfo();
			this.setVisible(false);
		}
	}

	/*
	 * public static void main(String[] args) {
	 * Form2 f =new Form2();
	 * f.setVisible(true);
	 * }
	 */
}